package pkg_abstract_factory.tablefactory;

import pkg_abstract_factory.factory.Item;
import pkg_abstract_factory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width = \"100%\" border = \"1\"><tr>");
        buffer.append("<td bgcolor = \"#cccccc\" align = \"center\" colspan = \"" + tray.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");

        Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");

        return buffer.toString();
    }
}
