package view;

import controller.App;
import controller.Authenticator;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.User;

public class MainPanel extends JPanel implements ActionListener{
    private final JLabel usernameLabel, passwordLabel;
    private final JTextField username;
    private final JPasswordField password;
    private final JButton login;
    private final Authenticator loginChecker;
    
    public MainPanel(){
        username = new JTextField();
        password = new JPasswordField(20);
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        login = new JButton("Login");
        
        loginChecker = new Authenticator();
        
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
        
        login.addActionListener(this);
        
        add(usernameLabel, usernameLabelC);
        add(username, usernameFieldC);
        add(passwordLabel, passwordLabelC);
        add(password, passwordFieldC);
        add(login, loginButtonC);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            loginChecker.authenticateUser(username, password);
            if(loginChecker.checkPassword(password)){
                loginChecker.authenticateUser(username, password);
            }else{
                System.out.println("Password Authentication Failed.");
            }
        }
    }
}
