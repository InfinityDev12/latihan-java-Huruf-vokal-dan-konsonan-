import java.util.Scanner;

public class vokonsonan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input kalimat : ");

        // 1. input suatu kata atau kalimat dengan tipe data string
        String str = scanner.nextLine();

        // 2. Mengubah input menjadi huruf kecil
        str = str.toLowerCase();

        int vCount = 0, cCount = 0, nCount = 0;

        // 3. Melakukan pengelompokkan setiap karakter dari kalimat yang dinput
        for (int i = 0; i < str.length(); i++) {

            // 4. memeriksa karakter yang termasuk huruf vokal
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // menambahkan jumlah yang tergolong huruf vokal
                vCount++;
            }
            // 5. memeriksa karakter yang termasuk konsonan
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                // menambahkan jumlah yang tergolong huruf vokal
                cCount++;
            }
            //6. memeriksa karakter yang termasuk angka
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                // menambahkan jumlah yang tergolong huruf vokal
                nCount++;
            }
        }
        // 6. menampilkan jumlah dari pengelompokkan yang sdh dilakukan 
        System.out.println("Banyak huruf vokal : " + vCount);
        System.out.println("banyak huruf konsonan : " + cCount);
        System.out.println("Banyak huruf konsonan : " + nCount);
        System.out.println("Banyak karakter pada kalimat : " + str.length());
    }
}