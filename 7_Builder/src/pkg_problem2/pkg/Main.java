package pkg_problem2.pkg;

import pkg_problem2.builder.Director;
import pkg_problem2.builder.HTMLBuilder;
import pkg_problem2.builder.TextBuilder;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            usage();
            System.exit(0);
        }
        else if(args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "が作成されました。");
        } else {
            usage();
            System.exit(0);
        }

    }
    public static void usage(){
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }
}
