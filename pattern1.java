import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern1 {

    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //INITIAL STATE
        int star = 1;
        int space = n-1;
        for(int row = 1; row <= n ;row ++){

                    //work
            //according to pattern
            // we have to print first star
            //after star we have to print space :

            // star
            for(int cst = 0; cst<star;cst++){
                System.out.print("*\t");
            }
            // work for space
            for(int csp = 0; csp < space; csp ++ ){
                 System.out.print("\t");
            }

           // for each row ,we have to update star and space
            //update
            star=star+1;
            space = space -1;
            //ater finish one row we have to move in next line
            System.out.println();
        }
    }
}
