package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));

		list.stream().forEach(s -> System.out.print(s.orderNo + " "));

		System.out.println();

		int sum1 = list.stream().filter(s -> s.year == 2022).mapToInt(s -> s.price).sum();
		long count1 = list.stream().filter(s -> s.year == 2022).count();

		System.out.println("총금액:" + sum1 + ", 거래건수:" + count1);

		int sum2 = list.stream().filter(s -> s.year == 2023).mapToInt(s -> s.price).sum();
		long count2 = list.stream().filter(s -> s.year == 2023).count();

		System.out.println("총금액:" + sum2 + ", 거래건수:" + count2);
		
	}

}

class Order {
	int orderNo;
	int year;
	int price;

	public Order(int orderNo, int year, int price) {
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

}