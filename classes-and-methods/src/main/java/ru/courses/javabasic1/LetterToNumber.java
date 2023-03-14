package ru.courses.javabasic1;

public class LetterToNumber {
    public static void main(String[] args) {
        System.out.println(charToNum('3'));
    }
    //задание#3

    public static int charToNum(char c) {

        return c - '0';

    }
}
