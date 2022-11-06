package operasipenjumlahan;/*
Diketahui 2 buah citra berikut

Citra A
[2, 3, 1, 4, 4]
[5, 1, 1, 1, 3]
[7, 0, 7, 7, 0]
[2, 3, 1, 5, 6]

Citra B
[1, 0, 2, 3, 1]
[4, 7, 6, 1, 1]
[7, 5, 5, 5, 5]
[1, 4, 3, 7, 0]

Ditanya : Gambarkan citra hasil operasi penjumlahan (citra A + citra B) dan perhitungannya jika diketahui bobot wB
adalah wB = 0.5

Output Program :
C(1,1) = (1.0) + (0.5) = 2
C(1,2) = (1.5) + (0.0) = 2
C(1,3) = (0.5) + (1.0) = 2
C(1,4) = (2.0) + (1.5) = 4
C(1,5) = (2.0) + (0.5) = 3

C(2,1) = (2.5) + (2.0) = 5
C(2,2) = (0.5) + (3.5) = 4
C(2,3) = (0.5) + (3.0) = 4
C(2,4) = (0.5) + (0.5) = 1
C(2,5) = (1.5) + (0.5) = 2

C(3,1) = (3.5) + (3.5) = 7
C(3,2) = (0.0) + (2.5) = 3
C(3,3) = (3.5) + (2.5) = 6
C(3,4) = (3.5) + (2.5) = 6
C(3,5) = (0.0) + (2.5) = 3

C(4,1) = (1.0) + (0.5) = 2
C(4,2) = (1.5) + (2.0) = 4
C(4,3) = (0.5) + (1.5) = 2
C(4,4) = (2.5) + (3.5) = 6
C(4,5) = (3.0) + (0.0) = 3


Citra C adalah :
[2, 2, 2, 4, 3]
[5, 4, 4, 1, 2]
[7, 3, 6, 6, 3]
[2, 4, 2, 6, 3]

 */

import java.util.Arrays;

public class Penjumlahan
{
    public static void main(String[] args)
    {
        // inisialisasi matrix
        int[][] citraA = {{2, 3, 1, 4, 4}, {5, 1, 1, 1, 3}, {7, 0, 7, 7, 0}, {2, 3, 1, 5, 6}};
        int[][] citraB = {{1, 0, 2, 3, 1}, {4, 7, 6, 1, 1}, {7, 5, 5, 5, 5}, {1, 4, 3, 7, 0}};
        int[][] citraC = new int[4][5];

        // bobot
        double wB = 0.5;
        double wA = 1 - wB;

        for (int i = 0; i < citraA.length; i++)
        {
            for (int j = 0; j < citraA[0].length; j++)
            {
                int hasil = (int) (Math.round((wA * citraA[i][j]) + (wB * citraB[i][j])));
                citraC[i][j] = hasil;

                StringBuilder str = new StringBuilder();
                str.append("C(" + (i + 1) + "," + (j + 1) + ") = ");
                str.append("(" + wA * citraA[i][j] + ") + ("+wB * citraB[i][j] + ") = ");
                str.append(hasil);

                System.out.println(str);
            }
            System.out.println();
        }

        System.out.println("\nCitra C adalah : ");
        for (int i = 0; i < citraC.length; i++)
        {
            System.out.println(Arrays.toString(citraC[i]));
        }

    }
}