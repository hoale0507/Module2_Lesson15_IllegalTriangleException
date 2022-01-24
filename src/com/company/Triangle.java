package com.company;

public class Triangle {
    double a;
    double b;
    double c;
    public Triangle(double a, double b, double c) throws Exception {
        if(a < 0 || b < 0 || c < 0 || a+b <= c || a+c<=b || c+a<=b){
            throw new Exception();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
