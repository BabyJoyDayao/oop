public class InheritanceSample {
    public static void main(String[] args){

    System.out.println("STUDENT:");
    Student student1 = new Student("Dayao, Baby Joy c.", "Brgy. Sucol Bal. Bats.", "BSIT", 2);
    System.out.println("Name: " + student1.getName());
    System.out.println("Address: " + student1.getAddress());
    System.out.println("Program: " + student1.getProgram());
    System.out.println("Year: " + student1.getYear());
    System.out.println();

    System.out.println("STAFF:");
    Staff staff1 = new Staff("May Dellamas", "Brgy. Carenahan Bal. Bats.", "STI-Balayan", 5621.00);
    System.out.println("Name: " + staff1.getName());
    System.out.println("Address: " + staff1.getAddress());
    System.out.println("Program: " + staff1.getSchool());
    System.out.println("Year: " + staff1.getSalary());
     }

}


