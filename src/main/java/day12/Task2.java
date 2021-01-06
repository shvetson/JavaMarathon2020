package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int minRange1 = 0;
        int maxRange1 = 30;
        int minRange2 = 300;
        int maxRange2 = 350;

        List<Integer> listInt = new ArrayList<>();

        for (int i = minRange1; i < maxRange2; i++) {
            if ((i > minRange1 && i < maxRange1) || (i >= minRange2 && i < maxRange2)) {
                if (i % 2 == 0) {
                    listInt.add(i);
                }
            }
        }

        for (Integer integer : listInt) {
            System.out.println(integer);
        }
    }
}