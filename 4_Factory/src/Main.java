import factorypkg.framework.Factory;
import factorypkg.framework.Product;
import factorypkg.iCard.IDCardFactory;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("佐藤");
        Product card2 = factory.create("田中");
        Product card3 = factory.create("中村");
        card1.use();
        card2.use();
        card3.use();

        List<String> owners = ((IDCardFactory)factory).getOwners();
        System.out.println("現在のカード利用者は以下のような感じです。");
        for(String name: owners){
            System.out.println(name);
        }


    }
}
