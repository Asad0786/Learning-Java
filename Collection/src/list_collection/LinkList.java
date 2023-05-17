package list_collection;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		Employee Asad = new Employee("Asad", "Bangalore", 22, 9149696744l);
		Employee AsAd = new Employee("Asad", "Bangalore", 21, 9055079417l);
		Employee Raiz = new Employee("Raiz", "Bangalore", 22, 9682157476l);
		LinkedList<Employee> e = new LinkedList<>();
		e.addFirst(Asad);
		e.add(AsAd);
		e.addFirst(Raiz);
		
		//collection of objects
		//System.out.println(e);
		
		//travesrsing therough ech object and its method
		for(Employee de : e) {
			System.out.print(de.getName());
			System.out.print(" "+de.getAge());
			System.out.print(" "+ de.getPhone()+"\n");
		}
		
	}
}
