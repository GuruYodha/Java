public class heart {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
            for(int j=0;j<=7;j++){
                if((i==2&&j==2)||(i==2&&j==3)||(i==2&&j==5)||(i==2&&j==6)||
                        (i==3&&j==1)||(i==3&&j==4)||(i==3&&j==7)||
                        (i==4&&j==2)||(i==4&&j==6)
                ||(i==6&&j==4)||(i==5&&j==3)||(i==5&&j==5))
                    System.err.print("* ");
                else
                    System.err.print("  ");
            }
            System.err.println();
        }
    }
}
