import java.util.Scanner;
class fight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int monsterHP = 100;
		int playerHP = 100;
		int winner = -1;
		
		
		
		while (winner < 0) {
			int monDamage = (int)(Math.random() * 100);
			int damage = (int)(Math.random() * 100);
			System.out.println("Enter 'attack' to roll damage: ");
			String trigger = input.next().toLowerCase();
			if(trigger.equals("attack")){
				playerHP = playerHP - damage;
				monsterHP = monsterHP - monDamage;
				System.out.println("You do " + monDamage + " damage to the monster" + "\nits remaining hp is " + monsterHP);
				System.out.println("The monster has delt " + damage + " to you" + "\nyour remaining hp is " + playerHP);
				if(monsterHP <= 0){
					winner += 1;
					if(playerHP <= 0){
						winner += 2;
					}
				}
				else if (playerHP <= 0){
					winner += 2;
				}
			
		}
				
		}
		if(winner == 0){
			System.out.println("player wins");
		}
		else if(winner == 1){
			System.out.println("monster wins");
		}
		else {
			System.out.println("DRAW");
		}

		 
	
		
	}
}