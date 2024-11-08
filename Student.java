public class Student extends Person {
    private String Program;
    private int Year;

    public Student(String name, String address, String program, int year) {
        this.Name = name;
        this.Address = address;
        this.Program = program;
        this.Year = year;
    }
    public void setProgram (String Program){
        this.Program = Program;
    }
    public void setYear (int Year){
        this.Year = Year;
    }

    public String getProgram() {
        return Program;
    }

    public Integer getYear() {
        return Year;
    }
}
