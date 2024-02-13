package com.codigo.msregistro.Infraestructure.Repository;

import com.codigo.msregistro.Infraestructure.Entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
