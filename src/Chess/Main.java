package Chess;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Chess chess = new Chess();
        chess.putDarkAndWhite();
        boolean forward = true;
        while(forward){
            int FHmov, FVmov, SHmov, SVmov;
            System.out.println("-----------------R-U-L-E-S-----------");
            System.out.println("RULES Horizontal 1 to 8 and Vertical 1 to 8 || \n" +
                    "EXAMPLE: H -> 2 and V -> 3 \n" +
                    "Moving This Peace -->> '&' DARK-SIDE");

            chess.showChess();

            System.out.println("First number horizontal row: ");
            FHmov = input.nextInt();
            System.out.println("First number vertical row: ");
            FVmov = input.nextInt();
            System.out.println("Second number horizontal row: ");
            SHmov = input.nextInt();
            System.out.println("Second number vertical row: ");
            SVmov = input.nextInt();




            if(!chess.movingPeace(FHmov-1,FVmov-1, SHmov-1 ,SVmov-1)){
                        forward = false;
                        System.out.println("CHECK-MATE");
                }
            else{
                System.out.println("You want quit? \n1 - Yes\n2 - NO\nChoice:(1/2) ");
                int choice = input.nextInt();
                if(choice == 1){
                    forward = false;
                }
            }
        }

        //Putting Piece
        //! - Rook
        //@ - Knight
        //# - Bishop
        //$ - Queen
        //% - King
        //& - Pawn

    }
}
