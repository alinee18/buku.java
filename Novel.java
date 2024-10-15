public class Novel extends book {
    protected String Genre;


    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Novel(String genre2, String title, int year, double price, String subject) {
        super();
        Genre = "";
    }

    public Novel(String title, int year, int price, String Genre) {
        super();
        this.Genre = Genre;
    } 

    public void print() {
        super.print();
        System.out.println("Genre : " + Genre);
    }

}
    

