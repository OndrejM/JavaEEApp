package sk.foxconn.caradmin.db;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import sk.foxconn.caradmin.model.Car;

public class CarDAO extends BaseDAO {
 
 @Inject
 EntityManager em;
 
 public TypedQuery<Car> getAllCars() {
  TypedQuery<Car> q = em.createQuery("select c from Car c", Car.class);
  return q;
 }

 public void store(Car car) {
  em.persist(car);
 }
 
 public Car update(Car car) {
  return em.merge(car);
 }

 public Car getCarById(Long id) {
  return em.find(Car.class, id);
 }

}
