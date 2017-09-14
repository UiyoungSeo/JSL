package action;

import com.opensymphony.xwork2.ActionSupport;

public class SampleValidationAction extends ActionSupport{
  //필수로 입력해야 하는 필드
  private String requiredValidator;
  //OGNL 표현식을 사용해서 필드를 검사하는 필드
  private String fieldExpressionValidator; 
  //유효한 URL 인지 검사하는 필드
  private String urlValidator;
  //문자열 길이를 검사하는 필드
  private String stringLengthValidator;
  //정규 표현식을 사용해서 문자열 필드를 검사하는 필드
  private String regexValidator;  
  public String getRequiredValidator() {
	return requiredValidator;
  }
  public void setRequiredValidator(String requiredValidator) {
	this.requiredValidator = requiredValidator;
  }
  public String getFieldExpressionValidator() {
	return fieldExpressionValidator;
  }
  public void setFieldExpressionValidator(String fieldExpressionValidator) {
	this.fieldExpressionValidator = fieldExpressionValidator;
  }
  public String getUrlValidator() {
	return urlValidator;
  }
  public void setUrlValidator(String urlValidator) {
	this.urlValidator = urlValidator;
  }
  public String getStringLengthValidator() {
	return stringLengthValidator;
  }
  public void setStringLengthValidator(String stringLengthValidator) {
	this.stringLengthValidator = stringLengthValidator;
  }
  public String getRegexValidator() {
	return regexValidator;
  }
  public void setRegexValidator(String regexValidator) {
	this.regexValidator = regexValidator;
  }
  @Override
  public String execute() throws Exception {
	return SUCCESS;
  }
}
