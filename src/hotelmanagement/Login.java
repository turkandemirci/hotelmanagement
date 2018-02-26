package hotelmanagement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    
    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("bob") && password.equals("secret")) {
            return true;
        }
        return false;
    }
	
}