package br.gov.pa.prodepa.crypto.web.rest;

import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.gov.pa.prodepa.crypto.constants.Constants;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.Contact;
import io.swagger.models.Info;
import io.swagger.models.License;

/**
 * Application configuration for Rest
 * 
 * @see javax.ws.rs.core.Application
 * 
 * @author thiago.soares (thiago.soares.jr@gmail.com)
 */

@ApplicationPath(Constants.REST_ROOT)
public class JaxRsActivator extends Application {
    /* class body intentionally left blank */
  
  public JaxRsActivator() {
    super();
    
    Info info = new Info()
            .title("CDA-WS - Swagger API Doc")
            .description("AGE - Integração de Severços para o Processamento de CDAs.")
            .termsOfService("")
            .contact(new Contact()
              .email("thiago.soares.jr@gmail.com"))
            .license(new License()
              .name("MIT")
              .url("http://opensource.org/licenses/MIT"));
    
    BeanConfig beanConfig = new BeanConfig();
    beanConfig.setVersion("1.0.2");
    beanConfig.setSchemes(new String[]{"http"});
    beanConfig.setHost("dev.www2.desenvolver.prodepa.gov.br:8080");
    beanConfig.setBasePath("/cda_ws_service/api/");
    //beanConfig.setFilterClass("io.swagger.sample.util.ApiAuthorizationFilterImpl");
    beanConfig.setResourcePackage("br.gov.pa.prodepa.crypto.web.rest");
    beanConfig.setInfo(info);
    beanConfig.setScan(true);
  }
  
  
  
}

