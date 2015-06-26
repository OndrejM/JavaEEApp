package sk.foxconn.caradmin.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
class BaseModel {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }
 
 
}
