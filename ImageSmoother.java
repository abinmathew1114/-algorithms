public class ImageSmoother {

    public static void main(String[] args) {

        int[][] inImage = {{2,2,2},{2,1,2},{2,2,2}};

        int [][] outImage = imageSmoother(inImage);

        for (int i=0;i<outImage.length;i++) {
            for (int j=0;j<outImage[0].length;j++) {
                System.out.print(outImage[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] imageSmoother(int[][] M) {

        int [][] outImage = new int [M.length][M[0].length];
        int count, val;
        for (int i=0;i<M.length;i++) {

            for (int j=0;j<M[0].length;j++) {
                val = M[i][j];
                count = 1;
                if (i!=0) {
                    val+=M[i-1][j];
                    count++;
                    if (j!=0) {
                        val+=M[i-1][j-1];
                        count++;
                    }
                    if (j!=M[0].length-1) {
                        val+=M[i-1][j+1];
                        count++;
                    }
                }
                if (i!=M.length-1) {
                    val+=M[i+1][j];
                    count++;
                    if (j!=0) {
                        val+=M[i+1][j-1];
                        count++;
                    }
                    if (j!=M[0].length-1) {
                        val+=M[i+1][j+1];
                        count++;
                    }
                }
                if (j!=0) {
                    val+=M[i][j-1];
                    count++;
                }
                if (j!=M[0].length-1) {
                    val+=M[i][j+1];
                    count++;
                }

                outImage[i][j] = val/count;
            }
        }

        return outImage;
    }
}
