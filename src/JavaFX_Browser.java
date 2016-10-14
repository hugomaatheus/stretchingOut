import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class JavaFX_Browser extends Application {
 
private Scene scene;
MyBrowser myBrowser;
 

public static void main(String[] args) {
    launch(args);
}
 
@Override
public void start(Stage primaryStage) {
	
    primaryStage.setTitle("1.1 - Stretching Out");
 
    myBrowser = new MyBrowser();
    scene = new Scene(myBrowser);
    
    primaryStage.setMaximized(true);
    primaryStage.setResizable(false);
    primaryStage.setScene(scene);
    primaryStage.show();
}
 
class MyBrowser extends Region{

    final String pageHtml = "Index.html";

    WebView webView = new WebView();
    WebEngine webEngine = webView.getEngine();

    public MyBrowser(){
    	webView.setMinSize(1600, 900);
        URL urlHello = getClass().getResource("Index.html");
        webEngine.load(urlHello.toExternalForm());

        getChildren().add(webView);
    }
}
}