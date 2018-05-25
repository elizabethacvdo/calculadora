/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class Calcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        
        //ventana.setSize(500, 500);
        ventana.setContentPane(new intefcalcu());
        ventana.setTitle("calculadora");
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setBounds(300, 100, 500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
