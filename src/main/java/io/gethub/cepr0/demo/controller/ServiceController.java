package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.entity.Service;
import io.gethub.cepr0.demo.repository.ServiceRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController extends AbstractController<Service> {
    public ServiceController(ServiceRepo repo) {
        super(repo);
    }
}
