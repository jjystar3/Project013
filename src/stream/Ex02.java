package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {

		// 스트림의 특징 3가지

		// 1.한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream();

		// forEach: 반복적인 작업을 수행하는 연산자
		stream.forEach(t -> System.out.println(t));
//		long count = stream.count();

		// 2.스트림 연산은 원본데이터를 변경하지 않는다
		Stream<Integer> stream2 = list.stream();

		// sorted: 요소들을 정렬하는 연산자
		// collect: 스트림을 list로 변환하는 연산자
		List<Integer> sortedList = stream2.sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);

		// 3.중간연산은 여러번 할 수 있고, 최종연산은 마지막에 한번만 할 수 있다
		Stream<Integer> stream3 = list.stream();

		// filter: 조건을 만족하는 요소만 추출하는 연산자
		stream3.filter(t -> t >= 3).sorted().forEach(t -> System.out.println(t));

		// 중간연산자는 계속해서 스트림을 반환, 이어서 작업을 계속할 수 있음
		Stream<Integer> stream4 = list.stream();
		Stream<Integer> stream5 = stream4.filter(t -> t>=3);
		Stream<Integer> stream6 = stream5.sorted();
		
	}

}
