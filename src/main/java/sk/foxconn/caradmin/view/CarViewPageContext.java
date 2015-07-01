package sk.foxconn.caradmin.view;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import sk.foxconn.caradmin.model.Car;

@ViewScoped
public class CarViewPageContext implements Serializable {
 private Car selectedCar;
 private boolean editMode;

 public Car getSelectedCar() {
  return selectedCar;
 }

 public void setSelectedCar(Car selectedCar) {
  this.selectedCar = selectedCar;
 }

 public boolean isEditMode() {
  return editMode;
 }

 public void setEditMode(boolean editMode) {
  this.editMode = editMode;
 }
 
}
