package adapterpkg_1;

/**
 * Created by keigomagami on 2017/08/06.
 */
public class Banner {

    private String string;
    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");

    }
}
