package core;

public non-sealed class AdditionExample extends Arithmetic {

	public static void main(String[] args) {
		AdditionExample ad =new AdditionExample();
		ad.num1=44;
		ad.num2=78;
		
		ad.cal();
		ad.calvalue(ad.num1, ad.num2);

	}

}
