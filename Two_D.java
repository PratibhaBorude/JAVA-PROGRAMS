public class Two_D {
    public static void main(String[]args){
//        int[][]rooms=
//                {
//                {1,2,3},
//                {4,5,6},
//                };
        int [][]flats;
        flats=new int[2][3];
        flats[0][0]=01;
        flats[0][1]=02;
        flats[0][2]=03;
        flats[1][0]=101;
        flats[1][1]=102;
        flats[1][2]=103;
//        for (int i=0;i< flats.length;i++){
//            for (int j=0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println( );
//        }


for (int []row:flats){
    for (int element:row){
        System.out.print(element+" ");
    }
    System.out.println();
}






    }
}
