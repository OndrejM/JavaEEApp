package sk.foxconn.caradmin.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CARS")
public class Car extends BaseModel implements Serializable {
 
 @NotNull(message = "{field.value} {car.brand} {javax.validation.constraints.NotNull.message}")
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
