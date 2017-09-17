package pkg_abstract_factory.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;

        try{
            // ClassクラスのforNameメソッドを用いて、クラスを動的に読み込み、インスタンスを作成する
           factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}
