import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.image.*;
import javafx.geometry.*;
public class RadioButtonDemo extends Application
{
	RadioButton rb1,rb2,rb3,rb4,rb5;
	ToggleGroup tg;
	Image i1,i2,i3,i4,i5;
	ImageView iv1,iv2,iv3,iv4,iv5;
	Label l;
	FlowPane fp;
	Scene s;
	public void init()
	{
		rb1=new RadioButton("Walk");
		rb2=new RadioButton("Cycle");
		rb3=new RadioButton("Car");
		rb4=new RadioButton("Train");
		rb5=new RadioButton("Aeroplane");
		tg=new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb3.setToggleGroup(tg);
		rb4.setToggleGroup(tg);
		rb5.setToggleGroup(tg);
		l=new Label("Select a Travel plan");
		i1=new Image("walk",200,200,true,true);
		i2=new Image("cycle",200,200,true,true);
		i3=new Image("car",200,200,true,true);
		i4=new Image("Train",200,200,true,true);
		i5=new Image("Aeroplane",200,200,true,true);
		iv1=new ImageView(i1);
		iv2=new ImageView(i2);
		iv3=new ImageView(i3);
		iv4=new ImageView(i4);
		iv5=new ImageView(i5);
		fp=new FlowPane(20,20);
		fp.setAlignment(Pos.CENTER);
		fp.getChildren().addAll(rb1,rb2,rb3,rb4,rb5,l);
		s=new Scene(fp,500,500);
	}
	public void start(Stage st)
	{
		rb1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setGraphic(iv1);
				l.setText("By walk");
			}
		});
		rb2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setGraphic(iv2);
				l.setText("Cycle");
			}
		});
		rb3.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setGraphic(iv3);
				l.setText("By Car");
			}
		});
		rb4.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setGraphic(iv4);
				l.setText("Train");
			}
		});
		rb5.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				l.setGraphic(iv5);
				l.setText("Aeroplane");
			}
		});
		st.setTitle("select Travel Plan to come to College");
		st.setScene(s);
		st.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
		
}
