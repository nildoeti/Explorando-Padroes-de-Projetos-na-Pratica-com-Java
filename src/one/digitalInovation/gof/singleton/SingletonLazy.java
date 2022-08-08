package one.digitalInovation.gof;

/**
 * Singleton "Preguiçoso".
 * É um singleton que em um primeiro momento
 */
public class SingletonLazy {

    private static SingletonLazy instacia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instacia == null){
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
