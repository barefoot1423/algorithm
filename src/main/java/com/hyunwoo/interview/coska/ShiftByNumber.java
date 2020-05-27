package com.hyunwoo.interview.coska;

public class ShiftByNumber {
}

//    I had a job interview today and failed because I was very nervous using Zoom sharing my screen to solve the problem. Yes, it was basically a programming test. After the interview, I spent another time to rethink and found out there's a better way to do it. So I quickly did code and got the solution in 5 mins. (I was given 10 mins at the interview) Gee... I hate pressure at the interviews.
//
//    Here I share my code solution with you and you might have a better algorithm. Why are we (seniors with 10-20 years exp) questioned of that kind still? LOL
//
//    Problem: there is a list of 1,2,3,4,5 and when "shift by 0" is requested, the result is 1,2,3,4,5 and "shift by 2" is requested the result is 3,4,5,1,2 and so on.
//
//    My solution:
//
//public class Test {
//
//    public static void main(String[] args) {
//        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
//
//        shift(list, 0);
//        System.out.println();
//        shift(list, 2);
//        System.out.println();
//        shift(list, 4);
//    }
//
//    private static void shift(List<String> list, int start) {
//        for (int i=0; i<list.size(); i++) {
//            int index = (start + i) % list.size();
//            System.out.print(list.get(index));
//            System.out.print(" ");
//        }
//    }
//}
