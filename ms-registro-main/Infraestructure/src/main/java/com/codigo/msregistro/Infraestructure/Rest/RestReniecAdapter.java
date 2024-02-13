package com.codigo.msregistro.Infraestructure.Rest;

import com.codigo.msregistro.Domain.Aggregates.Response.ResponseReniec;
import com.codigo.msregistro.Domain.Ports.Out.RestReniecOut;
import com.codigo.msregistro.Infraestructure.Rest.Client.ClienteReniec;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestReniecAdapter implements RestReniecOut {

    private final ClienteReniec reniec;
    @Value("{token.api}")
    private String tokenApi;

    @Override
    public ResponseReniec getInfoReniec(String numDoc) {
        String authorization = "Bearer " + tokenApi;
        ResponseReniec responseReniec = reniec.getInfoReniec(numDoc, authorization);
        return responseReniec;
    }


}
