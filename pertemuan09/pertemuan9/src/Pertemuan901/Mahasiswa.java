
package Pertemuan901;

/**
 *
 * @author LAB F
 * TGL 16 Mei 2025
 */
public class Mahasiswa {
    private String nim, jkel;
    protected String nama;
    
    public void setNIM(String nval){
         this.nim = nval;
    }
    public void setJKEL(String nval){
        this.jkel = nval;
    }    
        public String getNIM(){
            return this.nim;
    }
        public String getJKEL(){
            return this.jkel;
        }
}
