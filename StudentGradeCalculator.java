package codjava;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        float Hindi , Eng , Math , Phy, Chem;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of five Subject:");
        System.out.println("Enter the marks obtained in Hindi!");
        Hindi = s.nextFloat();
        System.out.println("Enter the marks obtained in English!");
        Eng = s.nextFloat();
        System.out.println("Enter the marks obtained in Mathematics!");
        Math = s.nextFloat();
        System.out.println("Enter the marks obtained in Physics!");
        Phy = s.nextFloat();
        System.out.println("Enter the marks obtained in Chemistry!");
        Chem = s.nextFloat();
        float total = Hindi + Eng + Math + Phy + Chem;
        float average = total/5;
        float percentage = (total/500)*100;
        if(percentage >= 60){
            System.out.println("1st Division Grade A");
        }
          if(percentage < 60){
             if(percentage > 33){
                 System.out.println("2nd Division Grade B");
             }
              if(percentage == 33){
                  System.out.println("Pass Grade C");
              }else if(percentage < 33){
                  System.out.println("Fail");
              }
        }
        System.out.println("Total Marks = " +total);
        System.out.println("Average Marks = " +average);
        System.out.println("Percentage = " +percentage+"%");
    }
}
