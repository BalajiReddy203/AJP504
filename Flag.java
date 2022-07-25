import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
public class Flag extends Application
{
	public void init()
	{
		System.out.println("from init method");
	}
	public void start(Stage st)throws Exception
	{
		System.out.println("from start() method");
		Text t=new Text();
		t.setText("Flag shape");
		t.setX(50);
		t.setY(50);
		Circle c;
		Rectangle r1,r2,r3,r4,r5;
		r1=new Rectangle(150,150,150,100);
		r2=new Rectangle(150,250,150,100);
		r3=new Rectangle(150,350,150,100);
		r1.setFill(Color.ORANGE);
		r2.setFill(Color.WHITE);
		r3.setFill(Color.GREEN);
		r4=new Rectangle(120,100,30,600);
		r5=new Rectangle(100,700,70,40);
		c=new Circle(225,300,50);
		Group g=new Group(t,r1,r2,r3,r4,r5,c);
		Scene s=new Scene(g,1000,1000);
		s.setFill(Color.WHITE);
		st.setTitle("Flag shape");
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
