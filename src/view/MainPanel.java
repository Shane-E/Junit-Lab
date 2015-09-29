package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
    private final JLabel usernameLabel, passwordLabel;
    private final JTextField username;
    private final JPasswordField password;
    private final JButton login;
    
    public MainPanel(){
        username = new JTextField();
        password = new JPasswordField(20);
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        login = new JButton("Login");
        
        setupLogin();
    }
    
    private void setupLogin(){
        setLayout(new GridBagLayout());
        
        GridBagConstraints usernameFieldC = new GridBagConstraints();
        usernameFieldC.fill = GridBagConstraints.HORIZONTAL;
        usernameFieldC.gridx = 1;
        usernameFieldC.gridy = 0;
        usernameFieldC.insets = new Insets(0,0,20,0);
        
        GridBagConstraints passwordFieldC = new GridBagConstraints();
        passwordFieldC.fill = GridBagConstraints.HORIZONTAL;
        passwordFieldC.gridx = 1;
        passwordFieldC.gridy = 1;
        passwordFieldC.insets = new Insets(0,0,20,0);
        
        GridBagConstraints usernameLabelC = new GridBagConstraints();
        usernameLabelC.fill = GridBagConstraints.HORIZONTAL;
        usernameLabelC.gridx = 0;
        usernameLabelC.gridy = 0;
        usernameLabelC.insets = new Insets(0,0,20,0);
        
        GridBagConstraints passwordLabelC = new GridBagConstraints();
        passwordLabelC.fill = GridBagConstraints.HORIZONTAL;
        passwordLabelC.gridx = 0;
        passwordLabelC.gridy = 1;
        passwordLabelC.insets = new Insets(0,0,20,0);
        
        GridBagConstraints loginButtonC = new GridBagConstraints();
        loginButtonC.fill = GridBagConstraints.HORIZONTAL;
        loginButtonC.gridx = 1;
        loginButtonC.gridy = 2;
        
        add(usernameLabel, usernameLabelC);
        add(username, usernameFieldC);
        add(passwordLabel, passwordLabelC);
        add(password, passwordFieldC);
        add(login, loginButtonC);
    }
}
