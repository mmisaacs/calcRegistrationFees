import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1{
    //CODED BY: Maddie Isaacs
    //Date: December 3, 2023
    double total, genCost, stuCost, dinCost, ws1Cost, ws2Cost, ws3Cost, ws4Cost;
    task1() {
        JFrame jfrm = new JFrame("Conference Fee Calculator");
        jfrm.setSize(450,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JTabbedPane jtp = new JTabbedPane();
        total = 0.0;

        JPanel items = new JPanel();
        items.setLayout(new BoxLayout(items, BoxLayout.Y_AXIS));
        JLabel itemslab = new JLabel("<html><h3>Selections</h3>");
        items.add(itemslab);

        //receipt labels
        JLabel genRegReceipt = new JLabel("General Registration - $895");
        JLabel stuRegReceipt = new JLabel("Student Registration - $295");
        JLabel dinnerReceipt = new JLabel("Opening Night Dinner - $30");
        JLabel ws1Receipt = new JLabel("Intro to E-Commerce - $295");
        JLabel ws2Receipt = new JLabel("The Future of the Web- $295");
        JLabel ws3Receipt = new JLabel("Adv Java Programming - $395");
        JLabel ws4Receipt = new JLabel("Network Security - $395");
        JLabel totalPrice = new JLabel();


        //first pane
        JPanel ticketpane = new JPanel(new BorderLayout());

        JLabel ticketTitle = new JLabel("Ticket Options and Dinner");
        JCheckBox genReg = new JCheckBox("General Registration - $895 per person");
        JCheckBox stuReg = new JCheckBox("Student Registration - $495 per person");
        JCheckBox openNight = new JCheckBox("Opening Dinner & Speech - $30 per person");
        JTextField genNum = new JTextField();
        genNum.setPreferredSize(new Dimension(75,20));
        genNum.setEditable(false);

        JLabel ticketppl = new JLabel("# of People");
        JTextField stuNum = new JTextField();
        stuNum.setPreferredSize(new Dimension(75,20));
        stuNum.setEditable(false);

        JTextField dinNum = new JTextField();
        dinNum.setPreferredSize(new Dimension(75,20));
        dinNum.setEditable(false);

        genReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(genReg.isSelected()){
                    genNum.setEditable(true);
                    items.add(genRegReceipt);
                    genCost = 895.0 * (Integer.parseInt(genNum.getText()));
                }
                else{
                    genNum.setEditable(false);
                    items.remove(genRegReceipt);
                }
            }
        });
        stuReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stuReg.isSelected()){
                    stuNum.setEditable(true);
                    items.add(stuRegReceipt);
                    stuCost = 895.0 * (Double.parseDouble(stuNum.getText()));
                }
                else{
                    stuNum.setEditable(false);
                    items.remove(stuRegReceipt);
                }
            }
        });

        openNight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(openNight.isSelected()){
                    dinNum.setEditable(true);
                    items.add(dinnerReceipt);
                    dinCost = 895.0 * (Double.parseDouble(dinNum.getText()));
                }
                else{
                    dinNum.setEditable(false);
                    items.remove(dinnerReceipt);
                }
            }
        });

        //sub panel for ticket checkboxes
        JPanel tickets = new JPanel();
        tickets.setLayout(new BoxLayout(tickets,BoxLayout.Y_AXIS));
        tickets.add(ticketTitle);
        tickets.add(genReg);
        tickets.add(stuReg);
        tickets.add(openNight);

        //sub panel to line up the text fields with checkboxes
        JPanel ticketNums = new JPanel();
        ticketNums.add(ticketppl);
        ticketNums.add(genNum);
        ticketNums.add(stuNum);
        ticketNums.add(dinNum);

        //add to teh ticketpane
        ticketpane.add(tickets, BorderLayout.LINE_START);
        ticketpane.add(ticketNums, BorderLayout.CENTER);

        JPanel addonpanel = new JPanel(new BorderLayout());
        JLabel addonlab = new JLabel("These are optional pre-conference workshops.");
        JLabel wstitle = new JLabel("Workshop options");
        JCheckBox ws1 = new JCheckBox("Introduction to E-Commerce - $295 per person");
        JCheckBox ws2 = new JCheckBox("The Future of the Web - $295 per person");
        JCheckBox ws3 = new JCheckBox("Advanced Java Programming - $395 per person");
        JCheckBox ws4 = new JCheckBox("Network Security - $395 per person");

        JLabel wsppl = new JLabel("# of People");

        JTextField wsNum1 = new JTextField();
        wsNum1.setPreferredSize(new Dimension(50,20));
        wsNum1.setEditable(false);

        JTextField wsNum2 = new JTextField();
        wsNum2.setPreferredSize(new Dimension(50,20));
        wsNum2.setEditable(false);

        JTextField wsNum3 = new JTextField();
        wsNum3.setPreferredSize(new Dimension(50,20));
        wsNum3.setEditable(false);
        JTextField finalwsNum3 = wsNum3;

        JTextField wsNum4 = new JTextField();
        wsNum4.setPreferredSize(new Dimension(50,20));
        wsNum4.setEditable(false);
        JTextField finalwsNum4 = wsNum4;

        ws1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ws1.isSelected()){
                    wsNum1.setEditable(true);
                    items.add(ws1Receipt);
                    ws1Cost = 295.0 * (Double.parseDouble(wsNum1.getText()));
                }
                else{
                    wsNum1.setEditable(false);
                    items.remove(ws1Receipt);
                }
            }
        });

        ws2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ws2.isSelected()){
                    wsNum2.setEditable(true);
                    items.add(ws2Receipt);
                    ws2Cost = 295.0 * (Double.parseDouble(wsNum2.getText()));
                }
                else{
                    wsNum2.setEditable(false);
                    items.remove(ws2Receipt);
                }
            }
        });

        ws3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ws3.isSelected()){
                    wsNum3.setEditable(true);
                    items.add(ws3Receipt);
                    ws3Cost = 395.0 * (Double.parseDouble(wsNum3.getText()));
                }
                else{
                    wsNum3.setEditable(false);
                    items.remove(ws3Receipt);
                }
            }
        });

        ws4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ws4.isSelected()){
                    wsNum4.setEditable(true);
                    items.add(ws4Receipt);
                    ws4Cost = 395.0 * (Double.parseDouble(wsNum4.getText()));
                }
                else{
                    wsNum4.setEditable(false);
                    items.remove(ws4Receipt);
                }
            }
        });


        JPanel checkboxes = new JPanel();
        checkboxes.setLayout(new BoxLayout(checkboxes, BoxLayout.Y_AXIS));
        checkboxes.add(wstitle);
        checkboxes.add(ws1);
        checkboxes.add(ws2);
        checkboxes.add(ws3);
        checkboxes.add(ws4);

        JPanel wstf = new JPanel();
        wstf.setLayout(new FlowLayout());
        wstf.add(wsppl);
        wstf.add(wsNum1);
        wstf.add(wsNum2);
        wstf.add(wsNum3);
        wstf.add(wsNum4);

        addonpanel.add(addonlab, BorderLayout.PAGE_START);
        addonpanel.add(checkboxes, BorderLayout.LINE_START);
        addonpanel.add(wstf, BorderLayout.CENTER);

        //total panel
        JPanel totalpane = new JPanel(new BorderLayout());
        JLabel totalTitle = new JLabel("Estimated Total Cost");

        JPanel totalbotpane = new JPanel();
        totalbotpane.setLayout(new BoxLayout(totalbotpane, BoxLayout.X_AXIS));

        JButton totalbtn = new JButton("Total");
        totalbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Total")) {
                    total = genCost /*+ stuCost + dinCost + ws1Cost + ws2Cost + ws3Cost + ws4Cost*/;
                    totalPrice.setText("$" + String.format("%.2f", total));
                    total = 0.0;
                }
            }
        });
        totalbotpane.add(totalbtn);
        totalbotpane.add(totalPrice);

        totalpane.add(totalTitle,BorderLayout.PAGE_START);
        totalpane.add(items, BorderLayout.CENTER);
        totalpane.add(totalbotpane, BorderLayout.PAGE_END);

        //adding tabs to pane
        jtp.add("Ticket Pricing", ticketpane);
        jtp.add("Add-Ons", addonpanel);
        jtp.add("Estimated Total", totalpane);

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
