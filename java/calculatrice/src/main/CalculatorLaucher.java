package main;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import controller.Controller;
import model.Model;
import view.View;


public class CalculatorLaucher extends Application{
	
	
	public static void main(String [ ] args){
         launch(args);		 	
	}
	
	public void start(Stage primaryStage) throws Exception {
		
         View  view  = new View();
         Model model = new Model();
         
         primaryStage.setResizable(false);
         primaryStage.setTitle("Calculatrice");
         primaryStage.setScene(view.getScene());
         primaryStage.show();	
         
         new Controller(view, model).start();
         
         exitApplication(primaryStage);
	 }
	
     private void exitApplication(Stage primaryStage) {
    	 
         primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {	
              public void handle(WindowEvent we) {
                  System.exit(0);
              }
          }); 	
	  }
	
}
