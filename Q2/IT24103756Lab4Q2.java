import java.util.Scanner;

public class IT24103756Lab4Q2{

       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
              
           System.out.print("Please enter the exam marks (out of 100): ");
           int examMarks = scanner.nextInt();
           if (examMarks < 0 || examMarks > 100) {
               System.out.println("Invalid input for exam marks. Terminating program.");
               return;          
           }
           
           
           System.out.print("Please enter the lab submission marks (out of 100): ");
           int labMarks = scanner.nextInt();
           if (labMarks < 0 || labMarks > 100) {
               System.out.println("Invalid input for exam marks. Terminating program.");
               return;
           }
           


           System.out.print("Please enter the percentage given for the exam: ");
           int examPrecentage = scanner.nextInt();

            
           System.out.print("Please enter the percentage given for the lab submission: ");
           int labPrecentage = scanner.nextInt();

           if (examPrecentage + labPrecentage != 100 ){
              System.out.println("The percentage must add up to 100. Terminating program.");
              return;
           }

           double finalMark = (examMarks * examPrecentage/100.0) + (labMarks * labPrecentage/100.0);
           System.out.println("Final mark is: " + finalMark);
           scanner.close();
 
         }
}
         
           
           