package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.entity.User;
import io.gethub.cepr0.demo.repository.UserRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController<User> {
	public UserController(UserRepo repo) {
		super(repo);
	}
}
