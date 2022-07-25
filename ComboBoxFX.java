import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.collections.*;
public class ComboBoxFX extends Application
{
	ComboBox<String> cb;
	Label l;
	Scene s;
	FlowPane fp;
	public void init()
	{
		l=new Label("Select Branch from Combo Box");
		cb=new ComboBox<String>();
		ObservableList<String> items=FXCollections.observableArrayList("CSE","ECE","EEE","ME","CE","AI&DS","AI&ML");
		cb.setItems(items);
		cb.setValue("Branch");
		fp=new FlowPane(30,30);
		fp.getChildren().addAll(cb,l);
		fp.setAlignment(Pos.CENTER);
	}
	public void start(Stage st) throws Exception
	{
		cb.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				String str=cb.getValue();
				l.setText("My Branch is:"+str);
				
			}
		});
		s=new Scene(fp,500,500);
		st.setScene(s);
		st.setTitle("Know your Branch");
		st.show();
	}
	public static void main(String args[])
	{
		System.out.println("From main Method");
		launch(args);
	}
}
