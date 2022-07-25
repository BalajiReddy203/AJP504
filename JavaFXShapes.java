import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class JavaFXShapes extends Application
{
	public void init()
	{
		System.out.println("From init() method");
	}
	public void start(Stage st)
	{
		System.out.println("From start Method");
		Circle c;
		Rectangle r1,rr;
		Ellipse e;
		c=new Circle(120,100,50);
		c.setFill(Color.PINK);
		r1=new Rectangle(70,170,70,50);
		r1.setFill(Color.RED);
		rr=new Rectangle(70,250,70,50);
		rr.setArcWidth(30);
		rr.setArcHeight(25);
		rr.setFill(Color.GREEN);
		e=new Ellipse(120,400,100,50);
		e.setFill(Color.YELLOW);
		Group g=new Group(c,r1,rr,e);
		Scene s=new Scene(g,700,900);
		s.setFill(Color.ORANGE);
		st.setTitle("JavaFX Shapes");
		st.setScene(s);
		st.show();
	}
	public void stop()
	{
		System.out.println("From stop() method");
	}
	public static void main(String args[])
	{
		System.out.println("From  main method");
		launch(args);
	}
}
