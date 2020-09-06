//package io.gethub.cepr0.demo.controller;
//
//import io.gethub.cepr0.demo.AbstractController;
//import io.gethub.cepr0.demo.AbstractService;
//import io.gethub.cepr0.demo.dto.RDVDto;
//import io.gethub.cepr0.demo.entity.RDV;
//import io.gethub.cepr0.demo.repository.RDVRepo;
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/rdv")
//public class RDVController extends AbstractController<RDV, RDVDto> {
//    public RDVController(JpaRepository<RDV, Long> repo, AbstractService<RDV, RDVDto> service) {
//        super(repo, service);
//    }
//}
