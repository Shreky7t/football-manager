/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlayerProfilePanel.java
 *
 * Created on 23-Nov-2009, 23:34:08
 */

package ie.tippinst.jod.fm.gui.panels;

import java.util.List;

import ie.tippinst.jod.fm.app.Game;

/**
 *
 * @author Joseph
 */
public class PlayerProfilePanel extends javax.swing.JPanel {

    /** Creates new form PlayerProfilePanel */
    public PlayerProfilePanel(String player) {
    	game = Game.getInstance();
        initComponents();
        List<String> list = game.getPlayerProfileInfo(player);
    	jLabel6.setText(list.get(0));
    	jLabel7.setText(list.get(1));
    	jLabel20.setText(list.get(2));
    	jLabel8.setText(list.get(3));
    	jLabel21.setText(list.get(4));
    	jLabel9.setText(list.get(5));
    	jLabel22.setText(list.get(6));
    	jLabel12.setText(list.get(7));
    	jLabel13.setText(list.get(8));
    	jLabel24.setText(list.get(9));
    	jLabel10.setText(list.get(10));
    	jLabel23.setText(list.get(11));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

    	 jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
         jLabel5 = new javax.swing.JLabel();
         jLabel6 = new javax.swing.JLabel();
         jLabel7 = new javax.swing.JLabel();
         jLabel8 = new javax.swing.JLabel();
         jLabel9 = new javax.swing.JLabel();
         jLabel10 = new javax.swing.JLabel();
         jLabel11 = new javax.swing.JLabel();
         jLabel12 = new javax.swing.JLabel();
         jLabel13 = new javax.swing.JLabel();
         jLabel14 = new javax.swing.JLabel();
         jLabel15 = new javax.swing.JLabel();
         jLabel16 = new javax.swing.JLabel();
         jLabel17 = new javax.swing.JLabel();
         jLabel18 = new javax.swing.JLabel();
         jLabel19 = new javax.swing.JLabel();
         jLabel20 = new javax.swing.JLabel();
         jLabel21 = new javax.swing.JLabel();
         jLabel22 = new javax.swing.JLabel();
         jLabel23 = new javax.swing.JLabel();
         jLabel24 = new javax.swing.JLabel();

         jLabel1.setText("Name:");

         jLabel2.setText("Age:");

         jLabel19.setText("Date of Birth:");

         jLabel3.setText("Nationality:");

         jLabel18.setText("Reputation:");

         jLabel4.setText("Position:");

         jLabel17.setText("Foot:");

         jLabel11.setText("Morale:");

         jLabel14.setText("Injury:");

         jLabel15.setText("Condition:");

         jLabel5.setText("Fatigue:");

         jLabel16.setText("Fitness:");

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
         this.setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(30, 30, 30)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2)
                     .addComponent(jLabel19)
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jLabel18)
                             .addComponent(jLabel4)
                             .addComponent(jLabel17)
                             .addComponent(jLabel3))
                         .addGap(56, 56, 56)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jLabel8)
                             .addComponent(jLabel22)
                             .addComponent(jLabel9)
                             .addComponent(jLabel21)
                             .addComponent(jLabel20)
                             .addComponent(jLabel7)
                             .addComponent(jLabel6))))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel15)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel14)
                                 .addComponent(jLabel11))
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                 .addComponent(jLabel13)
                                 .addComponent(jLabel12)
                                 .addComponent(jLabel24)))
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel5)
                                 .addComponent(jLabel16))
                             .addGap(67, 67, 67)
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel23)
                                 .addComponent(jLabel10)))))
                 .addGap(36, 36, 36))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(56, 56, 56)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel1)
                             .addComponent(jLabel6)
                             .addComponent(jLabel11))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel2)
                             .addComponent(jLabel7))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel19)
                             .addComponent(jLabel20))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel3)
                             .addComponent(jLabel8))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel18)
                             .addComponent(jLabel21))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel4)
                             .addComponent(jLabel9))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel17)
                             .addComponent(jLabel22)))
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                             .addGroup(layout.createSequentialGroup()
                                 .addComponent(jLabel12)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(jLabel13))
                             .addComponent(jLabel14))
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(layout.createSequentialGroup()
                                 .addGap(25, 25, 25)
                                 .addComponent(jLabel10))
                             .addGroup(layout.createSequentialGroup()
                                 .addGap(6, 6, 6)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                     .addComponent(jLabel15)
                                     .addComponent(jLabel24))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(jLabel5)))
                         .addGap(6, 6, 6)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jLabel23)
                             .addComponent(jLabel16))))
                 .addContainerGap(110, Short.MAX_VALUE))
         );
     }// </editor-fold>


     // Variables declaration - do not modify
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel10;
     private javax.swing.JLabel jLabel11;
     private javax.swing.JLabel jLabel12;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JLabel jLabel13;
     private javax.swing.JLabel jLabel14;
     private javax.swing.JLabel jLabel15;
     private javax.swing.JLabel jLabel16;
     private javax.swing.JLabel jLabel17;
     private javax.swing.JLabel jLabel18;
     private javax.swing.JLabel jLabel19;
     private javax.swing.JLabel jLabel20;
     private javax.swing.JLabel jLabel21;
     private javax.swing.JLabel jLabel22;
     private javax.swing.JLabel jLabel23;
     private javax.swing.JLabel jLabel24;
     private Game game;
     private String player;
     // End of variables declaration

}
