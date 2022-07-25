import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
public class ImageFXDemo extends Application
{
	Image i;
	ImageView iv;
	FlowPane fp;
	Scene s;
	public void init()
	{
		System.out.println("From init() method");
		i=new Image("AITS.jpg");
		iv=new ImageView(i);
		iv.setFitWidth(300);
		iv.setFitHeight(200);
		iv.setPreserveRatio(true);
		iv.setSmooth(true);
		fp=new FlowPane();
		fp.getChildren().addAll(iv);
		fp.setAlignment(Pos.CENTER);
	}
	public void start(Stage st) throws Exception
	{
		System.out.println("From start()method");
		s=new Scene(fp,500,500);
		st.setTitle("Satya Shodhana");
		st.show();
	}
	public static void main(String args[])
	{
		System.out.println("From main() method");
		launch(args);	
	}	
}
