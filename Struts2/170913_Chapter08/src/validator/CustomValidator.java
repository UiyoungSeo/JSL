package validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class CustomValidator  extends FieldValidatorSupport {
	@Override
	public void validate(Object object) throws ValidationException {
	    String fieldName = getFieldName();
	    Object value = this.getFieldValue(fieldName, object);
	    if (!(value instanceof String)) {
	      addFieldError(fieldName, object);
	    }
	    else {
	      String s = (String) value;
	      if (!s.matches("\\d{6}-\\d{7}")) {
	          addFieldError(fieldName, object);
	      }
	    }
	}
}
