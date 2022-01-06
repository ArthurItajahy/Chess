package Chess;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Chess chess = new Chess();
        chess.putDarkAndWhite();
        boolean forward = true;
        while(forward){
            int FHmov = 0, FVmov = 0, SHmov = 0, SVmov = 0;
            System.out.println("-----------------R-U-L-E-S-----------");
            System.out.println("RULES Horizontal 1 to 8 and Vertical 1 to 8 || \n" +
                    "EXAMPLE: H -> 2 and V -> 3 \n" +
                    "Moving This Peace -->> '&' DARK-SIDE");

            chess.showChess();

            System.out.println();
            FHmov = input.nextInt();
            FVmov = input.nextInt();
            SHmov = input.nextInt();
            SVmov = input.nextInt();
            if(!chess.movingPeace(FHmov-1,FVmov-1, SHmov-1 ,SVmov-1)){
                forward = false;
                System.out.println("CHECK-MATE");
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
