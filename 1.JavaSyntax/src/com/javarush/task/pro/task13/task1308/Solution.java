package com.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        int a = Collections.min(list);
        return a;
//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
//        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        int a = Collections.max(list);
        return a;
//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
//        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int a = Collections.frequency(list, element);
        return a;
//        int frequency = 0;
//        if (element == null) {
//            for (Integer integer : list)
//                if (integer == null)
//                    frequency++;
//        } else {
//            for (Integer integer : list) {
//                if (integer.equals(element)) {
//                    frequency++;
//                }
//            }
//        }
//        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
        return Collections.binarySearch(list, key);
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
//        return index;
    }
}
