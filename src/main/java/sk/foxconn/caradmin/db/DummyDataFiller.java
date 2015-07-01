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
   if (carDAO.getAllCars().getResultList().isEmpty()) {
    for (int i = 0; i < 4; i++) {
     carDAO.store(createSomeCar(i));
    }
   }
  }
 }
 
 private Car createSomeCar(int i) {
  Car car = new Car();
  if (defaultCarInfo.length > i) {
   car.setBrand(getDefaultBrandForIndex(i));
   car.setModel(getDefaultModelForIndex(i));
  } else {
   car.setBrand("Audi");
   car.setModel("X" + (i+1));
  }
  car.setYearOfCreation(2007 + (i/2));
  car.setInternalId("CAR-00" + i);
  return car;
 }

 private static String getDefaultModelForIndex(int i) {
  return defaultCarInfo[i][1].toString();
 }

 private static String getDefaultBrandForIndex(int i) {
  return defaultCarInfo[i][0].toString();
 }
 
 private static final Object[][] defaultCarInfo = new Object[][] {
  {"Audi", "A8"}, {"Audi", "A3"}, {"BMW", "Z1"}, {"Škoda", "Superb"} 
 };
 
}
