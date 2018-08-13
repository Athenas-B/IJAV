/*
 *      Testovat funkci lze i na jednom programu, ale
 *      
 *      radÏji spusùte program 2x - jeden je server a druh˝ klient
 *      (je to bez vl·ken)
 * 
 */
package netik;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemoClientServerGUI extends JFrame implements Runnable{
	public JTextField serverstatusinfo;
	public JTextField clientstatusinfo;
	public JTextArea textarray;
	
	public DemoClientServerGUI(){
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});

		this.setSize(250, 300);
		this.setLocation(50, 50);
		this.setTitle("Server - Client");
		
		Container cont = new Container();
		cont = getContentPane();
		
		FlowLayout layout = new FlowLayout();
		cont.setLayout(layout);
		
		JButton startserverbutton = new JButton("  Run Server  ");
		startserverbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				runserver();
			}
		});
		
		JButton startclientbutton = new JButton("  Run Client  ");
		startclientbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				runclient();
			}
		});
		
		JLabel serverstatus = new JLabel("Server Status:  ");
		this.serverstatusinfo = new JTextField(" stop                     ");
		serverstatusinfo.setEnabled(false);
		
		JLabel clientstatus = new JLabel("Client Status:  ");
		this.clientstatusinfo = new JTextField(" stop                     ");
		clientstatusinfo.setEnabled(false);
		
		JLabel aboutd = new JLabel("    P¯ijat· data     ");
		textarray = new JTextArea(5,20);
		this.textarray.setLineWrap(true );
		
		cont.add(startserverbutton );
		cont.add(startclientbutton);
		cont.add( serverstatus );
		cont.add(serverstatusinfo);
		cont.add( clientstatus );
		cont.add(clientstatusinfo);
		cont.add(aboutd);
		cont.add(this.textarray);
		this.setVisible(true );
	}
	
	public void runserver(){
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		this.serverstatusinfo.setText("Server is running");
		Server s = new Server(this);
	}
	
	public void runclient(){
		this.serverstatusinfo.setText("Client is running");
		Client c = new Client();
		this.clientstatusinfo.setText("Data sent, Client exiting!");
	}
	
	public void addintoarea( String text ){
		this.textarray.setText( this.textarray.getText() + text );
	}
	
	public static void main(String[] args) {
			new DemoClientServerGUI();
	}
}
