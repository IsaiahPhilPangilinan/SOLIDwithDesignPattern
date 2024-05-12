package SOLIDWithDesignPattern;

public class Book implements Resource {

    private String title;

    public Book(String title) {

        this.title = title;
        
    }

    @Override
    public void borrow() {

        System.out.println("The student is borrowing the book " + title + ".");

    }

}