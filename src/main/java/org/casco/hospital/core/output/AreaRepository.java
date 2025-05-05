package org.casco.hospital.core.output;

import org.casco.hospital.core.entity.Area;

import java.util.Optional;

public interface AreaRepository {
    Optional<Area> findAreaById(Integer id);
}
