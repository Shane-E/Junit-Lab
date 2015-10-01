package model;

public class User {
    private String username;
    private String password;
    
    public User(){
        username = "test";
        password = "123";
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
}
