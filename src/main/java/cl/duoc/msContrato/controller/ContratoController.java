package cl.duoc.msContrato.controller

import cl.duoc.msContrato.model.Contrato;
import cl.duoc.msContrato.service.ContratoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import cl.duoc.msContrato.dto.ContratoDTO;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    private ContratoService contratoService;

    @GetMapping
    public ResponseEntity<List<Contrato>> listar() {
        try{
            Contrato contrato = service.ListarContratos();
            return ResponseEntity.ok(contrato);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrato> obtenerPorId(@PathVariable Integer id) {
        try{
            Contrato contrato = service.buscarContrato(id);
            return ResponseEntity.ok();
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Contrato> GuardarContrato(@RequestBody Contrato contrato) {
        try{
            Contrato nuevoContrato = contratoService.guardarContrato(contrato);
            return ResponseEntity.OK(nuevoContrato);
        }catch (Exception e){
            return RespondeEntity.notFound().build();
        }
    }

    @PutMapping
}
