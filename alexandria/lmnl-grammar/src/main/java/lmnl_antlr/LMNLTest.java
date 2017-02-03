package lmnl_antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by bramb on 30-1-2017.
 */
public class LMNLTest {
  private static final Logger LOG = LoggerFactory.getLogger(LMNLTest.class);

  @Test
  public void testCorrectLMNLDocument() {
    String document = "[document [annotation}something{annotation]}[a}Bees [b}visit{a] flowers.{b]{document]";
    String input = "[excerpt\n" +
            "  [source [date}1915{][title}The Housekeeper{]]\n" +
            "  [author\n" +
            "    [name}Robert Frost{]\n" +
            "    [dates}1874-1963{]] }\n" +
            "[s}[l [n}144{n]}He manages to keep the upper hand{l]\n" +
            "[l [n}145{n]}On his own farm.{s] [s}He's boss.{s] [s}But as to hens:{l]\n" +
            "[l [n}146{n]}We fence our flowers in and the hens range.{l]{s]\n" +
            "{excerpt]";

    CharStream stream = new ANTLRInputStream(document);
    LMNLLexer lex = new LMNLLexer(stream);
    List<? extends Token> allTokens = lex.getAllTokens();
    for (Token token : allTokens) {
      LOG.info("token: [{}] <<{}>>", lex.getRuleNames()[token.getType() - 1], token.getText());
    }
    lex.reset();

    CommonTokenStream tokens = new CommonTokenStream(lex);
//    LMNLParser parser = new LMNLParser(tokens);
//    parser.setBuildParseTree(true);
//    ParseTree tree = parser.document();
//    LOG.info("tree={}", tree.toStringTree(parser));
//    assertThat(tree.getChildCount()).isEqualTo(9);
//
//    int numberOfSyntaxErrors = parser.getNumberOfSyntaxErrors();
//    assertThat(numberOfSyntaxErrors).isEqualTo(0); // no syntax errors
//    LOG.info("numberOfSyntaxErrors={}", numberOfSyntaxErrors);
//
//    for (int i = 0; i < tree.getChildCount(); i++) {
//      LOG.info("root.child={}", tree.getChild(i).getText());
//    }
//    assertThat(allTokens).hasSize(40);
  }


}
