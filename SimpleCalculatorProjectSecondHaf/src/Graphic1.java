/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Rsa.co
 */
public class Graphic1 extends JFrame{
    
  private JTextField input;
  private JButton ok,cd,re ;
  public JScrollPane scrl;
  public static JTextArea ta ;
  public  static String s1 , st;
  CharStream input2 ;
  scpSHLexer lexer;
  scpSHParser parser;
  scpSHParser.ProgramContext tree;
	
	public Graphic1() {
		super("scp_start");
		setLayout(new FlowLayout());
		
		Container c1 = getContentPane();
               
                input = new JTextField("type your input string : " , 38);
		input.setFont(new Font("serif" ,Font.BOLD,14));
		input.setEditable(true);
		c1.add(input,BorderLayout.NORTH);
                
                	input.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				if(event.getActionCommand()!=null){ s1 = event.getActionCommand();
                                   
				}
			}
		});
                
                ok = new JButton("SHOW TREE");
	        ok.setToolTipText("displayparse tree");
                c1.add(ok,BorderLayout.SOUTH);
	        ok.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent event){
                      input2 = new ANTLRInputStream(s1);
                     
                                    lexer = new scpSHLexer(input2);
                                     
                                    CommonTokenStream token = new CommonTokenStream(lexer);
                                     parser = new scpSHParser(token);
                                      
                                     tree = parser.program();
                                   
                 JFrame frame = new JFrame("Simple calculator project");
                    JPanel panel = new JPanel();
                    TreeViewer viewr = new TreeViewer(Arrays.asList( parser.getRuleNames()),tree);
                    viewr.setScale(1.5);//scale a little
                    panel.add(viewr, BorderLayout.NORTH);
                    Icon imc = new ImageIcon("sign.png");
                    JLabel label = new JLabel(); 
                    label.setIcon(imc); 
                    panel.add(label,BorderLayout.SOUTH);
                    frame.add(panel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(200,200);
                    frame.setVisible(true);
                    frame.setLocation(910, 380);
                 }
	         });
                
                 cd = new JButton("Code Generation");
	        cd.setToolTipText("Generates the Code");
                c1.add(cd,BorderLayout.SOUTH);
                 cd.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent event){
                     scpvisitor scpvi = new scpvisitor();
                     scpvi.visit(tree);
                     
                 }
	         });
                 re = new JButton("show result");
                 re.setToolTipText("shows the result of input");
                 c1.add(re,BorderLayout.SOUTH);
                 
                      ta = new JTextArea();
                 ta.setVisible(true);
               //  ta.append("fvjgfvjbgdjkvb \n");
                 ta.setSize(100, 100);
                 ta.setEditable(false);
                 ta.setFont(new Font("serif" ,Font.BOLD,14));
                 scrl = new JScrollPane(ta);
                 scrl.setBounds(3, 3, 500, 500);
                 c1.add(ta,BorderLayout.SOUTH);
                 c1.add(scrl);
                 
                 
                
}
        public String getinputstring(){
        return s1;
        }
    
}
