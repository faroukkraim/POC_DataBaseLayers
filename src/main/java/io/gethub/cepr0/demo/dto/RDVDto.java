package io.gethub.cepr0.demo.dto;

import java.util.Date;
import java.util.Set;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 06/09/2020
 * @Time 10:18
 **/
public class RDVDto {
    private Long id;
    private Date dateRDV;

    private ClientDto client;
    Set<ServiceDto> services;
}
