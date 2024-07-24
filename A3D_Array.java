public class A3D_Array {
    public static void main(String[] args) {
        int[][][] cube = {
                {{2, 3, 4}, {1, 2, 3}},
                {{1, 2, 3},{1,6,7}},
                {{1, 2,3}, {1, 4,5}}
        };
//        for (int i=0;i<cube.length;i++){
//            for (int j=0;j<cube[i].length;j++){
//                for (int k=0;k<cube[i][j].length;k++ ){
//                    System.out.print(cube[i][j][k]+" ");
//                }
//                System.out.println( );
//            }
//            System.out.println();
//        }
        for (int[][]element:cube){
            for (int [] arr1D:element){
                for (int arr:arr1D){
                    System.out.print(arr+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
