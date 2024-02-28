/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szamosfeladatok;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class GyakorlasCiklusra {
    public static void main(String[] args) {
        //String[] betuk = {"a", " ", "\n", ""};
        char[] betuk = {'a', ' ', '\n'};
        
        betuk = new char[5];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + "");
        }
        System.out.println("");
        
        /* a...i */
        for (int i = 97; i < 105; i++) {
            System.out.print((char)(i) + " ");
        }
        
        /* 3 betűnként egymás alá */
        for (int i = 0; i < 9; i++) {
            
        }
        
    }
}
