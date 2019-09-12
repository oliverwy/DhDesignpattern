/**
 *
 */
package ch26flyweightpattern.flyweightnormal;

/**
 * @author oliver
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx = f.getFlyweight("X");
        fx.opration(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.opration(--extrinsicstate);


        Flyweight fz = f.getFlyweight("X");
        fz.opration(--extrinsicstate);

        Flyweight fu = f.getFlyweight("X");
        fu.opration(--extrinsicstate);

        Flyweight uf = new UnshareConcreteFlyweight();
        uf.opration(--extrinsicstate);

    }

}
