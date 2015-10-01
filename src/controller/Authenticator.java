package controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.User;

/**
 *
 * @author Shane
 */
public class Authenticator {
    private final User username;
    
    public Authenticator(User currentUser){
        username = currentUser;
    }
    
    public void authenticateUser(JTextField usernameInput, JPasswordField passwordInput){
        boolean validLogin = false;
        String passwordToString = new String(passwordInput.getPassword());
        if(usernameInput.getText().equals(username.getUsername()) && passwordToString.equals(username.getPassword())){
            validLogin = true;
        }else{
            validLogin = false;
        }
        
        System.out.println("Username Input: " + usernameInput.getText());
        System.out.println("Password Input: " + passwordToString);
        
        //If userTextField.getUsernameField == username.readFromTextFile && 
        //password.getPasswordField.ecryptMD5 == password.readfromtextfile
        login(validLogin);
    }
    
    private void addUser(){
        
    }
    
    private void login(boolean goodLogin){
        if(goodLogin){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed. Username/Password is incorrect");
        }
    }
}