import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.input.*;
public class MenuFXDemo extends Application
{
	Label response;
	ImageView ivo;
	MenuBar mb;
	Menu fileMenu,optionsMenu,colorsMenu,priorityMenu,helpMenu;
	BorderPane bp;
	MenuItem open,save,close,exit,red,green,blue,high,low,reset,about;
	SeparatorMenuItem sm;
	Scene s;
	public void init()
	{
		response=new Label("Menu Demo");
		mb=new MenuBar();
		fileMenu=new Menu("_File");
		fileMenu.setMnemonicParsing(true);
		ivo=new ImageView(new Image("images/.jpg",30,30,true,true));
		open=new MenuItem("open",ivo);
		close=new MenuItem("close");
		save=new MenuItem("save");
		sm=new SeparatorMenuItem();
		exit=new MenuItem("Exit");
		open.setAccelerator(KeyCombination.keyCombination("shortcut+o"));
		close.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+s"));
		exit.setAccelerator(KeyCombination.keyCombination("shortcut+e"));
		ContextMenu cm=new ContextMenu(open,close,save,exit);
		response.setContextMenu(cm);
		fileMenu.getItems().addAll(open,close,save,sm,exit);
		mb.getMenus().add(fileMenu);
		optionsMenu=new Menu("Options");
		colorsMenu=new Menu("Colors");
		red=new MenuItem("Red");
		green=new MenuItem("Green");
		SeparatorMenuItem spl=new SeparatorMeniItem();
		blue=new MenuItem("Blue");
		colorsMenu.getItems().addAll(red,green,spl,blue);
		optionsMenu.getItems().add(colorsMenu);
		priorityMenu=new Menu("Priority");
		high=new MenuItem("High");
		low=new MenuItem("Low");
		priorityMenu.getItems().addAll(high,low);
		optionsMenu.getItems().add(priorityMenu);
		SeparatorMenuItem sp=new SeparatorMenuItem();
		optionsMenu.getItems().add(sp);
		reset=new MenuItem("Reset");
		optionsMenu.getItems().add(reset);
		mb.getMenus().add(optionsMenu);
		helpMenu=new Menu("Help");
		about=new MenuItem("About");
		helpMenu.getItems().add(about);
		mb.getMenus().add(helpMenu);
		bp=new BorderPane();
		bp.setTop(mb);
		bp.setCenter(response);
	}
	public void start(Stage st)
	{
		EventHandler<ActionEvent> MEHandler=new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				String name=((MenuItem)ae.getTarget()).getText();
				if(name.equals("Exit")){
				Platform.exit();
			}
			response.setText(name+"Selected");
		}
	};
	open.setOnAction(MEHandler);
	close.setOnAction(MEHandler);
	save.setOnAction(MEHandler);
	exit.setOnAction(MEHandler);
	red.setOnAction(MEHandler);
	green.setOnAction(MEHandler);
	blue.setOnAction(MEHandler);
	high.setOnAction(MEHandler);
	low.setOnAction(MEHandler);
	reset.setOnAction(MEHandler);
	about.setOnAction(MEHandler);
	s=new Scene(bp,300,300);
	st.setTitle("Demonstrate Menus");
	st.setScene(s);
	st.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
