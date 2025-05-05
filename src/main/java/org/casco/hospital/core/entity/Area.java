package org.casco.hospital.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Area {
    private Integer id;
    private String nombre;
}
