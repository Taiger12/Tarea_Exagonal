package com.codigo.msregistro.Infraestructure.Mapper;

import com.codigo.msregistro.Domain.Aggregates.Dto.PersonaDto;
import com.codigo.msregistro.Domain.Ports.Out.PersonaServiceOut;
import com.codigo.msregistro.Infraestructure.Entity.PersonaEntity;
import org.modelmapper.ModelMapper;

public class PersonaMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public PersonaDto maptoDto(PersonaEntity entity){
        return modelMapper.map(entity, PersonaDto.class);


    }

    public PersonaEntity mapToEntity(PersonaDto personaDto){

        return modelMapper.map(personaDto, PersonaEntity.class);
    }



}
