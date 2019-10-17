import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    public static void main(String[]args) throws FileNotFoundException {
        // Initialize a list with the list of files passed as arguments
        ArrayList<String> listOfFile = new ArrayList<>();
        for (String file:args){
            listOfFile.add(file);
        }

        // Initialize a not selected book
        final Word[] words = new Word[0];
        Book book=new Book(words,"","/home/bnp-renault-014/Code/java/Projects/java-project-books/books/",false);
        int selectedFileKey=-1;

        // Start to display the menus
        ManageMenus.DisplayMainMenu(listOfFile,args.length,book,selectedFileKey);
    }

    /* HashMap<String,Integer> bookListOfWord=new HashMap<>();
    HashMap<String,Integer> orderedListOfWord = new HashMap<>();
    HashMap<String,Integer> Top50 = new HashMap<>();
    bookListOfWord=BookStats.NumbersWordsCount("/home/bnp-renault-014/Code/java/Projects/java-project-books/books/","Spinoza-Traite_Politique_processed.txt");
    BookStats.displayWordsAndInstance(bookListOfWord);
    } */
 }

