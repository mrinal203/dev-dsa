public class pattern2 import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        //star space method
        int star=n;
        int space=0;
        for(int i=0;i<n;i++){


            for(int cst=0;cst<star;cst++){

                System.out.print("*\t");
            }
            for(int csp=0;csp<space;csp++){
                System.out.print("\t");
            }

            System.out.println();
            //update
            star=star-1;
            space= space-1;
        }

    }
}{
}
