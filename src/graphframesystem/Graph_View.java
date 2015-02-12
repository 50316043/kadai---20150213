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
	     

DefaultCategoryDataset data = new DefaultCategoryDataset();
    JFreeChart chart = 
      ChartFactory.createLineChart("ìåãûìsãÊïîÇÃåéä‘ïΩãœãCâ∑",
                                   "åé",
                                   "â∑ìx(Åé)",
                                   data,
                                   PlotOrientation.VERTICAL,
                                   true,
                                   false,
                                   false);

    ChartPanel cpanel = new ChartPanel(chart);
    add(cpanel, BorderLayout.CENTER);
  


   
    data.addValue(7, "H21","1");
    data.addValue(8, "H21", "2");
    data.addValue(10, "H21", "3");
    data.addValue(16, "H21", "4");
    data.addValue(21, "H21", "5");
    data.addValue(22, "H21", "6");
    data.addValue(26, "H21", "7");
    data.addValue(27, "H21", "8");
    data.addValue(23, "H21", "9");
    data.addValue(19, "H21", "10");
    data.addValue(13, "H21", "11");
    data.addValue(8, "H21", "12");
	    
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


