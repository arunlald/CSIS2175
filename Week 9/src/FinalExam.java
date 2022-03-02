import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity{
	private int numQuestions; // number of questions
	private double pointsEach; // marks for each question
	private int numMissed; //questions missed
	
	public FinalExam(int numQuestions, int numMissed) {
		//super();
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach=100.0/numQuestions;
		
		double score = 100-(numMissed*pointsEach);
		setScore(score);
	}
	
	public void foo() {
		System.out.println(score);
		super.display(); // refers to one from the parent class. this.display() or display() refers to the display method in this class.
	}
	
	@Override
	public void display() {
		JOptionPane.showMessageDialog(null, 
				"Each question counts " + pointsEach +
				" Your score is " + getScore()+
				" Your grade is: " + getGrade());
	}
	
	
	/*
	 * public static void display() { GradedActivity.display(); }
	 */
}

// to shadow the display method, make it static and remove the @Override and call display like GradedActivity.display() i.e. super needs to be removed.
// overloading vs overriding???