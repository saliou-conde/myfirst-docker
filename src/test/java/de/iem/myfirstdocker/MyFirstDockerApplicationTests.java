package de.iem.myfirstdocker;

import de.iem.myfirstdocker.controller.MyFirstDockerApplicationController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class MyFirstDockerApplicationTests {

	private MyFirstDockerApplicationController myFirstDockerApplicationController = Mockito.mock(MyFirstDockerApplicationController.class);

	@BeforeEach
	public void init(){
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello World, " +
				"this is my first docker Container in Conjunction with Spring Boot",
				HttpStatus.OK);
		when(myFirstDockerApplicationController.helloWorld())
				.thenReturn(responseEntity);
	}

	@Test
	public void contextLoads() {

		ResponseEntity<String> responseEntity = myFirstDockerApplicationController.helloWorld();
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		return;

	}

}
