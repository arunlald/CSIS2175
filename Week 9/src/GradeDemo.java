import javax.swing.*;
public class GradeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int numberOfQuestions;
		int missedQuestions;
		
		input = JOptionPane.showInputDialog(null, "What is the number of questions?");
		numberOfQuestions=Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "How many questions were missed?");
		missedQuestions=Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(numberOfQuestions,missedQuestions);
		exam.display();


	}

}


// what is a driver?
