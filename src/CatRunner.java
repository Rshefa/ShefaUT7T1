import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {

        ArrayList<Cat> Cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Mimi");
        Cat cat2 = new Cat("Tom");
        Cat cat3 = new Cat("Jim");
        Cats.add(cat1);
        Cats.add(cat2);
        Cats.add(cat3);
        System.out.println(Cats);

        Cat cat4 = new Cat("Sara");
        Cat replaced = Cats.set(1, cat4);
        System.out.println(Cats);
        System.out.println(replaced);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(Cats);

        for (int i = 0; i < Cats.size(); i++){
            String newName = Cats.get(i).getName().toUpperCase();
            Cats.get(i).setName(newName);
        }
        System.out.println(Cats);

        Cats.add(new Cat("SAM"));
        System.out.println(Cats);
    }
}
