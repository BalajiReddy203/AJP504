import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
public class LabelFX extends Application
{
	public void start(Stage st)
	{
	FlowPane fp=new FlowPane();
	Label l1=new Label("AITS-Rajampet   ");
	Label l2=new Label("AITS-Tirupati   ");
	Label l3=new Label("AITS-Kadapa     ");
	Label l4=new Label("AITS-Hyderabad  ");
	fp.getChildren().addAll(l1,l2,l3,l4);
	fp.setAlignment(Pos.CENTER);
	Scene s=new Scene(fp,300,300);
	st.setScene(s);
	st.setTitle("JavaFX Label Demonstration");
	st.show();
    }
	public static void main(String args[])
	{
		launch(args);
	}
}
