package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz04 {

	public static void main(String[] args) {

		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		System.out.println("== 고객 명단 ==");
		list.stream().forEach(s -> System.out.println(s.name));
		
		System.out.println("총 여행 비용: " + list.stream().map(s -> s.budget).reduce(0, (total, s) -> total + s));

		System.out.println("== 20세 이상 고객 명단 ==");
		list.stream().filter(s -> s.age > 20).map(s -> s.name + ", " + s.age).sorted().forEach(s -> System.out.println(s));

	}

}

class Customer {
	String name;
	int age;
	int budget;
	
	public Customer(String name, int age, int budget) {
		this.name = name;
		this.age = age;
		this.budget = budget;
	}
}