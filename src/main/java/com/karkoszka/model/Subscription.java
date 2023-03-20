package com.karkoszka.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subscription {

    @Id
    private int id;
  
    @Column
    private String startDate;
  
    @Column
    private String validUntil;
  
    @Column
    private int quotation;
  
    public Subscription id(int id) {
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
  
    public Subscription startDate(String startDate) {
      this.startDate = startDate;
      return this;
    }
  
    /**
     * Get startDate
     * @return startDate
    */
    public String getStartDate() {
      return startDate;
    }
  
    public void setStartDate(String startDate) {
      this.startDate = startDate;
    }
  
    public Subscription validUntil(String validUntil) {
      this.validUntil = validUntil;
      return this;
    }
  
    /**
     * Get validUntil
     * @return validUntil
    */
    public String getValidUntil() {
      return validUntil;
    }
  
    public void setValidUntil(String validUntil) {
      this.validUntil = validUntil;
    }
  
    public Subscription quotation(int quotation) {
      this.quotation = quotation;
      return this;
    }
  
    /**
     * Get quotation
     * @return quotation
    */
    public int getQuotation() {
      return quotation;
    }
  
    public void setQuotation(int quotation) {
      this.quotation = quotation;
    }
  
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Subscription subscription = (Subscription) o;
      return Objects.equals(this.id, subscription.id) &&
          Objects.equals(this.startDate, subscription.startDate) &&
          Objects.equals(this.validUntil, subscription.validUntil) &&
          Objects.equals(this.quotation, subscription.quotation);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(id, startDate, validUntil, quotation);
    }
  
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Subscription {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
      sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
      sb.append("    quotation: ").append(toIndentedString(quotation)).append("\n");
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
