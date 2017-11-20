// TODO: Please use CamelCase.
// TODO: Write a service logic about Chinese porker zhajinhua.
// TODO: Please clear all unnecessary whitespace.
// TODO: Please do alignment between "{ "and  "}" if they are belong to a function or class.
// TODO: Use English name instead Chinese pinyin.
import java.util.LinkedList;





public class main {
private String name_of_the_game;
private LinkedList<player> allplayers = new LinkedList<player>();
public main(String name_of_the_game)  {
	       this.name_of_the_game=name_of_the_game;
		}
	
	
	
	
	public LinkedList<player> getplayerlist(){
		return allplayers;
	}
	
	
	
	public void createplayer(String name,String password){
		player pl =new player(name,password);
	    allplayers.add(pl);
	}
	
	
	
	public void game(player pl1,player pl2,player pl3){

}
	
}
   /*protected int fapai(){
	   
	   
	   Random r=new Random();
	   int card=0;
	   card=r.nextInt(12)+1;
	   
	   return card;
   }*/














