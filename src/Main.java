import java.util.Arrays;
import java.util.LinkedList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int nilai = 5;
        System.out.println(nilai);

        System.out.println("---------");

        String kata = "struktur";
        System.out.println(kata);

        System.out.println("---------");

        int [] arraySatu = {12, 10, 40};
        for (int i = 0; i < arraySatu.length; i++) {
            System.out.println(arraySatu[i]);
        }

        System.out.println("---------");

        int [][] arrayDua = {{12,10,40}, {13,11,41}, {14,12,42}};
        for (int i = 0; i < arrayDua.length; i++) {
            for (int j = 0; j < arrayDua[i].length; j++) {
                System.out.println(arrayDua[i][j]);
            }
        }

        System.out.println("---------");

        LinkedList<Integer> list = new LinkedList<>();

        int a = 10;
        for (int i = 0; i < 5; i++) {
            list.add(a);
            a += 10;
        }

        System.out.println("ini data dari linked list = " + list);

    }
}