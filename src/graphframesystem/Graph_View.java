package graphframesystem;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Graph_View extends Frame implements ActionListener,WindowListener{
		
		
		public Graph_View() {
			// TODO Auto-generated constructor stub
		  addWindowListener(this);
		  setTitle("FrameSystem");
	      ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
		  setLayout(new FlowLayout(FlowLayout.CENTER));
	     
		  
		  int  temperature;
          String month;
	      ResultSet rs;
	      
	      DefaultCategoryDataset data = new DefaultCategoryDataset();
	      
	      MySQL mysql = new MySQL();

	      rs = mysql.selectAll();        
	           try {
	                while(rs.next()){
	                
	                      month = rs.getString("month");
	                      temperature = rs.getInt("temperature");
	                      
	                      data.addValue(temperature, "H21",month);
	                } 
	                } catch (SQLException e1) {
	    					// TODO Auto-generated catch block
	    					e1.printStackTrace();
	    			}                    

		  
		  JFreeChart chart = 
				  ChartFactory.createLineChart("�����s�敔�̌��ԕ��ϋC��",
                                   "��",
                                   "���x(��)",
                                   data,
                                   PlotOrientation.VERTICAL,
                                   true,
                                   false,
                                   false);

		  ChartPanel cpanel = new ChartPanel(chart);
		  add(cpanel, BorderLayout.CENTER);
  


   
 
   
	    
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

	   
	    
		}
		
		
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
	    
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

}


