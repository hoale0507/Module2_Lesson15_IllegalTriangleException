package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size1");
        double side1 = input.nextDouble();
        System.out.println("Input size2");
        double side2 = input.nextDouble();
        System.out.println("Input size3");
        double side3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
        }
        catch (Exception e) {
            System.out.println("3 canh khong hop le");
        }
    }


}
