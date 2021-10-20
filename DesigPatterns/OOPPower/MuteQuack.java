/* Autor : Walter MS */
package com.animales.behaviors;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}