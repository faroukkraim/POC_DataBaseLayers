package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.entity.Client;
import io.gethub.cepr0.demo.repository.ClientRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController extends AbstractController<Client> {
    public ClientController(ClientRepo repo) {
        super(repo);
    }
}
