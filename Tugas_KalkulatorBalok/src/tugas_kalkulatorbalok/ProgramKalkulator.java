/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_kalkulatorbalok;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ProgramKalkulator extends JFrame {
    JLabel judulprogram = new JLabel("Kalkulator Balok");
    JLabel lebar = new JLabel("Lebar");
    JLabel panjang = new JLabel("Panjang");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasiltext = new JLabel("Hasil : ");

    JLabel labelluas = new JLabel("");
    JLabel labelkeliling = new JLabel("");
    JLabel labelvolume = new JLabel("");
    JLabel labellp = new JLabel("");

    JTextField fieldlebar = new JTextField();
    JTextField fieldpanjang = new JTextField();
    JTextField fieldtinggi = new JTextField();

    JButton tombolhitung=  new JButton("Hitung");
    JButton tombolreset=  new JButton("Reset");

    public ProgramKalkulator(){
        setSize(800,600);
        setLayout(null);

        add(judulprogram);
        add(lebar);
        add(panjang);
        add(tinggi);
        add(hasiltext);

        add(fieldlebar);
        add(fieldpanjang);
        add(fieldtinggi);

        add(labelluas);
        add(labelkeliling);
        add(labelvolume);
        add(labellp);

        add(tombolhitung);
        add(tombolreset);


        judulprogram.setBounds(200,20,200,25);

        lebar.setBounds(20,70,150,25);
        fieldlebar.setBounds(180,70,270,25);

        panjang.setBounds(20,130,150,25);   
        fieldpanjang.setBounds(180,120,270,25);

        tinggi.setBounds(20,190,150,25);
        fieldtinggi.setBounds(180,170,270,25);

        hasiltext.setBounds(200,200,200,25);

        labelluas.setBounds(20,240,300,25);
        labelkeliling.setBounds(20,280,300,25);
        labelvolume.setBounds(20,320,300,25);
        labellp.setBounds(20,360,300,25);

        tombolhitung.setBounds(150,450,100,50);
        tombolreset.setBounds(350,450,100,50);


        tombolhitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double panjang = Double.parseDouble(fieldpanjang.getText());
                double lebar = Double.parseDouble(fieldlebar.getText());
                double tinggi = Double.parseDouble(fieldtinggi.getText());

                double luas =  panjang * lebar;
                double keliling = 2*(panjang + lebar);
                double volume = panjang * lebar * tinggi;
                double luasPermukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);


                labelluas.setText("Luas Persegi Panjang : " + luas);
                labelkeliling.setText("Keliling Persegi Panjang : " + keliling);
                labelvolume.setText("Volume Balok : " + volume);
                labellp.setText("Luas Permukaan Balok : " + luasPermukaan);
            }
        });

        tombolreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldpanjang.setText("");
                fieldlebar.setText("");
                fieldtinggi.setText("");
                labelluas.setText("");
                labelkeliling.setText("");
                labelvolume.setText("");
                labellp.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
