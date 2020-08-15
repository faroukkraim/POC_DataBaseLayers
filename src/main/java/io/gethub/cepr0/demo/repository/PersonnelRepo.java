package io.gethub.cepr0.demo.repository;

import io.gethub.cepr0.demo.entity.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepo extends JpaRepository<Personnel, Long> {
}
