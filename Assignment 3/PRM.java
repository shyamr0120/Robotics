import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.shape.Line;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.geometry.Point2D;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.WindowEvent;
import javafx.event.*;
import java.util.*; 
 import java.io.File; 

public class PRM extends Application{
    static int env;
    static double C;
    static Scene scene, scene2, scene3;
   @Override
   public void start(Stage stage) {      
      /*try (Scanner scanner = new Scanner(new File("test.txt"))) 
      {
          int count = 0;
        while (scanner.hasNext())
        {
            if(count%2==0)
            {
                env = scanner.nextInt();
            }
            else
            {
                C = scanner.nextDouble();
            }
            count++;
        }
      } 
      catch (Exception e) 
      {
        System.out.println("FILE NOT FOUND");
      }*/
      prm(stage);
    }
      public void prm(Stage stage)
      {
          Pane pane = new Pane();
          env = 1;
      Line line = new Line();
      ArrayList<Vertex> list = new ArrayList<Vertex>();
      ArrayList<Edge> elist = new ArrayList<Edge>();
      Vertex v = new Vertex(100, 510);
      Vertex start = v;
     
      Vertex goal = new Vertex(1000, 50);

      list.add(goal);
     
      Circle c1 = new Circle(start.getX(), start.getY(), 5);
      c1.setFill(Color.BLUE);
      Circle c2 = new Circle(goal.getX(), goal.getY(), 5);
      c2.setFill(Color.BLUE);
     
      if(env==1){
      Polygon polygon = new Polygon();  
       

      polygon.getPoints().addAll(new Double[]{
         200.0, 310.0,
         330.0, 340.0,
         400.0, 150.0,
         315.0, 20.0,
         180.0, 160.0
      });
      polygon.setFill(Color.TRANSPARENT);
      polygon.setStroke(Color.BLACK);
     
      Edge e = new Edge(200,310,330,340);
      elist.add(e);
      e = new Edge(330,340,400,150);
      elist.add(e);
      e = new Edge(400,150,315,20);
      elist.add(e);
      e = new Edge(315,20,180,160);
      elist.add(e);
      e = new Edge(180,160,200,310);
      elist.add(e);
     
      v = new Vertex(200, 310);
      v.nadd(3);
      v.nadd(4);
      //list.add(v);
      v = new Vertex(330, 340);
      v.nadd(4);
      v.nadd(5);
      //list.add(v);
      v = new Vertex(400, 150);
      v.nadd(1);
      v.nadd(5);
      //list.add(v);
      v = new Vertex(315, 20);
      v.nadd(1);
      v.nadd(2);
      //list.add(v);
      v = new Vertex(180, 160);
      v.nadd(2);
      v.nadd(3);
      //list.add(v);
     
      Polygon polygon2 = new Polygon();  
       
      polygon2.getPoints().addAll(new Double[]{
         225.0, 575.0,
         590.0, 575.0,
         590.0, 420.0,
         225.0, 420.0
      });
      polygon2.setFill(Color.TRANSPARENT);
      polygon2.setStroke(Color.BLACK);
     
      e = new Edge(225,575,590,575);
      elist.add(e);
      e = new Edge(590,575,590,420);
      elist.add(e);
      e = new Edge(590,420,225,420);
      elist.add(e);
      e = new Edge(225,420,225,575);
      elist.add(e);
     
      v = new Vertex(225, 575);
      v.nadd(8);
      //list.add(v);
      v = new Vertex(590, 575);
      v.nadd(9);
      //list.add(v);
      v = new Vertex(590, 420);
      v.nadd(6);
      //list.add(v);
      v = new Vertex(225, 420);
      v.nadd(7);
      //list.add(v);
     
      Polygon polygon3 = new Polygon();
     
      polygon3.getPoints().addAll(new Double[]{        
          790.0, 535.0,
          860.0, 580.0,
          935.0, 535.0,          
          935.0, 410.0,
          870.0, 345.0,                  
          790.0, 410.0,
      });
      polygon3.setFill(Color.TRANSPARENT);
      polygon3.setStroke(Color.BLACK);
     
      e = new Edge(790,535,860,580);
      elist.add(e);
      e = new Edge(860,580,935,535);
      elist.add(e);
      e = new Edge(935,535,935,410);
      elist.add(e);
      e = new Edge(935,410,870,345);
      elist.add(e);
      e = new Edge(870,345,790,410);
      elist.add(e);
      e = new Edge(790,410,790,535);
      elist.add(e);
     
      v = new Vertex(790, 535);
      v.nadd(12);
      v.nadd(13);
      v.nadd(14);
      //list.add(v);
      v = new Vertex(860, 580);
      v.nadd(13);
      v.nadd(14);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(935, 535);
      v.nadd(10);
      v.nadd(14);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(935, 410);
      v.nadd(10);
      v.nadd(11);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(870, 345);
      v.nadd(10);
      v.nadd(11);
      v.nadd(12);
      //list.add(v);
      v = new Vertex(790, 410);
      v.nadd(11);
      v.nadd(12);
      v.nadd(13);
      //list.add(v);
     
      Polygon polygon4 = new Polygon();
     
      polygon4.getPoints().addAll(new Double[]{
         405.0, 350.0,
         515.0, 350.0,
         455.0, 135.0,  
      });
      polygon4.setFill(Color.TRANSPARENT);
      polygon4.setStroke(Color.BLACK);
     
      e = new Edge(405,350,515,350);
      elist.add(e);
      e = new Edge(515,350,455,135);
      elist.add(e);
      e = new Edge(455,135,405,350);
      elist.add(e);
     
      v = new Vertex(405, 350);
      //list.add(v);
      v = new Vertex(515, 350);
      //list.add(v);
      v = new Vertex(455, 135);
      //list.add(v);
     
      Polygon polygon5 = new Polygon();
     
      polygon5.getPoints().addAll(new Double[]{
         645.0, 500.0,
         715.0, 400.0,
         610.0, 275.0,
      });
      polygon5.setFill(Color.TRANSPARENT);
      polygon5.setStroke(Color.BLACK);
     
      e = new Edge(645,500,715,400);
      elist.add(e);
      e = new Edge(715,400,610,275);
      elist.add(e);
      e = new Edge(610,275,645,500);
      elist.add(e);
     
      v = new Vertex(645, 500);
      //list.add(v);
      v = new Vertex(715, 400);
      //list.add(v);
      v = new Vertex(610, 275);
      //list.add(v);
     
      Polygon polygon6 = new Polygon();
     
      polygon6.getPoints().addAll(new Double[]{
         520.0, 200.0,
         680.0, 110.0,
         610.0, 25.0,
         520.0, 35.0,
      });
      polygon6.setFill(Color.TRANSPARENT);
      polygon6.setStroke(Color.BLACK);
     
      e = new Edge(520,200,680,110);
      elist.add(e);
      e = new Edge(680,110,610,25);
      elist.add(e);
      e = new Edge(610,25,520,35);
      elist.add(e);
      e = new Edge(520,35,520,200);
      elist.add(e);
     
      v = new Vertex(520, 200);
      v.nadd(24);
      //list.add(v);
      v = new Vertex(680, 110);
      v.nadd(25);
      //list.add(v);
      v = new Vertex(610, 25);
      v.nadd(22);
      //list.add(v);
      v = new Vertex(520, 35);
      v.nadd(23);
      //list.add(v);
     
      Polygon polygon7 = new Polygon();
     
      polygon7.getPoints().addAll(new Double[]{
         700.0, 325.0,
         850.0, 325.0,
         850.0, 40.0,
         700.0, 40.0,
      });
      polygon7.setFill(Color.TRANSPARENT);
      polygon7.setStroke(Color.BLACK);
     
      e = new Edge(700,325,850,325);
      elist.add(e);
      e = new Edge(850,325,850,40);
      elist.add(e);
      e = new Edge(850,40,700,40);
      elist.add(e);
      e = new Edge(700,40,700,325);
      elist.add(e);
     
      v = new Vertex(700, 325);
      v.nadd(28);
      //list.add(v);
      v = new Vertex(850, 325);
      v.nadd(29);
      //list.add(v);
      v = new Vertex(850, 40);
      v.nadd(26);
      //list.add(v);
      v = new Vertex(700, 40);
      v.nadd(27);
      //list.add(v);
     
      Polygon polygon8 = new Polygon();
     
      polygon8.getPoints().addAll(new Double[]{
         950.0, 360.0,
         975.0, 100.0,
         925.0, 40.0,
         870.0, 75.0,
      });
      polygon8.setFill(Color.TRANSPARENT);
      polygon8.setStroke(Color.BLACK);
     
      e = new Edge(950,360,975,100);
      elist.add(e);
      e = new Edge(975,100,925,40);
      elist.add(e);
      e = new Edge(925,40,870,75);
      elist.add(e);
      e = new Edge(870,75,950,360);
      elist.add(e);
     
      v = new Vertex(950, 360);
      v.nadd(32);
      //list.add(v);
      v = new Vertex(975, 100);
      v.nadd(33);
      //list.add(v);
      v = new Vertex(925, 40);
      v.nadd(30);
      //list.add(v);
      v = new Vertex(870, 75);
      v.nadd(31);
      //list.add(v);
      
      pane.getChildren().addAll(polygon, polygon2, polygon3, polygon4, polygon5,
      polygon6, polygon7, polygon8);
    }
    if(env==2){
      Polygon polygon = new Polygon();  
       

      polygon.getPoints().addAll(new Double[]{
         150.0, 300.0,
         300.0, 300.0,
         375.0, 200.0,
         225.0, 100.0,
         150.0, 200.0
      });
      polygon.setFill(Color.TRANSPARENT);
      polygon.setStroke(Color.BLACK);
     
      Edge e = new Edge(150,300,300,300);
      elist.add(e);
      e = new Edge(300,300,375,200);
      elist.add(e);
      e = new Edge(375,200,225,100);
      elist.add(e);
      e = new Edge(225,100,150,200);
      elist.add(e);
      e = new Edge(150,200,150,300);
      elist.add(e);
     
      v = new Vertex(150, 300);
      v.nadd(3);
      v.nadd(4);
      //list.add(v);
      v = new Vertex(300, 300);
      v.nadd(4);
      v.nadd(5);
      //list.add(v);
      v = new Vertex(375, 200);
      v.nadd(1);
      v.nadd(5);
      //list.add(v);
      v = new Vertex(225, 100);
      v.nadd(1);
      v.nadd(2);
      //list.add(v);
      v = new Vertex(150, 200);
      v.nadd(2);
      v.nadd(3);
      //list.add(v);
     
      Polygon polygon2 = new Polygon();  
       
      polygon2.getPoints().addAll(new Double[]{
         150.0, 500.0,
         300.0, 550.0,
         375.0, 400.0,
         225.0, 350.0
      });
      polygon2.setFill(Color.TRANSPARENT);
      polygon2.setStroke(Color.BLACK);
     
      e = new Edge(150,500,300,550);
      elist.add(e);
      e = new Edge(300,550,375,400);
      elist.add(e);
      e = new Edge(375,400,225,350);
      elist.add(e);
      e = new Edge(225,350,150,500);
      elist.add(e);
     
      v = new Vertex(150, 500);
      v.nadd(8);
      //list.add(v);
      v = new Vertex(300, 550);
      v.nadd(9);
      //list.add(v);
      v = new Vertex(375, 400);
      v.nadd(6);
      //list.add(v);
      v = new Vertex(225, 350);
      v.nadd(7);
      //list.add(v);
     
      Polygon polygon3 = new Polygon();
     
      polygon3.getPoints().addAll(new Double[]{        
          900.0, 500.0,
          1050.0, 400.0,
          1050.0, 200.0,          
          975.0, 150.0,
          900.0, 200.0,                  
          850.0, 300.0,
      });
      polygon3.setFill(Color.TRANSPARENT);
      polygon3.setStroke(Color.BLACK);
     
      e = new Edge(900,500,1050,400);
      elist.add(e);
      e = new Edge(1050,400,1050,200);
      elist.add(e);
      e = new Edge(1050,200,975,150);
      elist.add(e);
      e = new Edge(975,150,900,200);
      elist.add(e);
      e = new Edge(900,200,850,300);
      elist.add(e);
      e = new Edge(850,300,900,500);
      elist.add(e);
     
      v = new Vertex(900, 500);
      v.nadd(12);
      v.nadd(13);
      v.nadd(14);
      //list.add(v);
      v = new Vertex(1050, 400);
      v.nadd(13);
      v.nadd(14);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(1050, 200);
      v.nadd(10);
      v.nadd(14);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(975, 150);
      v.nadd(10);
      v.nadd(11);
      v.nadd(15);
      //list.add(v);
      v = new Vertex(900, 200);
      v.nadd(10);
      v.nadd(11);
      v.nadd(12);
      //list.add(v);
      v = new Vertex(850, 300);
      v.nadd(11);
      v.nadd(12);
      v.nadd(13);
      //list.add(v);
     
      Polygon polygon4 = new Polygon();
     
      polygon4.getPoints().addAll(new Double[]{
         650.0, 200.0,
         825.0, 250.0,
         850.0, 50.0,  
      });
      polygon4.setFill(Color.TRANSPARENT);
      polygon4.setStroke(Color.BLACK);
     
      e = new Edge(650,200,825,250);
      elist.add(e);
      e = new Edge(825,250,850,50);
      elist.add(e);
      e = new Edge(850,50,650,200);
      elist.add(e);
     
      v = new Vertex(650, 200);
      //list.add(v);
      v = new Vertex(825, 250);
      //list.add(v);
      v = new Vertex(850, 50);
      //list.add(v);
     
      Polygon polygon5 = new Polygon();
     
      polygon5.getPoints().addAll(new Double[]{
         500.0, 500.0,
         750.0, 550.0,
         800.0, 300.0,
      });
      polygon5.setFill(Color.TRANSPARENT);
      polygon5.setStroke(Color.BLACK);
     
      e = new Edge(500,500,750,550);
      elist.add(e);
      e = new Edge(750,550,800,300);
      elist.add(e);
      e = new Edge(800,300,500,500);
      elist.add(e);
     
      v = new Vertex(500, 500);
      //list.add(v);
      v = new Vertex(750, 550);
      //list.add(v);
      v = new Vertex(800, 300);
      //list.add(v);
     
      Polygon polygon6 = new Polygon();
     
      polygon6.getPoints().addAll(new Double[]{
         375.0, 375.0,
         625.0, 350.0,
         525.0, 70.0,
         400.0, 250.0,
      });
      polygon6.setFill(Color.TRANSPARENT);
      polygon6.setStroke(Color.BLACK);
     
      e = new Edge(375,375,625,350);
      elist.add(e);
      e = new Edge(625,350,525,70);
      elist.add(e);
      e = new Edge(525,70,400,250);
      elist.add(e);
      e = new Edge(400,250,375,375);
      elist.add(e);
     
      v = new Vertex(375, 375);
      v.nadd(24);
      //list.add(v);
      v = new Vertex(625, 350);
      v.nadd(25);
      //list.add(v);
      v = new Vertex(525, 70);
      v.nadd(22);
      //list.add(v);
      v = new Vertex(400, 250);
      v.nadd(23);
      //list.add(v);
      
      pane.getChildren().addAll(polygon, polygon2, polygon3, polygon4, polygon5,
      polygon6);
    }
    
    Random random = new Random();
    int count = 0;
    
    while(count<2000)
    {
        int rx = random.nextInt(1201);
        int ry = random.nextInt(601);
        int skip = 0;
        for(int j=0; j<elist.size(); j++)
        {
            Edge temp = elist.get(j);
            boolean l = temp.lies(rx, ry);
            if(l==true)
            {
                skip = 1;
                break;
            }
        }
        if(skip==1)
        {
            continue;
        }
        v = new Vertex(rx, ry);
        list.add(v);
        count++;
    }
      ArrayList <Double> h = new ArrayList<Double>();
      for(int i=0; i<list.size(); i++)
      {
          Vertex temp = list.get(i);
          h.add(goal.distance(temp.getX(), temp.getY()));
          double temp2 = h.get(i);
          temp.setH(temp2);
          temp2 = temp2;
      }
     
      Vertex current = start;
     
      for(int i=0; i<list.size(); i++)
      {
          Vertex next = list.get(i);
          int inter = 0;
          boolean check = false;
          for(int j=0; j<elist.size(); j++)
          {
              Edge temp = elist.get(j);
              inter = intersect(current.getX(), current.getY(),
                      next.getX(), next.getY(), temp.getX1(), temp.getY1(),
                      temp.getX2(), temp.getY2());
              if(inter==1)
              {
                  break;
              }
              check = current.poly(i);
          }
          if(inter == 0 && check == false)
          {
              double value2 = current.distance(next.getX(), next.getY());
              if(value2==0)
              {
                  continue;
              }
              if(value2>1000)
              {
                  continue;
              }
              current.access(i, value2);
          }
      }
     
      for(int k=0; k<list.size(); k++){
      current = list.get(k);
      for(int i=0; i<list.size(); i++)
      {
          Vertex next = list.get(i);
          int inter = 0;
          boolean check = false;
          for(int j=0; j<elist.size(); j++)
          {
              Edge temp = elist.get(j);
              inter = intersect(current.getX(), current.getY(),
                      next.getX(), next.getY(), temp.getX1(), temp.getY1(),
                      temp.getX2(), temp.getY2());
              if(inter==1)
              {
                  break;
              }
              check = current.poly(i);
          }
          if(inter == 0 && check == false)
          {
              double value2 = current.distance(next.getX(), next.getY());
              if(value2==0)
              {
                  continue;
              }
              current.access(i, value2);
          }
      }
    }
     
      current = start;
      int found = 0;
      double dis = 0;
      double hu = 0;
      int index = -1;
      double small = 10000;
      ArrayList <Node> open = new ArrayList<Node>();
      Node n = new Node(0, 0);
      ArrayList <Integer> closed = new ArrayList<Integer>();
      closed.add(-1);
      ArrayList <Double> g = new ArrayList<Double>();
      ArrayList <Integer> vv = new ArrayList<Integer>();
     
      while(true)
      {
          g = current.getG();
          vv = current.getV();
          int exists = 0;
          for(int i=0; i<g.size(); i++)
          {
              int vertex = vv.get(i);
              hu = list.get(vertex).getH();
              double fvalue = g.get(i) + hu + dis;
              n = new Node(vertex, fvalue);
              int skip = 0;
              for(int j=0; j<closed.size(); j++)
              {
                  int v2 = closed.get(j);
                  if(vertex == v2)
                  {
                      skip = 1;
                      break;
                  }
              }
              if(skip==1)
              {
                  continue;
              }
              exists=1;
              for(int j=0; j<open.size(); j++)
              {
                  Node n2 = open.get(j);
                  int v2 = n2.getV();
                  if(vertex == v2)
                  {
                      open.set(j, n);
                      skip = 1;
                      break;
                  }
              }
              if(skip==0)
              {
                  open.add(n);
              }
          }
          
          if(exists==0)
          {
              System.out.println("No path exists");
              System.exit(0);
          }
          small = 10000;
          int index2 = 0;
          for(int i=0; i<open.size(); i++)
          {
              int v2 = (open.get(i)).getV();
              if(current.accessible(v2)==false)
              {
                  continue;
              }
              double small2 = (open.get(i)).getF();
              if(small2<small)
              {
                  small = small2;
                  index = (open.get(i)).getV();
                  index2 = i;
              }
          }
         
          closed.add(index);
          current = list.get(index);
          dis = small - current.getH();
         
          if(closed.get(closed.size()-1)==0)
          {
              found = 1;
              break;
          }
        
          open.remove(index2);
          if(open.size()==0)
          {
              break;
          }
      }
      if(found==0)
      {
          System.out.println("No path exists");
          System.exit(0);
      }
      for(int i=0; i<closed.size()-1; i++)
      {
          int temp = closed.get(i);
          int temp2 = 0;
          Vertex v1 = new Vertex(0,0);
          if(temp==-1)
          {
              v1 = start;
          }
          else
          {
              v1 = list.get(temp);
          }
          for(int j=i; j<closed.size(); j++)
          {
              int temp3 = closed.get(j);
              if(v1.accessible(temp3)==true)
              {
                  temp2 = temp3;
                  i = j - 1;
              }
          }
          Vertex v2 = list.get(temp2);
          line = new Line();
          line.setStartX(v1.getX());
          line.setStartY(v1.getY());
          line.setEndX(v2.getX());
          line.setEndY(v2.getY());
          line.setStroke(Color.RED);
          pane.getChildren().addAll(line);
      }
      Text t1 = new Text();
      t1.setFont(new Font(30));
      t1.setWrappingWidth(200);
      t1.setTextAlignment(TextAlignment.JUSTIFY);
      t1.setText("S");
      t1.setX(start.getX()-35);
      t1.setY(start.getY()+10);
     
      Text t2 = new Text();
      t2.setFont(new Font(30));
      t2.setWrappingWidth(200);
      t2.setTextAlignment(TextAlignment.JUSTIFY);
      t2.setText("G");
      t2.setX(goal.getX()+20);
      t2.setY(goal.getY()+10);
     
      pane.getChildren().addAll(c1, c2, t1, t2);
      scene2 = new Scene(pane, 1200, 600); 
      stage.setTitle("PRM");
         
      stage.setScene(scene2);
         
      stage.show();
    }
    int intersect(double x1, double y1, double x2, double y2, double x3, double y3,
    double x4, double y4)
    {
        y1=600-y1;
        y2=600-y2;
        y3=600-y3;
        y4=600-y4;
        double c1=x2-x1;
        double c2=x4-x3;
        if(c1==0&&c2==0)
        {
            return 0;
        }
        if(c1==0)
        {
            double m = (y4-y3)/(x4-x3);
            double b = y3-(x3*m);
                if(x4>x3)
                {
                    if(x1>=x3&&x1<=x4)
                    {
                        double y = m*x1+b;
                        if(y4>y3)
                        {
                            if(y>=y3&&y<=y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>=y1&&y<=y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y1&&y>=y2)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<=y3&&y>=y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>=y1&&y<=y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y1&&y>=y2)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(x1<=x3&&x1>=x4)
                    {
                        double y = m*x1+b;
                        if(y4>y3)
                        {
                            if(y>=y3&&y<=y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>=y1&&y<=y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y1&&y>=y2)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<=y3&&y>=y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>=y1&&y<=y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y1&&y>=y2)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
        }
        if(c2==0)
        {
            double m = (y2-y1)/(x2-x1);
            double b = y1-(x1*m);
                if(x2>x1)
                {
                    if(x3>=x1&&x3<=x2)
                    {
                        double y = (m*x3+b);
                        if(y2>y1)
                        {
                            if(y>=y1&&y<=y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>=y3&&y<=y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y3&&y>=y4)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<=y1&&y>=y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>=y3&&y<=y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y3&&y>=y4)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(x3<=x1&&x3>=x2)
                    {
                        double y = (m*x3+b);
                        if(y2>y1)
                        {
                            if(y>=y1&&y<=y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>=y3&&y<=y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y3&&y>=y4)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<=y1&&y>=y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>=y3&&y<=y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<=y3&&y>=y4)
                                    {
                                        return 1;
                                    }  
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
        }
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y4-y3)/(x4-x3);
        if(x1==330)
        {
            x1=x1;
        }
        if(m1==m2)
        {
            return 0;
        }
        if((y2-y1)==0)
        {
            m1=0;
        }
        if((y4-y3)==0)
        {
            if(x1==330)
            {
                x1=x1;
            }
            m2=0;
        }
        double b1 = y1-(x1*m1);
        double b2 = y3-(x3*m2);
        double xx = Math.round((b2-b1)/(m1-m2));
        if(x2>x1)
        {
            if(xx>=x1&&xx<=x2)
            {
                if(x4>x3)
                {
                    if(xx>=x3&&xx<=x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(xx<=x3&&xx>=x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(xx<=x1&&xx>=x2)
            {
                if(x4>x3)
                {
                    if(xx>=x3&&xx<=x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(xx<=x3&&xx>=x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            else
            {
                return 0;
            }
        }
    }
   public static void main(String args[]){
      launch(args);
   }
}
class Node
{
    private int v;
    private double f;
    Node(int vv, double ff)
    {
        v = vv;
        f = ff;
    }
    public int getV()
    {
        return v;
    }
    public double getF()
    {
        return f;
    }
}
class Vertex
{
    private double x, y, h;
    ArrayList <Integer> nadj = new ArrayList<Integer>();
    ArrayList <Integer> v = new ArrayList<Integer>();
    ArrayList <Double> g = new ArrayList<Double>();
    Vertex(double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    public boolean accessible(int vertex)
    {
        int check = 0;
        for(int i=0; i<v.size(); i++)
        {
            int v2 = v.get(i);
            if(vertex==v2)
            {
                check=1;
                break;
            }
        }
        if(check==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setH(double hh)
    {
        h = hh;
    }
    public double getH()
    {
        return h;

    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public boolean comp(double ax, double ay)
    {
        if(x == ax && y == ay)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double distance(double x2, double y2)
    {
        double temp1 = x2 - x;
        temp1 = temp1*temp1;
        double temp2 = y2 - y;
        temp2 = temp2*temp2;
        double temp3 = temp1 + temp2;
        double sum = Math.sqrt(temp3);
        return sum;
    }
    public void nadd(int n)
    {
        nadj.add(n);
    }
    public boolean poly(int n)
    {
        for(int i=0; i<nadj.size(); i++)
        {
            if(nadj.get(i)==n)
            {
                return true;
            }
        }
        return false;
    }
    public void access(int a, double b)
    {
        v.add(a);
        g.add(b);
    }
    public ArrayList<Integer> getV()
    {
        return v;
    }
    public ArrayList<Double> getG()
    {
        return g;
    }
}
class Edge
{
    private double x1, y1, x2, y2;
    Edge(double xx1, double yy1, double xx2, double yy2)
    {
        x1 = xx1;
        y1 = yy1;
        x2 = xx2;
        y2 = yy2;
    }
    double getX1()
    {
        return x1;
    }
    double getY1()
    {
        return y1;
    }
    double getX2()
    {
        return x2;
    }
    double getY2()
    {
        return y2;
    }
    boolean lies(int x, int y)
    {
        double m = 0;
        double c = x2-x1;
        if(c==0)
        {
            if(x==x1)
            {
                if(y>=y1+10&&y<=y2+10||y>=y2+10&&y<=y1+10)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        
        m = (y2-y1)/(x2-x1);
        double b = y1-(x1*m);
        
        double yy = (m*x)+b;
        if(y>=(yy-10)&&y<=(yy+10))
        {
            return true;
        }
        return false;
    }
}
