package pkg_bridge;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();

        Random random = new Random();
        int randomTime = random.nextInt(times);
        for (int i = 0; i < randomTime; i++) {
            print();
        }
        close();
    }
}
