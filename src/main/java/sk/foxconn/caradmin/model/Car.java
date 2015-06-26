package sk.foxconn.caradmin.model;

public class Car extends BaseModel {
 private String brand;
 private String model;
 private int yearOfCreation;
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
