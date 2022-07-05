package practical1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

	public static void main(String[] args) {
		
		 Scanner scannerObject = new Scanner(System.in);

		
		Set<Integer> mySet = new TreeSet<>();

		System.out.println(ThreadLocalRandom.current().nextInt());
		mySet.add(ThreadLocalRandom.current().nextInt());
		
		while (mySet.size() != 500) {
			mySet.add(ThreadLocalRandom.current().nextInt());

		}
		System.out.println(mySet);
		System.out.println(mySet.size());
		Object[] mySetArray = mySet.toArray();
		System.out.println(mySetArray[0]);
		System.out.println(mySetArray[3]);
		
		System.out.println("Give me the smallest number of the array");
		
		

	}
}