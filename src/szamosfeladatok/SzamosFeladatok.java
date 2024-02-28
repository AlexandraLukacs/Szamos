
package szamosfeladatok;

public class SzamosFeladatok {

    
    public static void main(String[] args) {
        System.out.println("Abszolútértékek: ");
        for (int i = 3; i >= -3; i--){
            System.out.printf("|%2d| = %d\n", i, Math.abs(i));
        }
        System.out.println("");
        
        for (int i = 13; i >= -13; i--){
            System.out.printf("|%3d| = %d\n", i, Math.abs(i));
        }
        
        System.out.println("");
        
        final int DB = 6;
        int[] szamok = new int[DB];
        for (int i = 0; i < DB; i++) {
            szamok[i] = (int)(Math.random()*45)*2+11;
        }
        
        szamok[DB/2]++;
        
        for (int i = 0; i < DB; i++) {
            System.out.print(szamok[i] + " ");
        }
        
        System.out.println("");
        
        int i = 0;
        while(!(szamok[i] % 2 == 0)){
            i++;
        }
        System.out.println("A tömb 1. páros eleme: " + szamok[i]);
    }
    
}
