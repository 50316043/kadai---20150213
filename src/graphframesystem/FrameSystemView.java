package graphframesystem;

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


public class FrameSystemView extends Frame implements ActionListener,WindowListener{

	private TextArea text1 = new TextArea("",15,25);
	private Button button1 = new Button("出力");
	private Button button2 = new Button("グラフ");
	
	
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
	  addWindowListener(this);
	  setTitle("FrameSystem");
	  setLayout(new FlowLayout(FlowLayout.CENTER));

    
	  add(button1);
	  add(text1);
	  add(button2);
        
	  button1.addActionListener(this);
	  button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

     if(e.getSource() == button1){
    	 int month, temperature;

         ResultSet rs;
    	
         MySQL mysql = new MySQL();

         rs = mysql.selectAll();        
           try {
                while(rs.next()){
                
                      month = rs.getInt("month");
                      temperature = rs.getInt("temperature");
                      text1.append("月：" + month);
                      text1.append("\n");
                      text1.append("温度：" + temperature);
                      text1.append("\n");
                      text1.append("------------");
                      text1.append("\n");
                } 
                } catch (SQLException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    			}                    
                  //try catchで囲む
    	
     		}
     else if(e.getSource() == button2){
    	 Graph_View graph = new Graph_View();
         graph.setBounds(5,5,655,455);
         graph.setVisible(true);
     }
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
