import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random_number = (int)(Math.random() * 1100 + 100);
        boolean isFound= false;
        System.out.println("Guess The Number!");
        System.out.println(random_number);
        while(!isFound){
            int num = sc.nextInt();

            if (num<random_number && num>=random_number-5){
                System.out.println("You are very close, but the number is bigger");
            }else if (num<random_number && num>=random_number-50){
                System.out.println("quite close, but quite down");
            } else if(num<random_number){
                System.out.println("you're far, the number is bigger");
            } else if(num>random_number && num<=random_number+5){
                System.out.println("You are very close, but the number is smaller");
            } else if(num>random_number && num<=random_number+50){
                System.out.println("quite close, but quite up");
            } else if(num>random_number){
                System.out.println("you're far, the number is smaller");
            }
            else{
                System.out.println("YOU FOUND THE NUMBER, BRAVO!");
                isFound=true;
            }
        }

    }
}
