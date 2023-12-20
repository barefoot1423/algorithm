package com.hyunwoo.practice;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class ListExample {

    private static final Random randomizer = new Random();

    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();

        ArrayList<Integer> numericList = new ArrayList<>();

        for (int i = 0; i < 157_700_000; i++) {
            Integer e = Integer.valueOf(randomizer.nextInt(Integer.MAX_VALUE));
            numericList.add(e);
//            System.out.println(e);
        }

        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("running duration is " + (duration.getSeconds()) + " secs");
    }

    static void printLastEl(ArrayList<Integer> list) {
        Integer el = list.get(list.size() - 1);
        System.out.println("last element is " + el);
    }

}
