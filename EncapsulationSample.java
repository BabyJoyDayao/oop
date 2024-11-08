public class EncapsulationSample{

    public static void main(String[] args) {
        System.out.println("STUDENT: ");
        Student student1 = new Student();
        student1.setId(1234);
        student1.setname("Student_1");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student name: " + student1.getname());
        System.out.println(" ");

        System.out.println("BOOK: ");
        Book Book1 = new Book();
        Book1.setbookNumber(567);
        Book1.setTitle("Having a Good Mother");
        Book1.setAuthor("unknown");
        Book1.setPrice (347.90);

        System.out.println("Book Number: " + Book1.getbookNumber());
        System.out.println("Book Title: " + Book1.getTitle());
        System.out.println("Book Author: " + Book1.getAuthor());
        System.out.println("Book Price: " + Book1.getPrice());
    }

 
}

