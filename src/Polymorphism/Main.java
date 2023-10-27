package Polymorphism;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new MourningDove());
        birds.add(new RedTailedHawk());
        birds.add(new Crow());
        birds.add(new Bobalink());
        for (Bird someBird : birds) {
            System.out.println(someBird.singASong());
        }

    }
}
