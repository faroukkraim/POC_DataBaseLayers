package io.gethub.cepr0.demo.controller;

import io.gethub.cepr0.demo.AbstractController;
import io.gethub.cepr0.demo.AbstractService;
import io.gethub.cepr0.demo.dto.PersonnelDto;
import io.gethub.cepr0.demo.entity.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/personnel")
//public class PersonnelController extends AbstractController<Personnel, PersonnelDto> {
//    public PersonnelController(JpaRepository<Personnel, Long> repo, AbstractService<Personnel, PersonnelDto> service) {
//        super(repo, service);
//    }
//}
