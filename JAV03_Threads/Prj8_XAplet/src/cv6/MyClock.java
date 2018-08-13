/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Oldřich
 */
public class MyClock extends JApplet implements Runnable {

    private JLabel nadpis = new JLabel();
    private JLabel timeDisplay = new JLabel();

    private DateFormat timeFormat;
    private Thread timer;
    volatile boolean running;

    public MyClock() throws HeadlessException {
    }

    private void jbInit() {
        this.getContentPane().setLayout(null);
        this.setSize(317, 173);
        nadpis.setText("moje hodiny");
        nadpis.setBounds(50, 10, 235, 35);
        timeDisplay.setText("Jlabel");
        timeDisplay.setBounds(75, 55, 180, 50);
        timeDisplay.setFont(new Font("Arial Unicode MS", 1, 36));

        timeDisplay.setForeground(new Color(0, 0, 165));
        timeDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        this.getContentPane().add(timeDisplay, null);
        this.getContentPane().add(nadpis, null);
        timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    }

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        jbInit();
    }

    // TODO overwrite start(), stop() and destroy() methods
    public static void main(String[] args) {
        MyClock applet = new MyClock();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setTitle("Applet Clock");
        applet.init();
        applet.start();
        frame.setSize(320, 170);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        frame.setLocation((d.width - frameSize.width) / 2, (d.height - frameSize.height) / 2);
        frame.setVisible(true);
    }

    @Override
    public void start() {
        running = true;
        if (timer == null) {
            timer = new Thread(this);
            timer.start();
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    @Override
    public String getAppletInfo() {
        return "Clock applet  2014";
    }

    @Override
    public void run() {
        while (running) {
            timeDisplay.setText(timeFormat.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        timer = null;
    }
}
