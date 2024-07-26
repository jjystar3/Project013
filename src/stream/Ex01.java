package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {

		// 리스트로부터 스트림 생성
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream1 = list.stream();

		// 객체 배열로부터 스트림 생성
		String[] strArr = { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);

		// 기초 배열로부터 기본형 스트림 생성
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream stream4 = Arrays.stream(intArr);

	}

}
