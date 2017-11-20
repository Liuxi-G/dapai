// TODO: Please use Camel-Case instead of underline because JDK uses Camel-Case,
// TODO: and It is a regular naming presentation.
// TODO: Use English name instead Chinese pinyin.
import java.util.Arrays;
import java.util.Random;


public class player {
	public player(String player_name,String player_pswd){
		this.setplayer_name(player_name);
		
		this.setplayer_pswd(player_pswd);
	}
	
private String player_name;
private String player_pswd;
private int result=0;//
public String getplayer_name() {
	return player_name;
}


public void setplayer_name(String player_name) {
	this.player_name = player_name;
}


public String getplayer_pswd() {
	return player_pswd;
}


public void setplayer_pswd(String player_pswd) {
	this.player_pswd = player_pswd;
}

private int point=0;//zanshi hai meijia ru jifenxitong 

public int getpoint(){
	return point; 
}
public void addpoint(int pointswin){
	 point+=pointswin;
}
public void minuspoint(int pointsloss){
	point-=pointsloss;
}
private int[]paizu={0,0,0};// xinjian paizu
public int result(){
	int Result=-1;
	
	   
	   int sum=0;
	   for(int i=0;i<paizu.length;i++){
		   Random r=new Random();
		   paizu[i]=r.nextInt(12)+1;
		   sum += paizu[i];
	   }//gei paizu fapai
	   Arrays.sort(paizu);
	   
	   if(paizu[0]==paizu[1]||paizu[1]==paizu[2]||paizu[0]==paizu[2]){
		   if(paizu[0]==paizu[1]&&paizu[1]==paizu[2]){
			   Result=99;
		   }
		   else{
			   Result=97;
		   }
		  
	   }
	   else if(paizu[0]==paizu[1]-1&&paizu[1]==paizu[2]-1){
		   Result=98;
	   }
	   else {
		   Result=sum;
	   }
	   result=Result;
	   return Result;
   }//gei yigeren fapai bing dui paizu jieguo jinxing panding

public void print(){
	for (int i=0;i<3;i++){
	System.out.println(paizu[i]);
}
}
public String zucheng(){
	String zucheng="shayebushi";
	if(result==99){
		zucheng="Baozi";
	}
	else if(result==98){
		zucheng="shunzi";
	}
	else if(result==97){
		zucheng="duizi";
	}
	
return zucheng;
}// fenxi sanzhangpai zucheng de mingzi
}