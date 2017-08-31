package templatepkg;

/**
 * Created by keigomagami on 2017/08/10.
 */
public abstract class AbstractDisplay { // 抽象クラス AbstractDisplay

    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display() {
        open();

        for (int i = 0; i < 5; i++){
            print();
        }

        close();
    }


}
