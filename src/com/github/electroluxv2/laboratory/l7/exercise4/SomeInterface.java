package com.github.electroluxv2.laboratory.l7.exercise4;

public interface SomeInterface {
    int doSmth(int a);
    int doSmth(int a, int b);
    // float doSmth(int a, int b);
    // Method signature is the same
    int doSmth(float a, float b);
    int doSmth(float a, int b);
    int doSmth(int a, float b);
    int doSmth(Integer a, Integer b);
    int doSmth(int a, Integer b);
    int doSmth(Integer a, int b);
    int doSmth(int a, int b, int c);
    int doSmth(int...a);
    int doSmth(int a, int...b);
    // float doSmth(int a, int[] b);
    // Method signature is the same
    int doSmth(int a, int b, int...c);
    // doSmth(1,2,3,3,3,3,3,3...)
}