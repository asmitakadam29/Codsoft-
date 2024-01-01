import java.util.Scanner;
public class number_play {
    public static void main(String[] args) {
        int answer=3;
        int health=0;
        int guess=0;
        int chances=3;
        boolean gameover = false;

        while(answer!=guess && !gameover){
            if(health<chances){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter number");
                guess= sc.nextInt();
                health++;

            }
            else{
                gameover = true;
            }
        }

        if(gameover){
            System.out.println("CHANCES OVER...YOU LOST!!");
        }
        
        else{
            System.out.println("YOU WON..!!");
        }

    }
    
}
