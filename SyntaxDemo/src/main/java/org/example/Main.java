package org.example;

import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


       byte d = 127;
       byte neg_d = -128;
       short b = 32767;
       short neg_b = -32768;
       int a = 2147483647;
       int neg_a = -2147483648;
       long e =2147483648L;

       double dd = 3.1415;
       float f = 3.14f;
       boolean bool = true;
       char ch = 'a';
       String str = "abc";


       int[] int_array = {1,2,3,4,5,6,7};

       for (int i = 0; i < int_array.length; i++) {
           System.out.println(int_array[i]);
       }

       for (int i : int_array) {
           System.out.println(i);
       }

       ArrayList<Integer> dyn_list = new ArrayList<>();
       dyn_list.add(1);
       dyn_list.add(2);
       dyn_list.add(42);
       dyn_list.add(65);
       dyn_list.add(67);

       for(int i : dyn_list) {
           System.out.println(i);
       }

       for (Integer integer : dyn_list) {
           System.out.println(integer);
       }
    }
}