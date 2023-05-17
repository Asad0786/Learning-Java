package list_collection;

public class Employee {
	private int age;
	private long phone;
	private String name, city;

	Employee(String name, String city, int age, long phone) {
		this.name = name;
		this.city = city;
		this.age = age;
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public long getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}


}
