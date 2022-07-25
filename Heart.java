/*HEART*/
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.Group;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.*;
public class Heart extends Application
{
 public void init()
 {
  System.out.println("from init method");
 }
 public void start(Stage st)
 {
  Arc a1=new Arc();
  a1.setCenterX(500);
  a1.setCenterY(500);
  a1.setRadiusX(100);
  a1.setRadiusY(200);
  a1.setStartAngle(270);
  a1.setLength(90);
  a1.setType(ArcType.OPEN);
  a1.setFill(Color.RED);
  Arc a2=new Arc();
  a2.setCenterX(500);
  a2.setCenterY(500);
  a2.setRadiusX(100);
  a2.setRadiusY(200);
  a2.setStartAngle(90);
  a2.setLength(270);
  a2.setType(ArcType.OPEN);
  a2.setFill(Color.RED);
  Group g=new Group(a1,a2);
  Scene s=new Scene(g,1000,1000);
  st.setTitle("Heart");
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
