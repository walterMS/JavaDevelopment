/* Autor : Walter MS */
package com.animales.patos;

import com.animales.behaviors.FlyWithWings;
import com.animales.behaviors.Squeak;

public class Modelduck extends Duck{

	public Modelduck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}

	public void display(){
		System.out.println("Soy un Modeldcuk");
	}
}