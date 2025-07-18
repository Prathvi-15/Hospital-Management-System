package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame {
    Choice choice;
    JTable table;

    SearchRoom(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(130, 209, 218));
        panel.setLayout(null);
        add(panel);


        JLabel For=new JLabel("Search For Room");
        For.setBounds(250,11,186,31);
        For.setForeground(Color.white);
        For.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(For);

        JLabel status=new JLabel("Status:");
        status.setBounds(70,70,80,20);
        status.setForeground(Color.white);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);

        choice=new Choice();
        choice.setBounds(170,70,120,20);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        table=new JTable();
        table.setBounds(0,187,700,210);
        table.setBackground(new Color(130, 209, 218));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            conn c=new conn();
            String q="select * from room";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel Roomno=new JLabel("Room Number");
        Roomno.setBounds(23,162,150,20);
        Roomno.setForeground(Color.white);
        Roomno.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Roomno);

        JLabel avilable=new JLabel("Availability");
        avilable.setBounds(200,162,150,20);
        avilable.setForeground(Color.white);
        avilable.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(avilable);

        JLabel price=new JLabel("Price");
        price.setBounds(400,162,150,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel bed=new JLabel("Bed Type");
        bed.setBounds(550,162,150,20);
        bed.setForeground(Color.white);
        bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bed);

        JButton Search=new JButton("Search");
        Search.setBounds(200,420,120,25);
        Search.setBackground(Color.BLACK);
        Search.setForeground(Color.white);
        panel.add(Search);
        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q="select * from room where Availability='"+choice.getSelectedItem()+"'";
                try{
                    conn c=new conn();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));

                }catch (Exception E){
                   E.printStackTrace();
                }


            }
        });

        JButton Back=new JButton("Back");
        Back.setBounds(380,420,120,25);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.white);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(450,250);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SearchRoom();
    }
}
