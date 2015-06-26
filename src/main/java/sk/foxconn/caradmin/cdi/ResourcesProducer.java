package sk.foxconn.caradmin.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ResourcesProducer {
 @Produces
 @PersistenceContext(name = "cars")
 EntityManager em;

}
