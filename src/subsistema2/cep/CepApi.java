package subsistema2.cep;

import one.dio.singleton.SingletonEager;

public class CepApi {

        private static CepApi instance = new CepApi();
        private CepApi() {

            super();
        }
        public static CepApi getInstance() {
            return instance;
        }
        public String recuperarCidade(String cep) {
            return "Rio de janeiro";
        }
        public String recuperarEstado(String cep) {
            return "RJ";
    }
}
