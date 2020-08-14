package io.gethub.cepr0.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 13/08/2020
 * @Time 18:38
 **/
@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class RDV  extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;

    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "service_demander",
            joinColumns = { @JoinColumn(name = "rdv_id") },
            inverseJoinColumns = { @JoinColumn(name = "service_id") }
    )
    Set<Service> services = new HashSet<>();
}
