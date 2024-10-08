package org.example;

public class taskOne {
    public static void main(String[] args) {
        String str1 = "";
        StringBuilder str2 = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str1 += i + " ";
        }
        long end = System.currentTimeMillis();
        long result = end - start;
//        System.out.println(str1);
        System.out.println(result);


        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str2.append(i).append(" ");
        }
        long end1 = System.currentTimeMillis();
        long result1 = end1 - start1;

//        System.out.println(str2);
        System.out.println(result1);
    }

}