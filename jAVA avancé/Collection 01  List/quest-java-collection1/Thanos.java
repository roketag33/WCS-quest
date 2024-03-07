import java.util.*;

import javax.lang.model.element.TypeElement;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> Herolist = new ArrayList<>();
        Hero Black = new Hero("Black Widow", 34);
        Hero Captain = new Hero("Captain America", 100);
        Hero Vision = new Hero("Vision", 3);
        Hero Iron = new Hero("Iron Man", 48);
        Hero Scarlet = new Hero("Scarlet Witch", 29);
        Hero Thor = new Hero("Thor", 1500);
        Hero Hulk = new Hero("Hulk", 49);
        Hero Doctor =  new Hero("Doctor Strange", 42);

        Herolist.add(Scarlet);
        Herolist.add(Black);
        Herolist.add(Captain);
        Herolist.add(Vision);
        Herolist.add(Iron);
        Herolist.add(Thor);
        Herolist.add(Hulk);
        Herolist.add(Doctor);

        Thor.setAge(1501);

        Herolist.set(5, Thor);

        Collections.shuffle(Herolist);

        int lenght = Herolist.size();
        Herolist = new ArrayList<>(Herolist.subList(0, Herolist.size() / 2));

        for (Hero hero : Herolist) {
            System.out.println(hero.getName());
        }
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        // TODO 4 : Shuffle the heroes list

        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}
