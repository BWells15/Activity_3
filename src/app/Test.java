package app;

import java.util.Arrays;

/**
 * 
 * @author blake wells
 *
 */
public class Test {
/**
 * the main method
 * @param args
 */
	public static void main(String[] args
			
			
			) {
		// TODO Auto-generated method stub
Person person1 = new Person("Justine" , "Reha", 30);
Person person2 = new Person("Brianna" , "Reha",25);
Person person3 = new Person(person1);

if(person1 == person2) {
	System.out.println("These persons are identical using ==");
	}
else {
	System.out.println("These persons are not identical using ==");
}
if(person1.equals(person2)) {
	System.out.println("These persons are identical using equals()");
	}
else {
	System.out.println("These persons are not identical using equals()");
}
if(person1.equals(person3)) {
	System.out.println("These copied persons are identical using equals()");
	}
else {
	System.out.println("These copied persons are not identical using equals()");
}
System.out.println(person1);
System.out.println(person2.toString());
System.out.println(person3);

person1.walk();
person1.run();
System.out.println("Person1 is running: " + person1.isRunning());
person1.walk();
System.out.println("Person 1 is running: " + person1.isRunning());

Person[] persons = new Person[4];
persons[0] = new Person("Blake", "Wells", 21);
persons[1] = new Person("Shyla", "Wells", 61);
persons[2] = new Person("Steve", "Wells", 59);
persons[3] = new Person("Stephanie", "Wells", 32);
Arrays.sort(persons);
for(int x = 0 ; x < 4; ++x) {
	System.out.println(persons[x]);
}
	}
}
