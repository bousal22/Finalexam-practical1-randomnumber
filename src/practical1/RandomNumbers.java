package practical1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Set<Integer> mySet = new TreeSet<>();

		System.out.println(ThreadLocalRandom.current().nextInt());

		while (mySet.size() < 500) {
			mySet.add(Math.abs(ThreadLocalRandom.current().nextInt()));
		}
		System.out.println(mySet);
		System.out.println(mySet.size());
		Object[] mySetArray = mySet.toArray();		
		
		System.out.println("give me the smallest number");
		int number = scanner.nextInt();
		int result = smallestNumber(mySet, number - 1);
		System.out.println("the "+ number +" smallest number is:" + result);
		scanner.close();
	}

	public static int smallestNumber(Set myset, int mynum) {
		Object[] myarray = myset.toArray();
		int mysmallest = (int) myarray[mynum];

		return mysmallest;
	}
}