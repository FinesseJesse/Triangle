/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triangle;

/**
 *
 * @author jswai
 */
// start New class
public class NewClass 
		extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** make default Triangle object */
	NewClass() {
		side1 = side2 = side3 = 1.0;
	}

	/** make a triangle with specified side1, side2 and side3 */
	NewClass(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** return side1 */
	public double getSide1() {
		return side1;
	}

	/** return side2 */
	public double getSide2() {
		return side2;
	}

	/** return side3 */
	public double getSide3() {
		return side3;
	}

	/** return area of this triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** return a string description for the triangle */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}