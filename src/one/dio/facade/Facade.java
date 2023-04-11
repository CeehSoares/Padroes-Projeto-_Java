package one.dio.facade;

import subsistema1.crm.CrnService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrnService.gravarCliente(nome, cep, cidade, estado);
    }
}
