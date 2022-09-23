package com.example.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String str = "ABCDEf";
        String str2 = "ABCEA";
        char s[] = str.toCharArray();
        char s2[] = str2.toCharArray();
        List list = Arrays.asList(s);
        List list2 = Arrays.asList(s2);
        list.retainAll(list2);
        System.out.println(list);
    }
//    int count =0;
//    //find common elements
//
//        Set s = new HashSet();
//        for (int i = 0;i<str.length();i++){
//            s.add(str.charAt(i));
//        }
//        for (int i = 0;i<str2.length();i++){
//            if(!s.add(str2.charAt(i))){
//                count++;
//            }
//        }
//        System.out.print(count);
//    }
}
