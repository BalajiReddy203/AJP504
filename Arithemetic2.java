 import javafx.application.*;
 import javafx.scene.*;
 import javafx.stage.*;
 import javafx.scene.layout.*;
 import javafx.scene.control.*;
 import javafx.event.*;
 import javafx.geometry.*;
 import javafx.scene.paint.*;
 import javafx.collections.*;
 public class Arithemetic2 extends Application
 {
	 Label l1,l2,l3;
	 Button b1,b2,b3,b4,b5,b6;
	 TextField t1,t2,t3;
	 GridPane gp;
	 Scene s;
	 public void init()
	 {
		 l1=new Label("Enter Number1");
		 l2=new Label("Enter Number2");
		 l3=new Label("Result");
		 t1=new TextField();
		 t2=new TextField();
		 t3=new TextField();
		 b1=new Button("Add");
		 b2=new Button("Subtract");
		 b3=new Button("Multiply");
		 b4=new Button("Divide");
		 b5=new Button("Modulo");
		 b6=new Button("Power");
		 gp=new GridPane();
		 gp.setVgap(25);
		 gp.setHgap(25);
		 gp.setAlignment(Pos.CENTER);
		 gp.add(l1,0,0);
		 gp.add(t1,1,0);
		 gp.add(l2,0,1);
		 gp.add(t2,1,1);
		 gp.add(l3,0,2);
		 gp.add(t3,1,2);
		 gp.add(b1,0,3);
		 gp.add(b2,1,3);
		 gp.add(b3,0,4);
		 gp.add(b4,1,4);
		 gp.add(b5,0,5);
		 gp.add(b6,1,5);
	 }
	 public void start(Stage st) throws Exception
	 {
		 s=new Scene(gp,500,500);
		 b1.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 int n1=Integer.parseInt(str1);
				 int n2=Integer.parseInt(str2);
				 int n3=n1+n2;
				 t3.setText(""+n3);
			 }
		 }
		 );
		 b2.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 int n1=Integer.parseInt(str1);
				 int n2=Integer.parseInt(str2);
				 int n3=n1-n2;
				 t3.setText(""+n3);
			 }
		 }
		 );
		 b3.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 int n1=Integer.parseInt(str1);
				 int n2=Integer.parseInt(str2);
				 int n3=n1*n2;
				 t3.setText(""+n3);
			 }
		 }
		 );
		 b4.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 int n1=Integer.parseInt(str1);
				 int n2=Integer.parseInt(str2);
				 double n3=(double)n1/n2;
				 t3.setText(""+n3);
			 }
		 }
		 );
		 b5.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 int n1=Integer.parseInt(str1);
				 int n2=Integer.parseInt(str2);
				 int n3=n1%n2;
				 t3.setText(""+n3);
			 }
		 }
		 );
		 b6.setOnAction((ae)->
		 {
			 if(t1.getText().isEmpty()||t2.getText().isEmpty())
			 {
				 if(t1.getText().isEmpty())
				 {
					 t1.setPromptText("Please Enter Number1");
				 }
				 if(t2.getText().isEmpty())
				 {
					 t2.setPromptText("Please Enter Number2");
				 }
			 }
			 else
			 {
				 String str1=t1.getText();
				 String str2=t2.getText();
				 double base=Double.parseDouble(str1);
				 double power=Double.parseDouble(str2);
				 double n3=Math.pow(base,power);
				 t3.setText(""+n3);
			 }
		 }
		 );
		 st.setTitle("Arithemetic Operations");
		 st.setScene(s);
		 st.show();
	 }
	 public static void main(String args[])
	 {
		 System.out.println("From main method");
		 launch(args);
	 }
 }
