import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/*
Logan Woods - CSC251-N803 Project 2
*/

public class Project_logan_woods{

   public static void main(String[] args) throws IOException{
      int userNumber;
      String userProviderName;
      String userFirst;
      String userLast;
      int userAge;
      String userStatus;
      double userHeight;
      double userWeight;
      File file = new File("PolicyInformation.txt");
      Scanner scnr = new Scanner(file);
      Policy userPolicy = new Policy();
      ArrayList<Policy> allPolicies = new ArrayList<Policy>();
      int numSmokers = 0; 
      
      // Get user input
      
      while (scnr.hasNext()){
         userNumber = scnr.nextInt();
         scnr.nextLine();
         userProviderName = scnr.nextLine();
         userFirst = scnr.nextLine();
         userLast = scnr.nextLine();
         userAge = scnr.nextInt();
         scnr.nextLine();
         userStatus = scnr.nextLine();
         userHeight = scnr.nextDouble();
         userWeight = scnr.nextDouble();
      
         // Create user-based policy with arg constructor
         userPolicy = new Policy(userNumber, userProviderName, userFirst, userLast, userAge, userStatus, userHeight, userWeight);
         allPolicies.add(userPolicy);
      }
      
      for (int index=0; index < allPolicies.size(); index++){
         Policy sPolicy = allPolicies.get(index);
         // Display information via userPolicy 'Getters'
         System.out.printf("Policy Number: %d\n", sPolicy.getNumber());
         System.out.printf("Policy Name: %s\n", sPolicy.getProvider());
         System.out.printf("Policyholder’s First Name: %s\n", sPolicy.getFirst());
         System.out.printf("Policyholder’s Last Name: %s\n", sPolicy.getLast());
         System.out.printf("Policyholder’s Age: %d\n", sPolicy.getAge());
         
         String status = sPolicy.getStatus();
         if (status.equals("smoker")){
            numSmokers++;
         }
         System.out.printf("Policyholder’s Smoking Status: %s\n", status);
         System.out.printf("Policyholder’s Height: %,.1f\n", sPolicy.getHeight());
         System.out.printf("Policyholder’s Weight: %,.1f\n", sPolicy.getWeight());
         System.out.printf("Policyholder’s BMI: %,.2f\n", sPolicy.calcBMI()); 
         System.out.printf("Policy Price: $%,.2f\n", sPolicy.calcInsurancePrice());
         System.out.printf("\n");
      }
      
      System.out.printf("The number of policies with a smoker is: %d\n",numSmokers);
      System.out.printf("The number of policies with a non-smoker is %d\n",allPolicies.size()-numSmokers);  
   }
      
}   