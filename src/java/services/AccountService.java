/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author Kelsey
 */
public class AccountService {
    public AccountService(){
        
    }
    public User login(String username, String password){
       String name1 = "aba";
       String name2 = "barb";
       String password1 ="password";
       
       if(username.equals(name1) || username.equals(name2) && password.equals(password1)){
           User user = new User(username, password);
           user.setPassword(null);
           return user;
       }else{
           return null;
       }
       
    }
    
}
