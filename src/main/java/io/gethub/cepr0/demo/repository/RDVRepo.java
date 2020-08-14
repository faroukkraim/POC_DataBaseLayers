package io.gethub.cepr0.demo.repository;

import io.gethub.cepr0.demo.entity.Client;
import io.gethub.cepr0.demo.entity.RDV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RDVRepo extends JpaRepository<RDV, Long> {
}
