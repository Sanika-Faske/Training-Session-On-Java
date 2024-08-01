package Pattern;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = 4;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            // Print stars and spaces to form the hollow rhombus
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

