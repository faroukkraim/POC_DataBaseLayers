package io.gethub.cepr0.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 13/08/2020
 * @Time 18:44
 **/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service extends Auditable implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(length = 1000)
    private String description;
    @ManyToMany(mappedBy = "services")
    private Set<RDV> rdvs = new HashSet<>();
}
