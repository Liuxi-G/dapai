// TODO: Use JUnit 4.12 if you are familiar with it.
// JUnit is a famous Unit Test framework.

public class test {
	public static void main(String[]args){
		System.out.println("\n testconstructermain");
		main zhuyao = new main("zhajinhua");
	
	    zhuyao.createplayer("zhangsan", "zs");
	    zhuyao.createplayer("lisi","ls");
	    zhuyao.createplayer("wanngermazi","wemz");
	
	    zhuyao.game(zhuyao.getplayerlist().get(0), zhuyao.getplayerlist().get(1), zhuyao.getplayerlist().get(2));
	
	}
	
	
	
	
}
