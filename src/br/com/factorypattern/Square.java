package br.com.factorypattern;

import br.com.abstractfactorypattern.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}

}
