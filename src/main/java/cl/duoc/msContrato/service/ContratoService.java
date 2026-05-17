package cl.duoc.msContrato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msContrato.client.ClienteClient;
import cl.duoc.msContrato.model.Contrato;
import cl.duoc.msContrato.repository.ContratoRepository;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepo;

    public List<Contrato> listarContratos() {
        return contratoRepo.findAll();
    }

    public Contrato buscarContrato(Integer id) {
        return contratoRepo.findById(id).orElseThrow(() -> new RuntimeException("Contrato no encontrado"));

    }

    public Contrato guardarContrato(Contrato contrato) {
        return contratoRepo.save(contrato);
    }

    public void eliminarContrato(Integer id){
        if(contratoRepo.existsById(id)){
            contratoRepo.deleteById(id);
        } else {
            throw new RuntimeException("Contrato no encontrado");
        }
    }

    public Contrato actualizarContrato(Integer id, Contrato contratoActualizado) {
        Contrato contratoExistente = contratoRepo.findById(id).orElseThrow(() -> new RuntimeException("Contrato no encontrado"));

        contratoExistente.setNumContrato(contratoActualizado.getNumContrato());
        contratoExistente.setClienteId(contratoActualizado.getClienteId());
        contratoExistente.setFechaInicio(contratoActualizado.getFechaInicio());
        contratoExistente.setFechaFin(contratoActualizado.getFechaFin());
        contratoExistente.setMonto(contratoActualizado.getMonto());
        contratoExistente.setEstado(contratoActualizado.getEstado());

        return contratoRepo.save(contratoExistente);
    }

    private ClienteClient clienteClient;
    
    


}
