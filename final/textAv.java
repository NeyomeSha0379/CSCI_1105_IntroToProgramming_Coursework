import java.util.Scanner;
public class textAv {

	public static void main(String[] args) {
		int health = 100;
		boolean charAlive = true;
		char[] dung = {'x' , ',' , ',' , ',' , ',' , ',' , ',' , ',' , ',' , ','};
		int charLocation = 0;
		Scanner input = new Scanner(System.in);
		while(charAlive) {
			for(int i = 0; i < dung.length; i++) {
				if(dung[i] == 'x') {
					charLocation = i;
					System.out.println("Char location = " + charLocation);
				}
			
			if(charLocation == 0) {
				charAlive = roomOne();
				if(charAlive == true) {
					dung[charLocation] = ',';
					dung[charLocation + 1] = 'x';
					continue;
				
				}
			}
			else if(charLocation == 1) {
				charAlive = roomTwo();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
				}
			}
			else if(charLocation == 2){
				charAlive = roomThree();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
			}
			}
			else if(charLocation == 3){
				charAlive = roomFour();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
			}
			}
			else if(charLocation == 4){
				charAlive = roomFive();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
			}
			}
			/*else if(charLocation == 5){
				charAlive = roomSix();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
			}
			}
			else if(charLocation == 6){
				charAlive = roomSeven();
				if(charAlive == true){
				dung[charLocation] = ',';
				dung[charLocation + 1] = 'x';
				continue;
			}
			}
			*/
			}
		}
		
	}
	
	public static boolean roomOne(){
		Scanner input = new Scanner(System.in);
		System.out.println("   ,-' ;  ! `-." + "\n  / :  !  :  . \\" + "\n |_ ;   __:  ;  |" + "\n )| .  :)(.  !  |" + 
		"\n |\"    (##)  _  |" + "\n |  :  ;`'  (_) (" + "\n |  :  :  .     |" + "\n )_ !  ,  ;  ;  |" + "\n || .  .  :  :  |" +
				"\n |\" .  |  :  .  |" + "\n |_____;----.___|");
		
		System.out.println("You are standing infront of a large door" + "\nWhat will you do?" + "\nEnter one word: ");
		String choose = input.next().toLowerCase();
		System.out.println(choose);
		while(!choose.equals("open")){
			System.out.println("Are you afraid to open the door?");
			System.out.println("You are standing infront of a large door" + "\nWhat will you do?" + "\nEnter one word: ");
			choose = input.next().toLowerCase();
		}
		
		return true;

		
	}
	public static boolean roomTwo() {
		Scanner input = new Scanner(System.in);
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
	
	System.out.println("You are in a dark hallway" + "\nIt looks like the hall turns left" + "\nWhat do you do?"
	+ "\nEnter one word: ");
	String choose2 = input.next().toLowerCase();
	while(!choose2.equals("left")){
		System.out.println("It is to late to turn back now");
	System.out.println("You are in a dark hallway" +
				"\nIt looks like the hall turns left" +
			"\nWhat do you do?" + "\nEnter one word: ");
		choose2 = input.next().toLowerCase();
	}
		return true;
	}
	
	public static boolean roomThree() {
		Scanner input = new Scanner(System.in);
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
				System.out.println("As you round the corner you notice" + "\nAn undead stading in the middle of the hall" + 
				"\ndo you try and run past or fight" + "\nEnter one word: ");
				String choose3 = input.next().toLowerCase();
				while(!choose3.equals("fight")){
					System.out.println("Stand and fight!");
					System.out.println("An undead stading in the middle of the hall" + 
				"\ndo you try and run past or fight" + "\nEnter one word: ");
				choose3 = input.next().toLowerCase();
				}
				return true;
	}
	
	public static boolean roomFour() {
		Scanner input = new Scanner(System.in);
		System.out.println("|.'',                                     ,''.|\r\n" + 
				"|.'.'',                                 ,''.'.|\r\n" + 
				"|.'.'.'',                             ,''.'.'.|\r\n" + 
				"|.'.'.'.'',                         ,''.'.'.'.|\r\n" + 
				"|.'.'.'.'.,.. ______________________|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|=================|===|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|:::::::::::::::::|:::|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|-----------------|---|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|:::::|HERE->|::::|:::|.'.'.'.'.|\r\n" + 
				"|,',',',',',',|-----------------|---|,',',',',|\r\n" + 
				"|.'.'.'.'.'.'.|:::::::::::::::::|:::|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.' |-----------------|---|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|=================|===|.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'      /%%%%%%%%%%%%%%%%|.'.'.'.'.|\r\n" + 
				"|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\r\n" + 
				"|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\r\n" + 
				"|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\r\n" + 
				"|.','          /%%%%%%%%%%%%%%%\\          ','.|\r\n" + 
				"|;____________/%%%%%%%%%%%%%%%%%\\____________;|");
				System.out.println("At end of the hall you notice a sign" + "\nThe sign is prompting you" +
				"\nWhat do you do?" + "\nEnter one word: ");
				String choose4 = input.next().toLowerCase();
				while(!choose4.equals("right")){
					System.out.println("We must push on and figure out where the undead came from.");
					System.out.println("The sign is prompting you" +
				"\nWhat do you do?" + "\nEnter one word: ");
					choose4 = input.next().toLowerCase();
					
					
				}
				return true;
		
	}
	public static boolean roomFive() {
		Scanner input = new Scanner(System.in);
		System.out.println("|.'',                                     ,''.|\r\n" + 
				"|.'.'',                                 ,''.'.|\r\n" + 
				"|.'.'.'',                             ,''.'.'.|\r\n" + 
				"|.'.'.'.'',                         ,''.'.'.'.|\r\n" + 
				"|.'.'.'.'.,.. ___________________.'. .'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|=================|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|:::::::::::::::::|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|-----________----|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|:::::|[]  []|::::|.'.'.'.'.'.'.|\r\n" + 
				"|,',',',',',',|-----|  _|_ |----|,',',',',',',|\r\n" + 
				"|.'.'.'.'.'.'.|:::::|o  |  |::::|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.' |-----|[]  []|----|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'.|=================|.'.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.'.'.'      /%%%%%%%\\      '.'.'.'.'.'.|\r\n" + 
				"|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\r\n" + 
				"|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\r\n" + 
				"|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\r\n" + 
				"|.','          /%%%%%%%%%%%%%%%\\          ','.|\r\n" + 
				"|;____________/%%%%%%%%%%%%%%%%%\\____________;|");
				System.out.println("You see a door at the end of the hall" + "\nLight seems to be leaking in" + 
				"\nFrom behind the door." + "\nWhat do you do?" + "\nEnter one word: ");
				String choose5 = input.next().toLowerCase();
				while(!choose5.equals("open")){
					System.out.println("Do you wish to stay in these dark halls forever?");
					System.out.println("Light seems to be leaking in" + 
				"\nFrom behind the door." + "\nWhat do you do?" + "\nEnter one word: ");
					choose5 = input.next().toLowerCase();
				}
				return true;
		
	}
	
	public static boolean roomSix() {
		Scanner input = new Scanner(System.in);
		System.out.println("                _____\r\n" + 
				"             .-,;='';_),-.\r\n" + 
				"              \\_\\(),()/_/ /\\\r\n" + 
				"                ( ___ )   ||\r\n" + 
				"       wWWWw   ,-/`~`\\-,__||_ wWWWw\r\n" + 
				"   vVVVv (___)/ /).:.('--._)  (___)  vVVVv\r\n" + 
				"   (___)  ~Y~{_[ (_,_)         ~Y~   (___)\r\n" + 
				"    ~Y~   \\|     | Y |          |/    ~Y~\r\n" + 
				"    \\|   \\ |/   /  |  \\        \\|    \\ |/\r\n" + 
				"   \\\\|// \\\\|//  \"\"\" \"\"\"       \\\\|// \\\\\\|///\r\n" + 
				"jgs^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	}
	public static boolean roomSeven() {
		Scanner input = new Scanner(System.in);
		System.out.println("                  _|_\r\n" + 
				"                   |\r\n" + 
				"                  / \\\r\n" + 
				"                 //_\\\\\r\n" + 
				"                //(_)\\\\\r\n" + 
				"                 |/^\\| \r\n" + 
				"       ,%%%%     // \\\\    ,@@@@@@@,\r\n" + 
				"     ,%%%%/%%%  //   \\\\ ,@@@\\@@@@/@@,\r\n" + 
				" @@@%%%\\%%//%%%// === \\\\ @@\\@@@/@@@@@\r\n" + 
				"@@@@%%%%\\%%%%%// =-=-= \\\\@@@@\\@@@@@@;%#####,\r\n" + 
				"@@@@%%%\\%%/%%//   ===   \\\\@@@@@@/@@@%%%######,\r\n" + 
				"@@@@@%%%%/%%//|         |\\\\@\\\\//@@%%%%%%#/####\r\n" + 
				"'@@@@@%%\\\\/%~ |         | ~ @|| %\\\\//%%%#####;\r\n" + 
				"  @@\\\\//@||   |  __ __  |    || %%||%%'######\r\n" + 
				"   '@||  ||   | |  |  | |    ||   ||##\\//####\r\n" + 
				"     ||  ||   | | -|- | |    ||   ||'#||###'\r\n" + 
				"     ||  ||   |_|__|__|_|    ||   ||  ||\r\n" + 
				"     ||  ||_/`  =======  `\\__||_._||  ||\r\n" + 
				"   __||_/`      =======            `\\_||__");
	}
/*
	public static boolean roomEight() {
System.out.println("\r\n" + 
		"                                  ______\r\n" + 
		"                               .-,;='';_),-.\r\n" + 
		"                                \\_\\(),()/_/ /\\\r\n" + 
		"                                  ( ___ )   ||\r\n" + 
		"                                 ,-/`~`\\-,__||_\r\n" + 
		"      ,-=-.       ______     _  / /).:.('--._)\r\n" + 
		"     /  +  \\     />----->  _|1|_{_[(_,_)          ,-=-.\r\n" + 
		"     | ~~~ |    // -/- /  |_ H _|  | Y |         /  +  \\\r\n" + 
		"     |R.I.P|   //  /  /     |S|   /  |  \\        |R.I.P| \r\n" + 
		"\\vV,,|_____|V,//_____/VvV,v,|_|/,,\"\"\" \"\"\" vVVvvVv|_____|vVvV\r\n" + 
		"    ");
		
	} 
	public static boolean roomNine() {
		System.out.println("        {} {}\r\n" + 
				"                         !  !  ! II II !  !  !\r\n" + 
				"                      !  I__I__I_II II_I__I__I  !\r\n" + 
				"                      I_/|__|__|_|| ||_|__|__|\\_I\r\n" + 
				"                   ! /|_/|  |  | || || |  |  |\\_|\\ !       \r\n" + 
				"       .--.        I//|  |  |  | || || |  |  |  |\\\\I        .--.\r\n" + 
				"      /-   \\    ! /|/ |  |  |  | || || |  |  |  | \\|\\ !    /=   \\\r\n" + 
				"      \\=__ /    I//|  |  |  |  | || || |  |  |  |  |\\\\I    \\-__ /\r\n" + 
				"       }  {  ! /|/ |  |  |  |  | || || |  |  |  |  | \\|\\ !  }  {\r\n" + 
				"      {____} I//|  |  |  |  |  | || || |  |  |  |  |  |\\\\I {____}\r\n" + 
				"_!__!__|= |=/|/ |  |  |  |  |  | || || |  |  |  |  |  | \\|\\=|  |__!__!_\r\n" + 
				"_I__I__|  ||/|__|__|__|__|__|__|_|| ||_|__|__|__|__|__|__|\\||- |__I__I_\r\n" + 
				"-|--|--|- ||-|--|--|--|--|--|--|-|| ||-|--|--|--|--|--|--|-||= |--|--|-\r\n" + 
				" |  |  |  || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||  |  |  |\r\n" + 
				" |  |  |= || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  |\r\n" + 
				" |  |  |- || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  |\r\n" + 
				" |  |  |- || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||- |  |  | \r\n" + 
				"_|__|__|  ||_|__|__|__|__|__|__|_|| ||_|__|__|__|__|__|__|_||  |__|__|_\r\n" + 
				"-|--|--|= ||-|--|--|--|--|--|--|-|| ||-|--|--|--|--|--|--|-||- |--|--|-\r\n" + 
				"-|--|--|| |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  | \r\n" + 
				"~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^~~~~~~~~~~~");
		
	}
	public static boolean roomTen() {
		System.out.println("___________      __________       _________                __  .__                         .___ \r\n" + 
				"\\__    ___/___   \\______   \\ ____ \\_   ___ \\  ____   _____/  |_|__| ____  __ __   ____   __| _/ \r\n" + 
				"  |    | /  _ \\   |    |  _// __ \\/    \\  \\/ /  _ \\ /    \\   __\\  |/    \\|  |  \\_/ __ \\ / __ |  \r\n" + 
				"  |    |(  <_> )  |    |   \\  ___/\\     \\___(  <_> )   |  \\  | |  |   |  \\  |  /\\  ___// /_/ |  \r\n" + 
				"  |____| \\____/   |______  /\\___  >\\______  /\\____/|___|  /__| |__|___|  /____/  \\___  >____ |  \r\n" + 
				"                         \\/     \\/        \\/            \\/             \\/            \\/     \\/  ");
		
	}
	public static boolean gameOver() {
		System.out.println("  ________                        ________                    ._.\r\n" + 
				" /  _____/_____    _____   ____   \\_____  \\___  __ ___________| |\r\n" + 
				"/   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\ |\r\n" + 
				"\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/\\|\r\n" + 
				" \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   __\r\n" + 
				"        \\/     \\/      \\/     \\/          \\/          \\/       \\/");
	}
	*/
}