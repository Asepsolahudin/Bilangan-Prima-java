/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;
import java.util.Scanner;

/**
 *
 * @author Apsalboy
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cek, index, batas,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan batas nilai deret prima : ");
        batas = input.nextInt();
        for (i=2; i<=batas; i++){
            cek = 0;
            for(index= 2; index<i; index++){
                if (i % index == 0){
                    cek = 1;
                }
            }
            if (cek == 0){
                System.out.print(i+",");
            }
        }
        System.out.println("");
    }
    
}
