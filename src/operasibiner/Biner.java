package operasibiner;

/*
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

Ditanya : Gambarkan citra hasil operasi OR dari dua citra diatas dan perhitungannya

Output Program :

C(1,1) = (10) | (1) = 11
C(1,2) = (11) | (0) = 11
C(1,3) = (1) | (10) = 11
C(1,4) = (100) | (11) = 111
C(1,5) = (100) | (1) = 101

C(2,1) = (101) | (100) = 101
C(2,2) = (1) | (111) = 111
C(2,3) = (1) | (110) = 111
C(2,4) = (1) | (1) = 1
C(2,5) = (11) | (1) = 11

C(3,1) = (111) | (111) = 111
C(3,2) = (0) | (101) = 101
C(3,3) = (111) | (101) = 111
C(3,4) = (111) | (101) = 111
C(3,5) = (0) | (101) = 101

C(4,1) = (10) | (1) = 11
C(4,2) = (11) | (100) = 111
C(4,3) = (1) | (11) = 11
C(4,4) = (101) | (111) = 111
C(4,5) = (110) | (0) = 110


Hasil Biner Citra C adalah :
[11, 11, 11, 111, 101]
[101, 111, 111, 1, 11]
[111, 101, 111, 111, 101]
[11, 111, 11, 111, 110]

Citra C adalah :
3 3 3 7 5
5 7 7 1 3
7 5 7 7 5
3 7 3 7 6

Process finished with exit code 0


 */


import java.util.Arrays;

public class Biner
{
    public static void main(String[] args)
    {
        // inisialisasi matrix
        int[][] citraA = {{2, 3, 1, 4, 4}, {5, 1, 1, 1, 3}, {7, 0, 7, 7, 0}, {2, 3, 1, 5, 6}};
        int[][] citraB = {{1, 0, 2, 3, 1}, {4, 7, 6, 1, 1}, {7, 5, 5, 5, 5}, {1, 4, 3, 7, 0}};
        String[][] citraC = new String[4][5];

        for (int i = 0; i < citraA.length; i++)
        {
            for (int j = 0; j < citraA[0].length; j++)
            {
                String hasil = Integer.toBinaryString((int) (Math.round((citraA[i][j]) | (citraB[i][j]))));
                citraC[i][j] = hasil;

                StringBuilder str = new StringBuilder();
                str.append("C(" + (i + 1) + "," + (j + 1) + ") = ");
                str.append("(" + Integer.toBinaryString(citraA[i][j]) + ") | ("+ Integer.toBinaryString(citraB[i][j]) + ") = ");
                str.append(hasil);

                System.out.println(str);
            }
            System.out.println();
        }

        System.out.println("\nHasil Biner Citra C adalah : ");
        for (int i = 0; i < citraC.length; i++)
        {
            System.out.println(Arrays.toString(citraC[i]));
        }

        System.out.println("\nCitra C adalah : ");
        for (int i=0; i< citraC.length; i++) {
            for (int j=0; j<citraC[i].length; j++)
            {
                System.out.print(Integer.parseInt(citraC[i][j],2) + " ") ;
            }
            System.out.println();
        }


    }
}
