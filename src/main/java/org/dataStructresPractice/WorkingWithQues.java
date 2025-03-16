package org.dataStructresPractice;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("ahmed",26));
        supermarket.add(new Person("ali",16));
        supermarket.add(new Person("alex",36));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
    }

    static record Person(String name,int age){

    }
}
