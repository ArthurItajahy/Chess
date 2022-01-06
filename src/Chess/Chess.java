package Chess;

import java.util.ArrayList;
import java.util.Objects;

public class Chess {
    private final ArrayList<String[]> tabelH;

    public Chess(){
        this.tabelH = new ArrayList<String[]>();
        for(int i=0; i<8; i++){
            String[] tabelV = {" "," "," "," "," "," "," "," "};
            this.tabelH.add(tabelV);
        }
    }


    public void puttingPeace(int peace){
        //Putting Piece
        //! - Rook
        //@ - Knight
        //# - Bishop
        //$ - Queen
        //% - King
        //& - Pawn
        int forward;
        if(peace == 0){
            forward = peace + 1;
        }else{
            forward = peace - 1;
        }
        for(int i=0; i<8;i++) {
            for(int j=0;j<8;j++){
                if (i == peace) {
                    switch (j){
                        case 0:
                            this.tabelH.get(i)[j] = "!";
                            break;
                        case 1:
                            this.tabelH.get(i)[j] = "@";
                            break;
                        case 2:
                            this.tabelH.get(i)[j] = "#";
                            break;
                        case 3:
                            this.tabelH.get(i)[j] = "$";
                            break;
                        case 4:
                            this.tabelH.get(i)[j] = "%";
                            break;
                        case 5:
                            this.tabelH.get(i)[j] = "#";
                            break;
                        case 6:
                            this.tabelH.get(i)[j] = "@";
                            break;
                        case 7:
                            this.tabelH.get(i)[j] = "!";
                            break;
                    }
                }
                if (i == forward) {
                    this.tabelH.get(i)[j] = "&";

                }
            }
        }
    }
    public void showChess() {
        System.out.println("-------------CHESS------------------");
        System.out.println("--------D-A-R-K--S-I-D-E------------");
        System.out.println("--------------LINE------------------");
        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        System.out.println("------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+" | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(this.tabelH.get(i)[j] + " | ");
            }
            System.out.print((i+1));
            System.out.println("\n-----------------------------------");
        }
        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        System.out.println("--------------LINE------------------");
        System.out.println("---------W-H-I-T-E-S-I-D-E----------");
        System.out.println("------------------------------------");
        System.out.println("--------------PEACE-----------------");
        System.out.println("! - Rook\n" +
                "@ - Knight\n" +
                "# - Bishop\n" +
                "$ - Queen\n" +
                "% - King\n" +
                "& - Pawn");
    }
    public void putDarkAndWhite(){
        //Putting Dark side
        puttingPeace(0);
        //Putting White Side
        puttingPeace(7);

    }
    public boolean movingPeace(int FHmov, int FVmov, int SHmov,int SVmov ) {
        String v = this.tabelH.get(SHmov)[SVmov];
        this.tabelH.get(SHmov)[SVmov] = this.tabelH.get(FHmov)[FVmov];
        if (!Objects.equals(v, " ")) {
            if(Objects.equals(v, "%")) {
                return false;
            }
            this.tabelH.get(FHmov)[FVmov] = " ";
        }else{
            this.tabelH.get(FHmov)[FVmov] = v;

        }
        return true;
    }
}

