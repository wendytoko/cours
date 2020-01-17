package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class NameConverter implements Converter{

	public NameConverter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		// renvoie une chaine de caractère converti en objet
		
		String valueConverted=value.toString().toUpperCase();
		System.out.println("test  "+valueConverted);
		return valueConverted;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// renvoie un objet de classe Object et le converti en String
		return null;
	}

}
