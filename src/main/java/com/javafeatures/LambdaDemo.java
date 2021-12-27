package com.javafeatures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo {
    public static void ListMethod(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //old way to print
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // iterator method
        Iterator<Integer> interator = list.iterator();
        while (interator.hasNext())
        {
            System.out.println(interator.next());
        }

        //new
        for(int i : list){
            System.out.println(i);
        }

        //lambda + consumer interface
        //internal iterations
        //
        list.forEach(integer -> System.out.println(integer));
    }
}
