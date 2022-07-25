/*Rainbow*/
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.Group;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.*;
public class Rainbow extends Application
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
  a1.setRadiusY(100);
  a1.setStartAngle(0);
  a1.setLength(180);
  a1.setType(ArcType.OPEN);
  a1.setFill(Color.RED);
  Arc a2=new Arc();
  a2.setCenterX(500);
  a2.setCenterY(500);
  a2.setRadiusX(170);
  a2.setRadiusY(170);
  a2.setStartAngle(0);
  a2.setLength(180);
  a2.setType(ArcType.OPEN);
  a2.setFill(Color.ORANGE);
  Arc a3=new Arc();
  a3.setCenterX(500);
  a3.setCenterY(500);
  a3.setRadiusX(140);
  a3.setRadiusY(140);
  a3.setStartAngle(0);
  a3.setLength(180);
  a3.setType(ArcType.OPEN);
  a3.setFill(Color.YELLOW);
  Arc a4=new Arc();
  a4.setCenterX(500);
  a4.setCenterY(500);
  a4.setRadiusX(110);
  a4.setRadiusY(110);
  a4.setStartAngle(0);
  a4.setLength(180);
  a4.setType(ArcType.OPEN);
  a4.setFill(Color.GREEN);
  Arc a5=new Arc();
  a5.setCenterX(500);
  a5.setCenterY(500);
  a5.setRadiusX(80);
  a5.setRadiusY(80);
  a5.setStartAngle(0);
  a5.setLength(180);
  a5.setType(ArcType.OPEN);
  a5.setFill(Color.BLUE);
  Arc a6=new Arc();
  a6.setCenterX(500);
  a6.setCenterY(500);
  a6.setRadiusX(50);
  a6.setRadiusY(50);
  a6.setStartAngle(0);
  a6.setLength(180);
  a6.setType(ArcType.OPEN);
  a6.setFill(Color.INDIGO);
  Arc a7=new Arc();
  a7.setCenterX(500);
  a7.setCenterY(500);
  a7.setRadiusX(20);
  a7.setRadiusY(20);
  a7.setStartAngle(0);
  a7.setLength(180);
  a7.setType(ArcType.OPEN);
  a7.setFill(Color.VIOLET);
  Group g=new Group(a1,a2,a3,a4,a5,a6,a7);
  Scene s=new Scene(g,1000,1000);
  st.setTitle("rainbow");
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
