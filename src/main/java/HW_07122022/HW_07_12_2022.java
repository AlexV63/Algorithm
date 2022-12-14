package HW_07122022;

import java.lang.module.FindException;

public class HW_07_12_2022 {


    public static void main(String[] args) {
        int index2 = binarySearch1(new int[]{1, 4, 7, 9, 12, 15}, 9);
        System.out.println(index2);
        int index = binarySearch(new int[]{1, 4, 7, 9, 12, 15}, 9);
        System.out.println(index);
        int index1 = recursiveBinarySearch(new int[]{1, 4, 7, 9, 12, 15}, 0, 5, 9);
        System.out.println(index1);
    }

    int[] arr = {1, 4, 7, 9, 12, 15};

    public static int binarySearch1(int[] arr, int key) {
        int left = 0;
        int right = arr.length;
        //           int middle = arr.length/2;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                left = middle + 1;
            } else {
                right = middle + 1;
            }
            return middle;   //-1?
        }
        return -1;

    }

    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
            // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch) lastIndex = middleIndex - 1;

        }
        return -1;

    }

    public static int recursiveBinarySearch(int[] arr, int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch) return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch) return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }
}


////  Решение к заданию 2

// Первое кольцо переместить с левого стержня на средний стержень
// Второе кольцо переместить на правый стержень
// Первое кольцо переместить правый стержень
// Третье кольцо переместить на средний стержень
// Первое кольцо на левый стержень
// Второе кольцо на средний стержень
// Первое кольцо на средний стержень
// Четвертое кольцо на правый стержень
// и так далее


/**
 * First level: 1) Реализовать алгоритм бинарного поиска, который находит данный key в данном отстортированном массиве
 * public int binarySearch(int[] arr, int key)
 * Описание алгоритма из лекции
 * binary search
 * problem: find key in sorted array
 * returns index of key
 * arr = [1,4,7,9,12,15], key = 9
 * take element from the middle 7
 * compare to key 7 == 9 false
 * compare to key 7 < 9
 * if middle element less than key repeat procedure for right half of array
 * if middle element more  than key repeat procedure for left half of arr
 * <p>
 * 2)
 * Задача заключается в следующем. Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
 * диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. Т
 * ребуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
 * Головоломка имеет следующие два правила:
 * 1. Вы не можете поместить больший диск на меньший диск.
 * 2. За один раз можно перемещать только один диск.
 * <p>
 * Задача  - придумать и описать алгоритм. Можно текстом, можно псевдокодом.
 * <p>
 * Задача со звёздочкой
 * Нужно реализовать  метод moveRing(firstPole, secondPole, thirdPole, numOfRings) .
 * <p>
 * Параметры firstPole, secondPole, thirdPole - стеки, которые представляют  стержни. Числа внутри - диски, диаметр диска - число
 * Например, стек firstPole = [3,2,1] содержит три диска диаметром 3 - в самом внизу, 2 - в середине, 1 - на самом верху.
 * numOfRings - количество колец, которые нужно передвинуть.
 */