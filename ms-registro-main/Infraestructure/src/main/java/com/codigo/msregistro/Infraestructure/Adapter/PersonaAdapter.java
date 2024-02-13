package com.codigo.msregistro.Infraestructure.Adapter;

import com.codigo.msregistro.Domain.Aggregates.Dto.PersonaDto;
import com.codigo.msregistro.Domain.Aggregates.Request.RequestPersona;
import com.codigo.msregistro.Domain.Aggregates.Response.ResponseReniec;
import com.codigo.msregistro.Domain.Ports.Out.PersonaServiceOut;
import com.codigo.msregistro.Infraestructure.Mapper.PersonaMapper;
import com.codigo.msregistro.Infraestructure.Repository.PersonaRepository;
import com.codigo.msregistro.Infraestructure.Repository.TipoDocumentoRepository;
import com.codigo.msregistro.Infraestructure.Rest.Client.ClienteReniec;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaAdapter implements PersonaServiceOut {

    private final PersonaRepository personaRepository;
    private final TipoDocumentoRepository tipoDocumentoRepository;
    private final PersonaMapper personaMapper;
    private final ClienteReniec reniec;

    @Override
    public PersonaDto crearPersonaOut(RequestPersona requestPersona) {
        ResponseReniec datosReniec = getExecutionReniec(requestPersona.getNumDoc());
        personaRepository.save(getEntity(datosReniec, requestPersona));
        return personaMapper.maptoDto(getEntity(datosReniec,requestPersona));


    }

    @Override
    public Optional<PersonaDto> obtenerPersonaOut(Long id) {
        return Optional.ofNullable(personaMapper.maptoDto(personaRepository.findById(id).get()));

    }

    @Override
    public List<PersonaDto> obtenerTodosOut() {



        return null;
    }

    @Override
    public PersonaDto actualizarOut(Long id, RequestPersona requestPersona) {
        return null;
    }

    @Override
    public PersonaDto deleteOut(Long id) {
        return null;
    }


}
