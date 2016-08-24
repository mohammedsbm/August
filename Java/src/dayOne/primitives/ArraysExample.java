package dayOne.primitives;

/**
 * Created by student on 8/22/2016.
 */
public class ArraysExample {

    public static void main(String[] args) {

        //single dimensional arrays
        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int test[] = new int[10];
        test[0] = 10;

        //two dimensional array [rows][columns]
        int twoD[][] = new int[4][5];

        int i, j, k = 0;

        for (i = 0; i < 4; i++) { //loop for row
            for(j = 0; j < 5; j++) { //loop for column
                twoD[i][j] = k;
                k++;
            }
        }

        //three dimensional array [number of arrays] [rows in each array] [columns in each row]
        int threeD[][][] = new int[3][4][5];

        int a, b, c;

        for(a = 0; a < 3; a++) //loop for array
            for(b = 0; b < 4; b++) //loop for row
                for(c = 0; c < 5; c++) { //loop for column
                    threeD[a][b][c] = a * b * c;
                }
    }


}
