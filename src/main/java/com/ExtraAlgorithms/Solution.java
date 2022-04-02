package com.ExtraAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<Integer>() {{
            add(4);
            add(-1);
            add(0);
            add(3);
        }};
        List<Integer> list2=new ArrayList<Integer>() {
            {
                add(-2);
                add(5);
                add(0);
                add(3);
            }};

        System.out.println("K is:" +CountIndexes(list1,list2));


    }

    public static int CountIndexes(List<Integer> A, List<Integer> B){
        int length=A.size();
        long sumA=0;
        long sumB=0;
        for(int i=0;i<length;i++){
            sumA += A.get(i);
            sumB += B.get(i);
        }
        if(sumA != sumB)
            return 0;

        long preA=0,preB=0;
        int answer=0;
        for (int i=0;i<length -1;i++) {
            preA += A.get(i);
            preB += B.get(i);

            if (preA == preB && sumA - preA == preA) {
                answer += 1;
            }
        }
        return answer;


    }
}
