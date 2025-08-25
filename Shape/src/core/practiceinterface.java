package core;

public class practiceinterface {

	public static void main(String[] args) {
	
		 Arithamatic arth =(x,y)->
		{
			System.out.println("result");
			return x+y;
		};
		
		int a =arth.add(5, 7); 
		System.out.println(a);
		
		arth.display();
		Arithamatic.message();
		
		

	}

}
