package cl.duoc.msContrato.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.msContrato.dto.SucursalDTO;

@FeignClient(name = "Sucursal", url = "https://localhost:8088")
public interface SucursalClient {

    @GetMapping("/api/v1/sucursal/dto/{id}")
    SucursalDTO detalleSucursal(@PathVariable("id") Integer id);

}
