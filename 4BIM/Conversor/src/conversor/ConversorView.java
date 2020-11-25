package src.conversor;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConversorView extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ConversorModel model;
    private JTextField valorTextField;
    private JTextField celsiusToFahrenheitTextField;
    private JTextField celsiusToKelvinTextField;
    private JTextField fahrenheitToCelsiusTextField;
    private JTextField fahrenheitToKelvinTextField;
    private JTextField kelvinToCelsiusTextField;
    private JTextField kelvinToFahrenheitTextField;
    private JButton confirmButton;
    private JLabel statusLabel;

    public ConversorView(ConversorModel model) {
        this.model = model;
        setTitle("TempConvert");
        setSize(391,712);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);

        configurarTela();

        setVisible(true);
    }

    private void configurarTela() {
        JPanel root = new JPanel();
        ImageIcon image = new ImageIcon();


        root.setLayout(new BorderLayout());

        image = new ImageIcon("assets/imgs/Calculo.png");
        JLabel wallpaper = new JLabel(image);
        wallpaper.setLocation(0,0);

        valorTextField = new JTextField(6);
        valorTextField.setBounds(126,230,126,23);
        valorTextField.setFont (valorTextField.getFont ().deriveFont (12.0f));
        valorTextField.setForeground(Color.BLACK);

        confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(256,226,100,30);

        celsiusToFahrenheitTextField = new JTextField(6);
        celsiusToFahrenheitTextField.setBounds(23,369,65,23);
        celsiusToFahrenheitTextField.setFont (celsiusToFahrenheitTextField.getFont ().deriveFont (12.0f));
        celsiusToFahrenheitTextField.setForeground(Color.BLACK);

        celsiusToKelvinTextField = new JTextField(6);
        celsiusToKelvinTextField.setBounds(23,433,65,23);
        celsiusToKelvinTextField.setFont (celsiusToKelvinTextField.getFont ().deriveFont (12.0f));
        celsiusToKelvinTextField.setForeground(Color.BLACK);

        fahrenheitToKelvinTextField = new JTextField(6);
        fahrenheitToKelvinTextField.setBounds(156,369,65,23);
        fahrenheitToKelvinTextField.setFont (fahrenheitToKelvinTextField.getFont ().deriveFont (12.0f));
        fahrenheitToKelvinTextField.setForeground(Color.BLACK);

        fahrenheitToCelsiusTextField = new JTextField(6);
        fahrenheitToCelsiusTextField.setBounds(156,433,65,23);         
        fahrenheitToCelsiusTextField.setFont (fahrenheitToCelsiusTextField.getFont ().deriveFont (12.0f));
        fahrenheitToCelsiusTextField.setForeground(Color.BLACK);

        kelvinToCelsiusTextField = new JTextField(6);
        kelvinToCelsiusTextField.setBounds(269,369,65,23);
        kelvinToCelsiusTextField.setFont (kelvinToCelsiusTextField.getFont ().deriveFont (12.0f));
        kelvinToCelsiusTextField.setForeground(Color.BLACK);

        kelvinToFahrenheitTextField = new JTextField(6);
        kelvinToFahrenheitTextField.setBounds(269,433,65,23);
        kelvinToFahrenheitTextField.setFont (kelvinToFahrenheitTextField.getFont ().deriveFont (12.0f));
        kelvinToFahrenheitTextField.setForeground(Color.BLACK);

        statusLabel = new JLabel("");
        statusLabel.setBounds(120,246,146,23);

        root.add(valorTextField);
        root.add(statusLabel);
        root.add(confirmButton);
        root.add(celsiusToFahrenheitTextField);
        root.add(celsiusToKelvinTextField);
        root.add(fahrenheitToKelvinTextField);
        root.add(fahrenheitToCelsiusTextField);
        root.add(kelvinToCelsiusTextField);
        root.add(kelvinToFahrenheitTextField);
        root.add(wallpaper);

        setContentPane(root);
    }
    
    public void setConfirmButtonActionListener(ActionListener action){
        confirmButton.addActionListener(action);
    }
    
    public String getValor(){
        return valorTextField.getText();
    }

    public void setConvertions(){
        DecimalFormat df = new DecimalFormat("000.00");
        celsiusToFahrenheitTextField.setText(String.valueOf(df.format(model.getCelsiusToF())));
        celsiusToKelvinTextField.setText(String.valueOf(df.format(model.getCelsiusToK())));
        fahrenheitToKelvinTextField.setText(String.valueOf(df.format(model.getFahrenheitToK())));
        fahrenheitToCelsiusTextField.setText(String.valueOf(df.format(model.getFahrenheitToC())));
        kelvinToFahrenheitTextField.setText(String.valueOf(df.format(model.getKelvinToF())));
        kelvinToCelsiusTextField.setText(String.valueOf(df.format(model.getKelvinToC())));

    }

    public void setStatus(String message) {
        statusLabel.setText(message);
    }

}