package Loop;

public class namedLopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;  
		
		//outer loop  
		
		outer:     //label  
		for(i=1;i<=5;i++)  
		{  
		System.out.println();  
		
		//inner loop  
		
		inner:      //label  
		for(j=1;j<=10;j++)  
		{  
		System.out.print(j + " ");  
		if(j==9)  
		break inner;      
		}  
		}  
	 }

}
