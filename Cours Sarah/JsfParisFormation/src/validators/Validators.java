package validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class Validators implements Validator{

	public Validators() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		System.out.println("test");
		if(!value.toString().startsWith("P")) {
			System.out.println(value.toString());
			FacesMessage msg = new FacesMessage("Erreur de validation du code "+ 
					"le code doit commencer par P");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		
	}

}
