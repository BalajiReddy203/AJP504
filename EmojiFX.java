import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.scene.Group; 
import javafx.scene.shape.Arc;  
import javafx.scene.shape.ArcType; 
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class EmojiFx extends Application
{
	public void init()
	{
		System.out.println("from init method");
	}
    public void start(Stage st)
	{
	    Circle c=new Circle(300,300,50);
	    c.setFill(Color.YELLOW);
		Circle c1=new Circle(300,300,5);
	    c1.setFill(Color.BLACK);
	    Group g= new Group(c,c1); 
        Scene s= new Scene(g,500,500);  
        st.setTitle("Drawing an Arc"); 
        st.setScene(s); 
        st.show();
	}
	public void stop()
	{
		System.out.println("from stop method");
	}    
    public static void main(String args[])
	{ 
       launch(args); 
    } 
}		
