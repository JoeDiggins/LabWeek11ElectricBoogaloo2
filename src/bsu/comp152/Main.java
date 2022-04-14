package bsu.comp152;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList sortingMethod(ArrayList sortedArray){
        for (int i=0; i<sortedArray.size(); i++){
            
        }

        return ;
    }


    public static double medianMethod(ArrayList medianArray){
        if (( medianArray.size()%2 == 0)){
            double medianValue1 = (int) medianArray.get((medianArray.size()/2)-1);
            double medianValue2 = (int) medianArray.get((medianArray.size()/2));
            return (medianValue1 + medianValue2)/2;}

        else {return (int) medianArray.get((medianArray.size()/2));}
    }
    public static void main(String[] args) throws FileNotFoundException {

     ArrayList firstMedian = new ArrayList<>();
     firstMedian.add(1);
     firstMedian.add(2);
     firstMedian.add(3);
     firstMedian.add(4);
     firstMedian.add(5);
     firstMedian.add(6);
     firstMedian.add(7);
     firstMedian.add(8);
     firstMedian.add(9);
     firstMedian.add(10);
     firstMedian.add(11);
     firstMedian.add(12);

     System.out.println("This is the Median: " + medianMethod(firstMedian));

        }





    }

