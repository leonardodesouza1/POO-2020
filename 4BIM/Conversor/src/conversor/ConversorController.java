package src.conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorController {

    private ConversorModel model;
    private ConversorView view;

    public ConversorController(ConversorView view, ConversorModel model) {
        this.model = model;
        this.view = view;
        this.view.setConfirmButtonActionListener(new ConfirmButtonActionListener());
    }

    public void exibirTela(){
        view.setVisible(true);
    }

    public void realizarConversoes(){
        Double valor = Double.parseDouble(view.getValor());
        model.convertCelsiusTo(valor);
        model.convertFahrenheitTo(valor);
        model.convertKelvinTo(valor);
        try{
            model.validarValor();
            view.setConvertions();
        }catch (ConversorException e){
            view.setStatus(e.getMessage());
        }

    }

    public class ConfirmButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            realizarConversoes();
        }

    }

}
