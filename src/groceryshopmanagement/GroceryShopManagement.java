package groceryshopmanagement;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.*;

public class GroceryShopManagement {

    public static void main(String[] args) {
        new GroceryShopManagement();

    }
    JButton b1, b2;

    public GroceryShopManagement() {
        JFrame f1 = new JFrame("Grocery Shop Management");

        JButton b1 = new JButton("Admin");
        JButton b2 = new JButton("Customer");
        JLabel l1 = new JLabel("Choose an option");
        l1.setFont(new Font("serif", Font.BOLD, 20));
        l1.setBounds(150, 40, 300, 20);

        b1.setBounds(180, 100, 100, 40);
        b2.setBounds(180, 200, 100, 40);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    f1.setVisible(false);
                    new Employee();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    f1.setVisible(false);
                    new Customer();
                }
            }
        });
        f1.add(b1);
        f1.add(b2);
        f1.add(l1);

        f1.setSize(500, 600);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Employee {

    public Employee() {
        JFrame f2 = new JFrame("Employee");

        JLabel l1 = new JLabel("Enter Username ");
        l1.setBounds(50, 30, 100, 30);
        f2.add(l1);
        JTextField userName = new JTextField();

        userName.setBounds(50, 50, 150, 20);
        f2.add(userName);
        JLabel l2 = new JLabel("Enter Password ");
        l2.setBounds(50, 80, 100, 30);
        f2.add(l2);
        JPasswordField userPass = new JPasswordField();
        userPass.setBounds(50, 100, 150, 20);

        f2.add(userPass);
        JButton login = new JButton("Login");
        login.setBounds(180, 150, 100, 20);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String name = userName.getText();
                String pass = userPass.getText();

                if (name.equals("Adnan") && pass.equals("12345")) {
                    f2.setVisible(false);
                    new Activity();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

            }

        });
        {

        }
        f2.add(login);

        f2.setSize(500, 600);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Customer extends JFrame implements ActionListener {

    JLabel l, l2, l3, l4;
    JCheckBox cb1, cb2, cb3, cb4, cb5;
    JButton b;
    JTextField a1, a2, a3, a4, a5, q1, q2, q3, q4, q5;
    float sugarP, riceP, saltP, milkP, spiceP;

    public void check() {
        try {

            File file = new File("E:\\Spring 2021\\Poductlist.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                sugarP = scan.nextFloat();
                riceP = scan.nextFloat();
                spiceP = scan.nextFloat();
                saltP = scan.nextFloat();
                milkP = scan.nextFloat();

            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Customer() {

        check();
        l = new JLabel("Choose the items and quantity ");
        l.setBounds(50, 40, 300, 20);
        l.setFont(new Font("serif", Font.BOLD, 20));
        l2 = new JLabel("Goods");
        l2.setBounds(120, 70, 300, 20);
        l2.setFont(new Font("serif", Font.BOLD, 15));
        l3 = new JLabel("Price");
        l3.setFont(new Font("serif", Font.BOLD, 15));
        l3.setBounds(200, 70, 300, 20);
        l4 = new JLabel("Quantity");
        l4.setFont(new Font("serif", Font.BOLD, 15));

        l4.setBounds(270, 70, 300, 20);

        a1 = new JTextField(Float.toString(sugarP));
        a1.setBounds(200, 100, 50, 20);
        a2 = new JTextField(Float.toString(riceP));
        a2.setBounds(200, 150, 50, 20);
        a3 = new JTextField(Float.toString(spiceP));
        a3.setBounds(200, 200, 50, 20);
        a4 = new JTextField(Float.toString(saltP));
        a4.setBounds(200, 250, 50, 20);
        a5 = new JTextField(Float.toString(milkP));
        a5.setBounds(200, 300, 50, 20);

        q1 = new JTextField();
        q1.setBounds(270, 100, 50, 20);
        q2 = new JTextField();
        q2.setBounds(270, 150, 50, 20);
        q3 = new JTextField();
        q3.setBounds(270, 200, 50, 20);
        q4 = new JTextField();
        q4.setBounds(270, 250, 50, 20);
        q5 = new JTextField();
        q5.setBounds(270, 300, 50, 20);

        cb1 = new JCheckBox("Suger");

        cb1.setBounds(100, 100, 60, 20);

        cb2 = new JCheckBox("Rice");
        cb2.setBounds(100, 150, 60, 20);
        cb3 = new JCheckBox("Spices");
        cb3.setBounds(100, 200, 70, 20);
        cb4 = new JCheckBox("Salt");
        cb4.setBounds(100, 250, 60, 20);
        cb5 = new JCheckBox("Milk");
        cb5.setBounds(100, 300, 60, 20);
        b = new JButton("Order");
        b.setBounds(100, 350, 80, 30);
        b.addActionListener(this);
        add(l);
        add(l2);
        add(l3);
        add(l4);
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(a5);
        add(q1);
        add(q2);

        add(q3);

        add(q4);
        add(q5);

        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(b);
        setSize(500, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    BufferedWriter bufferedWriter = null;

    @Override
    public void actionPerformed(ActionEvent ae) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {

            amount = amount + sugarP * parseInt(q1.getText());
           
        }
        if (cb2.isSelected()) {
            amount = amount + riceP * parseInt(q2.getText());
          
        }
        if (cb3.isSelected()) {
            amount = amount + spiceP * parseInt(q3.getText());
          
        }
        if (cb4.isSelected()) {
            amount = amount + saltP * parseInt(q4.getText());
           
        }
        if (cb5.isSelected()) {
            amount = amount + milkP * parseInt(q5.getText());
         
        }
        msg += "-----------------\nSuccesfully Purchased\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
        try {

            bufferedWriter = new BufferedWriter(new FileWriter(new File("E:\\Spring 2021\\bill.txt"), true));
            try{if (parseInt(q1.getText()) >= 1) {
                bufferedWriter.write("Sugar\n" + sugarP + "\n");
            }}
            catch(Exception x1){
                
            }

            
             try{   if (parseInt(q2.getText()) >= 1) {
                    bufferedWriter.write("Rice\n" + riceP + "\n");
                }}
              catch(Exception x2){
                
            }
             
               try{ if (parseInt(q3.getText()) >= 1) {
                    bufferedWriter.write("Spices\n" + spiceP + "\n");
                }}
               catch(Exception x3){
                
            }
               
                try{if (parseInt(q4.getText()) >= 1) {
                    bufferedWriter.write("Salt\n" + saltP + "\n");
                }}
                catch(Exception x4){
               
            }
               try{ if (parseInt(q5.getText()) >= 1) {
                    bufferedWriter.write("Milk\n" + milkP + "\n");
                }
               }
               catch(Exception x5){
               
            }
               
             bufferedWriter.write("Total amount"+amount);

        } catch (FileNotFoundException exception) {
            System.out.println("file not found");
        } catch (IOException exception) {
            System.out.println("I/O Error");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e1) {
                System.out.println("I/O error");
            }
        }

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}

class Activity {

    float sugarP, riceP, saltP, milkP, spiceP;

    public Activity() {
        JFrame f4 = new JFrame();
        JButton b3=new JButton("Home");
        b3.setBounds(100, 400, 100, 30);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                f4.setVisible(false);
                 new GroceryShopManagement();
            }
            
        });
        JButton b1 = new JButton("Change Price");
        b1.setBounds(160, 100, 200, 40);
        JButton b2 = new JButton("View Bill");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    f4.setVisible(false);
                    new Change();
                }
            }
        });
        b2.setBounds(160, 150, 200, 40);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    f4.setVisible(false);
                    new Bill();
                }
            }
        });
        f4.add(b1);
        f4.add(b2);
        f4.add(b3);
        f4.setSize(500, 600);
        f4.setLayout(null);
        f4.setVisible(true);
        f4.setVisible(true);

        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Bill {
JTextArea text;
 JButton b1;
    public Bill() {
         text = new JTextArea();
        JFrame f3 = new JFrame("Bill");
        try{
            
            
            FileReader reader = new FileReader (new File("E:\\Spring 2021\\bill.txt"));
            BufferedReader br = new BufferedReader(reader);
            text.read(br,null);
            br.close();
            text.requestFocus();
            
            
        }
        catch(Exception x)
        {
            System.out.println(x);
        }
         b1=new JButton("Previous");
        b1.setBounds(100, 400, 100, 30);
        b1.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                 f3.setVisible(false);
                new Activity();
             }
            
        });
       
        text.setBounds(10,30,300,300);
        f3.add(b1);
        f3.add(text);
        f3.setSize(500, 600);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setVisible(true);
        JScrollPane scrollPane = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(20,20,300,300);
        f3.add(scrollPane);

        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}

class Change {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField a1, a2, a3, a4, a5;
    JButton b,b1;
    JFrame f3 = new JFrame("Change Price");

    public Change() {
        b = new JButton("Change");
        b.setBounds(100, 350, 80, 30);
        b1=new JButton("Previous");
        b1.setBounds(100, 400, 100, 30);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                f3.setVisible(false);
                new Activity();
            }
            
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    Formatter formatter = new Formatter("E:\\Spring 2021\\Poductlist.txt");
                    {
                        formatter.format("%s\n%s\n%s\n%s\n%s\n", a1.getText(), a2.getText(), a3.getText(), a4.getText(), a4.getText());
                        formatter.close();
                        JOptionPane.showMessageDialog(null, "Successfully Changed");
                    }
                } catch (Exception x) {

                }

            }
        });

        
        l6 = new JLabel("Goods");
        l6.setBounds(100, 70, 300, 20);
        l6.setFont(new Font("serif", Font.BOLD, 15));
        l7 = new JLabel("Price");
        l7.setFont(new Font("serif", Font.BOLD, 15));
        l7.setBounds(200, 70, 300, 20);
        l1 = new JLabel("Suger");
        l1.setBounds(100, 100, 60, 20);

        l2 = new JLabel("Rice");
        l2.setBounds(100, 150, 60, 20);
        l3 = new JLabel("Spices");
        l3.setBounds(100, 200, 60, 20);
        l4 = new JLabel("Salt");
        l4.setBounds(100, 250, 60, 20);
        l5 = new JLabel("Milk");
        l5.setBounds(100, 300, 60, 20);
        a1 = new JTextField();
        a1.setBounds(200, 100, 50, 20);
        a2 = new JTextField();
        a2.setBounds(200, 150, 50, 20);
        a3 = new JTextField();
        a3.setBounds(200, 200, 50, 20);
        a4 = new JTextField();
        a4.setBounds(200, 250, 50, 20);
        a5 = new JTextField();
        a5.setBounds(200, 300, 50, 20);
        f3.add(l1);
        f3.add(l2);
        f3.add(l3);
        f3.add(l4);
        f3.add(l5);
        f3.add(a1);
        f3.add(a2);
        f3.add(a3);
        f3.add(a4);
        f3.add(a5);
        f3.add(l6);
        f3.add(l7);
        f3.add(b);
        f3.add(b1);

        f3.setSize(500, 600);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setVisible(true);

        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


