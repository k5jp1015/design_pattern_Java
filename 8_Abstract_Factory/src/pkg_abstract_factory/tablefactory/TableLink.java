package pkg_abstract_factory.tablefactory;

import pkg_abstract_factory.factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href = \"" + url + "\n>" + caption + "</a></td>\n";
    }
}
