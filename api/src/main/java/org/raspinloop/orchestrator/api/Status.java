package org.raspinloop.orchestrator.api;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({ 
		  @Type(value = Starting.class, name = "starting"), 
		  @Type(value = Started.class, name = "started"),
		  @Type(value = SimulationStopped.class, name = "simulation_stopped") 
		})
public abstract class Status {

}
