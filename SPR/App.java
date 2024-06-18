//import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        JButton scissor = new JButton("Scissor");
        JButton paper = new JButton("paper");
        JButton rock = new JButton("rock");
        JLabel text = new JLabel("Computer threw:");
        JLabel outcome = new JLabel();
        JLabel outcome2 = new JLabel();
        outcome.setBounds(120, 120, 100, 20);
        outcome2.setBounds(30, 120, 100, 20);
        text.setBounds(20, 120, 100, 20);
        scissor.setBounds(20, 20, 100, 20);
        paper.setBounds(140, 20, 100, 20);
        rock.setBounds(260, 20, 100, 20);
        String[] result = {"scissor","paper","rock"};
        Random random = new Random();
        
        
        scissor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int selection = random.nextInt(result.length);
                outcome.setText(result[selection]);
                if(result[selection]=="scissor"){
                    outcome2.setText("Draw");
                }
                else if(result[selection]=="rock"){
                    outcome2.setText("Lose");
                    }
                    else{
                    outcome2.setText("Win");

                    }
            }
        });
        rock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int selection = random.nextInt(result.length);
                outcome.setText(result[selection]);
                if(result[selection]=="rock"){
                    outcome2.setText("Draw");
                }
                else if(result[selection]=="paper"){
                    outcome2.setText("Lose");
                    }
                    else{
                    outcome2.setText("Win");
                    }
            }
        });
        paper.addActionListener(new ActionListener() {
            int selection = random.nextInt(result.length);
            public void actionPerformed(ActionEvent e){
                outcome.setText(result[selection]);
                if(result[selection]=="paper"){
                    outcome2.setText("Draw");
                }
                else if(result[selection]=="scissor"){
                    outcome2.setText("Lose");
                    }
                    else{
                    outcome2.setText("Win");

                    }
            }
        });
        frame.add(scissor);
        frame.add(paper);
        frame.add(rock);
        frame.add(text);
        frame.add(outcome);
        frame.add(outcome2);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);     
    }
}