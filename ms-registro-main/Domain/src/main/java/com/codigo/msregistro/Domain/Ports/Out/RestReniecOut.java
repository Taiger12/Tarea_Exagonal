package com.codigo.msregistro.Domain.Ports.Out;

import com.codigo.msregistro.Domain.Aggregates.Response.ResponseReniec;

public interface RestReniecOut {
    public ResponseReniec getInfoReniec(String numDoc);
}
