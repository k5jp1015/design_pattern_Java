import pkgsingleton.Singleton;

public class Main {
    public static  void main(String args[]){
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2){
            // これが正しい
            System.out.println("obj1とobj2は同じインスタンスです。");
        }else {
            System.out.println("obj1とonj2は同じインスタンスではありません。");
        }

        System.out.println("End.");

    }
}
