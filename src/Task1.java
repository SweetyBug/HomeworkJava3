import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        addList(list);
        ArrayList <Integer> list2 = copyList(list);
        delN(list, list2);
        printList(list);
    }
    static ArrayList addList(ArrayList <Integer> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое количесвто элемнтов вы хотите ввести?: ");
        int num = scanner.nextInt();
        System.out.println("Заполните список призвольными целыми числами");
        Integer user = scanner.nextInt();
        int count = 1;
        while (!(count == num)) {
            arr.add(user);
            user = scanner.nextInt();
            count++;
        }
        arr.add(user);
        return arr;
    }
    static ArrayList copyList(ArrayList<Integer> arr) {
        ArrayList <Integer> arr2 = new ArrayList<>();
        for(int item:arr) {
            arr2.add(item);
        }
        return arr2;
    }
    static void delN(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for (int item:arr2) {
            if (item%2==0) {
                arr1.removeAll(Collections.singleton(item));
            }
        }
    }
    static void printList(ArrayList<Integer> arr) {
        Iterator<Integer> col = arr.iterator();
        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }
}
