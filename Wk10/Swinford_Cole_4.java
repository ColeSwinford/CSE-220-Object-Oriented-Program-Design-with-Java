import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.transform.Translate;

public class Swinford_Cole_4 extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
            primaryStage.setTitle("HW4 - Cole Swinford");
            
            //Chassis
            double chassisPoints0[] = {
                100.0d, 100.0d,
                100.0d, 200.0d,
                400.0d, 200.0d
            };
            Polygon chassis0 = new Polygon(chassisPoints0);
            chassis0.setFill(Color.RED);
            double chassisPoints1[] = {
                100.0d, 100.0d,
                400.0d, 100.0d,
                400.0d, 200.0d
            };
            Polygon chassis1 = new Polygon(chassisPoints1);
            chassis1.setFill(Color.RED);
            
            //Windows
            ///Front
            double frontWindowPoints0[] = {
                125.0d, 110.0d,
                225.0d, 110.0d,
                125.0d, 150.0d
            };
            Polygon frontWindow0 = new Polygon(frontWindowPoints0);
            frontWindow0.setFill(Color.BLUE);
            double frontWindowPoints1[] = {
                125.0d, 150.0d,
                225.0d, 110.0d,
                225.0d, 150.0d
            };
            Polygon frontWindow1 = new Polygon(frontWindowPoints1);
            frontWindow1.setFill(Color.BLUE);
            ///Rear
            double rearWindowPoints0[] = {
                275.0d, 110.0d,
                375.0d, 110.0d,
                275.0d, 150.0d
            };
            Polygon rearWindow0 = new Polygon(rearWindowPoints0);
            rearWindow0.setFill(Color.BLUE);
            double rearWindowPoints1[] = {
                275.0d, 150.0d,
                375.0d, 110.0d,
                375.0d, 150.0d
            };
            Polygon rearWindow1 = new Polygon(rearWindowPoints1);
            rearWindow1.setFill(Color.BLUE);

            //Wheels
            ///Front
            Circle frontWheel = new Circle();
            frontWheel.setCenterX(150.0f);
            frontWheel.setCenterY(200.0f);
            frontWheel.setRadius(35.0f);
            ///Rear
            Circle rearWheel = new Circle();
            rearWheel.setCenterX(350.0f);
            rearWheel.setCenterY(200.0f);
            rearWheel.setRadius(35.0f);
            
            //Slider
            Slider slider = new Slider(-12.5, 0, 1);
            slider.setShowTickMarks(true);
            slider.setShowTickLabels(true);
            slider.setMajorTickUnit(0.5f);
            slider.setBlockIncrement(0.1f);
            Translate translate = new Translate();
            slider.valueProperty().addListener(new ChangeListener<Number>(){
                public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
                    translate.setY((double) newValue);
                }
            });
            frontWheel.getTransforms().add(translate);
            rearWheel.getTransforms().add(translate);

            //Scene stuff
            Group Group = new Group(chassis0, chassis1, frontWindow0, frontWindow1, rearWindow0, rearWindow1, frontWheel, rearWheel, slider);
            Scene scene = new Scene(Group, 500, 300);
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
