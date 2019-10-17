import java.util.ArrayList;

public class ManageFiles {

    // method to list the files
    public static void ListFiles(ArrayList<String> listOfFile){
        System.out.println("Here is the list of files: ");
        listOfFile.forEach((file)->System.out.println("["+(listOfFile.indexOf(file)+1)+"]: "+file));
    }

    // method to Add a file and return the corresponding book instance
    public static Book AddFile(ArrayList<String> listOfFile,String file,int number){
        Word[] words = new Word[0];
        Book book=new Book(words,file,file,false);
        listOfFile.add(file);
        System.out.println("The file "+file+" was added");
        return book;
    }

    // method to select of file, inform about the selection and return the corresponding book instance
    public static Book SelectFile(Book book,ArrayList<String> listOfFile, int selection, int numberOfFile) {
        book.setSelected(book,true);
        System.out.println("The file "+(listOfFile.get(selection-1))+" is selected");
        return book;
    }
}
