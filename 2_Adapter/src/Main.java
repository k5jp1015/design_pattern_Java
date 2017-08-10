/**
 * Created by keigomagami on 2017/08/06.
 */

import adapterpkg_1.*;
import adapterpkg_2.*;

public class Main {
    public static void main(String args[]){
        Print p = new PrinBanner("Hello");
        p.printWeak();
        p.printStrong();
//      apotoxin4869

        Print konan = new PrinBanner("apotoxin4869");
        konan.printStrong();

        Print2 p2 = new PrintBanner2("pattern2");
        p2.printStrong();
        p2.printWeak();

    }
}
