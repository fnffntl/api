package sample09_set;

import java.util.TreeSet;

public class TreeSetApp1 {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안중근");
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
