package net.codejava.hibernateForeign;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {
	
	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue
	private long id;
	
	private String title;
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name= "PUBLISHED")
	private Date publishedDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTHOR_ID")
	private Author author;

	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
