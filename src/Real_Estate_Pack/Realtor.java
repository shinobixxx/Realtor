package Real_Estate_Pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Realtor extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField name;
	private JTextField lastname;
	private JTextField phone;
	private JTextField type;
	private JTextField address;
	private JTextField size;
	private JTextField bedrooms;
	private JTextField wc;
	private Controller ctrl = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Realtor frame = new Realtor();
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
	public Realtor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("184px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("413px"),},
			new RowSpec[] {
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("25px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				RowSpec.decode("31px"),
				RowSpec.decode("25px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				RowSpec.decode("56px"),
				RowSpec.decode("23px"),}));
		
		JLabel lblNewLabel = new JLabel("Στοιχεία Ιδιοκτήτη");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "2, 2, left, top");
		
		JLabel label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 :");
		contentPane.add(label, "2, 4, fill, center");
		
		name = new JTextField();
		contentPane.add(name, "4, 4, fill, top");
		name.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF :");
		contentPane.add(label_1, "2, 6, fill, center");
		
		lastname = new JTextField();
		contentPane.add(lastname, "4, 6, fill, top");
		lastname.setColumns(10);
		
		JLabel label_2 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF :");
		contentPane.add(label_2, "2, 8, fill, center");
		
		phone = new JTextField();
		contentPane.add(phone, "4, 8, fill, top");
		phone.setColumns(10);
		
		JLabel label_3 = new JLabel("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u0391\u03BA\u03B9\u03BD\u03AE\u03C4\u03BF\u03C5");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(label_3, "2, 10, fill, top");
		
		JLabel label_4 = new JLabel("\u03A4\u03CD\u03C0\u03BF\u03C2 \u03B1\u03BA\u03B9\u03BD\u03AE\u03C4\u03BF\u03C5 :");
		contentPane.add(label_4, "2, 12, fill, center");
		
		type = new JTextField();
		contentPane.add(type, "4, 12, fill, top");
		type.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 :");
		contentPane.add(lblNewLabel_1, "2, 14, fill, center");
		
		address = new JTextField();
		contentPane.add(address, "4, 14, fill, top");
		address.setColumns(10);
		
		JLabel label_5 = new JLabel("\u03A4\u03B5\u03C4\u03C1\u03B1\u03B3\u03C9\u03BD\u03B9\u03BA\u03AC :");
		contentPane.add(label_5, "2, 16, fill, center");
		
		size = new JTextField();
		contentPane.add(size, "4, 16, fill, top");
		size.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A5\u03C0\u03BD\u03BF\u03B4\u03C9\u03BC\u03AC\u03C4\u03B9\u03B1 :");
		contentPane.add(lblNewLabel_2, "2, 18, fill, center");
		
		bedrooms = new JTextField();
		contentPane.add(bedrooms, "4, 18, fill, top");
		bedrooms.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u039C\u03C0\u03AC\u03BD\u03B9\u03B1 :");
		contentPane.add(lblNewLabel_3, "2, 20, fill, center");
		
		wc = new JTextField();
		contentPane.add(wc, "4, 20, fill, top");
		wc.setColumns(10);
		
		JButton save = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		contentPane.add(save, "2, 22, fill, top");
		
		JLabel resultPanel = new JLabel("");
		contentPane.add(resultPanel, "4, 22, fill, center");
		
		
		// Action listeners
		save.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		//begin to create & save objects
		Owner tempOwner = ctrl.createOwner(name.getText(), lastname.getText(), phone.getText());
		Property tempProperty = ctrl.createProperty(type.getText(), address.getText(), Integer.parseInt(size.getText()), Integer.parseInt(bedrooms.getText()), Integer.parseInt(wc.getText()), tempOwner);
				
		ctrl.saveProperty(tempOwner, tempProperty);
	}

}
