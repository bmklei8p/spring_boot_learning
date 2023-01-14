package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("going on up");
	}
	
	public void down() {
		System.out.println("going on down");
	}
	
	public void left() {
		System.out.println("eat that thing");
	}
	
	public void right() {
		System.out.println("going to go right to find food");
	}
}
