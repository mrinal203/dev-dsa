import java.util.Scanner;

public class pattern10 {

    // Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int t = (n + 1) / 2;
        int space = t - 1;//2
        int star = 1;

        for (int row = 0; row < n; row++) {


            for (int csp = 0; csp < space; csp++) {
                System.out.print("\t");
            }

            for (int cst = 0; cst < star; cst++) {
                System.out.print("*\t");
            }

            //update
            if (row <( (n+1)/2)-1) {
                space = space - 1;
                star = star + 2;
                System.out.println("yyy");
            }
            if(row>=(n+1)/2){

                space = space + 2;
                star = star - 3;
                System.out.println("xxxx");

            }
            System.out.println();
        }
    }
}
