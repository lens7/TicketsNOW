


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Movieinfo.java
 *
 * Created on Aug 18, 2014, 12:36:08 AM
 */

/**
 *
 * @author Vikash
 */
public class Movieinfo extends javax.swing.JFrame {

    /** Creates new form Movieinfo */
    public Movieinfo() {
        initComponents();

        jTextArea1.setEnabled(false);

    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Information");

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vikash\\Documents\\DewMobile\\Zapya\\photo\\Kick.jpg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vikash\\Documents\\DewMobile\\Zapya\\photo\\Entertainment.jpg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 0, 190, 270);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vikash\\Documents\\DewMobile\\Zapya\\photo\\Singham return.jpg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 270, 190, 270);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vikash\\Documents\\DewMobile\\Zapya\\photo\\MAd about dance.jpg")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 270, 190, 270);

        jLabel1.setFont(new java.awt.Font("Andalus", 3, 24));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LATEST MOVIE  INFO");

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Andalus", 1, 14));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Andalus", 1, 14));
        jButton2.setText("Previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
jTextArea1.setEnabled(true);

        jTextArea1.setText(" ");
jTextArea1.append(" Kick Movie:-\n\n" +
        "The feature role play on this movie by Salman Khan, \n" +
        "Jacqueline Fernandez in lead role, Randeep Hooda, Mithun\n" +
        "Chakraborty, Nawazuddin Siddqui, Archana Puran Singh,\n" +
        " & Noor Malghani, it is a Hindi Language Bollywood Movie\n" +
        "The movie Kick is directed by Sajid Nadiadwala, this movie\n" +
        " is produced by also Sajid Nadiadwala, the movie Kick is\n" +
        "making under the Banner UTV Motion Pictures, this movie\n" +
        " is releasing on this July 2014,\n\n");
jTextArea1.append("Kick Movie Star Cast:-\n\n" +
        "1:- Salman Khan\n" +
        "2:- Jacqueline Fernandez\n" +
        "3:- Randeep Hooda\n" +
        "4:- Mithun Chakraborty\n" +
        "5:- Nawazuddin Siddqui\n" +
        "6:- Archana Puran Singh\n" +
        "7:- Noor Malghani play as guest appearance ");

jTextArea1.setEditable(false);


// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
jTextArea1.setEnabled(true);

        jTextArea1.setText(" ");
        jTextArea1.append(" Entertainment which was earlier named as It’s Entertainment\n"+
                        " is all set to hit the theaters on 8th August, 2014. The movie is\n "+
                        " being directed by debutant duo Sajid & Farhad, who \n" +
                        "are actually known for writing numerous films and it is being\n" +
                        " produced by Ramesh S. Tauraniof Tips Industries Ltd.The film \n" +
                        "starring Akshay Kumar and Tamannaah in the lead roles.\n" +
                        " We’ve here provided for you Akshay Kumar’s Entertainment\n" +
                        " Movie Review, Cast,Details, Plot, Videos & Posters, which \n" +
                        "you can check out below. \n\n"+
                        "Entertainment Full Cast Details :-\n\n" +
                        "1.Akshay Kumar as Akhil\n" +
                        "2.Tamannaah Bhatia as Saakshi\n" +
                        "3.Mithun Chakraborty\n" +
                        "4.Krishna Abhishek\n" +
                        "5.Johnny Lever\n" +
                        "6.Prakash Raj\n" +
                        "7.Sonu Sood\n" +
                        "8.Vrajesh Hirjee\n" +
                        "9.Hiten Tejwani\n" +
                        "10.Riteish Deshmukh as Ek Villain\n\n");
      jTextArea1.append("Entertainment Movie Plot or Story :-\n\n" +
                        "In the movie Akhil (Akshay Kumar) faces failures\n" +
                        " at every step towards success. He does some \n" +
                        "petty jobs all to support his ailing father who \n" +
                        "is admitted in hospitals from months but Akhil \n" +
                        "(Akshay Kumar) overhears his father in the hospital\n" +
                        "explaining to a hospital nurse that he has a\n" +
                        "passion for easy life so he pretends to be ill\n" +
                        "to achieve comforts, Akhil gets the biggest\n" +
                        "shock when he hears his father saying that\n" +
                        "‘Akshi is not his son’ and this father (who is\n" +
                        "admitted in the hospital) had actually\n" +
                        "claimed him as his son in a train accident to\n" +
                        "gain more compensation from the government.\n" +
                        "And then later Akhil gets to know that his\n" +
                        "real father is the richest diamond merchant,\n" +
                        "‘Pannalal Johri’ who had actually cheated\n" +
                        "his mother. Akhil gets over excited while\n" +
                        "hearing this and then he goes to break this\n" +
                        "news to his pal ‘Krishna’ whereas his pal\n" +
                        "before hearing out Akhil, breaks the news\n" +
                        "that the multi millionaire tycoon ‘Pannalal\n" +
                        "Johri’ is dead. Akhil becomes so sad but his\n" +
                        "sadness gets overwhelmed when he comes to know \n" +
                        "that pannalal Johri has no heir and he would \n" +
                        "definitely be the ‘official waaris’ of the tycoon.\n" +
                        " Akhil breaks this news to his girlfriend’s (Tamannaah)\n" +
                        " father who on hearing this suddenly starts saying\n" +
                        "Akhil as his ‘Jigar Ka Tukda’. Akhil then attends \n" +
                        "his father’s funeral and shed fake tears but is all\n" +
                        " smiling from inside. Akhil then gets the biggest shock\n" +
                        "when the family lawyer informs him that his\n" +
                        "father has willed his entire property to his\n" +
                        "one and only faithful \n\n" +
                        "Dog –Entertainment. Akhil then cries hard in\n" +
                        "front of his friend who gives an idea of\n" +
                        "killing the dog as the dog was living Akhil’s\n" +
                        "life and Akhil is living the life of a dog.\n" +
                        "Does the Dog died in the end? and Who\n" +
                        "gets the entire Pannalal Johri’s Property?\n" +
                        "This is all about the film and there are\n" +
                        "some villains too in the film which we\n" +
                        "haven’t mentioned above.");


jTextArea1.setEditable(false);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
jTextArea1.setEnabled(true);

        jTextArea1.setText(" ");
        jTextArea1.append(" Singham Returns Movie:-\n\n" +
                        " The feature ro le plays o n this mo vie by Ajay Devgan,\n" +
                        " Kareena Kapo o r Khan, Anupam Kher & Amole Gupte, this is\n" +
                        " a Actio n Based movie.\n" +
                        " The movie Singham Returns is directed\n" +
                        " by Ro hit Shetty, and Himesh Reshammiya give the Music \n" +
                        "in this fantastic film,the mo vie is making under Reliance\n" +
                        " Entertainment Banner movie,and Ajay Devgan films Studio,\n" +
                        " this mo vieis releasing on 15 august 2014,\n\n");
      jTextArea1.append("Singham Returns Movie Star Cast:-\n\n" +
                        "Ajay Devgan playing the role of Bajirao Singham\n" +
                        "Kareena Kapoor Khan\n" +
                        "Anupam Kher\n" +
                        "Amole Gupte\n" +
                        "Dayanand Shetty\n" +
                        "Sameer Dharmadhikari\n\n");
      jTextArea1.append("Singham Returns Movie About Story:-\n\n" +
              "After the grand success full and super hit film \n" +
              "Singham (20 11),Ajay & Rohit was come back with his \n" +
              "super blockbuster movie singham Returns, now this time\n" +
              " female lead role is given by Kareena Kapoor Khan, \n" +
              "singham Returns is a Action Based movie, it is the \n" +
              "Remake of Tamil hit movie “Main Hun Surya Singham”/\n" +
              "singham-Returns, Which is Directed by “Hari” and \n" +
              "featured by “Surya”, the movie Singham Returns is \n" +
              "a Awesome movie, Ajay give his best in this \n" +
              "film,this mo vie is coming on this Independent Day\n\n");
     jTextArea1.setEditable(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
  jTextArea1.setEnabled(true);

        jTextArea1.setText(" ");
        jTextArea1.append("Mad About Dance (MAD) :-\n\n" +
             " It is the new upcoming Bollywood movie based on\n" +
             "Dance. This movie is all set to release soon and the\n" +
             " Official Trailer of the movie is already out and \n" +
             "here in this post we are going to tell you about the\n" +
             " Mad About Dance Release Date and other details of\n" +
             " the movie. This movie is directed and Written by \n" +
             "the 'Saahil Prem' which is fully inspired from \n" +
             "Hollywood movie Step –Up . If we talk aboutMad \n" +
             "About Dance Cast Details then in this movie you\n" +
             " will see director Saahil Prem in the lead role with \n" +
             "Amrit Maghera. In this movie you will see lots of \n" +
             "International dance style like Locking,Popping and\n" +
             " B-Boying . IF we talk about the Mad About Dance Story\n" +
             " this is the story of few dancer who compete in an\n" +
             " international dancecompetition to proof themselves\n" +
             " that Indian can also do a good Dance.\n\n");
         jTextArea1.append("Mad About Dance Cast Details:-\n\n" +
              "Saahil Prem\n" +
              "Amrit Maghera\n" +
              "Salah Benlemqawanssa\n" +
              "Akhilesh Unnitan, Abhishek Saha\n" +
              "Raashul Tondon\n\n" +
              "Genre: Drama/Musical.\n" +
              "Production House: Paanch Rupaiya Barah Ana Productions Pvt.Ltd.\n" +
              "Producer: Essel Vision Productions Ltd.\n" +
              "Director: Saahil Prem.\n" +
              "Writer: Saahil Prem.\n" +
              "Cinematography: Uday Tiwari.\n" +
              "Choreographer: Del Mak.\n" +
              "Music: T- Series.\n\n");
      jTextArea1.append(" Mad About Dance Story:-\n\n" +
              "This movie is based on dance which is inspired from \n" +
              "Hollywood Step-Up. In this movie you will see International\n" +
              "dance styles like Locking, Popping and B-Boying. This story\n" +
              " is about some Indian dancers who head toward west to\n" +
              "try their luck in dancing. Foreigner dancer thinks that\n" +
              " Indian can’t dance like him and this movie is all about the\n" +
              "dancing fight between Foreign dancer and Indian dancer");// TODO add your handling code here:
jTextArea1.setEditable(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movieinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
