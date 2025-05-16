
package Pertemuan901;

/**
 *
 * @author LAB F
 * TGL: 16 Mei 2025
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mhsturunan rahma = new mhsturunan();
        rahma.setNIM("33445566");
        rahma.setJKEL("L");
        rahma.setNAMA("Yuatius Darmana");
        
        
        System.out.println("Data Mahasiswa");
        System.out.printf("Nama          : %s\n",rahma.nama);
        System.out.printf("NIM           : %s\n",rahma.getNIM() );
        System.out.printf("Jenis Kelamin : %s\n",rahma.getJKEL() );
        
    }
    
}
