package org.raspinloop.orchestrator;

import org.raspinloop.orchestrator.api.Launched;
import org.raspinloop.orchestrator.api.Status;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmulatorStatusControler {
	
	String properties = "{\"java_type\":\"org.raspinloop.emulator.raspberry.RaspiGpioSimulatorProperties\",\"componentName\":\"RaspberryPi GPIO Simulator\","
			+ "\"guid\":\"{5571c639-6438-4eee-839e-ff8442e3bbbc}\",\"supportedPins\":["
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":0,\"name\":\"GPIO 0\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":1,\"name\":\"GPIO 1\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\",\"PULL_DOWN\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":2,\"name\":\"GPIO 2\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":3,\"name\":\"GPIO 3\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":4,\"name\":\"GPIO 4\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":5,\"name\":\"GPIO 5\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":6,\"name\":\"GPIO 6\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":7,\"name\":\"GPIO 7\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":8,\"name\":\"GPIO 8\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":9,\"name\":\"GPIO 9\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":10,\"name\":\"GPIO 10\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":11,\"name\":\"GPIO 11\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":12,\"name\":\"GPIO 12\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":13,\"name\":\"GPIO 13\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":14,\"name\":\"GPIO 14\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":15,\"name\":\"GPIO 15\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":16,\"name\":\"GPIO 16\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":17,\"name\":\"GPIO 17\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":18,\"name\":\"GPIO 18\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":19,\"name\":\"GPIO 19\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":20,\"name\":\"GPIO 20\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":21,\"name\":\"GPIO 21\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":22,\"name\":\"GPIO 22\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":23,\"name\":\"GPIO 23\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\",\"PULL_DOWN\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":24,\"name\":\"GPIO 24\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\",\"PULL_DOWN\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":25,\"name\":\"GPIO 25\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":26,\"name\":\"GPIO 26\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\",\"PULL_DOWN\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":27,\"name\":\"GPIO 27\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":28,\"name\":\"GPIO 28\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":29,\"name\":\"GPIO 29\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":30,\"name\":\"GPIO 30\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\"]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":31,\"name\":\"GPIO 31\",\"supportedPinMode\":[\"DIGITAL_INPUT\",\"DIGITAL_OUTPUT\"],\"supportedResistance\":[\"OFF\",\"PULL_UP\"]}],"
			+ "\"unusedPins\":[],"
			+ "\"outputPins\":[{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":1,\"name\":\"GPIO 1\",\"supportedPinMode\":[],\"supportedResistance\":[]},"
			+ "{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":3,\"name\":\"GPIO 3\",\"supportedPinMode\":[],\"supportedResistance\":[]}],"
			+ "\"inputPins\":[{\"provider\":\"RaspberryPi GPIO Provider\",\"address\":2,\"name\":\"GPIO 2\",\"supportedPinMode\":[],\"supportedResistance\":[]}],"
			+ "\"extentionComponents\":[],\"uartComponents\":[],\"spiComponents\":[],\"i2cComponents\":[]}";
	
	
	@PostMapping("/emulator/{id}/status")
	public void create(@PathVariable String id, @RequestBody Launched msg) throws JsonMappingException, JsonProcessingException {
		log.info("TEST: Emulater launched for emulator id: {} in {} seconds", id, msg.getLaunchTime());
	}
	
	@PatchMapping("/emulator/{id}/status")
	public void update(@PathVariable String id, @RequestBody Status msg) {
		log.info("TEST: patch status {} for emulator id: {}",msg, id);		
	}
}
