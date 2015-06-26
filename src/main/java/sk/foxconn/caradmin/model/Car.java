package sk.foxconn.caradmin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CARS")
public class Car extends BaseModel {
 
 private String brand;
 private String model;
 @Column(name = "year_of_creation")
 private int yearOfCreation;
 @Column(name = "internal_id")
 private String internalId;

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public int getYearOfCreation() {
  return yearOfCreation;
 }

 public void setYearOfCreation(int yearOfCreation) {
  this.yearOfCreation = yearOfCreation;
 }

 public String getInternalId() {
  return internalId;
 }

 public void setInternalId(String internalId) {
  this.internalId = internalId;
 }
 
 
}
