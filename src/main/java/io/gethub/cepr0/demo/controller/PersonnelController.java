package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.entity.Personnel;
import io.gethub.cepr0.demo.repository.PersonnelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personnel")
public class PersonnelController extends AbstractController<Personnel> {
    public PersonnelController(PersonnelRepo repo) {
        super(repo);
    }
}
