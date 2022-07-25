import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx. geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
public class ImagesButtonFXDemo extends Application
{
 Image i1,i2,i3,i4,i5,i6;
 ImageView iv1,iv2,iv3,iv4,iv5,iv6;
Button b1,b2,b3,b4,b5,b6;
 Label l;
 FlowPane fp;
 Scene s;
 public void  init()
 {
	 System.out.println("From init() method");
  i1= new Image("youtube.jpg",50,50,true,true);
  i2= new Image("phonepe.jpg",50,50,true,true);
  i3= new Image("teams.jpg",50,50,true,true);
  i4= new Image("gmail.jpg",50,50,true,true);
  i5= new Image("whatsapp.jpg",50,50,true,true);
  i6= new Image("poweroff.jpg",50,50,true,true);
  iv1= new ImageView(i1);
  iv2= new ImageView(i2);
  iv3= new ImageView(i3);
  iv4= new ImageView(i4);
  iv5= new ImageView(i5);
  iv6= new ImageView(i6);
  b1=new Button("Edutainment",iv1);
  b2=new Button("Money and Money",iv2);
  b3=new Button("Connects Virtually",iv3);
  b4=new Button("Facebook Postman",iv4);
  b5=new Button("Google Pigeon",iv5);
  b6=new Button("Take Rest",iv6);
  b1.setContentDisplay(ContentDisplay.TOP);
  b2.setContentDisplay(ContentDisplay.TOP);
  b3.setContentDisplay(ContentDisplay.TOP);
  b4.setContentDisplay(ContentDisplay.TOP);
  b5.setContentDisplay(ContentDisplay.TOP);
  b6.setContentDisplay(ContentDisplay.TOP); 
  l = new Label("Click on App");
  fp= new FlowPane(20,20);
  fp.setAlignment(Pos.CENTER);
  fp.getChildren().addAll(b1,b2,b3,b4,b5,b6,l);
 }
 public void start(Stage st)throws Exception
 {
	 System.out.println("from start method");
  b1.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("youtube app is clicked");
   }
  });
  b2.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("PhonePe app is clicked");
   }
  });
  b3.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("Teams app is clicked");
   }
  });
  b4.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("Whatsapp app is clicked");
   }
  });
  b5.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("GMail app is clicked");
   }
  });
  b6.setOnAction(new EventHandler<ActionEvent>()
  {
   public void handle(ActionEvent ae)
   {
    l.setText("poweroff app is clicked");
	Platform.exit();
   }
   
  });
  s=new Scene(fp,1000,1000);
  st.setScene(s);
  st.setTitle("APPS");
  st.show();  
 }
 public static void main(String args[])
 {
	 System.out.println("From main() method");
  launch(args); 
 }
}
