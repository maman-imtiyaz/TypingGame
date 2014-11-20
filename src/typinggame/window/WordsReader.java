/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame.window;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maman-QA
 */
public class WordsReader {

    /**
     * <p>
     * Membaca kata dari sebuah berkas
     * <p>
     * @param path lokasi berkas yang akan dibaca
     * @return List berisi kata
     */
    public static List<String> bacaFile(String path) {
        BufferedReader br = null;
        // variable penampung Arraylist bertipe String, liat tanda <String>
        // array ini diinisialisasi dengan kapasitas 0
        List<String> hasil = new ArrayList(0);

        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(path));
            while ((sCurrentLine = br.readLine()) != null) {
                // setiap kata yang dibaca akan ditampung ke dalam arraylist
                hasil.add(sCurrentLine);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca file " + path);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
            }
        }
        // mengembalikan hasil 
        return hasil;
    }
}
