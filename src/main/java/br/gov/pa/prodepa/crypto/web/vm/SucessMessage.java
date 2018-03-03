package br.gov.pa.prodepa.crypto.web.vm;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-02T18:36:11.447Z")
public class SucessMessage   {
  
  private Integer code;
  private String message;
  private Object info;

  
  
  public SucessMessage(Integer code, String message, Object info) {
    super();
    this.code = code;
    this.message = message;
    this.info = info;
  }
  /**
   **/
  
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @JsonProperty("info")
  public Object getInfo() {
    return info;
  }
  public void setInfo(Object info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SucessMessage sucessMessage = (SucessMessage) o;
    return Objects.equals(code, sucessMessage.code) &&
        Objects.equals(message, sucessMessage.message) &&
        Objects.equals(info, sucessMessage.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SucessMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

