package it.unical.asde2018.blog.components.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.unical.asde2018.blog.model.Comment;
import it.unical.asde2018.blog.model.Post;
import it.unical.asde2018.blog.model.User;

@Repository
public class BlogDAO {
	
	@PostConstruct
	public void init() {
		List<Post> posts = new ArrayList<>();
		User giovanni = new User("giovanni");
		posts.add(new Post("I love pizza", giovanni, new Date(), "I really like pizza"));
		User filippo = new User("filippo");
		Post filippoPost = new Post("I like playing football", filippo, new Date(),
				"I like to play football with friends");
		filippoPost.addComment(new Comment(giovanni, new Date(), "Me too!"));
		filippoPost.addComment(new Comment(filippo, new Date(), "Definitely!"));
		posts.add(filippoPost);
		
		
		for(Post post: posts) {
			save(post);
		}
		
	}

	@Autowired
	private DBManager dbManager;

	@Autowired
	private SessionFactory sessionFactory;

	public void save(Post post) {
		dbManager.save(post);
	}

	public List<Post> getAllPosts() {
		Session session = sessionFactory.openSession();
		//Lazy loading issue:
		//To initialize a list of a relation use on of the following
		// - JOIN FETCH,
		// - Hibernate.initialize(list)
		// - call any list method		
		Query<Post> select = session.createQuery("FROM Post as p JOIN FETCH p.comments", Post.class);
		List<Post> list = select.list();
		
		session.close(); 
		return list;

	}

}
