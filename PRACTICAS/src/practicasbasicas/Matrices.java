public class Matrices {
    public static void main(String[] args) {
        //int [][] matriz = new int[2][3];
      //  final var RENGLONES =2;
      //  final var COLUMNAS=3;
        var matriz1 = new int[][]{
                {100,200,300},
                {400,500,600}
        };
        /*
        matriz1[0][0]=100;
        matriz1[0][1]=200;
        matriz1[0][2]=300;
        matriz1[1][0]=400;
        matriz1[1][1]=500;
        matriz1[1][2]=600;
         */
        //        System.out.println("valor 1 [0][0] =" + matriz1[0][0]);
        for(var ren=0;ren< matriz1.length;ren++){
            for (var col=0;col<matriz1[ren].length;col++){
                System.out.println("Valor ["+ren+"]"+"["+col+"] = "+matriz1[ren][col]);
            }
        }
    }
}
