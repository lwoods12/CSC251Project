public class Policy{
   private int number; // Define private variables
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public Policy(){ //Define no-arg construcor
      number = 1234;
      providerName = "State Farm";
      firstName = "John";
      lastName = "Doe";
      age = 24;
      smokingStatus = "non-smoker";
      height = 62.0;
      weight = 250.5;
   }
   
   public Policy(int usernumber, String userprovider, String userfirst, String userlast, int userage, String userstatus, double userheight, double userweight){ //Define constructor with args
      number = usernumber;
      providerName = userprovider;
      firstName = userfirst;
      lastName = userlast;
      age = userage;
      smokingStatus = userstatus;
      height = userheight;
      weight = userweight;
   }
   
   
   // Define 'Setters'
   public void setNumber(int usernumber){
      number = usernumber;
   }
   public void setProvider(String userprovider){
      providerName = userprovider;
   }
   public void setFirst(String userfirst){
      firstName = userfirst;
   }
   public void setLast(String userlast){
      lastName = userlast;
   }
   public void setAge(int userage){
      age = userage;
   }
   public void setStatus(String userstatus){
      smokingStatus = userstatus;
   }
   public void setHeight(double userheight){
      height = userheight;
   }
   public void setWeight(double userweight){
      weight = userweight;
   }
   
   //Define 'Getters'
   public int getNumber(){
      return number;
   }
   
   public String getProvider(){
      return providerName;
   }
   
   public String getFirst(){
      return firstName;
   }
   
   public String getLast(){
      return lastName;
   }
   
   public int getAge(){
      return age;
   }
   
   public String getStatus(){
      return smokingStatus;
   }
   
   public double getHeight(){
      return height;
   }
   
   public double getWeight(){
      return weight;
   }
   
   public double calcBMI(){ // Calculate the Body Mass Index
      return (weight * 703) / (height * height);
   }
   
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