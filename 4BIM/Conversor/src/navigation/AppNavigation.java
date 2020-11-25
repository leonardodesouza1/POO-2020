package src.navigation;

import src.conversor.ConversorController;
import src.conversor.ConversorModel;
import src.conversor.ConversorView;
import src.loadingscreen.LoadingScreenModel;
import src.loadingscreen.LoadingScreenView;
import src.loadingscreen.LoadingScreenController;

public class AppNavigation {

    public static void toLoadingScreen(){
        LoadingScreenModel model = new LoadingScreenModel();
        LoadingScreenController control = new LoadingScreenController(new LoadingScreenView(model), model);
        control.exibirTela();
    }
    
    public static void toConversor(LoadingScreenModel model){
        ConversorModel conversorModel = new ConversorModel();
        ConversorController control = new ConversorController(new ConversorView(conversorModel), conversorModel);
        control.exibirTela();
    }

}
