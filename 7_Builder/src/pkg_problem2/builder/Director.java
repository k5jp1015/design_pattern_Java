package pkg_problem2.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){                //文書構築

        builder.makeString("実験");
        builder.makeTitle("ごはん");         //タイトル
        builder.makeString("今日の朝飯");    //文字列
        builder.makeItems(new String[]{     //箇条書き
            "ごはん",
            "味噌汁"
        });
        builder.makeString("今日の夕飯");
        builder.makeItems(new String[]{
            "ラーメン"
        });
        builder.close();
    }
}
