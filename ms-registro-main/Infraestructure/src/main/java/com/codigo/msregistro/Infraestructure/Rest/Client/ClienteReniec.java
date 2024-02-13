package com.codigo.msregistro.Infraestructure.Rest.Client;

import com.codigo.msregistro.Domain.Aggregates.Response.ResponseReniec;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "reniec-client", url = "https://api.apis.net.pe/v2/reniec/")
public interface ClienteReniec {
    @GetMapping("/dni")
    ResponseReniec getInfoReniec(@RequestParam("numero") String numero,
                                 @RequestHeader("Authorization") String token);

    // apis-token-7310.EiGAneQ7KcHOUMn7Uof1E8Kd88KzEVCl

}
