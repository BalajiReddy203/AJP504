import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;				
import javafx.scene.text.*;
public class CanvasDemo extends Application
{
	GraphicsContext gc;
	Canvas c;
	Color[]colors={Color.RED,Color.BLUE,Color.GREEN,Color.BLACK,Color.PURPLE,Color.ORANGE};
	Button b;
	Scene s;
	FlowPane fp;
	int colorIdx=0;
	public void init()
	{
		c=new Canvas(400,400);
		gc=c.getGraphicsContext2D();
		fp=new FlowPane();
		b=new Button("Let Change Color");
		fp.setAlignment(Pos.CENTER);
		fp.getChildren().addAll(c,b);
		s=new Scene(fp,500,500);
	}
	public void start(Stage st) throws Exception
	{
		gc.strokeLine(0,0,200,200);
		gc.strokeOval(100,100,200,200);
		gc.strokeRect(0,200,50,200);
		gc.fillOval(0,0,20,20);
		gc.fillRect(100,320,300,40);
		gc.fillText("Working on Canvas",50,50);
		b.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				gc.setStroke(colors[colorIdx]);
				gc.setFill(colors[colorIdx]);
				gc.strokeLine(0,0,200,200);
				gc.strokeOval(100,100,200,200);
				gc.strokeRect(0,200,50,200);
				gc.fillOval(0,0,20,20);
				gc.fillRect(100,320,300,40);
				gc.fillText("Working on Canvas",50,50);
				colorIdx++;
				if(colorIdx==colors.length);
				colorIdx=0;
			}
			}
			);
			st.setTitle("Drawing Directly on Canvas");
			st.setScene(s);
			st.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
