import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.collections.*;
public class ListViewDemo extends Application
{
	ListView<String> lv;
	ScrollPane sp;
	Label l;
	Button b;
	Scene s;
	FlowPane fp;
	public void init()
	{
		l=new Label();
		b=new Button("Find your Hobbies");
		lv=new ListView<String>();
		ObservableList<String> items=
		FXCollections.observableArrayList("OTT","Competitive Programming",
		"Learning Programming Languages","Learning Music","App Development",
		"Nature Learner","Games","Watching TV Serials","Social Media");
		lv.setItems(items);
		lv.setPrefSize(400,400);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		sp=new ScrollPane(lv);
		sp.setPrefViewportWidth(300);
		sp.setPrefViewportHeight(300);
		sp.setPannable(true);
		fp=new FlowPane(20,20);
		fp.getChildren().addAll(sp,b,l);
		fp.setAlignment(Pos.CENTER);
	}
	public void start(Stage st) throws Exception
	{
		b.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				String selItems="";
				ObservableList<String> item=
				lv.getSelectionModel().getSelectedItems();
				for(int i=0;i<item.size();i++)
					selItems+="\n"+item.get(i);
				l.setText(" "+selItems);
			}
		}
		);
		s=new Scene(fp,500,500);
		st.setScene(s);
		st.setTitle("Find your More Hobbies");
		st.show();
	}
	public void main(String args[])
	{
		System.out.println("From main method");
		launch(args);
	}
}
