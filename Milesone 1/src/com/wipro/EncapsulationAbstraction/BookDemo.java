package com.wipro.EncapsulationAbstraction;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Author a = new Author("Harper Lee","harperlee24@gmail.com",'F');
			Book b = new Book("To Kill A Mockingbird");
			b.setAuthor(a);
			b.setPrice(91.09);
			b.setQtyInStock(200);
			System.out.println("the name of a book: "+b.getName());
			System.out.println("price of a book: "+b.getPrice());
			System.out.println("number of books in stock are: "+b.getQtyInStock());
			System.out.println("author name: "+b.getAuthor().getName());
			System.out.println("mail id: "+b.getAuthor().getEmail());
			System.out.println("gender: "+b.getAuthor().getGender());


	}

}
