package sk.foxconn.caradmin.view;

import sk.foxconn.caradmin.cdi.MsgResource;
import java.util.List;
import java.util.ResourceBundle;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.SelectableDataModel;
import org.primefaces.model.SelectableDataModelWrapper;
import sk.foxconn.caradmin.logic.CarAdmin;
import sk.foxconn.caradmin.model.Car;

@Named("carController")
@RequestScoped
public class CarView extends BaseView {
 
 @Inject
 private CarAdmin carAdmin;
 
 private Car selectedCar;
 
 private List<Car> selectedCars;
 
 public SelectableDataModelImpl getCars() {
  return new SelectableDataModelImpl(carAdmin.getAllCars());
 }
  
 public Car getSelectedCar() {
  return selectedCar;
 }

 public void setSelectedCar(Car selectedCar) {
  this.selectedCar = selectedCar;
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
 
}
