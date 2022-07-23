//still working on

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //int a = 5;
        //char b = 'i';
        //long c = 400;

        String name = "Jeremy";
        System.out.println(name.toUpperCase());

        addExlamation(name);

        String hotString = "Hot New String";
        String hotNewString = returnExlamationString(hotString);
        System.out.println(hotNewString);

        //Animal alpha = new Animal();
        //String dog = alpha.iAmDog();
        String dog = Animal.iAmDog();
        System.out.println(dog);
    }

    public static void addExlamation(String s) {
          System.out.println( s + "!" );
    }

    public static String returnExlamationString (String s) {
        return s + "!!";
    }
}
