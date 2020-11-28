/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

/**
 *
 * @author marina
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainValidator {
    
    private static MainValidator handler = null;
    
    public static MainValidator getInstance(){
        if(handler == null){
            handler = new MainValidator();
        }
        
        return handler;
    }

	public boolean EmailValidator(String user_email) {
		String emailRegex = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(user_email);
		return matcher.matches();
	}
	
	public boolean PhoneValidator(String user_phoneNumber) {
		String phoneRegex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(user_phoneNumber);
		return matcher.matches();
	}
	
}