package co.com.villota.microservice.resolveEnigmaApi.api;

import io.swagger.annotations.ApiParam;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;

import co.com.villota.microservice.resolveEnigmaApi.api.GetStepApiController;
import co.com.villota.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import co.com.villota.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.villota.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class GetStepApiController implements GetStepApi {
	
    @EndpointInject(uri="direct:resolve-enigma")
    private FluentProducerTemplate producerTemplateResolveEnigma;
	
    private static final Logger log = LoggerFactory.getLogger(GetStepApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private Object response;
    

    @org.springframework.beans.factory.annotation.Autowired
    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

 
    public ResponseEntity<?> getStep(@ApiParam(value="body",required=true) @Valid @RequestBody JsonApiBodyRequest body) {
        try {
        	System.out.println("Respuesta del servicio");
            response = producerTemplateResolveEnigma.withBody(body).request();
        	return new ResponseEntity<JsonApiBodyResponseSuccess>((JsonApiBodyResponseSuccess)response, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<JsonApiBodyResponseErrors>((JsonApiBodyResponseErrors)response,HttpStatus.FAILED_DEPENDENCY);
        }
    }
    
}
