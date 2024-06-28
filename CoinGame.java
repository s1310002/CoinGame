import java.util.Random;
//import java.util.Scanner;

public class CoinGame{
    public static void main(String[] args){
	
	Random random = new Random();
	int headscnt = 0;
	int tailscnt = 0;

	//Scanner scanner = new Scanner(System.in);
	//System.out.println("Who are you?");
	//System.out.print(">");
	//String username = scanner.nextLine();
	//System.out.println("Hello, " + username + "!");
	
	System.out.println("Tossing a coin...");
	for(int i=1;i<=3;i++){
	    boolean isHeads = random.nextBoolean();
	    if(isHeads){
		System.out.println("Round " + i + ": Heads");
		headscnt++;
	    }else{
		System.out.println("Round " + i + ": Tails");
		tailscnt++;
	    }
	}

	System.out.println("Heads: " + headscnt + ", Tails: " + tailscnt);
 
	//if(headscnt > tailscnt){
	//  System.out.println(username + " won!");
	    //System.out.println("You won");
	//}else{
	//  System.out.println(username + " lost!");
	    //System.out.println("You lost");
	//}
    }
}
    
