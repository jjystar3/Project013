package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 4);

		Stream<Integer> stream1 = list.stream();

		// distinct: 중복을 제거하는 연산자
		stream1.distinct().forEach(n -> System.out.print(n + " "));

		System.out.println();

		// filter: 조건에 맞는 결과를 추출
		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

		System.out.println();

		// limit(n): 요소를 n개만 추출
		list.stream().limit(3).forEach(n -> System.out.print(n + " "));

		System.out.println();

		// sorted: 요소를 순서대로 정렬하는 연산자
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));

		System.out.println();

		// 기본형 스트림: sum, max, min 같은 함수 사용 불가
		Stream<Integer> stream2 = list.stream();

		// 숫자타입 스트림: sum, max, min 같은 함수 사용 가능
		IntStream intStream = stream2.mapToInt(n -> n.intValue());

		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");

		// map: 다른 값으로 변경하는 연산자
		strList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));

		System.out.println();

		strList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));

		System.out.println();
		
		List<Book> list2 = new ArrayList<>();
		list2.add(new Book("자바프로그래밍", 10000));
		list2.add(new Book("스프링프로젝트", 20000));
		
		list2.stream().map(s -> s.title).forEach(s -> System.out.print(s + " "));
		list2.stream().forEach(s -> System.out.print(s.price + " "));
		
	}

}

class Book {

	String title;
	int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

}