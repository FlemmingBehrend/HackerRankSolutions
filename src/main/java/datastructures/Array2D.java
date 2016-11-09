package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        Array2D array2D = new Array2D();
        int result = array2D.calculate(arr);

        System.out.println(result);
    }

    int calculate(int[][] matrix) {
        if (matrix == null || matrix.length < 3 || matrix[0].length < 3)
            throw new IllegalArgumentException();

        int startX = 0;
        int startY = 0;

        List<Integer> sums = new ArrayList<>();
        List<Integer> hourGlass;

        boolean notDone = true;
        while (notDone) {
            try {
                int[][] ints = getHourGlass(matrix, startX++, startY);
                hourGlass = convertHourGlassToSingleList(ints);
                int sum = calculateHourGlassSum(hourGlass);
                sums.add(sum);
            } catch (NoMoreHourGlassesInXDirection e) {
                startX = 0;
                startY++;
            } catch (NoMoreHourGlassesInYDirection e) {
                notDone = false;
            }
        }

        int maxHourGlass = sums.stream()
                .mapToInt(i -> i)
                .max()
                .getAsInt();

        return maxHourGlass;

    }

    private int[][] getHourGlass(int[][] matrix, int startX, int startY) {
        if (startX + 3 > matrix[startY].length)
            throw new NoMoreHourGlassesInXDirection();
        if (startY + 3 > matrix.length)
            throw new NoMoreHourGlassesInYDirection();
        int[] row1 = Arrays.copyOfRange(matrix[startY], startX, startX + 3);
        int[] row2 = Arrays.copyOfRange(matrix[startY + 1], startX, startX + 3);
        int[] row3 = Arrays.copyOfRange(matrix[startY + 2], startX, startX + 3);
        int[][] hourGlass = {row1, row2, row3};
        return hourGlass;
    }

    private int calculateHourGlassSum(List<Integer> hourGlass) {
        return hourGlass.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private List<Integer> convertHourGlassToSingleList(int[][] matrix) {
        assert matrix.length == 3 && matrix[0].length == 3;
        List<Integer> hourGlass = Stream.of(matrix)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
        hourGlass.remove(3);
        hourGlass.remove(4);
        return hourGlass;
    }

    private class NoMoreHourGlassesInXDirection extends RuntimeException {
    }

    private class NoMoreHourGlassesInYDirection extends RuntimeException {
    }

}
