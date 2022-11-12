package src;
import java.util.*;

public class A_Rightmost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char s[] = S.toCharArray();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (s[i] == 'a') {
            ans = i+1;
            }
        }
        scanner.close();

        if(ans == 0) {
            ans = -1;
        }

        System.out.println(ans);
    }
}