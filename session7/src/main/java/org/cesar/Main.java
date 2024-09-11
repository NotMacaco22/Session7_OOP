package org.cesar;

public class Main {
    public static void main(String[] args) {
        int[] ages = new int[10];

        ages[0] = 15;
        ages[1] = 25;
        ages[2] = 30;
        ages[3] = 34;
        ages[4] = 33;

        int count = counter(ages);


        for (int i = 0; i < count; i++){
            System.out.print(ages[i] + " ");
        }


    }

    public static int counter(int array[]){

        int count = 0;
        /*
        * By default elements are egual to 0, useless if we expect a 0 in the array*/
        for (int i : array){
            if (i != 0){
                count++;
            }
        }

        return count;
    }

}