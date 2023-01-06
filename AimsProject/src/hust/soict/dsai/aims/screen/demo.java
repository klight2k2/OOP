package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.plaf.DimensionUIResource;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;

public class demo extends JFrame {
	private Store store;
	private Cart cart;
	private JTextField title;
	private JTextField category;
	private JTextField cost;
//	private ControllerScreen c;
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Option");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton btnCart = new JButton("View cart");
		
		btnCart.setPreferredSize(new Dimension(100, 50));
		btnCart.setMaximumSize(new Dimension(100, 50));
		btnCart.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					c.showCartScreen();
				}
		});
		
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(btnCart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JPanel createCenter() {
		String[] labels = {"Name: ", "Fax: ", "Email: ", "Address: "};
		int numPairs = labels.length;
		SpringLayout layout =new SpringLayout();
		ArrayList<JTextField> listText=new ArrayList<>();
//		layout.putConstraint(SpringLayout.WEST, textField,
//				5,
//				SpringLayout.EAST, label);
//		layout.putConstraint(SpringLayout.NORTH, textField,
//				5,
//				SpringLayout.NORTH, contentPane);
		JPanel p = new JPanel(layout);
		title= new  JTextField();
//		center.add(new JTextField("Text field", 15));
//		center.add(new JTextField("gfg field", 100));
//		center.add(new JLabel("title"));
		for (int i = 0; i < numPairs; i++) {
		    JLabel l = new JLabel(labels[i], JLabel.TRAILING);
		    p.add(l);
		    JTextField textField = new JTextField(10);
		    listText.add(textField);
		    l.setLabelFor(textField);
		    p.add(textField);
		}
		System.out.print(listText.size());
		JButton tes=new JButton("add");
		tes.setVisible(false);
		p.add(tes);
		p.setPreferredSize(new Dimension(300, 300));
		p.add(new JButton("add"));
		SpringUtilities.makeCompactGrid(p,
                5, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad

//		//Lay out the panel.
//		SpringUtilities.makeCompactGrid(p,
//		                                numPairs, 2, //rows, cols
//		                                6, 6,        //initX, initY
//		                                6, 6);       //xPad, yPad
		p.setMaximumSize( new Dimension(
				100,
				300
				) );
		return p;
	}
	
	public demo(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
//		this.c=c;
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd3.getId());
		store.addMedia(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd4.getId());
		store.addMedia(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd5.getId());
		store.addMedia(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd6.getId());
		store.addMedia(dvd6);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
		
	}
	
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
	
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd3.getId());
		store.addMedia(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd4.getId());
		store.addMedia(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd5.getId());
		store.addMedia(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd6.getId());
		store.addMedia(dvd6);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd7.getId());
		store.addMedia(dvd7);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd8.getId());
		store.addMedia(dvd8);
		store.addMedia(dvd8);
		store.addMedia(dvd8);
		
//		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin",
//		"Animation", 18.99f);
//		System.out.println(dvd9.getId());
//		store.addMedia(dvd9);
		
		demo test=new demo(store, cart);
		test.pack();
	}

}