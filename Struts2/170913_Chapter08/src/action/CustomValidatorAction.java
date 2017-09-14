package action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomValidatorAction extends ActionSupport {
	private String customValidator;
	public String getCustomValidator() {
		  return customValidator;
	}

	public void setCustomValidator(String customValidator) {
		  this.customValidator = customValidator;
	}
	@Override
	public String execute() throws Exception {
	    return SUCCESS;
	}
}
