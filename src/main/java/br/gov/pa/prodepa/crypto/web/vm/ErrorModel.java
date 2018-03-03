package br.gov.pa.prodepa.crypto.web.vm;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-02T18:36:11.447Z")
public class ErrorModel {

  private Integer code = null;
  private Integer severity = null;
  private String message = null;

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
   * A seviridade podera ser 1-INFO, 2-WARN, 3-ERROR
   **/

  @JsonProperty("severity")
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(code, errorModel.code) && Objects.equals(severity, errorModel.severity) && Objects.equals(message, errorModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, severity, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
