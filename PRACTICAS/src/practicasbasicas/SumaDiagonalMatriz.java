public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        var ren = 2;
        var col = 2;
        var matriz = new int[][]{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        var sumatoria = 0;
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j){
                    sumatoria+=matriz[i][j];
                }
            }
        }
        System.out.println("\n Suma total en diagonal "+sumatoria);
    }
}
