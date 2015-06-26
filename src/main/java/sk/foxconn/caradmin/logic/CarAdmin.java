package sk.foxconn.caradmin.logic;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import sk.foxconn.caradmin.model.Car;

@RequestScoped
public class CarAdmin extends BaseLogic {
 public List<Car> getAllCars() {
  ArrayList<Car> cars = new ArrayList<>();
  for (int i = 0; i < 4; i++) {
   cars.add(createSomeCar(i));
  }
  return cars;
 }

 private Car createSomeCar(int i) {
  Car car = new Car();
  car.setBrand("Audi");
  car.setModel("X" + (i+1));
  car.setYearOfCreation(2007 + i);
  car.setInternalId("CAR-00" + i);
  return car;
 }
}
