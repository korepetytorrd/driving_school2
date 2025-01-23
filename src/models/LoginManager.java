package com.example.models;


public class LoginManager {

    String email;
    String pass;

    public static User login(String email, String haslo){
        FileManager.readUsersFromFile("user.txt");
        
        return User(email,haslo);
      }
    


}
