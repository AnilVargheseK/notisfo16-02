package com.gtl.notisfo;

import com.gtl.notisfo.bean.TradeStructure;
import com.gtl.notisfo.service.TokenService;
import com.gtl.notisfo.service.TradeInquiryService;
import com.gtl.notisfo.util.FileReadWrite;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class NotisFO extends javax.swing.JFrame {

    public NotisFO() throws IOException, SQLException {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        totalBuyValue = new javax.swing.JTextField();
        totalTradeValue = new javax.swing.JTextField();
        totalTrades = new javax.swing.JTextField();
        totalSellValue = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notis - CM");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        totalBuyValue.setEditable(false);
        totalBuyValue.setBackground(new java.awt.Color(255, 255, 255));
        totalBuyValue.setText("Total Buy Value");
        totalBuyValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBuyValueActionPerformed(evt);
            }
        });

        totalTradeValue.setEditable(false);
        totalTradeValue.setBackground(new java.awt.Color(255, 255, 255));
        totalTradeValue.setText("Total Trade Value");
        totalTradeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTradeValueActionPerformed(evt);
            }
        });

        totalTrades.setEditable(false);
        totalTrades.setBackground(new java.awt.Color(255, 255, 255));
        totalTrades.setText("Total Trades");
        totalTrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTradesActionPerformed(evt);
            }
        });

        totalSellValue.setEditable(false);
        totalSellValue.setBackground(new java.awt.Color(255, 255, 255));
        totalSellValue.setText("Total Sell Value");
        totalSellValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSellValueActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Total Buy Value");

        jLabel3.setText("Total Sell Value ");

        jLabel4.setText("Total Trade Value");

        jLabel5.setText("Total Trades");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Trade Date", "Seq No", "mkt", "Market Status", "Trade No", "Trade Time", "Token", "Trade Quantity", "Trade Price", "Trade Value", "Buy/Sell", "Order No", "Branch Code", "User Id", "Client Type", "Client account number", "cpCd", "Remarks", "Activity Type", "Transaction Code", "Order Time", "Market Book Type", "Auction Number", "Trade Settlement Type", "Opposite Broker Code", "Trade Trigger Price", "CTCL code", "Order Institution", "secIdentifier"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setCellSelectionEnabled(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setEnabled(false);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalBuyValue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalSellValue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTrades, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTradeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Refresh))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1087, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Refresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalBuyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTradeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSellValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalBuyValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBuyValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBuyValueActionPerformed

    private void totalTradeValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTradeValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTradeValueActionPerformed

    private void totalTradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTradesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTradesActionPerformed

    private void totalSellValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSellValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellValueActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:

        try {
            TokenService token = new TokenService();
            token.login();

            String details = TradeInquiryService.getTradeRes();

            System.out.println("tradesInquiry: " + details);
            String ctrlRec = details.split("\\^")[0];
            System.out.println("Control Rec : " + ctrlRec);
            List<String> ctrl = Arrays.asList(ctrlRec.split("\\s*,\\s*"));
            System.out.println("ctrl  : " + ctrl.toString());
            Object[] array1 = ctrl.toArray();
            TradeStructure t = new TradeStructure(ctrl.get(0), ctrl.get(1), ctrl.get(2), ctrl.get(3), ctrl.get(4), ctrl.get(5));

            String dataRec = details.substring(details.indexOf("^") + 1);
            dataRec.trim();
            System.out.println("Data Records : " + dataRec);
            String[] arrData = dataRec.split("\\^");
            DecimalFormat dfBuyValue = null;
            DecimalFormat dfSellValue = null;
            DecimalFormat dftotTradeValue1 = null;
            double totBuyValue = 0;
            double totSellValue = 0;
//double totTradeValue1=totBuyValue+totBuyValue;

            for (String a : arrData) {
                System.out.println("Array Trade : " + a);

                List<String> items = Arrays.asList(a.split("\\s*,\\s*"));
                System.out.println("arrayitems  : " + items.toString());
                Object[] array = items.toArray();
//            int totTrdVal= 0;
                double trdQty = Double.parseDouble(items.get(5));
                double trdPrc = Double.parseDouble(items.get(6)) / 100;
                String tradePrice = Double.toString(trdPrc);
                double trdVal = trdQty * trdPrc;
                String tradeValue = Double.toString(trdVal);

                TradeStructure ts = new TradeStructure(items.get(0), items.get(1), items.get(2), items.get(3), items.get(4), items.get(5), items.get(6),
                        items.get(7), items.get(8), items.get(9), items.get(10), items.get(11), items.get(12),
                        items.get(13), items.get(14), items.get(15), items.get(16), items.get(17), items.get(18), items.get(19),
                        items.get(20), items.get(21), items.get(22), items.get(23), items.get(24), items.get(25));

//                try {
//                    FileWriter writer = new FileWriter("F:\\anil\\notisSeqNo.txt");
//                    writer.write(items.get(0));
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//            FileWriter writer = new FileWriter("F:\\anil\\notisSeqNoBuf.txt", true);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//            bufferedWriter.write(items.get(0));
//            bufferedWriter.newLine();
////            bufferedWriter.write("See You Again!");
//                    System.out.println("---bufff");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
                TradeStructure ts1 = new TradeStructure();

                FileReadWrite fw = new FileReadWrite();
//                fw.seqNumWrite(items.get(0));
                fw.seqNumWrite(ts.getSeqNo());

                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                tableModel.addRow(new Object[]{t.getCurrTrdDate(), ts.getSeqNo(), ts.getMkt(), t.getMktSts(), ts.getTrdNo(), ts.getTrdTm(), ts.getTkn(), ts.getTrdQty(), tradePrice, tradeValue,
                    ts.getBsFlg(), ts.getOrdNo(), ts.getBrnCd(), ts.getUsrId(), ts.getProCli(), ts.getCliActNo(),
                    ts.getCpCd(), ts.getRemarks(), ts.getActTyp(), ts.getTCd(), ts.getOrdTm(), ts.getMktTyp(),
                    ts.getAucNo(), ts.getStpTyp(), ts.getOppBrokerCd(), ts.getTrdTrigPrc(), ts.getCtclId(), ts.getOrdInst(), ts.getSecIdentifier()});

                double price = Double.parseDouble(items.get(6));
                double buySell = Double.parseDouble(items.get(7));
                if (buySell == 1) {
                    totBuyValue = totBuyValue + trdVal;
                    dfBuyValue = new DecimalFormat("#.##");
                    dfBuyValue.format(totBuyValue);
                } else {
                    totSellValue = totSellValue + trdVal;
                    dfSellValue = new DecimalFormat("#.##");
                    dfSellValue.format(totSellValue);
                }

//            double totTradeValue1=totBuyValue+totBuyValue;
//            totalBuyValue.setText(Double.toString(totBuyValue));
//            totalSellValue.setText(Double.toString(totSellValue));
//            totalTradeValue.setText(Double.toString(totTradeValue1));
            }
            double totTradeValue1 = totBuyValue + totSellValue;
            dftotTradeValue1 = new DecimalFormat("#.##");
            dftotTradeValue1.format(totTradeValue1);
            totalBuyValue.setText(Double.toString(totBuyValue));
            totalSellValue.setText(Double.toString(totSellValue));
            totalTradeValue.setText(dftotTradeValue1.format(totTradeValue1));
        } catch (IOException | SQLException ex) {
            Logger.getLogger(NotisFO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NotisFO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NotisFO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RefreshActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        // TODO add your handling code here:
//

    }//GEN-LAST:event_RefreshMouseClicked

    public static void main(String args[]) {
//    public void start() {
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
            java.util.logging.Logger.getLogger(NotisFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotisFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotisFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotisFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NotisFO().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NotisFO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(NotisFO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totalBuyValue;
    private javax.swing.JTextField totalSellValue;
    private javax.swing.JTextField totalTradeValue;
    private javax.swing.JTextField totalTrades;
    // End of variables declaration//GEN-END:variables

}
