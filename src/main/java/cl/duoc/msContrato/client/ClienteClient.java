package cl.duoc.msContrato.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "msClientes", url = "http://localhost:8081/api/v1/clientes")
public interface ClienteClient {

    @GetMapping("/dto/{id}")
    ClienteDTO obtenerClienteDTO(@PathVariable("id") Integer id);
}
