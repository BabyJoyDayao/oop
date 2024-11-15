public class Student extends Person {
    private String Name;
    private String Address;
    private String Program;
    private int Year;
    protected String toString;

    public Student(String name, String address, String program, int year) {
        this.Name = name;
        this.Address = address;
        this.Program = program;
        this.Year = year;
    }
    public void setName (String Name){
        this.Name = Name;
    }
    public void setAddress (String Address){
        this.Address = Address;
    }
    public void setProgram (String Program){
        this.Program = Program;
    }
    public void setYear (int Year){
        this.Year = Year;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }
    public String getProgram() {
        return Program;
    }

    public Integer getYear() {
        return Year;
    }
    public String toString(){
        return "Hello i am " + Name +
             " I live in " + Address +
                 ". I am " + Year + " year of " +
                    Program + ".";
    }
} 