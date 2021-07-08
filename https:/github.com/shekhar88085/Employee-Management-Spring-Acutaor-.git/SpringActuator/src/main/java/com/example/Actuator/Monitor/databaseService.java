package com.example.Actuator.Monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class databaseService implements HealthIndicator {
	private final String DATABASE_SERVICE="databaseService";
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(isDatabaseHealthGood()) {
			return Health.up().withDetail(DATABASE_SERVICE,"Service is running").build();
		}
		return Health.up().withDetail(DATABASE_SERVICE,"Service is not available").build();
	}
	private boolean isDatabaseHealthGood() {
		//logic
		return true;
	}
}
