package org.psnbtech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameTest {
	
	@Test
	public void updateGame_EntitiesCleared_Test(){
		Game game = new Game(true);
		
		game.updateGame();
		
		assertTrue(game.pendingEntities.isEmpty());
	}
	
	@Test
	public void updateGame_EntitiesHasTwo_Test(){
		Game game = new Game(true);
		
		game.updateGame();
		
		assertFalse(game.entities.size() == 2);	
	}
	
	@Test
	public void updateGame_ReduceCoolDown_Test(){
		Game game = new Game(true);
		
		game.restartCooldown = 1; //these could be changed to getters and setters to keep variables private. 
		
		game.updateGame();
		
		assertTrue(game.restartCooldown == 0);
		
	}
	
	@Test
	public void updateGame_DeathCoolDown_Test(){
		Game game = new Game(true);
		
		game.deathCooldown = 1;
		
		game.updateGame();
		
		assertTrue(game.deathCooldown == 0);
		
	}
	
	@Test
	public void updateGame_PlayerFiringEnabled_True_Test(){
		Game game = new Game(true);
		
		game.deathCooldown = 1;
		
		game.updateGame();
		
		assertTrue(game.player.firingEnabled == true);
		
	}
	
	@Test
	public void updateGame_PlayerFiringEnabled_True_False(){
		Game game = new Game(true);
		
		game.deathCooldown = 101;
		
		game.updateGame();
		
		assertTrue(game.player.firingEnabled == false);
		
	}

}
