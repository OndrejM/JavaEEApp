package sk.foxconn.caradmin.logic;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import sk.foxconn.caradmin.db.CarDAO;
import sk.foxconn.caradmin.model.Car;

@Stateless
public class CarAdmin extends BaseLogic {
 
 @Inject
 private CarDAO carDAO;
 
 public List<Car> getAllCars() {
  return carDAO.getAllCars().getResultList();
 }

 public Car getCarById(Long id) {
  return carDAO.getCarById(id);
 }
 
 public boolean updateCar(Car car) {
  carDAO.update(car);
  return true;
 }
}
