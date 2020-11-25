package src.loadingscreen;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class LoadingScreenView extends JFrame {

    private LoadingScreenModel model;
    private JButton nextButton;

    public LoadingScreenView(LoadingScreenModel model) {
        this.model = model;
        setTitle("Conversor de temperatura");
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

        image = new ImageIcon("assets/imgs/Main.png");
        JLabel wallpaper = new JLabel(image);
        wallpaper.setLocation(0,0);

        nextButton = new JButton("→");
        nextButton.setBounds(165,500,65,55);
        nextButton.setFont(nextButton.getFont ().deriveFont (35.0f));

        root.add(nextButton);
        root.add(wallpaper);
        setContentPane(root);
    }

    public void setNextButtonActionListener(ActionListener action){
        nextButton.addActionListener(action);
    }
}