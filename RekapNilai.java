import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("\n--- Hasil Rekapitulasi ---");
        System.out.println("Total nilai dari " + jumlahSiswa + " siswa adalah: " + totalNilai);
        System.out.println("Nilai rata-rata dari seluruh nilai adalah: " + rataRata);

        input.close();
    }
}
