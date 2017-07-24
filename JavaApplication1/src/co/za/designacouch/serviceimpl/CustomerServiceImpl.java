/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.serviceimpl;

import co.za.designacouch.bo.CustomerBo;
import co.za.designacouch.domain.CustomerDo;
import co.za.designacouch.service.CustomerService;
import java.util.List;

/**
 *
 * @author Siyanda
 */
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public CustomerDo recordCustomerDo(CustomerDo customerDo) {
        CustomerBo.recordCustomerDo(customerDo);
        
        return customerDo;
    }
    
    @Override
    public void printCustomerInformation(List<CustomerDo> customerDoList) {
        CustomerBo.printCustomerInformation(customerDoList);
    }
}
