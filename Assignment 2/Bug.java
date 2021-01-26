import java.util.ArrayList;
import java.util.Scanner;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class Bug
{
	static Nodes root;
	static int count;
	static int found;
	static int path1;
	static int path2;
	static int eN;
	static long time1;
	static long time2;
	static long time3;
	static long time4;
	static ArrayList<Integer> obs;
	static ArrayList<Nodes> list;
	static ArrayList<Nodes> line;
	static ArrayList<Nodes> nodes;
	public static void main(String args[])
	{
		int choice = 1;
		while(choice!=0)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter: 0 to Exit, "
					+ "1 to perform Bug 1, "
					+ "2 to perform Bug 2");
			choice = s.nextInt();
			System.out.println();
			if(choice==0)
			{
				break;
			}
			if(choice!=1&&choice!=2)
			{
				System.out.println("Invalid choice. Please make a valid choice.");
				continue;
			}
			
			s = new Scanner(System.in);
			System.out.println("Enter which Environment you would like to test (1, 2, or 3)?");
			int env = s.nextInt();
			System.out.println();
			if(env!=1&&env!=2&&env!=3)
			{
				System.out.println("Invalid choice. Please make a valid choice.");
				continue;
			}
			
			obs = new ArrayList<Integer>();
			
			if(env == 1)
			{
				obs.add(5);	obs.add(5);
				obs.add(5);	obs.add(6);
				obs.add(5);	obs.add(7);
				obs.add(5);	obs.add(8);
				obs.add(6);	obs.add(5);
				obs.add(6);	obs.add(6);
				obs.add(6);	obs.add(7);
				obs.add(6);	obs.add(8);
				obs.add(7);	obs.add(5);
				obs.add(7);	obs.add(6);
				obs.add(7);	obs.add(7);
				obs.add(7);	obs.add(8);
				obs.add(8);	obs.add(5);
				obs.add(8);	obs.add(6);
				obs.add(8);	obs.add(7);
				obs.add(8);	obs.add(8);
				
				obs.add(20); obs.add(23);
				obs.add(21); obs.add(22);
				obs.add(22); obs.add(21);
				obs.add(21); obs.add(20);
				obs.add(20); obs.add(19);
				obs.add(21); obs.add(23);
				obs.add(22); obs.add(23);
				obs.add(23); obs.add(23);
				obs.add(24); obs.add(23);
				obs.add(24); obs.add(22);
				obs.add(24); obs.add(21);
				obs.add(24); obs.add(20);
				obs.add(24); obs.add(19);
				obs.add(23); obs.add(19);
				obs.add(22); obs.add(19);
				obs.add(21); obs.add(19);
				obs.add(22); obs.add(22);
				obs.add(23); obs.add(22);
				obs.add(23); obs.add(21);
				obs.add(22); obs.add(20);
				obs.add(23); obs.add(20);
				
				obs.add(12); obs.add(15);
				obs.add(13); obs.add(15);
				obs.add(12); obs.add(14);
				obs.add(13); obs.add(14);
				obs.add(12); obs.add(13);
				obs.add(13); obs.add(13);
				obs.add(12); obs.add(12);
				obs.add(13); obs.add(12);
			}
			
			if(env == 2)
			{
				obs.add(5);	obs.add(25);
				obs.add(5);	obs.add(26);
				obs.add(5);	obs.add(27);
				obs.add(5);	obs.add(28);
				obs.add(6);	obs.add(26);
				obs.add(7);	obs.add(26);
				obs.add(8);	obs.add(27);
				obs.add(8);	obs.add(28);
				obs.add(9);	obs.add(29);
				obs.add(9);	obs.add(28);
				obs.add(9);	obs.add(27);
				obs.add(7);	obs.add(27);
				
				obs.add(13); obs.add(22);
				obs.add(13); obs.add(23);
				obs.add(13); obs.add(24);
				obs.add(14); obs.add(22);
				obs.add(14); obs.add(23);
				obs.add(14); obs.add(24);
				obs.add(15); obs.add(22);
				obs.add(15); obs.add(23);
				obs.add(15); obs.add(24);
				obs.add(16); obs.add(22);
				obs.add(16); obs.add(23);
				obs.add(16); obs.add(24);
								
				obs.add(22); obs.add(15);
				obs.add(22); obs.add(14);
				obs.add(22); obs.add(13);
				obs.add(23); obs.add(14);
				obs.add(23); obs.add(13);
				obs.add(24); obs.add(13);
				obs.add(22); obs.add(16);
				obs.add(23); obs.add(15);
				obs.add(24); obs.add(14);
				obs.add(25); obs.add(13);
			}
			
			if(env == 3)
			{
				obs.add(5);	obs.add(13);
				obs.add(5);	obs.add(14);
				obs.add(5);	obs.add(15);
				obs.add(5);	obs.add(16);
				obs.add(5);	obs.add(17);
				obs.add(6);	obs.add(13);
				obs.add(6);	obs.add(14);
				obs.add(6);	obs.add(15);
				obs.add(6);	obs.add(16);
				obs.add(6);	obs.add(17);
				obs.add(7);	obs.add(13);
				obs.add(7);	obs.add(14);
				obs.add(7);	obs.add(15);
				obs.add(7);	obs.add(16);
				obs.add(7);	obs.add(17);
				
				obs.add(20); obs.add(15);
				obs.add(21); obs.add(16);
				obs.add(22); obs.add(17);
				obs.add(21); obs.add(18);
				obs.add(20); obs.add(19);
				obs.add(21); obs.add(19);
				obs.add(22); obs.add(19);
				obs.add(23); obs.add(18);
				obs.add(24); obs.add(17);
				obs.add(23); obs.add(16);
				obs.add(22); obs.add(15);
				obs.add(21); obs.add(15);
				obs.add(22); obs.add(16);
				obs.add(22); obs.add(18);
				obs.add(23); obs.add(17);
				
				obs.add(12); obs.add(15);
				obs.add(13); obs.add(15);
				obs.add(12); obs.add(14);
				obs.add(13); obs.add(14);
				obs.add(12); obs.add(13);
				obs.add(13); obs.add(13);
				obs.add(12); obs.add(12);
				obs.add(13); obs.add(12);
			}
			
			s = new Scanner(System.in);
			System.out.println("Enter starting index e.g.: 0,0."
					+ " Range is from (0,0) to (32,32).");
			String si = s.nextLine();
			
			int sx = 0;
			int sy = 0;
			
			try
			{
				String hold = "";
				for(int i=0; i<si.length(); i++)
				{
					char c = si.charAt(i);
					if(c==',')
					{
						sx = Integer.parseInt(hold);
						hold = "";
						continue;
					}
					hold = hold+c;
				}
				sy = Integer.parseInt(hold);
			}
			catch(Exception e)
			{
				System.out.println("Invalid format for starting index. Please try again.");
				System.out.println();
				continue;
			}
			int sums = sy*sx;
			
			if(sums>32*32)
			{
				System.out.println("Invalid starting index. Please input a valid index.");
				System.out.println();
				continue;
			}
			
			boolean check = false;
			for(int j=0; j<obs.size()-1; j+=2)
			{
				int xx = obs.get(j);
				int yy = obs.get(j+1);
				if(sx==xx&&sy==yy)
				{
					System.out.println("Starting index is on an obstacle. Please input a starting index that is not on an obstacle.");
					System.out.println();
					check=true;
					break;
				}
			}
			
			if(check==true)
			{
				continue;
			}
			
			s = new Scanner(System.in);
			System.out.println("Enter goal index e.g.: 0,0"
					+ " Range is from (0,0) to (32,32).");
			String gi = s.nextLine();
			
			int gx = 0;
			int gy = 0;
			
			try
			{
				String hold = "";
				for(int i=0; i<gi.length(); i++)
				{
					char c = gi.charAt(i);
					if(c==',')
					{
						gx = Integer.parseInt(hold);
						hold = "";
						continue;
					}
					hold = hold+c;
				}
				gy = Integer.parseInt(hold);
			}
			catch(Exception e)
			{
				System.out.println("Invalid format for goal index. Please try again.");
				System.out.println();
				continue;
			}
			int sumg = gy*gx;
			
			if(sumg>32*32)
			{
				System.out.println("Invalid goal index. Please input a valid index.");
				System.out.println();
				continue;
			}
			
			check = false;
			for(int j=0; j<obs.size()-1; j+=2)
			{
				int xx = obs.get(j);
				int yy = obs.get(j+1);
				if(gx==xx&&gy==yy)
				{
					System.out.println("Goal index is on an obstacle. Please input a goal index that is not on an obstacle.");
					System.out.println();
					check=true;
					break;
				}
			}
			
			if(check==true)
			{
				continue;
			}
			
			found = 0;
			path1 = -1;
			path2 = 0;
			count = 0;
			eN = 2112;
			list = new ArrayList<Nodes>();
			line = new ArrayList<Nodes>();
			nodes = new ArrayList<Nodes>();
			
			Graph graph = new SingleGraph("grid");
			Generator gen = new GridGenerator();
	
			gen.addSink(graph);
			gen.begin();
	
			for(int i=0; i<32; i++) 
			{
				gen.nextEvents();
			}
			gen.end();
			
			createTree();
			
			addPaths(list, 32);
			//System.out.println(count);
			
			Nodes start = list.get(0);
			Nodes goal = list.get(0);
			
			sums=-1;
			sumg=-1;
			int exit = 0;
			
			for(int i=0; i<33; i++)
			{
				for(int j=0; j<33; j++)
				{
					sums++;
					if(i==sx&&j==sy)
					{
						exit=1;
						break;
					}
				}
				if(exit==1)
				{
					break;
				}
			}
			exit=0;
			for(int i=0; i<33; i++)
			{
				for(int j=0; j<33; j++)
				{
					sumg++;
					if(i==gx&&j==gy)
					{
						exit=1;
						break;
					}
				}
				if(exit==1)
				{
					break;
				}
			}
			
			start = list.get(sums);
			goal = list.get(sumg);
			String index = "";
			
			for(int i=0; i<list.size(); i++)
			{
				Nodes temp2 = list.get(i);
				int xx = temp2.x;
				int yy = temp2.y;
				int o = temp2.obstacle;
				if(o==1)
				{
					index = Integer.toString(xx)
							+"_"+Integer.toString(yy);
					Node temp3 = graph.getNode(index);
					temp3.addAttribute("ui.style", "fill-color: gray;");
				}
			}
			
			for(int i=0; i<32; i++)
			{
				for(int j=0; j<32; j++)
				{
					index = Integer.toString(i)
							+"_"+Integer.toString(j);
					String index2 = Integer.toString(i+1)
							+"_"+Integer.toString(j+1);
					graph.addEdge(Integer.toString(eN++), index, index2);
				}
			}
			
			for(int i=0; i<32; i++)
			{
				for(int j=1; j<33; j++)
				{
					index = Integer.toString(i)
							+"_"+Integer.toString(j);
					String index2 = Integer.toString(i+1)
							+"_"+Integer.toString(j-1);
					graph.addEdge(Integer.toString(eN++), index, index2);
				}
			}
			
			if(choice==1)
			{
				bug1(start, goal);
			}
			else
			{
				mline(start, goal);
				bug2(start, goal);
			}
			plotBug(graph);
			
			int x = start.x;
			int y = start.y;
			index = Integer.toString(x)
					+"_"+Integer.toString(y);
			Node temp = graph.getNode(index);
			temp.addAttribute("ui.style", "fill-color: blue;");
			
			x = goal.x;
			y = goal.y;
			index = Integer.toString(x)
					+"_"+Integer.toString(y);
			temp = graph.getNode(index);
			temp.addAttribute("ui.style", "fill-color: green;");
				
			graph.display(false);
		}
		System.exit(0);
	}
	
	public static void bug2(Nodes start, Nodes goal)
	{
		Nodes temp = start;
		nodes.add(start);
		for(int i=1; i<line.size(); i++)
		{
			temp = line.get(i);
			Nodes temp2 = temp;
			int xx = temp.x;
			int yy = temp.y;
						
			if(temp.obstacle==0)
			{
				nodes.add(temp);
			}
			else
			{
				temp = line.get(i-1);
				while(true)
				{
					Nodes l = temp.left;
					Nodes r = temp.right;
					Nodes pl = temp.pl;
					Nodes pr = temp.pr;
					Nodes nw = temp.nw;
					Nodes ne = temp.ne;
					Nodes sw = temp.sw;
					Nodes se = temp.se;
					if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(l.obstacle==0&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(r.obstacle==0&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pr.obstacle==0&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(pl.obstacle==0&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					
					xx = temp.x;
					yy = temp.y;
					nodes.add(temp);
					int exit = 0;
					int ii = 0;
										
					for(int j=i+1; j<line.size(); j++)
					{
						Nodes tempy = line.get(j);
						l = tempy.left;
						r = tempy.right;
						pl = tempy.pl;
						pr = tempy.pr;
						nw = tempy.nw;
						ne = tempy.ne;
						sw = tempy.sw;
						se = tempy.se;
						if(xx==tempy.x&&yy==tempy.y)
						{
							ii = j;
							exit = 1;
							break;
						}
						if(tempy.obstacle==1)
						{
							continue;
						}
						if(l!=null)
						{
							if(l.x==xx&&l.y==yy&&l.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(r!=null)
						{
							if(r.x==xx&&r.y==yy&&r.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(pl!=null)
						{
							if(pl.x==xx&&pl.y==yy&&pl.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(pr!=null)
						{
							if(pr.x==xx&&pr.y==yy&&pr.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(nw!=null)
						{
							if(nw.x==xx&&nw.y==yy&&nw.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(ne!=null)
						{
							if(ne.x==xx&&ne.y==yy&&ne.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(sw!=null)
						{
							if(sw.x==xx&&sw.y==yy&&sw.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
						if(se!=null)
						{
							if(se.x==xx&&se.y==yy&&se.obstacle==0)
							{
								ii = j;
								exit = 1;
								nodes.add(tempy);
								break;
							}
						}
					}
					
					if(exit==1)
					{
						i = ii;
						break;
					}
				}
			}
		}
	}
	
	public static void mline(Nodes start, Nodes goal)
	{
		int x = start.x;
		int y = start.y;
		int gx = goal.x;
		int gy = goal.y;
		Nodes temp = start;
		line.add(start);
		double small = 1000;
		double dis = 1001;
		while(!(x==gx&&y==gy))
		{
			Nodes temp2 = temp;
			Nodes l = temp.left;
			Nodes r = temp.right;
			Nodes pl = temp.pl;
			Nodes pr = temp.pr;
			Nodes nw = temp.nw;
			Nodes ne = temp.ne;
			Nodes sw = temp.sw;
			Nodes se = temp.se;
			
			int xx = 1000;
			int yy = 1000;
			
			if(l!=null)
			{
				xx = l.x;
				yy = l.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = l;
				}
			}
			
			if(r!=null)
			{
				xx = r.x;
				yy = r.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = r;
				}
			}
			
			if(pl!=null)
			{
				xx = pl.x;
				yy = pl.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = pl;
				}
			}
			
			if(pr!=null)
			{
				xx = pr.x;
				yy = pr.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = pr;
				}
			}
			
			if(nw!=null)
			{
				xx = nw.x;
				yy = nw.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = nw;
				}
			}
			
			if(ne!=null)
			{
				xx = ne.x;
				yy = ne.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = ne;
				}
			}
			
			if(sw!=null)
			{
				xx = sw.x;
				yy = sw.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = sw;
				}
			}
			
			if(se!=null)
			{
				xx = se.x;
				yy = se.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = se;
				}
			}
			line.add(temp);
			x = temp.x;
			y = temp.y;
		}
	}
	
	public static void plotBug(Graph graph)
	{
		for(int i=0; i<nodes.size(); i++)
		{
			Nodes temp = nodes.get(i);
			int x = temp.x;
			int y = temp.y;
			String index = Integer.toString(x)
					+"_"+Integer.toString(y);
			Node temp2 = graph.getNode(index);
			temp2.addAttribute("ui.style", "fill-color: red;");
			for(int j=i+1; j<nodes.size(); j++)
			{
				Nodes temp3 = nodes.get(j);
				String index2 = Integer.toString(temp3.x)
						+"_"+Integer.toString(temp3.y);
				try
				{
					Edge e = temp2.getEdgeBetween(index2);
					e.addAttribute("ui.style", "fill-color: red;");
				}
				catch(Exception e)
				{
					
				}
				break;
			}
			//System.out.println(x+", "+y);
		}
	}
	public static void bug1(Nodes start, Nodes goal)
	{
		int x = start.x;
		int y = start.y;
		int gx = goal.x;
		int gy = goal.y;
		Nodes temp = start;
		nodes.add(start);
		while(!(x==gx&&y==gy))
		{
			Nodes temp2 = temp;
			Nodes l = temp.left;
			Nodes r = temp.right;
			Nodes pl = temp.pl;
			Nodes pr = temp.pr;
			Nodes nw = temp.nw;
			Nodes ne = temp.ne;
			Nodes sw = temp.sw;
			Nodes se = temp.se;
			
			int xx = 1000;
			int yy = 1000;
			double small = 1000;
			double dis = 1001;
			if(l!=null)
			{
				xx = l.x;
				yy = l.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = l;
				}
			}
			
			if(r!=null)
			{
				xx = r.x;
				yy = r.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = r;
				}
			}
			
			if(pl!=null)
			{
				xx = pl.x;
				yy = pl.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = pl;
				}
			}
			
			if(pr!=null)
			{
				xx = pr.x;
				yy = pr.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = pr;
				}
			}
			
			if(nw!=null)
			{
				xx = nw.x;
				yy = nw.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = nw;
				}
			}
			
			if(ne!=null)
			{
				xx = ne.x;
				yy = ne.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = ne;
				}
			}
			
			if(sw!=null)
			{
				xx = sw.x;
				yy = sw.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = sw;
				}
			}
			
			if(se!=null)
			{
				xx = se.x;
				yy = se.y;
				dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				if(dis<small)
				{
					small = dis;
					temp = se;
				}
			}
			
			if(temp.obstacle==0)
			{
				nodes.add(temp);
			}
			else
			{
				ArrayList <Nodes> visited = new ArrayList<Nodes>();
				visited.add(temp2);
				if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
				{
					temp = se;
				}
				else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
				{
					temp = pr;
				}
				else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
				{
					temp = sw;
				}
				else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
				{
					temp = pl;
				}
				else if(l.obstacle==0&&nw.obstacle==1&&pl.obstacle==0)
				{
					temp = pl;
				}
				else if(l.obstacle==1&&nw.obstacle==0)
				{
					temp = nw;
				}
				else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
				{
					temp = sw;
				}
				else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
				{
					temp = pl;
				}
				else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
				{
					temp = nw;
				}
				else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
				{
					temp = l;
				}
				else if(r.obstacle==0&&ne.obstacle==1&&l.obstacle==0)
				{
					temp = l;
				}
				else if(r.obstacle==1&&ne.obstacle==0)
				{
					temp = ne;
				}
				else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
				{
					temp = nw;
				}
				else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
				{
					temp = l;
				}
				else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
				{
					temp = ne;
				}
				else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
				{
					temp = r;
				}
				else if(pr.obstacle==0&&se.obstacle==1&&r.obstacle==0)
				{
					temp = r;
				}
				else if(pr.obstacle==1&&se.obstacle==0)
				{
					temp = se;
				}
				else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
				{
					temp = ne;
				}
				else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
				{
					temp = r;
				}
				else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
				{
					temp = se;
				}
				else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
				{
					temp = pr;
				}
				else if(pl.obstacle==0&&sw.obstacle==1&&pr.obstacle==0)
				{
					temp = pr;
				}
				else if(pl.obstacle==1&&sw.obstacle==0)
				{
					temp = sw;
				}
				
				xx = temp.x;
				yy = temp.y;
				small = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
				Nodes smallest = temp;
				nodes.add(temp);
				int exit = 0;
				while(true)
				{
					visited.add(temp);
					l = temp.left;
					r = temp.right;
					pl = temp.pl;
					pr = temp.pr;
					nw = temp.nw;
					ne = temp.ne;
					sw = temp.sw;
					se = temp.se;
					if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					else if(l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(l.obstacle==0&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==1&&pl.obstacle==0)
					{
						temp = pl;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(r.obstacle==0&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==1&&nw.obstacle==0)
					{
						temp = nw;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==1&&l.obstacle==0)
					{
						temp = l;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pr.obstacle==0&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==1&&ne.obstacle==0)
					{
						temp = ne;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==1&&r.obstacle==0)
					{
						temp = r;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==1&&se.obstacle==0)
					{
						temp = se;
					}
					else if(pl.obstacle==1&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(pl.obstacle==0&&sw.obstacle==1&&pr.obstacle==0)
					{
						temp = pr;
					}
					else if(pl.obstacle==1&&sw.obstacle==0)
					{
						temp = sw;
					}
					
					xx = temp.x;
					yy = temp.y;
					dis = Math.sqrt((gx-xx)*(gx-xx)+(gy-yy)*(gy-yy));
					if(dis<small)
					{
						small = dis;
						smallest = temp;
					}
					nodes.add(temp);
					
					for(int i=0; i<visited.size(); i++)
					{
						Nodes tempy = visited.get(i);
						if(temp.x==tempy.x&&temp.y==tempy.y)
						{
							exit = 1;
							break;
						}
					}
					if(exit==1)
					{
						break;
					}
				}
				temp = smallest;
				nodes.add(temp);
			}
			x = temp.x;
			y = temp.y;
		}
	}
	
	public static void createTree()
	{
		root = new Nodes(0,0);
		list.add(root);
		for(int i=0; i<33; i++)
		{
			for(int j=0; j<33; j++)
			{
				if(i==0&&j==0)
				{
					continue;
				}
				Nodes n = new Nodes(i,j);
				list.add(n);
			}
		}
	}
	
	public static void addPaths(ArrayList<Nodes> list, int n)
	{
		for(int i=0; i<list.size(); i++)
		{
			Nodes temp = list.get(i);
			int x = temp.x;
			int y = temp.y;
			for(int j=0; j<obs.size()-1; j+=2)
			{
				int xx = obs.get(j);
				int yy = obs.get(j+1);
				if(x==xx&&y==yy)
				{
					temp.obstacle=1;
					break;
				}
			}
			if(x==n&&y==n)
			{
				continue;
			}
			if(temp.left==null)
			{
				if(y!=n)
				{
					for(int j=0; j<list.size(); j++)
					{
						Nodes temp2 = list.get(j);
						int xx = temp2.x;
						int yy = temp2.y;
						if(xx==x&&yy==(y+1))
						{
							temp.left=temp2;
							count++;
							break;
						}
					}
				}
			}
			if(temp.right==null)
			{
				if(x!=n)
				{
					for(int j=0; j<list.size(); j++)
					{
						Nodes temp2 = list.get(j);
						int xx = temp2.x;
						int yy = temp2.y;
						if(xx==(x+1)&&yy==y)
						{
							temp.right=temp2;
							count++;
							break;
						}
					}
				}
			}
			if(temp.pl==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==(x-1)&&yy==y)
					{
						temp.pl=temp2;
						count++;
						break;
					}
				}
			}
			if(temp.pr==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==x&&yy==(y-1))
					{
						temp.pr=temp2;
						count++;
						break;
					}
				}
			}
			if(temp.ne==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==(x+1)&&yy==(y+1))
					{
						temp.ne=temp2;
						count++;
						break;
					}
				}
			}
			if(temp.nw==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==(x-1)&&yy==(y+1))
					{
						temp.nw=temp2;
						count++;
						break;
					}
				}
			}
			if(temp.se==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==(x+1)&&yy==(y-1))
					{
						temp.se=temp2;
						count++;
						break;
					}
				}
			}
			if(temp.sw==null)
			{
				for(int j=0; j<list.size(); j++)
				{
					Nodes temp2 = list.get(j);
					int xx = temp2.x;
					int yy = temp2.y;
					if(xx==(x-1)&&yy==(y-1))
					{
						temp.sw=temp2;
						count++;
						break;
					}
				}
			}
		}
	}
}

class Nodes
{
	int x;
	int y;
	int visited;
	int obstacle;
	Nodes left;
	Nodes right;
	Nodes pl;
	Nodes pr;
	Nodes ne;
	Nodes nw;
	Nodes se;
	Nodes sw;
	Nodes(int xx, int yy)
	{
		x=xx;
		y=yy;
		visited=0;
		obstacle=0;
		left=null;
		right=null;
		pl=null;
		pr=null;
		ne=null;
		nw=null;
		se=null;
		sw=null;
	}
}
