/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package vos.intellij;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static vos.intellij.language.psi.VosTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Vos.flex</tt>
 */
public class _JssLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 16976 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\21\1\23\1\21\14\24\1\25\50\24\1\26\2\24\1\27\1\30\1\31\1\32"+
    "\25\24\1\33\20\21\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\21\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\21\1\24\1\56\1\57\5\21\2\24\1\60"+
    "\7\21\1\24\1\61\20\21\1\24\1\62\1\21\1\63\13\24\1\64\1\24\1\65\22\21\1\66"+
    "\5\21\1\67\11\21\1\70\1\71\1\72\1\73\1\21\1\74\2\21\1\75\3\21\1\76\2\21\1"+
    "\77\10\21\123\24\1\100\7\24\1\101\1\102\12\24\1\103\24\21\1\24\1\104\u0582"+
    "\21\1\105\u017f\21");

  /* The ZZ_CMAP_Y table has 4480 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\3"+
    "\0\1\17\1\20\1\21\1\20\2\22\1\23\3\22\1\23\71\22\1\24\1\22\1\25\1\0\1\26\1"+
    "\27\2\0\16\30\1\31\1\32\1\33\1\34\2\22\1\35\11\22\1\36\21\22\1\37\1\40\24"+
    "\22\1\41\3\22\1\23\1\42\1\41\4\22\1\0\1\43\4\30\1\44\1\45\1\0\3\22\2\46\3"+
    "\0\1\30\1\47\5\22\1\50\3\30\1\51\1\52\13\22\1\53\1\54\1\55\1\56\1\30\1\57"+
    "\2\0\1\60\3\22\3\30\1\61\12\22\1\62\1\30\1\63\1\0\1\30\1\64\3\22\1\50\1\65"+
    "\1\20\2\22\1\62\1\66\1\67\1\70\2\0\3\22\1\71\10\0\2\22\1\31\1\72\2\0\1\73"+
    "\1\30\1\74\3\30\1\75\6\22\1\76\2\30\1\77\1\22\1\100\1\30\1\41\1\22\1\101\1"+
    "\102\1\103\2\22\1\104\1\105\1\106\1\54\1\107\1\110\1\111\1\100\1\30\1\25\1"+
    "\0\1\112\1\113\1\103\2\22\1\104\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
    "\1\30\1\123\1\0\1\112\1\36\1\35\2\22\1\104\1\124\1\106\1\44\1\125\1\126\1"+
    "\0\1\100\1\30\1\0\1\42\1\112\1\102\1\103\2\22\1\104\1\124\1\106\1\54\1\117"+
    "\1\122\1\111\1\100\1\30\1\42\1\0\1\127\1\130\1\131\1\132\1\133\1\130\1\22"+
    "\1\134\1\135\1\136\1\137\1\0\1\122\1\30\2\0\1\140\1\31\1\104\2\22\1\104\1"+
    "\22\1\141\1\142\1\136\1\143\1\46\1\100\1\30\2\0\1\101\1\31\1\104\2\22\1\104"+
    "\1\144\1\106\1\142\1\136\1\143\1\145\1\100\1\30\1\146\1\0\1\112\1\31\1\104"+
    "\4\22\1\147\1\142\1\150\1\151\1\152\1\100\1\30\1\0\1\40\1\153\1\22\1\23\1"+
    "\40\2\22\1\35\1\154\1\23\1\155\1\156\1\30\1\122\1\30\1\157\1\0\1\41\5\22\1"+
    "\160\1\47\1\161\1\162\1\30\1\163\4\0\1\164\1\165\1\166\1\41\1\167\1\170\1"+
    "\160\1\171\1\172\1\173\1\30\1\174\4\0\1\126\2\0\1\163\1\30\1\163\1\175\1\176"+
    "\1\22\1\41\3\22\1\26\1\43\1\30\1\142\1\177\1\30\1\43\3\30\1\200\1\201\7\0"+
    "\5\22\1\50\1\30\1\202\1\30\1\163\1\62\1\203\1\204\1\205\1\206\1\22\1\207\1"+
    "\210\1\30\1\173\4\22\1\36\1\211\5\22\1\212\51\22\1\131\1\23\1\131\5\22\1\131"+
    "\4\22\1\131\1\23\1\131\1\22\1\23\7\22\1\131\10\22\1\213\1\0\1\43\1\163\1\0"+
    "\2\22\2\0\12\22\2\72\1\41\114\22\1\102\2\22\1\214\2\22\1\46\11\22\1\130\1"+
    "\22\1\126\1\22\1\31\1\215\1\0\2\22\1\215\1\0\2\22\1\216\1\0\1\22\1\31\1\217"+
    "\1\0\6\22\1\220\3\30\1\221\1\222\1\30\1\163\3\0\1\223\1\30\1\163\13\22\1\0"+
    "\5\22\1\224\10\22\1\72\1\0\3\22\1\23\1\30\1\225\1\30\1\225\1\122\1\30\3\22"+
    "\1\72\1\26\1\0\5\22\1\226\3\22\1\25\1\30\1\47\4\0\2\22\1\161\1\225\6\22\1"+
    "\177\1\162\3\30\1\54\1\30\1\163\1\30\1\163\1\152\1\0\1\30\1\173\10\0\1\227"+
    "\5\22\1\220\1\30\1\227\1\226\1\30\1\163\1\0\1\230\1\225\1\0\1\231\3\22\1\77"+
    "\1\205\1\30\1\64\4\22\1\62\1\30\1\225\1\0\4\22\1\220\2\30\1\0\1\30\1\232\1"+
    "\30\1\64\3\22\1\72\1\22\1\126\10\0\1\233\2\30\1\234\1\235\1\163\30\22\6\30"+
    "\1\173\1\230\42\22\2\72\4\22\2\72\1\22\1\236\3\22\1\72\6\22\1\31\1\172\1\237"+
    "\1\26\1\240\1\226\1\22\1\26\1\237\1\26\1\241\1\242\3\0\1\243\1\0\1\110\1\244"+
    "\1\0\1\245\1\246\2\0\1\42\1\152\2\0\1\22\1\26\6\0\1\30\1\200\1\247\1\30\1"+
    "\244\1\0\1\250\1\40\1\154\1\72\1\27\1\104\1\22\1\251\1\252\1\253\2\0\5\22"+
    "\1\126\116\0\5\22\1\23\5\22\1\23\20\22\1\26\1\254\1\255\1\0\4\22\1\36\1\211"+
    "\7\22\1\152\1\0\1\110\2\22\1\23\1\0\10\23\4\30\1\256\3\0\1\41\1\207\1\257"+
    "\1\26\1\41\11\22\1\23\1\260\1\41\12\22\1\212\1\252\4\22\1\72\1\41\12\22\1"+
    "\23\2\0\3\22\1\46\6\0\170\22\1\72\11\0\72\22\1\72\5\0\21\22\1\26\10\0\5\22"+
    "\1\72\41\22\1\26\2\22\1\30\1\255\2\0\5\22\1\161\1\73\1\261\3\22\1\62\12\22"+
    "\1\163\3\0\1\152\1\22\1\40\14\22\1\103\3\22\1\23\1\22\7\0\1\152\1\22\1\262"+
    "\1\263\2\22\1\50\3\0\6\22\1\226\1\0\1\64\5\22\1\220\1\30\1\173\1\0\1\30\1"+
    "\163\2\30\1\64\1\264\1\30\1\64\2\22\1\62\1\173\2\22\1\161\1\30\1\225\1\0\3"+
    "\22\1\26\1\75\5\22\1\50\1\30\1\244\1\152\1\30\1\163\1\265\1\22\1\30\1\266"+
    "\5\22\1\77\1\162\1\0\1\263\1\267\1\30\1\163\2\22\1\23\1\270\6\22\1\204\1\271"+
    "\1\224\2\0\1\272\1\22\1\50\1\273\1\0\3\274\1\0\2\23\5\22\1\212\1\72\1\0\16"+
    "\22\1\50\1\275\1\30\1\163\64\22\1\226\1\0\2\22\1\23\1\276\5\22\1\226\40\0"+
    "\55\22\1\72\15\22\1\25\4\0\1\23\1\0\1\276\1\277\1\22\1\104\1\23\1\172\1\300"+
    "\15\22\1\25\3\0\1\276\20\22\1\72\1\166\32\22\1\72\2\0\10\22\1\40\6\22\5\0"+
    "\1\22\1\25\2\30\2\0\2\30\1\301\2\0\1\302\4\0\1\303\1\236\17\22\1\26\2\0\1"+
    "\30\1\163\1\41\2\22\1\304\1\41\2\22\1\46\1\305\6\22\1\62\3\22\1\23\3\40\1"+
    "\306\4\0\1\22\1\144\2\22\1\23\2\22\1\307\1\22\1\72\1\22\1\72\4\0\17\22\1\46"+
    "\10\0\6\22\1\26\20\0\1\310\20\0\3\22\1\26\6\22\1\126\1\0\1\244\3\0\4\22\2"+
    "\0\3\22\1\46\4\22\1\62\1\47\3\22\1\72\4\22\1\226\1\22\1\257\5\0\23\22\1\72"+
    "\1\30\1\163\4\22\1\226\4\22\1\226\5\22\1\0\6\22\1\226\23\0\46\22\1\23\1\0"+
    "\2\22\1\72\1\0\1\22\23\0\1\72\1\104\4\22\1\36\1\311\2\22\1\72\1\0\2\22\1\23"+
    "\1\0\3\22\1\23\10\0\2\22\1\312\1\0\2\22\1\72\1\0\3\22\1\25\10\0\7\22\1\305"+
    "\10\0\1\313\1\73\1\144\1\41\2\22\1\226\1\116\4\0\3\22\1\26\3\22\1\26\4\0\1"+
    "\22\1\41\2\22\1\314\3\0\6\22\1\72\1\0\2\22\1\72\1\0\2\22\1\46\1\0\2\22\1\25"+
    "\15\0\11\22\1\126\6\0\6\22\1\46\1\0\6\22\1\46\41\0\1\231\6\22\1\30\1\162\3"+
    "\0\1\122\1\30\1\0\1\110\1\231\5\22\1\30\1\47\2\0\3\22\1\126\1\30\1\163\1\231"+
    "\3\22\1\161\1\30\1\142\1\30\2\0\4\22\1\315\1\0\1\231\5\22\1\50\1\30\1\316"+
    "\1\317\1\30\1\320\4\0\2\22\1\35\2\22\1\220\1\30\1\201\10\0\1\23\1\321\1\22"+
    "\1\36\1\22\1\126\5\22\1\161\1\30\1\47\1\30\1\163\1\140\1\102\1\103\2\22\1"+
    "\104\1\124\1\106\1\54\1\117\1\137\1\252\1\100\2\200\21\0\6\22\1\177\1\30\1"+
    "\202\1\46\1\30\1\163\4\0\6\22\2\30\1\322\1\0\1\30\1\163\24\0\5\22\1\161\1"+
    "\173\1\30\1\244\2\0\1\267\4\0\6\22\2\30\1\323\1\0\1\30\1\163\4\0\5\22\1\50"+
    "\1\30\1\0\1\30\1\163\6\0\3\22\1\324\1\30\1\225\1\30\1\163\54\0\10\22\1\30"+
    "\1\163\1\0\1\152\70\0\7\22\1\126\40\0\1\22\1\104\3\22\1\161\1\162\1\30\1\126"+
    "\1\0\1\30\1\163\2\0\1\40\3\22\1\325\2\30\1\43\1\162\51\0\63\22\1\25\14\0\15"+
    "\22\1\23\2\0\30\22\1\226\27\0\5\22\1\23\72\0\10\22\1\23\67\0\7\22\1\126\3"+
    "\22\1\23\1\30\1\163\14\0\3\22\1\72\1\200\1\0\6\22\1\162\1\0\1\226\1\0\1\30"+
    "\1\163\1\276\2\22\1\252\2\22\56\0\10\22\1\26\1\0\1\77\4\30\1\162\1\0\1\110"+
    "\1\231\1\22\10\0\1\126\3\0\75\22\1\26\2\0\36\22\1\46\41\0\1\25\77\0\15\22"+
    "\1\46\1\22\1\26\1\22\1\126\1\22\1\326\130\0\1\302\1\327\1\47\1\230\1\330\1"+
    "\225\3\0\1\331\22\0\1\317\67\0\12\22\1\31\10\22\1\31\1\332\1\333\1\22\1\334"+
    "\1\144\7\22\1\36\1\335\2\31\3\22\1\336\1\172\1\40\1\104\51\22\1\72\3\22\1"+
    "\104\2\22\1\212\3\22\1\212\2\22\1\31\3\22\1\31\2\22\1\23\3\22\1\23\3\22\1"+
    "\104\3\22\1\104\2\22\1\212\1\337\14\30\1\162\1\230\5\30\1\200\1\310\1\0\1"+
    "\245\2\0\1\230\1\43\1\30\52\0\1\162\2\30\1\340\1\341\1\47\72\0\30\22\1\26"+
    "\1\0\1\162\5\0\10\22\1\220\1\47\1\30\1\163\24\0\1\144\3\22\1\164\1\41\1\212"+
    "\1\342\1\250\1\343\1\164\1\236\1\164\2\212\1\121\1\22\1\35\1\22\1\226\1\344"+
    "\1\35\1\22\1\226\50\0\32\22\1\23\5\0\106\22\1\26\1\0\33\22\1\72\120\22\1\25"+
    "\53\0\3\22\1\72\134\0\36\30\2\0");

  /* The ZZ_CMAP_A table has 1832 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\2\0\1\3\1\0\1\16\1\15\1\11\1\0\1\10\1\0\1\54\1\55\1"+
    "\5\1\27\1\67\1\30\1\25\1\4\1\20\11\6\1\7\1\66\1\62\1\65\1\63\1\10\1\70\1\22"+
    "\1\23\2\22\1\26\1\23\10\12\1\21\10\12\1\21\2\12\1\56\1\17\1\57\1\64\1\24\1"+
    "\0\1\35\1\43\1\37\1\51\1\32\1\53\1\50\1\12\1\46\1\44\1\12\1\31\1\47\1\41\1"+
    "\40\1\52\1\12\1\36\1\42\1\33\1\45\1\34\1\12\1\21\2\12\1\60\1\0\1\61\7\0\1"+
    "\1\2\0\1\3\11\0\1\13\12\0\1\13\1\0\1\14\17\13\1\0\2\13\4\0\4\13\6\0\5\13\7"+
    "\0\1\13\1\0\1\13\1\0\10\14\5\13\1\0\2\13\3\0\3\13\1\0\1\13\6\0\1\13\1\14\3"+
    "\13\1\0\1\13\1\0\4\13\1\0\13\13\1\0\3\13\1\0\5\14\2\0\6\13\1\0\7\13\1\0\1"+
    "\13\7\0\15\14\1\0\1\14\1\0\2\14\1\0\2\14\1\0\1\14\3\13\5\0\3\14\5\0\3\13\7"+
    "\14\4\0\2\13\1\14\13\13\1\0\1\13\7\14\2\0\6\14\2\13\2\14\1\0\4\14\2\13\2\14"+
    "\3\13\2\0\2\13\1\14\6\13\3\14\2\0\11\13\3\14\1\13\6\0\2\14\6\13\4\14\2\13"+
    "\2\0\2\14\1\13\11\14\1\13\3\14\1\13\5\14\2\0\1\13\3\14\4\0\6\13\6\0\6\14\1"+
    "\0\11\14\6\13\3\14\1\13\2\14\1\13\7\14\2\13\2\14\2\0\2\14\1\13\3\14\1\0\10"+
    "\13\2\0\2\13\2\0\6\13\1\0\7\13\1\0\1\13\3\0\4\13\2\0\1\14\1\13\3\14\2\0\3"+
    "\14\1\13\10\0\1\14\4\0\2\13\1\0\1\13\1\0\3\14\1\0\6\13\4\0\2\13\1\0\2\13\1"+
    "\0\2\13\1\0\2\13\2\0\1\14\1\0\5\14\4\0\2\14\2\0\3\14\3\0\1\14\7\0\4\13\1\0"+
    "\1\13\7\0\4\14\3\13\1\14\2\0\1\13\1\0\2\13\1\0\3\13\2\14\1\0\3\14\2\0\1\13"+
    "\11\0\1\14\1\13\1\0\6\13\3\0\3\13\1\0\4\13\3\0\2\13\1\0\1\13\1\0\2\13\3\0"+
    "\2\13\3\0\2\13\4\0\5\14\3\0\3\14\1\0\4\14\2\0\1\13\6\0\5\14\1\0\5\13\3\0\1"+
    "\13\7\14\1\0\2\14\5\0\2\14\1\0\4\13\1\0\3\13\6\0\1\13\2\0\2\13\5\0\3\13\2"+
    "\0\1\13\3\14\1\0\4\14\1\13\5\0\3\13\1\14\7\0\1\13\2\0\2\14\1\0\7\13\1\0\1"+
    "\13\4\0\1\14\4\0\6\14\1\0\1\14\3\0\2\14\4\0\1\13\1\14\1\13\5\14\7\13\10\14"+
    "\1\0\2\14\7\0\2\13\1\0\1\13\2\0\2\13\1\0\1\13\2\0\1\13\6\0\4\13\1\0\3\13\1"+
    "\0\1\13\1\0\1\13\2\0\2\13\1\0\3\13\2\14\1\0\2\14\1\13\2\0\5\13\1\0\1\13\1"+
    "\0\6\14\2\0\2\14\2\0\4\13\5\0\1\14\1\0\1\14\1\0\1\14\4\0\2\14\5\13\10\14\11"+
    "\0\1\14\1\0\7\14\1\13\2\14\4\13\3\14\1\13\3\14\2\13\7\14\3\13\4\14\5\13\14"+
    "\14\1\13\1\14\5\0\1\13\2\0\3\13\1\0\7\13\2\0\3\14\1\3\11\13\3\14\3\0\2\13"+
    "\2\14\4\0\1\13\1\0\2\14\4\0\4\13\10\14\3\0\1\13\4\0\1\13\1\14\5\0\3\14\2\0"+
    "\1\13\1\14\1\13\5\0\4\14\4\0\4\13\4\0\5\14\3\13\3\0\10\14\5\13\2\14\3\0\3"+
    "\13\3\14\1\0\5\14\4\13\1\14\4\13\3\14\2\13\2\0\1\13\1\0\1\13\1\0\1\13\1\0"+
    "\1\13\2\0\3\13\1\0\6\13\2\0\2\13\13\3\5\0\2\1\5\0\1\3\1\14\13\0\1\14\12\0"+
    "\1\3\1\0\1\14\3\0\3\14\2\0\1\13\4\0\3\13\2\0\4\13\5\0\5\13\4\0\1\13\4\0\4"+
    "\13\3\14\2\13\4\0\1\3\4\0\3\13\1\0\5\13\3\0\2\14\2\0\3\13\6\14\1\0\3\13\1"+
    "\14\3\13\1\14\4\13\1\14\4\13\3\0\1\13\1\0\1\13\2\0\5\13\1\14\2\13\2\14\5\13"+
    "\1\0\4\13\2\14\4\0\1\13\3\14\2\13\1\14\5\13\2\14\3\0\3\13\4\0\3\13\2\14\2"+
    "\0\6\13\1\0\3\14\1\0\2\14\5\0\5\13\5\0\1\13\1\14\3\13\1\0\2\13\1\0\2\13\3"+
    "\0\2\14\10\0\3\14\1\0\1\13\1\0\1\13\3\0\4\13\4\0\1\14\6\0\2\13\2\0\3\13\3"+
    "\0\3\13\1\0\2\13\1\0\1\13\5\0\1\14\2\0\1\13\3\0\1\13\2\0\4\13\1\0\2\13\2\0"+
    "\1\13\3\14\1\0\2\14\1\0\5\13\2\14\1\0\3\13\1\14\2\0\1\13\1\0\1\14\4\13\5\0"+
    "\3\14\3\0\2\14\1\13\1\0\1\13\3\0\1\13\1\0\4\13\1\0\1\13\4\14\2\13\1\0\1\13"+
    "\1\14\3\0\1\13\3\0\2\13\3\0\3\14\2\0\6\14\2\13\3\0\2\14\1\0\2\14\3\0\6\14"+
    "\2\0\3\14\2\0\4\14\4\0\1\13\2\0\2\13\2\0\4\13\1\0\4\13\1\0\1\13\1\0\6\13\2"+
    "\0\5\13\1\0\4\13\1\0\4\13\2\0\3\14\2\0\7\14\1\0\2\14\1\0\2\14\1\0\1\13\1\0"+
    "\1\13\5\0\1\13\1\0\1\13\1\0\3\13\1\0\3\13\1\0\3\13");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\2\6"+
    "\1\7\1\1\1\4\1\10\1\11\13\6\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\3\0\1\4\1\30\1\0"+
    "\1\31\3\0\1\30\15\6\1\32\1\6\1\27\1\33"+
    "\3\0\1\34\1\0\1\35\14\6\1\32\1\6\1\32"+
    "\1\36\1\0\1\34\1\30\1\37\13\6\1\40\1\6"+
    "\1\41\1\6\1\42\4\6\1\37\1\43\4\6\1\43"+
    "\5\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\71\0\344\0\71\0\u011d"+
    "\0\u0156\0\u018f\0\u01c8\0\u0201\0\u023a\0\71\0\u0273\0\u02ac"+
    "\0\u02e5\0\u031e\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474"+
    "\0\u04ad\0\71\0\71\0\71\0\71\0\71\0\71\0\71"+
    "\0\71\0\71\0\71\0\71\0\71\0\71\0\u04e6\0\u051f"+
    "\0\u0558\0\u0591\0\u05ca\0\u0603\0\u01c8\0\71\0\u063c\0\u0675"+
    "\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d"+
    "\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u09cc\0\u0156"+
    "\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94"+
    "\0\u0156\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea\0\u0d23"+
    "\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb"+
    "\0\71\0\u0f24\0\u0f5d\0\u0b94\0\u0f96\0\u0fcf\0\u1008\0\u1041"+
    "\0\u107a\0\u10b3\0\u10ec\0\u1125\0\u115e\0\u1197\0\u11d0\0\u1209"+
    "\0\u0156\0\u1242\0\u0f24\0\u127b\0\u0156\0\u12b4\0\u12ed\0\u1326"+
    "\0\u135f\0\u0156\0\u0156\0\u1398\0\u13d1\0\u140a\0\u1443\0\u147c"+
    "\0\u14b5\0\u14ee\0\u1527\0\u1560\0\u1599";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\10\1\2\1\12\1\13\1\2\1\14\3\11"+
    "\1\10\1\15\1\11\2\16\1\17\1\20\1\21\1\22"+
    "\2\11\1\23\1\24\1\11\1\25\1\26\1\11\1\27"+
    "\3\11\1\30\1\11\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\72\0\3\3\71\0\1\47\1\50\71\0\1\6"+
    "\1\51\2\0\1\52\5\0\1\6\3\52\1\53\1\54"+
    "\1\52\2\0\23\52\23\0\1\10\2\0\4\10\3\0"+
    "\5\10\1\0\1\10\2\0\23\10\23\0\1\11\1\51"+
    "\1\0\1\10\1\11\2\10\3\0\4\11\1\10\1\0"+
    "\1\11\2\0\23\11\21\0\1\12\1\0\1\12\2\0"+
    "\4\12\3\0\5\12\1\0\1\12\2\0\23\12\15\0"+
    "\16\55\1\56\1\57\51\55\6\0\1\60\1\51\2\0"+
    "\1\52\5\0\1\60\1\61\1\52\1\61\1\0\1\54"+
    "\1\52\2\0\7\52\1\61\2\52\1\61\7\52\1\61"+
    "\23\0\1\62\11\0\1\62\56\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\63\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\10\11\1\64\12\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\4\11\1\65\16\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\4\11\1\66\16\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\67\6\11\1\70\13\11\23\0\1\11\1\51"+
    "\1\0\1\10\1\11\2\10\3\0\4\11\1\10\1\0"+
    "\1\11\2\0\12\11\1\71\10\11\23\0\1\11\1\51"+
    "\1\0\1\10\1\11\2\10\3\0\4\11\1\10\1\0"+
    "\1\11\2\0\2\11\1\72\16\11\1\73\1\11\23\0"+
    "\1\11\1\51\1\0\1\10\1\11\2\10\3\0\4\11"+
    "\1\10\1\0\1\11\2\0\15\11\1\74\5\11\23\0"+
    "\1\11\1\51\1\0\1\10\1\11\2\10\3\0\4\11"+
    "\1\10\1\0\1\11\2\0\10\11\1\75\12\11\23\0"+
    "\1\11\1\51\1\0\1\10\1\11\2\10\3\0\4\11"+
    "\1\10\1\0\1\11\2\0\1\11\1\76\21\11\23\0"+
    "\1\11\1\51\1\0\1\10\1\11\2\10\3\0\4\11"+
    "\1\10\1\0\1\11\2\0\1\77\7\11\1\100\3\11"+
    "\1\101\6\11\15\0\2\102\1\0\1\102\1\103\64\102"+
    "\5\50\1\104\63\50\4\0\1\105\72\0\1\52\1\51"+
    "\2\0\1\52\5\0\4\52\2\0\1\52\2\0\23\52"+
    "\23\0\1\53\11\0\1\53\3\0\1\53\51\0\1\106"+
    "\1\54\11\0\1\54\50\0\1\55\2\0\66\55\6\0"+
    "\1\60\1\51\2\0\1\52\5\0\1\60\3\52\1\0"+
    "\1\54\1\52\2\0\23\52\23\0\1\107\1\51\2\0"+
    "\1\52\5\0\1\107\1\52\2\107\2\0\1\107\2\0"+
    "\1\52\1\107\2\52\1\107\1\52\1\107\3\52\1\107"+
    "\5\52\1\107\1\52\1\107\23\0\1\62\11\0\1\62"+
    "\5\0\1\110\3\0\1\110\44\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\111\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\14\11\1\112\6\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\12\11\1\113\4\11\1\114\3\11\23\0\1\11"+
    "\1\51\1\0\1\10\1\11\2\10\3\0\4\11\1\10"+
    "\1\0\1\11\2\0\5\11\1\111\15\11\23\0\1\11"+
    "\1\51\1\0\1\10\1\11\2\10\3\0\4\11\1\10"+
    "\1\0\1\11\2\0\4\11\1\115\16\11\23\0\1\11"+
    "\1\51\1\0\1\10\1\11\2\10\3\0\4\11\1\10"+
    "\1\0\1\11\2\0\10\11\1\116\5\11\1\117\4\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\13\11\1\120\7\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\5\11\1\121\15\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\4\11\1\122\16\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\2\11\1\123\20\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\15\11\1\124\5\11"+
    "\23\0\1\11\1\51\1\0\1\10\1\11\2\10\3\0"+
    "\4\11\1\10\1\0\1\11\2\0\10\11\1\125\11\11"+
    "\1\126\23\0\1\11\1\51\1\0\1\10\1\11\2\10"+
    "\3\0\4\11\1\10\1\0\1\11\2\0\4\11\1\127"+
    "\16\11\23\0\1\11\1\51\1\0\1\10\1\11\2\10"+
    "\3\0\4\11\1\10\1\0\1\11\2\0\10\11\1\130"+
    "\12\11\15\0\2\102\1\0\66\102\2\103\1\0\66\103"+
    "\4\50\1\131\1\104\63\50\4\0\1\132\71\0\1\110"+
    "\71\0\1\107\1\51\2\0\1\52\5\0\1\107\1\52"+
    "\2\107\1\133\1\0\1\107\2\0\1\52\1\107\2\52"+
    "\1\107\1\52\1\107\3\52\1\107\5\52\1\107\1\52"+
    "\1\107\23\0\1\134\11\0\1\134\56\0\1\11\1\51"+
    "\1\0\1\10\1\11\2\10\3\0\4\11\1\10\1\0"+
    "\1\11\2\0\16\11\1\135\4\11\23\0\1\11\1\51"+
    "\1\0\1\10\1\11\2\10\3\0\4\11\1\10\1\0"+
    "\1\11\2\0\1\136\22\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\17\11\1\137\3\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\140\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\63\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\21\11\1\141\1\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\142\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\14\11\1\143\6\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\5\11\1\144\15\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\145\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\7\11\1\146\13\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\147\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\15\11\1\150\5\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\17\11\1\151\3\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\6\11\1\152\14\11\21\0\1\153\1\0\1\153"+
    "\1\0\1\153\1\0\4\153\2\0\7\153\1\0\24\153"+
    "\23\0\1\133\11\0\1\133\1\0\3\133\1\0\1\133"+
    "\3\0\1\133\2\0\1\133\1\0\1\133\3\0\1\133"+
    "\5\0\1\133\1\0\1\133\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\154\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\155\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\156\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\155\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\4\11\1\157\16\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\6\11\1\63\14\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\6\11\1\160\14\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\11\11\1\136\11\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\161\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\10\11\1\162\12\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\163\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\10\11\1\164\12\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\165\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\5\11\1\166\15\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\20\11\1\162\2\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\6\11\1\167\14\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\170\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\151\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\100\21\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\15\11\1\171\5\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\4\11\1\172\16\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\163\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\14\11\1\173\6\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\7\11\1\174\13\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\2\11\1\175\20\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\5\11\1\147\15\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\10\11\1\100\12\11\23\0\1\11\1\51\1\0"+
    "\1\10\1\11\2\10\3\0\4\11\1\10\1\0\1\11"+
    "\2\0\1\11\1\162\21\11\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5586];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\1\11\6\1\1\11"+
    "\13\1\15\11\1\1\3\0\2\1\1\0\1\11\3\0"+
    "\22\1\3\0\1\1\1\0\20\1\1\11\1\0\43\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _JssLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _JssLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 36: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 37: break;
          case 3: 
            { return STAR;
            } 
            // fall through
          case 38: break;
          case 4: 
            { return INTEGER;
            } 
            // fall through
          case 39: break;
          case 5: 
            { return COLON;
            } 
            // fall through
          case 40: break;
          case 6: 
            { return SYMBOL;
            } 
            // fall through
          case 41: break;
          case 7: 
            { return REFERENCE;
            } 
            // fall through
          case 42: break;
          case 8: 
            { return DOT;
            } 
            // fall through
          case 43: break;
          case 9: 
            { return SIGN;
            } 
            // fall through
          case 44: break;
          case 10: 
            { return PARENTHESIS_L;
            } 
            // fall through
          case 45: break;
          case 11: 
            { return PARENTHESIS_R;
            } 
            // fall through
          case 46: break;
          case 12: 
            { return BRACKET_L;
            } 
            // fall through
          case 47: break;
          case 13: 
            { return BRACKET_R;
            } 
            // fall through
          case 48: break;
          case 14: 
            { return BRACE_L;
            } 
            // fall through
          case 49: break;
          case 15: 
            { return BRACE_R;
            } 
            // fall through
          case 50: break;
          case 16: 
            { return ANGLE_L;
            } 
            // fall through
          case 51: break;
          case 17: 
            { return ANGLE_R;
            } 
            // fall through
          case 52: break;
          case 18: 
            { return ACCENT;
            } 
            // fall through
          case 53: break;
          case 19: 
            { return EQ;
            } 
            // fall through
          case 54: break;
          case 20: 
            { return SEMICOLON;
            } 
            // fall through
          case 55: break;
          case 21: 
            { return COMMA;
            } 
            // fall through
          case 56: break;
          case 22: 
            { return AT;
            } 
            // fall through
          case 57: break;
          case 23: 
            { return COMMENT;
            } 
            // fall through
          case 58: break;
          case 24: 
            { return DECIMAL;
            } 
            // fall through
          case 59: break;
          case 25: 
            { return STRING;
            } 
            // fall through
          case 60: break;
          case 26: 
            { return KW_DEFINE;
            } 
            // fall through
          case 61: break;
          case 27: 
            { return COMMENT_DOCUMENT;
            } 
            // fall through
          case 62: break;
          case 28: 
            { return BYTE;
            } 
            // fall through
          case 63: break;
          case 29: 
            { return KW_LET;
            } 
            // fall through
          case 64: break;
          case 30: 
            { return COMMENT_BLOCK;
            } 
            // fall through
          case 65: break;
          case 31: 
            { return KW_UNION;
            } 
            // fall through
          case 66: break;
          case 32: 
            { return KW_FLAG;
            } 
            // fall through
          case 67: break;
          case 33: 
            { return URL;
            } 
            // fall through
          case 68: break;
          case 34: 
            { return KW_SPARSE;
            } 
            // fall through
          case 69: break;
          case 35: 
            { return KW_DENSE;
            } 
            // fall through
          case 70: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
