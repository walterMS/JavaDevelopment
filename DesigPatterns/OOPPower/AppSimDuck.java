/* Autor : Walter MS */
package com.animales;

import com.animales.patos.Duck;
import com.animales.patos.MallardDuck;
import com.animales.patos.Modelduck;
import com.animales.behaviors.FlyNoWay;
import com.animales.behaviors.FlyWithWings;
import com.animales.behaviors.MuteQuack;
import com.animales.behaviors.Quack;
import com.animales.behaviors.Squeak;
import com.animales.behaviors.FlyRocketPowered;

public class AppSimDuck {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.swim();
		System.out.println("\nCambiando comportamiento");
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new MuteQuack());
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\n\nMallard 2");
		Duck mallard2= new MallardDuck();
		//mallard2.metodoNoHeredado();
		mallard2.performQuack();
		mallard2.performFly();
		mallard2.display();
		mallard2.swim();

		System.out.println("\nCambiando comportamiento");
		mallard2.setFlyBehavior(new FlyNoWay());
		mallard2.setQuackBehavior(new Squeak());
		mallard2.performQuack();
		mallard2.performFly();

		mallard2.setFlyBehavior(new FlyWithWings());
		mallard2.setQuackBehavior(new MuteQuack());
		mallard2.performQuack();
		mallard2.performFly();

		System.out.println("\nCambiando comportamiento");
		Duck model = new Modelduck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setQuackBehavior(new MuteQuack());
		model.setFlyBehavior(new FlyNoWay());
		model.performFly();
		model.performQuack();
		System.out.println("\nCambiando comportamiento");
		model.setQuackBehavior(new Quack());
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();

	}
}