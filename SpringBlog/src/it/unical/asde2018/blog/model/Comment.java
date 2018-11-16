package it.unical.asde2018.blog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(optional=false)
	private User commenter;
	
	@Column(nullable=false)
	private Date creationDate;
	
	@Column(nullable=false)
	private String corpus;

	
	
	public Comment() {
		super();
	}

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
