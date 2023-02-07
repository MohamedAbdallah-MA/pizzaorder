/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

/**
 *
 * @author moham
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Menu = new javax.swing.JLabel();
        mozarella_button = new javax.swing.JButton();
        meat_button = new javax.swing.JButton();
        pepperoni_button = new javax.swing.JButton();
        kebab_button = new javax.swing.JButton();
        vegan_button = new javax.swing.JButton();
        tomato_button = new javax.swing.JButton();
        menu_label = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        dmozarella = new javax.swing.JButton();
        dmeat = new javax.swing.JButton();
        dpepperoni = new javax.swing.JButton();
        dkabab = new javax.swing.JButton();
        dvegan = new javax.swing.JButton();
        dtomatoo = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1010, 445));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorder/pizza-menu-template.png"))); // NOI18N
        panel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        mozarella_button.setText("mozarella");
        mozarella_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mozarella_buttonActionPerformed(evt);
            }
        });

        meat_button.setText("meat");
        meat_button.setMaximumSize(new java.awt.Dimension(89, 25));
        meat_button.setMinimumSize(new java.awt.Dimension(89, 25));
        meat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meat_buttonActionPerformed(evt);
            }
        });

        pepperoni_button.setText("pepperoni");
        pepperoni_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepperoni_buttonActionPerformed(evt);
            }
        });

        kebab_button.setText("kebab");
        kebab_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kebab_buttonActionPerformed(evt);
            }
        });

        vegan_button.setText("vegan");
        vegan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegan_buttonActionPerformed(evt);
            }
        });

        tomato_button.setText("tomato");
        tomato_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomato_buttonActionPerformed(evt);
            }
        });

        next_button.setText("next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        dmozarella.setText("delete one");
        dmozarella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmozarellaActionPerformed(evt);
            }
        });

        dmeat.setText("delete one");
        dmeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmeatActionPerformed(evt);
            }
        });

        dpepperoni.setText("delete one");
        dpepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpepperoniActionPerformed(evt);
            }
        });

        dkabab.setText("delete one");
        dkabab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dkababActionPerformed(evt);
            }
        });

        dvegan.setText("delete one");
        dvegan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dveganActionPerformed(evt);
            }
        });

        dtomatoo.setText("delete one");
        dtomatoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtomatooActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tomato_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pepperoni_button)
                            .addComponent(kebab_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mozarella_button)
                            .addComponent(meat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vegan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dmozarella)
                            .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dmeat)
                            .addComponent(dpepperoni)
                            .addComponent(dkabab)
                            .addComponent(dvegan)
                            .addComponent(dtomatoo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(menu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mozarella_button)
                    .addComponent(dmozarella))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meat_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dmeat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepperoni_button)
                    .addComponent(dpepperoni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kebab_button)
                    .addComponent(dkabab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomato_button)
                    .addComponent(dvegan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegan_button)
                    .addComponent(dtomatoo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next_button)
                    .addComponent(back))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
place_order po = new place_order() ;
    
    private void mozarella_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mozarella_buttonActionPerformed
        
        po.arr[0] += 1 ;
        menu_label.setText(po.arr[0] + " mozarella pizza added");
    }//GEN-LAST:event_mozarella_buttonActionPerformed

    private void meat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meat_buttonActionPerformed
        po.arr[1] += 1;
        menu_label.setText(po.arr[1] + " meat pizza added");
    }//GEN-LAST:event_meat_buttonActionPerformed

    private void pepperoni_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepperoni_buttonActionPerformed
        po.arr[2] += 1;
        menu_label.setText(po.arr[2] + " pepperoni pizza added");
    }//GEN-LAST:event_pepperoni_buttonActionPerformed

    private void kebab_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kebab_buttonActionPerformed
        po.arr[3] += 1;
        menu_label.setText(po.arr[3] + " kebab pizza added");
    }//GEN-LAST:event_kebab_buttonActionPerformed

    private void vegan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegan_buttonActionPerformed
        po.arr[4] += 1;
        menu_label.setText(po.arr[4] + " vegan pizza added");
    }//GEN-LAST:event_vegan_buttonActionPerformed

    private void tomato_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomato_buttonActionPerformed
        po.arr[5] += 1;
        menu_label.setText(po.arr[5] + " tomato pizza added");
    }//GEN-LAST:event_tomato_buttonActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        this.dispose();
        personal_details pd = new personal_details() ;
        pd.setVisible(true);
    }//GEN-LAST:event_next_buttonActionPerformed

    private void dmozarellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmozarellaActionPerformed
        if ( po.arr[0] != 0 )
        {
        po.arr[0] -= 1 ;
        menu_label.setText( " one mozarella pizza deleted remain " + po.arr[0]);
        }
        else
            menu_label.setText(" no mozarella pizza remain");
    }//GEN-LAST:event_dmozarellaActionPerformed

    private void dmeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmeatActionPerformed
        if ( po.arr[1] != 0 )
        {
        po.arr[1] -= 1 ;
        menu_label.setText( " one meat pizza deleted remain " + po.arr[1]);
        }
        else
            menu_label.setText(" no meat pizza remain");
    }//GEN-LAST:event_dmeatActionPerformed

    private void dpepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpepperoniActionPerformed
        if ( po.arr[2] != 0 )
        {
        po.arr[2] -= 1 ;
        menu_label.setText( " one pepperoni pizza deleted remain " + po.arr[2]);
        }
        else
            menu_label.setText(" no pepperoni pizza remain");
    }//GEN-LAST:event_dpepperoniActionPerformed

    private void dkababActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dkababActionPerformed
        if ( po.arr[3] != 0 )
        {
        po.arr[3] -= 1 ;
        menu_label.setText( " one kabab pizza deleted remain " + po.arr[3]);
        }
        else
            menu_label.setText(" no kabab pizza remain");
    }//GEN-LAST:event_dkababActionPerformed

    private void dveganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dveganActionPerformed
        if ( po.arr[4] != 0 )
        {
        po.arr[4] -= 1 ;
        menu_label.setText( " one vegan pizza deleted remain " + po.arr[4]);
        }
        else
            menu_label.setText(" no vegan pizza remain");
    }//GEN-LAST:event_dveganActionPerformed

    private void dtomatooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtomatooActionPerformed
       if ( po.arr[5] != 0 )
        {
        po.arr[5] -= 1 ;
        menu_label.setText( " one tomato pizza deleted remain " + po.arr[5]);
        }
        else
            menu_label.setText(" no tomato pizza remain");
    }//GEN-LAST:event_dtomatooActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.dispose();
       welcome w = new welcome() ;
       w.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JButton back;
    private javax.swing.JButton dkabab;
    private javax.swing.JButton dmeat;
    private javax.swing.JButton dmozarella;
    private javax.swing.JButton dpepperoni;
    private javax.swing.JButton dtomatoo;
    private javax.swing.JButton dvegan;
    private javax.swing.JButton kebab_button;
    private javax.swing.JButton meat_button;
    private javax.swing.JLabel menu_label;
    private javax.swing.JButton mozarella_button;
    private javax.swing.JButton next_button;
    private java.awt.Panel panel1;
    private javax.swing.JButton pepperoni_button;
    private javax.swing.JButton tomato_button;
    private javax.swing.JButton vegan_button;
    // End of variables declaration//GEN-END:variables
}
