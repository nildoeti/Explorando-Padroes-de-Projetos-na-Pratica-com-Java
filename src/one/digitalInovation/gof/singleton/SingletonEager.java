package one.digitalInovation.gof;

/**
 * Singleton "apressado"

*/
public class SingletonEager {
    private static SingletonEager instacia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instacia;
    }
}
