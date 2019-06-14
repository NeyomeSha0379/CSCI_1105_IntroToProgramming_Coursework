import java.util.Scanner;
public class textAv {

	public static void main(String[] args) {
		int health = 100;
		boolean charAlive = true;
		char[] dung = {'x' , ',' , ',' , ',' , ',' , ',' , ',' , ',' , ',' , ','};
		int charLocation = 0;
		
		while(charAlive){
			for(int i = 0; i < dung.length;i++){
				if(dung[i] == 'x'){
					charLocation = i;
				}
			}
			if(charLocation == 0){
				charAlive = roomOne();
				break;
			}
			
			else if(charLocation == 1){
				charAlive = roomTwo();
				//charAlive = fight();
				break;
			}	
//			
//			else if(){
//				
//			}
		}
		
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 1; i++) {
			System.out.println("You have entered a dark hallway." + "\nlooks like the hallway turns left." + "\nWhat do you do?" + "\nEnter one word: ");
			String choose2 = input.next().toUpperCase();
			if(choose2.equals("LEFT")) {
				System.out.println("|.'.'',                              ,''.'.'.'|\r\n" + 
						"|.'.'.'',                          ,''.'.'.'.'|\r\n" + 
						"|.'.'.'.'',                      ,''.'.'.'.'.'|\r\n" + 
						"|.'.'.'.'.|_____________________|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|===|======.-.========|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|:::|:::::(o.o):::::::|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|---|------|=|--------|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|:::|:::::__|__ ::::::|.'.'.'.'.'.'.|\r\n" + 
						"|,',',',',|---|---//.=|=.\\\\-----|,',',',', , ,|\r\n" + 
						"|.'.'.'.'.|:::|::// .=|=. \\\\::::|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|---|--\\\\ .=|=. //----|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|===|===\\\\(_=_)//=====|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|%%%%%%%%(:| |:)%\\      ,.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.','       /%|| ||%%%\\       ','.'.'.'.|\r\n" + 
						"|.'.'.','        /%%() ()%%%%\\        ','.'.'.|\r\n" + 
						"|.'.','         /%%%|| ||%%%%%\\         ','.'.|\r\n" + 
						"|.','          /%%%%|| ||%%%%%%\\          ','.|\r\n" + 
						"|;____________/%%%%==' '==%%%%%%\\____________;|");
			}
			else {
				System.out.println("it is too late to turn back now");
				i--;
			}
			break;
		}
		for(int i = 0; i < 1; i++)
			System.out.println("An undead is blocking your path what do you do?" + "\nEnter one word: ");
			String choose3 = input.next().toUpperCase();
			if(choose3.equals("ATTACK")){
				System.out.println("Damage is " + (int)(Math.random() * 100));
			}
	}
	
	public static boolean roomOne(){
		Scanner input = new Scanner(System.in);
		System.out.println("   ,-' ;  ! `-." + "\n  / :  !  :  . \\" + "\n |_ ;   __:  ;  |" + "\n )| .  :)(.  !  |" + 
		"\n |\"    (##)  _  |" + "\n |  :  ;`'  (_) (" + "\n |  :  :  .     |" + "\n )_ !  ,  ;  ;  |" + "\n || .  .  :  :  |" +
				"\n |\" .  |  :  .  |" + "\n |_____;----.___|");
		for(int i = 0; i < 1; i++) {
			System.out.println("You are standing infront of a large door" + "\nWhat will you do?" + "\nEnter one word: ");
			String choose = input.next().toUpperCase();
			if(choose.equals("OPEN")) {
				System.out.println("|.'',                                  ,''.''.|\r\n" + 
						"|.'.'',                              ,''.'.'.'|\r\n" + 
						"|.'.'.'',                          ,''.'.'.'.'|\r\n" + 
						"|.'.'.'.'',                      ,''.'.'.'.'.'|\r\n" + 
						"|.'.'.'.'.|_____________________|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|===|=================|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|:::|:::::::::::::::::|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|---|-----------------|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|:::|:::::::::::::::::|.'.'.'.'.'.'.|\r\n" + 
						"|,',',',',|---|-----------------|,',',',', , ,|\r\n" + 
						"|.'.'.'.'.|:::|:::::::::::::::::|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|---|-----------------|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|===|=================|.'.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.'.|%%%%%%%%%%%%%%%%\\      ,.'.'.'.'.'.|\r\n" + 
						"|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\r\n" + 
						"|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\r\n" + 
						"|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\r\n" + 
						"|.','          /%%%%%%%%%%%%%%%\\          ','.|\r\n" + 
						"|;____________/%%%%%%%%%%%%%%%%%\\____________;|");
			
			}
			else {
				System.out.println("Are you to afriad to open the door?");
				i--;
			}
		}
		return true;

	}
}
