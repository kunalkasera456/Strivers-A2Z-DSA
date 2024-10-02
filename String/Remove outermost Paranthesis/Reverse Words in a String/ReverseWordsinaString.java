import java.util.ArrayList;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        s = s.trim(); // s = "hello world"
        int i = 0;
        ArrayList<String> li = new ArrayList<>();
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;   //skiping spaces
            }
            if (i >= s.length())
                break;  //reaches at end

            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            li.add(s.substring(i, j));
            i = j;
        }
        
        for (int j = li.size()-1; j >= 1; j--) {
            System.out.print(li.get(j)+" ");
        }
        System.out.print(li.get(0));
    }
}
