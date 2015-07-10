package com.pgaa.redhair.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameStateManager {
	public static final int TEST = 1, MENU = 0, CREDITS = -1;
	
	private State state;
	private int currentState;
		
	public GameStateManager(int currentState){
		this.currentState = currentState;
		
	}
	public void update(float delta,OrthographicCamera camera){
		state.update(delta,camera);
	}
	public void draw(SpriteBatch batch,OrthographicCamera camera){
		state.draw(batch,camera);
	}
	
	
}
