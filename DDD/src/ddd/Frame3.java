package ddd;

import java.util.ArrayList;

public class Frame3 extends javax.swing.JFrame {

    ArrayList<Item> shoppingBasket = new ArrayList<>();
    private Player player;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame3.class.getName());

    public Frame3(Player p) {
        initComponents();
        this.player = p;
        jLabel3.setText("MONEY: " + player.getMoney());
    }
    private boolean tryBuy(Item item) {
        if (player.getMoney() >= item.getPrice()) {
            player.setMoney(player.getMoney() - item.getPrice());
            shoppingBasket.add(item); 
            jLabel3.setText("MONEY: " + player.getMoney());
            jLabel2.setText(item.getName() + " has been added to the cart.");
            return true;
        } else {
            jLabel2.setText("Not enough money!");
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(30, 30, 30));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("200");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 160, 30));

        jButton3.setBackground(new java.awt.Color(30, 30, 30));
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("400");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 160, 30));

        jButton4.setBackground(new java.awt.Color(30, 30, 30));
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("1000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 160, 30));

        jButton5.setBackground(new java.awt.Color(30, 30, 30));
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setText("300");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 160, 30));

        jButton6.setBackground(new java.awt.Color(30, 30, 30));
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("300");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 160, 30));

        jButton7.setBackground(new java.awt.Color(30, 30, 30));
        jButton7.setForeground(new java.awt.Color(255, 255, 0));
        jButton7.setText("300");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 160, 30));

        jButton8.setBackground(new java.awt.Color(30, 30, 30));
        jButton8.setForeground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Exit and add to inventory");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 190, 30));

        jLabel2.setBackground(new java.awt.Color(30, 30, 30));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 360, 30));

        jLabel3.setBackground(new java.awt.Color(30, 30, 30));
        jLabel3.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("MONEY: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/ShopNho.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tryBuy(new Weapon(200, "Wooden Sword", 10));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tryBuy(new Weapon(400, "Iron Sword", 20));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         tryBuy(new Weapon(1000, "Enchanted Sword", 30));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tryBuy(new Armor(300, "Armor", 10));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tryBuy(new Armor(300, "Helmet", 10));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tryBuy(new Armor(300, "Pant", 10));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        for (Item item : shoppingBasket) {
            player.inventory.add(item);
        }
        shoppingBasket.clear(); 

        javax.swing.JOptionPane.showMessageDialog(this, "Items added to your inventory!");

        
        Frame f = new Frame();
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
