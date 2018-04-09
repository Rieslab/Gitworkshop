package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import team1.Answer;
import team2.Question;

public class MainPanel extends javax.swing.JFrame {

	    /**
	 * 
	 */
	private static final long serialVersionUID = -7815372494490163428L;
	
	private Question qu_;
	private Answer ans_;
	
		/**
	     * Creates new form MainPanel
	     */
	    public MainPanel(Question qu, Answer ans) {
	    	qu_ = qu;
	    	ans_ = ans;
	        initComponents();
	    }

	                   
	    private void initComponents() {

	        JButton_newdraw = new javax.swing.JButton();
	        jTextField_question = new javax.swing.JTextArea();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jTextField_answer = new javax.swing.JTextField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        JButton_newdraw.setText("Again!");
	        JButton_newdraw.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	displayNew();
	            }
	        });
	        

	        jTextField_question.setText("No question yet");
	        jTextField_question.setLineWrap(true);
	        jTextField_question.setWrapStyleWord(true);

	        jLabel1.setText("Answer:");

	        jLabel2.setText("Question:");

	        jTextField_answer.setText("Therefore no answer!");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(JButton_newdraw)
	                    .addComponent(jTextField_question, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
	                    .addComponent(jLabel1)
	                    .addComponent(jLabel2)
	                    .addComponent(jTextField_answer))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(6, 6, 6)
	                .addComponent(jLabel2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jTextField_question, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jLabel1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jTextField_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(JButton_newdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        
	    
	    private void displayNew(){
	    	jTextField_question.setText(qu_.drawNew());
	    	jTextField_answer.setText(ans_.drawNew());
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton JButton_newdraw;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JTextField jTextField_answer;
	    private javax.swing.JTextArea jTextField_question;
	    // End of variables declaration                   
	}
