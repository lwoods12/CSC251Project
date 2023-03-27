import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/*
Logan Woods - CSC251-N803 Project 3
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
      PolicyHolder userPolicyHolder = new PolicyHolder();
      ArrayList<PolicyHolder> allPolicies = new ArrayList<PolicyHolder>();
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
         userPolicy = new Policy(userNumber, userProviderName);
         userPolicyHolder = new PolicyHolder(userFirst, userLast, userAge, userStatus, userHeight, userWeight, userPolicy);
         allPolicies.add(userPolicyHolder);
      }
      
      for (int index=0; index < allPolicies.size(); index++){
         PolicyHolder sPolicy = allPolicies.get(index);
         System.out.print(sPolicy);
         
         
         String status = sPolicy.getStatus();
         if (status.equals("smoker")){
            numSmokers++;
         }
      }
      System.out.printf("There were %d Policy objects created.\n",userPolicyHolder.numPolicyHolders);
      System.out.printf("The number of policies with a smoker is: %d\n",numSmokers);
      System.out.printf("The number of policies with a non-smoker is %d\n",allPolicies.size()-numSmokers);  
   }
      
}   