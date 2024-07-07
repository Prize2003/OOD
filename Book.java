public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name,Author[] author,double price){
        this.name=name;
        this.authors=author;
        this.price=price;
        qty=0;
    }

    public Book(String name,Author[] author,double price,int qty){
        this.name=name;
        this.authors=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthor(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }
    
    public String toString(){
        StringBuilder authorsList = new StringBuilder();
        for (Author author : authors) {
            authorsList.append(author).append(", ");
        }
        if (authorsList.length() > 0) {
            authorsList.setLength(authorsList.length() - 2);
        }
        return "Book[name=" + name + ", authors={" + authorsList + "}, price=" + price + ", qty=" + qty + "]";
    }
}
