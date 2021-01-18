package com.company.activities;

import com.company.Application;
import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameActivity extends Activity {

    private Font btnFont = new Font ("TimesRoman", Font.BOLD  , 70);
    private Color btnColor = new Color(0xCCCCFF);
    private Color backgroundcolor = new Color(0xFFD3E0);
    private Color wincolor = new Color(0xFFB02E);
    private Color losscolor = new Color(0xA91D11);

    private JLabel topLabel;

    private int[][] numberMatrix;
    private JButton[][] btnMatrix;
    private int TurnsCounter;
    private boolean enableGame;

    public GameActivity(String activityID) {
        super(activityID);
    }

    private void computersTurn(){
        Random random = new Random();
        //CHECK FOR LINE OF THREE 1.
        int tmp_sum;
        //Check line 0
        tmp_sum = numberMatrix[0][0] + numberMatrix[0][1] + numberMatrix[0][2];
        if (tmp_sum == 3) {
            btnMatrix[0][0].setBackground(wincolor);
            btnMatrix[0][1].setBackground(wincolor);
            btnMatrix[0][2].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check line 1
        tmp_sum = numberMatrix[1][0] + numberMatrix[1][1] + numberMatrix[1][2];
        if (tmp_sum == 3) {
            btnMatrix[1][0].setBackground(wincolor);
            btnMatrix[1][1].setBackground(wincolor);
            btnMatrix[1][2].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check line 2
        tmp_sum = numberMatrix[2][0] + numberMatrix[2][1] + numberMatrix[2][2];
        if (tmp_sum == 3) {
            btnMatrix[2][0].setBackground(wincolor);
            btnMatrix[2][1].setBackground(wincolor);
            btnMatrix[2][2].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check column 0
        tmp_sum = numberMatrix[0][0] + numberMatrix[1][0] + numberMatrix[2][0];
        if (tmp_sum == 3) {
            btnMatrix[0][0].setBackground(wincolor);
            btnMatrix[1][0].setBackground(wincolor);
            btnMatrix[2][0].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check column 1
        tmp_sum = numberMatrix[0][1] + numberMatrix[1][1] + numberMatrix[2][1];
        if (tmp_sum == 3) {
            btnMatrix[0][1].setBackground(wincolor);
            btnMatrix[1][1].setBackground(wincolor);
            btnMatrix[2][1].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check column 2
        tmp_sum = numberMatrix[0][2] + numberMatrix[1][2] + numberMatrix[2][2];
        if (tmp_sum == 3) {
            btnMatrix[0][2].setBackground(wincolor);
            btnMatrix[1][2].setBackground(wincolor);
            btnMatrix[2][2].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check main diagonal
        tmp_sum = numberMatrix[0][0] + numberMatrix[1][1] + numberMatrix[2][2];
        if (tmp_sum == 3) {
            btnMatrix[0][0].setBackground(wincolor);
            btnMatrix[1][1].setBackground(wincolor);
            btnMatrix[2][2].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }
        //Check secondary diagonal
        tmp_sum = numberMatrix[0][2] + numberMatrix[1][1] + numberMatrix[2][0];
        if (tmp_sum == 3) {
            btnMatrix[0][2].setBackground(wincolor);
            btnMatrix[1][1].setBackground(wincolor);
            btnMatrix[2][0].setBackground(wincolor);
            topLabel.setText("YOU WIN");
            topLabel.setBackground(wincolor);
            enableGame = false;
            return;
        }

        //PLACE SIGN INTO RANDOM PLACE///////////////////////////
        while(true){
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            if(numberMatrix[x][y] == 0){
                numberMatrix[x][y] = 5;
                btnMatrix[x][y].setText(" ☉ ");
                TurnsCounter++;
                break;
            }
        }
        ////////////////////////////////////////////////////////////
        //CHECK FOR LINE OF THREE 5.
        //CHECK FOR LINE OF THREE 1.
        //Check line 0
        tmp_sum = numberMatrix[0][0] + numberMatrix[0][1] + numberMatrix[0][2];
        if (tmp_sum == 15) {
            btnMatrix[0][0].setBackground(losscolor);
            btnMatrix[0][1].setBackground(losscolor);
            btnMatrix[0][2].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check line 1
        tmp_sum = numberMatrix[1][0] + numberMatrix[1][1] + numberMatrix[1][2];
        if (tmp_sum == 15) {
            btnMatrix[1][0].setBackground(losscolor);
            btnMatrix[1][1].setBackground(losscolor);
            btnMatrix[1][2].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check line 2
        tmp_sum = numberMatrix[2][0] + numberMatrix[2][1] + numberMatrix[2][2];
        if (tmp_sum == 15) {
            btnMatrix[2][0].setBackground(losscolor);
            btnMatrix[2][1].setBackground(losscolor);
            btnMatrix[2][2].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check column 0
        tmp_sum = numberMatrix[0][0] + numberMatrix[1][0] + numberMatrix[2][0];
        if (tmp_sum == 15) {
            btnMatrix[0][0].setBackground(losscolor);
            btnMatrix[1][0].setBackground(losscolor);
            btnMatrix[2][0].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check column 1
        tmp_sum = numberMatrix[0][1] + numberMatrix[1][1] + numberMatrix[2][1];
        if (tmp_sum == 15) {
            btnMatrix[0][1].setBackground(losscolor);
            btnMatrix[1][1].setBackground(losscolor);
            btnMatrix[2][1].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check column 2
        tmp_sum = numberMatrix[0][2] + numberMatrix[1][2] + numberMatrix[2][2];
        if (tmp_sum == 15) {
            btnMatrix[0][2].setBackground(losscolor);
            btnMatrix[1][2].setBackground(losscolor);
            btnMatrix[2][2].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check main diagonal
        tmp_sum = numberMatrix[0][0] + numberMatrix[1][1] + numberMatrix[2][2];
        if (tmp_sum == 15) {
            btnMatrix[0][0].setBackground(losscolor);
            btnMatrix[1][1].setBackground(losscolor);
            btnMatrix[2][2].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
        //Check secondary diagonal
        tmp_sum = numberMatrix[0][2] + numberMatrix[1][1] + numberMatrix[2][0];
        if (tmp_sum == 15) {
            btnMatrix[0][2].setBackground(losscolor);
            btnMatrix[1][1].setBackground(losscolor);
            btnMatrix[2][0].setBackground(losscolor);
            topLabel.setText("YOU LOSE");
            topLabel.setBackground(losscolor);
            enableGame = false;
            return;
        }
    }


    @Override
    public void init(Container container) {
        enableGame = true;
        TurnsCounter = 0;
        numberMatrix = new int[3][3];
        btnMatrix = new JButton[3][3];

        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);
        Color backgroundcolor = new Color(0xFFD3E0);
        container.setBackground(backgroundcolor);


        topLabel = new JLabel("You play for ✖ Put in on ☐");
        topLabel.setFont(new Font("TimesRoman", Font.BOLD  , 30));

        JButton exitbtn = new JButton("\uD83D\uDEAA");
        exitbtn.setFont(new Font("TimesRoman", Font.BOLD  , 30));
        exitbtn.setBackground(new Color(0xE52B50));
        exitbtn.setFocusPainted(false);
        exitbtn.setBorderPainted(false);
        exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Application.changeActivity(Application.getActivity("MainMenu"));
            }
        });

        JButton btn00 = new JButton(" ☐ ");
        btn00.setBackground(btnColor);
        btn00.setFocusPainted(false);
        btn00.setBorderPainted(false);
        btn00.setFont(btnFont);
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn00.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn00.setText(" ✖ ");
                    numberMatrix[0][0] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn00.setText(" ✖ ");
                    numberMatrix[0][0] = 1;
                }
            }
        });

        JButton btn01 = new JButton(" ☐ ");
        btn01.setFont(btnFont);
        btn01.setBackground(btnColor);
        btn01.setFocusPainted(false);
        btn01.setBorderPainted(false);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn01.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn01.setText(" ✖ ");
                    numberMatrix[0][1] = 1;
                    TurnsCounter++;
                    computersTurn();
                }
            }
        });

        JButton btn02 = new JButton(" ☐ ");
        btn02.setFont(btnFont);
        btn02.setBackground(btnColor);
        btn02.setFocusPainted(false);
        btn02.setBorderPainted(false);
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn02.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn02.setText(" ✖ ");
                    numberMatrix[0][2] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn02.setText(" ✖ ");
                    numberMatrix[0][2] = 1;
                }
            }
        });

        JButton btn10 = new JButton(" ☐ ");
        btn10.setFont(btnFont);
        btn10.setBackground(btnColor);
        btn10.setFocusPainted(false);
        btn10.setBorderPainted(false);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn10.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn10.setText(" ✖ ");
                    numberMatrix[1][0] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn10.setText(" ✖ ");
                    numberMatrix[1][0] = 1;
                }
            }
        });

        JButton btn11 = new JButton(" ☐ ");
        btn11.setFont(btnFont);
        btn11.setBackground(btnColor);
        btn11.setFocusPainted(false);
        btn11.setBorderPainted(false);
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn11.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn11.setText(" ✖ ");
                    numberMatrix[1][1] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn11.setText(" ✖ ");
                    numberMatrix[1][1] = 1;
                }
            }
        });

        JButton btn12 = new JButton(" ☐ ");
        btn12.setFont(btnFont);
        btn12.setBackground(btnColor);
        btn12.setFocusPainted(false);
        btn12.setBorderPainted(false);
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn12.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn12.setText(" ✖ ");
                    numberMatrix[1][2] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn12.setText(" ✖ ");
                    numberMatrix[1][2] = 1;
                }
            }
        });

        JButton btn20 = new JButton(" ☐ ");
        btn20.setFont(btnFont);
        btn20.setBackground(btnColor);
        btn20.setFocusPainted(false);
        btn20.setBorderPainted(false);
        btn20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn20.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn20.setText(" ✖ ");
                    numberMatrix[2][0] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn20.setText(" ✖ ");
                    numberMatrix[2][0] = 1;
                }
            }
        });

        JButton btn21 = new JButton(" ☐ ");
        btn21.setFont(btnFont);
        btn21.setBackground(btnColor);
        btn21.setFocusPainted(false);
        btn21.setBorderPainted(false);
        btn21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn21.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn21.setText(" ✖ ");
                    numberMatrix[2][1] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn21.setText(" ✖ ");
                    numberMatrix[2][1] = 1;
                }
            }
        });

        JButton btn22 = new JButton(" ☐ ");
        btn22.setFont(btnFont);
        btn22.setBackground(btnColor);
        btn22.setFocusPainted(false);
        btn22.setBorderPainted(false);
        btn22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enableGame)
                if(btn22.getText().equals(" ☐ ") && TurnsCounter < 8) {
                    btn22.setText(" ✖ ");
                    numberMatrix[2][2] = 1;
                    TurnsCounter++;
                    computersTurn();
                } else {
                    btn22.setText(" ✖ ");
                    numberMatrix[2][2] = 1;
                }
            }
        });

        container.add(topLabel);
        //Placing top label
        layout.putConstraint(SpringLayout.WEST, topLabel,
                20, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, topLabel,
                20, SpringLayout.NORTH, container);

        container.add(exitbtn);
        //Placing exit button
        layout.putConstraint(SpringLayout.WEST, exitbtn,
                527, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, exitbtn,
                10, SpringLayout.NORTH, container);

        btnMatrix[0][0] = btn00;
        btnMatrix[0][1] = btn01;
        btnMatrix[0][2] = btn02;
        btnMatrix[1][0] = btn10;
        btnMatrix[1][1] = btn11;
        btnMatrix[1][2] = btn12;
        btnMatrix[2][0] = btn20;
        btnMatrix[2][1] = btn21;
        btnMatrix[2][2] = btn22;

        container.add(btn00);
        container.add(btn01);
        container.add(btn02);
        container.add(btn10);
        container.add(btn11);
        container.add(btn12);
        container.add(btn20);
        container.add(btn21);
        container.add(btn22);
        //Placing 00 button
        layout.putConstraint(SpringLayout.WEST, btn00,
                55, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn00,
                150, SpringLayout.NORTH, container);

        //Placing 01 button
        layout.putConstraint(SpringLayout.WEST, btn01,
                225, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn01,
                150, SpringLayout.NORTH, container);

        //Placing 02 button
        layout.putConstraint(SpringLayout.WEST, btn02,
                395, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn02,
                150, SpringLayout.NORTH, container);

        //Placing 10 button
        layout.putConstraint(SpringLayout.WEST, btn10,
                55, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn10,
                285, SpringLayout.NORTH, container);

        //Placing 11 button
        layout.putConstraint(SpringLayout.WEST, btn11,
                225, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn11,
                285, SpringLayout.NORTH, container);

        //Placing 12 button
        layout.putConstraint(SpringLayout.WEST, btn12,
                395, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn12,
                285, SpringLayout.NORTH, container);

        //Placing 20 button
        layout.putConstraint(SpringLayout.WEST, btn20,
                55, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn20,
                420, SpringLayout.NORTH, container);

        //Placing 21 button
        layout.putConstraint(SpringLayout.WEST, btn21,
                225, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn21,
                420, SpringLayout.NORTH, container);

        //Placing 22 button
        layout.putConstraint(SpringLayout.WEST, btn22,
                395, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, btn22,
                420, SpringLayout.NORTH, container);
    }
}
