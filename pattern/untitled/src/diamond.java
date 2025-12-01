public class diamond {

    public static void main(String[] args) {

        for(int i=1;i<=3;i++){
            for (int j=1;j<=5;j++){
                if((i==3)||(i==1&&j==3)||(i==2&&j==2)||(i==2&&j==3)||(i==2&&j==4)){
                    System.err.print("*");
                }
                else
                    System.err.print(" ");
            }
            System.err.println();
        }
        for(int i=2;i<=3;i++){
            for (int j=1;j<=5;j++){
                if((i==2&&j==3)||(i==2&&j==2)||(i==2&&j==4)||(i==3&&j==3)){
                    System.err.print("*");
                } else
                    System.err.print(" ");
            }
            System.err.println();
        }

    }
}
