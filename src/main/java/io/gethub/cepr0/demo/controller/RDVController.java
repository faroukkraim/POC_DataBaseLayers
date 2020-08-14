package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.entity.RDV;
import io.gethub.cepr0.demo.repository.RDVRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rdv")
public class RDVController extends AbstractController<RDV> {
    public RDVController(RDVRepo repo) {
        super(repo);
    }
}
