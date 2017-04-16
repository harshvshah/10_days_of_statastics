import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int array[]=new int[a];
        int array2[] = new int[a];
        int i =0;
        int j = 0;
        double sum = 0.0;
        double mean =0.0;
        double median =0.0;
        int mode = 0;
        int temp =-1;
        double weightedmean = 0.0;
        double weightedsum =0.0;
        
        
        
        if(a>=5 && a <=50){
         while(i<a){
	        	temp = scan.nextInt();
	        	if(temp>0 && temp<100){
	        		array[i] = temp;
	        		i=i+1;
	        	}
            
        
    }
        }
        
        if(a>=5 && a <=50){
            while(j<a){
   	        	temp = scan.nextInt();
   	        	if(temp>0 && temp<100){
   	        		array2[j] = temp;
   	        		sum =sum + array2[j];
   	        		j=j+1;
   	        		
   	        	}
               
           
       }
           }
         
        if(a!=0){
        for(i=0;i<a;i++){
        	weightedsum = weightedsum  + (array[i]*array2[i]);
        }
        weightedmean = (double)Math.round((weightedsum/sum)*10)/10;
        }
        else{
        	weightedmean = 0;
        }
       
       
	System.out.println(weightedmean);
        
    }
}