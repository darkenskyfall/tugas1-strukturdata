import java.util.LinkedList;

public class Test {
    public static void coba(){
        int nilai = 100;
        System.out.println(nilai);

        System.out.println("---------");

        String kata = "struktur";
        System.out.println(kata);

        System.out.println("---------");

        int [] arraySatu = {12, 10, 40};
        for (int j : arraySatu) {
            System.out.println(j);
        }

        System.out.println("---------");

        int [][] arrayDua = { {12,10,40}, {13, 11, 41}, {14,12,11}};

        for (int[] ints : arrayDua) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        System.out.println("---------");

        LinkedList<Integer> list = new LinkedList<>();
        int nilai2 = 10;

        for (int i = 0; i < 5; i++) {
            list.add(nilai2);
            nilai2 += 10;
        }

        System.out.println("data linkedList = " + list);
    }
}
