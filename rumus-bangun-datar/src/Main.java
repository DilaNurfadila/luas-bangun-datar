import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int p, l, s, t, a, s1, s2, d1, d2, r, bd, luas, luas_seg7;
        float phi = 3.14f, luas_seg;
        String back;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Program hitung luas bangun datar");
            System.out.println("Pilih bangun datar :");
            System.out.println("" +
                    "1. Persegi\t\t\t\t\t5. Trapesium" +
                    "\n2. Persegi Panjang\t\t\t6. Layang-Layang" +
                    "\n3. Segitiga\t\t\t\t\t7. Belah Ketupat" +
                    "\n4. Jajargenjang\t\t\t\t8. Lingkaran");
//                    "5. Trapesium\n6. Layang-Layang\n7. Belah Ketupat\n8. Lingkaran");
            bd = scan.nextInt();
            switch(bd) {
                case 1 :
                    System.out.println("Menghitung Luas Persegi");
                    System.out.print("Masukan Sisi : ");
                    s = scan.nextInt();
                    luas = s * s;
                    System.out.println("Luas Persegi : "+luas);
                    break;
                case 2 :
                    System.out.println("Menghitung Luas Persegi Panjang");
                    System.out.print("Masukan Panjang : ");
                    p = scan.nextInt();
                    System.out.print("Masukan Lebar : ");
                    l = scan.nextInt();
                    luas = p * l;
                    System.out.println("Luas Persegi Panjang : "+luas);
                    break;
                case 3 :
                    System.out.println("Menghitung Luas Segitiga");
                    System.out.print("Masukan Alas : ");
                    a = scan.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    t = scan.nextInt();
                    luas = (a * t) / 2;
                    System.out.println("Luas Segitiga : "+luas);
                    break;
                case 4 :
                    System.out.println("Menghitung Luas Jajargenjang");
                    System.out.print("Masukan Alas : ");
                    a = scan.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    t = scan.nextInt();
                    luas = a * t;
                    System.out.println("Luas Jajargenjang : "+luas);
                    break;
                case 5 :
                    System.out.println("Menghitung Luas Trapesium");
                    System.out.print("Masukan Sisi Pertama : ");
                    s1 = scan.nextInt();
                    System.out.print("Masukan Sisi Kedua : ");
                    s2 = scan.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    t = scan.nextInt();
                    luas = ((s1 + s2) * 7) / 2;
                    System.out.println("Luas Trapesium : "+luas);
                    break;
                case 6 :
                    System.out.println("Menghitung Luas Layang-Layang");
                    System.out.print("Masukan Diagonal 1 : ");
                    d1 = scan.nextInt();
                    System.out.print("Masukan Diagonal 2 : ");
                    d2 = scan.nextInt();
                    luas = (d1*d2)/2;
                    System.out.println("Luas Layang-Layang : "+luas);
                    break;
                case 7 :
                    System.out.println("Menghitung Luas Belah Ketupat");
                    System.out.print("Masukan Diagonal 1 : ");
                    d1 = scan.nextInt();
                    System.out.print("Masukan Diagonal 2 : ");
                    d2 = scan.nextInt();
                    luas = (d1*d2)/2;
                    System.out.println("Luas Belah Ketupat : "+luas);
                    break;
                case 8 :
                    System.out.println("Menghitung Luas Lingkaran");
                    System.out.print("Masukan Jari-Jari : ");
                    r = scan.nextInt();
                    if (r %7==0) {
                        luas_seg7 = (22 * r * r) / 7;
                        System.out.println("Luas Lingkaran : "+luas_seg7);
                    } else {
                        luas_seg = phi * r * r;
                        System.out.println("Luas Lingkaran : "+luas_seg);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
            System.out.println("Apakah anda ingin menghitung bangun datar yang lain?(ya/tidak)");
            back = scan.next();
        } while(back.equalsIgnoreCase("ya"));
        System.out.println("Terima kasih");
    }
}