package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.AbstractService;
import io.gethub.cepr0.demo.dto.ClientDto;
import io.gethub.cepr0.demo.entity.Client;
import io.gethub.cepr0.demo.service.ClientService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController extends AbstractController<Client, ClientDto> {
    public ClientController(JpaRepository<Client, Long> repo, ClientService  service) {
        super(repo, service);
    }
}
