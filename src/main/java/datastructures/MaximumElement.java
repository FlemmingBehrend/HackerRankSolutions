package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> input = new ArrayList<>();
        for (int i=0; i < n; i++){
            String e = in.next() + in.nextLine();
            input.add(e);
        }
        MaximumElement maximumElement = new MaximumElement();
        List<Integer> output = maximumElement.execute(input);
        for (Integer integer : output) {
            System.out.println(integer);
        }
    }

    List<Integer> execute(List<String> commands) {
        List<Integer> output = new ArrayList<>();
        for (String command : commands) {
            String[] split = command.split(" ");
            switch (split[0]) {
                case "1":
                    stack.push(Integer.parseInt(split[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = stack.stream()
                            .mapToInt(i -> i)
                            .max()
                            .getAsInt();
                    output.add(max);
                    break;
            }
        }
        return output;
    }

}
