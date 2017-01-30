// Generated from C:/Users/bramb/workspaces/alexandria/Institute-Materials-2017/alexandria/lmnl-grammar/src/main/java/lmnl_antlr\LMNLParser.g4 by ANTLR 4.6
package lmnl_antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LMNLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LMNLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LMNLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(LMNLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMNLParser#rangeStartTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeStartTag(LMNLParser.RangeStartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMNLParser#rangeEndTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeEndTag(LMNLParser.RangeEndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMNLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(LMNLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMNLParser#annotationStartTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationStartTag(LMNLParser.AnnotationStartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMNLParser#annotationEndTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationEndTag(LMNLParser.AnnotationEndTagContext ctx);
}