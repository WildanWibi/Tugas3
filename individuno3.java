import java.util.Scanner;

public class  individuno3 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga;

        System.out.println("=========================================");
        System.out.println("============== LIST SEPATU ==============");
        System.out.println("== -> Converse                         ==");
        System.out.println("== -> Sketcher                         ==");
        System.out.println("== -> Nike                             ==");
        System.out.println("=========================================");

        System.out.print("Masukkan Merk\t\t\t\t: ");
        merk = input14.nextLine();

        if (merk.equalsIgnoreCase("converse")) {
            System.out.print("Masukkan Kategori (Slip On/High Top)\t: ");
            kategori = input14.nextLine();

            if (kategori.equalsIgnoreCase("slip on")) {
                System.out.print("Masukkan ukuran (36-40)\t\t\t: ");
                ukuran = input14.nextInt();

                 if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                   System.out.println("Total harga\t\t\t\t: " + harga);
                } else {
                    System.out.println("TIdak ada ukuran");
                }

            } else if (kategori.equalsIgnoreCase("high top")) {
                System.out.print("Masukkan ukuran (40-44)\t\t\t: ");
                ukuran = input14.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Total harga\t\t\t\t: " + harga);
                } else {
                    System.out.println("Tidak ada ukuran");
                }

            }

        } else if (merk.equalsIgnoreCase("sketcher")) {
            System.out.print("Masukkan Kategori (Woman/Man)\t\t: ");
            kategori = input14.nextLine();

            if (kategori.equalsIgnoreCase("woman")) {
                System.out.print("Masukkan ukuran (36-41)\t\t\t: ");
                ukuran = input14.nextInt();

                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                    System.out.println("Total harga\t\t\t\t: " + harga);
                } else {
                    System.out.println("Tidak ada ukuran");
                }

            } else if (kategori.equalsIgnoreCase("man")) {
                System.out.print("Masukkan ukuran (41-44)\t\t\t: ");
                ukuran = input14.nextInt();

                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                    System.out.println("Total harga\t\t\t\t: " + harga);
                } else {
                    System.out.println("Tidak ada ukuran");
                }

            } else {
                System.out.println("Kategori tidak tersedia");
            }

        } else if (merk.equalsIgnoreCase("nike")) {
            System.out.print("Masukkan Kategori (kids/adult)\t\t: ");
            kategori = input14.nextLine();

            if (kategori.equalsIgnoreCase("kids")) {
                System.out.print("Masukkan ukuran (36-40)\t\t\t: ");
                ukuran = input14.nextInt();

                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                    System.out.println("Total harga\t\t\t\t: " + harga); 
                }else 
                    System.out.println("Tidak ada ukuran");
            } else if (kategori.equalsIgnoreCase("adult")) {
                System.out.print("Masukkan ukuran (40-44)\t\t\t: ");
                ukuran = input14.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                    System.out.println("Total harga\t\t\t\t: " + harga);
                } else {
                    System.out.println("Tidak ada ukuran");
                    
                }
                input14.close();
            }
         }
    }
}