package src.loadingscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.navigation.AppNavigation;

public class LoadingScreenController {

    private LoadingScreenModel model;
    private LoadingScreenView view;

    public LoadingScreenController(LoadingScreenView view, LoadingScreenModel model) {
        this.model = model;
        this.view = view;
        this.view.setNextButtonActionListener(new NextButtonActionListener());
    }

    public void exibirTela(){
        view.setVisible(true);
    }

    public void toConversor(){
        try {
            view.dispose();
            AppNavigation.toConversor(model);
        }catch (Exception e){
            
        }
    }

    public class NextButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            toConversor();
        }

    }

}
