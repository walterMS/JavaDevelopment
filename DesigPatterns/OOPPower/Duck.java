/* Autor : Walter MS */
package com.animales.patos;

import com.animales.behaviors.FlyBehavior;
import com.animales.behaviors.QuackBehavior;

public abstract class Duck{

		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;

		public void Duck(){}

		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}
		
		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}

		public abstract void display();

		public void performFly(){
			flyBehavior.fly();
		}

		public void performQuack(){
			quackBehavior.quack();
		}

		public void swim(){
			System.out.println("All ducks swim");
		}
}
