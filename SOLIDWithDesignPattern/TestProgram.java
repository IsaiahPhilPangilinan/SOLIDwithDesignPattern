package SOLIDWithDesignPattern;

public class TestProgram {

    public static void main(String[] args) {

        Student student = new Student();

        Resource book = new Book("Introduction to Java");
        student.borrowResource(book);

        System.out.println();

        Resource journal = new Journal("Journal of Computer Science and Technology");
        student.borrowResource(journal);

    }

}