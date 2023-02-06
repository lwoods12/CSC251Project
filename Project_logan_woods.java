import java.util.Scanner;

/*
Logan Woods - CSC251-N803 Project 1
*/

public class Project_logan_woods{

   public static void main(String[] args){
      int userNumber;
      String userProviderName;
      String userFirst;
      String userLast;
      int userAge;
      String userStatus;
      double userHeight;
      double userWeight;
      
      Scanner scnr = new Scanner(System.in);
      
      // Get user input
      
      System.out.print("Please enter the Policy Number: ");
      userNumber = scnr.nextInt();
      System.out.print("Please enter the Provider Name: ");
      scnr.nextLine();
      userProviderName = scnr.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      userFirst = scnr.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      userLast = scnr.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      userAge = scnr.nextInt();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      scnr.nextLine();
      userStatus = scnr.nextLine();
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      userHeight = scnr.nextDouble();
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      userWeight = scnr.nextDouble();
      
      // Create user-based policy with arg constructor
      Policy userPolicy = new Policy(userNumber, userProviderName, userFirst, userLast, userAge, userStatus, userHeight, userWeight);
      
      // Display information via userPolicy 'Getters'
      System.out.printf("Policy Number: %d\n", userPolicy.getNumber());
      System.out.printf("Policy Name: %s\n", userPolicy.getProvider());
      System.out.printf("Policyholder’s First Name: %s\n", userPolicy.getFirst());
      System.out.printf("Policyholder’s Last Name: %s\n", userPolicy.getLast());
      System.out.printf("Policyholder’s Age: %d\n", userPolicy.getAge());
      System.out.printf("Policyholder’s Smoking Status: %s\n", userPolicy.getStatus());
      System.out.printf("Policyholder’s Height: %,.1f\n", userPolicy.getHeight());
      System.out.printf("Policyholder’s Weight: %,.1f\n", userPolicy.getWeight());
      System.out.printf("Policyholder’s BMI: %,.2f\n", userPolicy.calcBMI()); 
      System.out.printf("Policy Price: $%,.2f\n", userPolicy.calcInsurancePrice());  
   }
      
}   