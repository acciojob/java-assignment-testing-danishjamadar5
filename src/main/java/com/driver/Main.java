/**
 * Main class of the Java program. 
 * 
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //your code here
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "";
        boolean toggle = false;
        
        char[] alphabets = "abcdefghijklmnopqrstuvwyz".toCharArray();
        
        Queue<Character> q = new LinkedList();
        
        for(int i=0; i<alphabets.length; i++)
            q.add(alphabets[i]);
        
        while(N > 0) {
            char ch = q.remove();
            if (toggle)
                s = s + ch;
            else
                s = ch + s;
            
            toggle = !toggle;
            
            q.add(ch);
            N = N-1;
        }
        System.out.println(s);

           }
}
