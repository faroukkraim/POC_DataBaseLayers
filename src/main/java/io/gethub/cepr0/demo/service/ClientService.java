package io.gethub.cepr0.demo.service;

import io.gethub.cepr0.demo.AbstractService;
import io.gethub.cepr0.demo.dto.ClientDto;
import io.gethub.cepr0.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 05/09/2020
 * @Time 23:41
 **/
@Service
public class ClientService extends AbstractService<Client, ClientDto> {
    public ClientService(JpaRepository<Client, Long> repo) {
        super(repo,ClientDto.class);
    }
}
