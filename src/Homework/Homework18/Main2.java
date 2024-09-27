package Homework.Homework18;

import java.util.Arrays;
import java.util.*;

    public class Main2 {
        public void showArray(String[][] arr) {
            System.out.print("{" );
            for(int i=0; i<arr.length; i++){
                System.out.print("{" );
                for(int j=0; j<arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                    if(j != arr[i].length-1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("}");
                if(i != arr.length-1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}" );

        }

        public static void main(String[] args) {
            Main2 test = new Main2();
            String[][] array = {{"Hello", "World"}, {"from", "Java", "!!!"}};
            String[][] array2 = {{"Hello", "everyone!"}, {"Nice", "to", "meet", "you!"}, {"Happy", "to", "be", "here!"}};
            test.showArray(array);
            System.out.println();
            test.showArray(array2);

        }
    }



