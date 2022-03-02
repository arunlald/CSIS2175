
public class GradedActivity {
	protected double score; // inside class and to child.

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {
		char letterGrade;
		if (score>=90) {
			letterGrade='A';
		}
		else if (score>=80) {
			letterGrade='B';
		}
		else if (score>=70) {
			letterGrade='C';
		}
		else if (score>=60) {
			letterGrade='D';
		}
		else letterGrade ='F';
		return letterGrade;
		
	}
	
	public void display() {
		
	}

}

// creating a stub while constructing multiple parts of an application.
/*
 * public char getGrade() { return 'A'; }
 */
// if return type is void no need to write anything inside the method.