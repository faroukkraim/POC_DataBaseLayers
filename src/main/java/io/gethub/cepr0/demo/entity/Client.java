package io.gethub.cepr0.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 12/08/2020
 * @Time 19:09
 **/
@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class Client extends Person {
    private String matricule;
    private String role;
    @OneToMany(mappedBy = "client")
    private Set<RDV> rdvList;

}
