import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = {70, 80, 90, 30, 50, 20, 60, 10, 40};
        int temp, i, j;
        int[] array2 = new int[10];

        System.out.println("Bir sayı giriniz :");
        int n = scan.nextInt();

        for (int x = 0; x < array.length; x++) {

            array2[x] = array[x];

        }
        array2[9] = n;


        for (i = 0; i < array2.length; i++) {
            for (j = 0; j < array2.length; j++) {

                if (array2[j] < array2[i]) {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;

                }
            }
        }

        Arrays.sort(array2);
        System.out.println("Listenizin sıralanmış hali : " + Arrays.toString(array2));

        System.out.println("");


        for (int a = 0; a < array2.length; a++) {
            if (array2[a] == n) {
                System.out.println("Girdiğiniz değerden bir küçük olan sayı:" + array2[a - 1]);
                System.out.println("Girdiğiniz değerden bir büyük olan sayı:" + array2[a + 1]);

            }
        }


    }

}

