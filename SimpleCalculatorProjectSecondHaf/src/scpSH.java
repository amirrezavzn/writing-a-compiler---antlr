
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rsa.co
 * amirreza vaezian
 */
public class scpSH {
    
      public static void main(String[] args)  throws IOException {
        // TODO code application logic here
       /*  ANTLRFileStream input = new ANTLRFileStream("string.txt");
        scpSHLexer lexer = new scpSHLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        scpSHParser parser = new scpSHParser(token);
        scpSHParser.ProgramContext tree = parser.program();
        
        scpvisitor scpvi = new scpvisitor();
        scpvi.visit(tree);
        
        
       
         JFrame frame = new JFrame("Simple calculator project");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList( parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
      //  viewr.setBoxColor(Color.yellow);
        panel.add(viewr, BorderLayout.NORTH);
        Icon imc = new ImageIcon("sign.png");
        JLabel label = new JLabel(); 
        label.setIcon(imc); 
        panel.add(label,BorderLayout.SOUTH);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setLocation(910, 380); */
        

        
          Graphic1 gp = new Graphic1();
			gp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gp.setSize(500, 500);
			gp.setVisible(true);
			gp.setLocation(700, 300);
        
        
    }
    
}
