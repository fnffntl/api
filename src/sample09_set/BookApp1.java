package sample09_set;

import java.util.HashSet;

import sample08_list.Book;

public class BookApp1 {
	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<>();
		
		// 동일한 책번호를 가진 책벙보는 같은 객체로 보고 저장되지 않게 하자.
		// Book클래스에서 hash()와 equlas()메소드를 재정의한다.
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));

		// HashSet객체에 저장된 책정보 출력하기
		for (Book book : books) {
			System.out.println(book.hashCode());
			System.out.println("번호: " + book.getNo());
			System.out.println("제목: " + book.getTitle());
			System.out.println("저자: " + book.getWriter());
			System.out.println("가격: " + book.getPrice());
			System.out.println();
		}
		
	}
}
