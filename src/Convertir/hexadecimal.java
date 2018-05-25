/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertir;

/**
 *
 * @author mery acevedo
 */
public class hexadecimal implements Convertir{
    private int num;
    private String let="";
    
    @Override
    public String convertir(int numero) {
        while(numero>0){
            num=numero%16;
            if(num>9){
                let=let+letras(num);
            }else{
                let=let+String.valueOf(num);
            }
            numero=numero/16;
        }
        System.out.println(let);
        
        return let;
        
    }
    
    public String letras(int num){
        String l="";
        switch(num){
            case 10:
                l="A";
                break;
            case 11:
                l="B";
                break;
            case 12:
                l="C";
                break;
            case 13:
                l="D";
                break;
            case 14:
                l="E";
                break;
            case 15:
                l="F";
                break;
        }
        return l;
    }
    
    
}
