package Practice13.Task6;
//В методе main считай с консоли имя файла,
//        который содержит слова, разделенные пробелом. В методе getLine()
//        используя StringBuilder расставьте все слова в таком порядке, чтобы
//        последняя буква данного слова совпадала с первой буквой следующего не
//        учитывая регистр. Каждое слово должно участвовать 1 раз.
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFile {
    private static String  getLine(String s) {
        Queue<String> toAdd = new ArrayDeque<>(Arrays.asList(s.split(" ")));

        Set<String> added = new HashSet<>();
        added.add(toAdd.peek());

        String ans = toAdd.remove();
        boolean wasAdded = true;
        while(!toAdd.isEmpty() && wasAdded){
            wasAdded = false;
            int position;
            for (position = 0; position < toAdd.size(); position++) {
                String cur = toAdd.remove();

                if(added.contains(cur)) continue;

                if(cur.startsWith(ans.substring(ans.length()-1).toLowerCase()) || cur.startsWith(ans.substring(ans.length()-1).toUpperCase())){
                    ans += " " + cur;
                    wasAdded = true;
                    added.add(cur);
                    break;
                }
                toAdd.add(cur);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();*/
        String path = "C:\\Users\\Антон\\Desktop\\JavaPracticesR\\src\\Practice13\\Task6\\test.txt";
        String new_str = "";
        try(FileReader fr = new FileReader(path)){
            int c;
            while((c = fr.read()) != -1)
                new_str += (char) c;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(getLine(new_str));
    }
}