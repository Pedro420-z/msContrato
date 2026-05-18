package cl.duoc.msContrato.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratoDTO {

    private String numeroContrato;
    private String clienteId;
    private String fechaInicio;
    private String fechaFin;
    private Double monto;
    private String estado;
    private ClienteDTO cliente;

}

