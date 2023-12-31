package net.codejava.hibernateForeign;

import javax.persistence.*;

@Entity
@Table(name = "AUTHOR")
public class Author {

	@Id
	@Column(name = "AUTHOR_ID")
	@GeneratedValue
	private long id;
	private String name;
	private String email;

//	private Book book;
//
//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}

	public Author() {
	}
	
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
