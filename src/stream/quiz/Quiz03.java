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

		int priceSum = 0;
		int orderSum = 0;
		
		priceSum = list.stream().filter(s -> s.year == 2022).map(s -> s.price).reduce(0, (total, s) -> total + s);
		orderSum = (int) list.stream().filter(s -> s.year == 2022).count();

		System.out.println("총금액:" + priceSum + ", 거래건수:" + orderSum);

		priceSum = list.stream().filter(s -> s.year == 2023).map(s -> s.price).reduce(0, (total, s) -> total + s);
		orderSum = (int) list.stream().filter(s -> s.year == 2023).count();

		System.out.println("총금액:" + priceSum + ", 거래건수:" + orderSum);
		
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