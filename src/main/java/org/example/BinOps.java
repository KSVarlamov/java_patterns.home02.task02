package org.example;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
       int n = Integer.parseInt(a, 2);
       int m = Integer.parseInt(b, 2);
       return Integer.toBinaryString(n + m);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int n = Integer.parseInt(a, 2);
        int m = Integer.parseInt(b, 2);
        return Integer.toBinaryString(n * m);
    }
}
