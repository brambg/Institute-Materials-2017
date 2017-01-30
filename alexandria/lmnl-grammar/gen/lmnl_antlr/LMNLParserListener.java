// Generated from C:/Users/bramb/workspaces/alexandria/Institute-Materials-2017/alexandria/lmnl-grammar/src/main/java/lmnl_antlr\LMNLParser.g4 by ANTLR 4.6
package lmnl_antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LMNLParser}.
 */
public interface LMNLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LMNLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(LMNLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(LMNLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMNLParser#rangeStartTag}.
	 * @param ctx the parse tree
	 */
	void enterRangeStartTag(LMNLParser.RangeStartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#rangeStartTag}.
	 * @param ctx the parse tree
	 */
	void exitRangeStartTag(LMNLParser.RangeStartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMNLParser#rangeEndTag}.
	 * @param ctx the parse tree
	 */
	void enterRangeEndTag(LMNLParser.RangeEndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#rangeEndTag}.
	 * @param ctx the parse tree
	 */
	void exitRangeEndTag(LMNLParser.RangeEndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMNLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(LMNLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(LMNLParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMNLParser#annotationStartTag}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationStartTag(LMNLParser.AnnotationStartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#annotationStartTag}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationStartTag(LMNLParser.AnnotationStartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMNLParser#annotationEndTag}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationEndTag(LMNLParser.AnnotationEndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMNLParser#annotationEndTag}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationEndTag(LMNLParser.AnnotationEndTagContext ctx);
}