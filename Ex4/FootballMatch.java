package Ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FootballMatch extends JFrame
{
    JButton milanButton = new JButton("AC Milan");
    JButton realButton = new JButton("Real Madrid");
    JLabel currentScore = new JLabel("Result: 0 x 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    int milanGoals = 0;
    int rmGoals = 0;
    public FootballMatch() {
        super("Матч Милан - Реал");
        setLayout(new GridLayout(2, 3));
        setSize(400, 250);
        setVisible(true);

        add(milanButton);
        milanButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanGoals++;
                lastScorer.setText("Last Scorer: AC Milan");
                currentScore.setText("Result: " + milanGoals + " x " + rmGoals);
                if (milanGoals > rmGoals) {
                    winner.setText("Winner: AC Milan");
                } else if (milanGoals < rmGoals) {
                    winner.setText("Winner: Real Madrid");
                } else winner.setText("Winner: DRAW");
            }
        });
        realButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rmGoals++;
                lastScorer.setText("Last Scorer: Real Madrid");
                currentScore.setText("Result: " + milanGoals + " x " + rmGoals);
                if (milanGoals > rmGoals) {
                    winner.setText("Winner: AC Milan");
                } else if (milanGoals < rmGoals) {
                    winner.setText("Winner: Real Madrid");
                } else winner.setText("Winner: DRAW");
            }
        });
        add(currentScore);
        add(realButton);
        add(lastScorer);
        add(winner);


    }
}