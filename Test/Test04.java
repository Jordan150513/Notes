import java.io.BufferedReader;
import java.io.FileReader;

public class Test04{
	public static void main(String args[]){
		System.out.println("File reader:");
		 int num = countWordInFile("a.txt","qiao");
		 System.out.println("num: "+num);
	}


    public static int countWordInFile(String filename, String word) {
        int counter = 0;
        try (FileReader fr = new FileReader(filename)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return counter;
    }
}
