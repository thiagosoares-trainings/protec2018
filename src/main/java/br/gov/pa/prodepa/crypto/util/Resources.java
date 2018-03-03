package br.gov.pa.prodepa.crypto.util;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Request;

/**
 * Factory for local resources
 * 
 * @author thiago.soares (thiago.soares.jr@gmail.com)
 */
@RequestScoped
public class Resources {

    private @Context Request request;
    private @Context HttpHeaders headers;
    private @Context HttpServletRequest httpRequest;
    private @Context ServletContext servletContext;
    
    @Produces
    public Logger produceLog(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
    
    
}
