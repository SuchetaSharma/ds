package datastructures;

import java.io.*;
import java.util.*;
public class Test {
   public static void main(String args[] ) throws Exception {

	//Write code here
   //num of doctors
   int patNum = Integer.parseInt(args[0]);
   System.out.println(patNum);

   //num of patients
   int docNum = Integer.parseInt(args[1]);
   System.out.println(docNum);
   int count = 2;
   int[][] doctorPatientEffortsArray = new int[docNum][patNum];
   //doctor/patient efforts array
   for(int row=0; row < docNum; row++){
      for(int col = 0; col < patNum; col++){
    	  System.out.println(Integer.parseInt(args[count]));
         doctorPatientEffortsArray[row][col] = Integer.parseInt(args[count]);
         count ++;
      }
   }
   //2 4 1 1 1 1 2 1 2 1
   
   int[] arrOfSumofEffortsbyDoctor = new int[doctorPatientEffortsArray.length];
   int sumofEffortsbyaDoctor = 0;

   for ( int d = 0; d< doctorPatientEffortsArray.length; d++){
      for(int p = 0; p< doctorPatientEffortsArray[0].length; p++){
            sumofEffortsbyaDoctor += doctorPatientEffortsArray[d][p];
      }
       arrOfSumofEffortsbyDoctor[d] = sumofEffortsbyaDoctor;
       sumofEffortsbyaDoctor = 0;
   }
   for(int k = 0; k< arrOfSumofEffortsbyDoctor.length; k++) {
	   
	   System.out.println("element is" + arrOfSumofEffortsbyDoctor[k]);
   }
   int minimumEfforts = getMinimumEfforts(arrOfSumofEffortsbyDoctor);
   }

   private static int getMinimumEfforts(int[] arrOfSumofEffortsbyDoctor){
      int temp = 0;
      for(int i=0; i< arrOfSumofEffortsbyDoctor.length; i++){
         for(int j = i+1; j< arrOfSumofEffortsbyDoctor.length; j++){
            if(arrOfSumofEffortsbyDoctor[i] > arrOfSumofEffortsbyDoctor[j]){
                  temp = arrOfSumofEffortsbyDoctor[i];
                  arrOfSumofEffortsbyDoctor[i] = arrOfSumofEffortsbyDoctor[j];
                  arrOfSumofEffortsbyDoctor[j] = temp;
            }
         }

         
      }
      System.out.println("minimum number is"+ arrOfSumofEffortsbyDoctor[0]);
      return arrOfSumofEffortsbyDoctor[0];
   }
}