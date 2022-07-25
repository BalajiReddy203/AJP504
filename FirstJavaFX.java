import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
public class FirstJavaFXApp extends Application
{
	public void init()
	{
		System.out.println("From init method");
	}
	public void start(Stage st)
	{
		System.out.println("From start method");
		Group g=new Group();
		Scene s=new Scene(g,500,700);
		s.setFill(Color.RED);
		st.setTitle("JavaFX Virtual Cinema-More Rich");
		st.setScene(s);
		st.show();
	}
	public void stop()
	{
		System.out.println("From stop() method");
		System.out.println("Thank you Watch My Movie Again");
	}
	public static void main(String args[])
	{
		System.out.println("From main() method");
		launch(args);
	}
}
