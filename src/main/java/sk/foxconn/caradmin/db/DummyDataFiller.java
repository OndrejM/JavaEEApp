package sk.foxconn.caradmin.db;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import sk.foxconn.caradmin.logic.startup.StartEvent;
import sk.foxconn.caradmin.model.Car;

@Stateless
public class DummyDataFiller {
 
 @Inject
 private CarDAO carDAO;
 
 public void initDbOnStart(@Observes StartEvent event) {
  if (event.isDevMode()) {
   for (int i = 0; i < 4; i++) {
    carDAO.store(createSomeCar(i));
   }
  }
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
