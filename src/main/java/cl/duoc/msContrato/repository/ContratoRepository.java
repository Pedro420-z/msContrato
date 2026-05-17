package cl.duoc.msContrato.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msContrato.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

    Optional<Contrato> findByNumContrato(String numeroContrato);


}

