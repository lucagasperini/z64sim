/* Generated By:JavaCC: Do not edit this line. AssemblerConstants.java */
package org.z64sim.assembler;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface AssemblerConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT = 5;
  /** RegularExpression Id. */
  int PROGRAM_BEGIN = 6;
  /** RegularExpression Id. */
  int PROGRAM_END = 7;
  /** RegularExpression Id. */
  int SCALE = 8;
  /** RegularExpression Id. */
  int CONSTANT = 9;
  /** RegularExpression Id. */
  int NUMBER = 10;
  /** RegularExpression Id. */
  int DEC = 11;
  /** RegularExpression Id. */
  int HEX = 12;
  /** RegularExpression Id. */
  int REG_8 = 13;
  /** RegularExpression Id. */
  int REG_16 = 14;
  /** RegularExpression Id. */
  int REG_32 = 15;
  /** RegularExpression Id. */
  int REG_64 = 16;
  /** RegularExpression Id. */
  int INSN_0 = 17;
  /** RegularExpression Id. */
  int INSN_0_WQ = 18;
  /** RegularExpression Id. */
  int INSN_0_NOSUFF = 19;
  /** RegularExpression Id. */
  int INSN_1_S = 20;
  /** RegularExpression Id. */
  int INSN_1_E = 21;
  /** RegularExpression Id. */
  int INSN_SHIFT = 22;
  /** RegularExpression Id. */
  int INSN_1_M = 23;
  /** RegularExpression Id. */
  int INSN_JC = 24;
  /** RegularExpression Id. */
  int INSN_B_E = 25;
  /** RegularExpression Id. */
  int INSN_EXT = 26;
  /** RegularExpression Id. */
  int INSN_IN = 27;
  /** RegularExpression Id. */
  int INSN_OUT = 28;
  /** RegularExpression Id. */
  int INSN_IO_S = 29;
  /** RegularExpression Id. */
  int SUFFIX = 30;
  /** RegularExpression Id. */
  int SUFFIX_BWL = 31;
  /** RegularExpression Id. */
  int SUFFIX_WQ = 32;
  /** RegularExpression Id. */
  int EXT_SUFFIX = 33;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "<COMMENT>",
    "\".org\"",
    "\".end\"",
    "<SCALE>",
    "<CONSTANT>",
    "<NUMBER>",
    "<DEC>",
    "<HEX>",
    "<REG_8>",
    "<REG_16>",
    "<REG_32>",
    "<REG_64>",
    "<INSN_0>",
    "<INSN_0_WQ>",
    "<INSN_0_NOSUFF>",
    "\"int\"",
    "<INSN_1_E>",
    "<INSN_SHIFT>",
    "<INSN_1_M>",
    "<INSN_JC>",
    "<INSN_B_E>",
    "<INSN_EXT>",
    "<INSN_IN>",
    "<INSN_OUT>",
    "<INSN_IO_S>",
    "<SUFFIX>",
    "<SUFFIX_BWL>",
    "<SUFFIX_WQ>",
    "<EXT_SUFFIX>",
    "\",\"",
    "\"*\"",
    "\"(\"",
    "\")\"",
    "\".\"",
  };

}
