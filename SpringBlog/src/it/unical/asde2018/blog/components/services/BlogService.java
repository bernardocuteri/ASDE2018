package it.unical.asde2018.blog.components.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unical.asde2018.blog.components.persistence.BlogDAO;
import it.unical.asde2018.blog.model.Post;

@Service
public class BlogService {


	@Autowired
	private BlogDAO blogDAO;

	public List<Post> getAllPosts() {
		return blogDAO.getAllPosts();
	}

}
