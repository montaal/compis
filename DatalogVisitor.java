// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatalogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatalogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatalogParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DatalogParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code querydec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerydec(DatalogParser.QuerydecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DatalogParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(DatalogParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#headPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadPredicate(DatalogParser.HeadPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#predicateList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateList(DatalogParser.PredicateListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DatalogParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DatalogParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#stringIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringIdList(DatalogParser.StringIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(DatalogParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#predParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredParam(DatalogParser.PredParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#tableParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableParam(DatalogParser.TableParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#factParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactParam(DatalogParser.FactParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#headParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadParam(DatalogParser.HeadParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DatalogParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(DatalogParser.OperatorContext ctx);
}