/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.daoimpl;

import co.za.designacouch.dao.LogInDao;

/**
 *
 * @author Siyanda
 */
public class LogInDaoImpl implements LogInDao {
    
    @Override
    public boolean logIn(String userName, String password) {
        if (userName.equalsIgnoreCase("johnson") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
