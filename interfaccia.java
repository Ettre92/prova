import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaccia {

    JFrame frame;
    private JButton premiButton;
    private JLabel dettagliEserciziTextArea;
    private JTextArea textArea;
    private JButton addExcercise;
    Allenamento allenamento=new Allenamento();

    public interfaccia() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Interfaccia");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());
        showpanel();
        frame.setVisible(true);
    }
    public void showpanel() {
        frame.getContentPane().removeAll(); // Rimuove tutti i componenti
        frame.getContentPane().revalidate(); // Aggiorna il layout
        frame.getContentPane().repaint();
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        premiButton = new JButton("Premi");
        dettagliEserciziTextArea = new JLabel("Dettagli Esercizi");
        textArea = new JTextArea();
        addExcercise = new JButton("Add Excercise");

        panel.add(dettagliEserciziTextArea,FlowLayout.LEFT);
        panel.add(premiButton);
        frame.add(textArea,BorderLayout.CENTER);
        frame.add(addExcercise,BorderLayout.SOUTH);
            premiButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   textArea.setText(allenamento.printEsercizi());
                }
            });
            addExcercise.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    aggiungiEsercizio();
                }
            });

    }
    public void aggiungiEsercizio() {
        frame.getContentPane().removeAll(); // Rimuove tutti i componenti
        frame.getContentPane().revalidate(); // Aggiorna il layout
        frame.getContentPane().repaint();
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel,BorderLayout.NORTH);
        JButton Cardio = new JButton("Cardio");
        JButton Forza = new JButton("Forza");
        JButton Stretching = new JButton("Stretching");
        JLabel Nome = new JLabel("Nome:");
        JTextField nome = new JTextField();
        JLabel Timer = new JLabel("Timer:");
        JTextField timer = new JTextField();
        JLabel Ripetizioni = new JLabel("Ripetizioni:");
        JTextField ripetizioni = new JTextField();
        JLabel Difficolta = new JLabel("Difficoltà:");
        JTextField difficolta = new JTextField();
        JLabel Velocita = new JLabel("Velocità:");
        JTextField velocita = new JTextField();
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        panel1.setLayout(new FlowLayout());
        frame.getContentPane().add(panel2,BorderLayout.SOUTH);
        JButton conferma = new JButton("Conferma");
        JButton esci=new JButton("Esci");
        frame.add(panel1,BorderLayout.CENTER);
        panel1.setLayout(new GridLayout(5,2));
        Cardio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.revalidate();
                frame.repaint();
                panel1.add(Nome);
                panel1.add(nome);
                panel1.add(Timer);
                panel1.add(timer);
                panel1.add(Ripetizioni);
                panel1.add(ripetizioni);
                panel1.add(Difficolta);
                panel1.add(difficolta);
                panel1.add(Velocita);
                panel1.add(velocita);

                panel2.add(conferma,BorderLayout.SOUTH);
                panel2.add(esci,BorderLayout.SOUTH);
                conferma.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Cardio c=new Cardio(nome.getText(),Double.parseDouble(timer.getText()),Integer.parseInt(ripetizioni.getText()), difficolta.getText(), Integer.parseInt(velocita.getText()));
                        JOptionPane.showMessageDialog(frame,"Inserito");
                        allenamento.addEsercizio(c);
                    }
                });
                esci.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        showpanel();
                    }
                });

            }
        });
        panel.add(Cardio);
        panel.add(Forza);
        panel.add(Stretching);
    }
    public static void main(String[] args) {
        interfaccia interf = new interfaccia();
    }
}
