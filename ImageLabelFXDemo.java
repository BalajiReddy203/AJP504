import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
public class ImageLabelFXDemo extends Application
{
	Image i1,i2;
	ImageView iv1,iv2;
	Label l1,l2;
	FlowPane fp;
	Scene s;
	public void init()
	{
		System.out.println("From init() method");
		i1=new Image("AITS.jpg",300,200,true,true);
		i2=new Image("download.jpeg",300,200,true,true);
		iv1=new ImageView(i1);
		iv2=new ImageView(i2);
		l1=new Label("Vidwan Sarvatra Pujyate",iv1);
		l2=new Label("Creator of java Programming Language",iv2);
		l1.setContentDisplay(ContentDisplay.TOP);
		l2.setContentDisplay(ContentDisplay.BOTTOM);
		fp=new FlowPane();
		fp.setAlignment(Pos.CENTER);
		fp.getChildren().addAll();
	}
	public void start(Stage st)
	{
		System.out.println("From start() method");
		s=new Scene(fp,700,700);
		st.setScene(s);
		st.setTitle("AITS and James Gosling");
		st.show();
	}
	public static void main(String args[])
	{
		System.out.println("From main()method");
		launch(args);
	}
}
