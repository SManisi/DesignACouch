/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.serviceimpl;

import co.za.designacouch.bo.LogInBo;
import co.za.designacouch.service.LogInService;

/**
 *
 * @author Siyanda
 */
public class LogInServiceImpl implements LogInService {
    
    /**
     * This method is used for login users.
     * 
     * @param userName the user name
     * @param  password the pass word
     * @return isLoggedIn
     * 
     */
    @Override
    public boolean logIn(String userName, String password) {
        boolean isLoggedIn = LogInBo.logIn(userName, password);
        return isLoggedIn;
    }
}
