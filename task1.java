import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class task1{
    //CODED BY: Maddie Isaacs
    //Date: December 3, 2023
    task1() {
        JFrame jfrm = new JFrame("Conference Fee Calculator");
        jfrm.setSize(450,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JTabbedPane jtp = new JTabbedPane();
        JPanel ticketpane = new JPanel(new BorderLayout());

        JCheckBox genReg = new JCheckBox("General Registration - $895 per person");
        JCheckBox stuReg = new JCheckBox("Student Registration - $495 per person");
        JCheckBox openNight = new JCheckBox("Opening Dinner & Speech - $30 per person");
        JFormattedTextField genNum = null;
        try {
            genNum = new JFormattedTextField(new MaskFormatter("####"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        genNum.setPreferredSize(new Dimension(75,20));
        genNum.setEditable(false);
        JFormattedTextField finalGenNum = genNum;

        JFormattedTextField stuNum = null;
        try {
            stuNum = new JFormattedTextField(new MaskFormatter("####"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        stuNum.setPreferredSize(new Dimension(75,20));
        stuNum.setEditable(false);
        JFormattedTextField finalStuNum = stuNum;

        JFormattedTextField dinNum = null;
        try {
            dinNum = new JFormattedTextField(new MaskFormatter("####"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        dinNum.setPreferredSize(new Dimension(75,20));
        dinNum.setEditable(false);
        JFormattedTextField finalDinNum = dinNum;

        genReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(genReg.isSelected()){
                    finalGenNum.setEditable(true);
                }
                else{
                    finalGenNum.setEditable(false);
                }
            }
        });
        stuReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stuReg.isSelected()){
                    finalStuNum.setEditable(true);
                }
                else{
                    finalStuNum.setEditable(false);
                }
            }
        });

        openNight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(openNight.isSelected()){
                    finalDinNum.setEditable(true);
                }
                else{
                    finalDinNum.setEditable(false);
                }
            }
        });

        JPanel tickets = new JPanel();
        tickets.setLayout(new BoxLayout(tickets,BoxLayout.Y_AXIS));
        tickets.add(genReg);
        tickets.add(stuReg);
        tickets.add(openNight);

        JPanel ticketNums = new JPanel();
        ticketNums.add(genNum);
        ticketNums.add(stuNum);
        ticketNums.add(dinNum);

        ticketpane.add(tickets, BorderLayout.LINE_START);
        ticketpane.add(ticketNums, BorderLayout.CENTER);

        JPanel addonpanel = new JPanel(new BorderLayout());
        JLabel addonlab = new JLabel("These are optional pre-conference workshops.");
        JCheckBox ws1 = new JCheckBox("Introduction to E-Commerce - $295 per person");
        JCheckBox ws2 = new JCheckBox("The Future of the Web - $295 per person");
        JCheckBox ws3 = new JCheckBox("Advanced Java Programming - $395 per person");
        JCheckBox ws4 = new JCheckBox("Network Security - $395 per person");

        JPanel checkboxes = new JPanel();
        checkboxes.setLayout(new BoxLayout(checkboxes, BoxLayout.Y_AXIS));
        checkboxes.add(ws1);
        checkboxes.add(ws2);
        checkboxes.add(ws3);
        checkboxes.add(ws4);

        JFormattedTextField wsNum1 = null;
        try {wsNum1 = new JFormattedTextField(new MaskFormatter("####"));}
        catch (ParseException e) {throw new RuntimeException(e);}
        wsNum1.setPreferredSize(new Dimension(50,20));
        wsNum1.setEditable(false);
        JFormattedTextField finalwsNum1 = wsNum1;

        JFormattedTextField wsNum2 = null;
        try {wsNum2 = new JFormattedTextField(new MaskFormatter("####"));}
        catch (ParseException e) {throw new RuntimeException(e);}
        wsNum2.setPreferredSize(new Dimension(50,20));
        wsNum2.setEditable(false);
        JFormattedTextField finalwsNum2 = wsNum2;

        JFormattedTextField wsNum3 = null;
        try {wsNum3 = new JFormattedTextField(new MaskFormatter("####"));}
        catch (ParseException e) {throw new RuntimeException(e);}
        wsNum3.setPreferredSize(new Dimension(50,20));
        wsNum3.setEditable(false);
        JFormattedTextField finalwsNum3 = wsNum3;

        JFormattedTextField wsNum4 = null;
        try {wsNum4 = new JFormattedTextField(new MaskFormatter("####"));}
        catch (ParseException e) {throw new RuntimeException(e);}
        wsNum4.setPreferredSize(new Dimension(50,20));
        wsNum4.setEditable(false);
        JFormattedTextField finalwsNum4 = wsNum4;

        JPanel wstf = new JPanel();
        wstf.setLayout(new FlowLayout());
        wstf.add(wsNum1);
        wstf.add(wsNum2);
        wstf.add(wsNum3);
        wstf.add(wsNum4);

        addonpanel.add(addonlab, BorderLayout.PAGE_START);
        addonpanel.add(checkboxes, BorderLayout.LINE_START);
        addonpanel.add(wstf, BorderLayout.CENTER);


        //adding tabs to pane
        jtp.add("Ticket Pricing", ticketpane);
        jtp.add("Add-Ons", addonpanel);

        //adding tabbed pane to frame
        jfrm.add(jtp);

        JComboBox<Integer> regCB = new JComboBox<>();
        regCB.setEditable(false);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new task1();
            }
        });
    }
}
