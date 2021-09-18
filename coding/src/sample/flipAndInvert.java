package sample;

public class flipAndInvert {
    public static void main(String[] args){
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
    }
    public static void flipAndInvertImage(int[][] image) {
        int[][] image1=new int[image.length][image[0].length];
        int k;
        for (int i=0;i<image.length;i++){
             k=0;
            for (int j=image[0].length-1;j>=0;j--){
                    image1[i][k]=image[i][j];
                    k++;
            }
        }

        for (int i=0;i<image1.length;i++){
            for (int j=0;j<image1[0].length;j++){
                if(image1[i][j]==0){
                    image1[i][j]=1;
                }
                else {
                    image1[i][j]=0;
                }
            }
        }



        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
                System.out.println(image1[i][j]);
            }
        }

    }
}
