package sk.foxconn.caradmin.view;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.SelectableDataModel;
import sk.foxconn.caradmin.logic.CarAdmin;
import sk.foxconn.caradmin.model.Car;

@Named("carController")
@RequestScoped
public class CarView extends BaseView {
 
 @Inject
 private CarAdmin carAdmin;
 
 @Inject
 private CarViewPageContext viewContext;
 
 private List<Car> selectedCars;
 
 public SelectableDataModelImpl getCars() {
  return new SelectableDataModelImpl(carAdmin.getAllCars());
 }

 public Car getSelectedCar() {
  return viewContext.getSelectedCar();
 }

 public void setSelectedCar(Car selectedCar) {
  viewContext.setSelectedCar(selectedCar);
 }
  
 public List<Car> getSelectedCars() {
  return selectedCars;
 }

 public void setSelectedCars(List<Car> selectedCars) {
  this.selectedCars = selectedCars;
 }

 public class SelectableDataModelImpl extends ListDataModel<Car> implements SelectableDataModel<Car> {

  public SelectableDataModelImpl() {
  }

  public SelectableDataModelImpl(List<Car> list) {
   super(list);
  }
 
  @Override
  public Object getRowKey(Car car) { 
   return null;
  }

  @Override
  public Car getRowData(String rowKey) {
   Long id = Long.parseLong(rowKey);
   return carAdmin.getCarById(id);
  }
 }

 public boolean isEditMode() {
  return viewContext.isEditMode();
 }

 public void setEditMode(boolean editMode) {
  viewContext.setEditMode(editMode);
 }
 
 public void editCar() {
  viewContext.setEditMode(true);
 }
 
 public void saveCar() {
  viewContext.setEditMode(false);
  if (carAdmin.updateCar(getSelectedCar())) {
   addMessage("Save sa podaril");
  }
 }
 
 public void cancelEditCar() {
  viewContext.setEditMode(false);
 }
 
}
