/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author VIVOBOOK 14
 */
       
// Subclass mahasiswauinsa
public class CEO extends Manusia implements Pemimpin, Visioner, PembuatKeputusan {

    /**
     * @return the Perusahaan
     */
    protected String getPerusahaan() {
        return Perusahaan;
    }
    protected String getNama() {
        return Nama;
    }
    /**
     * @param Perusahaan the Perusahaan to set
     */

    public String Perusahaan;
    public String Nama;
    public CEO(String Nama, String Berpikir, String Perusahaan, String Tidur){
        super(Tidur, Berpikir);
        this.Perusahaan = Perusahaan;
        this.Nama = Nama;
        System.out.println("Nama: " + getNama());
        System.out.println("Kemampuan: " + getBerpikir());
        System.out.println("Suka: " + getTidur());
        System.out.println("Perusahaan: " + getPerusahaan());
    }
    
    public void Memimpin(){
        System.out.println(getNama() + " Memimpin Perusahaan dengan baik");   
    }
    public void Memerintah(){
        System.out.println(getNama() + " Memerintah sekertaris untuk menyiapkan dokumen");
    }
    public void Mengevaluasi(){
        System.out.println(getNama() + " Mengevaluasi Kinerja kerja bulanan");
    }
    public void MembuatKeputusan(){
        System.out.println(getNama() + " Membuat keputusan untuk Kelanjutan perusahaan");
    }
    public void Menganalisis(){
        System.out.println(getNama() + " Menganalisis Data pemasukan bulan ini");
    }
    public void Memikir(){
        System.out.println(getNama() + " Memikirkan Cara Agar perusahaan dapat berkembang");
    }
    public void Menetapkan(){
        System.out.println(getNama() + " Menetapkan peraturan baru");
    }
    public void Merencanakan(){
        System.out.println(getNama() + " Merencanakan akan mengadakan Event akhir bulan");
    }
    public void Menginovasi(){
        System.out.println(getNama() + " Memberikan inovasi teknologi untuk perusahaannya");
    }
    public static void main(String[] args){
        CEO bos = new CEO("Shofi","Berpikir Kritis", "TecnoAnjay", "Tidur");
       
        System.out.println("     ");
        bos.MembuatKeputusan();
        bos.Memikir();
        bos.Menganalisis();
        System.out.println("    ");
        bos.Menginovasi();        
        bos.Menetapkan();
        bos.Merencanakan();
        System.out.println("    ");
        bos.Memerintah();
        bos.Mengevaluasi();
        bos.Memimpin();
    }

    /**
     * @return the Nama
     */

}

