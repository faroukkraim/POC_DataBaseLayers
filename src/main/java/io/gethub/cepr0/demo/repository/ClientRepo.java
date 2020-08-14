package io.gethub.cepr0.demo.repository;

import io.gethub.cepr0.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
