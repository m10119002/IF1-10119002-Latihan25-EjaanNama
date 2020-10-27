/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program ejaan nama
 * 
 * 
 */
public class EjaanNama {
    private final Scanner scanner;
    public EjaanNama() {scanner = new Scanner(System.in);}
    
    private String getInput() {return scanner.nextLine();}
    
    private String getNamaDepan(String test) {
        Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(test);
        boolean b = m.find();
        
        if(b) {
            System.err.println("Nama Depan tidak boleh mengandung "
                    + "spasi, simbol, atau angka!");
            return null;
        } else {
            return test;
        }
    }
    
    private int start() {
        String input;
        String namaDepan;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        input = getInput();
        if(getNamaDepan(input)!=null) namaDepan = getNamaDepan(input);
        else return -1;
        
        System.out.println("");
        System.out.println("Ejaan untuk \"".
                concat(namaDepan).concat("\" adalah :"));
        for (int i=0; i<namaDepan.length(); i++) {
            char c = namaDepan.charAt(i);
            System.out.println("Huruf ke-".
                    concat(Integer.toString(i+1)).concat(" : ").
                    concat(Character.toString(c)));
        }
        return 0;
    }
    
    public static void main(String[] args) {
        EjaanNama program = new EjaanNama();
        program.start();
    }
}
