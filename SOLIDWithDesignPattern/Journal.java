package SOLIDWithDesignPattern;

public class Journal implements Resource {

    private String title;

    public Journal(String title) {

        this.title = title;

    }

    @Override
    public void borrow() {
        
        System.out.println("The student is borrowing the journal " + title + ".");

    }

}