package one.dio.singleton;
/**
 * Singleton "preguiçoso".
 *
 * @author Conceição
 **/

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return instance;
    }
}