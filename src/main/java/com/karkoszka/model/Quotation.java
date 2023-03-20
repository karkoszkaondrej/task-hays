package com.karkoszka.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Quotation {

    @Id
    private int id;
  
    @Column
    private String beginingOfInsurance;
  
    @Column
    private Long insuredAmount;
  
    @Column
    private String dateOfSigningMortgage;
  
    // @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
  
    public Quotation id(int id) {
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
  
    public Quotation beginingOfInsurance(String beginingOfInsurance) {
      this.beginingOfInsurance = beginingOfInsurance;
      return this;
    }
  
    /**
     * Get beginingOfInsurance
     * @return beginingOfInsurance
    */
    public String getBeginingOfInsurance() {
      return beginingOfInsurance;
    }
  
    public void setBeginingOfInsurance(String beginingOfInsurance) {
      this.beginingOfInsurance = beginingOfInsurance;
    }
  
    public Quotation insuredAmount(Long insuredAmount) {
      this.insuredAmount = insuredAmount;
      return this;
    }
  
    /**
     * Get insuredAmount
     * @return insuredAmount
    */
    
    public Long getInsuredAmount() {
      return insuredAmount;
    }
  
    public void setInsuredAmount(Long insuredAmount) {
      this.insuredAmount = insuredAmount;
    }
  
    public Quotation dateOfSigningMortgage(String dateOfSigningMortgage) {
      this.dateOfSigningMortgage = dateOfSigningMortgage;
      return this;
    }
  
    /**
     * Get dateOfSigningMortgage
     * @return dateOfSigningMortgage
    */
    public String getDateOfSigningMortgage() {
      return dateOfSigningMortgage;
    }
  
    public void setDateOfSigningMortgage(String dateOfSigningMortgage) {
      this.dateOfSigningMortgage = dateOfSigningMortgage;
    }
  
    public Quotation customer(Customer customer) {
      this.customer = customer;
      return this;
    }
  
    /**
     * Get customer
     * @return customer
    */
    public Customer getCustomer() {
      return customer;
    }
  
    public void setCustomer(Customer customer) {
      this.customer = customer;
    }
  
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Quotation quotation = (Quotation) o;
      return Objects.equals(this.id, quotation.id) &&
          Objects.equals(this.beginingOfInsurance, quotation.beginingOfInsurance) &&
          Objects.equals(this.insuredAmount, quotation.insuredAmount) &&
          Objects.equals(this.dateOfSigningMortgage, quotation.dateOfSigningMortgage) &&
          Objects.equals(this.customer, quotation.customer);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(id, beginingOfInsurance, insuredAmount, dateOfSigningMortgage, customer);
    }
  
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Quotation {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    beginingOfInsurance: ").append(toIndentedString(beginingOfInsurance)).append("\n");
      sb.append("    insuredAmount: ").append(toIndentedString(insuredAmount)).append("\n");
      sb.append("    dateOfSigningMortgage: ").append(toIndentedString(dateOfSigningMortgage)).append("\n");
      sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
