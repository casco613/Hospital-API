package org.casco.hospital.external.jpa.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casco.hospital.core.entity.Area;
import org.casco.hospital.core.output.AreaRepository;
import org.casco.hospital.external.jpa.repositories.AreaJpaRepository;

import java.util.Optional;

@ApplicationScoped
public class AreaDao implements AreaRepository {

    @Inject
    AreaJpaRepository areaJpaRepository;

    public AreaDao(AreaJpaRepository areaJpaRepository) {
        this.areaJpaRepository = areaJpaRepository;
    }

    @Override
    public Optional<Area> findAreaById(Integer id) {
        return null;
    }
}