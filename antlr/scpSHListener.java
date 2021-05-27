// Generated from scpSH.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scpSHParser}.
 */
public interface scpSHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code prst}
	 * labeled alternative in {@link scpSHParser#program}.
	 * @param ctx the parse tree
	 */
	void enterPrst(scpSHParser.PrstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prst}
	 * labeled alternative in {@link scpSHParser#program}.
	 * @param ctx the parse tree
	 */
	void exitPrst(scpSHParser.PrstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stms}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStms(scpSHParser.StmsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stms}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStms(scpSHParser.StmsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stm}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStm(scpSHParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stm}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStm(scpSHParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defID}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDefID(scpSHParser.DefIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defID}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDefID(scpSHParser.DefIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(scpSHParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(scpSHParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(scpSHParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(scpSHParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(scpSHParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(scpSHParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(scpSHParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(scpSHParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code begend}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBegend(scpSHParser.BegendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code begend}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBegend(scpSHParser.BegendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idn}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdn(scpSHParser.IdnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idn}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdn(scpSHParser.IdnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(scpSHParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(scpSHParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDSUB(scpSHParser.ADDSUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDSUB(scpSHParser.ADDSUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(scpSHParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(scpSHParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULDIV(scpSHParser.MULDIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULDIV(scpSHParser.MULDIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parex}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParex(scpSHParser.ParexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parex}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParex(scpSHParser.ParexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GGEQLLEQ}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGGEQLLEQ(scpSHParser.GGEQLLEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GGEQLLEQ}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGGEQLLEQ(scpSHParser.GGEQLLEQContext ctx);
	/**
	 * Enter a parse tree produced by {@link scpSHParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(scpSHParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link scpSHParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(scpSHParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link scpSHParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(scpSHParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link scpSHParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(scpSHParser.NumberContext ctx);
}