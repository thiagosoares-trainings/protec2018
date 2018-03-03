package br.gov.pa.prodepa.crypto.web.vm;

import java.io.Serializable;

public class ProtecDto implements Serializable {

  private static final long serialVersionUID = -4716902755012684778L;
  
  private String environment;
  private String buildVersion;
  private String buildNumber;

  public ProtecDto() {
    super();
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public String getBuildVersion() {
    return buildVersion;
  }


  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }
  
  
  
}