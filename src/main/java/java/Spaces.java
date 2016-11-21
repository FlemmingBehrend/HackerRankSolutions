package java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Spaces {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int spaces = 16-s1.length();
            System.out.printf("%-15s%03d\n",s1,x);        }
        System.out.println("================================");

    }

}
