package typinggame;

import java.util.List;
import java.util.Random;
import typinggame.window.WordsReader;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MainWindow mainWindow = new MainWindow("Typing Game");
        
        // tampung kata yang dibaca ke dalam arraylist
        List<String> words = WordsReader.bacaFile("kata.txt");
        
        // Class Random untuk menghasilkan angka acak
        Random rand = new Random();
        
        // perulangan yang akan menampilkan angka sebanyak 10 kali
        for (int i=0; i<10; i++) {
            // generate angka acak untuk index list
            // angka acak yang dihasilkan adalah dari 0 sampai dengan jumlah data pada arraylist dikurangi 1
            int randomIndex = rand.nextInt(words.size());
            
            // tampilkan kata di dalam list berdasarkan indeks
            // indeks disini didapat secara acak, sehingga kata yang ditampilkan akan selalu berbeda
            System.out.println("Kata acak ke " + (i+1) + ": " + words.get(randomIndex));
        }
    }
}
