package it.unical.asde2018.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private String title;
	private User poster;
	private Date creationDate;
	private String corpus;
	private List<Comment> comments;

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

}
