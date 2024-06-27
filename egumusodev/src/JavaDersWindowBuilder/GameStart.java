package JavaDersWindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class GameStart extends JPanel {

    private static final long serialVersionUID = 1L;
    
    private Timer timer;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE}; // Renkler dizisi


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame frame = new JFrame();
                    GameStart panel = new GameStart();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setBounds(-7,-5, 1920, 900);
                    frame.setContentPane(panel);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the panel.
     */ 
    public GameStart() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1920, 1080);
        ImageIcon image = new ImageIcon( "C:\\Users\\egumu\\Downloads\\enes.jpg");
        panel.setLayout(null);
        add(panel);
        
        JLabel titleLabel = new JLabel("<html><div style='text-align: center;'>Hoþ Geldiniz!<br>Baþlamak Ýçin 'Baþla' Butonuna Týklayýnýz</div></html>");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(275, 190, 1200, 200);
        panel.add(titleLabel);
        titleLabel.setBackground(new Color(240, 240, 240));
        titleLabel.setForeground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 40));
        
        final JButton startButton = new JButton("Baþla");
        startButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        startButton.setBounds(800, 700, 150, 75);
        panel.add(startButton);
        JLabel backgroundLabel = new JLabel(image);
        backgroundLabel.setBounds(0, 0, 1920, 1080);
        panel.add(backgroundLabel);
        
        startButton.addMouseListener(new MouseAdapter() {
            int index = 0;
            boolean animating = false;

            @Override
            public void mouseEntered(MouseEvent e) {
                if (!animating) {
                    animating = true;
                    timer = new Timer(100, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            startButton.setBackground(colors[index]);
                            index = (index + 1) % colors.length;
                        }
                    });
                    timer.start();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                animating = false;
                startButton.setBackground(null); // Mouse týklandýðýndanda arka planý temizle
                if (timer != null) {
                    timer.stop(); // Timer'ý durdur
                }
                startButton.setBackground(UIManager.getColor("Button.background")); // Mouse týklandýðýnda arka plan rengini varsayýlan yap
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getRoot(GameStart.this);
                frame.dispose();
                Game game = new Game();
                game.startGame();
                game.setVisible(true);
            }
        });
    }
}