package basicprograms;

import java.util.Scanner;

public class drawPyramidPatter {

	public static void main(String[] args) {
		int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Program Name:draw Pyramid with give number of start\nEnter any number:");
        n = s.nextInt();
	for (int i = 0; i < n; i++) {
        for (int j = 1; j < n - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
	}
	}
}
