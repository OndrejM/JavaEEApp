package sk.foxconn.caradmin.logic;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import sk.foxconn.caradmin.db.CarDAO;
import sk.foxconn.caradmin.model.Car;

@RequestScoped
public class CarAdmin extends BaseLogic {
 
 @Inject
 private CarDAO carDAO;
 
 public List<Car> getAllCars() {
  return carDAO.getAllCars().getResultList();
 }

 public Car getCarById(Long id) {
  return carDAO.getCarById(id);
 }
}
