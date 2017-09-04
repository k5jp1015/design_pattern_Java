package pkgsingleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    // コンストラクタをprivateにすることで外からのインスタンス生成を禁止している
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
