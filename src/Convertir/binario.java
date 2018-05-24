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
    public int convertir(int numero) {
        int num;
        String bistr="";
        String bis2="";
        while(numero>=2){
            bistr+=String.valueOf(numero%2);
            numero=numero/2;
        }
        bistr+=numero;
        for (int i=bistr.length();i<1;i--){
            bis2=bis2+bistr.charAt(i);
        }
        return num=Integer.parseInt(bis2);
    }
    
}
