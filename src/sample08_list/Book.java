package sample08_list;

import java.util.Objects;

public class Book implements Comparable<Book>{

	private int no;
	private String title;
	private String writer;
	private int price;
	
	public Book(int no, String title, String writer, int price) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return no == other.no;
	}
	
	// 책번호를 기준으로 오름차순 정렬시킨다.
//	@Override
//	public int compareTo(Book other) {
//		return no - other.no;
//	}
	
	// 책제목을 기준으로 오름차순 정렬시킨다.
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
	
}






















