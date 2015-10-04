/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shane
 */
public class AuthenticatorTest {
    
    public AuthenticatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setting up tests.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tearing down tests.");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of authenticateUser method, of class Authenticator.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        JTextField usernameInput = new JTextField();
        usernameInput.setText("test");
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setText("123");
        Authenticator instance = new Authenticator();
        instance.authenticateUser(usernameInput, passwordInput);
        System.out.println("***************************");
    }

    /**
     * Test of encrypt method, of class Authenticator.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String pw = "12345";
        Authenticator instance = new Authenticator();
        String expResult = "�|��plL4�h��";
        String result = instance.encrypt(pw);
        System.out.println("Test Password: " + instance.encrypt(pw));
        System.out.println("Expected Password: " + expResult);
        assertEquals(expResult, result);
        System.out.println("***************************");
    }
    
    @Test
    public void testCheckPassword(){
        System.out.println("checkPassword: False");
        JPasswordField pw = new JPasswordField();
        pw.setText("test");
        Authenticator instance = new Authenticator();
        assertFalse(instance.checkPassword(pw));
        System.out.println("***************************");
    }
    
    @Test
    public void testCheckPassword2(){
        System.out.println("checkPassword: True");
        JPasswordField pw = new JPasswordField();
        pw.setText("Abcdefgh1!");
        Authenticator instance = new Authenticator();
        assertTrue(instance.checkPassword(pw));
        System.out.println("***************************");
    }
    
}
