package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match extends JFrame {
    private String team;
    private String scored;
    private int milan = 0;
    private int madrid = 0;
    private int milanResult = 0;
    private int madridResult = 0;
    private JLabel result;
    private JLabel lastScorer;
    private Label winner;
    private JButton addMilan;
    private JButton addMadrid;
    private void updateWinner() {
        lastScorer.setText("Last Scorer " + scored);
        addMadrid.setText("Real Madrid " + madrid);
        addMilan.setText("Milan " + milan);
        result.setText("Result: Real Madrid:" + madridResult +" X Milan:" + milanResult);
        if (madrid > milan){
            team = "Madrid";
            winner.setText("Winner: " + team);}
        if (madrid < milan) {
            team = "Milan";
            winner.setText("Winner: " + team);}
        if (madrid == milan) {
            team = "Draw";
            winner.setText("Winner: " + team);
        }
    }
    public Match() {
        super("Football match");
        super.setSize(500,500);
        result = new JLabel("Result: Real Madrid: " + madridResult +" X Milan: " + milanResult);
        winner = new Label ("Winner: " + team);
        lastScorer = new JLabel("Last Scorer: " + scored);
        addMilan = new JButton("AC Milan" + milan);
        addMadrid = new JButton("Real Madrid" + madrid);
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        add (winner, BorderLayout.CENTER);
        add(lastScorer, BorderLayout.PAGE_START);
        add(result, BorderLayout.NORTH);
        buttonsPanel.add(winner);
        buttonsPanel.add(lastScorer);
        buttonsPanel.add(addMadrid);
        buttonsPanel.add(addMilan);
        add(buttonsPanel, BorderLayout.SOUTH);
        addMilan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                milan = milan+1;     //Добавляем одну ворону
                scored = "Milan";
                milanResult = milan;
                updateWinner();
            }
        });
        addMadrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madrid = madrid + 1;
                scored = "Real Madrid";
                madridResult = madrid;
                updateWinner();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
