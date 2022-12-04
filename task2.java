import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println(" Случайный список чисел  :" + list);
        Integer[] nums = list.toArray(new Integer[list.size()]);
        int len = nums.length;
        int count = 0;
        int temp = 0;

        for (int i = 0; i < len; i++) {
            temp = nums[i];
            if (temp % 2 == 1) {
                count++;
            }
        }

        int[] result = new int[count];
        count = 0;

        for (int j = 0; j < len; j++) {
            temp = nums[j];
            if (temp % 2 == 1) {
                result[count] = temp;
                count++;
            }
        }

        String nums_str = Arrays.toString(result);
        System.out.println("Список без четных чисел  :" + nums_str);

    }
}