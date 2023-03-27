public class Policy{
   private int number; // Define private variables
   private String providerName;
      
   public Policy(){ //Define no-arg construcor
      number = 1234;
      providerName = "State Farm";
      
   }
   
   public Policy(int usernumber, String userprovider){ //Define constructor with args
      number = usernumber;
      providerName = userprovider;
   }
   
   
   // Define 'Setters'
   /*
      setNumber sets the User's policy number
      @param usernumber The user's policy number
   */
   
   public void setNumber(int usernumber){
      number = usernumber;
   }
   
   
   /*
      setProvider sets the User's provider name
      @param userprovider The user's policy number
   */
   public void setProvider(String userprovider){
      providerName = userprovider;
   }
   
   
   
   //Define 'Getters'
   
   /*
      @return The user's policy number
   */
   public int getNumber(){
      return number;
   }
   
   /*
      @return The user's provider
   */
   public String getProvider(){
      return providerName;
   }
   
   /*
      toString displays information about the policy
   */
     
   public String toString(){
      String str = "\nPolicy Number: " + this.getNumber() +
      "\nPolicy Name: " + this.getProvider() + "\n\n";
      return str;
   }
   
}