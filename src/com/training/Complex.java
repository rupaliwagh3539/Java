package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Complex {

	private int real;
	private int imag;

	public Complex() {

		System.out.println("default constructor");

	}

	public Complex(int real, int imag) {

		System.out.println("parameterized constructor");

		this.real = real;
		this.imag = imag;

	}

	public String toString() {
		return "real=" + real + ", imag=" + imag;
	}

	private void showComplexValue() {

		System.out.println(real + " " + imag);

	}

	public void acceptComplexValues() {

		/*
		 * BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Enter the values of real"); this.real =
		 * Integer.parseInt(input.readLine());
		 * 
		 * System.out.println("Enter the values of imag"); this.imag =
		 * Integer.parseInt(input.readLine());
		 */

		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("enter the value of real"); this.real = input.nextInt();
		 * 
		 * System.out.println("enter the value of imag"); this.imag = input.nextInt();
		 * Complex c1 = new Complex();
		 */

		this.real = Integer.parseInt(JOptionPane.showInputDialog("enter first value"));
		this.imag = Integer.parseInt(JOptionPane.showInputDialog("enter second value"));
		try {
			JOptionPane.showMessageDialog(null, "values are" + this.real + " and " + this.imag);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		Complex c1 = new Complex();
		c1.acceptComplexValues();
		c1.showComplexValue();

	}

}
