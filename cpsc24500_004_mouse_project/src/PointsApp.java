import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	//todo: add toString
}
class PointWriter {
	public static boolean write(File f, ArrayList<Point> pts) {
		try {
			//todo: add code to write the points
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
class PointPanel extends JPanel implements MouseListener, MouseMotionListener {
	private ArrayList<Point> points;
	// write code for it, including paintComponent and the various mouse handlers
}
class PointFrame extends JFrame {
	private ArrayList<Point> points;
	public PointFrame(ArrayList<Point> points) {
		this.points = points;
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Points");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// add code to show JFileChooser and save the points
				} catch (Exception ex) {
					System.out.println("Could not save the file.");
				}
			}
		});
		panSouth.add(btnSave);
		c.add(panSouth,BorderLayout.SOUTH);
		// todo: create the PointPanel and add it to the center section
	}
}
public class PointsApp {
	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		PointFrame pf = new PointFrame(points);
		pf.setVisible(true);
	}
}
