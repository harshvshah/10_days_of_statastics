import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static double calculateMean(int[] data){
        double sum = 0;
        for(int i : data){
            sum += i;
        }
        return sum/data.length;
    }
    
    public static double calculateSquaredDistance(int[] data, double mean){
        double sum = 0;
        for(int i : data){
            sum += Math.pow(i - mean,2);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dataCounter = scan.nextInt();
        int[] data = new int[dataCounter];
        int counter = 0;
        while(scan.hasNext()){
            data[counter]= scan.nextInt();
            counter++;
        }
        Arrays.sort(data);
        double mean = calculateMean(data);
        double squaredDistance = calculateSquaredDistance(data, mean);
           
        System.out.printf("%.1f", Math.sqrt(squaredDistance/dataCounter));
        
    }
}