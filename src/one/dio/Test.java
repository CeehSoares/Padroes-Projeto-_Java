package one.dio;

import one.dio.facade.Facade;
import one.dio.singleton.SingletonEager;
import one.dio.singleton.SingletonLazy;
import one.dio.singleton.SingletonLazyHolder;
import one.dio.strategy.*;

public class Test {
    public static void main(String[] args) {

        //SINGLETON

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //STRATEGY

        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Fernanda", "22233340");

    }
}
