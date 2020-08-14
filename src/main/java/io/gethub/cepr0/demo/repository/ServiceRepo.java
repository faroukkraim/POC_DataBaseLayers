package io.gethub.cepr0.demo.repository;

import io.gethub.cepr0.demo.entity.Client;
import io.gethub.cepr0.demo.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Service, Long> {
}
