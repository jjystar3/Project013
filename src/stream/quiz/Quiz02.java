package stream.quiz;

import java.util.Arrays;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {

		// str.endsWith(".txt")
		// str.indexOf("\\.")
		// str.substring(2, 4)

		List<String> list = Arrays.asList("file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img");

//		Stream<String> stream1 = list.stream();
		list.stream().filter(s -> s.endsWith(".txt")).forEach(s -> System.out.print(s + " "));

		System.out.println();

		System.out.println("txt파일의 개수: " + list.stream().filter(s -> s.endsWith(".txt")).count());
		System.out.println("pdf파일의 개수: " + list.stream().filter(s -> s.endsWith(".pdf")).count());
		System.out.println("img파일의 개수: " + list.stream().filter(s -> s.endsWith(".img")).count());

		list.stream().map(s -> {String[] strArr = s.split("\\."); return strArr[1];}).distinct().forEach(s -> System.out.print(s + " "));
//		list.stream().map(s -> s.split("\\.")).map(s -> s[1]).distinct().forEach(s -> System.out.print(s + " "));
//		list.stream().map(s -> s.substring(s.indexOf('.')+1, s.length())).distinct().forEach(s -> System.out.print(s + " "));
		
	}

}
