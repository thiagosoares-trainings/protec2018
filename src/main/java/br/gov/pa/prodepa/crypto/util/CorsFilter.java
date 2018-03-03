package br.gov.pa.prodepa.crypto.util;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

/**
*
* @author thiago.soares
*/
@Provider
public class CorsFilter implements ContainerResponseFilter {

  @Override
  public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)  throws IOException {

      MultivaluedMap<String, Object> headers = responseContext.getHeaders();
      
      //Credentialed requests
      headers.add("Access-Control-Allow-Origin", "*");
      headers.add("Access-Control-Allow-Methods", "HEAD, GET, POST,PUT, PATCH, DELETE, OPTIONS");
      headers.add("Access-Control-Allow-Headers", "Accept, Content-Type, Accept-Language, Content-Language, DPR, Downlink, Save-Data, Viewport-Width, Width");
      headers.add("Access-Control-Allow-Credentials", "true");      
  }

  
  
  
  
}
