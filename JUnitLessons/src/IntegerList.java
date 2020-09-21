import java.lang.reflect.Array;
import java.util.*;

public class IntegerList {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        List<Integer> newList = new ArrayList<>();
        while (newScanner.hasNextInt()) {
            newList.add(newScanner.nextInt());
        }
        newScanner.close();
        int listSize = newList.size();

        for (int i = 0;i<listSize;i++) {
            if (i % 2 != 0) {
                newList.add(newList.get(i));
            }
        }
        List<Integer> newList1 = newList.subList(listSize,newList.size());
        newList1.sort(Collections.reverseOrder());
        for (Integer int2 : newList1) {
            System.out.print(int2+" ");
        }
    }
}
