import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseChangeCount = 0;

        System.out.println("Enter characters ('.' to stop):");
        
        while (true) {
            char ch = scanner.next().charAt(0);
            
            if (ch == '.') {
                break;
            }
            
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char) (ch - 32));
                caseChangeCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char) (ch + 32));
                caseChangeCount++;
            } else {
                System.out.print(ch);
            }
        }
        
        System.out.println(); // Move to the next line after printing all characters
        System.out.println("Number of case changes: " + caseChangeCount);
        
        scanner.close();
    }
}
