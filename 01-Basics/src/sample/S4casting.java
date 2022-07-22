package sample;

public class S4casting {

	public static void main(String[] args) {
		
        int i1=10;
        byte b1=12;
        
        System.out.println(i1);
        
        //converting b1
        i1=b1;
        
        System.out.println(i1);
        
        i1=17;
        b1=9;
        
        System.out.println(b1);
        //converting int to byte
        b1=(byte)i1;
        System.out.println(b1);
	}

}
