package it.unical.asde2018.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column(nullable=false)
	private String title;
	
	@ManyToOne
	private User poster;
	
	@Column
	private Date creationDate;
	
	@Column
	private String corpus;
	
	@OneToMany
	private List<Comment> comments;
	
	

	public Post() {
		super();
	}

	public Post(String title, User poster, Date creationDate, String corpus) {
		super();
		this.title = title;
		this.poster = poster;
		this.creationDate = creationDate;
		this.corpus = corpus;
		comments = new ArrayList<>();
	}
	
	public void addComment(Comment c) {
		comments.add(c);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getPoster() {
		return poster;
	}

	public void setPoster(User poster) {
		this.poster = poster;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCorpus() {
		return corpus;
	}

	public void setCorpus(String corpus) {
		this.corpus = corpus;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	

}
