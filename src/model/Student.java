package model;

import java.util.Scanner;

public class Student {

	protected int id;
	protected String name;
	protected int age;
	
	Scanner sc = new Scanner(System.in);
	
	public void Objective() {
		
		System.out.print("Enter ID: ");
		this.id = sc.nextInt();
		System.out.print("Enter Name: ");
		this.name = sc.next();
		System.out.print("Enter Age: ");
		this.age = sc.nextInt();
	}
	
	

}
