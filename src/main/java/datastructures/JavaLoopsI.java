package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        JavaLoopsI test = new JavaLoopsI();
        List<String> result = test.multiplyBy(t);
        for (String s : result) {
            System.out.println(s);
        }
    }

    List<String> multiplyBy(int i) {
        List<String> result = new ArrayList<>();
        for (int j = 1; j < 11; j++) {
            result.add(i + " x " + j + " = " + i*j);
        }
        return result;
    }
}
