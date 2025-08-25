package core;

public class Switchexample2 {

	public static void main(String[] args) {
		
		/*int category=1;
		switch(category) {
		
		case 1->System.out.println("one");
		case 2->System.out.println("otwo");
		case 3->System.out.println("three");
		case 4->System.out.println("four");
		case 5->System.out.println("five");
		}*/
		
		String week="tue";
		String msg;
		msg= switch(week) {
		
		case "mon" - >{yield "working day";}
		case "tue" - >{yield "working day";}
		case "wnd" - >{yield "working day";}
		default -> throw new RuntimeException("not a valid week");
		};
		System.out.println(msg);
		


	}

}
