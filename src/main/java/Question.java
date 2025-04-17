import java.util.Scanner;

public class Question {
    public String questionText; 
    public int marks;
    public String correctAnswer;
    public int totalMarks;
    public String studentAnswer; 

    public Question(String questionText, int marks, String correctAnswer){
        this.questionText = questionText;
        this.marks = marks;
        this.correctAnswer = correctAnswer;
        this.totalMarks = marks;
        this.studentAnswer = "";
    }

    public void AskQuestion(Scanner inputScanner){
        System.out.println(questionText + "(" + this.marks + " marks)");
        String studentInput = inputScanner.nextLine();
        this.studentAnswer = studentInput;
    }

    public int CheckAnswer(){
        if(this.studentAnswer.equals(this.correctAnswer)){
            return this.marks;
        }
        return 0;
    }
}