/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cv6;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class PanelStart extends javax.swing.JPanel {

    /**
     * Creates new form PanelStart
     */
    private ArrayList<Bod> body = null;

    public PanelStart() {
        initComponents();

    }

    private void generujBody(int pocet) {
        body = new ArrayList<>();
        for (int i = 0; i < pocet; i++) {
            int x = (int) (Math.random() * getWidth() + 1);
            int y = (int) (Math.random() * getHeight() + 1);
            body.add(new Bod(x, y));

        }
    }

    private void kresliBody(Graphics g) {
        // Graphics g = getGraphics();
        for (Bod bod : body) {
            kresliBod(bod, g);
        }
    }

//    private Point[] najdiNejblizsiTri(Point p) {
//        Point prvni;
//        Point druhy;
//        Point treti;
//
//        if (p.equals(body.get(0))) {
//            prvni = body.get(1);
//            druhy = body.get(2);
//            treti = body.get(3);
//        } else if (p.equals(body.get(1))) {
//            prvni = body.get(0);
//            druhy = body.get(2);
//            treti = body.get(3);
//        } else if (p.equals(body.get(2))) {
//            prvni = body.get(0);
//            druhy = body.get(1);
//            treti = body.get(3);
//        } else {
//            prvni = body.get(0);
//            druhy = body.get(1);
//            treti = body.get(2);
//        }
//
//        int prvniVzdalenost = Math.abs(p.x - prvni.x) + Math.abs(p.y - prvni.y);
//        int druhyVzdalenost = Math.abs(p.x - druhy.x) + Math.abs(p.y - druhy.y);
//        int tretiVzdalenost = Math.abs(p.x - treti.x) + Math.abs(p.y - treti.y);
//
//        for (int i = 0; i < body.size(); i++) {
//            {
//                Point point = body.get(i);
//                if (p.equals(point) || point.equals(prvni) || point.equals(druhy) || point.equals(treti)) {
//                    continue;
//                }
//                int vzdalenost = Math.abs(p.x - point.x) + Math.abs(p.y - point.y);
//                if (vzdalenost < prvniVzdalenost) {
//                    treti = druhy;
//                    tretiVzdalenost = druhyVzdalenost;
//                    druhy = prvni;
//                    druhyVzdalenost = prvniVzdalenost;
//                    prvni = point;
//                    prvniVzdalenost = vzdalenost;
//                } else if (vzdalenost < druhyVzdalenost) {
//                    treti = druhy;
//                    tretiVzdalenost = druhyVzdalenost;
//                    druhy = point;
//                    druhyVzdalenost = vzdalenost;
//                } else if (vzdalenost < tretiVzdalenost) {
//                    treti = point;
//                    tretiVzdalenost = vzdalenost;
//                }
//            }
//        }
//        Point pole[] = {prvni, druhy, treti};
//        return pole;
//    }
    private void kresliCaru(Bod pocatek, Bod konec, Graphics g) {
        int vzdalenost = Math.abs(pocatek.getX() - konec.getX()) + Math.abs(pocatek.getY() - konec.getY());
        int barvaC;
        if (vzdalenost <= 0) {
            return;
        }
        barvaC = vzdalenost;
        if (barvaC >= 255) {
            return;
        }

        Color barva = new Color(255 - barvaC, 255 - barvaC, 255 - barvaC);
        //System.out.println(barva);

        //g.setColor(barva);
        // System.out.println(g.getColor());
        // g.drawLine(pocatek.getX(), pocatek.getY(), konec.getX(), konec.getY());
        Graphics2D g2d = (Graphics2D) g;
        Composite originalComposite = g2d.getComposite();
        g2d.setPaint(barva);
        g2d.setComposite(makeComposite((float) 0.5));
        g2d.drawLine(pocatek.getX(), pocatek.getY(), konec.getX(), konec.getY());
        g2d.setComposite(originalComposite);
    }

    private void kresliBod(Bod bod, Graphics g) {
        int velikost = Integer.valueOf(jSpinner2.getValue().toString());
        int krok = bod.getJas() / velikost;

        for (int i = velikost; i >= 0; i--) {
            int jas = bod.getJas() - i * krok;
            if (jas <= 0) {
                continue;
            }
            g.setColor(new Color(jas, jas, jas));

            g.fillOval(bod.getX() - i, bod.getY() - i, i * 2, i * 2);
        }
//        g.setColor(new Color(100, 100, 100));
//        g.fillOval(bod.getX() - 6, bod.getY() - 6, 12, 12);
//
//        g.setColor(new Color(200, 200, 200));
//        g.fillOval(bod.getX() - 4, bod.getY() - 4, 8, 8);
//
//        g.setColor(Color.white);
//        //g.fillOval(point.x, point.y, 5, 5);
//        g.fillOval(bod.getX() - 2, bod.getY() - 2, 4, 4);
    }

    private AlphaComposite makeComposite(float alpha) {
        int type = AlphaComposite.SRC_OVER;
        return (AlphaComposite.getInstance(type, alpha));
    }

    private void drawSquares(Graphics2D g2d, float alpha) {
        Composite originalComposite = g2d.getComposite();
        g2d.setPaint(Color.blue);
        g2d.setComposite(makeComposite(alpha));
        g2d.fillOval(40, 40, 80, 80);
        g2d.setComposite(originalComposite);
    }

    private void kresliCary(Graphics g) {
        //g.setColor(new Color(0, 0, 0));
        //g.setColor(Color.white);
//        for (Bod bod : body) {
//            Point[] nej = najdiNejblizsiTri(point);
//            for (Point nejP : nej) {
//                //g.drawLine(point.x, point.y, nejP.x, nejP.y);
//                kresliCaru(point, nejP, g);
//            }
//        }
        for (int i = 0; i < body.size(); i++) {
            for (int j = i + 1; j < body.size(); j++) {
                kresliCaru(body.get(i), body.get(j), g);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if (body == null) {
            generujBody((Integer) jSpinner1.getValue());
            kresliCary(g);
            kresliBody(g);
            //drawSquares((Graphics2D) g, (float) 0.5);
        } else {
            kresliCary(g);
            kresliBody(g);
            //drawSquares((Graphics2D) g, (float) 0.5);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jToggleButton1.setText("Pohyb");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Generuj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bodu:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(10), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generujBody((Integer) jSpinner1.getValue());
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Thread one;
        
        one = new Thread() {
            public void run() {
                try {
                    while (jToggleButton1.isSelected()) {
                        for (int i = 0; i < body.size(); i++) {
                            body.get(i).krok();
                        }
                        repaint();
                        Thread.sleep(100);
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(PanelStart.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        one.start();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2StateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

class Bod {

    private int smer;
    private double rychlost;
    private int vzdalenost;
    private double x;
    private double y;
    private double posunX;
    private double posunY;
    private int jas;

    public Bod(int x, int y) {
        novyPohyb();
        this.x = x;
        this.y = y;
        this.jas = (int) (Math.random() * 105 + 151);

    }

    private void novyPohyb() {
        this.smer = (int) (Math.random() * 9);
        this.rychlost = (Math.random() * 101) / 100;
        this.vzdalenost = (int) (Math.random() * 101);
        this.posunX = Math.random() * 3;
        this.posunY = Math.random() * 3;
    }

    public void krok() {
        vzdalenost--;
        if (vzdalenost < 0) {
            novyPohyb();
        }
        Point vrat = null;
        double krokX = rychlost * posunX;
        double krokY = rychlost * posunY;
        switch (smer) {
            case 1:
                x += krokX;
                break;
            case 2:
                x += krokX;
                y += krokY;
                break;
            case 3:
                y += krokY;
                break;
            case 4:
                x -= krokX;
                y += krokY;
                break;
            case 5:
                x -= krokX;
                break;
            case 6:
                x -= krokX;
                y -= krokY;
                break;
            case 7:
                y += krokY;
                break;
            case 8:
                x += krokX;
                y -= krokY;
                break;
        }
    }

    public int getX() {
        return (int) Math.round(x);
    }

    public int getY() {
        return (int) Math.round(y);
    }

    public int getJas() {
        return jas;
    }

}
