package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(8,9);
        p.product(8,9,10);
        p.product(8.1,9.1);
//        p.product(8.1,9.1);
    }
}