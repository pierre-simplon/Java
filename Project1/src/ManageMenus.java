import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ManageMenus {
    // Define local setting path
    private static final String PATH ="/home/bnp-renault-014/Code/Java/Project1/java-project-books/books/";

    public static void DisplayMainMenu(ArrayList listOfFile, int numberOfFile, Book selectedBook, int selectedFileKey) throws FileNotFoundException {
        System.out.println("Here are the actions you can do: ");
        System.out.println("[1]: List files");
        System.out.println("[2]: Add file");
        System.out.println("[3]: Delete a file");
        System.out.println("[4]: Display information about a book");
        System.out.println("[5]: Quit program");
        int answer = UsersAnswers.ReturnedInteger("Enter your choice (1-5): ",5);
        while (answer==-1){
            answer = UsersAnswers.ReturnedInteger("Enter your choice (1-5): ",5);
        }
        switch (answer){
            case 1:
                if (listOfFile.size() == 0)
                {
                    System.out.println("There was no argument passed or no file added so no file can be listed ! Add a file please");
                    DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                }
                ManageFiles.ListFiles(listOfFile);
                DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                break;
            case 2:
                String answer4=UsersAnswers.ReturnedString("Provide the file path of the file to be added please: ");
                numberOfFile++;
                selectedBook=ManageFiles.AddFile(listOfFile,answer4,numberOfFile);
                DisplayMainMenu(listOfFile,numberOfFile,selectedBook,numberOfFile);
                break;
            case 3:
                if (numberOfFile > 0) {
                    int answer3=UsersAnswers.ReturnedInteger("Provide the file number to be deleted (1-"+numberOfFile+"): ",numberOfFile);
                    while (answer3==-1){
                        answer3=UsersAnswers.ReturnedInteger("Provide the file number to be deleted (1-"+numberOfFile+"): ",numberOfFile);
                    }
                    if (answer3!=-1) {
                        listOfFile.remove(answer3-1);
                        numberOfFile--;
                        DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                    }
                }
                else {
                    System.out.println("No file can be deleted");
                    DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                }
                break;
            case 4:
                System.out.println("[1]: List files");
                System.out.println("[2]: Select a file");
                System.out.println("[3]: Other option");
                int answer2 = UsersAnswers.ReturnedInteger("Enter your choice (1-3): ",3);
                while (answer2==-1){
                    answer2 = UsersAnswers.ReturnedInteger("Enter your choice (1-3): ",3);
                }
                switch (answer2){
                    case 1:
                        if (listOfFile.size() == 0)
                        {
                            System.out.println("There was no argument passed or no file added so no file can be listed ! Add a file please");
                            DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                        }
                        ManageFiles.ListFiles(listOfFile);
                        DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                        break;
                    case 2:
                        selectedFileKey = UsersAnswers.ReturnedInteger("Provide the file number to be selected (1-" + numberOfFile + "): ", numberOfFile);
                        selectedBook=ManageFiles.SelectFile(selectedBook,listOfFile,selectedFileKey,numberOfFile);
                        DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                        break;
                    case 3:
                        System.out.println("[1]: Display the number of line of the file");
                        System.out.println("[2]: Display the number of word of the file");
                        int answer3 = UsersAnswers.ReturnedInteger("Enter your choice (1-2): ",2);
                        while (answer3==-1){
                            answer3 = UsersAnswers.ReturnedInteger("Enter your choice (1-2): ",2);
                        }
                        switch (answer3){
                            case 1:
                                if (selectedBook.IsSelected(selectedBook)){
                                    //String filename = String.valueOf(listOfFile.get(selectedFileKey));
                                    //System.out.println("The file: "+filename+"is selected for line count -----");
                                    //System.out.println("The number of line is: "+BookStats.LinesCount(path,filename));
                                    System.out.println("The file: "+selectedBook.getTitle(selectedBook)+"is selected for line count -----");
                                    System.out.println("The number of line is: "+BookStats.LinesCount(PATH,selectedBook.getTitle(selectedBook)));
                                }
                                else {
                                    System.out.println("Please select a file first");
                                    DisplayMainMenu(listOfFile,numberOfFile,selectedBook,selectedFileKey);
                                }
                            case 2:
                                break;
                        }

                break;
            case 5:
                System.out.println("Bye bye !");
                break;
            }
        }
    }
}
