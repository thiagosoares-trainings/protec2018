package br.gov.pa.prodepa.crypto.web.rest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.pa.prodepa.crypto.tests.util.AbstractRestTest;

@Ignore
public class TemplatesApiTest extends AbstractRestTest  {

  @BeforeClass
  public static void upTestClass() {
    env = "LOCAL";
  }
  
  @Before
  public void upTest() {
    serviceUrl = serviceBaseUrl + "/V1/templates";
  }
  
  @Test
  public void testGetTemplatesAll() throws ClientProtocolException, IOException, Exception {
    
    HttpGet getRequest = new HttpGet(serviceUrl + "/");
    getRequest.addHeader("Accept", "application/json");
    
    printResult(httpClient.execute(getRequest));
    
    
  }

  @Test
  public void testGetTemplatesSearch() {
    fail("Not yet implemented");
  }

}
