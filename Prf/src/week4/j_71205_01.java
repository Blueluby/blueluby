package week4;

public class j_71205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++) 
			System.out.println("names["+i+"]:"+names[i]);
		
		String tmp = names[2];
		System.out.println("tmp:"+tmp);
		
		names[0]="Eun";
		
		for(String s:names)
			System.out.println(s);
	}
}