package action;

import com.opensymphony.xwork2.ActionSupport;

public class SampleValidatorAction extends ActionSupport{
  //�ʼ��� �Է��ؾ� �ϴ� �ʵ�
  private String requiredValidator;
  //OGNL ǥ������ ����ؼ� �ʵ带 �˻��ϴ� �ʵ�
  private String fieldExpressionValidator; 
  //��ȿ�� URL ���� �˻��ϴ� �ʵ�
  private String urlValidator;
  //���ڿ� ���̸� �˻��ϴ� �ʵ�
  private String stringLengthValidator;
  //���� ǥ������ ����ؼ� ���ڿ� �ʵ带 �˻��ϴ� �ʵ�
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
