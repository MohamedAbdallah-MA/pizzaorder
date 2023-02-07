/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;

class order {
    String phone ;
    String name ;
    String email ;
    String region ;
    String location ;
     public order next ;
    public order( String phone , String name , String email , String region , String location)
    {
        this.phone = phone ;
        this.name = name ;
        this.email = email ;
        this.region = region ;
        this.location = location ;
    }
}

public class personal_details extends javax.swing.JFrame {

    public personal_details() {
        initComponents();
    }

    static int  d ;
    static class ListNode {
        int vertex, weight;
        ListNode(int v, int w) {
            vertex = v;
            weight = w;
        }
        int getVertex() {
            return vertex;
        }
        int getWeight() {
            return weight;
        }
    }

    

    public static int[] dijkstra(int V, ArrayList<ArrayList<ListNode>> graph,int src) {
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new ListNode(src, 0));

        while (pq.size() > 0) {
            ListNode current = pq.poll();
            for (ListNode n : graph.get(current.getVertex())) {
                if (distance[current.getVertex()] + n.getWeight() < distance[n.getVertex()]) {
                    distance[n.getVertex()] = n.getWeight() + distance[current.getVertex()];
                    pq.add(new ListNode(n.getVertex(),distance[n.getVertex()]));
                }
            }
        }
        return distance;
    }
    
    public static void insertindijksta ( String location)
    {
        int V = 9;
        ArrayList<ArrayList<ListNode>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        int source = 0;
        graph.get(0).add(new ListNode(1, 4));
        graph.get(0).add(new ListNode(7, 8));
        graph.get(1).add(new ListNode(2, 8));
        graph.get(1).add(new ListNode(7, 11));
        graph.get(1).add(new ListNode(0, 7));
        graph.get(2).add(new ListNode(1, 8));
        graph.get(2).add(new ListNode(3, 7));
        graph.get(2).add(new ListNode(8, 2));
        graph.get(2).add(new ListNode(5, 4));
        graph.get(3).add(new ListNode(2, 7));
        graph.get(3).add(new ListNode(4, 9));
        graph.get(3).add(new ListNode(5, 14));
        graph.get(4).add(new ListNode(3, 9));
        graph.get(4).add(new ListNode(5, 10));
        graph.get(5).add(new ListNode(4, 10));
        graph.get(5).add(new ListNode(6, 2));
        graph.get(6).add(new ListNode(5, 2));
        graph.get(6).add(new ListNode(7, 1));
        graph.get(6).add(new ListNode(8, 6));
        graph.get(7).add(new ListNode(0, 8));
        graph.get(7).add(new ListNode(1, 11));
        graph.get(7).add(new ListNode(6, 1));
        graph.get(7).add(new ListNode(8, 7));
        graph.get(8).add(new ListNode(2, 2));
        graph.get(8).add(new ListNode(6, 6));
        graph.get(8).add(new ListNode(7, 1));

        int[] distance = dijkstra(V, graph, source);
        
        if ( location.equals("1") || location.equals("maadi")  )
           d = distance[1] ;
        else if ( location.equals("2") || location.equals("shobra") )
           d = distance[2] ;
        else if ( location.equals("3") || location.equals("nasr city") )
           d = distance[3] ;
        else if ( location.equals("4") || location.equals("giza") )
           d = distance[4] ;
        else if ( location.equals("5") || location.equals("zamalek") )
           d = distance[5] ;
        else if ( location.equals("6") || location.equals("zaid") )
           d = distance[6] ;
        else if ( location.equals("7") || location.equals("sakr") )
           d = distance[7] ;
        else if ( location.equals("8") || location.equals("cairo") )
           d = distance[8] ;
        
        
    }
    
    public static order head ;
    
    public void add_information ( String phone , String name , String email , String region , String location )
    {
        order newinfo = new order( phone ,  name ,  email ,  region ,  location ) ;
        if ( head == null )
        {
            head = newinfo ;
            newinfo.next = null ;
        }
        else
        {
            newinfo.next = head ;
            head = newinfo ;
        }
    }
    order c   ;
    public void search ( String phone )
    {
        add_information("01123456789", "mohamed" , "mohamed@gmail.com" , "maadi" , "1");
        add_information("01123456798", "essam" , "essam@mail.com" , "sakr korish", "2");
        add_information("01123456788", "omar" , "omar@gmail.com" , "mokatam" , "3");
        add_information("01123456787", "marwan", "marwan@gmail.com", "6 October", "4");
         order current = head ;
        //System.out.println( current.phone);
        while ( current != null )
        {
         
            if ( phone.equals(current.phone)  )
            {
                namef.setText(current.name);
                emailf.setText(current.email);
                regionf.setText(current.region);
                locationf.setText(current.location);
                //c = current ;
                return ;
            }
           
            
            current = current.next ;
        }
        JOptionPane.showMessageDialog(null,"new customer ! please enter your data");
        System.out.println(" not found");
    }
    public void view ()
    {
        order current = head ;
        while ( current != null )
        {
            System.out.println(current.phone);
            current = current.next ;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phone_label = new javax.swing.JLabel();
        phonef = new javax.swing.JTextField();
        apply_button = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        emailf = new javax.swing.JTextField();
        region_label = new javax.swing.JLabel();
        regionf = new javax.swing.JTextField();
        location_label = new javax.swing.JLabel();
        locationf = new javax.swing.JTextField();
        check_out = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        phone_label.setText("Phone");

        apply_button.setText("Apply");
        apply_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apply_buttonActionPerformed(evt);
            }
        });

        name_label.setText("Name");

        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });

        email_label.setText("E-mail");

        region_label.setText("region");

        location_label.setText("Location");

        check_out.setText("check out");
        check_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_outActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(location_label, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(region_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phonef)
                    .addComponent(namef)
                    .addComponent(emailf)
                    .addComponent(regionf)
                    .addComponent(locationf, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(apply_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(check_out, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apply_button))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(region_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regionf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_out))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apply_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_buttonActionPerformed
       search( phonef.getText() ) ;
        
    }//GEN-LAST:event_apply_buttonActionPerformed

    private void check_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_outActionPerformed
        add_information(phonef.getText(), namef.getText(), emailf.getText(), regionf.getText(), locationf.getText());
        insertindijksta(head.location);
        Menu m = new Menu () ;
        
        this.dispose();
        place_order po = new place_order() ;
        po.setVisible(true);
        po.cname.setText(head.name);
        po.cemail.setText(head.email);
        po.clocation.setText(head.location);
        po.cphone.setText(head.phone);
        po.cregion.setText(head.region);
        po.fill();
        po.shipping.setText(  ""+ (d) + " $");
        po.delivery.setText("" + (d *3) + " Minutes" );
        po.total.setText( "" + (po.tot + d)+" $");
        
    }//GEN-LAST:event_check_outActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        Menu m = new Menu() ;
        m.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

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
            java.util.logging.Logger.getLogger(personal_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personal_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personal_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personal_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        personal_details pd = new personal_details() ;
        
       /* pd.add_information("01123456789", "mohamed" , "mohamed@gmail.com" , "maadi" , "1");
        pd.add_information("01123456798", "essam" , "essam@mail.com" , "sakr korish", "2");
        pd.add_information("01123456788", "omar" , "omar@gmail.com" , "mokatam" , "3");
        pd.add_information("01123456787", "marwan", "marwan@gmail.com", "6 October", "4");*/
        
        //pd.view();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personal_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply_button;
    private javax.swing.JButton back;
    private javax.swing.JButton check_out;
    private javax.swing.JLabel email_label;
    private static javax.swing.JTextField emailf;
    private javax.swing.JLabel location_label;
    private static javax.swing.JTextField locationf;
    private javax.swing.JLabel name_label;
    private static javax.swing.JTextField namef;
    private javax.swing.JLabel phone_label;
    private static javax.swing.JTextField phonef;
    private javax.swing.JLabel region_label;
    private static javax.swing.JTextField regionf;
    // End of variables declaration//GEN-END:variables
}
