package pkg_abstract_factory;

import pkg_abstract_factory.factory.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Main class.mame.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        Link yahoo = factory.createLink("Yahoo", "http://www.yahoo.co.jp");
        Link google = factory.createLink("google", "http://www.google.co.jp");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(yahoo);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "k5jp1015");
        page.add(traynews);
        page.add(traysearch);
        page.output();

    }
}
