package Serialization_Deserialization;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Stream_API {
	public static void main(String[] args) {
	
		/*
		int a[] = new int[] {1,2,3,4};
		for(int i:a){
			System.out.println(i);
		}
		*/
		/*
		int a[] = new int[] {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		stream.forEach(a->System.out.println(a));
		
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4});
		stream1.forEach(a->System.out.println(a));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(a->System.out.println(a));
		
		
		Stream<Integer> randomNumber = Stream.generate(()->(new Random()).nextInt(100));
		randomNumber.limit(5).forEach(a->System.out.println(a));
}
}
