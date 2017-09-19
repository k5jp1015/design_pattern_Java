package pkg_abstract_factory.tablefactory;

import pkg_abstract_factory.factory.Factory;
import pkg_abstract_factory.factory.Link;
import pkg_abstract_factory.factory.Page;
import pkg_abstract_factory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
