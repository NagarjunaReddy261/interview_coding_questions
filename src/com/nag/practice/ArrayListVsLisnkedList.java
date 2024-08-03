package com.rtech.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLisnkedList {
	
	private static Random rnd;

    static {
        rnd = new Random();
    }

    static List<String> testArrayList;
    static List<String> testLinkedList;
    public static final int COUNT_OBJ = 3000000;

    public static void main(String[] args) {
        testArrayList = new ArrayList<>();
        testLinkedList = new LinkedList<>();

        insertSomeData(testArrayList);
        insertSomeData(testLinkedList);  

        checkInsertionPerformance(testArrayList);
        checkInsertionPerformance(testLinkedList);  
        
        System.out.println("---------------------------");
        
        checkPerformanceForFinding(testArrayList); 
        checkPerformanceForFinding(testLinkedList); 
    }

    //Initializes list with some dummy data
    public static void insertSomeData(List<String> list) {
        for (int i = COUNT_OBJ; i> 0; i--) {
            list.add(new String("" + i));
        }
    }

    //Inserts data within the given range to random
    public static void checkInsertionPerformance(List<String> list) {
        long startTime, finishedTime;
        startTime = System.currentTimeMillis();
        int rndIndex;
        for (int i = 200; i > 0; i--) {
            rndIndex = rnd.nextInt(100000);
            list.add(rndIndex, "test");
        }
        finishedTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() +" time passed at insertion: "+(finishedTime - startTime));
    }

    //finds the data within the given range to random
    public static void checkPerformanceForFinding(List<String> list) {
        long startTime, finishedTime;
        startTime = System.currentTimeMillis();
        int rndIndex;
        for (int i = 200; i > 0; i--) {
            rndIndex = rnd.nextInt(100000);
            list.get(rndIndex);
        }
        finishedTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName()+" time passed at searching: "+ (finishedTime - startTime));

    }

}
