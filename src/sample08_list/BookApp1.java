package sample08_list;

import java.util.ArrayList;
import java.util.List;

public class BookApp1 {
	public static void main(String[] args) {
		// 책정보를 여러 개 저장할 수 있는 List객체 생성하기
		List<Book> books = new ArrayList<>();

		// List객체에 Book객체 저장하기
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));

		// List객체에 저장된 책정보 출력하기
		for (Book book : books) {
			System.out.println("번호: " + book.getNo());
			System.out.println("제목: " + book.getTitle());
			System.out.println("저자: " + book.getWriter());
			System.out.println("가격: " + book.getPrice());
			System.out.println();
		}
	}
}
