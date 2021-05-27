// Generated from scpSH.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scpSHParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scpSHVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code prst}
	 * labeled alternative in {@link scpSHParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrst(scpSHParser.PrstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stms}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStms(scpSHParser.StmsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stm}
	 * labeled alternative in {@link scpSHParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm(scpSHParser.StmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defID}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefID(scpSHParser.DefIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(scpSHParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(scpSHParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(scpSHParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(scpSHParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code begend}
	 * labeled alternative in {@link scpSHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegend(scpSHParser.BegendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idn}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdn(scpSHParser.IdnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(scpSHParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDSUB(scpSHParser.ADDSUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(scpSHParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULDIV(scpSHParser.MULDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parex}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParex(scpSHParser.ParexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GGEQLLEQ}
	 * labeled alternative in {@link scpSHParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGGEQLLEQ(scpSHParser.GGEQLLEQContext ctx);
	/**
	 * Visit a parse tree produced by {@link scpSHParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(scpSHParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link scpSHParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(scpSHParser.NumberContext ctx);
}