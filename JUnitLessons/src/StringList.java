import java.util.*;

public class StringList {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        List<String> listString = new LinkedList<>();
        while(newScanner.hasNext()){
            listString.add(newScanner.next());
        }
        newScanner.close();
        System.out.print("[");
        for(int i = 0;i<listString.size();i++){
            if ( i == (listString.size()-1)) {
                System.out.print(listString.get(i));
            } else {
                System.out.print(listString.get(i)+", ");
            }
        }
        System.out.print("]");
    }
}
