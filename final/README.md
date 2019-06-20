**Java-textAv-game**
___
**Synopsis**


This is a basic text adventure game built in java using methods and arrays.
Use the basic battle system to fight the monster that await you.
___
**Motivation**

This is a final project for my programming class.

I thought it would be fun way to fill the requrierments without making another black jack game.
___
**How to Play**

You play by following the instructions given to you while you play. 

Enter the requested word and move along in the game.

When you encounter a monster the game will take you to a battle

system. Just type attack and it will randomly deal damage to you and the monster.
___
**Testing**

I tested all of my methods using junit4. 

I got zero erros in my testing of the program. 
___
**Code Example**

This is my battle system code for the game. The code is used to keep track of health and damage output for both player and monster.

```Java
	public static boolean fight() {
		Scanner input = new Scanner(System.in);
		int monsterHP = 100;
		int playerHP = 100;
		int winner = -1;
		while (winner < 0) {
			int monDamage = (int)(Math.random() * 100);
			int damage = (int)(Math.random() * 75);
			System.out.println("Enter 'attack' to roll damage: ");
			String trigger = input.next().toLowerCase();
			if(trigger.equals("attack")){
				playerHP = playerHP - damage;
				monsterHP = monsterHP - monDamage;
				System.out.println("Damage for the monster and the player happens at the same time.");
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
			return true;
		}
		else if(winner == 1){
			System.out.println("monster wins");
			return false;
		}
		else {
			System.out.println("DRAW");
			return false;
			
		}

		 
		
	}
