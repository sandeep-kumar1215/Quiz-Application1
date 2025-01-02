import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

public class QuestionService {
    //constructor
    public QuestionService()
    {
questions[0]=new Question( 1,"what is the size of int in byte ","4 bytes","1 bytes","8 bytes","16 bytes","4");
questions[1]=new Question( 2,"what is the size of char in byte ","4 bytes","1 bytes","8 bytes","16 bytes","1");
questions[2]=new Question( 3,"what is the size of double in byte ","4 bytes","1 bytes","8 bytes","16 bytes","8");
questions[3]=new Question( 4,"what is the size of float in byte ","4 bytes","1 bytes","8 bytes","16 bytes","4");
questions[4]=new Question( 5,"what is the size of long in byte ","4 bytes","1 bytes","8 bytes","16 bytes","8");

    }
    // creating an array of objects which accepts objects of 'Question' class
Question[]questions=new Question[5];
String []selection=new String[5];
// calling the display function
    public void playQuiz(){
        int i=0;// using in iteration in selection array
        for (Question q : questions) {
             System.out.println("question number"+q.getId());
                System.out.println(q.getQuestion()); 
                System.out.println(q.getOpt1()); 
                System.out.println(q.getOpt2()); 
                System.out.println(q.getOpt3()); 
                System.out.println(q.getOpt4()); 
                System.out.print("Write answer : ");
                // take user input 
                Scanner sc=new Scanner(System.in);
                // storing the users input in selection arrary
                selection[i++] = sc.nextLine();
    
        }
        System.out.println("Answers written by user");
        for (String s : selection) {
            System.out.println(s);
           
           }
    }
    public void printscore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
System.out.println("you scored :"+score);
    }
}
