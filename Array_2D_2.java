//Print max in each row
public class Array_2D_2 {
    public static void main(String[] args){
        int[][] integers = {{1,2,3,4},{4,5},{6,7,8,9},{10}};
        getMaxRow(integers);
    }

    private static void getMaxRow(int[][] integers){
        for(int i = 0; i<integers.length ;i++){
            int max = 0;
            for(int j =0; j<integers[i].length;j++){
                if (integers[i][j] > max){
                    max=integers[i][j];
                }
            }

            System.out.println("Row "+(i+1)+": "+ max);
        }
    }

}
