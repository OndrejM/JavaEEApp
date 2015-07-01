package sk.foxconn.caradmin.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

class BaseView {
 
 @Inject
 private FacesContext fcontext;
 
 protected void addMessage(String msg) {
   fcontext.addMessage(null, new FacesMessage(msg));
 }

}
