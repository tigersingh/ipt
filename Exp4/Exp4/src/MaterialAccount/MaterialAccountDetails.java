package MaterialAccount;


import Account.AccountDetails;
import SimpleAccount.AccountForm;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reezp
 */
public class MaterialAccountDetails extends javax.swing.JPanel {
    private AccountDetails accounts;

    /**
     * Creates new form MaterialMouseMove
     */
    public MaterialAccountDetails() {
        initComponents();
        
        accounts = new AccountDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accountNumberInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        accountNameInput = new javax.swing.JTextField();
        balanceInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        withdrawAmountInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        currentBalanceInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        messageButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 46, 68));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Deatils");

        dateLabel.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(230, 230, 230));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Date");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Enter following Details");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(195, 195, 195));
        jLabel4.setText("ACCOUNT NUMBER");

        accountNumberInput.setBackground(new java.awt.Color(36, 46, 68));
        accountNumberInput.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        accountNumberInput.setForeground(new java.awt.Color(255, 255, 255));
        accountNumberInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(195, 195, 195));
        jLabel5.setText("ACCOUNT HOLDER NAME");

        accountNameInput.setBackground(new java.awt.Color(36, 46, 68));
        accountNameInput.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        accountNameInput.setForeground(new java.awt.Color(255, 255, 255));
        accountNameInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        balanceInput.setEditable(false);
        balanceInput.setBackground(new java.awt.Color(36, 46, 68));
        balanceInput.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        balanceInput.setForeground(new java.awt.Color(255, 255, 255));
        balanceInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        balanceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceInputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(195, 195, 195));
        jLabel6.setText("WITHDRAW AMOUNT");

        withdrawAmountInput.setBackground(new java.awt.Color(36, 46, 68));
        withdrawAmountInput.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        withdrawAmountInput.setForeground(new java.awt.Color(255, 255, 255));
        withdrawAmountInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(195, 195, 195));
        jLabel7.setText("BALANCE");

        currentBalanceInput.setEditable(false);
        currentBalanceInput.setBackground(new java.awt.Color(36, 46, 68));
        currentBalanceInput.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        currentBalanceInput.setForeground(new java.awt.Color(255, 255, 255));
        currentBalanceInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(195, 195, 195));
        jLabel9.setText("CURRENT BALANCE");

        messageButton.setBackground(new java.awt.Color(89, 199, 198));
        messageButton.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        messageButton.setForeground(new java.awt.Color(220, 220, 220));
        messageButton.setText("MESSAGE");
        messageButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 199, 198), 2, true));
        messageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButtonActionPerformed(evt);
            }
        });

        okButton.setBackground(new java.awt.Color(89, 199, 198));
        okButton.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        okButton.setForeground(new java.awt.Color(220, 220, 220));
        okButton.setText("OK");
        okButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 199, 198), 2, true));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNumberInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(withdrawAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(balanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(currentBalanceInput)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288)
                                .addComponent(messageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(accountNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void messageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButtonActionPerformed
        onMessageBtnClicked();
    }//GEN-LAST:event_messageButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        onOKBtnClicked();
    }//GEN-LAST:event_okButtonActionPerformed

    private void balanceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceInputActionPerformed

    public static void main(String args[]) {
        try { 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountForm().setVisible(true);
            }
        });
    }

    
    public void onOKBtnClicked() {
        accounts = new AccountDetails();
        accounts.setAccountNo(Long.parseLong(accountNumberInput.getText()));
        accounts.setName(accountNameInput.getText());
        accounts.setWithdrawAmount(Double.parseDouble(withdrawAmountInput.getText()));
        
        balanceInput.setText("" + accounts.getBalanceAmt());
        accounts.generateSystemDate();
        currentBalanceInput.setText("Current Balance :" + accounts.currentBalance());
        dateLabel.setText("Date: " + accounts.getDate());
    }

    public void onMessageBtnClicked() {
        String msg = "Balance in your Account No: " + accounts.getAccountNo() + " as on " + accounts.getDate() + " is " + accounts.currentBalance();
        JOptionPane.showMessageDialog(null, msg, "SMS", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNameInput;
    private javax.swing.JTextField accountNumberInput;
    private javax.swing.JTextField balanceInput;
    private javax.swing.JTextField currentBalanceInput;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton messageButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField withdrawAmountInput;
    // End of variables declaration//GEN-END:variables
}
