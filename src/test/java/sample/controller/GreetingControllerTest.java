package sample.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import sample.resource.Greeting;

@RunWith(BlockJUnit4ClassRunner.class)
public class GreetingControllerTest {

	@Test
	public void messageReturnedNotNull() {
		Greeting greeting = new GreetingController().sayHello("");
		Assert.assertNotNull(greeting);
	}
}
