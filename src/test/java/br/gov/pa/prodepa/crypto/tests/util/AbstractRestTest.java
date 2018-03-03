package br.gov.pa.prodepa.crypto.tests.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

@Ignore
public abstract class AbstractRestTest {

  public static String serviceBaseUrl = "";
  public String serviceBaseUrlLocal = "http://dev.www2.desenvolver.prodepa.gov.br:8080/cryptor_ws_service/api";
  public String serviceBaseUrlDesenv = "https://www2.desenvolver.prodepa.gov.br/cryptor_ws_service/api";
  public String serviceBaseUrlHomologa = "https://www2.homologar.prodepa.gov.br/cryptor_ws_service/api";

  public static String env;
  public static String serviceUrl;

  protected CloseableHttpClient httpClient;

  @Before
  public void up() {
    httpClient = HttpClients.createDefault();

    if (env.equals("LOCAL")) {

      serviceBaseUrl = serviceBaseUrlLocal;

    } else if (env.equals("DESENV")) {

      serviceBaseUrl = serviceBaseUrlDesenv;


    } else if (env.equals("HOMOLOGA")) {

      serviceBaseUrl = serviceBaseUrlHomologa;
    }

  }

  @After
  public void down() {
    httpClient = HttpClientBuilder.create().build();
  }

  protected String printResult(HttpResponse response) throws Exception {

    if (response.getStatusLine().getStatusCode() != 200) {

      String xml = toString(response.getEntity());  System.out.println(xml);
      throw new TestFailException(xml);
    }

    String out = toString(response.getEntity());
    System.out.println();
    //System.out.println(out);
    System.out.println();
    return out;

  }
  
  

  protected String toString(HttpEntity entity) throws UnsupportedOperationException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));

    StringBuffer bf = new StringBuffer();

    String output;
    while ((output = br.readLine()) != null) {
      output = output.replace(",\"", ",\n  \"");
      output = output.replace("},{\"id\"", ",},\n{\"id\"");
      bf.append(output);
    }

    String out = bf.toString();
    out = out.replace(",\"", "\n,\"");

    return out;
  }

  protected String toString2(HttpEntity entity) throws UnsupportedOperationException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));

    StringBuffer bf = new StringBuffer();

    String output;
    while ((output = br.readLine()) != null) {
      bf.append(output);
    }

    return bf.toString();
  }

}
