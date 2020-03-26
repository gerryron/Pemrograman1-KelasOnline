package com.gerryron.gui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCounter extends JFrame {
  private JTextField textField = new JTextField();
  private int jumlah = 0;

  SwingCounter(){
    super("Swing Counter - Gerry");
    JButton tombolNaik = new JButton("Naik");
    JButton tombolTurun = new JButton("Turun");
    JButton tombolReset = new JButton("Reset");
    JLabel labelCounter = new JLabel("Counter");
    JLabel labelSoal = new JLabel("Soal No 1");
    JPanel jPanel = new JPanel();
    Dimension dimension= Toolkit.getDefaultToolkit().getScreenSize();

    //set Panel
    jPanel.setLayout(null);
    setSize(350,200);
    setLocation(dimension.width/2 - getWidth()/2 , dimension.height/2 - getHeight()/2);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    textField.setEditable(false);
    textField.setBackground(Color.white);

    // set location Bounds
    tombolNaik.setBounds(120,30,70,25);
    tombolTurun.setBounds(120,90,70,25);
    tombolReset.setBounds(230,60,70,25);
    labelCounter.setBounds(30,60,70,25);
    labelSoal.setBounds(230,20,70,25);
    textField.setBounds(80,60,140,25);

    // add Action Listener
    TombolHandler tombolHandler = new TombolHandler();
    tombolNaik.addActionListener(tombolHandler);
    tombolTurun.addActionListener(tombolHandler);
    tombolReset.addActionListener(tombolHandler);

    // set Visible
    tombolNaik.setVisible(true);
    tombolTurun.setVisible(true);
    tombolReset.setVisible(true);
    labelCounter.setVisible(true);
    labelSoal.setVisible(true);
    textField.setVisible(true);

    // add to Jpanel
    jPanel.add(tombolNaik);
    jPanel.add(tombolTurun);
    jPanel.add(tombolReset);
    jPanel.add(labelCounter);
    jPanel.add(labelSoal);
    jPanel.add(textField);

    getContentPane().add(jPanel);
    setVisible(true);
  }

  public class TombolHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      JButton m = (JButton) e.getSource();

      if(m.getText().equals("Naik")){
        jumlah++;
        textField.setText(String.valueOf(jumlah));
      } else if(m.getText().equals("Turun")){
        jumlah--;
        textField.setText(String.valueOf(jumlah));
      } else if(m.getText().equals("Reset")){
        textField.setText("");
        jumlah = 0;
      }
    }
  }

  public static void main(String[] args) {
    SwingCounter swingCounter = new SwingCounter();
  }
}
