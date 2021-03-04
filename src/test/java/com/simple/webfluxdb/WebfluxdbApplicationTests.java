package com.simple.webfluxdb;

import com.simple.webfluxdb.controller.DataController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class WebfluxdbApplicationTests {

	@Autowired
	private DataController dataController;

	@Test
	void contextLoads() {
		assertNotNull(dataController);
	}

}
