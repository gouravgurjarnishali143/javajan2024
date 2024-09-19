package com.gg.opps;

public class BookClient {

	public static void main(String[] args) {

		Book book = new Book();

		book.setId(1);
		book.setAuthor("APJ ABDUL KALAM");
		book.setBook("wings of fire");
		book.setPrice(250);
		book.setName(null);

		System.out.println(book.getId()+ " " + book.getAuthor() + " " + book.getBook() + " " + book.getPrice());

	}

}
