package calcu;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class intefcalcu extends JPanel {

    private int WIDTH = 300, HEIGTH = 300;
    private int WIDFT = 120, HEIGFT = 80;
    private int WIDBT = 80, HEIGBT = 30;
    private String algo = "";
    private int algo2;
    public JTextField text1, text2, text3;
    public JButton buttonoperacion, buttonconvert, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bsuma, bresta, bmult, bdiv, bresultado;
    private double opcion = 0.0;

    public intefcalcu() {

        text1 = new JTextField();
        text1.setBounds(new Rectangle(300, 200, 120, 30));
        text2 = new JTextField();
        text2.setBounds(new Rectangle(300, 250, 120, 30));
        text3 = new JTextField();
        text3.setBounds(new Rectangle(300, 300, 220, 30));

        buttonoperacion = new JButton("operacion");
        buttonoperacion.setBounds(new Rectangle(50, 30, 120, 30));
        buttonconvert = new JButton("convercion");
        buttonconvert.setBounds(new Rectangle(280, 30, 120, 30));
        bsuma = new JButton("+");
        bsuma.setBounds(new Rectangle(50, 70, 50, 50));
        bresta = new JButton("-");
        bresta.setBounds(new Rectangle(100, 70, 50, 50));
        bmult = new JButton("*");
        bmult.setBounds(new Rectangle(150, 70, 50, 50));
        bdiv = new JButton("/");
        bdiv.setBounds(new Rectangle(200, 70, 50, 50));

        b1 = new JButton("1");
        b1.setBounds(new Rectangle(50, 130, 50, 50));
        b2 = new JButton("2");
        b2.setBounds(new Rectangle(100, 130, 50, 50));
        b3 = new JButton("3");
        b3.setBounds(new Rectangle(150, 130, 50, 50));
        b4 = new JButton("4");
        b4.setBounds(new Rectangle(50, 190, 50, 50));
        b5 = new JButton("5");
        b5.setBounds(new Rectangle(100, 190, 50, 50));
        b6 = new JButton("6");
        b6.setBounds(new Rectangle(150, 190, 50, 50));
        b7 = new JButton("7");
        b7.setBounds(new Rectangle(50, 250, 50, 50));
        b8 = new JButton("8");
        b8.setBounds(new Rectangle(100, 250, 50, 50));
        b9 = new JButton("9");
        b9.setBounds(new Rectangle(150, 250, 50, 50));
        b0 = new JButton("0");
        b0.setBounds(new Rectangle(100, 300, 50, 50));
        bresultado = new JButton("resultado");
        bresultado.setBounds(new Rectangle(50, 375, 100, 50));

        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);

        Abstracfactoryfuncion factori;
        factori = Factoriproducerop.getfactorys(1);

        bsuma.addActionListener((ActionEvent ae) -> {

            opcion = Double.parseDouble(text1.getText());
            algo = "";
            algo2 = 1;
        });
        bresta.addActionListener((ActionEvent ae) -> {
            opcion = Double.parseDouble(text1.getText());
            algo = "";
            algo2 = 2;
        });
        bmult.addActionListener((ActionEvent ae) -> {
            opcion = Double.parseDouble(text1.getText());
            algo = "";
            algo2 = 3;
        });
        bdiv.addActionListener((ActionEvent ae) -> {
            opcion = Double.parseDouble(text1.getText());
            algo = "";
            algo2 = 4;
        });

        b1.addActionListener((ActionEvent ae) -> {
            algo = algo + "1";
            text1.setText(algo);
        });
        b2.addActionListener((ActionEvent ae) -> {
            algo = algo + "2";
            text1.setText(algo);
        });
        b3.addActionListener((ActionEvent ae) -> {
            algo = algo + "3";
            text1.setText(algo);
        });
        b4.addActionListener((ActionEvent ae) -> {
            algo = algo + "4";
            text1.setText(algo);
        });
        b5.addActionListener((ActionEvent ae) -> {
            algo = algo + "5";
            text1.setText(algo);
        });
        b6.addActionListener((ActionEvent ae) -> {
            algo = algo + "6";
            text1.setText(algo);
        });
        b7.addActionListener((ActionEvent ae) -> {
            algo = algo + "7";
            text1.setText(algo);
        });
        b8.addActionListener((ActionEvent ae) -> {
            algo = algo + "8";
            text1.setText(algo);
        });
        b9.addActionListener((ActionEvent ae) -> {
            algo = algo + "9";
            text1.setText(algo);
        });
        b0.addActionListener((ActionEvent ae) -> {
            algo = algo + "0";
            text1.setText(algo);
        });

        bresultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch (algo2) {
                    case 1:
                        Aritmetica suma;
                        suma = factori.getaritmetica(1);
                        String l = String.valueOf(suma.operar(opcion, Double.valueOf(text1.getText())));
                        text3.setText(l);
                        break;
                    case 2:
                        Aritmetica resta;
                        resta = factori.getaritmetica(2);
                        String o = String.valueOf(resta.operar(opcion, Double.valueOf(text1.getText())));
                        text3.setText(o);
                        break;
                    case 3:
                        Aritmetica multiplicar;
                        multiplicar = factori.getaritmetica(3);
                        String p = String.valueOf(multiplicar.operar(opcion, Double.valueOf(text1.getText())));
                        text3.setText(p);
                        break;
                    case 4:
                        Aritmetica divi;
                        divi = factori.getaritmetica(4);
                        String u = String.valueOf(divi.operar(opcion, Double.valueOf(text1.getText())));
                        text3.setText(u);
                        break;

                }

            }
        });

        add(text1);
        add(text2);
        add(text3);
        add(bsuma);
        add(bresta);
        add(bmult);
        add(bdiv);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bresultado);
        add(buttonconvert);
        add(buttonoperacion);
        setLayout(null);
        setPreferredSize(new Dimension(400, 400));
    }

}
