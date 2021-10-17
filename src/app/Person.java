package app;

public class Person implements PersonInterface, Comparable<Person>{
private String firstName = "Mark";
private String lastName = "Reha";
private Boolean running;
private Integer age;
/**
 * constructor to create a new person
 * @param firstName persons first name	
 * @param lastName persons last name
 */
public Person(String firstName, String lastName, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}
/**
 * constructor which copies a person
 * @param person the person being inherited 
 */
public Person (Person person) {
	this.firstName = person.getFirstName();
	this.lastName = person.getLastName();
	this.age = person.getAge();
}
/**
 * gets the age of each player
 * @return the age
 */
public Integer getAge() {
	return age;
}
/**
 * getter for firstName
 * @return firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * getter for lastName
 * @return lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * compares age returns value
 */
public int compareTo(Person p) {
	int value = this.age.compareTo(p.age);
			if(value == 0) {
				return this.age.compareTo(p.age);
			}
			else {
				return value;
			}
}
/**
 * sets running to false
 */
public void walk() {
	System.out.println("I am walking");
	running = false;
}
/**
 *  sets running to true
 */
public void run() {
	System.out.println("I am running" );
	running = true;
}
/**
 * returns if its Running
 */
public boolean isRunning() {
	return running;
}
@Override
/**
 * overriding the equals method to suit specific applications
 */
public boolean equals(Object other) {
	if(other == this) {
		System.out.println("I am here in other == this");
		return true;
	}
	if(other == null) {
		System.out.println("I am here in getClass() != other.getClass()");
		return false;
	}
	Person person = (Person)other;
	return (this.firstName == person.firstName && this.lastName == person.lastName);
}
@Override
/**
 * overriding the toStiring method to get more information
 */
public String toString() {
	return "My class is " + getClass()  + " " + this.firstName + " " + this.lastName;
}
}
