package datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        ArraysDS arraysDS = new ArraysDS();
        int[] revert = arraysDS.revert(arr);

        String output = Arrays.stream(revert)
                .mapToObj(Integer::toString)
                .collect(joining(" "));

        System.out.println(output);
    }

    int[] revert(int[] array) {
        if (array == null)
            throw new IllegalArgumentException();

        if (array.length == 0 || array.length == 1)
            return array;

        List<Integer> integerCollection = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(integerCollection);

        int[] reversed = new int[array.length];
        int i = 0;
        for (Integer integer : integerCollection) {
            reversed[i++] = integer.intValue();
        }

        return reversed;
    }

}
