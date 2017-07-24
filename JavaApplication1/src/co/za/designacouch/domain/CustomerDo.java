/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.domain;

/**
 *
 * @author Siyanda
 */
public class CustomerDo {
    
    private Integer customerNumber;
    private String name;
    private String middleName;
    private String surname;
    private String customerType;
    private String title;
    private String email;
    private String telephoneWork;
    private String telephoneCell;
    private String residentialAddress;
    private String residentialPostCode;
    private String postalAddress;
    private String postalAddressPostCode;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the customerType
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * @param customerType the customerType to set
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telephoneWork
     */
    public String getTelephoneWork() {
        return telephoneWork;
    }

    /**
     * @param telephoneWork the telephoneWork to set
     */
    public void setTelephoneWork(String telephoneWork) {
        this.telephoneWork = telephoneWork;
    }

    /**
     * @return the telephoneCell
     */
    public String getTelephoneCell() {
        return telephoneCell;
    }

    /**
     * @param telephoneCell the telephoneCell to set
     */
    public void setTelephoneCell(String telephoneCell) {
        this.telephoneCell = telephoneCell;
    }

    /**
     * @return the residentialAddress
     */
    public String getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * @param residentialAddress the residentialAddress to set
     */
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    /**
     * @return the residentialPostCode
     */
    public String getResidentialPostCode() {
        return residentialPostCode;
    }

    /**
     * @param residentialPostCode the residentialPostCode to set
     */
    public void setResidentialPostCode(String residentialPostCode) {
        this.residentialPostCode = residentialPostCode;
    }

    /**
     * @return the postalAddress
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * @param postalAddress the postalAddress to set
     */
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    /**
     * @return the postalAddressPostCode
     */
    public String getPostalAddressPostCode() {
        return postalAddressPostCode;
    }

    /**
     * @param postalAddressPostCode the postalAddressPostCode to set
     */
    public void setPostalAddressPostCode(String postalAddressPostCode) {
        this.postalAddressPostCode = postalAddressPostCode;
    }

    /**
     * @return the customerNumber
     */
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    /**
     * @param customerNumber the customerNumber to set
     */
    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }
}
