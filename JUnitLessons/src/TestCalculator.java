import java.util.*;

class Book{
    String nameAutor;

    public Book(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}


public class TestCalculator {
    public static void main(String[] args) {
       Map books = new HashMap();
       books.put(1,new Book("Kernigan"));
       books.put(2,"Braun");
       Set newSet = books.entrySet();
       newSet.forEach(System.out::println);

    }
}

