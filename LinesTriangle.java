import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class LineTriangleFX extends Application
{
	public void init()
	{
		System.out.println("From init method");
	}
	public void start(Stage st)
	{
		System.out.println("From start() method");
		Line l=new Line(100,100,200,100);
		Line tl1,tl2,tl3;
		tl1=new Line(100,500,200,500);
		tl2=new Line(150,200,100,500);
		tl3=new Line(150,200,200,500);
		Group g=new Group(l,tl1,tl2,tl3);
		Scene s=new Scene(g,500,700);
	    s.setFill(Color.RED);
		st.setTitle("Lines and Triangle");
		st.setScene(s);
		st.show();
		}
		public void stop()
		{
			System.out.println("Froom stop() method");
		}
		public static void main(String args[])
		{
			System.out.println("From main() method");
			launch(args);
		}
}
