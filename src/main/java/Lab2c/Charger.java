package Lab2c;

/*  Comp3111LEx\Lab2c\Chargeable.java
    Add interface to the class
 */
interface Chargeable {
    public void charge();
}
public class Charger {
    public void charge(Chargeable c) {
        c.charge();
    }
}