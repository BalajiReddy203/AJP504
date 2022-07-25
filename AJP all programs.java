INDEX
Week-1:
a. Create Simple JavaFx appliication skeleton.
b. Demonstrate a JavaFX label.
c. Demonstrate JavaFX events and buttons
d. Demonstrate drawing on canvas
Week-2:
a. Load and display an image. Demonstrate an image in a label. Use an image 
with a button.
b. Demonstrate a toggle button.
c. A simple demonstration of Radio Buttons and event handling.
d. Radio button example demonstrates how the currently selected button in a 
group can be obtained under program control, when it is needed, rather than 
responding to action or change events.
Week-3:
a. Demonstrate Check Boxes.
b. Demonstrate a list view, adding scrollbars, enabling multiple selections in 
the list.
c. Demonstrate a combo box.
d. Demonstrate a text field.
Week-4:
a. Demonstrate a scroll pane
b. Demonstrate a TreeView
c. Demonstrate rotation, scaling, glowing, and inner shadow on JavaFx 
controls
d. Demonstrate different types of Menus
Week-5:
a. Java Program to get connection with Oracle Database, execute SQL 
Statements and handling the Result set.
Week-6:
a. Simple servlet program
b. Program to read servlet Parameters.
c. Program to handle HTTP Get and POST Request using servlets
Week-7:
a. Program for using Cookies i8n servlets.
b. Program for session tracking in servlets.
c. Program to access and perform operations on Database using servlets.
Week-8:
a. Simple JSP Program
b. Program to call a Java Bean in JSP 
c. Program to access properties Using jsp:getProperty and jsp:setProperty.
d. Simple JSP page with custom tags.
WEEK1
WEEK1a
Create Simple JavaFx appliication skeleton.
Program:
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
public class WEEK1a extends Application
{
 public void init()
 {
 System.out.println("init() method called");
 }
 public void start(Stage ps)
 {
 System.out.println("start() method called");
 FlowPane fp=new FlowPane();
 Scene s=new Scene(fp, 400, 300);
 ps.setScene(s);
 ps.setTitle("JAVAFX SKELETON");
 ps.show();
 }
 public void stop()
 {
 System.out.println("stop() method called");
 }
 public static void main(String[] args)
 {
 System.out.println("Launching JAVAFX application");
 launch(args);
 }
}
OUTPUT:
WEEK1b:
Demonstrate a JavaFX label.
Program:
import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class WEEK1b extends Application
{
 public void start(Stage ps)
 {
 System.out.println("start() method called");
 Label l=new Label("JAVAFX LABEL DEMO");
 StackPane sp=new StackPane();
 sp.getChildren().add(l);
 Scene s=new Scene(sp, 400, 300);
 ps.setScene(s);
 ps.setTitle("JAVAFX LABEL");
 ps.show();
 }
 public static void main(String[] args)
 {
 System.out.println("Launching JAVAFX application");
 launch(args);
 }
}
OUTPUT:
WEEK1c:
Demonstrate JavaFX events and buttons
Program:
import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class WEEK1c extends Application
{
 public void start(Stage ps)
 {
 System.out.println("start() method called");
 Label l=new Label("<======JAVAFX BUTTON DEMO=======>");
 l.setTextFill(Color.BISQUE);
 Button btn1=new Button("CSE");
 Button btn2=new Button("IT");
 Button btn3=new Button("ECE");
 Button btn4=new Button("EEE");
 btn1.setStyle("-fx-background-color:CHARTREUSE");
 btn2.setStyle("-fx-background-color:coral");
 btn3.setStyle("-fx-background-color:red");
 btn4.setStyle("-fx-background-color:yellow");
 FlowPane fp=new FlowPane();
 fp.setHgap(50);
 fp.setVgap(50);
 fp.setAlignment(Pos.CENTER);
 fp.setMaxSize(500,300);
 fp.setBackground(Background.EMPTY);
 fp.getChildren().addAll(btn1,btn2,btn3,btn4,l);
 Scene s=new Scene(fp,500,300,Color.BROWN);
 ps.setScene(s);
 ps.setTitle("JAVAFX LABEL");
 ps.setResizable(false);
 ps.show();
 
 btn1.setOnAction(new EventHandler<ActionEvent>()
 {
 public void handle(ActionEvent ae)
 {
 l.setText("COMPUTER SCINECE & ENGINEERING");
 l.setFont(Font.font("Bookmanoldstyle", 20));
 l.setWrapText(true);
 l.setTextFill(Color.CHARTREUSE);
 }
 });
 
 btn2.setOnAction(new EventHandler<ActionEvent>()
 {
 public void handle(ActionEvent ae)
 {
 l.setText("INFORMATION TECHNOLOGY");
 //Sl.setFont(20);
 l.setTextFill(Color.CORAL);
 }
 });
 
 btn3.setOnAction(new EventHandler<ActionEvent>()
 {
 public void handle(ActionEvent ae)
 {
 l.setText("ELECTRONICS AND COMMUNICATION ENGINEERING");
 l.setTextFill(Color.RED);
 }
 });
 
 btn4.setOnAction(new EventHandler<ActionEvent>()
 {
 public void handle(ActionEvent ae)
 {
 l.setText("ELECTRICAL AND ELECTRONICS ENGINEERING");
 l.setTextFill(Color.YELLOW);
 }
 });
 
 }
 public static void main(String[] args)
 {
 System.out.println("Launching JAVAFX application");
 launch(args);
 }
}
OUTPUT:
WEEK1d:
Demonstrate drawing on canvas
Program:
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.*;
public class WEEK1d extends Application
{
 public void start(Stage ps) 
 {
 System.out.println("start() method called");
 Canvas canvas = new Canvas(400, 200);
 GraphicsContext gc = canvas.getGraphicsContext2D();
 gc.setLineWidth(2.0);
 gc.setFill(Color.RED);
 gc.strokeRoundRect(10, 10, 50, 50, 10, 10);
 gc.fillRoundRect(100, 10, 50, 50, 10, 10);
 gc.setFill(Color.BLUE); 
 gc.strokeOval(10, 70, 50, 30);
 gc.fillOval(100, 70, 50, 30);
 gc.strokeLine(200, 50, 300, 50);
 gc.strokeArc(320, 10, 50, 50, 40, 80, ArcType.ROUND);
 gc.fillArc(320, 70, 50, 50, 00, 120, ArcType.OPEN);
 Pane root = new Pane();
 root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" +
 "-fx-border-width: 2;" + "-fx-border-insets: 5;" +
 "-fx-border-radius: 5;" + "-fx-border-color: blue;");
 root.getChildren().add(canvas);
 Scene scene = new Scene(root);
 ps.setScene(scene);
 ps.setTitle("Drawing Basic Shapes on a Canvas");
 ps.show(); 
 }
 public static void main(String[] args) 
 {
 System.out.println("Launching JAVAFX application");
 Application.launch(args);
 }
}
OUTPUT:
WEEK2
WEEK2A:
Load and display an image. Demonstrate an image in a label. Use an image with a button.
Program:
package week2;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class WEEK2a extends Application {
 
 @Override
 public void start(Stage primaryStage)throws Exception {
 //FileInputStream input1 = new FileInputStream("F:/JAVAFX/india.png");
 // FileInputStream input2 = new FileInputStream("F:/JAVAFX/America.png");
 Image img1=new Image(getClass().getResourceAsStream("india.png"));
 Image img2=new Image(getClass().getResourceAsStream("America.png"));
 ImageView im1=new ImageView(img1);
 ImageView im2=new ImageView(img2);
 im1.setFitWidth(250);
 im1.setFitHeight(150);
 im2.setFitWidth(250);
 im2.setFitHeight(150);
 Image img3=new Image(getClass().getResourceAsStream("india.png"));
 Image img4=new Image(getClass().getResourceAsStream("America.png"));
 ImageView im3=new ImageView(img1);
 ImageView im4=new ImageView(img2);
 im3.setFitWidth(80);
 im3.setFitHeight(40);
 im4.setFitWidth(80);
 im4.setFitHeight(40);
 Label l1=new Label("INDIA",im1);
 Label l2=new Label("AMERICA",im2);
 l1.setContentDisplay(ContentDisplay.BOTTOM);
 l2.setContentDisplay(ContentDisplay.BOTTOM);
 Button btn1 = new Button("INDIA",im3);
 Button btn2 = new Button("AMERICA",im4);
 btn1.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
 btn2.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
 btn1.setPrefSize(80,40);
 btn2.setPrefSize(80,40);
 FlowPane fp=new FlowPane();
 fp.getChildren().addAll(btn1,btn2);
 fp.setHgap(50);
 fp.setVgap(50);
 fp.setAlignment(Pos.CENTER);
 GridPane gp=new GridPane();
 gp.setBackground(Background.EMPTY);
 gp.setAlignment(Pos.CENTER);
 gp.setVgap(50);
 gp.add(fp,0,1);
 //gp.setGridLinesVisible(true);
 
 btn1.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println(event.getSource());
 gp.getChildren().removeAll(l1,l2);
 gp.add(l1,0,0);
 GridPane.setHalignment(l1, HPos.CENTER);
 }
 });
 btn2.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println(event.getSource());
 gp.getChildren().removeAll(l1,l2);
 gp.add(l2,0,0);
 GridPane.setHalignment(l2, HPos.CENTER);
 }
 }); 
 
 Scene scene = new Scene(gp,400,300,Color.BISQUE);
 primaryStage.setTitle("IMAGE ANIMATION");
 primaryStage.setScene(scene);
 primaryStage.setResizable(false);
 primaryStage.initStyle(StageStyle.UNDECORATED);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
OUTPUT:
WEEK2B:
Demonstrate a toggle button.
Program:
package week2;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Week2b extends Application {
 @Override
 public void start(Stage primaryStage) {
 Label msg = new Label("Your selection: None");
 msg.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 25));
 Label l=new Label("SELECT THE SUBJECT:");
 l.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 10));
 ToggleButton tb1=new ToggleButton("ADVANCED JAVA");
 ToggleButton tb2=new ToggleButton("COMPILER DESIGN");
 ToggleButton tb3=new ToggleButton("PYTHON PROGRAMMING");
 ToggleButton tb4=new ToggleButton("COMPUTER NETWORKS");
 
 /** ToggleGroup tg=new ToggleGroup();
 tb1.setToggleGroup(tg);
 tb2.setToggleGroup(tg);
 tb3.setToggleGroup(tg);
 tb4.setToggleGroup(tg);**/
 HBox hb=new HBox();
 hb.getChildren().addAll(tb1,tb2,tb3,tb4);
 hb.setSpacing(10); 
 VBox root=new VBox();
 root.getChildren().addAll(msg,l,hb);
 root.setSpacing(10); 
 root.setMinSize(600,200);
 root.setAlignment(Pos.CENTER);
 root.setBackground(Background.EMPTY);
 
 /** ChangeListener<Toggle> listener=new ChangeListener<Toggle>() {
 @Override
 public void changed(ObservableValue<? extends Toggle> observable, Toggle 
oldValue, Toggle newValue) {
 ToggleButton tb=(ToggleButton)newValue;
 msg.setText("Your selection:"+tb.getText());
 
 }
 };
 tg.selectedToggleProperty().addListener(listener);**/
 tb1.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(tb1.isSelected()) 
 {
 msg.setText("Your selection:"+tb1.getText());
 }
 else
 {
 msg.setText("Your selection:None");
 }
 }
 });
 tb4.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(tb4.isSelected()) 
 {
 msg.setText("Your selection:"+tb4.getText());
 }
 else
 {
 msg.setText("Your selection:None");
 }
 }
 });
 tb2.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(tb2.isSelected()) 
 {
 msg.setText("Your selection:"+tb2.getText());
 }
 else
 {
 msg.setText("Your selection:None");
 }
 }
 });
 tb3.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(tb3.isSelected()) 
 {
 msg.setText("Your selection:"+tb3.getText());
 }
 else
 {
 msg.setText("Your selection:None");
 }
 }
 });
 Scene scene = new Scene(root,560,200,Color.AQUAMARINE);
 primaryStage.setTitle("TOGGLE BUTTON");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
}
OUTPUT:
WEEK2c:
A simple demonstration of Radio Buttons and event handling.
Program:
package week2;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Week2c extends Application {
 @Override
 public void start(Stage primaryStage) {
 Label l=new Label("SELECT THE TRANSPORT");
 Label msg = new Label("Transport Selected is:None");
 msg.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 25));
 
 l.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 15));
 RadioButton rb1=new RadioButton("Car");
 RadioButton rb2=new RadioButton("Bus");
 RadioButton rb3=new RadioButton("Train");
 RadioButton rb4=new RadioButton("Airplane");
 
 ToggleGroup tg=new ToggleGroup();
 tg.getToggles().addAll(rb1,rb2,rb3,rb4);
 rb1.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb2.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb3.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb4.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 /**rb1.setToggleGroup(tg);
 rb2.setToggleGroup(tg);
 rb3.setToggleGroup(tg);
 rb4.setToggleGroup(tg);**/
 HBox hb=new HBox();
 hb.getChildren().addAll(rb1,rb2,rb3,rb4);
 hb.setAlignment(Pos.CENTER);
 hb.setSpacing(10); 
 VBox root=new VBox();
 root.getChildren().addAll(l,hb,msg);
 root.setSpacing(15); 
 root.setMinSize(350,200);
 root.setAlignment(Pos.CENTER);
 root.setBackground(Background.EMPTY);
 
 /** ChangeListener<Toggle> listener=new ChangeListener<Toggle>() {
 @Override
 public void changed(ObservableValue<? extends Toggle> observable, Toggle 
oldValue, Toggle newValue) {
 RadioButton rb=(RadioButton)newValue;
 msg.setText("Transport Selected is:"+rb.getText());
 
 }
 };
 tg.selectedToggleProperty().addListener(listener);**/
 
 rb1.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(rb1.isSelected()) 
 {
 msg.setText("Transport Selected is:"+rb1.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 }
 });
 rb2.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(rb2.isSelected()) 
 {
 msg.setText("Transport Selected is:"+rb2.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 }
 });
 rb3.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(rb3.isSelected()) 
 {
 msg.setText("Transport Selected is:"+rb3.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 }
 });
 rb4.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(rb4.isSelected()) 
 {
 msg.setText("Transport Selected is:"+rb4.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 }
 });
 Scene scene = new Scene(root,350,200,Color.BURLYWOOD);
 primaryStage.setTitle("RADIO BUTTON");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
OUTPUT:
WEEK2d:
Radio button example demonstrates how the currently selected button in a group can be 
obtained under program control, when it is needed, rather than responding to action or 
change events.
Program:
package week2;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Week2d extends Application {
 @Override
 public void start(Stage primaryStage) {
 Label l=new Label("SELECT THE TRANSPORT");
 l.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 15));
 Label msg = new Label("No Transport Confirmed");
 msg.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 25));
 
 RadioButton rb1=new RadioButton("Car");
 RadioButton rb2=new RadioButton("Bus");
 RadioButton rb3=new RadioButton("Train");
 RadioButton rb4=new RadioButton("Airplane");
 
 ToggleGroup tg=new ToggleGroup();
 tg.getToggles().addAll(rb1,rb2,rb3,rb4);
 rb1.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb2.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb3.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 rb4.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
 
 Button btn=new Button("Confirm Transport Selction");
 
 Separator sep=new Separator();
 sep.setPrefWidth(350);
 
 HBox hb=new HBox();
 hb.getChildren().addAll(rb1,rb2,rb3,rb4);
 hb.setAlignment(Pos.CENTER);
 hb.setSpacing(10); 
 
 VBox root=new VBox();
 root.getChildren().addAll(l,hb,sep,btn,msg);
 root.setSpacing(15); 
 root.setMinSize(350,200);
 root.setAlignment(Pos.CENTER);
 root.setBackground(Background.EMPTY);
 btn.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 
if(tg.getSelectedToggle()==(RadioButton)rb1||tg.getSelectedToggle()==(RadioButton)rb2|| 
tg.getSelectedToggle()==(RadioButton)rb3||tg.getSelectedToggle()==(RadioButton)rb4)
 {
 RadioButton rb=(RadioButton)tg.getSelectedToggle();
 msg.setText(rb.getText()+" is Confirmed");
 }
 else
 {
 msg.setText("Please Select the Transport");
 }
 }
 });
 Scene scene = new Scene(root,350,200,Color.BURLYWOOD);
 primaryStage.setTitle("RADIO BUTTON");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
}
OUTPUT:
WEEK3
WEEK3A:
Demonstrate Check Boxes.
Program:
package week3;
import javafx.application.*;
import javafx.beans.value.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.*;
public class Week3a extends Application {
 CheckBox cb1,cb2,cb3,cb4;
 Label msg,tlist;
@Override
public void start(Stage primaryStage) {
tlist=new Label("Transport List is:<NONE>");
tlist.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 25));
Label l=new Label("SELECT THE TRANSPORT");
msg = new Label("Transport Selected is:None");
msg.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 20));
l.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 15));
cb1=new CheckBox("Car");
cb2=new CheckBox("Bus");
cb3=new CheckBox("Train");
cb4=new CheckBox("Airplane");
cb1.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
cb2.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
cb3.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
cb4.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 12));
cb2.setAllowIndeterminate(true);
//cb2.setIndeterminate(true);
//cb1.setSelected(true);
HBox hb=new HBox();
hb.getChildren().addAll(cb1,cb2,cb3,cb4);
hb.setAlignment(Pos.CENTER);
hb.setSpacing(10);
VBox root=new VBox();
root.getChildren().addAll(l,hb,msg,tlist);
root.setSpacing(15);
root.setMinSize(500,200);
root.setAlignment(Pos.CENTER);
root.setBackground(Background.EMPTY);
ChangeListener<Boolean> listener=new ChangeListener<Boolean>() {
@Override
public void changed(ObservableValue<? extends Boolean> observable, Boolean 
oldValue,Boolean newValue)
{
 if(cb1.isSelected())
 {
 msg.setText("Transport Selected is:"+cb1.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 showAll();
 }
};
cb1.selectedProperty().addListener(listener);
cb2.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
 if(cb2.isIndeterminate())
 {
 msg.setText(cb2.getText()+" Transport is Indeterminate");
 }
 else if(cb2.isSelected())
 {
 msg.setText("Transport Selected is:"+cb2.getText());
 }
 else
 {
 msg.setText("Transport Selected is:None");
 }
 showAll();
}
});
cb3.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
if(cb3.isSelected())
{
msg.setText("Transport Selected is:"+cb3.getText());
}
else
{
msg.setText("Transport Selected is:None");
}
 showAll();
}
});
cb4.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
if(cb4.isSelected())
{
msg.setText("Transport Selected is:"+cb4.getText());
}
else
{
msg.setText("Transport Selected is:None");
}
 showAll();
}
});
//cb1.fire();
Scene scene = new Scene(root,500,200,Color.BURLYWOOD);
primaryStage.setTitle("RADIO BUTTON");
primaryStage.setScene(scene);
primaryStage.show();
}
public void showAll()
{
 String list=" ";
 if(cb1.isSelected())
 list="Car";
 if(cb2.isSelected())
 list+=" Bus";
 if(cb3.isSelected())
 list+=" Train";
 if(cb4.isSelected())
 list+=" Airplane";
 
 if(list.equals(" "))
 list=" <NONE>";
 tlist.setText("Transport List is:"+list);
 
}
public static void main(String[] args) {
launch(args);
}
}
OUTPUT:
WEEK3B:
Demonstrate a list view, adding scrollbars, enabling multiple selections in the list.
Program:
package week3;
import javafx.application.Application;
import javafx.beans.value.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Week3b extends Application {
 Label msg,tlist;
 @Override
 public void start(Stage primaryStage) {
 tlist=new Label("Fruit List is:<NONE>");
 tlist.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 18));
 Label l=new Label("SELECT THE FRUIT");
 msg = new Label("Selected Fruit is:None");
 msg.setFont(Font.font("Britannic Bold", FontWeight.EXTRA_BOLD, 20));
 l.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 15));
 
 ObservableList<String> 
oblist=FXCollections.observableArrayList("APPLE","MANGO","ORANGE","GRAPES","STRW
ABERRY","GOA");
 ListView<String> lv=new ListView<String>(oblist);
 lv.setPrefSize(80, 80);
 MultipleSelectionModel<String> lvmodel=lv.getSelectionModel();
 lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
 
 ChangeListener<String> listener=new ChangeListener<String>() {
 @Override
 public void changed(ObservableValue<? extends String> observable, String 
oldValue, String newValue) {
 
 msg.setText("Last Selected Fruit is:"+newValue);
 String list=" ";
 ObservableList<String> selected=lv.getSelectionModel().getSelectedItems();
 for(int i=0;i<selected.size();i++)
 list+="\n "+selected.get(i);
 
 tlist.setText("Fruit List:"+list);
 }
 };
 lvmodel.selectedItemProperty().addListener(listener);
 
 HBox hb=new HBox();
 hb.getChildren().add(lv);
 hb.setAlignment(Pos.CENTER);
 hb.setSpacing(10);
 VBox root=new VBox();
 root.getChildren().addAll(l,hb,msg,tlist);
 root.setSpacing(15);
 root.setMinSize(500,500);
 root.setAlignment(Pos.CENTER);
 root.setBackground(Background.EMPTY);
 
 Scene scene = new Scene(root,500,500,Color.BURLYWOOD);
 primaryStage.setTitle("RADIO BUTTON");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
OUTPUT:
WEEK3c:
Demonstrate a Combo Box.
Program:
package week3;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class Week3c extends Application {
 String address;
 TextField tf,utf;
 PasswordField ptf;
 TextArea ta;
 @Override
 public void start(Stage ps) {
 Text t=new Text();
 t.setText("WELCOME TO JMAIL");
 t.setTextAlignment(TextAlignment.CENTER);
 t.setUnderline(true);
 Label user=new Label("UserEmail:");
 utf=new TextField();
 utf.setPromptText("UserEmail");
 Label pass=new Label("Password:");
 ptf=new PasswordField();
 ptf.setPromptText("Password");
 Label to=new Label("To: ");
 ComboBox cb=new ComboBox();
 cb.setPrefSize(370, 20);
 
cb.getItems().addAll("cse@gmail.com","ece@gmail.com","eee@gmail.com","it@yahoo.co.in");
 cb.setPromptText("Email Address");
 cb.setEditable(true);
 Label subject=new Label("Subject: ");
 tf=new TextField();
 tf.setPromptText("Enter Your Subject Here.");
 ta=new TextArea();
 ta.setPromptText("Enter Your Text Here.");
 Label notification=new Label();
 Button b=new Button("SEND");
 
 GridPane gp=new GridPane();
 gp.setVgap(4);
 gp.setHgap(10);
 gp.setPadding(new Insets(5, 5, 5, 5));
 gp.add(t,0,0,4,1);
 GridPane.setHalignment(t, HPos.CENTER);
 gp.add(user,0,1);
 gp.add(utf,1,1);
 gp.add(pass,2,1);
 gp.add(ptf,3,1);
 gp.add(to,0,2);
 gp.add(cb,1,2,4,1);
 gp.add(subject,0,3);
 gp.add(tf,1,3,3,1);
 gp.add(ta,0,4,4,1);
 gp.add(notification,0,5,3,1);
 gp.add(b,3,5);
 GridPane.setHalignment(b, HPos.RIGHT);
 
 //gp.setGridLinesVisible(true);
 gp.setAlignment(Pos.CENTER);
 gp.setBackground(Background.EMPTY);
 
 cb.valueProperty().addListener(new ChangeListener<String>() {
 @Override 
 public void changed(ObservableValue ov, String oldvalue, String newvalue) { 
 address = newvalue; 
 } 
 });
 
 b.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 if(cb.getValue()!=null)
 {
 notification.setText("Your message was successfully sent to " + address);
 notification.setTextFill(Color.GREEN);
 cb.setValue(null);
 tf.clear();
 utf.clear();
 ptf.clear();
 ta.clear();
 }
 else
 {
 notification.setText("You have not selected a recipient!");
 notification.setTextFill(Color.RED);
 }
 
 }
 });
 
 Scene s = new Scene(gp,500,300,Color.BURLYWOOD);
 ps.setScene(s);
 ps.setTitle("ComboBox");
 ps.show();
 
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
OUTPUT:
WEEK3d:
Demonstrate a Text Field.
Program:
package week3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Week3d extends Application {
 
 @Override
 public void start(Stage primaryStage) {
 Label s=new Label("SOURCE:");
 TextField tf1=new TextField();
 tf1.setPrefColumnCount(12);
 tf1.setPromptText("Source");
 Label d=new Label("DESTINATION:");
 TextField tf2=new TextField();
 tf2.setPrefColumnCount(12);
 tf2.setPromptText("Destination");
 Button mv = new Button();
 mv.setText("MOVE");
 Button cl = new Button();
 cl.setText("CLEAR");
 Label msg=new Label();
 GridPane root = new GridPane();
 root.setHgap(4);
 root.setVgap(10);
 root.setPadding(new Insets(5,5,5,5));
 root.add(s,0,0);
 root.add(tf1,1,0);
 root.add(d,2,0);
 root.add(tf2,3,0);
 root.add(mv,0,1,2,1);
 GridPane.setHalignment(mv, HPos.RIGHT);
 root.add(cl,2,1,2,1);
 GridPane.setHalignment(cl, HPos.LEFT);
 root.add(msg, 0,2,4,1);
 GridPane.setHalignment(msg, HPos.CENTER);
 root.setAlignment(Pos.CENTER);
 //root.setGridLinesVisible(true);
 root.setBackground(Background.EMPTY);
 mv.setOnAction(new EventHandler<ActionEvent>() {
 
 @Override
 public void handle(ActionEvent event) {
 if(!tf1.getText().isEmpty())
 {
 tf2.setText(tf1.getText());
 tf1.clear();
 }
 else if(!tf2.getText().isEmpty())
 {
 tf1.setText(tf2.getText());
 tf2.clear();
 }
 else
 {
 msg.setText("Please Provide data");
 msg.setTextFill(Color.RED);
 }
 
 }
 });
 
 cl.setOnAction(new EventHandler<ActionEvent>() {
 
 @Override
 public void handle(ActionEvent event) {
 tf1.clear();
 tf2.clear();
 msg.setText("");
 tf1.requestFocus();
 }
 });
 Scene scene = new Scene(root, 500, 250,Color.BURLYWOOD);
 primaryStage.setTitle("TEXTFIELD");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
OUTPUT:
WEEK4
WEEK4a:
Demonstrate a scroll pane
Program:
package week4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Week4a extends Application {
 
 @Override
 public void start(Stage primaryStage) {
 
 Button btn = new Button();
 btn.setText("RESET SCROLLBAR");
 Image im=new Image(getClass().getResourceAsStream("aits.jpg"));
 ImageView imv=new ImageView(im);
 imv.setFitHeight(300);
 imv.setFitWidth(400);
 ScrollPane sp=new ScrollPane();
 sp.setContent(imv);
 sp.setPannable(true);
 //sp.setPrefSize(300, 250);
 sp.setPrefViewportHeight(350);
 sp.setPrefViewportWidth(300);
 sp.setHmax(20);
 sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
 sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
 VBox root=new VBox();
 root.getChildren().addAll(sp,btn);
 root.setAlignment(Pos.CENTER);
 btn.setOnAction(new EventHandler<ActionEvent>() {
 
 @Override
 public void handle(ActionEvent event) {
 sp.setHvalue(0);
 sp.setVvalue(0);
 
 
 }
 });
 
 Scene scene = new Scene(root, 300, 250);
 primaryStage.setTitle("ScrollPane");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
}
OUTPUT:
WEEK4b:
Demonstrate a TreeView.
Program:
package week4;
import javafx.application.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
public class Week4b extends Application {
 String[] list;
 int i;
 Image[] im=new Image[10];
 ImageView imv=new ImageView();
 @Override
 public void start(Stage primaryStage) {
 for(i=0;i<7;i++)
 {
 im[i]=new Image(getClass().getResourceAsStream(i+".jpg"));
 }
 
 Label msg=new Label("NO PREVIEW",imv); 
 msg.setContentDisplay(ContentDisplay.TOP);
 msg.setFont(Font.font("Brittanic Bold",FontWeight.EXTRA_BOLD,15));
 
 TreeItem rootItem = new TreeItem("IMAGES");
 
 TreeItem f = new TreeItem("FLOWER");
 f.getChildren().add(new TreeItem("FLOWER0"));
 f.getChildren().add(new TreeItem("FLOWER1"));
 f.getChildren().add(new TreeItem("FLOWER2"));
 f.getChildren().add(new TreeItem("FLOWER3"));
 
 TreeItem v = new TreeItem("VEHICLE");
 v.getChildren().add(new TreeItem("VEHICLE0"));
 v.getChildren().add(new TreeItem("VEHICLE1"));
 v.getChildren().add(new TreeItem("VEHICLE2"));
 
 rootItem.getChildren().addAll(f,v);
 TreeView treeView = new TreeView();
 treeView.setRoot(rootItem);
 
 MultipleSelectionModel<TreeItem<String>> lvmodel=treeView.getSelectionModel();
 StackPane left=new StackPane(treeView);
 StackPane right=new StackPane(msg);
 SplitPane sp=new SplitPane();
 sp.getItems().addAll(left,right);
 sp.setDividerPositions(0.2f,0.8f);
 sp.setBackground(Background.EMPTY);
 
 Scene scene = new Scene(sp,800,400,Color.WHITE);
 primaryStage.setTitle("TREE VIEW");
 primaryStage.setScene(scene);
 primaryStage.show();
 
 ChangeListener<TreeItem<String>> listener=new 
ChangeListener<TreeItem<String>>() {
 @Override
 public void changed(ObservableValue<? extends TreeItem<String>> observable, 
TreeItem<String> oldValue, TreeItem<String> newValue) {
 String path=newValue.getValue();
 TreeItem<String> tmp=newValue.getParent();
 while(tmp!=null)
 {
 path=tmp.getValue()+"->"+path;
 tmp=tmp.getParent();
 }
 
 
 if( newValue.getValue()!=null)
 {
 switch (newValue.getValue()) {
 case "IMAGES":imv.setImage(null);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 case "FLOWER":imv.setImage(null);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 case "FLOWER0":imv.setImage(im[0]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 case "FLOWER1":imv.setImage(im[1]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 case "FLOWER2":imv.setImage(im[2]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 case "FLOWER3":imv.setImage(im[3]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete Path 
is:"+path);
 break;
 
 case "VEHICLE":imv.setImage(null);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete 
Path is:"+path);
 break;
 
 case "VEHICLE0":imv.setImage(im[4]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete 
Path is:"+path);
 break;
 case "VEHICLE1":imv.setImage(im[5]);
 msg.setGraphic(imv);
msg.setText("Selected is:"+newValue.getValue()+"\nComplete 
Path is:"+path);
 break;
 case "VEHICLE2":imv.setImage(im[6]);
 msg.setGraphic(imv);
 msg.setText("Selected is:"+newValue.getValue()+"\nComplete 
Path is:"+path);
 break;
 default:
 break;
 }
 }
 
 }
 
 };
lvmodel.selectedItemProperty().addListener(listener);
 }
 public static void main(String[] args) {
 launch(args);
 }
}
OUTPUT:

WEEK4c:
Demonstrate rotation, scaling, glowing, and inner shadow on JavaFx controls.
Program:
package week4;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.geometry.Pos;
import javafx.event.*;
import javafx.animation.*;
import javafx.scene.transform.*;
import javafx.util.Duration;
import javafx.geometry.HPos;
import javafx.scene.effect.*;
public class Week4c extends Application
{
@Override
public void start(Stage ps)throws Exception
{
RotateTransition rt=new RotateTransition();
Scale scale = new Scale();
Glow glow = new Glow(); 
InnerShadow shadow = new InnerShadow(); 
 
Image im=new Image(getClass().getResourceAsStream("search.png"));
ImageView imv=new ImageView(im);
Button b1=new Button("ROTATE");
b1.setTooltip(new Tooltip("ROTATE THE IMAGE"));
Button b2=new Button("SCALE");
b2.setTooltip(new Tooltip("SCALE THE IMAGE"));
Button b3=new Button("GLOW");
b3.setTooltip(new Tooltip("GLOW THE IMAGE"));
Button b4=new Button("SHADOW");
b4.setTooltip(new Tooltip("SHODOW THE IMAGE"));
Button b5=new Button("RESET");
b5.setDisable(true);
b5.setTooltip(new Tooltip("RESET THE IMAGE"));
GridPane gp=new GridPane();
gp.add(imv,0,0,4,1);
gp.setHalignment(imv, HPos.CENTER);
gp.add(b1,0,1);
gp.add(b2,1,1);
gp.add(b3,2,1);
gp.add(b4,3,1);
gp.add(b5,0,2,4,1);
gp.setHalignment(b5, HPos.CENTER);
gp.setHgap(4);
gp.setVgap(20);
gp.setAlignment(Pos.CENTER);
gp.setBackground(Background.EMPTY);
//gp.setGridLinesVisible(true);
imv.getTransforms().add(scale);
Scene s=new Scene(gp,500,500,Color.BISQUE);
ps.setScene(s);
ps.setTitle("EFFECTS & TRANSFORMS");
ps.show();
b1.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 b5.setDisable(false);
 rt.setAxis(Rotate.Z_AXIS);
rt.setByAngle(360);
rt.setCycleCount(Animation.INDEFINITE);
rt.setInterpolator(Interpolator.LINEAR);
rt.setAutoReverse(false);
rt.setDuration(Duration.millis(1000)); 
rt.setNode(imv);
rt.play();
 }
});
b2.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 b5.setDisable(false);
 scale.setX(0.5); 
 scale.setY(0.5); 
 }
});
b3.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 b5.setDisable(false);
 glow.setLevel(0.9); 
 imv.setEffect(glow); 
 }
});
b4.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 b5.setDisable(false);
 shadow.setBlurType(BlurType.GAUSSIAN); 
 shadow.setColor(Color.RED); 
 shadow.setHeight(25); 
 shadow.setRadius(12); 
 shadow.setWidth(20); 
 shadow.setChoke(0.9); 
 imv.setEffect(shadow); 
 }
});
b5.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 
 scale.setX(1.0); 
 scale.setY(1.0); 
 glow.setLevel(0.0);
 imv.setEffect(null);
 rt.stop();
 }
});
}
public static void main(String[] args)
{
System.out.println("Launching JavaFX Application");
launch(args);
}
}
OUTPUT:
WEEK4d:
Demonstrate different types of Menus
Program:
package week4;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Week4d extends Application {
 
 @Override
 public void start(Stage primaryStage) {
 Image im1=new Image(getClass().getResourceAsStream("print.png"));
 Image im2=new Image(getClass().getResourceAsStream("refresh.png"));
 Image im3=new Image(getClass().getResourceAsStream("ser.png"));
 ImageView imv1=new ImageView(im1);
 ImageView imv2=new ImageView(im2);
 ImageView imv3=new ImageView(im3); 
 imv1.setFitWidth(25);
 imv1.setFitHeight(25);
 imv2.setFitWidth(30);
 imv2.setFitHeight(30);
 imv3.setFitWidth(30);
 imv3.setFitHeight(30);
 
 MenuBar mb=new MenuBar();
 Menu m1=new Menu("_File");
 m1.setMnemonicParsing(true);
 MenuItem New=new MenuItem("New");
 MenuItem open=new MenuItem("Open");
 MenuItem save=new MenuItem("Save");
 MenuItem print=new MenuItem("Print",imv1);
 MenuItem exit=new MenuItem("Exit");
 m1.getItems().addAll(New,open,save,print,exit);
 
 New.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
 open.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
 save.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
 print.setAccelerator(KeyCombination.keyCombination("Ctrl+p"));
 exit.setAccelerator(KeyCombination.keyCombination("Ctrl+E"));
 
 Menu m2=new Menu("_Edit");
 m2.setMnemonicParsing(true);
 MenuItem copy=new MenuItem("Copy");
 MenuItem cut=new MenuItem("Cut");
 MenuItem paste=new MenuItem("Paste");
 MenuItem delete=new MenuItem("Delete");
 MenuItem selectall=new MenuItem("Select All");
 SeparatorMenuItem separator=new SeparatorMenuItem();
 
 m2.getItems().addAll(copy,cut,paste,delete,separator,selectall);
 
 copy.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));
 cut.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
 paste.setAccelerator(KeyCombination.keyCombination("Ctrl+V"));
 delete.setAccelerator(KeyCombination.keyCombination("Delete"));
 selectall.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
 
 Menu m3=new Menu("_Search");
 m3.setMnemonicParsing(true);
 MenuItem find=new MenuItem("Find...");
 MenuItem replace=new MenuItem("Replace...");
 MenuItem Goto=new MenuItem("Goto...");
 
 m3.getItems().addAll(find,replace,Goto);
 
 Menu m4=new Menu("_Options");
 m4.setMnemonicParsing(true);
 Menu m41=new Menu("Colors");
 Menu m42=new Menu("Proirity");
 m4.getItems().addAll(m41,m42);
 RadioMenuItem red=new RadioMenuItem("RED");
 RadioMenuItem green=new RadioMenuItem("GREEN");
 RadioMenuItem blue=new RadioMenuItem("BLUE");
 m41.getItems().addAll(red,green,blue);
 red.setSelected(true);
 ToggleGroup tg=new ToggleGroup();
 tg.getToggles().addAll(red,green,blue);
 
 
 CheckMenuItem high=new CheckMenuItem("HIGH");
 CheckMenuItem medium=new CheckMenuItem("MEDIUM");
 CheckMenuItem low=new CheckMenuItem("LOW");
 m42.getItems().addAll(high,medium,low);
 low.setSelected(true);
 
 
 Menu m5=new Menu("_Help");
 m5.setMnemonicParsing(true);
 MenuItem help=new MenuItem("Help Content");
 MenuItem about=new MenuItem("About");
 m5.getItems().addAll(help,about);
 
 mb.getMenus().addAll(m1,m2,m3,m4,m5);
 
 Label msg=new Label("No Option is Selected");
 msg.setFont(Font.font("Brittanic Bold",FontWeight.EXTRA_BOLD,15));
 
 
 ContextMenu cm=new ContextMenu(red,blue,green);
 Circle c=new Circle(50,Color.AQUAMARINE);
 GridPane gp=new GridPane();
 gp.add(msg, 0, 0);
 gp.setHalignment(msg, HPos.CENTER);
 gp.add(c,0,1);
 gp.setHalignment(c, HPos.CENTER);
 gp.setAlignment(Pos.CENTER);
 gp.setVgap(15);
 
 
 Button b1=new Button("Refresh",imv2);
 Button b2=new Button("Search",imv3);
 HBox hb=new HBox(b1,b2);
 hb.setStyle("-fx-background-color: BEIGE");
 hb.setSpacing(5);
 
 b1.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
 b2.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
 b1.setTooltip(new Tooltip("Refresh"));
 b2.setTooltip(new Tooltip("Search"));
 ToolBar tb=new ToolBar(b1,b2);
 
 
 BorderPane root=new BorderPane();
 root.setTop(mb);
 root.setCenter(gp);
 root.setBottom(hb);
 root.setBackground(Background.EMPTY);
 Scene scene = new Scene(root,500, 400,Color.BURLYWOOD);
 primaryStage.setTitle("JAVAFX MENU");
 primaryStage.setScene(scene);
 primaryStage.show();
 
 EventHandler<ActionEvent> event=new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent ae) {
 String name=((MenuItem)ae.getTarget()).getText();
 if(name.equals("Exit"))
 Platform.exit();
 msg.setText("You have Selected "+name+" Option") ;
 }
 };
 
 New.setOnAction(event);
 open.setOnAction(event);
 save.setOnAction(event);
 print.setOnAction(event);
 exit.setOnAction(event);
 copy.setOnAction(event);
 cut.setOnAction(event);
 paste.setOnAction(event);
 delete.setOnAction(event);
 selectall.setOnAction(event);
 find.setOnAction(event);
 replace.setOnAction(event);
 Goto.setOnAction(event);
 help.setOnAction(event);
 about.setOnAction(event);
 high.setOnAction(event);
 medium.setOnAction(event);
 low.setOnAction(event);
 
 EventHandler<ContextMenuEvent>cmevent=new 
EventHandler<ContextMenuEvent>() {
 @Override
 public void handle(ContextMenuEvent ae) {
 cm.show(c,ae.getScreenX(), ae.getScreenY());
 
 }
 };
 root.setOnContextMenuRequested(cmevent);
 
 tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
 @Override
 public void changed(ObservableValue<? extends Toggle> observable, Toggle 
oldValue, Toggle newValue) {
 if(newValue!=null){
 RadioMenuItem r=(RadioMenuItem)newValue;
 String str=r.getText();
 msg.setText("You have Selected "+str+" Color Option");
 c.setFill(Color.web(str));
 }
 }
 });
 }
 public static void main(String[] args) {
 launch(args);
 }
}
OUTPUT:
WEEK5
WEEK5:
Java Program to get connection with Oracle Database executes SQL Statements and 
handling the Result set.
Program:
JDB.java:
package week5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class JDB extends Application {
 Connection con;
 PreparedStatement stmt;
 Statement s;
 int rid;
 String rname,remail,rphone;
 
 @Override
 public void start(Stage primaryStage) {
 
 Label sid=new Label("Id");
 Label name=new Label("Name");
 Label email=new Label("Email");
 Label phone=new Label("Phone");
 Label id=new Label("Enter ID");
 id.setLayoutX(210.0);
 id.setLayoutY(21.0);
 Label nemail=new Label("New Email");
 nemail.setLayoutX(388.0);
 nemail.setLayoutY(21.0);
 Label result=new Label("Result Console");
 
 TextField tsid=new TextField();
 tsid.setPromptText("id");
 TextField tname=new TextField();
 tname.setPromptText("Name");
 TextField temail=new TextField();
 temail.setPromptText("Email");
 TextField tphone=new TextField();
 tphone.setPromptText("Phone");
 TextField tnemail=new TextField();
 tnemail.setPromptText("New Email");
 tnemail.setLayoutX(388.0);
 tnemail.setLayoutY(41.0);
 TextField tid=new TextField();
 tid.setPromptText("id");
 tid.setLayoutX(210.0);
 tid.setLayoutY(41.0);
 
 Button add=new Button("ADD RECORD");
 add.setLayoutX(100.0);
 add.setLayoutY(150.0);
 Button search=new Button("SEARCH");
 search.setLayoutX(210.0);
 search.setLayoutY(70.0);
 Button delete=new Button("DELETE");
 delete.setLayoutX(352.0);
 delete.setLayoutY(70.0);
 Button update=new Button("UPDATE");
 update.setLayoutX(283.0);
 update.setLayoutY(70.0);
 Button view=new Button("VIEW ALL");
 view.setLayoutX(423.0);
 view.setLayoutY(70.0);
 TextArea tresult=new TextArea();
 tresult.setPrefWidth(180.0);
 tresult.setPrefHeight(85.0);
 
 VBox vb1=new VBox();
 vb1.getChildren().addAll(sid,name,email,phone);
 vb1.setLayoutX(9.0);
 vb1.setLayoutY(28.0);
 vb1.setSpacing(12.0);
 VBox vb2=new VBox();
 vb2.getChildren().addAll(tsid,tname,temail,tphone);
 vb2.setLayoutX(50.0);
 vb2.setLayoutY(24.0);
 vb2.setSpacing(4.0); 
 VBox vb3=new VBox();
 vb3.getChildren().addAll(result,tresult);
 vb3.setLayoutX(7.0);
 vb3.setLayoutY(250.0);
 
 Separator s1=new Separator(Orientation.HORIZONTAL);
 s1.setLayoutY(14.0);
 s1.setPrefWidth(600.0);
 s1.setPrefHeight(4.0);
 Separator s2=new Separator(Orientation.VERTICAL);
 s2.setLayoutX(200.0);
 s2.setLayoutY(14.0);
 s2.setPrefWidth(7.0);
 s2.setPrefHeight(400.0);
 
 TableView tb=new TableView();
 tb.setEditable(true);
 tb.setLayoutX(210.0);
 tb.setLayoutY(102.0);
 tb.setPrefSize(350.0, 250.0);
 TableColumn<Integer,Person> tc1=new TableColumn ("ID");
 tc1.setPrefWidth(45.0);
 tc1.setCellValueFactory(new PropertyValueFactory<>("id"));
 TableColumn<String,Person> tc2=new TableColumn("NAME");
 tc2.setPrefWidth(100.0);
 tc2.setCellValueFactory(new PropertyValueFactory<>("name"));
 TableColumn<String,Person> tc3=new TableColumn("EMAIL");
 tc3.setPrefWidth(110.0);
 tc3.setCellValueFactory(new PropertyValueFactory<>("email"));
 TableColumn<String,Person> tc4=new TableColumn("PHONE");
 tc4.setPrefWidth(108.0);
 tc4.setCellValueFactory(new PropertyValueFactory<>("phone"));
 tb.getColumns().addAll(tc1,tc2,tc3,tc4);
 
 result.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 sid.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 name.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 email.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 phone.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 id.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 nemail.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 add.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 search.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 update.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 delete.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 view.setFont(Font.font("Britanic Bold",FontWeight.BOLD,12));
 
 
 AnchorPane root=new 
AnchorPane(s1,s2,vb1,vb2,vb3,add,id,nemail,tid,tnemail,search,update,view,delete,tb);
 root.setBackground(Background.EMPTY);
 add.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 try{ 
 Class.forName("oracle.jdbc.OracleDriver");
 con = 
DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 stmt=con.prepareStatement("insert into student values(?,?,?,?)");
 stmt.setInt(1,Integer.parseInt(tsid.getText()));
 stmt.setString(2,tname.getText()); 
 stmt.setString(3,temail.getText()); 
 stmt.setString(4,tphone.getText()); 
 int i=stmt.executeUpdate(); 
 tsid.clear();tname.clear();temail.clear();tphone.clear();
 tresult.setText("Record inserted");
 tresult.setStyle("-fx-text-fill:green");
 con.close(); 
 }
 catch(Exception e){ System.out.println(e);} 
 } 
 });
 
 view.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 
 try{ 
 Class.forName("oracle.jdbc.OracleDriver");
 con = 
DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 s=con.createStatement();
 String sql="select * from student";
 ResultSet rs = s.executeQuery(sql);
 ObservableList<Person> oblist=FXCollections.observableArrayList(); 
 while(rs.next())
 {
 rid=rs.getInt(1);
 rname=rs.getString(2);
 remail=rs.getString(3);
 rphone=rs.getString(4);
 
 oblist.add(new Person(rid,rname,remail,rphone));
 }
 tb.setItems(oblist);
 tresult.setText("Records Retrived successfully"); 
 tresult.setStyle("-fx-text-fill:green");
 con.close(); 
 }
 catch(Exception e){ System.out.println(e);} 
 } 
 });
 
 search.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 int count=0;
 try{ 
 Class.forName("oracle.jdbc.OracleDriver");
 con = 
DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 s=con.createStatement();
 String sql1="select * from student where id="+tid.getText()+"";
 ResultSet rs1 = s.executeQuery(sql1);
 while(rs1.next())
 count++;
 ResultSet rs = s.executeQuery(sql1);
 ObservableList<Person> oblist=FXCollections.observableArrayList(); 
 if(count>0)
 {
 while(rs.next())
 {
 rid=rs.getInt(1);
 rname=rs.getString(2);
 remail=rs.getString(3);
 rphone=rs.getString(4);
 oblist.add(new Person(rid,rname,remail,rphone));
 }
 tb.setItems(oblist);
 tresult.setText("Record Id: "+rid+"\nName: \t"+rname+"");
 tresult.setStyle("-fx-text-fill:green");
 }
 else
 {
 tresult.setText("This Record does not exist!"); 
 tresult.setStyle("-fx-text-fill:red");
 }
 con.close(); 
 }
 catch(Exception e){ System.out.println(e);}
 
 }
 
 });
 
 delete.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 int count=0;
 try{ 
 Class.forName("oracle.jdbc.OracleDriver");
 con = 
DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 s=con.createStatement();
 String sql1="select count(*) from student where id="+tid.getText()+"";
 ResultSet rs1 = s.executeQuery(sql1);
 rs1.next();
 count=rs1.getInt(1);
 if(count>0)
 {
 String sql2="delete from student where id="+tid.getText()+"";
 s.executeUpdate(sql2);
 String sql3="select * from student";
 ResultSet rs = s.executeQuery(sql3);
 ObservableList<Person> oblist=FXCollections.observableArrayList(); 
 while(rs.next())
 {
 rid=rs.getInt(1);
 rname=rs.getString(2);
 remail=rs.getString(3);
 rphone=rs.getString(4);
 oblist.add(new Person(rid,rname,remail,rphone));
 }
 tb.setItems(oblist);
 tresult.setText("ID: "+tid.getText()+" Reocord Deleted"); 
 tresult.setStyle("-fx-text-fill:green");
 }
 else
 {
 tresult.setText("This Record does not exist!"); 
 tresult.setStyle("-fx-text-fill:red");
 }
 con.close(); 
 }
 catch(Exception e){ System.out.println(e);} 
 } 
 });
 
 update.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 int count=0;
 try{ 
 Class.forName("oracle.jdbc.OracleDriver");
 con = 
DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 s=con.createStatement();
 String sql1="select * from student where id="+tid.getText()+"";
 ResultSet rs1 = s.executeQuery(sql1);
 while(rs1.next())
 count++;
 String sql2="update student set email='"+tnemail.getText()+"'where 
id="+tid.getText()+"";
 s.executeUpdate(sql2);
 String sql3="select * from student where id="+tid.getText()+"";
 ResultSet rs = s.executeQuery(sql3);
 ObservableList<Person> oblist=FXCollections.observableArrayList(); 
 if(count>0)
 {
 while(rs.next())
 {
 rid=rs.getInt(1);
 rname=rs.getString(2);
 remail=rs.getString(3);
 rphone=rs.getString(4);
 oblist.add(new Person(rid,rname,remail,rphone));
 }
 tb.setItems(oblist);
 tresult.setText("Record updated successfully");
 tresult.setStyle("-fx-text-fill:green");
 }
 else
 {
 tresult.setText("This Record does not exist!"); 
 tresult.setStyle("-fx-text-fill:red");
 }
 con.close(); 
 }
 catch(Exception e){ System.out.println(e);}
 }
 });
 
 Scene scene = new Scene(root, 600, 380,Color.ANTIQUEWHITE);
 primaryStage.setTitle("JDBC");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}
Person.java:
package week5;
public class Person {
 private int id;
 private String name = null;
 private String email = null;
 private String phone = null;
 public Person() {
 }
 public Person(int id,String name, String email,String phone) {
 this.id=id;
 this.name=name;
 this.email=email;
 this.phone=phone;
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 this.email= email;
 }
 public String getPhone() {
 return phone;
 }
 public void setPhone(String phone) {
 this.phone= phone;
 }
}
OUTPUT:

WEEK6
Week6a:
Simple servlet program.
Program:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Week6a extends HttpServlet {
 public void service(HttpServletRequest request, HttpServletResponse 
response)
 throws IOException, ServletException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Hello World!</title>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h1>Hello World!</h1>");
 out.println("<h2>servlet example!</h2>");
 out.println("</body>");
 out.println("</html>");
 }
}
OUTPUT:
Week6b:
Program to read servlet Perameters.
Program:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Week6b extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse 
response)
 throws IOException, ServletException
 {
 response.setContentType("text/html");
 String username=request.getParameter("name");
String password=request.getParameter("pass");
 PrintWriter out = response.getWriter();
out.println("<html>");
 out.println("<head>");
 out.println("<title>Reading Parameters </title>");
 out.println("</head>");
 out.println("<body>");
out.println("<h1 align='center'>Welcome to "+username+"</h1>");
if(username.equalsIgnoreCase(password))
 out.println("<h2 align='center'>Congratulations!Your Details are 
Matched</h2>");
else
out.println("<h2 align='center'>Sorry!Your Details are not 
Matched</h2>");
 out.println("</body>");
 out.println("</html>");
 }
}
Week6b.html:
<html>
<head>
<title>Input Form</title>
</head>
<body>
<center>
<h3>Login Page</h3>
<form name="login" method="get" action="Week6b">
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>
</table>
<br>
<input type="submit" value="SUBMIT">&nbsp;&nbsp;<input type="reset" 
value="CLEAR">
</form>
</center>
</body>
</html>
OUTPUT:
Week6c:
Program to handle HTTP Get and POST Request using servlets.
Program:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Week6c extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse 
response)
 throws IOException, ServletException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
String username=request.getParameter("name");
String password=request.getParameter("pass");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
out.println("<html>");
 out.println("<head>");
 out.println("<title>Reading Parameters </title>");
 out.println("</head>");
 out.println("<body>");
out.println("<h1 align='center'>Welcome to "+username+"</h1>");
out.println("<h2 align='center'>Registration Success!Your Details 
are as Follows</h2>");
out.println("<table align='center' border='5'>");
out.println("<th>USERNAME</th><th>PASSWORD</th><th>EMAILID</th><th>MOBILE NUMBER</th>");
out.println("<tr><td>"+username+"</td>");
out.println("<td>"+password+"</td>");
out.println("<td>"+email+"</td>");
out.println("<td>"+phone+"</td></tr></table>");
out.println("</body>");
 out.println("</html>");
 }
}
Week6c.html:
<html>
<head>
<title>Input Form</title>
</head>
<body>
<center>
<h3>Registration Page</h3>
<form name="register" method="post" action="Week6c">
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="pass"></td>
</tr>
<tr>
<td>Email-ID:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Mobile Number:</td>
<td><input type="text" name="phone"></td>
</tr>
</table>
<br>
<input type="submit" value="SUBMIT">&nbsp;&nbsp;<input type="reset" 
value="CLEAR">
</form>
</center>
</body>
</html>
OUTPUT:
WEB.XML:
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
 <servlet>
 <servlet-name>Week6a</servlet-name>
 <servlet-class>Week6a</servlet-class>
 </servlet>
 <servlet>
 <servlet-name>Week6b</servlet-name>
 <servlet-class>Week6b</servlet-class>
 </servlet>
 <servlet>
 <servlet-name>Week6c</servlet-name>
 <servlet-class>Week6c</servlet-class>
 </servlet>
 <servlet-mapping>
 <servlet-name>Week6a</servlet-name>
 <url-pattern>/Week6a</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>Week6b</servlet-name>
 <url-pattern>/Week6b</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>Week6c</servlet-name>
 <url-pattern>/Week6c</url-pattern>
 </servlet-mapping>
 <session-config>
 <session-timeout>
 30
 </session-timeout>
 </session-config>
</web-app>
WEEK7
Week7a:
Program for using Cookies in servlets.
Program:
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Week7a extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Cookies</title>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h1>Create Cookies to send to your browser</h1>");
 out.print("<form method='post' action='Week7a'>");
 out.println("<table >");
 out.println("<tr>");
 out.println("<td>UserName:</td>");
 out.println("<td><input type='text' name='name'></td>");
 out.println("</tr>");
 out.println("<tr>");
 out.println("<td>Password:</td>");
 out.println("<td><input type='password' name='pass'></td></tr>");
 out.println("</table>");
 out.println("<br>");
 out.println("<input type='submit' value='SUBMIT'>&nbsp;&nbsp;
 <input type='reset' value='CLEAR'>");
 out.println("</form>");
 out.println("</body>");
 out.println("</html>");
 String name=request.getParameter("name");
 String pass=request.getParameter("pass");
 if(name!=null && pass!=null)
 {
 Cookie ck=new Cookie(name,pass);
 ck.setMaxAge(10);
 response.addCookie(ck);
 
 out.println("<h3>You just sent the following cookies to your browser</h3>");
 out.println("UserName: "+name);
 out.println("<br>");
 out.println("Password: "+pass);
 } 
 Cookie[] cookies = request.getCookies();
 if(cookies!=null && cookies.length>0)
 {
 out.println("<h3>Your browser is sending the following cookies</h3>");
 for(int j = 0; j < cookies.length; j++) 
 {
 Cookie c=cookies[j];
 String uname = c.getName();
 String upass = c.getValue();
 out.println("<p>");
 out.println("UserName: "+uname);
 out.println("<br>");
 out.println("Password: "+upass);
 }
 }
 else
 {
 out.println("<h2>Your browser isn't sending any cookies</h2>");
 }
 }
 public void doPost(HttpServletRequest request,HttpServletResponse response)
 throws IOException, ServletException
 {
 doGet(request, response);
 }
}
OUTPUT:
Week7b:
Program for session tracking in servlets.
Program:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Week7b extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse 
response)throws ServletException, IOException 
 {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 String user=request.getParameter("user");
 HttpSession session = request.getSession();
 Integer count=new Integer(1);
 out.println("<center>");
 if(session.isNew())
 {
 session.setAttribute("username", user);
 out.println("<h1>WELCOME TO SESSION</h1>");
 }
 else
 {
 out.println("<h1>WELCOME BACK TO SESSION</h1>");
 count = (Integer)session.getAttribute("vcount");
 count = count + 1;
 }
 session.setAttribute("vcount", count);
 user=(String)session.getAttribute("username"); 
 out.println("<a href='Week7bb'>LOGOUT</a>");
 out.println("<h2>SESSION INFORMATION</h2>");
 out.println("<table border='5'>");
 out.println("<th>Session info</th><th>Value</th>");
 out.println("<tr><td>UserName</td><td>"+user+"</td></tr>");
 out.println("<tr><td>Session ID</td><td>"+session.getId()+"</td></tr>");
 out.println("<tr><td>Creation Time</td><td>"+new 
 Date(session.getCreationTime())+"</td></tr>");
 out.println("<tr><td>LastAccessTime</td><td>"+new 
 Date(session.getLastAccessedTime())+"</td></tr>");
 out.println("<tr><td>Number of Visits</td><td>"+count+"</td></tr>");
 out.println("</center>");
 out.println("</table><br><br>");
 } }
Week7bb.java:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Week7bb extends HttpServlet { 
 protected void service(HttpServletRequest request, HttpServletResponse 
response) 
 throws ServletException, IOException 
 { 
 response.setContentType("text/html"); 
 PrintWriter out=response.getWriter(); 
 
 HttpSession session=request.getSession(false); 
 session.invalidate(); 
 out.println("<center>"); 
 out.print("<h1>You are successfully logged out!</h1><br>"); 
 out.println("<a href='Week7b.html'>LOGIN</a> ");
 out.println("</center>");
 out.close(); 
 } 
} 
Week7b.html:
<html><head>
<title>Input Form</title>
</head>
<body>
<center>
<h3>Login Page</h3>
<form name="login" method="post" action="Week7b">
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="user"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr></table>
<br>
<input type="submit" value="SUBMIT">&nbsp;&nbsp;<input type="reset" 
value="CLEAR">
</form>
</center></body>
</html>
OUTPUT:
Week7c:
Program to access and perform operations on Database using servlets.
Program:
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Week7c extends HttpServlet {
 PreparedStatement stmt;
 Connection con;
 ResultSet rs;
 public void init()throws ServletException
 { 
 try
 {
 Class.forName("oracle.jdbc.OracleDriver");
 con 
=DriverManager.getConnection("jdbc:oracle:thin:NAGA/naga@localhost:1521/xe");
 }
 catch(Exception e)
 {
 System.out.println(e);
 } 
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Registration </title>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h1 align='center'>Welcome to JDBC</h1>");
out.println("<h2 align='center'>Registration Success!The Details are as 
Follows</h2>");
 out.println("<table align='center' border='5'>");
 out.println("<th>USERNAME</th><th>PASSWORD</th><th>EMAILID</th><th>MOBILE NUMBER</th>");
 try
 {
 stmt=con.prepareStatement("insert into Reg values(?,?,?,?)");
 stmt.setString(1,request.getParameter("name"));
 stmt.setString(2,request.getParameter("pass"));
 stmt.setString(3,request.getParameter("email"));
 stmt.setString(4,request.getParameter("phone"));
 stmt.executeUpdate();
 stmt=con.prepareStatement("select * from Reg");
 rs=stmt.executeQuery();
 while(rs.next())
 {
 out.println("<tr><td>"+rs.getString(1)+"</td>");
 out.println("<td>"+rs.getString(2)+"</td>");
 out.println("<td>"+rs.getString(3)+"</td>");
 out.println("<td>"+rs.getString(4)+"</td></tr>");
 }
 }
 catch(Exception e)
 {
 System.out.println(e); 
 }
 out.println("</table><br>");
 out.println("<center><h3><a href='index.html'>New Registration? </a>
</h3></center>");
 out.println("</body>");
 out.println("</html>");
 }
 public void destroy()
 {
 try 
 {
 rs.close();
 con.close();
 stmt.close();
 } 
 catch (SQLException ex) 
 {
 System.out.println(ex);
 }
 }
}
Week7c.html:
<html>
<head>
<title>Input Form</title>
</head>
<body>
<center>
<h3>Registration Page</h3>
<form name="register" method="post" action="Week7c">
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="pass"></td>
</tr>
<tr>
<td>Email-ID:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Mobile Number:</td>
<td><input type="text" name="phone"></td>
</tr>
</table>
<br>
<input type="submit" value="SUBMIT">&nbsp;&nbsp;<input type="reset" 
value="CLEAR">
</form>
</center>
</body>
</html>
OUTPUT:
WEB.XML:
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
 <servlet>
 <servlet-name>Week7a</servlet-name>
 <servlet-class>Week7a</servlet-class>
 </servlet>
 <servlet>
 <servlet-name>Week7b</servlet-name>
 <servlet-class>Week7b</servlet-class>
 </servlet>
 <servlet>
 <servlet-name>Week7bb</servlet-name>
 <servlet-class>Week7bb</servlet-class>
 </servlet>
 <servlet>
 <servlet-name>Week7c</servlet-name>
 <servlet-class>Week7c</servlet-class>
 </servlet>
 <servlet-mapping>
 <servlet-name>Week7a</servlet-name>
 <url-pattern>/Week7a</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>Week7b</servlet-name>
 <url-pattern>/Week7b</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>Week7bb</servlet-name>
 <url-pattern>/Week7bb</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
 <servlet-name>Week7c</servlet-name>
 <url-pattern>/Week7c</url-pattern>
 </servlet-mapping>
 <session-config>
 <session-timeout>
 2
 </session-timeout>
 </session-config>
</web-app>
WEEK8
Week8a:
Simple JSP Program
Program:
<%@ page language="java" import="java.util.Date" contentType="text/html" %>
<html>
<head>
<title>First JSP</title>
</head>
<body>
<center>
<h3>WELCOME TO JSP</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>
</center>
</body>
</html>
OUTPUT:
Week8b:
Program to call a Java Bean in JSP 
Program:
<%@page contentType="text/html"%>
<jsp:useBean id="cse" class="Bean.MyBean"></jsp:useBean>
<!DOCTYPE html>
<html>
 <head>
 <title>Second JSP</title>
 </head>
 <body>
 <%! int i=4;%>
 <%
 int j=cse.doubleIt(i);
 out.println("<h1>2*4="+j+"</h1>");
 %>
 </body>
</html>
MyBean.java:
package Bean;
import javax.ejb.Stateless;
@Stateless
public class MyBean {
 public int doubleIt(int number) {
return 2 * number;
} 
}
OUTPUT:
Week8c:
Program to access properties Using jsp:getProperty and jsp:setProperty.
Program:
<html>
 <head>
 <title>get and set properties </title>
 </head>
 <body>
 <center>
 <jsp:useBean id = "person" class = "Bean.PersonBean"> 
 <jsp:setProperty name = "person" property = "firstName" value = "PIDUGU"/>
 <jsp:setProperty name = "person" property = "lastName" value = "NAGENDRA"/>
 <jsp:setProperty name = "person" property = "age" value = "29"/>
 </jsp:useBean>
 <p>First Name: 
 <jsp:getProperty name = "person" property = "firstName"/>
 </p>
 <p>Last Name: 
 <jsp:getProperty name = "person" property = "lastName"/>
 </p>
 <p>Age: 
 <jsp:getProperty name = "person" property = "age"/>
 </p>
 </center>
 </body>
</html>
PersonBean.java:
package Bean;
import javax.ejb.Stateless;
public class PersonBean {
 private String firstName = null;
 private String lastName = null;
 private int age = 0;
 public void setFirstName(String firstName){
 this.firstName = firstName;
 }
 public String getFirstName(){
 return firstName;
 }
 public void setLastName(String lastName){
 this.lastName = lastName;
 }
 
public String getLastName(){
 return lastName;
 }
 public void setAge(int age){
 this.age = age;
 }
 public int getAge(){
 return age;
 }
}
OUTPUT:
Week8d:
Simple JSP page with custom tags. 
Program:
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="myprefix" uri="WEB-INF/tlds/mytld.tld"%>
<html> <head> <title>Custom Tags in JSP Example</title>
</head>
<body>
 <myprefix:MyTag/>
</body></html>
Mytld.tld:
<?xml version="1.0" encoding="UTF-8"?>
<taglib version="2.1" xmlns="http://java.sun.com/xml/ns/javaee" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd">
 <tlib-version>1.0</tlib-version>
 <short-name>mytld</short-name>
 <uri>/WEB-INF/tlds/mytld</uri>
 <tag>
 <name>MyTag</name>
 <tag-class>Bean.MyHandler</tag-class>
 <body-content>empty</body-content>
</tag>
</taglib>
MyHandler.java:
package Bean;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class MyHandler extends SimpleTagSupport {
 @Override
 public void doTag() throws JspException, IOException {
 JspWriter out = getJspContext().getOut();
 out.println("<CENTER><h1>WELCOME TO CUSTOM TAG</h1></CENTER>");
 }
}
OUTPUT:
