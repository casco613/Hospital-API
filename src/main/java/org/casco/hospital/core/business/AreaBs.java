package org.casco.hospital.core.business;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casco.hospital.core.entity.Area;
import org.casco.hospital.core.input.AreaService;
import org.casco.hospital.core.output.AreaRepository;

@ApplicationScoped
public class AreaBs implements AreaService {

    @Inject
    public AreaBs(AreaRepository areaRepository){
        this.areaRepository = areaRepository;
    }

    AreaRepository areaRepository;

    @Override
    public Area getAreaById(Integer id) {
        return areaRepository.findAreaById(id).orElse(null);
    }
}