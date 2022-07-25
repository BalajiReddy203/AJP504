import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
public class Star extends Application
{
	public void init()
	{
		System.out.println("from init method");
	}
	public void start(Stage st)throws Exception
	{
		System.out.println("from start() method");
		Text t=new Text();
		t.setText("Star shape");
		t.setX(50);
		t.setY(50);
		Line lt1=new Line(100,500,250,100);
		Line lt2=new Line(250,100,500,500);                                            
		Line lt3=new Line(500,500,100,200);
		Line lt4=new Line(100,200,500,200);
		Line lt5=new Line(500,200,100,500);
		Group g=new Group(t,lt1,lt2,lt3,lt4,lt5);
		Scene s=new Scene(g,1000,1000);
		s.setFill(Color.BLUE);
		st.setTitle("Lines and Text");
		st.setScene(s);
		st.show();
	}
	public void stop()
	{
		 System.out.println("from stop method");
		 System.out.println("thank you watch my movie again");
	}
	public static void main(String args[])
	{
		 System.out.println("from main() method");
		 launch(args);
	}
}
