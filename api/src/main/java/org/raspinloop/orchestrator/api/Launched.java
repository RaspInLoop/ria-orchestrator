package org.raspinloop.orchestrator.api;

import lombok.Getter;
import lombok.Setter;

public class Launched extends Status {

	@Getter
	@Setter
	private int launchTime;

	public Launched() {		
	}
	
	public Launched(int launchTime) {
		this.launchTime = launchTime;		
	}

}
