package sample;

class SubrectangleQueries {
    public static void main(String[] args){
        int[][] subarr={{1,2,1},{4,3,4},{3,2,1},{1,1,1}};

        SubrectangleQueries subrectangleQueries=new SubrectangleQueries(subarr);
        System.out.println(subrectangleQueries.getValue(0,2));
        subrectangleQueries.updateSubrectangle(0,0,3,2,5);
        System.out.println(subrectangleQueries.getValue(0, 2));
        System.out.println(subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        System.out.println(subrectangleQueries.getValue(3, 1));
        System.out.println(subrectangleQueries.getValue(0, 2));
    }
    public  int[][] arr;
    public SubrectangleQueries(int[][] rectangle) {
        this.arr=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i=row1;i<=row2;i++){
            for (int j=col1;j<=col2;j++){
                arr[i][j]=newValue;
            }
        }
        /*for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[j].length;j++){
                System.out.println(arr[i][j]);
            }
        }*/


    }

    public int getValue(int row, int col) {
        return  arr[row][col];
    }

}
