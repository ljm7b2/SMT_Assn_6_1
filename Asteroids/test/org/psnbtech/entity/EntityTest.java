package org.psnbtech.entity;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityTest {
	@Test
	public void test() {
		assertTrue("a" == "a");
	}
	
	@Test
	public void update_PositionX_LT0_Test(){
		Random rand = new Random();
		rand.setSeed(-1000000);
		Asteroid asteroid = new Asteroid(rand);
		
		asteroid.update(null);
		double d = asteroid.position.x;
		
		assertTrue(asteroid.position.x == 316.24279108969677);
		
	}
	
	@Test
	public void update_PositionY_LT0_Test(){
		
	}
	
	@Test
	public void update_PositionXandY_GT0_Test(){
		
	}

}
