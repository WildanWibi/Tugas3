import java.util.Scanner;

public class individuno2 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        double diskon = 0.0;
        String jenisBuku, hari;
        
        System.out.print("Apakah hari ini hari rabu (y/n) ? : ");
        hari = input14.nextLine();
        System.out.print("Masukkan jenis buku (novel/kamus/lainnya): ");
        jenisBuku = input14.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input14.nextInt();
        input14.nextLine();
    
        if (hari.equalsIgnoreCase("y")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 10.0;
                if (jumlahBuku > 2) {
                    diskon = 2.0;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 7.0;
                if (jumlahBuku > 2) {
                    diskon = 1.0;
                }
            }  else {
                if (jumlahBuku > 3) {
                    diskon = 5.0;
            
        } else {
            diskon = 0.0;
        }

        System.out.println("Diskon yang diperoleh: " + diskon + "%");
        input14.close();
            }
        }
    }
}
