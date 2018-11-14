package it.unical.asde2018.blog.components.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unical.asde2018.blog.components.persistence.CredentialsDAO;
import it.unical.asde2018.blog.model.Credentials;

@Service
public class LoginService {

	@Autowired
	private CredentialsDAO credentialsDAO;

	public boolean login(String username, String password) {
		
		return credentialsDAO.exists(new Credentials(username, password));
	}

}
