class dog{
    String Name;
    boolean isMale;
    int numbersOfPuppies;
    String [] listOfPuppies;

    public void setName (String name){
        Name = name;
    }

    public String showName(){
        return Name;
    }  

    public void bark(){
        System.out.println( "woof! woof!");    
    } 

    public void setNumberOfPuppies(int numOfPuppies){
        numbersOfPuppies = numOfPuppies;
    }

   public void setPuppies(String[] puppy){
    listOfPuppies = puppy;
   }

   public void showPuppies(){
    for(int i = 0; i < listOfPuppies.length; i++){
        System.out.println("Puppie's Name: " + listOfPuppies.length);
    }
   }
}
