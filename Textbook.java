public class Textbook extends book{
    protected String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Textbook() {
        super();
        subject = "";

    }

    public Textbook(String title, int year, double price, String subject) {
        super();
        this.subject = subject;

    }

    public void print() {
        super.print();
        System.out.println("subject : " + subject);

    }

}