/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo.wisnu.pranadita;

/**
 *
 * @author ASUS-PC
 */
public class UASPBOWisnuPranadita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thor th=new Thor ();
        th.setnamaHero("Thor");
        th.setcarakter1("\n" +
                "1. Kekuatan Super \n" +
                "2. Daya Tahan Super\n" +
                "3. Umur Panjang\n" +
                "4. Pengendali Petir");
        System.out.println("nama hero : "+ th.getnamaHero());
        System.out.println("karakter avenger : "+th.getcarakter1());
        
        
        Ironman ir=new Ironman ();
        ir.setnamaHero("Ironman");
        ir.setcarakter2("\n" +
                "1. Kekuatan Super \n" +
                "2. Baju Besi yang sangat kuat\n" +
                "3. Perlengkapan senjata super canggih\n" +
                "4. Kaya Akan ilmu pengetahuan");
        System.out.println("nama hero : "+ ir.getnamaHero());
        System.out.println("karakter avenger : "+ir.getcarakter2());
        
        
        
        Captain_America ca=new Captain_America ();
        ca.setnamaHero("Captain_America");
        ca.setcarakter3("\n" +
                "1. Kekuatan Super \n" +
                "2. Daya Tahan Super\n" +
                "3. Umur Panjang\n" +
                "4. Memiliki Tameng Dari Vibranium");
        System.out.println("nama hero : "+ ca.getnamaHero());
        System.out.println("karakter avenger : "+ca.getcarakter3());
        
        
        
        Hulk hl=new Hulk ();
        hl.setnamaHero("Hulk");
        hl.setcarakter4("\n" +
                "1. Kekuatan Super \n" +
                "2. Daya Tahan Super\n" +
                "3. Emosional Tinggi\n" +
                "4. Memiliki Kecepatan Lari yang Sangat Cepat");
        System.out.println("nama hero : "+ hl.getnamaHero());
        System.out.println("karakter avenger : "+hl.getcarakter4());
        
        
        
    }
    
}
