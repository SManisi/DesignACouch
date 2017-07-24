/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.daoimpl;

import co.za.designacouch.dao.CustomerDao;
import co.za.designacouch.domain.CustomerDo;

/**
 *
 * @author Siyanda
 */
public class CustomerDaoImpl implements CustomerDao {
    
    @Override
    public CustomerDo recordCustomerDo(CustomerDo customerDo) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        
        databaseConnection.initDatabase();
        return customerDo;
    }
}
