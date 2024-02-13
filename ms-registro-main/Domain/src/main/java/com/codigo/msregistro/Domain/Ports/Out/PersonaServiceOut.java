package com.codigo.msregistro.Domain.Ports.Out;

import com.codigo.msregistro.Domain.Aggregates.Dto.PersonaDto;
import com.codigo.msregistro.Domain.Aggregates.Request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDto crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDto> obtenerPersonaOut(Long id);
    List<PersonaDto> obtenerTodosOut();
    PersonaDto actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDto deleteOut(Long id);
}
