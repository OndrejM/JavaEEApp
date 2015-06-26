package sk.foxconn.caradmin.logic.startup;

public class StartEvent {
 private boolean devMode;

 public StartEvent(boolean devMode) {
  this.devMode = devMode;
 }

 public boolean isDevMode() {
  return devMode;
 }
 
 
}
