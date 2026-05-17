package cl.duoc.msContrato.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "microservicio-clientes", url = "http://localhost:8086/api/v1/clientes")
public interface ClienteClient {

    @GetMapping("/{id}/validar")
    boolean verificarClienteExiste(@PathVariable("id") String clienteId);
}