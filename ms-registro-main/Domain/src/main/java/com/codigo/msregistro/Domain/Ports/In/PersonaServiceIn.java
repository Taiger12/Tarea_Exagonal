package com.codigo.msregistro.Domain.Ports.In;

import com.codigo.msregistro.Domain.Aggregates.Dto.PersonaDto;
import com.codigo.msregistro.Domain.Aggregates.Request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {

    PersonaDto crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDto> obtenerPersonaIn(Long id);
    List<PersonaDto> obtenerTodosIn();
    PersonaDto actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDto deleteIn(Long id);


}
