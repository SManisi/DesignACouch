/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.service;

import co.za.designacouch.domain.CustomerDo;
import java.util.List;

/**
 *
 * @author Siyanda
 */
public interface CustomerService {
    
    CustomerDo recordCustomerDo(CustomerDo customerDo);
    
    void printCustomerInformation(List<CustomerDo> customerDoList);
}
