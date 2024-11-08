public class Book {
    private int book_number;
    private String title;
    private String author;
    private Double price;
//setters
    public void setbookNumber(int b_number) {
      this.book_number = b_number;
    }
    public void setTitle(String Title){
      this.title = Title;
    }
    public void setAuthor(String Author){
        this.author = Author;
    }
    public void setPrice(Double Price){
        this.price = Price;
    }

//getters
    public int getbookNumber() {
        return book_number;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Double getPrice() {
        return price;
    }

}