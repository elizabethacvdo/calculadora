
package interfaz;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class intefcalcu extends JPanel{
    
     private int WIDTH=300, HEIGTH=300;
    private int WIDFT=120, HEIGFT=80;
     private int WIDBT=80, HEIGBT=30;
     
     public JTextField text1,text2;
     public JButton button;
     
     
    public intefcalcu(){
        text1=new JTextField();
        text1.setBounds(new Rectangle(100,40,120,30));
        text2=new JTextField();
        text2.setBounds(new Rectangle(100,100,120,30));
        
        button=new JButton("SUMAjjjjj");
        button.setBounds(new Rectangle(100,150,120,30));
         
         
         text1.setEditable(true);
         text2.setEditable(false);
         
       button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        }
        });
       
       add(text1);
       add(text2);
       add(button);
       setLayout(null);
       setPreferredSize(new Dimension(400,400));
    }
    
}
