package com.karkoszka.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

    @Id
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String middleName;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String birthDate;
  
    public Customer id(int id) {
      this.id = id;
      return this;
    }
  
    /**
     * Get id
     * @return id
    */
    
    public int getId() {
      return id;
    }
  
    public void setId(int id) {
      this.id = id;
    }
  
    public Customer firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }
  
    /**
     * Get firstname
     * @return firstname
    */
    
    public String getFirstName() {
      return firstName;
    }
  
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
  
    public Customer lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }
  
    /**
     * Get lastName
     * @return lastName
    */
    
    public String getLastName() {
      return lastName;
    }
  
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  
    public Customer middleName(String middleName) {
      this.middleName = middleName;
      return this;
    }
  
    /**
     * Get middleName
     * @return middleName
    */
    
    public String getMiddleName() {
      return middleName;
    }
  
    public void setMiddleName(String middleName) {
      this.middleName = middleName;
    }
  
    public Customer email(String email) {
      this.email = email;
      return this;
    }
  
    /**
     * Get email
     * @return email
    */
    
    public String getEmail() {
      return email;
    }
  
    public void setEmail(String email) {
      this.email = email;
    }
  
    public Customer phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  
    /**
     * Get phoneNumber
     * @return phoneNumber
    */
    
    public String getPhoneNumber() {
      return phoneNumber;
    }
  
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }
  
    public Customer birthDate(String birthDate) {
      this.birthDate = birthDate;
      return this;
    }
  
    /**
     * Get birthDate
     * @return birthDate
    */
    public String getBirthDate() {
      return birthDate;
    }
  
    public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
    }
  
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Customer customer = (Customer) o;
      return Objects.equals(this.id, customer.id) &&
          Objects.equals(this.firstName, customer.firstName) &&
          Objects.equals(this.lastName, customer.lastName) &&
          Objects.equals(this.middleName, customer.middleName) &&
          Objects.equals(this.email, customer.email) &&
          Objects.equals(this.phoneNumber, customer.phoneNumber) &&
          Objects.equals(this.birthDate, customer.birthDate);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(id, firstName, lastName, middleName, email, phoneNumber, birthDate);
    }
  
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Customer {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
      sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
      sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
      sb.append("}");
      return sb.toString();
    }
  
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
    
}
