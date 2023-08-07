package busTicket;

import java.awt.GridLayout;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class NewBooking extends javax.swing.JInternalFrame {
int index;
    public NewBooking(String u) {
        initComponents();
        jLabel2.setText(u);
        Connection  conn;
                        Statement stt;
                        ResultSet rss;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/ticketresrv","root","");
                            String ss;
                            stt=conn.createStatement();
                            ss="select * from booking where username='"+jLabel2.getText()+"'";
                            rss=stt.executeQuery(ss);
                            DefaultTableModel model2=(DefaultTableModel) jTable6.getModel();
                            while(rss.next())
                            {
                                model2.addRow(new Object[]{rss.getString(2),rss.getString(5),rss.getString(1),rss.getString(3),rss.getString(4)});
                            }
                        }
                        catch(Exception  e)
                        {
                            System.out.println(e);
                        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 146, 26));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(810, 350));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Source");

        cb1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Mumbai", "Pune", "Nashik", "Ahmednagar" }));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Destination");

        cb2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Mumbai", "Pune", "Nashik", "Ahmednagar" }));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Search Result");

        jTable6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Bus No.", "Paid (Rs.)", "Seats", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setGridColor(new java.awt.Color(0, 102, 204));
        jScrollPane6.setViewportView(jTable6);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Booking details");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus No.", "Source", "Destination", "Time", "Price (Rs.)", "Seats"
            }
        ));
        jTable4.setGridColor(new java.awt.Color(0, 102, 204));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.setBackground(new java.awt.Color(160, 190, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Booking ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(159, 159, 159))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel model0=(DefaultTableModel) jTable4.getModel();
        int x=model0.getRowCount();
        if(x!=0)
        {
        for(int i=0;i<x;i++)
        {
           model0.removeRow(0);
        }
        }
        Connection  con;
        Statement st;
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ticketresrv","root","");
            String s;
            st=con.createStatement();
            s="select * from bus_details where source='"+cb1.getSelectedItem()+"' and destination='"+cb2.getSelectedItem()+"'";
            rs=st.executeQuery(s);
            DefaultTableModel model=(DefaultTableModel) jTable4.getModel();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(5),rs.getString(4)});
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        index =jTable4.getSelectedRow();
        TableModel model=jTable4.getModel();
        String bus_no=(String) model.getValueAt(index, 0);
        String source=(String) model.getValueAt(index, 1);
        String dest=(String) model.getValueAt(index, 2);
        String time=(String) model.getValueAt(index, 3);
        String price=(String) model.getValueAt(index, 4);
        String avail_seat=(String) model.getValueAt(index, 5);
        
        BookingFormFrame=new JFrame();
        BookingFormPanel=new JPanel();
        gl=new GridLayout(0,4);
        l1=new JLabel("Bus No");
        l11=new JLabel(bus_no);
        l3=new JLabel("Source");
        l13=new JLabel(source);
        l4=new JLabel("Dest");
        l14=new JLabel(dest);
        l6=new JLabel("Time");
        l16=new JLabel(time);
        l7=new JLabel("Price");
        l17=new JLabel(String.valueOf(price));
        l8=new JLabel("Available Seat");
        l18=new JLabel(String.valueOf(avail_seat));
        seatnoL=new JLabel("Seats");
        idnoL=new JLabel("ID No.");
        fnameL=new JLabel("First Name");
        lnameL=new JLabel("Last Name");
        t1=new JTextField(20);
        t3=new JTextField(20);
        
        BookingFormFrame.getContentPane().add(BookingFormPanel);
        BookingFormPanel.setLayout(gl);
        
        BookingFormPanel.add(l1);
        BookingFormPanel.add(l11);
        BookingFormPanel.add(l3);
        BookingFormPanel.add(l13);
        BookingFormPanel.add(l4);
        BookingFormPanel.add(l14);
        BookingFormPanel.add(l6);
        BookingFormPanel.add(l16);
        BookingFormPanel.add(l7);
        BookingFormPanel.add(l17);
        BookingFormPanel.add(l8);
        BookingFormPanel.add(l18);
        
        BookingFormPanel.add(seatnoL);
        BookingFormPanel.add(t1);
        BookingFormPanel.add(fnameL);
        BookingFormPanel.add(t3);
        int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {
            String booking_user=jLabel2.getText();
            String seatno=t1.getText();
            String first_tname=t3.getText();
            int remaining_seat=Integer.parseInt(avail_seat)-Integer.parseInt(seatno);
            int price_paid=Integer.parseInt(seatno)*Integer.parseInt(price);
            Connection  con;
            Statement st;
            ResultSet rs;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ticketresrv","root","");
                st=con.createStatement();    
                String s;
                s= "select * from booking where bus_no ='"+bus_no+"' and username='"+booking_user+"'";
                rs=st.executeQuery(s);
                String si;
                si= "insert into booking values('"+bus_no+"','"+booking_user+"','"+price_paid+"','"+seatno+"','"+first_tname+"')";
                int i= st.executeUpdate(si);
                if(i==1)
                {
                    String updateQuery="update bus_details set seats='"+remaining_seat+"' where bus_no='"+bus_no+"'";
                    int j=st.executeUpdate(updateQuery);
                    if(j==1)
                    {
                        int aa=JOptionPane.showConfirmDialog(null,"Booking Done","Message",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                        if(aa==JOptionPane.OK_OPTION)
                        {
                            
                        DefaultTableModel model0=(DefaultTableModel) jTable6.getModel();
                        int x=model0.getRowCount();
                        if(x!=0)
                        {
                            for(i=0;i<x;i++)
                            {
                               model0.removeRow(0);
                            }
                        }   
                        Connection  conn;
                        Statement stt;
                        ResultSet rss;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/ticketresrv","root","");
                            String ss;
                            stt=conn.createStatement();
                            ss="select * from booking where username='"+jLabel2.getText()+"'";
                            rss=stt.executeQuery(ss);
                            DefaultTableModel model2=(DefaultTableModel) jTable6.getModel();
                            while(rss.next())
                            {
                                model2.addRow(new Object[]{rss.getString(1),rss.getString(2),rss.getString(3),rss.getString(4),rss.getString(5)});
                            }
                        }
                        catch(Exception  e)
                        {
                            System.out.println(e);
                        }
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
        
    }//GEN-LAST:event_jTable4MouseClicked

    GridLayout gl;    
    public JFrame BookingFormFrame;
    public JPanel BookingFormPanel;
    public JLabel l1,l3,l4,l6,l7,l8,l11,l13,l14,l16,l17,l18,seatnoL,idnoL,fnameL,lnameL;
    public JComboBox seatCB;
    public JTextField t1,t3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
