import java.util.Scanner;

class Marks {
    void student(int a, int b, int c, int d, int e)
 {
        int sum = a + b + c + d + e;
        int avg = sum / 5;
        System.out.println("Average Marks: " + avg);
        if (avg >= 40)
 {
            System.out.println("YOU GOT PASSED!!!");
        } 
else {
            System.out.println("BETTER LUCK NEXT TIME!!!!!");
        }
    }
}

class Name extends Marks {
    void teacher(String na)
 {
        System.out.println("THE CANDIDATE NAME IS: " + na);
    }
}

class Age extends Name 
{
    void displayAge(int age)
 {
        System.out.println("THE AGE OF THE CANDIDATE IS: " + age);
    }
}

public class Multi
 {
    public static void main(String[] args) 
{
        Age myObj = new Age(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE NAME OF THE CANDIDATE: ");
        String name = scanner.nextLine();

        System.out.print("ENTER THE AGE OF THE CANDIDATE: ");
        int age = scanner.nextInt();

        System.out.println("********ENTER THE MARKS OF THE STUDENT**********");

        System.out.print("TAMIL: ");
        int tamil = scanner.nextInt();

        System.out.print("ENGLISH: ");
        int english = scanner.nextInt();

        System.out.print("MATHS: ");
        int maths = scanner.nextInt();

        System.out.print("SCIENCE: ");
        int science = scanner.nextInt();

        System.out.print("SOCIAL: ");
        int social = scanner.nextInt();

        
        myObj.student(tamil, english, maths, science, social);
        myObj.teacher(name);
        myObj.displayAge(age);

    
    }
}
