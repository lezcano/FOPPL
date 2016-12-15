// Generated from /home/lezkus/Documents/TFM/foppl/src/ox/foppl/grammar/foppl.g4 by ANTLR 4.5.3
package ox.foppl.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fopplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fopplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fopplParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(fopplParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(fopplParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link fopplParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(fopplParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link fopplParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(fopplParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link fopplParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(fopplParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveCallExpr}
	 * labeled alternative in {@link fopplParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveCallExpr(fopplParser.PrimitiveCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link fopplParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(fopplParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link fopplParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(fopplParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link fopplParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(fopplParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(fopplParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(fopplParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link fopplParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(fopplParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopExpr}
	 * labeled alternative in {@link fopplParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExpr(fopplParser.LoopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorExpr}
	 * labeled alternative in {@link fopplParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorExpr(fopplParser.VectorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link fopplParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(fopplParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link fopplParser#primitiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(fopplParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#unaryFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFunction(fopplParser.UnaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#binaryFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFunction(fopplParser.BinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(fopplParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fopplParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(fopplParser.ExprListContext ctx);
}