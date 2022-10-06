package com.company;
import java.util.Scanner;
public class Main {
    private boolean search(int[] numbers, int x) {
        boolean exist = false;
        for (int e: numbers){
            if(e == x){
                exist = true;
                break;
            }
        }
        return exist;
    }

    public static void main(String[] args) {
        int [] numbers ={10,9,8,7,6,5,4,3,2,1,0,-1};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(new Main().search(numbers,x));

    }

}
