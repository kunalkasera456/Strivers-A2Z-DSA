

public class RemoveoutermostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        int n = s.length();
        String ans = "";
        int balance = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
                if (balance > 1) {
                    ans = ans + c;
                }
            } else {
                if (balance > 1) {
                    ans = ans + c;
                }
                balance--;
            }
        }
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
