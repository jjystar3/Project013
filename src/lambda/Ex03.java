package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("aaa");
		list.add("ccc");
		list.add("bbb");

		// Collections.sort(): 리스트의 요소를 순서대로 정렬하는 메소드
		Collections.sort(list, new Comparator<String>() {

			// 더 작은 알파벳이 앞으로 오는 로직
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});

		System.out.println("리스트 순정렬: " + list);

		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
		System.out.println("리스트 역정렬: " + list);

	}

}
