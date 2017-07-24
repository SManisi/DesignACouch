/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.bo;

import co.za.designacouch.dao.LogInDao;
import co.za.designacouch.daoimpl.LogInDaoImpl;

/**
 *
 * @author Siyanda
 */
public class LogInBo {
    public static boolean logIn(String userName, String password) {
        LogInDao logInDao = new LogInDaoImpl();
        boolean isLoggedIn = logInDao.logIn(userName, password);
        
        return isLoggedIn;
    }
}
