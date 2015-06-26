package sk.foxconn.caradmin.cdi;

import java.util.ResourceBundle;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

public class JSFProducer {

 @Inject 
 private FacesContext context;
 
 @Produces
 @MsgResource
 public ResourceBundle createMsgBundle() {
  ResourceBundle bundle = createBundle("msg");
  return bundle;
 }

 @Produces
 @ReportsResource
 public ResourceBundle createReportsBundle() {
  ResourceBundle bundle = createBundle("reports");
  return bundle;
 }

 private ResourceBundle createBundle(String variableName) {
  ResourceBundle bundle = context.getApplication().getResourceBundle(context, variableName);
  return bundle;
 }
 
 public static class ContextProducer {
  
  @Produces
  public FacesContext getCurrentContext() {
   return FacesContext.getCurrentInstance();
  }
 }

}
