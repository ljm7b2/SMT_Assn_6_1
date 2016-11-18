

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.psnbtech.entity.Asteroid;
import org.psnbtech.entity.Bullet;

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
		Random rand = new Random();
		rand.setSeed(-1000000);
		
		Asteroid asteroid = new Asteroid(rand);
		
		asteroid.update(null);
		double d = asteroid.position.y;
		
		assertTrue(asteroid.position.y == 112.81749158876349);
		
	}
	
	@Test
	public void update_PositionX_GT0_Test(){
		
		Random rand = new Random();
		rand.setSeed(1000000);
		
		Asteroid asteroid = new Asteroid(rand);
		asteroid.update(null);
		
		double d = asteroid.position.x;
		
		assertTrue(asteroid.position.x == 395.26620650456545);
		
	}
	
	@Test
	public void update_PositionY_GT0_Test(){
		
		Random rand = new Random();
		rand.setSeed(1000000);
		
		Asteroid asteroid = new Asteroid(rand);
		asteroid.update(null);
		
		double d = asteroid.position.y;
		
		assertTrue(asteroid.position.y == 420.4083780316202);
		
	}
	
	@Test
	public void checkCollisionWithSelf_Test(){
		
		Random rand = new Random();
		rand.setSeed(1000000);
		
		Asteroid asteroid = new Asteroid(rand);
		
		assertTrue(asteroid.checkCollision(asteroid) == true);		
	}
	
	@Test
	public void checkCollisionWithAnotherAsteroid_Test(){
		
		Random rand = new Random();
		rand.setSeed(1000000);
		
		Random rand2 = new Random();
		rand.setSeed(1000001);
		
		Asteroid asteroid1 = new Asteroid(rand);
		
		Asteroid asteroid2 = new Asteroid(rand2);
		
		assertTrue(asteroid1.checkCollision(asteroid2) == false);		
	}
	
	@Test
	public void checkCollisionWithBullet_Test(){
		
		Random rand = new Random();
		rand.setSeed(1000000);
		
		
		Asteroid asteroid = new Asteroid(rand);
		
		Bullet bullet = new Bullet(asteroid, 0.052);
		
		assertTrue(asteroid.checkCollision(bullet) == true);		
	}
}
