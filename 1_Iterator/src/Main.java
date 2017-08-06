// import java.util.Iterator;
import bookpkg.*;

public class Main{
    public static  void main(String[] args){
         BookShelf bookShelf = new BookShelf(4);
         bookShelf.appendBook(new Book("Around the World in 80 days"));
         bookShelf.appendBook(new Book("Baby Steps"));
         bookShelf.appendBook(new Book("Tokyo Ghoul"));
         bookShelf.appendBook(new Book("NARUTO"));

         Iterator it = bookShelf.iterator();

         while(it.hasNext()){
             Book book = (Book)it.next();
             System.out.println(book.getName());
         }
    }
}