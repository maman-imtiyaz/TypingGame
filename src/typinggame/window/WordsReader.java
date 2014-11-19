/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame.window;

import java.io.*;

/**
 *
 * @author Maman-QA
 */
public class WordsReader {
     // Method baca file
    public static String bacaFile(String kata) {
        BufferedReader br = null;
        String stringHasil = "";
 
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(kata));
            while ((sCurrentLine = br.readLine()) != null) {
                stringHasil = stringHasil + sCurrentLine + "\n";
            }
 
        } catch (IOException e) {
            System.out.println("Gagal membaca file " + kata);
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
            }
        }
        return stringHasil;
}
}
