package adapterpkg_1;

/**
 * Created by keigomagami on 2017/08/06.
 */
public class PrinBanner extends Banner implements Print {

    public PrinBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
