package br.gov.pa.prodepa.crypto.tests.util;

/**
 * 
 * @author thiago.soares (thiago.soares.jr@gmail.com) 
 *
 */
public class TestFailException extends Exception {

  private static final long serialVersionUID = -5022967813902834759L;

  private String message; 
  
  public TestFailException() {
    super();
  }

  public TestFailException(String message) {
    super();
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "TestFailException [message=" + message + "]";
  }
  
}
