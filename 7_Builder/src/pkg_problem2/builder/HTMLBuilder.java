package pkg_problem2.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch(IOException e) {
            e.printStackTrace();
        }
        writer.println("<!html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.append("<ul>");
        for (String item : items){
            writer.println("<li>" + item + "</li>");
        }
        writer.append("</ul>");
    }

    @Override
    public void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }
}
