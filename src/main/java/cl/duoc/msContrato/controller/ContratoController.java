package cl.duoc.msContrato.controller

import cl.duoc.msContrato.model.Contrato;
import cl.duoc.msContrato.service.ContratoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import cl.duoc.msContrato.dto.ContratoDTO;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @GetMapping
    public ResponseEntity<List<Contrato>> listar() {
        return ResponseEntity.ok(contratoService.listarContratos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrato> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(contratoService.getbyId(id));
    }

    @PostMapping
    public ResponseEntity<Contrato> crear(@RequestBody ContratoDTO contratoDTO) {
        Contrato nuevoContrato = contratoService.guardarContrato(contrato);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoContrato);
    }
}