public class Array_2D_1{
    public static void main(String[] args){
        int[][] integers = {{1,2,3},{4,5},{6,7,8,9}};
        sum_rows(integers);
        sum_columns(integers);
    }

    private static void sum_rows(int[][] integers){
        for(int i = 0; i<integers.length; i++){
            int sum = 0;
            for(int j = 0;j<integers[i].length; j++){
                sum += integers[i][j];
            }

            System.out.println("Row " + (i+1) + ": "+ sum);
        }
    }

    private static void sum_columns(int[][] integers){
        int max_length = 0;
        for(int x = 0;x<integers.length;x++){
            if (max_length<integers[x].length){
                max_length = integers[x].length;
            }
        }

        for(int i = 0; i<max_length;i++){
            int sum = 0;
            for(int j = 0; j<integers.length;j++){
                try{
                    sum+= integers[j][i];
                    }catch(Exception e){
                    sum+=0;
                    }
                }
            System.out.println("Column "+(i+1)+": "+ sum);
            }
        }
    }
