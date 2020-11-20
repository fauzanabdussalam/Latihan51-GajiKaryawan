/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menghitung Gaji Karyawan
 *
 */
public class PBO10K10119901Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager mgr     = new Manager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK \t\t\t : ");
        mgr.setNik(scanner.next());
        
        System.out.print("Masukkan Nama \t\t\t : ");
        mgr.setNama(scanner.next());
        
        System.out.print("Masukkan Golongan (1/2/3) \t : ");
        mgr.setGolongan(scanner.nextInt());
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mgr.setJabatan(scanner.next());
        
        System.out.print("Masukkan Kehadiran \t\t : ");
        mgr.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t\t : " + mgr.getNik());
        System.out.println("NAMA \t\t : " + mgr.getNama());
        System.out.println("GOLONGAN \t : " + mgr.getGolongan());
        System.out.println("JABATAN \t : " + mgr.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN \t : " + mgr.tunjanganGolongan(mgr.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t : " + mgr.tunjanganJabatan(mgr.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t : " + mgr.tunjanganKehadiran(mgr.getKehadiran()));
        
        System.out.println("\nTOTAL GAJI \t\t : " + mgr.gajiTotal());
    }
    
}
