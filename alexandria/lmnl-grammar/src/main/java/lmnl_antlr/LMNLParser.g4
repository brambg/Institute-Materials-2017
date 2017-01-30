parser grammar LMNLParser;

options { tokenVocab = LMNLLexer; }

document: (rangeStartTag | TEXT | rangeEndTag)+ ;

rangeStartTag : BEGIN_OPEN_RANGE Name_Open_Range annotation* END_OPEN_RANGE ;

rangeEndTag   : BEGIN_CLOSE_RANGE Name_Open_Range annotation* END_CLOSE_RANGE ;

annotation : annotationStartTag ANNO_TEXT annotationEndTag ;

annotationStartTag : BEGIN_OPEN_ANNO annotation* END_OPEN_ANNO ;

annotationEndTag : BEGIN_CLOSE_ANNO annotation* END_CLOSE_ANNO ;
