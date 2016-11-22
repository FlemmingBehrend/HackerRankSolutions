package javasolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class JavaLoopsII {

    public static void main(String []argh){
        JavaLoopsII javaLoopsII = new JavaLoopsII();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(javaLoopsII.calculate(a, b, n));
        }
        in.close();
    }

    String calculate(int a, int b, int n) {
        List<String> result = new ArrayList<>();
        List<Double> numbers = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            int exp = n-i;
            while (exp >= 0) {
                double v = b * Math.pow(2, exp);
                numbers.add(v);
                exp--;
            }
            int sum = numbers.stream().mapToInt(Double::intValue).sum();
            numbers.clear();
            result.add(Integer.toString(a + sum));
        }
        return result.stream().collect(joining(" "));
    }

}
