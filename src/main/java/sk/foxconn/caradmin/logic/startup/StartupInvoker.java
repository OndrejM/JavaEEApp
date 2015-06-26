package sk.foxconn.caradmin.logic.startup;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Singleton
@Startup
public class StartupInvoker {

 @Inject
 private Event<StartEvent> startEvent;
 
 @PostConstruct
 public void start() {
  Logger.getGlobal().warning("Startup........");
  startEvent.fire(new StartEvent(true));
 }
 
}
