import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.Group;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
public class ArcFX extends Application
{
	public void init()
	{
		System.out.println("From init method");
	}
	public void start(Stage st)
	{
		Arc arc=new Arc();
		arc.setCenterX(100);
		arc.setCenterY(200);
		arc.setRadiusX(50);
		arc.setRadiusY(150);
		arc.setStartAngle(130);
		arc.setLength(100);
		arc.setType(ArcType.OPEN);
		Group root=new Group(arc);
		Scene scene=new Scene(root,600,300);
		st.setTitle("Drawing an Arc");
		st.setScene(scene);
		st.show();
	}
	public void stop()
	{
		System.out.println("From stop() method");
	}
	public static void main(String args[])
	{
		System.out.println("From main method()");
		launch(args);
	}
}
