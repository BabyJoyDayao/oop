public class Person {
    protected String Name;
    protected String Address;
    protected String toString;

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public String getName(){
        return Name;
    }

    public String getAddress(){
        return Address;
    }
    public String toString(){
        return "Hello i am " + Name + " and " + "i live in " + Address + ".";
    }
}
