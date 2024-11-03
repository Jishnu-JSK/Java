import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the first number: ");
            int f = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int s = scanner.nextInt();
            System.out.print("ADD +\nSUB -\nMULTIPLY *\nDIVIDE /\nFLOOR DIVISION //\nEXPONENT **\nMODULUS %\nEnter your Choice: ");
            String ch = scanner.next();

            if (ch.equalsIgnoreCase("ADD") || ch.equals("+")) {
                int a = f + s;
                System.out.println("Sum of " + f + " and " + s + "=" + a);
            } else if (ch.equalsIgnoreCase("SUB") || ch.equals("-")) {
                int x = f - s;
                System.out.println(f + "-" + s + "=" + x);
            } else if (ch.equalsIgnoreCase("MULTIPLY") || ch.equals("*")) {
                int x = f * s;
                System.out.println(f + "*" + s + "=" + x);
            } else if (ch.equalsIgnoreCase("DIVISION") || ch.equals("/")) {
                double x = (double) f / s;
                System.out.println(f + "/" + s + "=" + x);
            } else if (ch.equalsIgnoreCase("FLOOR") || ch.equals("//")) {
                int x = f / s;
                System.out.println(f + "//" + s + "=" + x);
            } else if (ch.equalsIgnoreCase("EXPONENT") || ch.equals("**")) {
                double y = Math.pow(f, s);
                System.out.println(f + "**" + s + "=" + y);
            } else if (ch.equalsIgnoreCase("MOD") || ch.equals("%")) {
                int m = f % s;
                System.out.println(f + "%" + s + "=" + m);
            }

            System.out.print("Continue [Y/N]: ");
            String b = scanner.next();
            if (b.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();
    }
}

