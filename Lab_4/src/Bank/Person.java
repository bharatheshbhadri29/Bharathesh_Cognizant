package Bank;

	/**
	 * This Person Class will be used to provide details of bank customers
	 * 
	 * @author BHARATHESH
	 */
public class Person {
	
	/**
	 * Name of the Person
	 */
	static String name;
	
	/**
	 * Age of the Person
	 */
	float age;
	
	public static String getName() {
		return name;
	}
	
	public void setName(String name) {
		Person.name = name;
	}
	
	public float getAge() {
		return age;
	}
	
	public void setAge(float age) {
		this.age = age;
	}

}
