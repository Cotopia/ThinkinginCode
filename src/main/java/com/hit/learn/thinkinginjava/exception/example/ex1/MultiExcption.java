package com.hit.learn.thinkinginjava.exception.example.ex1;

public class MultiExcption {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("hello");
        } catch (NullPointerException e) {
            System.out.println("This is an null point exception.");
        } catch (Exception e) {
            System.out.println("This is an exception");
        }
    }
}
