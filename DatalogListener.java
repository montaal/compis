// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DatalogParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DatalogParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tabledec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void enterTabledec(DatalogParser.TabledecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tabledec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void exitTabledec(DatalogParser.TabledecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factdec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void enterFactdec(DatalogParser.FactdecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factdec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void exitFactdec(DatalogParser.FactdecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actiondec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void enterActiondec(DatalogParser.ActiondecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actiondec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void exitActiondec(DatalogParser.ActiondecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code querydec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void enterQuerydec(DatalogParser.QuerydecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code querydec}
	 * labeled alternative in {@link DatalogParser#datalogProgram}.
	 * @param ctx the parse tree
	 */
	void exitQuerydec(DatalogParser.QuerydecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DatalogParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DatalogParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DatalogParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(DatalogParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(DatalogParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(DatalogParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(DatalogParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(DatalogParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(DatalogParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#headPredicate}.
	 * @param ctx the parse tree
	 */
	void enterHeadPredicate(DatalogParser.HeadPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#headPredicate}.
	 * @param ctx the parse tree
	 */
	void exitHeadPredicate(DatalogParser.HeadPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predicateList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateList(DatalogParser.PredicateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predicateList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateList(DatalogParser.PredicateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DatalogParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DatalogParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(DatalogParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(DatalogParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#stringIdList}.
	 * @param ctx the parse tree
	 */
	void enterStringIdList(DatalogParser.StringIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#stringIdList}.
	 * @param ctx the parse tree
	 */
	void exitStringIdList(DatalogParser.StringIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(DatalogParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(DatalogParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predParam}.
	 * @param ctx the parse tree
	 */
	void enterPredParam(DatalogParser.PredParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predParam}.
	 * @param ctx the parse tree
	 */
	void exitPredParam(DatalogParser.PredParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#tableParam}.
	 * @param ctx the parse tree
	 */
	void enterTableParam(DatalogParser.TableParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#tableParam}.
	 * @param ctx the parse tree
	 */
	void exitTableParam(DatalogParser.TableParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#factParam}.
	 * @param ctx the parse tree
	 */
	void enterFactParam(DatalogParser.FactParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#factParam}.
	 * @param ctx the parse tree
	 */
	void exitFactParam(DatalogParser.FactParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#headParam}.
	 * @param ctx the parse tree
	 */
	void enterHeadParam(DatalogParser.HeadParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#headParam}.
	 * @param ctx the parse tree
	 */
	void exitHeadParam(DatalogParser.HeadParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DatalogParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DatalogParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DatalogParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DatalogParser.OperatorContext ctx);
}