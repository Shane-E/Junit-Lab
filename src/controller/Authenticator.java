package controller;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.User;

/**
 *
 * @author Shane
 */
public class Authenticator {
    private final User username = new User();
    
    public Authenticator(){
        
    }
    
    public void authenticateUser(JTextField usernameInput, JPasswordField passwordInput){
        boolean usernameValid = false;
        boolean passwordValid = false;
        String passwordInputToString = (this.encrypt(new String(passwordInput.getPassword())));
        if(usernameInput.getText().equals(username.getUsername())){
            usernameValid = true;
        }else{
            usernameValid = false;
        }
        
        if(passwordInputToString.equals(this.encrypt(username.getPassword()))){
            passwordValid = true;
        }else{
            passwordValid = false;
            //System.out.println("Stored Password: " + this.encrypt(username.getPassword()));
            //System.out.println("Input Password: " + passwordInputToString);
        }
        
        //System.out.println("Username Input: " + usernameInput.getText());
        //System.out.println("Stored Password: " + this.encrypt(username.getPassword()));
        //System.out.println("Password Input: " + passwordInputToString);
        
        //If userTextField.getUsernameField == username.readFromTextFile && 
        //password.getPasswordField.ecryptMD5 == password.readfromtextfile
        if(usernameValid && passwordValid){
            login(true);
        }else{
            login(false);
        }
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
    
    public String encrypt(String pw){
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String encPw = new String(md5.digest(pw.getBytes()));
            return encPw;
        }catch(Exception e){
            System.out.println("Cannot find encryption algorithm.");
        }
        return null;
    }
    
    //Check password
    public boolean checkPassword(JPasswordField pw){
        boolean validPassword = false;
        char[] password = pw.getPassword();
        String passwordString = new String(pw.getPassword());
        
        //Define password rules based on regular expression patterns.
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern number = Pattern.compile("\\d");
        Pattern specialChar = Pattern.compile("[!@#$%^&*()]");
        
        if(password.length >= 10 && password.length <= 20){
            if(lowerCase.matcher(passwordString).find()){
                System.out.println("Has Lowercase.");
                if(upperCase.matcher(passwordString).find()){
                    System.out.println("Has Uppercase.");
                    if(number.matcher(passwordString).find()){
                        System.out.println("Has Number.");
                        if(specialChar.matcher(passwordString).find()){
                            System.out.println("Has Special Character.");
                            validPassword = true;
                        }else{
                            System.out.println("Password requires a special SHIFT character from keyboard numbers.");
                        }
                    }else{
                        System.out.println("Password requires a number.");
                    }
                }else{
                    System.out.println("Password requires uppercase character.");
                }
            }else{
                System.out.println("Password requires lowercase character.");
            }
        }else{
            System.out.println("Password requires between 10-20 characters.");
        }
        return validPassword;
    }
}