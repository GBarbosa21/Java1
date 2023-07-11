package view;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ControleJanelaAluno;

public class JanelaAluno extends JFrame{

    private JPanel contentPane;
    private JTextField textNome;
    private JTextField textTurma;
    private JTextField textIdade;
    private JTextField textMedia;
    private ControleJanelaAluno cja =
            new ControleJanelaAluno();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JanelaAluno frame = new JanelaAluno();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JanelaAluno() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 276, 243);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        JLabel lblCadastroDeAlun = new JLabel("CADASTRO DE Aluno");
        lblCadastroDeAlun.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCadastroDeAlun.setBounds(40, 11, 198, 24);
        contentPane.add(lblCadastroDeAlun);
       
        JLabel lblNome = new JLabel("NOME:");
        lblNome.setBounds(10, 49, 46, 14);
        contentPane.add(lblNome);
       
        JLabel lblTurma = new JLabel("TURMA:");
        lblTurma.setBounds(5, 74, 46, 14);
        contentPane.add(lblTurma);
       
        JLabel lblIdade = new JLabel("IDADE: ");
        lblIdade.setBounds(10, 99, 46, 14);
        contentPane.add(lblIdade);
       
        JLabel lblMedia = new JLabel("MEDIA: ");
        lblMedia.setBounds(10, 129, 46, 14);
        contentPane.add(lblMedia);
       
        textNome = new JTextField();
        textNome.setBounds(50, 46, 120, 20);
        contentPane.add(textNome);
        textNome.setColumns(10);
       
        textTurma = new JTextField();
        textTurma.setBounds(50, 71, 50, 20);
        contentPane.add(textTurma);
        textTurma.setColumns(10);
       
        textIdade = new JTextField();
        textIdade.setBounds(50, 99, 50, 20);
        contentPane.add(textIdade);
        textIdade.setColumns(10);
       
        textMedia = new JTextField();
        textMedia.setBounds(50, 126, 60, 20);
        contentPane.add(textMedia);
        textMedia.setColumns(10);
       
        JButton btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                int turma = Integer.parseInt(textTurma.getText());
                int idade = Integer.parseInt(textIdade.getText());
                String media = textMedia.getText();
               
                cja.incluirAluno(nome, turma, idade, media);
               
                JOptionPane.showMessageDialog(null,
                        "Aluno cadastrada com sucesso!");
               
                textNome.setText("");
                textTurma.setText("");
                textIdade.setText("");
                textMedia.setText("");
            }
        });
        btnCadastrar.setBounds(47, 154, 119, 23);
        contentPane.add(btnCadastrar);

    }
}
