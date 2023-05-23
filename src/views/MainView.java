/*
 * File:MainView.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-05-23
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package views;

import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
    JPanel buttonPanel;
    JButton prevButton;
    JButton nextButton;
    public InputPanel namePanel;
    public InputPanel cityPanel;
    public InputPanel addressPanel;
    public InputPanel birthPanel;
    public InputPanel salaryPanel;

    public MainView() {
        this.initComponent();
        this.setComponent();
        this.setFrame();
    }
    public InputPanel getNamePanel() {
        return namePanel;
    }
    public void setNamePanel(InputPanel namePanel) {
        this.namePanel = namePanel;
    }
    private void initComponent() {
        this.buttonPanel = new JPanel();
        this.prevButton = new JButton("Előző");
        this.nextButton = new JButton("Következő");
        this.setNamePanel(new InputPanel("Név"));
        this.cityPanel = new InputPanel("Település");
        this.addressPanel = new InputPanel("Cím");
        this.birthPanel = new InputPanel("Születés");
        this.salaryPanel = new InputPanel("Fizetés");
    }
    private void setComponent() {
        this.buttonPanel.add(this.prevButton);
        this.buttonPanel.add(this.nextButton);
    }
    private void setFrame() {
        this.setLayout(
            new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS)
            );
        this.add(this.buttonPanel);
        this.add(this.getNamePanel());
        this.add(this.cityPanel);
        this.add(this.addressPanel);
        this.add(this.birthPanel);
        this.add(this.salaryPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setVisible(true);        
    }
    public JPanel getButtonPanel() {
        return buttonPanel;
    }
    public JButton getPrevButton() {
        return prevButton;
    }
    public JButton getNextButton() {
        return nextButton;
    }
    
}
