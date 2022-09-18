import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addList(list);
        arrSorting(list);
        System.out.println("Минимальное значение: " + list.get(0));
        System.out.println("Максимальное значение: " + list.get(list.size()-1));
        System.out.println("Среднее занчение списка: " + srSearch(list));
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
    static void arrSorting(ArrayList<Integer> arr) {
        Collections.sort(arr);
    }
    static double srSearch(ArrayList<Integer> arr) {
        int count = 0;
        double sum = 0;
        for (int item:arr) {
            sum += item;
            count++;
        }
        return sum/count;
    }
}
