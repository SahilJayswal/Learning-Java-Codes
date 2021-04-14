package Phase1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		System.out.println("***********Arithmetic Calculator*************");
		
		System.out.println("Select from below option to perform operation: " 
							+ "\n1-> Addition" + "\n2-> Subtraction" 
							+ "\n3-> Multiplication" + "\n4-> Division");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i) {
		case 1:
			System.out.print("Enter how many number you want to add: ");
			int a = sc.nextInt();
			double[] arr = new double[a];
			for(int num=0; num<arr.length; num++) {
				arr[num] = sc.nextInt();
			}
			add(arr);
			break;
			
		case 2:
			System.out.print("Enter how many number you want to subtract: ");
			int b = sc.nextInt();
			double[] arr1 = new double[b];
			for(int num=0; num<arr1.length; num++) {
				arr1[num] = sc.nextInt();
			}
			sub(arr1);
			break;
			
		case 3:
			System.out.print("Enter how many number you want to multiply: ");
			int c = sc.nextInt();
			double[] arr2 = new double[c];
			for(int num=0; num<arr2.length; num++) {
				arr2[num] = sc.nextInt();
			}
			mul(arr2);
			break;
			
		case 4:
			System.out.print("Enter how many number you want to divide: ");
			int d = sc.nextInt();
			double[] arr3 = new double[d];
			for(int num=0; num<arr3.length; num++) {
				arr3[num] = sc.nextInt();
			}
			div(arr3);
			break;
		}
		
		
		sc.close();
	}

	//Addition method
	static double add(double ...arr) {
		double sum = 0;
		for(double i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		return sum;
		
	}
	
	//Subtraction method
	static double sub(double ...arr) {
		double sub=arr[0];
		for(int i=1; i<arr.length;i++) {
			sub=sub-arr[i];
		}
		System.out.println(sub);
		return sub;
		
	}
	
	//Multiplication method
	static double mul(double ...arr) {
		int mul = 1;
		for(double i:arr) {
			mul*=i;
		}
		System.out.println(mul);
		return mul;
		
	}
	
	//Division method
	static double div(double ...arr) {
			double div=arr[0];
		for(int i=1; i<arr.length;i++) {
			 div = div/arr[i];
		}
			System.out.println(div);
		
		return div;
	}

}

