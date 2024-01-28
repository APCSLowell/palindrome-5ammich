import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String a = new String();
  String b = new String();
  for (int j = 0; j < word.length(); j++){
    if (word.substring(j,j +1).equals(" ") == false && Character.isLetter(word.charAt(j))){
      String c = word.substring(j,j+1).toLowerCase();
      b = b + c;
    }
  }
  a = reverse(b);
  if (a.equals(b)){
    return true;
  }
  return false;
}
public String reverse(String str)
{
  String a = new String();
  for (int i = str.length(); i > 0; i--){
    a = a + str.substring(i-1,i);
  }
  return a;
}
}
