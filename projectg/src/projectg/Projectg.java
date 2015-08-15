/*
 * Names : Jonathan Cournoyer, Rosy Teasdale
 * Project Name: Game #1
 * Project Summary : Make a text based game
 */
package projectg;

/**
 *
 * @author ROSY
 */
public class Projectg {
    
    public static boolean handyman = false;
    public static String Checkpoint = "01";
    public static int numberOfChapter = 200;
    public static int firstTime = 0;
    public static int noms = 0;
            
    public static int lighter = 0;
    public static int remote = 0;
    public static int emptyFlashlight = 0;
    public static int deadBattery = 0;

    public static void main(String[] args) {
        start();
    }
    
    public static void start() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<-- The Amazing Game -->>");
        System.out.println("Menu:\n ");     
        System.out.println("1. New game");
        System.out.println("2. Load game");
        System.out.println("3. Options\n");
        
        System.out.print("Choose a number: ");
        
        String x = input.nextLine();
        
        switch(x) {
            case ("1") : CH_01(); break;
            case ("2"): Load_Game(); break;
            case ("3") : OPTIONS();
        }
    }
    
    public static void OPTIONS() {
    
    Scanner input = new Scanner(System.in);    
        
    System.out.println("\n\nOptions\n");
    System.out.println("1. Cheats");
    System.out.println("2. Go back");
    System.out.print("Choose a number: ");
    
    String in = input.nextLine();
    
    switch(in){
        case ("1") : Cheats();break;
        case ("2"): start(); 
    }
    }
    
    public static void Cheats(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a cheat");
        
        String in = input.nextLine();
        
        if ("handyman".equals(in)){
            
            System.out.println("You now have all the items");
            
            handyman = true;
            
            start();
        }
        else {
        InvalidCheat();
    }
 }
public static void InvalidCheat(){
    Scanner input = new Scanner(System.in); 
    
    System.out.println("incorrect cheat input");
        System.out.println("Want to try again? (Y/N)");
        
        String in = input.nextLine();
        
        if ("Y".equals(in)){
            Cheats();
        }
        else
            start();
}
    public static void Load_Game(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("LOAD_GAME\n");
        
        System.out.println("1. Last CheckPoint ");
        
        System.out.println("2. Chapter select");
        
        System.out.println("3. Go back");
        
        System.out.print("Choose a number: ");
        
       String i = input.nextLine();
       
        switch(i){
        case ("2") : ChapterChoose();break;
        case ("1") : CheckPointSelect();break;
        case ("3"): start(); 
    }
        
    }
    public static void ChapterChoose(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a chapter number: ");
        
        String chapter = input.nextLine();
        
        int chapterNum = Integer.parseInt(chapter);
        
        if (chapterNum > numberOfChapter || chapterNum <= 0) {
              
                  InvalidChapter(); 
          }
        
        ChapterSelect(chapter);
        
    }
    
    public static void InvalidChapter(){
        
        System.out.println("The Chapter/Scenario you selected does not exist");
        
        System.out.println("Retry");
        
        ChapterChoose();
        
    }
    
        public static void CheckPointSelect(){
        Scanner input = new Scanner(System.in);
        
        String chapter = Checkpoint;
        
        ChapterSelect(chapter);
        
    }
        
        public static void ChapterSelect(String CH){
            



            switch(CH){
                case("01"): CH_01();break;
                case("02"): CH_02();break;
                case("03"): CH_03();break;
                case("04"): CH_04();break;
                    
                
                    
            }
            
        }
    

    public static void CH_01(){
                Scanner input = new Scanner(System.in);
        
        if(firstTime == 0){
        System.out.println("                                                \n                                      \n                                                \n                                      \n");
        System.out.println("You wake up in a bed.\n");
        System.out.println("You cant see anything.\n");
        System.out.println("You dont know where you are.\n ");
        System.out.println("The last thing you remember is that you were going to a party with some friends.\n");
        
        }
        if(firstTime == 0) {
            firstTime++;
                }
        
        System.out.println("What do you want to do now?");
        String a;
        
        String answer = input.nextLine();
        
        
        if("open".equals(answer)){
            System.out.print("Open what?");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
    }
        else if("inventory".equals(answer)){
               
                if(lighter == 1){
                    System.out.println("-Lighter");
                }
                if (emptyFlashlight == 1){
                    System.out.println("-Empty Flashlight");
                }
                if (remote == 1){
                    System.out.println("-Televition Remote");
                }
                if (deadBattery == 1){
                    System.out.println("-Dead Battery");
                }
                if(emptyFlashlight == 0 && remote == 0 && lighter == 0 && deadBattery == 0){ 
                    System.out.println("You don't have anything on you right now");
                }
                a = input.nextLine();
                ChapterSelect(Checkpoint);
            }
        
        else if("open light".equals(answer)){
        CH_02();
    }
        else if("look".equals(answer)){
            System.out.print("look for what?  The room is completelly dark.");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("eat".equals(answer)){
            System.out.println("eat? Why would I eat anything?");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("eat pillow".equals(answer)){
            System.out.println("YUK!");
            noms = 1;
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("go east".equals(answer)){
            System.out.println("you hit your head on the wall, because you can't sea anything!");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
            else if("go west".equals(answer)){
            System.out.println("you hit your head on the wall, because you can't sea anything!");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
            }
            else if("go north".equals(answer)){
            System.out.println("you hit your head on the wall, because you can't sea anything!");
            a = input.nextLine();
            ChapterSelect(Checkpoint);        
        }
            else if("go south".equals(answer)){
            System.out.println("you hit your head on the wall, because you can't sea anything!");
            a = input.nextLine();
            ChapterSelect(Checkpoint);        
        }
            else if("help".equals(answer) || "commands".equals(answer)){
                System.out.println("The different commands for this game are pretty simple, first you type the action \n"
                        + "like : look, open, go, use; And then you type and object or a location \n"
                        + "Ex. go west, use flashlight, look bathroom, etc. ");
                System.out.println("There is also an inventory screen. By typing inventory, you will see what you are holding at that current time");
                a = input.nextLine();
                ChapterSelect(Checkpoint);        
            }
        else{
            System.out.println("I dont know how to " + answer + ".");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
        public static void CH_02(){
        String currentNum = "02";
        System.out.println("*NEW CHECKPOINT CREATED*");
        Checkpoint = currentNum;
            
            
        if (firstTime == 1){
        System.out.println("Finally, some light.");
        System.out.println("You see that you're in a small room");
        System.out.println("There is an opened window, the curtains are closed");
        System.out.println("From the corner of your eye, you can see that the room had a closet and a bathroom, and a door leading to another room");
        }
        if (firstTime == 1)
            firstTime++;
        
              Scanner input = new Scanner(System.in);

        System.out.println("What do you want to do now?");
        
        String a;
        
        String answer = input.nextLine();
        
        
        if("open".equals(answer)){
            System.out.print("Open what?");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
    }
        else if("open curtains".equals(answer)){  
       System.out.println("You feel the wind rushing through your hair, you dont know how far up you are, but something tells you you're really up high right now ");
       a = input.nextLine();
       ChapterSelect(Checkpoint);
    }
        else if("look".equals(answer)){
            System.out.print("You see that you're in a small room, /nthere is an opened window, the curtains are closed, /nFrom the corner of your eye, you can see that the room had a closet and a bathroom, and a door leading to another room ");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("look bathroom".equals(answer) || "go bathroom".equals(answer)){
           System.out.println("You go look inside the bathroom and it looks reallt dirty \n it seems that something happened in this room, but you really dont want to know. ");
            
            if(lighter == 0){
                System.out.print("You go look inside the bathroom, and you see a lighter sitting at the bottom of the sink. \n you pick it up");
                lighter = 1;
            }
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("look pillow".equals(answer)){
            System.out.println("you look at the pillow, it looks like you drooled on it");
            if(noms == 1){
                System.out.println("You can also see the bite mark from when you tried to eat it");
            }
            if (remote == 0){
                System.out.println("You look under the pîllow and find a televion remote");
                 remote = 1;
            }
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
            else if("look closet".equals(answer) || "go closet".equals(answer)){
            System.out.println("You go see inside the closet, its filled with smelly clothes ");
            
            if (emptyFlashlight == 0){
                System.out.println("After looking for a bit, you find a flashlight.");
                System.out.println("Sadly after trying to power it on, you figure out that the battery inside is dead");
                 emptyFlashlight = 1;
                 deadBattery = 1;
            }
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("look curtain".equals(answer)){
            System.out.print("they look like they were here for a while now. The wind is making them wave a lot");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("eat".equals(answer)){
            System.out.println("eat? Why would I eat anything?");
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        else if("eat pillow".equals(answer)){
            System.out.println("YUK!");
            noms = 1;
            a = input.nextLine();
            ChapterSelect(Checkpoint);
        }
        
            else if("go door".equals(answer)){
            if(emptyFlashlight == 0 || remote == 0 || lighter == 0 || deadBattery == 0){
            System.out.println("You go to the door, but something tells you you havent explored this room enough");
           a = input.nextLine();
           ChapterSelect(Checkpoint);
            }
            else{
            System.out.println("You go to the door, open it, go to the next room");
            a = input.nextLine();
            CH_03();
            }
        }
            else if("inventory".equals(answer)){
                if(lighter == 1){
                    System.out.println("-Lighter");
                }
                if (emptyFlashlight == 1){
                    System.out.println("-Empty Flashlight");
                }
                if (remote == 1){
                    System.out.println("-Televition Remote");
                }
                if (deadBattery == 1){
                    System.out.println("-Dead Battery");
                }
                if(emptyFlashlight == 0 && remote == 0 && lighter == 0 && deadBattery == 0){ 
                    System.out.println("You don't have anything on you right now");
                    a = input.nextLine();
                    ChapterSelect(Checkpoint);     
                }
            }
            
            else if("help".equals(answer) || "commands".equals(answer)){
                System.out.println("The different commands for this game are pretty simple, first you type the action \n"
                        + "like : look, open, go, use; And then you type and object or a location \n"
                        + "Ex. go west, use flashlight, look bathroom, etc. ");
                System.out.println("There is also an inventory screen. By typing inventory, you will see what you are holding at that current time");
                ChapterSelect(Checkpoint);        
            }
            
        else{
            System.out.println("I dont know how to " + answer + ".");
            ChapterSelect(Checkpoint);
        }
        
    }
        public static void CH_03(){
        System.out.println("");
    }
        public static void CH_04(){
        System.out.println("");
    }
/*
 CheckPoint CODE
        
        System.out.println("*NEW CHECKPOINT CREATED*");
        Checkpoint = currentNum;
*/    
        // TODO code application logic here
}
/*
Options code

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to do now?");
        
        String answer = input.nextLine();
        
        if("open".equals(answer)){
            System.out.print("");
            ChapterSelect(Checkpoint);
    }
        else if("open light".equals(answer)){
        CH_02();
    }
        else if("look".equals(answer)){
            System.out.print("");
            ChapterSelect(Checkpoint);
        }
        else if("eat".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);
        }
        else if("eat pillow".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);
        }
        else if("go east".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);
        }
            else if("go west".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);
            }
            else if("go north".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);        
        }
            else if("go south".equals(answer)){
            System.out.println("");
            ChapterSelect(Checkpoint);        
        }
        else{
            System.out.println("I dont know how to " + answer + ".");
            ChapterSelect(Checkpoint);
        }
    
}
