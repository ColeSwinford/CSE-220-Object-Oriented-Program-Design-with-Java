import java.util.*;
import java.io.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class HW2_ColeSwinford extends Application
{
    public void start(Stage primaryStage) throws FileNotFoundException
    {
        File file = new File("OPEX.txt");
        Scanner scanner = new Scanner(file);
        
        //Input 1
        String label1 = scanner.next();
        double val1 = scanner.nextDouble();
        //Input 2
        String label2 = scanner.next();
        double val2 = scanner.nextDouble();        
        //Input 3
        String label3 = scanner.next();
        double val3 = scanner.nextDouble();
        //Input 4
        String label4 = scanner.next();
        double val4 = scanner.nextDouble();
        
        //Calculations
        double total = val1 + val2 + val3 + val4;
        double perc1 = 100*(val1/total);
        double perc2 = 100*(val2/total);
        double perc3 = 100*(val3/total);
        double perc4 = 100*(val4/total);

        //100 = 360
        double convert = (360.00/100.00);
        double rad1 = convert * perc1;
        double rad2 = convert * perc2;
        double rad3 = convert * perc3;
        double rad4 = convert * perc4;
        
        //Pie chart
        double start1 = 0;
        double end1 = rad1;
        Arc pie1 = new Arc(250, 150, 70, 60, start1, end1);
        pie1.setFill(Color.WHITE);
        pie1.setType(ArcType.ROUND);

        double start2 = end1;
        double end2 = rad2;
        Arc pie2 = new Arc(250, 150, 70, 60, start2, end2);
        pie2.setFill(Color.ORANGE);
        pie2.setType(ArcType.ROUND);

        double start3 = end1 + end2;
        double end3 = rad3;
        Arc pie3 = new Arc(250, 150, 70, 60, start3, end3);
        pie3.setFill(Color.GREEN);
        pie3.setType(ArcType.ROUND);
  
        double start4 = end1 + end2 + end3;
        double end4 = rad4;
        Arc pie4 = new Arc(250, 150, 70, 60, start4, end4);
        pie4.setFill(Color.RED);
        pie4.setType(ArcType.ROUND);
        
        //Text
        DecimalFormat truncDouble = new DecimalFormat("#.##");
    
        Text text1 = new Text();
        text1.setText(label1 + ": " + (truncDouble.format(perc1)) + "%");
        text1.setX(350);
        text1.setY(75);
        text1.setFill(Color.WHITE);
        
        Text text2 = new Text();
        text2.setText(label2 + ": " + (truncDouble.format(perc2)) + "%");
        text2.setX(350);
        text2.setY(95);
        text2.setFill(Color.ORANGE);
        
        Text text3 = new Text();
        text3.setText(label3 + ": " + (truncDouble.format(perc3)) + "%");
        text3.setX(350);
        text3.setY(115);
        text3.setFill(Color.GREEN);
        
        Text text4 = new Text();
        text4.setText(label4 + ": " + (truncDouble.format(perc4)) + "%");
        text4.setX(350);
        text4.setY(135);
        text4.setFill(Color.RED);

        //Grouping
        Group chart = new Group(pie1, pie2, pie3, pie4);
        Group text = new Group(text1, text2, text3, text4);
        Group root = new Group(chart, text);
        Scene scene = new Scene(root, 500, 350, Color.BLACK);

        //Staging
        primaryStage.setTitle("Pie-chart");
        primaryStage.setScene(scene);
        primaryStage.show();
        

    }
}