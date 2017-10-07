import pkg_bridge.*;

import java.util.Random;

public class Main {
    public static void main(String args[]){
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new Display(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Random times"));
        Display d5 = new Display(new FileDisplayImpl("resource/sample.txt"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.multiDisplay(5);
        d5.display();

    }
}
