package it.unical.asde2018.blog.components.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.blog.model.Comment;
import it.unical.asde2018.blog.model.Post;
import it.unical.asde2018.blog.model.User;

@Service
public class BlogService {

	@PostConstruct
	public void init() {
		posts = new ArrayList<>();
		User giovanni = new User("giovanni");
		posts.add(new Post("I love pizza", giovanni, new Date(), "I really like pizza"));
		User filippo = new User("filippo");
		Post filippoPost = new Post("I like playing football", filippo, new Date(),
				"I like to play football with friends");
		filippoPost.addComment(new Comment(giovanni, new Date(), "Me too!"));
		posts.add(filippoPost);
	}

	private List<Post> posts;

	public List<Post> getAllPosts() {
		return posts;
	}

}
