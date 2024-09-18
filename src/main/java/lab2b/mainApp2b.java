package lab2b;

/* 	Comp3111LEx\Lab2b\mainApp2b.java
	main Application for Lab2 Exercise 2	*/

public class mainApp2b {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is " +b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " +anotherArray.length+ " chapters.");
        System.out.println(anotherArray);
    }
}