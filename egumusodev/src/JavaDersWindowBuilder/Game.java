package JavaDersWindowBuilder;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.util.Random;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Rectangle;
public class Game extends JFrame {

	private static final long serialVersionUID = 1L;
	
	
	
	private Character randomCharacter;
	private int score = 0;
	private int soruHakki = 0;
	
	
	public void startGame() {
		 soruHakki=0;
		 	
		    Random random = new Random();
		    randomCharacter = characters[random.nextInt(characters.length)]; // Yeni rastgele karakter seç

		    // Kullanýlan label'larý temizle
		    cinsiyetLabel.setVisible(false);
		    gozlukLabel.setVisible(false);
		    sakalLabel.setVisible(false);
		    sapkaLabel.setVisible(false);
		    sarisinLabel.setVisible(false);
		    
		    button_kiz_mi.setVisible(true);
		    button_gozluklu_mu.setVisible(true);
		    button_sakali_var_mi.setVisible(true);
		    button_sapkasi_var_mi.setVisible(true);
		    button_sarisin_mi.setVisible(true);
		    
		    restartphotobutton(AlexButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Alex.PNG");
		    restartphotobutton(PaulButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Paul.PNG");
		    restartphotobutton(AnitaButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Anita.PNG");
		    restartphotobutton(AnneButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Anne.PNG");
		    restartphotobutton(BernardButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Bernard.PNG");
		    restartphotobutton(MaxButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Max.PNG");
		    restartphotobutton(CharlesButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Charles.PNG");
		    restartphotobutton(JoeButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Joe.PNG");
		    restartphotobutton(EricButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Eric.PNG");
		    restartphotobutton(ClaireButton,"C:\\Users\\egumu\\OneDrive\\Masaüstü\\Claire.PNG");


		    
		System.out.println("Rastgele Seçilen Karakter:");
	    System.out.println("Adý: " + randomCharacter.getName());
	    System.out.println("Cinsiyet: " + (randomCharacter.isFemale() ? "Kadýn" : "Erkek"));
		    
		}
	
	Character[] characters = {
		    new Character("Alex", false, false, true, false, false),
		    new Character("Paul", false, true, false, false, false),
		    new Character("Anita", true, false, false, false, true),
		    new Character("Anne", true, false, false, false, false),
		    new Character("Bernard", false, false, false, true, false),
		    new Character("Max", false, false, true, false, false),
		    new Character("Charles", false, false, true, false, true),
		    new Character("Joe", false, true, false, false, true),
		    new Character("Eric", false, false, false, true, true),
		    new Character("Claire", true, true, false, true, true)
		
		    
		};
	
	

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	
	private JLabel cinsiyetLabel = new JLabel();
	private JLabel gozlukLabel = new JLabel();
	private JLabel sakalLabel = new JLabel();
	private JLabel sapkaLabel = new JLabel();
	private JLabel sarisinLabel = new JLabel ();

	private JButton button_kiz_mi;
    private JButton button_gozluklu_mu;
    private JButton button_sakali_var_mi;
    private JButton button_sapkasi_var_mi;
    private JButton button_sarisin_mi;
    
    private JButton AlexButton;
    private JButton PaulButton;
    private JButton AnitaButton;
    private JButton AnneButton;
    private JButton BernardButton;
    private JButton MaxButton;
    private JButton CharlesButton;
    private JButton JoeButton;
    private JButton EricButton;
    private JButton ClaireButton;

    
    
    private JLabel lblNewLabel_7;
	
    private void restartphotobutton(JButton button,String path){
		ImageIcon removeCross = new ImageIcon (path);
		button.setIcon(removeCross);
	}
	private ImageIcon redCrossIcon = new ImageIcon( "C:\\Users\\egumu\\Downloads\\done.jpg");
	private void addRedCross(JButton button, Character selectedCharacter) {											// Red Cross Fonksiyonu
	    
		int unmarkedCount = countUnmarkedCharacters(); // Ä°þaretlenmemiþ karakter sayýsý
		if (unmarkedCount == 2) {
			
			score++; // Sadece bir karakter iþaretli deðilse, oyuncu kazanýr
			updateScoreLabel(score);
            System.out.printf("Tebrikler! Kazandýnýz!"+score);
            startGame();
	        
	    } else {
	    	
	        if (selectedCharacter.equals(randomCharacter)) {
	        	System.out.println("Doðru karakteri elediniz  :(  ");
		        gameIsOver();
	            
	        } else {
	            System.out.println("Harika eleme iþlemi baþarýlý, devam et!");
	            
	            button.setIcon(redCrossIcon);
	        }
	    }
	}
	public void updateScoreLabel(int score) {
	    String scoreText = "Score: " + score;
	    lblNewLabel_7.setText(scoreText);
	}
	
	private int countUnmarkedCharacters() {
	    JButton[] buttons = {AlexButton, PaulButton, AnitaButton, AnneButton, BernardButton, MaxButton, CharlesButton, JoeButton, EricButton, ClaireButton};
	    int unmarkedCount = 0;
	    for (JButton btn : buttons) {
	        if (!btn.getIcon().equals(redCrossIcon)) {
	            unmarkedCount++;
	        }
	    }
	    return unmarkedCount;
	}
	
	private void gameIsOver() {
		class CustomDialog extends JDialog {
			public CustomDialog(JFrame parent, String message) {
			    super(parent, "GAME OVER", true);
			    setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			    JPanel panel = new JPanel(new GridBagLayout());
			    GridBagConstraints gbc = new GridBagConstraints();
			    gbc.insets = new Insets(10, 10, 10, 10); // Boþluklar eklemek için

			    JLabel label = new JLabel(message);
			    label.setForeground(Color.RED);
			    label.setFont(new Font("Arial", Font.BOLD, 50));
			    gbc.gridx = 0;
			    gbc.gridy = 0;
			    gbc.anchor = GridBagConstraints.CENTER;
			    panel.add(label, gbc);
			    
			    JLabel score_label = new JLabel("Score: " + score);
			    
			    score_label.setForeground(Color.BLUE);
			    score_label.setFont(new Font("Arial", Font.BOLD, 20));
			    gbc.gridy = 1;
			    panel.add(score_label, gbc);

			    JButton yeniden_oyna = new JButton("Yeniden Oyna");
			    yeniden_oyna.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			            dispose();
			            score=0;
					 	updateScoreLabel(score);
			            startGame();
			        }
			    });
			    gbc.gridy = 2;
			    panel.add(yeniden_oyna, gbc);

			    getContentPane().add(panel);
			    pack();
			    setSize(400, 300);
			    setLocationRelativeTo(parent);
			    setResizable(false);
			    setVisible(true);
			}
		}
		new CustomDialog(this, "Game Over!");
		
	}
	
	public Game() {
		getContentPane().setForeground(new Color(207, 223, 238));
		getContentPane().setBackground(new Color(207, 223, 238));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10, -1, 1920, 1020);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 224, 224, 224, 224, 30, 30, 30, 150};
		gridBagLayout.rowHeights = new int[] {0, 50, 120, 30, 120, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_6 = new JLabel("Yanlýþ Karakterleri Ele");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 4;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 0;
		getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Score : " + "0");
		
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 8;
		gbc_lblNewLabel_7.gridy = 0;
		getContentPane().add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		
	    
	    
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		getContentPane().add(panel, gbc_panel);
		
		JLabel Alex = new JLabel();
		String Alex_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Alex.PNG";
		Alex.setIcon(new ImageIcon(Alex_path));
		panel.setLayout(new BorderLayout());
		panel.add(Alex, BorderLayout.CENTER);
		
		
		AlexButton = new JButton();
		AlexButton.setIcon(new ImageIcon(Alex_path));
		
		
		AlexButton.setOpaque(false);
		AlexButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(AlexButton, characters[0]);
		    }
		});
		
		panel.add(AlexButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 2;
		getContentPane().add(panel_1, gbc_panel_1);
		
		
		JLabel Paul = new JLabel();
		Paul.setForeground(new Color(255, 0, 0));
		String Paul_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Paul.PNG";
		Paul.setIcon(new ImageIcon(Paul_path));
		panel_1.setLayout(new BorderLayout());
		panel_1.add(Paul, BorderLayout.CENTER);
		
		PaulButton = new JButton();
		PaulButton.setIcon(new ImageIcon(Paul_path));
		PaulButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(PaulButton,characters[1]);
		    }
		});
		
		panel_1.add(PaulButton);
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1.gridx = 4;
		gbc_panel_1_1.gridy = 2;
		getContentPane().add(panel_1_1, gbc_panel_1_1);
		
		JLabel Anita = new JLabel();
		Anita.setForeground(new Color(255, 0, 0));
		String Anita_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Anita.PNG";
		Anita.setIcon(new ImageIcon(Anita_path));
		panel_1_1.setLayout(new BorderLayout());
		panel_1_1.add(Anita, BorderLayout.CENTER);
		
		AnitaButton = new JButton();
		AnitaButton.setIcon(new ImageIcon(Anita_path));
		AnitaButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(AnitaButton,characters[2]);
		    }
		});
		
		panel_1_1.add(AnitaButton);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_2 = new GridBagConstraints();
		gbc_panel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_2.gridx = 5;
		gbc_panel_1_2.gridy = 2;
		getContentPane().add(panel_1_2, gbc_panel_1_2);
		
		
		JLabel Anne = new JLabel();
		Anne.setForeground(new Color(255, 0, 0));
		String Anne_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Anne.PNG";
		Anne.setIcon(new ImageIcon(Anne_path));
		panel_1_2.setLayout(new BorderLayout());
		panel_1_2.add(Anne, BorderLayout.CENTER);
		
		
		AnneButton = new JButton();
		AnneButton.setIcon(new ImageIcon(Anne_path));
		AnneButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(AnneButton,characters[3]);
		    }
		});
		
		panel_1_2.add(AnneButton);
		
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 3;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 8;
		gbc_panel_2.gridy = 2;
		getContentPane().add(panel_2, gbc_panel_2);
		
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {50, 0, 40, 0, 0};
		gbl_panel_2.rowHeights = new int[] {40,50,30, 0, 10, 30, 0, 10, 30, 0, 10, 30, 0, 10, 30};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_2.setLayout(gbl_panel_2);
		
	   
		
		JLabel lblNewLabel_5 = new JLabel("SADECE 3 SORU HAKKIN VAR DÝKKATLÝ OL !");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_5.gridwidth = 3;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 0;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Karakter kadýn mý?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		
		
		button_kiz_mi = new JButton("Sor!");
		button_kiz_mi.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_kiz_mi = new GridBagConstraints();
		GridBagConstraints gbc_cinsiyetLabel = new GridBagConstraints();
		gbc_button_kiz_mi.insets = new Insets(0, 0, 5, 0);
		gbc_button_kiz_mi.gridx = 3;
		gbc_button_kiz_mi.gridy = 2;
		gbc_cinsiyetLabel.gridx = 3;
		gbc_cinsiyetLabel.gridy=2;
		
		panel_2.add(cinsiyetLabel,gbc_cinsiyetLabel);
		cinsiyetLabel.setVisible(false);
		panel_2.add(button_kiz_mi, gbc_button_kiz_mi);
		
		
		
		button_kiz_mi.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if(soruHakki<3) {
	            String gender = randomCharacter.isFemale() ? "Evet" : "Hayýr";
	            cinsiyetLabel.setText(gender);
	            cinsiyetLabel.setVisible(true);
	            button_kiz_mi.setVisible(false); // Butonu gizle
	            soruHakki++;
	            
	            }
	        }
	    });
		
		
		JLabel lblNewLabel_1 = new JLabel("Karakter gözlüklü mü?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		button_gozluklu_mu = new JButton("Sor!");
		button_gozluklu_mu.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_gozluklu_mu = new GridBagConstraints();
		GridBagConstraints gbc_gozlukLabel = new GridBagConstraints();
		gbc_button_gozluklu_mu.insets = new Insets(0, 0, 5, 0);
		gbc_button_gozluklu_mu.gridx = 3;
		gbc_button_gozluklu_mu.gridy = 5;
		
		gbc_gozlukLabel.gridx = 3;
		gbc_gozlukLabel.gridy = 5;
		gozlukLabel.setVisible(false);
		panel_2.add(gozlukLabel,gbc_gozlukLabel);
		panel_2.add(button_gozluklu_mu, gbc_button_gozluklu_mu);
		
		
		button_gozluklu_mu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if(soruHakki<3) {
	        	String gender = randomCharacter.hasGlasses() ? "Evet" : "Hayýr";
	            gozlukLabel.setText(gender);
	            gozlukLabel.setVisible(true);
	            button_gozluklu_mu.setVisible(false); // Butonu gizle
	            soruHakki++;
	            }
	        }
	    });
		
		
		JLabel lblNewLabel_2 = new JLabel("Karakter sakallý yada býyýklý mý?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 8;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		button_sakali_var_mi = new JButton("Sor!");
		button_sakali_var_mi.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_sakali_var_mi = new GridBagConstraints();
		GridBagConstraints gbc_sakalLabel = new GridBagConstraints();
		gbc_button_sakali_var_mi.insets = new Insets(0, 0, 5, 0);
		gbc_button_sakali_var_mi.gridx = 3;
		gbc_button_sakali_var_mi.gridy = 8;
		
		gbc_sakalLabel.gridx=3;
		gbc_sakalLabel.gridy=8;
		
		panel_2.add(sakalLabel,gbc_sakalLabel);
		sakalLabel.setVisible(false);
		panel_2.add(button_sakali_var_mi, gbc_button_sakali_var_mi);
		
		button_sakali_var_mi.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	if(soruHakki<3) {
	        	String gender = randomCharacter.hasBeard() ? "Evet" : "Hayýr";
	            sakalLabel.setText(gender);
	            sakalLabel.setVisible(true);
	            button_sakali_var_mi.setVisible(false); // Butonu gizle
	            soruHakki++;
	        	}
	        }
	    });
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Karakter þapkasý var mý?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 11;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		button_sapkasi_var_mi = new JButton("Sor!");
		button_sapkasi_var_mi.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_sapkasi_var_mi = new GridBagConstraints();
		GridBagConstraints gbc_sapkaLabel = new GridBagConstraints();
		gbc_button_sapkasi_var_mi.insets = new Insets(0, 0, 5, 0);
		gbc_button_sapkasi_var_mi.gridx = 3;
		gbc_button_sapkasi_var_mi.gridy = 11;
		
		gbc_sapkaLabel.gridx = 3;
		gbc_sapkaLabel.gridy = 11;
		
		panel_2.add(sapkaLabel,gbc_sapkaLabel);
		sapkaLabel.setVisible(false);
		panel_2.add(button_sapkasi_var_mi, gbc_button_sapkasi_var_mi);
		
		button_sapkasi_var_mi.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	if(soruHakki<3) {
	        	String gender = randomCharacter.hasHat() ? "Evet" : "Hayýr";
	            sapkaLabel.setText(gender);
	            sapkaLabel.setVisible(true);
	            button_sapkasi_var_mi.setVisible(false); // Butonu gizle
	            soruHakki++;
	        	}
	        }
	    });
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Karakter sarýþýn mý?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 14;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		button_sarisin_mi = new JButton("Sor!");
		button_sarisin_mi.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_button_sarisin_mi = new GridBagConstraints();
		GridBagConstraints gbc_sarisinLabel = new GridBagConstraints();
		gbc_button_sarisin_mi.gridx = 3;
		gbc_button_sarisin_mi.gridy = 14;
		
		gbc_sarisinLabel.gridx=3;
		gbc_sarisinLabel.gridy=14;
		
		panel_2.add(sarisinLabel,gbc_sarisinLabel);
		sarisinLabel.setVisible(false);
		panel_2.add(button_sarisin_mi, gbc_button_sarisin_mi);
		
		button_sarisin_mi.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	if(soruHakki<3) {
	        	String gender = randomCharacter.isBlonde() ? "Evet" : "Hayýr";
	            sarisinLabel.setText(gender);
	            sarisinLabel.setVisible(true);
	            button_sarisin_mi.setVisible(false); // Butonu gizle
	            soruHakki++;
	        	}
	        }
	    });
		
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_3 = new GridBagConstraints();
		gbc_panel_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_3.gridx = 2;
		gbc_panel_1_3.gridy = 4;
		getContentPane().add(panel_1_3, gbc_panel_1_3);
		
		
		JLabel Bernard = new JLabel();
		Bernard.setForeground(new Color(255, 0, 0));
		String Bernard_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Bernard.PNG";
		Bernard.setIcon(new ImageIcon(Bernard_path));
		panel_1_3.setLayout(new BorderLayout());
		panel_1_3.add(Bernard, BorderLayout.CENTER);
		
		BernardButton = new JButton();
		BernardButton.setIcon(new ImageIcon(Bernard_path));
		BernardButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(BernardButton,characters[4]);
		    }
		});
		
		panel_1_3.add(BernardButton);
		
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_4 = new GridBagConstraints();
		gbc_panel_1_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_4.gridx = 3;
		gbc_panel_1_4.gridy = 4;
		getContentPane().add(panel_1_4, gbc_panel_1_4);
		
		
		JLabel Max = new JLabel();
		Max.setForeground(new Color(255, 0, 0));
		String Max_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Max.PNG";
		Max.setIcon(new ImageIcon(Max_path));
		panel_1_4.setLayout(new BorderLayout());
		panel_1_4.add(Max, BorderLayout.CENTER);
		
		
		MaxButton = new JButton();
		MaxButton.setIcon(new ImageIcon(Max_path));
		MaxButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(MaxButton,characters[5]);
		    }
		});
		
		panel_1_4.add(MaxButton);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_5 = new GridBagConstraints();
		gbc_panel_1_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_5.gridx = 4;
		gbc_panel_1_5.gridy = 4;
		getContentPane().add(panel_1_5, gbc_panel_1_5);
		
		
		JLabel Charles = new JLabel();
		Charles.setForeground(new Color(255, 0, 0));
		String Charles_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Charles.PNG";
		Charles.setIcon(new ImageIcon(Charles_path));
		panel_1_5.setLayout(new BorderLayout());
		panel_1_5.add(Charles, BorderLayout.CENTER);
		
		
		CharlesButton = new JButton();
		CharlesButton.setIcon(new ImageIcon(Charles_path));
		CharlesButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(CharlesButton,characters[6]);
		    }
		});
		
		panel_1_5.add(CharlesButton);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_6 = new GridBagConstraints();
		gbc_panel_1_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_6.gridx = 5;
		gbc_panel_1_6.gridy = 4;
		getContentPane().add(panel_1_6, gbc_panel_1_6);
		
		
		JLabel Joe = new JLabel();
		Joe.setForeground(new Color(255, 0, 0));
		String Joe_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Joe.PNG";
		Joe.setIcon(new ImageIcon(Joe_path));
		panel_1_6.setLayout(new BorderLayout());
		panel_1_6.add(Joe, BorderLayout.CENTER);
		
		
		JoeButton = new JButton();
		JoeButton.setIcon(new ImageIcon(Joe_path));
		JoeButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(JoeButton,characters[7]);
		    }
		});
		
		panel_1_6.add(JoeButton);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_7 = new GridBagConstraints();
		gbc_panel_1_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_7.gridx = 6;
		gbc_panel_1_7.gridy = 4;
		getContentPane().add(panel_1_7, gbc_panel_1_7);
		
		
		JLabel Eric = new JLabel();
		Eric.setForeground(new Color(255, 0, 0));
		String Eric_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Eric.PNG";
		Eric.setIcon(new ImageIcon(Anne_path));
		panel_1_7.setLayout(new BorderLayout());
		panel_1_7.add(Eric, BorderLayout.CENTER);
		
		
		EricButton = new JButton();
		EricButton.setIcon(new ImageIcon(Eric_path));
		EricButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(EricButton,characters[8]);
		    }
		});
		
		panel_1_7.add(EricButton);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBackground(Color.RED);
		GridBagConstraints gbc_panel_1_8 = new GridBagConstraints();
		gbc_panel_1_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_8.gridx = 6;
		gbc_panel_1_8.gridy = 2;
		getContentPane().add(panel_1_8, gbc_panel_1_8);
		
		
		JLabel Claire = new JLabel();
		Claire.setForeground(new Color(255, 0, 0));
		String Claire_path = "C:\\Users\\egumu\\OneDrive\\Masaüstü\\Claire.PNG";
		Claire.setIcon(new ImageIcon(Claire_path));
		panel_1_8.setLayout(new BorderLayout());
		panel_1_8.add(Claire, BorderLayout.CENTER);
		
		
		ClaireButton = new JButton();
		ClaireButton.setIcon(new ImageIcon(Claire_path));
		ClaireButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        addRedCross(ClaireButton,characters[9]);
		    }
		});
		
		panel_1_8.add(ClaireButton);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, Alex, panel_1, Paul, panel_1_1, Anita, panel_1_2, Anne, panel_1_3, Bernard, panel_1_4, Max, panel_1_5, Charles, panel_1_6, Joe, panel_1_7, Eric, panel_1_8, Claire, panel_2, lblNewLabel, button_kiz_mi, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, button_gozluklu_mu, button_sakali_var_mi, button_sapkasi_var_mi, button_sarisin_mi, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7}));
		
		
		
	
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	
}
