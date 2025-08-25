package core;

public record RecordExample(int regno, String name,String teacher ) {
	
	public int regno() {
		return regno;
	}
	
	public String name() {
		return name;
	}
	
	public String teacher() {
		return teacher;
	}


	}


