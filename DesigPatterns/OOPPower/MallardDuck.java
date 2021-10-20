/* Autor : Walter MS */
package com.animales.patos;

import com.animales.behaviors.FlyWithWings;
import com.animales.behaviors.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

	public void metodoNoHeredado(){
		System.out.println("Metodo no heredado dentro de MallarDuck");
	}
}