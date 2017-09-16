package pkg_problem3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConcreteBuilder extends Builder {

    String fileName;
    private PrintWriter writer;


    @Override
    public void makeTitle(String title) {
        fileName = title + ".csv";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void makeString(String str) {
        writer.println(str);
    }

    @Override
    public void makeItems(String[] items) {
        int counter = 0;
        for (String item : items){
            if (counter != 0) writer.print(",");
            writer.print(item);
            counter++;
        }
        writer.println("");
    }

    @Override
    public void close() {
        writer.close();
    }

    public String getResult(){
        return this.fileName;
    }
}
