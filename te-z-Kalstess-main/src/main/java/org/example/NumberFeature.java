package main.java.org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int number = scanner.nextInt();
        int result = 0;
        int position = 1;
        int bitValue = 1;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            // 判断数字和位数的奇偶性是否相同
            boolean isDigitOdd = (digit % 2 != 0);
            boolean isPositionOdd = (position % 2 != 0);

            if (isDigitOdd == isPositionOdd) {
                result += bitValue;
            }

            position++;
            bitValue *= 2;
        }

        System.out.println(result);
        scanner.close();
    }
}