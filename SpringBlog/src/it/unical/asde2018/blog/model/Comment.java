package it.unical.asde2018.blog.model;

import java.util.Date;

public class Comment {

	private User commenter;
	private Date creationDate;
	private String corpus;

	public Comment(User commenter, Date creationDate, String corpus) {
		super();
		this.commenter = commenter;
		this.creationDate = creationDate;
		this.corpus = corpus;
	}

	public User getCommenter() {
		return commenter;
	}

	public void setCommenter(User commenter) {
		this.commenter = commenter;
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
