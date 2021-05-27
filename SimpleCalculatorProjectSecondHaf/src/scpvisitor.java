
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import jdk.nashorn.internal.ir.CatchNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rsa.co
 * amirreza 
 * 
 */
public class scpvisitor extends scpSHBaseVisitor<Double>{
    Map<String, Double> memory = new HashMap<String, Double>();
    int x =0;
    //String path = "Generated Coed.txt";
   //File file = new File(path);
   Graphic1 g1 = new Graphic1();
    
    
    
    @Override public Double visitNumber(scpSHParser.NumberContext ctx) {
   
        return Double.valueOf(ctx.INT().getText()); }
    
    
    @Override public Double visitBegend(scpSHParser.BegendContext ctx) {
        return visit(ctx.statements());
    }
    
    
    @Override public Double visitIfelse(scpSHParser.IfelseContext ctx) { 
        
        if (visit(ctx.expr()) ==1 )
        {/*
            FileWriter fw;
            try {
                fw = new FileWriter(file);
                 BufferedWriter bw = new BufferedWriter(fw);
                 bw.write("LD  1 , C /n");
                 fw.close();
            } catch (IOException ex) {
                Logger.getLogger(scpvisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
   */
            System.out.println("LD  1 , C");      //CG
            visit(ctx.statement(0));
                    return 0.0;
        }
        else {
            System.out.println("LD  0 , C");      //CG
            visit(ctx.statement(1));}
       
        return 0.0; }
    
    @Override public Double visitPrint(scpSHParser.PrintContext ctx) { 
        String id = ctx.identifier().getText();
         if (memory.containsKey(id))
             System.out.println("Result :"+ memory.get(id));
           
         
    else {
             System.out.println("the variable "+id +" is not defined!");
            
    
}
    return 0.0;}
    
    @Override public Double visitGGEQLLEQ(scpSHParser.GGEQLLEQContext ctx) { 
        
       double left =visit(ctx.expr(0)) ;
        double right =visit(ctx.expr(1)) ;
        
       
       if ( ctx.op.getType() == scpSHParser.GRE) {
           System.out.println("GT  "+left + " , " + right + " , c");      //cg
           return left > right ? 1.0:0.0;
       }
       else if (ctx.op.getType() == scpSHParser.GREQ ){
            System.out.println("GE  "+left + " , " + right + " , c");      //cg
           return left >= right ? 1.0:0.0;
       }
       else if (ctx.op.getType() == scpSHParser.LE ){
            System.out.println("LT  "+left + " , " + right + " , c");      //cg
           return left < right ? 1.0:0.0;
       }
       else  if (ctx.op.getType() == scpSHParser.LEQ ){
            System.out.println("LE  "+left + " , " + right + " , c");      //cg
           return left <= right ? 1.0:0.0;
       }
       else if (ctx.op.getType() == scpSHParser.EQ){
            System.out.println("EQ  "+left + " , " + right + " , c");      //cg
           return left == right ? 1.0 :0.0;
       }
       else if (ctx.op.getType() == scpSHParser.NEQ) {
            System.out.println("NEQ  "+left + " , " + right + " , c");      //cg
           return left != right ? 1.0 : 0.0;
       }
       return 2.0;
        
    }
    
    @Override public Double visitNot(scpSHParser.NotContext ctx) { 
        Double number = visit(ctx.expr());
        System.out.println("NOT  "+number+" , c");      //cg
        
        if (number ==0.0){
          //  c=1;
            return 1.0;
        }
        else{
           // c=0;
            return 0.0;
        }
       
                }
    
    
    @Override public Double visitWhile(scpSHParser.WhileContext ctx) { 
        x+=1;
        System.out.print(""+x+" : ");   //cg
        while (visit(ctx.expr()) == 1) {

            
            visit(ctx.statement());
        }
        if(visit(ctx.expr()) == 0) System.out.println("LD  0 , C");      //CG
        else System.out.println("LD  1 , C");      //CG
        
        System.out.println("GOTO  "+ x);
    
        return 0.0; }
    
    
    
    @Override public Double visitIf(scpSHParser.IfContext ctx) { 
       
      if (visit(ctx.expr()) != 0){
          
          System.out.println("LD  1 , C");      //CG
          visit(ctx.statement());
          return 0.0;
      }
      else 
            System.out.println("LD  0 , C");      //CG
        return 0.0; }
    
    
    
    
    
    @Override public Double visitIdn(scpSHParser.IdnContext ctx) { 
        String id = ctx.identifier().getText();
        
        
        if (memory.containsKey(id))
        {
            
            return memory.get(id);
        }
        
        else{
            System.out.println( "the variable "+id +" is not defined!");
        }
        return 0.0; }
    
    
    
    
    
    
    @Override public Double visitParex(scpSHParser.ParexContext ctx) { 
        return visit(ctx.expr()); }
    
    
    
    
    @Override public Double visitMULDIV(scpSHParser.MULDIVContext ctx) { 
        Double left =visit(ctx.expr(0)) ;
        Double right =visit(ctx.expr(1)) ;
       
       if ( ctx.op.getType() == scpSHParser.MUL) 
       {
             System.out.println("MUL  "+left + " , " + right + " , c");      //cg
    //       System.out.println("MOV a,c");
           return left * right;
       }
       else 
       {
             System.out.println("DIV  "+left + " , " + right + " , c");      //cg
    //       System.out.println("MOV a,c");
           return left / right;
       }
         }
    
    
    
    @Override public Double visitADDSUB(scpSHParser.ADDSUBContext ctx) { 
        Double left =visit(ctx.expr(0)) ;
        Double right =visit(ctx.expr(1)) ;
       
       if ( ctx.op.getType() == scpSHParser.ADD){
           System.out.println("ADD  "+left + " , " + right + " , c");      //cg
      //     System.out.println("MOV a, c");
          // c=left + right;
           return left + right;
       }
       else 
       {
             System.out.println("SUB  "+left + " , " + right + " , c");      //cg
     //      System.out.println("MOV a,c");
            return left - right;
       }
       
        
     
         }
        
        
    
    
    @Override public Double visitDefID(scpSHParser.DefIDContext ctx) { 
        Double value = visit(ctx.expr());
        String id = ctx.identifier().getText();
        g1.ta.append("LD "+value + " , "+id);
        System.out.println("LD "+value + " , "+id);   // cg
        memory.put(id, value);
        return value; }  
   
    
}
