package sk.foxconn.caradmin.view;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import sk.foxconn.caradmin.logic.CarAdmin;
import sk.foxconn.caradmin.model.Car;

@Named("carController")
public class CarView extends BaseView {
 
 @Inject
 private CarAdmin carAdmin;
 
 public List<Car> getCars() {
  return carAdmin.getAllCars();
 }
}
