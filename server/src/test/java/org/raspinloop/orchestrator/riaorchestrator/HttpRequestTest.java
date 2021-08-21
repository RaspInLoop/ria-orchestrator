package org.raspinloop.orchestrator.riaorchestrator;

import org.junit.jupiter.api.Test;
import org.raspinloop.orchestrator.api.Launched;
import org.raspinloop.orchestrator.api.Starting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		this.restTemplate.postForObject("http://localhost:" + port + "/emulator/1234/status", new Launched(10),
				Void.class);		
	}
}