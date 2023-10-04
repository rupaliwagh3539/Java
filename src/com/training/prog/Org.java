package com.training.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Org {
	

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(101, "Eshan", 10000);
		/*
		 * System.out.println(e1); System.out.println(e2);
		 */
		
		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Eshan", 10000));
		empList.add(new Employee(102, "Rupali", 50000));
		empList.add(new Employee(103, "Mrunali", 70000));
		empList.add(new Employee(104, "Ashish", 10000));

		/*
		 * for (Employee employee : empList) { System.out.println(employee);
		 */

		empList.stream().forEach(list -> System.out.println(list));

		// removed record at 0 th index
		empList.remove(0);
		System.out.println("\n" + "List after deleting record");
		empList.stream().forEach(list -> System.out.println(list));

		// updated salary in employee list
		System.out.println("\n" + "List after updating salary record");
		empList.get(1).setSalary(9500);
		empList.stream().forEach(list -> System.out.println(list));

		// updating salary

		Scanner sc = new Scanner(System.in);
		int incrementPer = sc.nextInt();
		System.out.println("enter the percentage to incement" + incrementPer);
		System.out.println("\n" + "List after adding salary by  incrementPer %  ");

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getSalary() < 10000) {

				double sal = empList.get(i).getSalary();

				empList.get(i).setSalary(sal * incrementPer / 100 + sal);
			}
		}
		empList.stream().forEach(list -> System.out.println(list));

	}
	
}
