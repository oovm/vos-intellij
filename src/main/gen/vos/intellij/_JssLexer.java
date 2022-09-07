/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package vos.intellij;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import vos.intellij.language.psi.VosTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


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
   * Total runtime size is 16944 bytes
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
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\7\1\10\1\13\1\14\3\0"+
    "\1\15\1\16\1\17\1\16\2\20\1\21\3\20\1\21\71\20\1\22\1\20\1\23\1\0\1\24\1\25"+
    "\2\0\16\26\1\27\1\30\1\31\1\32\2\20\1\33\11\20\1\34\21\20\1\35\1\36\24\20"+
    "\1\37\3\20\1\21\1\40\1\37\4\20\1\0\1\41\4\26\1\42\1\43\1\0\3\20\2\44\3\0\1"+
    "\26\1\45\5\20\1\46\3\26\1\47\1\50\13\20\1\51\1\52\1\53\1\54\1\26\1\55\2\0"+
    "\1\56\3\20\3\26\1\57\12\20\1\60\1\26\1\61\1\0\1\26\1\62\3\20\1\46\1\63\1\16"+
    "\2\20\1\60\1\64\1\65\1\66\2\0\3\20\1\67\10\0\2\20\1\27\1\70\2\0\1\71\1\26"+
    "\1\72\3\26\1\73\6\20\1\74\2\26\1\75\1\20\1\76\1\26\1\37\1\20\1\77\1\100\1"+
    "\101\2\20\1\102\1\103\1\104\1\52\1\105\1\106\1\107\1\76\1\26\1\23\1\0\1\110"+
    "\1\111\1\101\2\20\1\102\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\26\1\121"+
    "\1\0\1\110\1\34\1\33\2\20\1\102\1\122\1\104\1\42\1\123\1\124\1\0\1\76\1\26"+
    "\1\0\1\40\1\110\1\100\1\101\2\20\1\102\1\122\1\104\1\52\1\115\1\120\1\107"+
    "\1\76\1\26\1\40\1\0\1\125\1\126\1\127\1\130\1\131\1\126\1\20\1\132\1\133\1"+
    "\134\1\135\1\0\1\120\1\26\2\0\1\136\1\27\1\102\2\20\1\102\1\20\1\137\1\140"+
    "\1\134\1\141\1\44\1\76\1\26\2\0\1\77\1\27\1\102\2\20\1\102\1\142\1\104\1\140"+
    "\1\134\1\141\1\143\1\76\1\26\1\144\1\0\1\110\1\27\1\102\4\20\1\145\1\140\1"+
    "\146\1\147\1\150\1\76\1\26\1\0\1\36\1\151\1\20\1\21\1\36\2\20\1\33\1\152\1"+
    "\21\1\153\1\154\1\26\1\120\1\26\1\155\1\0\1\37\5\20\1\156\1\45\1\157\1\160"+
    "\1\26\1\161\4\0\1\162\1\163\1\164\1\37\1\165\1\166\1\156\1\167\1\170\1\171"+
    "\1\26\1\172\4\0\1\124\2\0\1\161\1\26\1\161\1\173\1\174\1\20\1\37\3\20\1\24"+
    "\1\41\1\26\1\140\1\175\1\26\1\41\3\26\1\176\1\177\7\0\5\20\1\46\1\26\1\200"+
    "\1\26\1\161\1\60\1\201\1\202\1\203\1\204\1\20\1\205\1\206\1\26\1\171\4\20"+
    "\1\34\1\207\5\20\1\210\51\20\1\127\1\21\1\127\5\20\1\127\4\20\1\127\1\21\1"+
    "\127\1\20\1\21\7\20\1\127\10\20\1\211\1\0\1\41\1\161\1\0\2\20\2\0\12\20\2"+
    "\70\1\37\114\20\1\100\2\20\1\212\2\20\1\44\11\20\1\126\1\20\1\124\1\20\1\27"+
    "\1\213\1\0\2\20\1\213\1\0\2\20\1\214\1\0\1\20\1\27\1\215\1\0\6\20\1\216\3"+
    "\26\1\217\1\220\1\26\1\161\3\0\1\221\1\26\1\161\13\20\1\0\5\20\1\222\10\20"+
    "\1\70\1\0\3\20\1\21\1\26\1\223\1\26\1\223\1\120\1\26\3\20\1\70\1\24\1\0\5"+
    "\20\1\224\3\20\1\23\1\26\1\45\4\0\2\20\1\157\1\223\6\20\1\175\1\160\3\26\1"+
    "\52\1\26\1\161\1\26\1\161\1\150\1\0\1\26\1\171\10\0\1\225\5\20\1\216\1\26"+
    "\1\225\1\224\1\26\1\161\1\0\1\226\1\223\1\0\1\227\3\20\1\75\1\203\1\26\1\62"+
    "\4\20\1\60\1\26\1\223\1\0\4\20\1\216\2\26\1\0\1\26\1\230\1\26\1\62\3\20\1"+
    "\70\1\20\1\124\10\0\1\231\2\26\1\232\1\233\1\161\30\20\6\26\1\171\1\226\42"+
    "\20\2\70\4\20\2\70\1\20\1\234\3\20\1\70\6\20\1\27\1\170\1\235\1\24\1\236\1"+
    "\224\1\20\1\24\1\235\1\24\1\237\1\240\3\0\1\241\1\0\1\106\1\242\1\0\1\243"+
    "\1\244\2\0\1\40\1\150\2\0\1\20\1\24\6\0\1\26\1\176\1\245\1\26\1\242\1\0\1"+
    "\246\1\36\1\152\1\70\1\25\1\102\1\20\1\247\1\250\1\251\2\0\5\20\1\124\116"+
    "\0\5\20\1\21\5\20\1\21\20\20\1\24\1\252\1\253\1\0\4\20\1\34\1\207\7\20\1\150"+
    "\1\0\1\106\2\20\1\21\1\0\10\21\4\26\1\254\3\0\1\37\1\205\1\255\1\24\1\37\11"+
    "\20\1\21\1\256\1\37\12\20\1\210\1\250\4\20\1\70\1\37\12\20\1\21\2\0\3\20\1"+
    "\44\6\0\170\20\1\70\11\0\72\20\1\70\5\0\21\20\1\24\10\0\5\20\1\70\41\20\1"+
    "\24\2\20\1\26\1\253\2\0\5\20\1\157\1\71\1\257\3\20\1\60\12\20\1\161\3\0\1"+
    "\150\1\20\1\36\14\20\1\101\3\20\1\21\1\20\7\0\1\150\1\20\1\260\1\261\2\20"+
    "\1\46\3\0\6\20\1\224\1\0\1\62\5\20\1\216\1\26\1\171\1\0\1\26\1\161\2\26\1"+
    "\62\1\262\1\26\1\62\2\20\1\60\1\171\2\20\1\157\1\26\1\223\1\0\3\20\1\24\1"+
    "\73\5\20\1\46\1\26\1\242\1\150\1\26\1\161\1\263\1\20\1\26\1\264\5\20\1\75"+
    "\1\160\1\0\1\261\1\265\1\26\1\161\2\20\1\21\1\266\6\20\1\202\1\267\1\222\2"+
    "\0\1\270\1\20\1\46\1\271\1\0\3\272\1\0\2\21\5\20\1\210\1\70\1\0\16\20\1\46"+
    "\1\273\1\26\1\161\64\20\1\224\1\0\2\20\1\21\1\274\5\20\1\224\40\0\55\20\1"+
    "\70\15\20\1\23\4\0\1\21\1\0\1\274\1\275\1\20\1\102\1\21\1\170\1\276\15\20"+
    "\1\23\3\0\1\274\20\20\1\70\1\164\32\20\1\70\2\0\10\20\1\36\6\20\5\0\1\20\1"+
    "\23\2\26\2\0\2\26\1\277\2\0\1\300\4\0\1\301\1\234\17\20\1\24\2\0\1\26\1\161"+
    "\1\37\2\20\1\302\1\37\2\20\1\44\1\303\6\20\1\60\3\20\1\21\3\36\1\304\4\0\1"+
    "\20\1\142\2\20\1\21\2\20\1\305\1\20\1\70\1\20\1\70\4\0\17\20\1\44\10\0\6\20"+
    "\1\24\20\0\1\306\20\0\3\20\1\24\6\20\1\124\1\0\1\242\3\0\4\20\2\0\3\20\1\44"+
    "\4\20\1\60\1\45\3\20\1\70\4\20\1\224\1\20\1\255\5\0\23\20\1\70\1\26\1\161"+
    "\4\20\1\224\4\20\1\224\5\20\1\0\6\20\1\224\23\0\46\20\1\21\1\0\2\20\1\70\1"+
    "\0\1\20\23\0\1\70\1\102\4\20\1\34\1\307\2\20\1\70\1\0\2\20\1\21\1\0\3\20\1"+
    "\21\10\0\2\20\1\310\1\0\2\20\1\70\1\0\3\20\1\23\10\0\7\20\1\303\10\0\1\311"+
    "\1\71\1\142\1\37\2\20\1\224\1\114\4\0\3\20\1\24\3\20\1\24\4\0\1\20\1\37\2"+
    "\20\1\312\3\0\6\20\1\70\1\0\2\20\1\70\1\0\2\20\1\44\1\0\2\20\1\23\15\0\11"+
    "\20\1\124\6\0\6\20\1\44\1\0\6\20\1\44\41\0\1\227\6\20\1\26\1\160\3\0\1\120"+
    "\1\26\1\0\1\106\1\227\5\20\1\26\1\45\2\0\3\20\1\124\1\26\1\161\1\227\3\20"+
    "\1\157\1\26\1\140\1\26\2\0\4\20\1\313\1\0\1\227\5\20\1\46\1\26\1\314\1\315"+
    "\1\26\1\316\4\0\2\20\1\33\2\20\1\216\1\26\1\177\10\0\1\21\1\317\1\20\1\34"+
    "\1\20\1\124\5\20\1\157\1\26\1\45\1\26\1\161\1\136\1\100\1\101\2\20\1\102\1"+
    "\122\1\104\1\52\1\115\1\135\1\250\1\76\2\176\21\0\6\20\1\175\1\26\1\200\1"+
    "\44\1\26\1\161\4\0\6\20\2\26\1\320\1\0\1\26\1\161\24\0\5\20\1\157\1\171\1"+
    "\26\1\242\2\0\1\265\4\0\6\20\2\26\1\321\1\0\1\26\1\161\4\0\5\20\1\46\1\26"+
    "\1\0\1\26\1\161\6\0\3\20\1\322\1\26\1\223\1\26\1\161\54\0\10\20\1\26\1\161"+
    "\1\0\1\150\70\0\7\20\1\124\40\0\1\20\1\102\3\20\1\157\1\160\1\26\1\124\1\0"+
    "\1\26\1\161\2\0\1\36\3\20\1\323\2\26\1\41\1\160\51\0\63\20\1\23\14\0\15\20"+
    "\1\21\2\0\30\20\1\224\27\0\5\20\1\21\72\0\10\20\1\21\67\0\7\20\1\124\3\20"+
    "\1\21\1\26\1\161\14\0\3\20\1\70\1\176\1\0\6\20\1\160\1\0\1\224\1\0\1\26\1"+
    "\161\1\274\2\20\1\250\2\20\56\0\10\20\1\24\1\0\1\75\4\26\1\160\1\0\1\106\1"+
    "\227\1\20\10\0\1\124\3\0\75\20\1\24\2\0\36\20\1\44\41\0\1\23\77\0\15\20\1"+
    "\44\1\20\1\24\1\20\1\124\1\20\1\324\130\0\1\300\1\325\1\45\1\226\1\326\1\223"+
    "\3\0\1\327\22\0\1\315\67\0\12\20\1\27\10\20\1\27\1\330\1\331\1\20\1\332\1"+
    "\142\7\20\1\34\1\333\2\27\3\20\1\334\1\170\1\36\1\102\51\20\1\70\3\20\1\102"+
    "\2\20\1\210\3\20\1\210\2\20\1\27\3\20\1\27\2\20\1\21\3\20\1\21\3\20\1\102"+
    "\3\20\1\102\2\20\1\210\1\335\14\26\1\160\1\226\5\26\1\176\1\306\1\0\1\243"+
    "\2\0\1\226\1\41\1\26\52\0\1\160\2\26\1\336\1\337\1\45\72\0\30\20\1\24\1\0"+
    "\1\160\5\0\10\20\1\216\1\45\1\26\1\161\24\0\1\142\3\20\1\162\1\37\1\210\1"+
    "\340\1\246\1\341\1\162\1\234\1\162\2\210\1\117\1\20\1\33\1\20\1\224\1\342"+
    "\1\33\1\20\1\224\50\0\32\20\1\21\5\0\106\20\1\24\1\0\33\20\1\70\120\20\1\23"+
    "\53\0\3\20\1\70\134\0\36\26\2\0");

  /* The ZZ_CMAP_A table has 1816 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\2\0\1\3\1\0\1\16\1\15\1\11\1\0\1\10\1\0\1\31\1\32\1"+
    "\5\1\27\1\44\1\30\1\25\1\4\1\20\11\6\1\7\1\43\1\37\1\42\1\40\1\10\1\45\1\22"+
    "\1\23\2\22\1\26\1\23\10\12\1\21\10\12\1\21\2\12\1\33\1\17\1\34\1\41\1\24\1"+
    "\0\1\22\1\23\2\22\1\26\1\23\1\12\1\21\2\12\1\35\1\0\1\36\7\0\1\1\2\0\1\3\11"+
    "\0\1\13\12\0\1\13\1\0\1\14\17\13\1\0\2\13\4\0\4\13\6\0\5\13\7\0\1\13\1\0\1"+
    "\13\1\0\10\14\5\13\1\0\2\13\3\0\3\13\1\0\1\13\6\0\1\13\1\14\3\13\1\0\1\13"+
    "\1\0\4\13\1\0\13\13\1\0\3\13\1\0\5\14\2\0\6\13\1\0\7\13\1\0\1\13\7\0\15\14"+
    "\1\0\1\14\1\0\2\14\1\0\2\14\1\0\1\14\3\13\5\0\3\14\5\0\3\13\7\14\4\0\2\13"+
    "\1\14\13\13\1\0\1\13\7\14\2\0\6\14\2\13\2\14\1\0\4\14\2\13\2\14\3\13\2\0\2"+
    "\13\1\14\6\13\3\14\2\0\11\13\3\14\1\13\6\0\2\14\6\13\4\14\2\13\2\0\2\14\1"+
    "\13\11\14\1\13\3\14\1\13\5\14\2\0\1\13\3\14\4\0\6\13\6\0\6\14\1\0\11\14\6"+
    "\13\3\14\1\13\2\14\1\13\7\14\2\13\2\14\2\0\2\14\1\13\3\14\1\0\10\13\2\0\2"+
    "\13\2\0\6\13\1\0\7\13\1\0\1\13\3\0\4\13\2\0\1\14\1\13\3\14\2\0\3\14\1\13\10"+
    "\0\1\14\4\0\2\13\1\0\1\13\1\0\3\14\1\0\6\13\4\0\2\13\1\0\2\13\1\0\2\13\1\0"+
    "\2\13\2\0\1\14\1\0\5\14\4\0\2\14\2\0\3\14\3\0\1\14\7\0\4\13\1\0\1\13\7\0\4"+
    "\14\3\13\1\14\2\0\1\13\1\0\2\13\1\0\3\13\2\14\1\0\3\14\2\0\1\13\11\0\1\14"+
    "\1\13\1\0\6\13\3\0\3\13\1\0\4\13\3\0\2\13\1\0\1\13\1\0\2\13\3\0\2\13\3\0\2"+
    "\13\4\0\5\14\3\0\3\14\1\0\4\14\2\0\1\13\6\0\5\14\1\0\5\13\3\0\1\13\7\14\1"+
    "\0\2\14\5\0\2\14\1\0\4\13\1\0\3\13\6\0\1\13\2\0\2\13\5\0\3\13\2\0\1\13\3\14"+
    "\1\0\4\14\1\13\5\0\3\13\1\14\7\0\1\13\2\0\2\14\1\0\7\13\1\0\1\13\4\0\1\14"+
    "\4\0\6\14\1\0\1\14\3\0\2\14\4\0\1\13\1\14\1\13\5\14\7\13\10\14\1\0\2\14\7"+
    "\0\2\13\1\0\1\13\2\0\2\13\1\0\1\13\2\0\1\13\6\0\4\13\1\0\3\13\1\0\1\13\1\0"+
    "\1\13\2\0\2\13\1\0\3\13\2\14\1\0\2\14\1\13\2\0\5\13\1\0\1\13\1\0\6\14\2\0"+
    "\2\14\2\0\4\13\5\0\1\14\1\0\1\14\1\0\1\14\4\0\2\14\5\13\10\14\11\0\1\14\1"+
    "\0\7\14\1\13\2\14\4\13\3\14\1\13\3\14\2\13\7\14\3\13\4\14\5\13\14\14\1\13"+
    "\1\14\5\0\1\13\2\0\3\13\1\0\7\13\2\0\3\14\1\3\11\13\3\14\3\0\2\13\2\14\4\0"+
    "\1\13\1\0\2\14\4\0\4\13\10\14\3\0\1\13\4\0\1\13\1\14\5\0\3\14\2\0\1\13\1\14"+
    "\1\13\5\0\4\14\4\0\4\13\4\0\5\14\3\13\3\0\10\14\5\13\2\14\3\0\3\13\3\14\1"+
    "\0\5\14\4\13\1\14\4\13\3\14\2\13\2\0\1\13\1\0\1\13\1\0\1\13\1\0\1\13\2\0\3"+
    "\13\1\0\6\13\2\0\2\13\13\3\5\0\2\1\5\0\1\3\1\14\13\0\1\14\12\0\1\3\1\0\1\14"+
    "\3\0\3\14\2\0\1\13\4\0\3\13\2\0\4\13\5\0\5\13\4\0\1\13\4\0\4\13\3\14\2\13"+
    "\4\0\1\3\4\0\3\13\1\0\5\13\3\0\2\14\2\0\3\13\6\14\1\0\3\13\1\14\3\13\1\14"+
    "\4\13\1\14\4\13\3\0\1\13\1\0\1\13\2\0\5\13\1\14\2\13\2\14\5\13\1\0\4\13\2"+
    "\14\4\0\1\13\3\14\2\13\1\14\5\13\2\14\3\0\3\13\4\0\3\13\2\14\2\0\6\13\1\0"+
    "\3\14\1\0\2\14\5\0\5\13\5\0\1\13\1\14\3\13\1\0\2\13\1\0\2\13\3\0\2\14\10\0"+
    "\3\14\1\0\1\13\1\0\1\13\3\0\4\13\4\0\1\14\6\0\2\13\2\0\3\13\3\0\3\13\1\0\2"+
    "\13\1\0\1\13\5\0\1\14\2\0\1\13\3\0\1\13\2\0\4\13\1\0\2\13\2\0\1\13\3\14\1"+
    "\0\2\14\1\0\5\13\2\14\1\0\3\13\1\14\2\0\1\13\1\0\1\14\4\13\5\0\3\14\3\0\2"+
    "\14\1\13\1\0\1\13\3\0\1\13\1\0\4\13\1\0\1\13\4\14\2\13\1\0\1\13\1\14\3\0\1"+
    "\13\3\0\2\13\3\0\3\14\2\0\6\14\2\13\3\0\2\14\1\0\2\14\3\0\6\14\2\0\3\14\2"+
    "\0\4\14\4\0\1\13\2\0\2\13\2\0\4\13\1\0\4\13\1\0\1\13\1\0\6\13\2\0\5\13\1\0"+
    "\4\13\1\0\4\13\2\0\3\14\2\0\7\14\1\0\2\14\1\0\2\14\1\0\1\13\1\0\1\13\5\0\1"+
    "\13\1\0\1\13\1\0\3\13\1\0\3\13\1\0\3\13");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\2\6"+
    "\1\7\1\1\1\4\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\3\0\1\4\1\30\1\0\1\31"+
    "\3\0\1\30\1\27\1\32\3\0\1\33\1\0\1\34"+
    "\1\0\1\33\1\30\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[51];
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
    "\0\0\0\46\0\114\0\162\0\46\0\230\0\46\0\276"+
    "\0\344\0\u010a\0\u0130\0\u0156\0\u017c\0\46\0\46\0\46"+
    "\0\46\0\46\0\46\0\46\0\46\0\46\0\46\0\46"+
    "\0\46\0\46\0\46\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a"+
    "\0\u0260\0\u0130\0\46\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e"+
    "\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\46\0\u0428"+
    "\0\u044e\0\u0402\0\u0428";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[51];
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
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\47\0\3\3\46\0\1\34\1\35\46\0\1\6"+
    "\1\36\2\0\1\37\5\0\1\6\3\37\1\40\1\41"+
    "\1\37\25\0\1\10\2\0\4\10\3\0\5\10\1\0"+
    "\1\10\25\0\1\11\1\36\1\0\1\10\1\11\2\10"+
    "\3\0\4\11\1\10\1\0\1\11\23\0\1\12\1\0"+
    "\1\12\2\0\4\12\3\0\5\12\1\0\1\12\17\0"+
    "\16\42\1\43\1\44\26\42\6\0\1\45\1\36\2\0"+
    "\1\37\5\0\1\45\1\46\1\37\1\46\1\0\1\41"+
    "\1\37\25\0\1\47\11\0\1\47\25\0\2\50\1\0"+
    "\1\50\1\51\41\50\5\35\1\52\40\35\4\0\1\53"+
    "\47\0\1\37\1\36\2\0\1\37\5\0\4\37\2\0"+
    "\1\37\25\0\1\40\11\0\1\40\3\0\1\40\26\0"+
    "\1\54\1\41\11\0\1\41\25\0\1\42\2\0\43\42"+
    "\6\0\1\45\1\36\2\0\1\37\5\0\1\45\3\37"+
    "\1\0\1\41\1\37\25\0\1\55\1\36\2\0\1\37"+
    "\5\0\1\55\1\37\2\55\2\0\1\55\25\0\1\47"+
    "\11\0\1\47\5\0\1\56\17\0\2\50\1\0\43\50"+
    "\2\51\1\0\43\51\4\35\1\57\1\52\40\35\4\0"+
    "\1\60\46\0\1\56\46\0\1\55\1\36\2\0\1\37"+
    "\5\0\1\55\1\37\2\55\1\61\1\0\1\55\25\0"+
    "\1\62\11\0\1\62\31\0\1\63\1\0\1\63\1\0"+
    "\1\63\1\0\4\63\2\0\7\63\1\0\1\63\23\0"+
    "\1\61\11\0\1\61\1\0\3\61\1\0\1\61\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1140];
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
    "\1\0\1\11\2\1\1\11\1\1\1\11\6\1\16\11"+
    "\1\1\3\0\2\1\1\0\1\11\3\0\3\1\3\0"+
    "\1\1\1\0\1\11\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[51];
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
          case 30: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 31: break;
          case 3: 
            { return VosTypes.STAR;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return VosTypes.INTEGER;
            } 
            // fall through
          case 33: break;
          case 5: 
            { return VosTypes.COLON;
            } 
            // fall through
          case 34: break;
          case 6: 
            { return VosTypes.SYMBOL;
            } 
            // fall through
          case 35: break;
          case 7: 
            { return VosTypes.REFERENCE;
            } 
            // fall through
          case 36: break;
          case 8: 
            { return VosTypes.DOT;
            } 
            // fall through
          case 37: break;
          case 9: 
            { return VosTypes.SIGN;
            } 
            // fall through
          case 38: break;
          case 10: 
            { return VosTypes.PARENTHESIS_L;
            } 
            // fall through
          case 39: break;
          case 11: 
            { return VosTypes.PARENTHESIS_R;
            } 
            // fall through
          case 40: break;
          case 12: 
            { return VosTypes.BRACKET_L;
            } 
            // fall through
          case 41: break;
          case 13: 
            { return VosTypes.BRACKET_R;
            } 
            // fall through
          case 42: break;
          case 14: 
            { return VosTypes.BRACE_L;
            } 
            // fall through
          case 43: break;
          case 15: 
            { return VosTypes.BRACE_R;
            } 
            // fall through
          case 44: break;
          case 16: 
            { return VosTypes.ANGLE_L;
            } 
            // fall through
          case 45: break;
          case 17: 
            { return VosTypes.ANGLE_R;
            } 
            // fall through
          case 46: break;
          case 18: 
            { return VosTypes.ACCENT;
            } 
            // fall through
          case 47: break;
          case 19: 
            { return VosTypes.EQ;
            } 
            // fall through
          case 48: break;
          case 20: 
            { return VosTypes.SEMICOLON;
            } 
            // fall through
          case 49: break;
          case 21: 
            { return VosTypes.COMMA;
            } 
            // fall through
          case 50: break;
          case 22: 
            { return VosTypes.AT;
            } 
            // fall through
          case 51: break;
          case 23: 
            { return VosTypes.COMMENT;
            } 
            // fall through
          case 52: break;
          case 24: 
            { return VosTypes.DECIMAL;
            } 
            // fall through
          case 53: break;
          case 25: 
            { return VosTypes.STRING;
            } 
            // fall through
          case 54: break;
          case 26: 
            { return VosTypes.COMMENT_DOCUMENT;
            } 
            // fall through
          case 55: break;
          case 27: 
            { return VosTypes.BYTE;
            } 
            // fall through
          case 56: break;
          case 28: 
            { return VosTypes.COMMENT_BLOCK;
            } 
            // fall through
          case 57: break;
          case 29: 
            { return VosTypes.URL;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
