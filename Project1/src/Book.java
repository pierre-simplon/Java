public class Book {
    private Word[] words;
    private String title;
    private String path;
    private boolean isSelected;

    public Book(Word[] words, String title,String path,boolean isSelected) {
        this.words = words;
        this.title = title;
        this.path = path;
        this.isSelected = isSelected;
    }

    public Word[] getWords() {
        return words;
    }

    public String getTitle(Book book){
        return book.title;
    }

    public boolean IsSelected(Book book){
        return book.isSelected;
    }

    public void setSelected(Book book,boolean isSelected) {
        this.isSelected=isSelected;
    }

    public void setPath(Book book, String path){
        this.path=path;
    }
}
