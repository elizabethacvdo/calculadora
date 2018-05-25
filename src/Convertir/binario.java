/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertir;

/**
 *
 * @author LN710Q
 */
public class binario implements Convertir {

    @Override
    public String convertir(int numero) {
        
        String bistr="",b="";
       
        while(numero>=2){
            bistr+=String.valueOf(numero%2);
            numero=numero/2;
        }
        bistr+=numero;
        for (int i=bistr.length()-1;i>=0;i--){
            b=b+bistr.charAt(i);
        }
        return b;
    }
    
}
