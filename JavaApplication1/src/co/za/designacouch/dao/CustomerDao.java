/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.dao;

import co.za.designacouch.domain.CustomerDo;

/**
 *
 * @author Siyanda
 */
public interface CustomerDao {
    CustomerDo recordCustomerDo(CustomerDo customerDo);
}
