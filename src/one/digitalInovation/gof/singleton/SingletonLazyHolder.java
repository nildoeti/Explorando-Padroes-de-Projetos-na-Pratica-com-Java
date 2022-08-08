package one.digitalInovation.gof;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 */

public class SingletonLazyHolder {

    private static class InstanceHolder{
    public static SingletonLazyHolder instacia = new SingletonLazyHolder ();
    }
    private SingletonLazyHolder () {
        super();
    }

    public static SingletonLazyHolder  getInstancia() {
        return InstanceHolder.instacia;
    }
}
