import javax.swing.*;
public class Task2JOptionPane {
    public static void main (String[]args){
        int numberOfSubjects;
        String input;
                input=JOptionPane.showInputDialog(null,"Enter Number Of Subjects");
                numberOfSubjects =Integer.parseInt(input);
                int totalMarks=0;
                double averagePercentage=0;
for(int i = 1; i<= numberOfSubjects; i++){
    String input2;
    String input3;
    input2=JOptionPane.showInputDialog(null,"Enter The Highest Grade Of Subject"+i);
    input3=JOptionPane.showInputDialog(null,"Enter The Obtained Grade ");
    int highestMark=Integer.parseInt(input2);
    int marks=Integer.parseInt(input3);
    double percentage = ((double) marks / highestMark) * 100;
    averagePercentage+=percentage;
    totalMarks+=marks;
}
char grade;
double totalPercentage = averagePercentage/ numberOfSubjects;
if(totalPercentage >=90){
    grade='A';
}
else if(totalPercentage >=80){
            grade='B';
        }
else if(totalPercentage >=70){
            grade='C';
        }
else if(totalPercentage >=60){
    grade='D';
}
else{
    grade='F';
}
JOptionPane.showMessageDialog(null,"Your Total Marks Is : "+totalMarks);
JOptionPane.showMessageDialog(null,"Your Percentage Is : "+ totalPercentage +"%");
JOptionPane.showMessageDialog(null,"Your Grade Is : "+grade);
    }
}
