package lmnl_antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class LMNLParserTest {
  Logger LOG = LoggerFactory.getLogger(LMNLParserTest.class);

  @Test
  public void testLMNL() throws IOException {
    String lmnl = "[a [p}1{]}bla{a]";
//    String lmnl = "This is also valid LMNL!";
    CharStream stream = new ANTLRInputStream(lmnl);
    LMNLbLexer lex = new LMNLbLexer(stream);
    LOG.info("start");
//    logTree(lex);
    logTokens(lex);
    LOG.info("end");
  }

  private void logTokens(LMNLbLexer lex) {
    Token token = lex.nextToken();
    boolean goOn = true;
    while (goOn) {
//    lex.getAllTokens().forEach(token ->
      LOG.info("'{}'\t: {};\ttoken={}; ", token.getText(), lex.getRuleNames()[token.getType() - 1], token);
//      LOG.info("token: [{}] <<{}>>", lex.getRuleNames()[token.getType() - 1], token.getText());
//    );
      token = lex.nextToken();
      goOn = token.getType() != LMNLbLexer.EOF;
    }
    lex.reset();
  }

//  private void logTree(LMNLbLexer lex) {
//    CommonTokenStream tokens = new CommonTokenStream(lex);
//    LMNLbParser parser = new LMNLbParser(tokens);
//    parser.setBuildParseTree(true);
//    ParseTree tree = parser.document();
//    LOG.info("tree={}", tree.toStringTree(parser));
//  }
}
