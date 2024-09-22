package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int t,a,b,c;
        double y;
        for (int e = 0; e != -1; ) {
            System.out.println("1)fizzBuzz\n2)reverseString\n3)solveQuadraticEquation\n4)calculateSum\n5)isPalindrome\n0)exit");
            Scanner scanner = new Scanner(System.in);
            t = scanner.nextInt();
            switch (t) {
                case 1:
                    List<String> res=fizzBuzz();
                    System.out.println(res);
                    break;
                case 2:
                    System.out.println(reverseString());
                    break;
                case 3:
                    y = Math.random() * 10;
                    a = (int) y;
                    y = Math.random() * 10;
                    b = (int) y;
                    y = Math.random() * 10;
                    c = (int) y;
                    System.out.println(solveQuadraticEquation(a,b,c));
                    break;
                case 4:
                    System.out.println(calculateSum());
                    break;
                case 5:
                    String str = scanner.nextLine();
                    if (isPalindrome(str)) System.out.println("is palindrome\n");
                    else System.out.println("is NOT palindrome\n");
                    break;
                case 0:
                    e = -1;
                    break;
                default:
                    break;
            }
        }
    }


    public static List<String> fizzBuzz() {
        int n = 1, size = 499;
        List<String> sequence = new ArrayList<>();
        for (int i = 0; i <= size; ++i) {
            if (n % 5 == 0 && n % 7 == 0) {
                sequence.add("fizzbuzz");
            } else if (n % 5 == 0) {
                sequence.add("fizz");
            } else if (n % 7 == 0) {
                sequence.add("buzz");
            } else {
                sequence.add(String.valueOf(n));
            }
            n++;
        }
        return sequence;
    }

    public static String reverseString() {
        String st = "make install";
        String rev="";
        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }
        return rev;
    }

    public static String solveQuadraticEquation(int a, int b, int c) {
        String res="";
        System.out.println(a + "x+" + b + "y+" + c);
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D=" + D);
        if (D < 0) {
            return res="There are no roots";
        } else if (D == 0) {
            double x = -(b / 2.0 * a);
            return res="x=" + x;
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2.0 * a), x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            return res="x1=" + x1 + "\nx2=" + x2;
        }
    }

    public static double calculateSum() {
        double sum = 0;
        int k = 2;
        while (k != -1) {
            double cur = 1.0 / (k * k + k - 2);
            sum += cur;
            if (cur < Math.pow(10, -6)) {
                k = -1;
                System.out.println(cur + "<10^-6");
            } else k++;
        }
        return sum;
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println("reverese: " + rev);
        if (str.equals(rev))
            return true;
        else
            return false;
    }
}