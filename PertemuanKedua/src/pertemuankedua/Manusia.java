/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author VIVOBOOK 14
 */
public class Manusia{
    private String Tidur;
    private String Berpikir;
    
    public Manusia(String Tidur, String Berpikir){
    this.Tidur = Tidur;
    this.Berpikir = Berpikir;    
    
    }

    /**
     * @return the Nama
     */
    protected String getTidur() {
        return Tidur;
    }
    protected String getBerpikir() {
        return Berpikir;
    }

}
