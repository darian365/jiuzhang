package suanfa.rumen;

public class Student {
	private String name;
	private int score;
	
	public Student(String name) {
		this.name = name;
	}
	
	public char getLevel(int score) {
		
		if(score >= 90) {
			return 'A';
		}else if(score >= 80) {
			return 'B';
		}else if(score >= 60) {
			return 'C';
		}else {
			return 'D';
		}
	}
}
