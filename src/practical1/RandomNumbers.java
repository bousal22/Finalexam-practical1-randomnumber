package practical1;


import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

	public static void main(String[] args) {
		
		 

		
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
		
	
		
		

	}
}