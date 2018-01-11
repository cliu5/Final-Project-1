public class Player{
    public String name;
    public Player(String _name){
	name=_name;
}
    public void Play(){
	System.out.println("WELCOME TO OUR GAME!!! YOU ARE IN STUY");
	while(floor<10){
	    playLevel();
	}
	System.out.println("You're done blablabla add stuff later");
    }

    public void playLeve(){
	System.out.println("THIS WILL BE A FUNCTION THAT DISPALYS ALL THE GAMES ON THE FLOOR");
	while(true){
	    int option=0;
	    while(option<4){
		if(!OptionStatus[floor][option]){
		    System.out.println(option+": "+map.get(floor).get(option));
		}
		option++;
	    }
	    if(floor<9){
		System.out.println(option+": Take the stairs up");
	    }
	     //FIGURE THIS OUT IT SHOULD BE A WAY TO SEE THE USERS INPUT//
	    int input=Keyboard.readInt();
	    if(input<options){
		//gahhhhhhhhhhhhhhhh lets do this later//
}
