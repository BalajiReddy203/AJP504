import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
public class Aeroplane extends Application
{
	public void init()
	{
		System.out.println("from init method");
	}
	public void start(Stage st)throws Exception
	{
		System.out.println("from start() method");
		Text t=new Text();
		t.setText("Aeroplane shape");
		t.setX(50);
		t.setY(50);
		Line lt1=new Line(100,350,500,350);
		Line lt2=new Line(100,350,200,250);                                            
		Line lt3=new Line(200,250,450,250);
		Line lt4=new Line(450,250,550,100);
		Line lt5=new Line(550,100,500,350);
		Line lt6=new Line(250,250,400,200);
		Line lt7=new Line(400,200,300,250);                                            
		Line lt8=new Line(300,350,400,400);
		Line lt9=new Line(400,400,250,350);
		Group g=new Group(t,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,lt9);
		Scene s=new Scene(g,1000,1000);
		s.setFill(Color.WHITE);
		st.setTitle("Aeroplane");
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
