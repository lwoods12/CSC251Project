public class PolicyHolder{
   private Policy policy;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public PolicyHolder(){ //no-arg constructor
      firstName = "John";
      lastName = "Doe";
      age = 24;
      smokingStatus = "non-smoker";
      height = 62.0;
      weight = 250.5;
  }
  
  public PolicyHolder(String userfirst, String userlast, int userage, String userstatus, double userheight, double userweight){ //Define constructor with args
      firstName = userfirst;
      lastName = userlast;
      age = userage;
      smokingStatus = userstatus;
      height = userheight;
      weight = userweight;
   }
   
   /*
      setFirst sets the User's first name
      @param userfirst The user's first name
   */
   public void setFirst(String userfirst){
      firstName = userfirst;
   }
   
   /*
      setLast sets the User's last name
      @param userlast The user's last name
   */
   public void setLast(String userlast){
      lastName = userlast;
   }
   
   /*
      setAge sets the User's age
      @param userage The user's age
   */
   public void setAge(int userage){
      age = userage;
   }
   
   /*
      setStatus sets the User's policy status
      @param userstatus The user's policy status
   */
   public void setStatus(String userstatus){
      smokingStatus = userstatus;
   }
   
   /*
      setHeight sets the User's height
      @param userheight The user's height
   */
   public void setHeight(double userheight){
      height = userheight;
   }
   
   /*
      setWeight sets the User's weight
      @param userweight The user's weight
   */
   public void setWeight(double userweight){
      weight = userweight;
   }
   
   /*
      @return The user's first name
   */
   public String getFirst(){
      return firstName;
   }
   
   /*
      @return The user's last name
   */
   public String getLast(){
      return lastName;
   }
   
   /*
      @return The user's age
   */
   public int getAge(){
      return age;
   }
   
   /*
      @return The user's policy status
   */
   public String getStatus(){
      return smokingStatus;
   }
   
   /*
      @return The user's height
   */
   public double getHeight(){
      return height;
   }
   
   /*
      @return The user's weight
   */
   public double getWeight(){
      return weight;
   }
   
   /*
      @return The user's calculated BMI
   */
   public double calcBMI(){ // Calculate the Body Mass Index
      return (weight * 703) / (height * height);
   }
   
   /*
      @return The user's calculated Insurance Price
   */
   public double calcInsurancePrice(){ // Calculate the Insurance Policy Price
      double cost = 600.00;
      if (age > 50){
         cost = cost + 75.00;
      }
      
      if (smokingStatus.equals("smoker")){
         cost = cost + 100.00;
      }
      
      if (calcBMI() > 35){
         cost = cost + ((calcBMI() - 35)*20);
      }
      return cost;
   }
}