import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
public class FlagButton extends Application
{
	Button in,sr,pk,usa,cd,exit;
	Label l;
	FlowPane fp;
	Scene s;
	public void init()
	{
		System.out.println("From init() method");
		in=new Button("Indian");
		sr=new Button("Sri Lanka");
		pk=new Button("Pakistan");
		usa=new Button("United States of America");
		cd=new Button("Canada");
		exit=new Button("Exit");
		l=new Label("Flag Displayed");
		fp=new FlowPane();
		fp.setAlignment(Pos.CENTER);
		fp.getChildren().addAll(in,sr,pk,usa,cd,exit,l);
		s=new Scene(fp,500,500);
	}
	public void start(Stage st) throws Exception
	{
		System.out.println("From start() method");
		in.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setText("India Clicked");
			}
		});
		sr.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae)
			{
				l.setText("SriLanka clicked");
			}
		});
		pk.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setText("Pakistan clicked");
			}
		});
		usa.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setText("United States of America clicked");
			}
		});
		cd.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setText("Canada Clicked");
			}
		});
		exit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				Platform.exit();
			}
		});
		st.setTitle("Flags and Maps");
		st.setScene(s);
		st.show();
	}
	public void stop()
	{
		System.out.println("From Stop() method");
	}
	public static void main(String args[])
	{
		System.out.println("From main() method");
		launch(args);
	}
}
