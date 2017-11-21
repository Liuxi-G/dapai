// TODO: Use JUnit 4.12 if you are familiar with it.
// JUnit is a famous Unit Test framework.

public class test {
	public static void main(String[]args){
		System.out.println("\n testconstructermain");
		main zhuyao = new main("zhajinhua");
		
	    zhuyao.createPlayer("zhangsan", "zs");
	    zhuyao.createPlayer("lisi","ls");
	    zhuyao.createPlayer("wanngermazi","wemz");
	
	    zhuyao.game(zhuyao.getPlayerList().get(0), zhuyao.getPlayerList().get(1), zhuyao.getPlayerList().get(2));
	
	}
	
	
	
	
}
