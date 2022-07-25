import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.beans.value.*;
public class TreeViewFX extends Application
{
	Label l1,l2;
	FlowPane fp;
	TreeView<String> cview;
	TreeItem<String> india,ap,tn,tg,ka,ke,kdp,ctr,atp,knl,ne,rjpt,tpt,ndl,tp,cni,bngu,tiru,hyd,aits,pdtr;
	Scene s;
	public void init()
	{
		india=new TreeItem<String>("India");
		ap=new TreeItem<String>("Andhra Pradesh");
		tn=new TreeItem<String>("TamilNadu");
		tg=new TreeItem<String>("Telangana");
		ka=new TreeItem<String>("Karnataka");
		ke=new TreeItem<String>("Kerala");
		kdp=new TreeItem<String>("Kadapa");
		ctr=new TreeItem<String>("Chittor");
		atp=new TreeItem<String>("Anantapur");
		knl=new TreeItem<String>("Kurnool");
		ne=new TreeItem<String>("Nellore");
		rjpt=new TreeItem<String>("Rajampet");
		tpt=new TreeItem<String>("Tirupati");
		ndl=new TreeItem<String>("Nandyal");
		tp=new TreeItem<String>("Tadipatri");
		cni=new TreeItem<String>("Chennai");
		bngu=new TreeItem<String>("Bengaluru");
		tiru=new TreeItem<String>("Tiruvanantapuram");
		hyd=new TreeItem<String>("Hyderabad");
		aits=new TreeItem<String>("AITS");
		pdtr=new TreeItem<String>("Proddutur");
		india.getChildren().addAll(ap,tn,tg,ka,ke);
		ap.getChildren().addAll(kdp,ctr,atp,knl,ne);
		kdp.getChildren().addAll(rjpt,pdtr);
		rjpt.getChildren().add(aits);
		ctr.getChildren().add(tpt);
		atp.getChildren().add(tp);
		knl.getChildren().add(ndl);
		tn.getChildren().add(cni);
		ka.getChildren().add(bngu);
		ke.getChildren().add(tiru);
		tg.getChildren().add(hyd);
		l1=new Label("Selected Location");
		l2=new Label("Selected Location Path");
		cview=new TreeView<String>(india);
		fp=new FlowPane(20,20);
		fp.getChildren().add(cview);
		fp.getChildren().addAll(l1,l2);
		fp.setAlignment(Pos.CENTER);
	}
	public void start(Stage st) throws Exception
	{
		MultipleSelectionModel<TreeItem<String>>
		cvmodel=cview.getSelectionModel();
		cvmodel.selectedItemProperty().addListener(
		(changed,oldVal,newVal)->
		{
			if(newVal!=null)
			{
				String path=newVal.getValue();
				TreeItem<String> tmp=newVal.getParent();
				l1.setText("Selected Location:"+path);
				while(tmp!=null)
				{
					path=tmp.getValue()+"->"+path;
					tmp=tmp.getParent();
					l2.setText("Selected Path:"+path);

				}
			}
		}
		);
		s=new Scene(fp,300,300);
		st.setTitle("Country View");
		st.setScene(s);
		st.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
