package Lab2c;
/* Import class library cross package Lab2b */
import Lab2b.Book;

/*  Comp3111LEx\Lab2c\mainApp3c
    main Application for Lab2 Exercise 3    */
public class mainApp2c {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Gura Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is " +b.getChapter(k-1));
        String anotherArray[] = b.getChapters();
        System.out.println("There are " +anotherArray.length + " chapters.");
        System.out.println(java.util.Arrays.toString(anotherArray));

    /* for Exercise 3, add following code: */
        Computer a = new MobileComputer();
        for (int i = 0; i < 10; i++)
            a.work();

        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();
        c.charge(p);
//        c.charge(m);    // this does not work without fixing MobileComputer */
    }
}