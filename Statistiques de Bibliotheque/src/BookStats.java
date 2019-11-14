import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookStats {

    // This method count the number of words in a file excluding doubles and return it
    public static int SingleWordsCount(String Path, String Filename) throws FileNotFoundException{
        // I chose a Set collection as I don't want to count doubles
        Set<String> MyList = new HashSet<>();

        try (Scanner scan = new Scanner(new File(Path + Filename))) {
            while (scan.hasNextLine()) {
                MyList.add(scan.nextLine());
            }
        } catch (FileNotFoundException FileNotFoundError) {
            FileNotFoundError.printStackTrace();
        }
        return MyList.size();
    }

    // This method count the number of words in a file excluding doubles and return it
    public static int LinesCount(String Path, String Filename) throws FileNotFoundException{
        ArrayList<String> MyList = new ArrayList<>();

        try (Scanner scan = new Scanner(new File(Path+Filename))){
            while (scan.hasNextLine()){
                MyList.add(scan.nextLine());
            }
        } catch (FileNotFoundException FileNotFoundError) {
            FileNotFoundError.printStackTrace();
        }
        return MyList.size();
    }

    // This method count the number instance of each words in a file and return the corresponding HasMap (word,number of instance)
    public static HashMap NumbersWordsCount(String Path, String Filename) throws FileNotFoundException {
        // I chose a HashMap as I want to have a pair of (words,number of words)
        HashMap<String,Integer> MyList = new HashMap<>();
        int count=0;
        String wordProcessed;
        try (Scanner scan = new Scanner(new File(Path+Filename))) {
            while (scan.hasNextLine()) {
                wordProcessed=scan.nextLine();
                // Initialize the number of Instance
                int numberOfInstance=0;
                // Check if the word is already in MyList of not
                if (MyList.containsKey(wordProcessed)){
                    // retrieve the number of instance of this word
                    numberOfInstance=MyList.get(wordProcessed);
                }
                // Add an instance of this word
                MyList.put((wordProcessed),numberOfInstance+1);
            }
        }
        return MyList;
    }

    // This method display a HashMap content of (String word,Integer number of word instance)
    public static void displayWordsAndInstance(HashMap<String,Integer> bookListOfWord){
        for (String word : bookListOfWord.keySet()) {
            Integer value = bookListOfWord.get(word);
            System.out.println("Word = " + word + ", Value = " + value);
        }
    }

    // This method sort a HashMap content of (String words , Integer number of word instance) with a TreeMap and returned the Top N instance of values
    public static TreeMap<String,Integer> TopInstance(HashMap<String,Integer> bookListOfWord,int N){
        TreeMap<String,Integer> Top = new TreeMap<>();
        Word[] topWords=new Word[N-1];
        Collection<Integer> listOfInstanceNumber = bookListOfWord.values();
        return Top;
    }
}