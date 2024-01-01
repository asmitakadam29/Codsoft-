/**
 * word_counter
 */
import java.util.Scanner;
public class word_counter {

    public static void main(String[] args) {
        System.out.print("enter the text:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' ') )
            {
                count++;
            }
        }
        System.out.println("number of words in text:"+ count);
    }
}