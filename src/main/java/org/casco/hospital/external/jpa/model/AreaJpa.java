package org.casco.hospital.external.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "area_ht2")
public class AreaJpa {
    @Id
    @Column(name = "id_area")
    private Integer id;
    @Column(name = "tx_nombre")
    private String nombre;
}
