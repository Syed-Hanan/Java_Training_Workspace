package core;

public non-sealed class Bus implements SealedExample{

	public void price()
	{
		System.out.println("my price is 500");
	}
	public void wheels()
	{
		System.out.println("my wheels are 4");
	}
	public static void main(String[] args) {
		
   Bus b=new Bus();
   b.price();
   b.wheels();
	}

}
