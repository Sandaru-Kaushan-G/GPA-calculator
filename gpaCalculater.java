import java.util.Scanner;

class cal {
    public void gpv() {
        float gpa;
        int ctv = 0;
        float gpatot = 0.0F;
        Scanner scan = new Scanner(System.in);
        boolean continueValue = true;

        while (continueValue) {
            System.out.print("Enter grade (e.g., A+, A, B+): ");
            String grade = scan.nextLine().trim().toLowerCase();  // Read grade

            System.out.print("Enter credit value: ");
            int creditValue = scan.nextInt();  // Read credit value
            scan.nextLine();  // Clear newline after nextInt

            // Calculate GPA based on grade
            switch (grade) {
                case "a+":
                case "a":
                    gpa = creditValue * 4.00F;
                    break;
                case "a-":
                    gpa = creditValue * 3.70F;
                    break;
                case "b+":
                    gpa = creditValue * 3.30F;
                    break;
                case "b":
                    gpa = creditValue * 3.00F;
                    break;
                case "b-":
                    gpa = creditValue * 2.70F;
                    break;
                case "c+":
                    gpa = creditValue * 2.30F;
                    break;
                case "c":
                    gpa = creditValue * 2.00F;
                    break;
                case "d+":
                    gpa = creditValue * 1.30F;
                    break;
                case "d":
                    gpa = creditValue * 1.00F;
                    break;
                default:
                    gpa = 0.0F;  // For failing or E grade
                    break;
            }

            System.out.println("GPA for this entry: " + gpa);
            gpatot += gpa;
            ctv += creditValue;

            // Ask user if they want to continue
            System.out.print("Do you want to enter another grade? (y/n): ");
            String check = scan.nextLine().trim().toLowerCase();
            continueValue = check.equals("y");
        }
        //calculate last gpa
        float lastGpa = gpatot/ctv;
        //last GPA value
        System.out.println("Total GPA value: " + lastGpa);
    }
}


public class gpaCalculater {
    public static void main(String[] args) {
        //c1 class run gpv method
        cal c1 = new cal();
        c1.gpv();

    }
}