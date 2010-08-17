
package org.rascalmpl.library.rascal.parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.exceptions.FactTypeUseException;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.eclipse.imp.pdb.facts.type.Type;
import org.rascalmpl.parser.sgll.SGLL;
import org.rascalmpl.parser.sgll.stack.*;
import org.rascalmpl.values.uptr.Factory;

public class RascalRascal extends SGLL {
    private static IConstructor read(java.lang.String s, Type type) {
        try {
          return (IConstructor) new StandardTextReader().read(vf, org.rascalmpl.values.uptr.Factory.uptr, type, new ByteArrayInputStream(s.getBytes()));
        }
        catch(FactTypeUseException e){
          throw new RuntimeException("unexpected exception in generated parser", e);  
        }
        catch(IOException e){
          throw new RuntimeException("unexpected exception in generated parser", e);  
      }
    }
  
    // Production declarations
    private static final IConstructor regular__iter_star_seps__Toplevel__iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Toplevel\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__116_116_lit_it_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(116,116)])],lit(\"it\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_assert_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],lit(\"assert\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter__char_class___range__48_57_range__65_70_range__97_102_no_attrs = read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_48_iter__char_class___range__48_55_char_class___range__76_76_range__108_108_OctalLongLiteral_attrs___term__lex = read("prod([\\char-class([range(48,48)]),iter(\\char-class([range(48,55)])),\\char-class([range(76,76),range(108,108)])],sort(\"OctalLongLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_repeat_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"repeat\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___47_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___68_105_118_105_115_105_111_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"/\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Division\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___literal_Literal_Expression_attrs___term__cons___76_105_116_101_114_97_108 = read("prod([label(\"literal\",sort(\"Literal\"))],sort(\"Expression\"),attrs([term(cons(\"Literal\"))]))", Factory.Production);
    private static final IConstructor prod___lit_node_RascalReservedKeywords_no_attrs = read("prod([lit(\"node\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_name_Name_TypeArg_attrs___term__cons___78_97_109_101_100 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"name\",sort(\"Name\"))],sort(\"TypeArg\"),attrs([term(cons(\"Named\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__111_111_lit_do_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(111,111)])],lit(\"do\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__99_99_char_class___range__102_102_lit_cf_attrs___term__literal = read("prod([\\char-class([range(99,99)]),\\char-class([range(102,102)])],lit(\"cf\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_lex_RascalReservedKeywords_no_attrs = read("prod([lit(\"lex\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(102,102)])],lit(\"if\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__111_111_char_class___range__110_110_lit_on_attrs___term__literal = read("prod([\\char-class([range(111,111)]),\\char-class([range(110,110)])],lit(\"on\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_node_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"node\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit___111_110_32_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"on \"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Tag__iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Tag\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___formals_iter_star_seps__Formal__iter_star__layout_lit___44_iter_star__layout_Formals_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"formals\",\\iter-star-seps(sort(\"Formal\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]))],sort(\"Formals\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_one_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"one\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__110_110_lit_in_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(110,110)])],lit(\"in\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___33_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___78_111_110_69_113_117_97_108_115_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"!=\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"NonEquals\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___lit___39_iter_star__StringCharacter_lit___39_CaseInsensitiveStringConstant_attrs___term__lex = read("prod([lit(\"\\'\\\\\"),\\iter-star(sort(\"StringCharacter\")),lit(\"\\'\\\\\")],sort(\"CaseInsensitiveStringConstant\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___hexLong_HexLongLiteral_LongLiteral_attrs___term__cons___72_101_120_76_111_110_103_76_105_116_101_114_97_108 = read("prod([label(\"hexLong\",sort(\"HexLongLiteral\"))],sort(\"LongLiteral\"),attrs([term(cons(\"HexLongLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_55_OctalEscapeSequence_no_attrs = read("prod([\\char-class([range(48,55)])],sort(\"OctalEscapeSequence\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___91_iter_star__layout_first_Expression_iter_star__layout_lit___44_iter_star__layout_second_Expression_iter_star__layout_lit___46_46_iter_star__layout_last_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___83_116_101_112_82_97_110_103_101 = read("prod([lit(\"[\"),\\iter-star(layout()),label(\"first\",sort(\"Expression\")),\\iter-star(layout()),lit(\",\"),\\iter-star(layout()),label(\"second\",sort(\"Expression\")),\\iter-star(layout()),lit(\"..\"),\\iter-star(layout()),label(\"last\",sort(\"Expression\")),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"StepRange\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__108_108_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_lit_lang_attrs___term__literal = read("prod([\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],lit(\"lang\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_solve_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"solve\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___stringLiteral_StringLiteral_Literal_attrs___term__cons___83_116_114_105_110_103 = read("prod([label(\"stringLiteral\",sort(\"StringLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"String\"))]))", Factory.Production);
    private static final IConstructor prod___lit_bool_BasicType_attrs___term__cons___66_111_111_108 = read("prod([lit(\"bool\")],sort(\"BasicType\"),attrs([term(cons(\"Bool\"))]))", Factory.Production);
    private static final IConstructor prod___lit_return_iter_star__layout_statement_Statement_Statement_attrs___term__cons___82_101_116_117_114_110 = read("prod([lit(\"return\"),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Return\"))]))", Factory.Production);
    private static final IConstructor prod___lit_all_Kind_attrs___term__cons___65_108_108 = read("prod([lit(\"all\")],sort(\"Kind\"),attrs([term(cons(\"All\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__124_124_char_class___range__124_124_lit___124_124_attrs___term__literal = read("prod([\\char-class([range(124,124)]),\\char-class([range(124,124)])],lit(\"||\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_reified_RascalReservedKeywords_no_attrs = read("prod([lit(\"reified\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_num_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"num\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___receiver_Assignable_iter_star__layout_lit___63_iter_star__layout_defaultExpression_Expression_Assignable_attrs___term__cons___73_102_68_101_102_105_110_101_100_79_114_68_101_102_97_117_108_116 = read("prod([label(\"receiver\",sort(\"Assignable\")),\\iter-star(layout()),lit(\"?\"),\\iter-star(layout()),label(\"defaultExpression\",sort(\"Expression\"))],sort(\"Assignable\"),attrs([term(cons(\"IfDefinedOrDefault\"))]))", Factory.Production);
    private static final IConstructor prod___lit_map_BasicType_attrs___term__cons___77_97_112 = read("prod([lit(\"map\")],sort(\"BasicType\"),attrs([term(cons(\"Map\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star__RegExp_no_attrs = read("regular(\\iter-star(sort(\"RegExp\")),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_str_RascalReservedKeywords_no_attrs = read("prod([lit(\"str\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_124_TagChar_attrs___term__lex = read("prod([\\char-class([range(48,124)])],sort(\"TagChar\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___61_61_62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_109_112_108_105_99_97_116_105_111_110_assoc__right = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"==\\>\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Implication\")),assoc(right())]))", Factory.Production);
    private static final IConstructor prod___lit_throws_RascalReservedKeywords_no_attrs = read("prod([lit(\"throws\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___type_Type_TypeArg_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"type\",sort(\"Type\"))],sort(\"TypeArg\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_private_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"private\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidPathChars_iter_star__layout_expression_Expression_iter_star__layout_tail_PathTail_PathTail_attrs___term__cons___77_105_100 = read("prod([label(\"mid\",sort(\"MidPathChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"PathTail\"))],sort(\"PathTail\"),attrs([term(cons(\"Mid\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_EscapedName_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"EscapedName\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___47_iter_star__RegExp_lit___47_RegExpModifier_RegExpLiteral_attrs___term__lex = read("prod([lit(\"/\"),\\iter-star(sort(\"RegExp\")),lit(\"/\"),sort(\"RegExpModifier\")],sort(\"RegExpLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___receiver_Assignable_iter_star__layout_lit___91_iter_star__layout_subscript_Expression_iter_star__layout_lit___93_Assignable_attrs___term__cons___83_117_98_115_99_114_105_112_116 = read("prod([label(\"receiver\",sort(\"Assignable\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),label(\"subscript\",sort(\"Expression\")),\\iter-star(layout()),lit(\"]\")],sort(\"Assignable\"),attrs([term(cons(\"Subscript\"))]))", Factory.Production);
    private static final IConstructor prod___UnicodeEscape_StringCharacter_attrs___term__lex = read("prod([sort(\"UnicodeEscape\")],sort(\"StringCharacter\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_lit_type_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)])],lit(\"type\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_map_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"map\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_default_RascalReservedKeywords_no_attrs = read("prod([lit(\"default\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_lit_fun_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)])],lit(\"fun\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_throw_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"throw\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___59_Statement_attrs___term__cons___69_109_112_116_121_83_116_97_116_101_109_101_110_116 = read("prod([lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"EmptyStatement\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star__NamedRegExp_no_attrs = read("regular(\\iter-star(sort(\"NamedRegExp\")),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_module_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"module\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_alias_RascalReservedKeywords_no_attrs = read("prod([lit(\"alias\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___62_URLChars_lit___60_MidProtocolChars_attrs___term__lex = read("prod([lit(\"\\>\"),sort(\"URLChars\"),lit(\"\\<\")],sort(\"MidProtocolChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_RascalReservedKeywords_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_edit_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___69_100_105_116 = read("prod([lit(\"edit\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\"))],sort(\"ShellCommand\"),attrs([term(cons(\"Edit\"))]))", Factory.Production);
    private static final IConstructor prod___lit_module_RascalReservedKeywords_no_attrs = read("prod([lit(\"module\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__9_10_range__13_13_range__32_32_lit___58_47_47_no_attrs = read("prod([\\char-class([range(9,10),range(13,13),range(32,32)])],lit(\"://\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__58_58_iter_star__layout_char_class___range__58_58_QualifiedName_no_attrs = read("prod([\\char-class([range(58,58)]),\\iter-star(layout()),\\char-class([range(58,58)])],sort(\"QualifiedName\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_lit___110_111_110_45_97_115_115_111_99_attrs___term__literal = read("prod([\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(45,45)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],lit(\"non-assoc\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_variable_Kind_attrs___term__cons___86_97_114_105_97_98_108_101 = read("prod([lit(\"variable\")],sort(\"Kind\"),attrs([term(cons(\"Variable\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_lit_datetime_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(101,101)])],lit(\"datetime\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___45_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___83_117_98_116_114_97_99_116_105_111_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"-\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Subtraction\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___lit_fail_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___70_97_105_108 = read("prod([lit(\"fail\"),\\iter-star(layout()),label(\"target\",sort(\"Target\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"Fail\"))]))", Factory.Production);
    private static final IConstructor prod___lit_public_RascalReservedKeywords_no_attrs = read("prod([lit(\"public\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_one_RascalReservedKeywords_no_attrs = read("prod([lit(\"one\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___names_iter_seps__Name__iter_star__layout_lit___58_58_iter_star__layout_QualifiedName_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"names\",\\iter-seps(sort(\"Name\"),[\\iter-star(layout()),lit(\"::\"),\\iter-star(layout())]))],sort(\"QualifiedName\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit___64_iter_star__layout_name_Name_Tag_attrs___term__cons___69_109_112_116_121 = read("prod([lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\"))],sort(\"Tag\"),attrs([term(cons(\"Empty\"))]))", Factory.Production);
    private static final IConstructor prod___symbol_Symbol_iter_star__layout_lit___63_Declarator_attrs___term__cons___79_112_116_105_111_110_97_108 = read("prod([label(\"symbol\",sort(\"Symbol\")),\\iter-star(layout()),lit(\"?\")],sort(\"Declarator\"),attrs([term(cons(\"Optional\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___71_114_101_97_116_101_114_84_104_97_110_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\>\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"GreaterThan\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___dateTimeLiteral_DateTimeLiteral_Literal_attrs___term__cons___68_97_116_101_84_105_109_101 = read("prod([label(\"dateTimeLiteral\",sort(\"DateTimeLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"DateTime\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_TimeZonePart_attrs___term__lex = read("prod([\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)])],sort(\"TimeZonePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_lit___46_46_46_attrs___term__literal = read("prod([\\char-class([range(46,46)]),\\char-class([range(46,46)]),\\char-class([range(46,46)])],lit(\"...\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_lit_for_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],lit(\"for\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_function_Kind_attrs___term__cons___70_117_110_99_116_105_111_110 = read("prod([lit(\"function\")],sort(\"Kind\"),attrs([term(cons(\"Function\"))]))", Factory.Production);
    private static final IConstructor prod___lit_java_FunctionModifier_attrs___term__cons___74_97_118_97 = read("prod([lit(\"java\")],sort(\"FunctionModifier\"),attrs([term(cons(\"Java\"))]))", Factory.Production);
    private static final IConstructor prod___lit_adt_BasicType_attrs___term__cons___82_101_105_102_105_101_100_65_100_116 = read("prod([lit(\"adt\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedAdt\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_loc_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"loc\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_char_class___range__61_61_lit___45_61_attrs___term__literal = read("prod([\\char-class([range(45,45)]),\\char-class([range(61,61)])],lit(\"-=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_0_DecimalIntegerLiteral_attrs___term__lex = read("prod([lit(\"0\")],sort(\"DecimalIntegerLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__47_47_char_class___range__61_61_lit___47_61_attrs___term__literal = read("prod([\\char-class([range(47,47)]),\\char-class([range(61,61)])],lit(\"/=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_else_attrs___term__literal = read("prod([\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],lit(\"else\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_set_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"set\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__38_38_char_class___range__38_38_lit___38_38_attrs___term__literal = read("prod([\\char-class([range(38,38)]),\\char-class([range(38,38)])],lit(\"&&\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__42_42_char_class___range__61_61_lit___42_61_attrs___term__literal = read("prod([\\char-class([range(42,42)]),\\char-class([range(61,61)])],lit(\"*=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_lit_value_attrs___term__literal = read("prod([\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],lit(\"value\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_type_Type_iter_star__layout_variables_iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___86_97_114_105_97_98_108_101 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"variables\",\\iter-seps(sort(\"Variable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Variable\"))]))", Factory.Production);
    private static final IConstructor prod___lit___62_URLChars_lit___58_47_47_PostProtocolChars_attrs___term__lex = read("prod([lit(\"\\>\"),sort(\"URLChars\"),lit(\"://\")],sort(\"PostProtocolChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_switch_attrs___term__literal = read("prod([\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],lit(\"switch\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__43_43_char_class___range__61_61_lit___43_61_attrs___term__literal = read("prod([\\char-class([range(43,43)]),\\char-class([range(61,61)])],lit(\"+=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___60_iter_star__layout_elements_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Expression_attrs___term__cons___84_117_112_108_101 = read("prod([lit(\"\\<\"),\\iter-star(layout()),label(\"elements\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"\\>\")],sort(\"Expression\"),attrs([term(cons(\"Tuple\"))]))", Factory.Production);
    private static final IConstructor prod___lit_modules_ShellCommand_attrs___term__cons___76_105_115_116_77_111_100_117_108_101_115 = read("prod([lit(\"modules\")],sort(\"ShellCommand\"),attrs([term(cons(\"ListModules\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_return_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"return\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_try_iter_star__layout_body_Statement_iter_star__layout_handlers_iter_seps__Catch__iter_star__layout_Statement_attrs___term__cons___84_114_121_assoc__non_assoc = read("prod([lit(\"try\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\")),\\iter-star(layout()),label(\"handlers\",\\iter-seps(sort(\"Catch\"),[\\iter-star(layout())]))],sort(\"Statement\"),attrs([term(cons(\"Try\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___lit___92_char_class___range__48_55_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex = read("prod([lit(\"\\\\\"),\\char-class([range(48,55)]),\\char-class([range(48,55)])],sort(\"OctalEscapeSequence\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__TagChar_lit___125_TagString_attrs___term__lex = read("prod([lit(\"{\"),\\iter-star(sort(\"TagChar\")),lit(\"}\")],sort(\"TagString\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_TimeZonePart_attrs___term__lex = read("prod([\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)])],sort(\"TimeZonePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__33_33_char_class___range__61_61_lit___33_61_attrs___term__literal = read("prod([\\char-class([range(33,33)]),\\char-class([range(61,61)])],lit(\"!=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_str_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"str\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_lit_int_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],lit(\"int\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___Label_attrs___term__cons___69_109_112_116_121 = read("prod([],sort(\"Label\"),attrs([term(cons(\"Empty\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__46_46_char_class___range__46_46_lit___46_46_attrs___term__literal = read("prod([\\char-class([range(46,46)]),\\char-class([range(46,46)])],lit(\"..\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_tag_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"tag\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___61_Assignment_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"=\")],sort(\"Assignment\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_variables_iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_Declarator_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"variables\",\\iter-seps(sort(\"Variable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]))],sort(\"Declarator\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_signature_Signature_iter_star__layout_lit___59_FunctionDeclaration_attrs___term__cons___65_98_115_116_114_97_99_116 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),label(\"signature\",sort(\"Signature\")),\\iter-star(layout()),lit(\";\")],sort(\"FunctionDeclaration\"),attrs([term(cons(\"Abstract\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_extend_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"extend\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__38_38_char_class___range__61_61_lit___38_61_attrs___term__literal = read("prod([\\char-class([range(38,38)]),\\char-class([range(61,61)])],lit(\"&=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_anno_RascalReservedKeywords_no_attrs = read("prod([lit(\"anno\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_rel_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"rel\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Import__iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Import\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_parameters_Parameters_iter_star__layout_lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___67_108_111_115_117_114_101 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"parameters\",sort(\"Parameters\")),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Expression\"),attrs([term(cons(\"Closure\"))]))", Factory.Production);
    private static final IConstructor prod___lit_view_RascalReservedKeywords_no_attrs = read("prod([lit(\"view\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_undeclare_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___85_110_100_101_99_108_97_114_101 = read("prod([lit(\"undeclare\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\"))],sort(\"ShellCommand\"),attrs([term(cons(\"Undeclare\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_char_class___range__61_61_lit___61_61_attrs___term__literal = read("prod([\\char-class([range(61,61)]),\\char-class([range(61,61)])],lit(\"==\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_view_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"view\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_char_class___range__62_62_lit___61_62_attrs___term__literal = read("prod([\\char-class([range(61,61)]),\\char-class([range(62,62)])],lit(\"=\\>\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__60_60_char_class___range__61_61_lit___60_61_attrs___term__literal = read("prod([\\char-class([range(60,60)]),\\char-class([range(61,61)])],lit(\"\\<=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__60_60_char_class___range__58_58_lit___60_58_attrs___term__literal = read("prod([\\char-class([range(60,60)]),\\char-class([range(58,58)])],lit(\"\\<:\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_bool_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"bool\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___sort_QualifiedName_iter_star__layout_lit___46_iter_star__layout_production_Name_DataTypeSelector_attrs___term__cons___83_101_108_101_99_116_111_114 = read("prod([label(\"sort\",sort(\"QualifiedName\")),\\iter-star(layout()),lit(\".\"),\\iter-star(layout()),label(\"production\",sort(\"Name\"))],sort(\"DataTypeSelector\"),attrs([term(cons(\"Selector\"))]))", Factory.Production);
    private static final IConstructor regular__iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"QualifiedName\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_catch_RascalReservedKeywords_no_attrs = read("prod([lit(\"catch\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__63_63_char_class___range__61_61_lit___63_61_attrs___term__literal = read("prod([\\char-class([range(63,63)]),\\char-class([range(61,61)])],lit(\"?=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_lit_layout_attrs___term__literal = read("prod([\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)])],lit(\"layout\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_anno_Kind_attrs___term__cons___65_110_110_111 = read("prod([lit(\"anno\")],sort(\"Kind\"),attrs([term(cons(\"Anno\"))]))", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_do_iter_star__layout_body_Statement_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_iter_star__layout_lit___59_Statement_attrs___term__cons___68_111_87_104_105_108_101 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"do\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\")),\\iter-star(layout()),lit(\"while\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"condition\",sort(\"Expression\")),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"DoWhile\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_HexLongLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"HexLongLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__62_62_char_class___range__61_61_lit___62_61_attrs___term__literal = read("prod([\\char-class([range(62,62)]),\\char-class([range(61,61)])],lit(\"\\>=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_insert_RascalReservedKeywords_no_attrs = read("prod([lit(\"insert\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___38_iter_star__layout_name_Name_iter_star__layout_lit___60_58_iter_star__layout_bound_Type_TypeVar_attrs___term__cons___66_111_117_110_100_101_100 = read("prod([lit(\"&\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"\\<:\"),\\iter-star(layout()),label(\"bound\",sort(\"Type\"))],sort(\"TypeVar\"),attrs([term(cons(\"Bounded\"))]))", Factory.Production);
    private static final IConstructor prod___lit___36_DatePart_JustDate_attrs___term__lex = read("prod([lit(\"$\"),sort(\"DatePart\")],sort(\"JustDate\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_lit_module_iter_star__layout_name_QualifiedName_iter_star__layout_imports_iter_star_seps__Import__iter_star__layout_Header_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),lit(\"module\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"imports\",\\iter-star-seps(sort(\"Import\"),[\\iter-star(layout())]))],sort(\"Header\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit___46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([lit(\".\"),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_rule_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],lit(\"rule\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_constructor_BasicType_attrs___term__cons___82_101_105_102_105_101_100_67_111_110_115_116_114_117_99_116_111_114 = read("prod([lit(\"constructor\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedConstructor\"))]))", Factory.Production);
    private static final IConstructor prod___lit_list_BasicType_attrs___term__cons___76_105_115_116 = read("prod([lit(\"list\")],sort(\"BasicType\"),attrs([term(cons(\"List\"))]))", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_name_Name_Formal_attrs___term__cons___84_121_112_101_78_97_109_101 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"name\",sort(\"Name\"))],sort(\"Formal\"),attrs([term(cons(\"TypeName\"))]))", Factory.Production);
    private static final IConstructor prod___declaration_LocalVariableDeclaration_iter_star__layout_lit___59_Statement_attrs___term__cons___86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110 = read("prod([label(\"declaration\",sort(\"LocalVariableDeclaration\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"VariableDeclaration\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_59_range__61_61_range__63_91_range__93_117_NamedRegExp_attrs___term__lex = read("prod([\\char-class([range(48,59),range(61,61),range(63,91),range(93,117)])],sort(\"NamedRegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___OctalEscapeSequence_StringCharacter_attrs___term__lex = read("prod([sort(\"OctalEscapeSequence\")],sort(\"StringCharacter\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__58_58_char_class___range__58_58_lit___58_58_attrs___term__literal = read("prod([\\char-class([range(58,58)]),\\char-class([range(58,58)])],lit(\"::\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_datetime_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"datetime\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_global_iter_star__layout_type_Type_iter_star__layout_names_iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Statement_attrs___term__cons___71_108_111_98_97_108_68_105_114_101_99_116_105_118_101 = read("prod([lit(\"global\"),\\iter-star(layout()),label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"names\",\\iter-seps(sort(\"QualifiedName\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"GlobalDirective\"))]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107 = read("prod([lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Statement\"),attrs([term(cons(\"NonEmptyBlock\"))]))", Factory.Production);
    private static final IConstructor prod___Backslash_RegExp_attrs___term__lex = read("prod([sort(\"Backslash\")],sort(\"RegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star__TagChar_no_attrs = read("regular(\\iter-star(sort(\"TagChar\")),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_parameter_BasicType_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101_80_97_114_97_109_101_116_101_114 = read("prod([lit(\"parameter\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedTypeParameter\"))]))", Factory.Production);
    private static final IConstructor prod___name_Name_iter_star__layout_type_Type_Alternative_attrs___term__cons___78_97_109_101_100_84_121_112_101 = read("prod([label(\"name\",sort(\"Name\")),\\iter-star(layout()),label(\"type\",sort(\"Type\"))],sort(\"Alternative\"),attrs([term(cons(\"NamedType\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_lit_public_attrs___term__literal = read("prod([\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],lit(\"public\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_Name_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"Name\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___typeVar_TypeVar_Type_attrs___term__cons___86_97_114_105_97_98_108_101 = read("prod([label(\"typeVar\",sort(\"TypeVar\"))],sort(\"Type\"),attrs([term(cons(\"Variable\"))]))", Factory.Production);
    private static final IConstructor prod___lit___40_iter_star__layout_formals_Formals_iter_star__layout_lit___46_46_46_iter_star__layout_lit___41_Parameters_attrs___term__cons___86_97_114_65_114_103_115 = read("prod([lit(\"(\"),\\iter-star(layout()),label(\"formals\",sort(\"Formals\")),\\iter-star(layout()),lit(\"...\"),\\iter-star(layout()),lit(\")\")],sort(\"Parameters\"),attrs([term(cons(\"VarArgs\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star__StringCharacter_no_attrs = read("regular(\\iter-star(sort(\"StringCharacter\")),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_lit_import_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],lit(\"import\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_lit_module_iter_star__layout_name_QualifiedName_iter_star__layout_params_ModuleParameters_iter_star__layout_imports_iter_star_seps__Import__iter_star__layout_Header_attrs___term__cons___80_97_114_97_109_101_116_101_114_115 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),lit(\"module\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"params\",sort(\"ModuleParameters\")),\\iter-star(layout()),label(\"imports\",\\iter-star-seps(sort(\"Import\"),[\\iter-star(layout())]))],sort(\"Header\"),attrs([term(cons(\"Parameters\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_throws_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"throws\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___selector_DataTypeSelector_Type_attrs___term__cons___83_101_108_101_99_116_111_114 = read("prod([label(\"selector\",sort(\"DataTypeSelector\"))],sort(\"Type\"),attrs([term(cons(\"Selector\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___43_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___65_100_100_105_116_105_111_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"+\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Addition\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___lit_catch_iter_star__layout_lit___58_iter_star__layout_body_Statement_Catch_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"catch\"),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\"))],sort(\"Catch\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_switch_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"switch\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_list_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"list\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_bool_RascalReservedKeywords_no_attrs = read("prod([lit(\"bool\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___functionDeclaration_FunctionDeclaration_Statement_attrs___term__cons___70_117_110_99_116_105_111_110_68_101_99_108_97_114_97_116_105_111_110 = read("prod([label(\"functionDeclaration\",sort(\"FunctionDeclaration\"))],sort(\"Statement\"),attrs([term(cons(\"FunctionDeclaration\"))]))", Factory.Production);
    private static final IConstructor prod___from_Expression_iter_star__layout_lit___58_iter_star__layout_to_Expression_Mapping__Expression_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"from\",sort(\"Expression\")),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"to\",sort(\"Expression\"))],\\parameterized-sort(\"Mapping\",[sort(\"Expression\")]),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___42_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___80_114_111_100_117_99_116_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"*\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Product\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___lit_throw_RascalReservedKeywords_no_attrs = read("prod([lit(\"throw\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__76_76_range__108_108_DecimalLongLiteral_attrs___term__lex = read("prod([\\char-class([range(49,57)]),\\iter-star(\\char-class([range(48,57)])),\\char-class([range(76,76),range(108,108)])],sort(\"DecimalLongLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star__layout_no_attrs = read("regular(\\iter-star(layout()),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_StringCharacter_attrs___term__lex = read("prod([lit(\"\\\\\"),\\char-class([range(34,34),range(39,39),range(60,60),range(62,62),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116)])],sort(\"StringCharacter\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___syntax_SyntaxDefinition_Import_attrs___term__cons___83_121_110_116_97_120 = read("prod([label(\"syntax\",sort(\"SyntaxDefinition\"))],sort(\"Import\"),attrs([term(cons(\"Syntax\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__36_36_char_class___range__84_84_lit___36_84_attrs___term__literal = read("prod([\\char-class([range(36,36)]),\\char-class([range(84,84)])],lit(\"$T\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs = read("regular(opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_rule_RascalReservedKeywords_no_attrs = read("prod([lit(\"rule\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___functionDeclaration_FunctionDeclaration_Declaration_attrs___term__cons___70_117_110_99_116_105_111_110 = read("prod([label(\"functionDeclaration\",sort(\"FunctionDeclaration\"))],sort(\"Declaration\"),attrs([term(cons(\"Function\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_public_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"public\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit_notin_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___78_111_116_73_110_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"notin\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"NotIn\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_lit_tuple_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],lit(\"tuple\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_seps__TypeVar__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"TypeVar\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___38_38_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___65_110_100_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"&&\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"And\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___69_120_112_114_101_115_115_105_111_110 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"Expression\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_for_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"for\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_lit_throw_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],lit(\"throw\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_star__char_class___range__48_57_no_attrs = read("regular(\\iter-star(\\char-class([range(48,57)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__124_124_URLChars_lit___58_47_47_ProtocolChars_attrs___term__lex = read("prod([\\char-class([range(124,124)]),sort(\"URLChars\"),lit(\"://\")],sort(\"ProtocolChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_real_BasicType_attrs___term__cons___82_101_97_108 = read("prod([lit(\"real\")],sort(\"BasicType\"),attrs([term(cons(\"Real\"))]))", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_thenStatement_Statement_iter_star__layout_noElseMayFollow_NoElseMayFollow_Statement_attrs___term__cons___73_102_84_104_101_110 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"if\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),label(\"thenStatement\",sort(\"Statement\")),\\iter-star(layout()),label(\"noElseMayFollow\",sort(\"NoElseMayFollow\"))],sort(\"Statement\"),attrs([term(cons(\"IfThen\"))]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Renaming__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Renaming\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_lit_map_attrs___term__literal = read("prod([\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(112,112)])],lit(\"map\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___argument_Expression_iter_star__layout_lit___42_Expression_attrs___term__cons___84_114_97_110_115_105_116_105_118_101_82_101_102_108_101_120_105_118_101_67_108_111_115_117_114_101 = read("prod([label(\"argument\",sort(\"Expression\")),\\iter-star(layout()),lit(\"*\")],sort(\"Expression\"),attrs([term(cons(\"TransitiveReflexiveClosure\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_if_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"if\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___argument_Expression_iter_star__layout_lit___43_Expression_attrs___term__cons___84_114_97_110_115_105_116_105_118_101_67_108_111_115_117_114_101 = read("prod([label(\"argument\",sort(\"Expression\")),\\iter-star(layout()),lit(\"+\")],sort(\"Expression\"),attrs([term(cons(\"TransitiveClosure\"))]))", Factory.Production);
    private static final IConstructor regular__iter__char_class___range__117_117_no_attrs = read("regular(iter(\\char-class([range(117,117)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_it_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"it\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_in_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"in\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_else_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"else\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"TypeArg\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_iter_star__layout_char_class___range__62_62_lit___60_61_no_attrs = read("prod([\\char-class([range(61,61)]),\\iter-star(layout()),\\char-class([range(62,62)])],lit(\"\\<=\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_lit_function_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],lit(\"function\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60_MidStringChars_attrs___term__lex = read("prod([\\char-class([range(62,62)]),\\iter-star(sort(\"StringCharacter\")),\\char-class([range(60,60)])],sort(\"MidStringChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_fun_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"fun\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_fail_RascalReservedKeywords_no_attrs = read("prod([lit(\"fail\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_lit_return_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],lit(\"return\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_append_RascalReservedKeywords_no_attrs = read("prod([lit(\"append\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_extend_RascalReservedKeywords_no_attrs = read("prod([lit(\"extend\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__111_111_char_class___range__110_110_char_class___range__32_32_lit___111_110_32_attrs___term__literal = read("prod([\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(32,32)])],lit(\"on \"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_lit_throws_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],lit(\"throws\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_set_BasicType_attrs___term__cons___83_101_116 = read("prod([lit(\"set\")],sort(\"BasicType\"),attrs([term(cons(\"Set\"))]))", Factory.Production);
    private static final IConstructor prod___lit_throw_iter_star__layout_statement_Statement_Statement_attrs___term__cons___84_104_114_111_119_assoc__non_assoc = read("prod([lit(\"throw\"),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Throw\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___qualifiedName_QualifiedName_Expression_attrs___term__cons___81_117_97_108_105_102_105_101_100_78_97_109_101 = read("prod([label(\"qualifiedName\",sort(\"QualifiedName\"))],sort(\"Expression\"),attrs([term(cons(\"QualifiedName\"))]))", Factory.Production);
    private static final IConstructor prod___lit___59_iter_star__layout_expression_Expression_Bound_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\";\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\"))],sort(\"Bound\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_type_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"type\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__113_113_char_class___range__117_117_char_class___range__105_105_char_class___range__116_116_lit_quit_attrs___term__literal = read("prod([\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],lit(\"quit\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___60_Name_lit___62_RegExp_attrs___term__lex = read("prod([lit(\"\\<\"),sort(\"Name\"),lit(\"\\>\")],sort(\"RegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___locationLiteral_LocationLiteral_Literal_attrs___term__cons___76_111_99_97_116_105_111_110 = read("prod([label(\"locationLiteral\",sort(\"LocationLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"Location\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__121_121_lit_history_attrs___term__literal = read("prod([\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],lit(\"history\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_layout_RascalReservedKeywords_no_attrs = read("prod([lit(\"layout\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_LAYOUT_RascalReservedKeywords_no_attrs = read("prod([lit(\"LAYOUT\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_data_iter_star__layout_user_UserType_iter_star__layout_lit___61_iter_star__layout_variants_iter_seps__Variant__iter_star__layout_lit___124_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___68_97_116_97 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"data\"),\\iter-star(layout()),label(\"user\",sort(\"UserType\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"variants\",\\iter-seps(sort(\"Variant\"),[\\iter-star(layout()),lit(\"|\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Data\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_lit_list_attrs___term__literal = read("prod([\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],lit(\"list\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___64_iter_star__layout_name_Name_iter_star__layout_lit___61_iter_star__layout_expression_Expression_Tag_attrs___term__cons___69_120_112_114_101_115_115_105_111_110 = read("prod([lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\"))],sort(\"Tag\"),attrs([term(cons(\"Expression\"))]))", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_iter_star__layout_actuals_ModuleActuals_iter_star__layout_renamings_Renamings_ImportedModule_attrs___term__cons___65_99_116_117_97_108_115_82_101_110_97_109_105_110_103 = read("prod([label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"actuals\",sort(\"ModuleActuals\")),\\iter-star(layout()),label(\"renamings\",sort(\"Renamings\"))],sort(\"ImportedModule\"),attrs([term(cons(\"ActualsRenaming\"))]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Command_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107 = read("prod([lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Command\"),attrs([term(cons(\"NonEmptyBlock\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_lit_loc_attrs___term__literal = read("prod([\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],lit(\"loc\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_type_RascalReservedKeywords_no_attrs = read("prod([lit(\"type\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_tag_iter_star__layout_kind_Kind_iter_star__layout_name_Name_iter_star__layout_lit_on_iter_star__layout_types_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___84_97_103 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"tag\"),\\iter-star(layout()),label(\"kind\",sort(\"Kind\")),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"on\"),\\iter-star(layout()),label(\"types\",\\iter-seps(sort(\"Type\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Tag\"))]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_Command_attrs___term__cons___69_120_112_114_101_115_115_105_111_110 = read("prod([label(\"expression\",sort(\"Expression\"))],sort(\"Command\"),attrs([term(cons(\"Expression\"))]))", Factory.Production);
    private static final IConstructor prod___lit_notin_RascalReservedKeywords_no_attrs = read("prod([lit(\"notin\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___38_61_Assignment_attrs___term__cons___73_110_116_101_114_115_101_99_116_105_111_110 = read("prod([lit(\"&=\")],sort(\"Assignment\"),attrs([term(cons(\"Intersection\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_lit_lex_attrs___term__literal = read("prod([\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(120,120)])],lit(\"lex\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_unimport_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___85_110_105_109_112_111_114_116 = read("prod([lit(\"unimport\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\"))],sort(\"ShellCommand\"),attrs([term(cons(\"Unimport\"))]))", Factory.Production);
    private static final IConstructor prod___lit_switch_RascalReservedKeywords_no_attrs = read("prod([lit(\"switch\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___45_char_class___range__48_49_char_class___range__48_57_lit___45_char_class___range__48_51_char_class___range__48_57_DatePart_attrs___term__lex = read("prod([\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),lit(\"-\"),\\char-class([range(48,49)]),\\char-class([range(48,57)]),lit(\"-\"),\\char-class([range(48,51)]),\\char-class([range(48,57)])],sort(\"DatePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_lit_bool_attrs___term__literal = read("prod([\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)])],lit(\"bool\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___pre_PreStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringTail_StringLiteral_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"pre\",sort(\"PreStringChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"StringTail\"))],sort(\"StringLiteral\"),attrs([term(cons(\"Interpolated\"))]))", Factory.Production);
    private static final IConstructor prod___lit_case_RascalReservedKeywords_no_attrs = read("prod([lit(\"case\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_while_RascalReservedKeywords_no_attrs = read("prod([lit(\"while\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_continue_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___67_111_110_116_105_110_117_101 = read("prod([lit(\"continue\"),\\iter-star(layout()),label(\"target\",sort(\"Target\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"Continue\"))]))", Factory.Production);
    private static final IConstructor prod___argument_Expression_iter_star__layout_lit___63_Expression_attrs___term__cons___73_115_68_101_102_105_110_101_100 = read("prod([label(\"argument\",sort(\"Expression\")),\\iter-star(layout()),lit(\"?\")],sort(\"Expression\"),attrs([term(cons(\"IsDefined\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_lit_num_attrs___term__literal = read("prod([\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],lit(\"num\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___36_84_TimePartNoTZ_opt__TimeZonePart_JustTime_attrs___term__lex = read("prod([lit(\"$T\"),sort(\"TimePartNoTZ\"),opt(sort(\"TimeZonePart\"))],sort(\"JustTime\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_assert_RascalReservedKeywords_no_attrs = read("prod([lit(\"assert\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Field__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Field\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter__char_class___range__48_57_no_attrs = read("regular(iter(\\char-class([range(48,57)])),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter__char_class___range__48_55_no_attrs = read("regular(iter(\\char-class([range(48,55)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___43_61_Assignment_attrs___term__cons___65_100_100_105_116_105_111_110 = read("prod([lit(\"+=\")],sort(\"Assignment\"),attrs([term(cons(\"Addition\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Mapping__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Expression\")]),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___40_iter_star__layout_formals_Formals_iter_star__layout_lit___41_Parameters_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"(\"),\\iter-star(layout()),label(\"formals\",sort(\"Formals\")),\\iter-star(layout()),lit(\")\")],sort(\"Parameters\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_loc_RascalReservedKeywords_no_attrs = read("prod([lit(\"loc\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___symbol_Symbol_iter_star__layout_lit___42_Declarator_attrs___term__cons___73_116_101_114_83_116_97_114 = read("prod([label(\"symbol\",sort(\"Symbol\")),\\iter-star(layout()),lit(\"*\")],sort(\"Declarator\"),attrs([term(cons(\"IterStar\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_lit_one_attrs___term__literal = read("prod([\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)])],lit(\"one\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___fieldName_Name_Field_attrs___term__cons___78_97_109_101 = read("prod([label(\"fieldName\",sort(\"Name\"))],sort(\"Field\"),attrs([term(cons(\"Name\"))]))", Factory.Production);
    private static final IConstructor prod___lit_false_BooleanLiteral_attrs___term__lex = read("prod([lit(\"false\")],sort(\"BooleanLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_lit_dynamic_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],lit(\"dynamic\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_tuple_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"tuple\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringMiddle_StringMiddle_attrs___term__cons___84_101_109_112_108_97_116_101 = read("prod([label(\"mid\",sort(\"MidStringChars\")),\\iter-star(layout()),label(\"template\",sort(\"StringTemplate\")),\\iter-star(layout()),label(\"tail\",sort(\"StringMiddle\"))],sort(\"StringMiddle\"),attrs([term(cons(\"Template\"))]))", Factory.Production);
    private static final IConstructor prod___lit_view_Kind_attrs___term__cons___86_105_101_119 = read("prod([lit(\"view\")],sort(\"Kind\"),attrs([term(cons(\"View\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_insert_attrs___term__literal = read("prod([\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],lit(\"insert\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___62_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___71_114_101_97_116_101_114_84_104_97_110_79_114_69_113_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\>=\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"GreaterThanOrEq\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_iter_star__layout_actuals_ModuleActuals_ImportedModule_attrs___term__cons___65_99_116_117_97_108_115 = read("prod([label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"actuals\",sort(\"ModuleActuals\"))],sort(\"ImportedModule\"),attrs([term(cons(\"Actuals\"))]))", Factory.Production);
    private static final IConstructor prod___lit_bag_BasicType_attrs___term__cons___66_97_103 = read("prod([lit(\"bag\")],sort(\"BasicType\"),attrs([term(cons(\"Bag\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_lit_solve_attrs___term__literal = read("prod([\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],lit(\"solve\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_catch_iter_star__layout_pattern_Pattern_iter_star__layout_lit___58_iter_star__layout_body_Statement_Catch_attrs___term__cons___66_105_110_100_105_110_103 = read("prod([lit(\"catch\"),\\iter-star(layout()),label(\"pattern\",sort(\"Pattern\")),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\"))],sort(\"Catch\"),attrs([term(cons(\"Binding\"))]))", Factory.Production);
    private static final IConstructor prod___lit___60_iter_star__layout_elements_iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Assignable_attrs___term__cons___84_117_112_108_101 = read("prod([lit(\"\\<\"),\\iter-star(layout()),label(\"elements\",\\iter-seps(sort(\"Assignable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"\\>\")],sort(\"Assignable\"),attrs([term(cons(\"Tuple\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_o_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"o\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_iter_star_seps__Tag__iter_star__layout_Tags_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"tags\",\\iter-star-seps(sort(\"Tag\"),[\\iter-star(layout())]))],sort(\"Tags\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_test_ShellCommand_attrs___term__cons___84_101_115_116 = read("prod([lit(\"test\")],sort(\"ShellCommand\"),attrs([term(cons(\"Test\"))]))", Factory.Production);
    private static final IConstructor prod___lit_Z_TimeZonePart_attrs___term__lex = read("prod([lit(\"Z\")],sort(\"TimeZonePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_OctalIntegerLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"OctalIntegerLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__46_46_iter_star__layout_char_class___range__46_46_lit___44_no_attrs = read("prod([\\char-class([range(46,46)]),\\iter-star(layout()),\\char-class([range(46,46)])],lit(\",\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___declaration_Declaration_Toplevel_attrs___term__cons___71_105_118_101_110_86_105_115_105_98_105_108_105_116_121 = read("prod([label(\"declaration\",sort(\"Declaration\"))],sort(\"Toplevel\"),attrs([term(cons(\"GivenVisibility\"))]))", Factory.Production);
    private static final IConstructor prod___lit___58_iter_star__layout_command_ShellCommand_Command_attrs___term__cons___83_104_101_108_108 = read("prod([lit(\":\"),\\iter-star(layout()),label(\"command\",sort(\"ShellCommand\"))],sort(\"Command\"),attrs([term(cons(\"Shell\"))]))", Factory.Production);
    private static final IConstructor prod___function_FunctionType_Type_attrs___term__cons___70_117_110_99_116_105_111_110 = read("prod([label(\"function\",sort(\"FunctionType\"))],sort(\"Type\"),attrs([term(cons(\"Function\"))]))", Factory.Production);
    private static final IConstructor prod___lit_datetime_RascalReservedKeywords_no_attrs = read("prod([lit(\"datetime\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___87_104_105_108_101 = read("prod([lit(\"while\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"condition\",sort(\"Expression\")),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"body\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"StringTemplate\"),attrs([term(cons(\"While\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_global_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"global\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___124_124_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___79_114_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"||\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Or\")),assoc(left())]))", Factory.Production);
    private static final IConstructor regular__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_no_attrs = read("regular(\\iter-star(\\char-class([range(100,100),range(105,105),range(109,109),range(115,115)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_lit_declarations_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)])],lit(\"declarations\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__49_57_iter_star__char_class___range__48_57_DecimalIntegerLiteral_attrs___term__lex = read("prod([\\char-class([range(49,57)]),\\iter-star(\\char-class([range(48,57)]))],sort(\"DecimalIntegerLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__FunctionModifier__iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"FunctionModifier\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringTail_StringTail_attrs___term__cons___77_105_100_73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"mid\",sort(\"MidStringChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"StringTail\"))],sort(\"StringTail\"),attrs([term(cons(\"MidInterpolated\"))]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_key_Name_iter_star__layout_lit___61_iter_star__layout_replacement_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___70_105_101_108_100_85_112_100_97_116_101 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),label(\"key\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"replacement\",sort(\"Expression\")),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"FieldUpdate\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star__char_class___range__33_59_range__61_123_no_attrs = read("regular(\\iter-star(\\char-class([range(33,59),range(61,123)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_lit_str_attrs___term__literal = read("prod([\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)])],lit(\"str\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_lit_alias_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(115,115)])],lit(\"alias\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__65_90_range__95_95_range__97_122_iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122_Name_attrs___term__lex = read("prod([\\char-class([range(65,90),range(95,95),range(97,122)]),\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))],sort(\"Name\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_Backslash_attrs___term__lex = read("prod([\\char-class([range(92,92)])],sort(\"Backslash\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___parameters_Parameters_iter_star__layout_lit___123_iter_star__layout_statements_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___86_111_105_100_67_108_111_115_117_114_101 = read("prod([label(\"parameters\",sort(\"Parameters\")),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Expression\"),attrs([term(cons(\"VoidClosure\"))]))", Factory.Production);
    private static final IConstructor prod___lit_set_iter_star__layout_name_QualifiedName_iter_star__layout_expression_Expression_ShellCommand_attrs___term__cons___83_101_116_79_112_116_105_111_110 = read("prod([lit(\"set\"),\\iter-star(layout()),label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\"))],sort(\"ShellCommand\"),attrs([term(cons(\"SetOption\"))]))", Factory.Production);
    private static final IConstructor prod___date_JustDate_DateTimeLiteral_attrs___term__cons___68_97_116_101_76_105_116_101_114_97_108 = read("prod([label(\"date\",sort(\"JustDate\"))],sort(\"DateTimeLiteral\"),attrs([term(cons(\"DateLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_RegExp_attrs___term__lex = read("prod([\\char-class([range(92,92)]),\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],sort(\"RegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___toplevels_iter_star_seps__Toplevel__iter_star__layout_Body_attrs___term__cons___84_111_112_108_101_118_101_108_115 = read("prod([label(\"toplevels\",\\iter-star-seps(sort(\"Toplevel\"),[\\iter-star(layout())]))],sort(\"Body\"),attrs([term(cons(\"Toplevels\"))]))", Factory.Production);
    private static final IConstructor prod___lit_num_RascalReservedKeywords_no_attrs = read("prod([lit(\"num\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_lit_view_attrs___term__literal = read("prod([\\char-class([range(118,118)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],lit(\"view\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_str_BasicType_attrs___term__cons___83_116_114_105_110_103 = read("prod([lit(\"str\")],sort(\"BasicType\"),attrs([term(cons(\"String\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_lit_rel_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(108,108)])],lit(\"rel\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_EscapedName_attrs___term__lex = read("prod([\\char-class([range(92,92)]),\\char-class([range(65,90),range(95,95),range(97,122)]),\\iter-star(\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)]))],sort(\"EscapedName\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___45_iter_star__layout_Expression_Expression_no_attrs = read("prod([lit(\"-\"),\\iter-star(layout()),sort(\"Expression\")],sort(\"Expression\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_tag_RascalReservedKeywords_no_attrs = read("prod([lit(\"tag\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidProtocolChars_iter_star__layout_expression_Expression_iter_star__layout_tail_ProtocolTail_ProtocolTail_attrs___term__cons___77_105_100 = read("prod([label(\"mid\",sort(\"MidProtocolChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"ProtocolTail\"))],sort(\"ProtocolTail\"),attrs([term(cons(\"Mid\"))]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Statement__iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_HexIntegerLiteral_attrs___term__lex = read("prod([\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),iter(\\char-class([range(48,57),range(65,70),range(97,102)]))],sort(\"HexIntegerLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__101_101_iter_star__layout_char_class___range__108_108_iter_star__layout_char_class___range__115_115_iter_star__layout_char_class___range__101_101_NoElseMayFollow_no_attrs = read("prod([\\char-class([range(101,101)]),\\iter-star(layout()),\\char-class([range(108,108)]),\\iter-star(layout()),\\char-class([range(115,115)]),\\iter-star(layout()),\\char-class([range(101,101)])],sort(\"NoElseMayFollow\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___octalLong_OctalLongLiteral_LongLiteral_attrs___term__cons___79_99_116_97_108_76_111_110_103_76_105_116_101_114_97_108 = read("prod([label(\"octalLong\",sort(\"OctalLongLiteral\"))],sort(\"LongLiteral\"),attrs([term(cons(\"OctalLongLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_modifiers_FunctionModifiers_iter_star__layout_name_Name_iter_star__layout_parameters_Parameters_iter_star__layout_lit_throws_iter_star__layout_exceptions_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_Signature_attrs___term__cons___87_105_116_104_84_104_114_111_119_115 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"modifiers\",sort(\"FunctionModifiers\")),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),label(\"parameters\",sort(\"Parameters\")),\\iter-star(layout()),lit(\"throws\"),\\iter-star(layout()),label(\"exceptions\",\\iter-seps(sort(\"Type\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]))],sort(\"Signature\"),attrs([term(cons(\"WithThrows\"))]))", Factory.Production);
    private static final IConstructor prod___regExpLiteral_RegExpLiteral_Literal_attrs___term__cons___82_101_103_69_120_112 = read("prod([label(\"regExpLiteral\",sort(\"RegExpLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"RegExp\"))]))", Factory.Production);
    private static final IConstructor prod___lit_data_RascalReservedKeywords_no_attrs = read("prod([lit(\"data\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_RegExpModifier_attrs___term__lex = read("prod([\\iter-star(\\char-class([range(100,100),range(105,105),range(109,109),range(115,115)]))],sort(\"RegExpModifier\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_import_RascalReservedKeywords_no_attrs = read("prod([lit(\"import\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_lit_tag_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(103,103)])],lit(\"tag\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_false_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"false\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_global_RascalReservedKeywords_no_attrs = read("prod([lit(\"global\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___40_iter_star__layout_mappings_iter_star_seps__Mapping__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___77_97_112 = read("prod([lit(\"(\"),\\iter-star(layout()),label(\"mappings\",\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Expression\")]),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"Expression\"),attrs([term(cons(\"Map\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_lit_set_attrs___term__literal = read("prod([\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],lit(\"set\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___realLiteral_RealLiteral_Literal_attrs___term__cons___82_101_97_108 = read("prod([label(\"realLiteral\",sort(\"RealLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"Real\"))]))", Factory.Production);
    private static final IConstructor prod___lit_extend_iter_star__layout_module_ImportedModule_iter_star__layout_lit___59_Import_attrs___term__cons___69_120_116_101_110_100 = read("prod([lit(\"extend\"),\\iter-star(layout()),label(\"module\",sort(\"ImportedModule\")),\\iter-star(layout()),lit(\";\")],sort(\"Import\"),attrs([term(cons(\"Extend\"))]))", Factory.Production);
    private static final IConstructor regular__opt__char_class___range__43_43_range__45_45_no_attrs = read("regular(opt(\\char-class([range(43,43),range(45,45)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_data_iter_star__layout_user_UserType_iter_star__layout_lit___59_Declaration_attrs___term__cons___68_97_116_97_65_98_115_116_114_97_99_116 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"data\"),\\iter-star(layout()),label(\"user\",sort(\"UserType\")),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"DataAbstract\"))]))", Factory.Production);
    private static final IConstructor prod___iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([iter(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_tuple_RascalReservedKeywords_no_attrs = read("prod([lit(\"tuple\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_false_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],lit(\"false\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___91_iter_star__layout_elements_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_Expression_attrs___term__cons___76_105_115_116 = read("prod([lit(\"[\"),\\iter-star(layout()),label(\"elements\",\\iter-star-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"List\"))]))", Factory.Production);
    private static final IConstructor prod___lit_declarations_ShellCommand_attrs___term__cons___76_105_115_116_68_101_99_108_97_114_97_116_105_111_110_115 = read("prod([lit(\"declarations\")],sort(\"ShellCommand\"),attrs([term(cons(\"ListDeclarations\"))]))", Factory.Production);
    private static final IConstructor prod___iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([iter(\\char-class([range(48,57)])),\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_lit_repeat_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],lit(\"repeat\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_signature_Signature_iter_star__layout_body_FunctionBody_FunctionDeclaration_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),label(\"signature\",sort(\"Signature\")),\\iter-star(layout()),label(\"body\",sort(\"FunctionBody\"))],sort(\"FunctionDeclaration\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_rule_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"rule\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_lit___64_iter_star__layout_name_Name_iter_star__layout_lit___61_iter_star__layout_value_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___83_101_116_65_110_110_111_116_97_116_105_111_110 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"value\",sort(\"Expression\")),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"SetAnnotation\"))]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___67_97_108_108_79_114_84_114_101_101 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"arguments\",\\iter-star-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"Expression\"),attrs([term(cons(\"CallOrTree\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_int_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"int\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__60_60_range__62_62_range__92_92_NamedBackslash_no_attrs = read("prod([\\char-class([range(60,60),range(62,62),range(92,92)])],sort(\"NamedBackslash\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_append_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)])],lit(\"append\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_int_RascalReservedKeywords_no_attrs = read("prod([lit(\"int\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_lit_node_attrs___term__literal = read("prod([\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)])],lit(\"node\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___protocolChars_ProtocolChars_ProtocolPart_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"protocolChars\",sort(\"ProtocolChars\"))],sort(\"ProtocolPart\"),attrs([term(cons(\"NonInterpolated\"))]))", Factory.Production);
    private static final IConstructor prod___structured_StructuredType_Type_attrs___term__cons___83_116_114_117_99_116_117_114_101_100 = read("prod([label(\"structured\",sort(\"StructuredType\"))],sort(\"Type\"),attrs([term(cons(\"Structured\"))]))", Factory.Production);
    private static final IConstructor prod___Visibility_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([],sort(\"Visibility\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___integerLiteral_IntegerLiteral_Literal_attrs___term__cons___73_110_116_101_103_101_114 = read("prod([label(\"integerLiteral\",sort(\"IntegerLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"Integer\"))]))", Factory.Production);
    private static final IConstructor prod___symbol_Symbol_iter_star__layout_lit___43_Declarator_attrs___term__cons___73_116_101_114 = read("prod([label(\"symbol\",sort(\"Symbol\")),\\iter-star(layout()),lit(\"+\")],sort(\"Declarator\"),attrs([term(cons(\"Iter\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_NamedBackslash_attrs___term__lex = read("prod([\\char-class([range(92,92)])],sort(\"NamedBackslash\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_value_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"value\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Variant__iter_star__layout_lit___124_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Variant\"),[\\iter-star(layout()),lit(\"|\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_constructor_RascalReservedKeywords_no_attrs = read("prod([lit(\"constructor\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_true_BooleanLiteral_attrs___term__lex = read("prod([lit(\"true\")],sort(\"BooleanLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__106_106_char_class___range__97_97_char_class___range__118_118_char_class___range__97_97_lit_java_attrs___term__literal = read("prod([\\char-class([range(106,106)]),\\char-class([range(97,97)]),\\char-class([range(118,118)]),\\char-class([range(97,97)])],lit(\"java\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex = read("prod([lit(\"\\\\\"),\\char-class([range(48,51)]),\\char-class([range(48,55)]),\\char-class([range(48,55)])],sort(\"OctalEscapeSequence\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___basicType_BasicType_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101 = read("prod([label(\"basicType\",sort(\"BasicType\")),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"arguments\",\\iter-star-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"Expression\"),attrs([term(cons(\"ReifiedType\"))]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107 = read("prod([lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Expression\"),attrs([term(cons(\"NonEmptyBlock\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__58_58_lit___58_attrs___term__literal = read("prod([\\char-class([range(58,58)])],lit(\":\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__59_59_lit___59_attrs___term__literal = read("prod([\\char-class([range(59,59)])],lit(\";\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_insert_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___73_110_115_101_114_116 = read("prod([lit(\"insert\"),\\iter-star(layout()),label(\"dataTarget\",sort(\"DataTarget\")),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Insert\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__62_62_lit___62_attrs___term__literal = read("prod([\\char-class([range(62,62)])],lit(\"\\>\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__63_63_lit___63_attrs___term__literal = read("prod([\\char-class([range(63,63)])],lit(\"?\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_renaming_iter_star__layout_renamings_iter_seps__Renaming__iter_star__layout_lit___44_iter_star__layout_Renamings_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"renaming\"),\\iter-star(layout()),label(\"renamings\",\\iter-seps(sort(\"Renaming\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]))],sort(\"Renamings\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_bag_RascalReservedKeywords_no_attrs = read("prod([lit(\"bag\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__60_60_lit___60_attrs___term__literal = read("prod([\\char-class([range(60,60)])],lit(\"\\<\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___61_attrs___term__literal = read("prod([\\char-class([range(61,61)])],lit(\"=\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___EscapedName_Name_attrs___term__lex = read("prod([sort(\"EscapedName\")],sort(\"Name\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_48_lit_0_attrs___term__literal = read("prod([\\char-class([range(48,48)])],lit(\"0\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_NamedRegExp_attrs___term__lex = read("prod([\\char-class([range(92,92)]),\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],sort(\"NamedRegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___Target_attrs___term__cons___69_109_112_116_121 = read("prod([],sort(\"Target\"),attrs([term(cons(\"Empty\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__42_42_lit___42_attrs___term__literal = read("prod([\\char-class([range(42,42)])],lit(\"*\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_catch_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"catch\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__43_43_lit___43_attrs___term__literal = read("prod([\\char-class([range(43,43)])],lit(\"+\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__40_40_lit___40_attrs___term__literal = read("prod([\\char-class([range(40,40)])],lit(\"(\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___91_iter_star__layout_types_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_ModuleActuals_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"[\"),\\iter-star(layout()),label(\"types\",\\iter-seps(sort(\"Type\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"ModuleActuals\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__41_41_lit___41_attrs___term__literal = read("prod([\\char-class([range(41,41)])],lit(\")\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__46_46_lit___46_attrs___term__literal = read("prod([\\char-class([range(46,46)])],lit(\".\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__47_47_lit___47_attrs___term__literal = read("prod([\\char-class([range(47,47)])],lit(\"/\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__44_44_lit___44_attrs___term__literal = read("prod([\\char-class([range(44,44)])],lit(\",\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_thenStatement_Statement_iter_star__layout_lit_else_iter_star__layout_elseStatement_Statement_Statement_attrs___term__cons___73_102_84_104_101_110_69_108_115_101 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"if\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),label(\"thenStatement\",sort(\"Statement\")),\\iter-star(layout()),lit(\"else\"),\\iter-star(layout()),label(\"elseStatement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"IfThenElse\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_lit___45_attrs___term__literal = read("prod([\\char-class([range(45,45)])],lit(\"-\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___62_URLChars_lit___124_PostPathChars_attrs___term__lex = read("prod([lit(\"\\>\"),sort(\"URLChars\"),lit(\"|\")],sort(\"PostPathChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__34_34_lit___34_attrs___term__literal = read("prod([\\char-class([range(34,34)])],lit(\"\\\"\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_data_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"data\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__35_35_lit___35_attrs___term__literal = read("prod([\\char-class([range(35,35)])],lit(\"#\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_assoc_RascalReservedKeywords_no_attrs = read("prod([lit(\"assoc\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Alternative__iter_star__layout_lit___124_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Alternative\"),[\\iter-star(layout()),lit(\"|\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__33_33_lit___33_attrs___term__literal = read("prod([\\char-class([range(33,33)])],lit(\"!\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___decimal_DecimalIntegerLiteral_IntegerLiteral_attrs___term__cons___68_101_99_105_109_97_108_73_110_116_101_103_101_114_76_105_116_101_114_97_108 = read("prod([label(\"decimal\",sort(\"DecimalIntegerLiteral\"))],sort(\"IntegerLiteral\"),attrs([term(cons(\"DecimalIntegerLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__38_38_lit___38_attrs___term__literal = read("prod([\\char-class([range(38,38)])],lit(\"&\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__39_39_lit___39_attrs___term__literal = read("prod([\\char-class([range(39,39)])],lit(\"\\'\\\\\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_tag_Kind_attrs___term__cons___84_97_103 = read("prod([lit(\"tag\")],sort(\"Kind\"),attrs([term(cons(\"Tag\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__36_36_lit___36_attrs___term__literal = read("prod([\\char-class([range(36,36)])],lit(\"$\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__37_37_lit___37_attrs___term__literal = read("prod([\\char-class([range(37,37)])],lit(\"%\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Statement__iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_loc_BasicType_attrs___term__cons___76_111_99 = read("prod([lit(\"loc\")],sort(\"BasicType\"),attrs([term(cons(\"Loc\"))]))", Factory.Production);
    private static final IConstructor prod___lit___92_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex = read("prod([lit(\"\\\\\"),\\char-class([range(48,55)])],sort(\"OctalEscapeSequence\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__Formal__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"Formal\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal = read("prod([\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],lit(\"while\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__117_117_char_class___range__110_110_char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__101_101_lit_undeclare_attrs___term__literal = read("prod([\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(101,101)])],lit(\"undeclare\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_rel_BasicType_attrs___term__cons___82_101_108_97_116_105_111_110 = read("prod([lit(\"rel\")],sort(\"BasicType\"),attrs([term(cons(\"Relation\"))]))", Factory.Production);
    private static final IConstructor prod___iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([iter(\\char-class([range(48,57)])),lit(\".\"),\\iter-star(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___name_Name_Target_attrs___term__cons___76_97_98_101_108_101_100 = read("prod([label(\"name\",sort(\"Name\"))],sort(\"Target\"),attrs([term(cons(\"Labeled\"))]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___60_iter_star__layout_fields_iter_seps__Field__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Expression_attrs___term__cons___70_105_101_108_100_80_114_111_106_101_99_116 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\<\"),\\iter-star(layout()),label(\"fields\",\\iter-seps(sort(\"Field\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"\\>\")],sort(\"Expression\"),attrs([term(cons(\"FieldProject\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_DecimalLongLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"DecimalLongLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_alias_Kind_attrs___term__cons___65_108_105_97_115 = read("prod([lit(\"alias\")],sort(\"Kind\"),attrs([term(cons(\"Alias\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__60_60_char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_lit___60_61_61_62_attrs___term__literal = read("prod([\\char-class([range(60,60)]),\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(62,62)])],lit(\"\\<==\\>\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_dynamic_RascalReservedKeywords_no_attrs = read("prod([lit(\"dynamic\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_solve_RascalReservedKeywords_no_attrs = read("prod([lit(\"solve\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_value_BasicType_attrs___term__cons___86_97_108_117_101 = read("prod([lit(\"value\")],sort(\"BasicType\"),attrs([term(cons(\"Value\"))]))", Factory.Production);
    private static final IConstructor prod___pre_PreStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringTail_StringLiteral_attrs___term__cons___84_101_109_112_108_97_116_101 = read("prod([label(\"pre\",sort(\"PreStringChars\")),\\iter-star(layout()),label(\"template\",sort(\"StringTemplate\")),\\iter-star(layout()),label(\"tail\",sort(\"StringTail\"))],sort(\"StringLiteral\"),attrs([term(cons(\"Template\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_char_class___range__92_92_range__125_125_TagChar_attrs___term__lex = read("prod([\\char-class([range(92,92)]),\\char-class([range(92,92),range(125,125)])],sort(\"TagChar\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___62_URLChars_lit___60_MidPathChars_attrs___term__lex = read("prod([lit(\"\\>\"),sort(\"URLChars\"),lit(\"\\<\")],sort(\"MidPathChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([iter(\\char-class([range(48,57)])),lit(\".\"),\\iter-star(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_module_attrs___term__literal = read("prod([\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],lit(\"module\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___NoElseMayFollow_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([],sort(\"NoElseMayFollow\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_extend_attrs___term__literal = read("prod([\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)])],lit(\"extend\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__123_123_lit___123_attrs___term__literal = read("prod([\\char-class([range(123,123)])],lit(\"{\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___receiver_Assignable_iter_star__layout_lit___64_iter_star__layout_annotation_Name_Assignable_attrs___term__cons___65_110_110_111_116_97_116_105_111_110_assoc__non_assoc = read("prod([label(\"receiver\",sort(\"Assignable\")),\\iter-star(layout()),lit(\"@\"),\\iter-star(layout()),label(\"annotation\",sort(\"Name\"))],sort(\"Assignable\"),attrs([term(cons(\"Annotation\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___fieldIndex_IntegerLiteral_Field_attrs___term__cons___73_110_100_101_120 = read("prod([label(\"fieldIndex\",sort(\"IntegerLiteral\"))],sort(\"Field\"),attrs([term(cons(\"Index\"))]))", Factory.Production);
    private static final IConstructor prod___post_PostPathChars_PathTail_attrs___term__cons___80_111_115_116 = read("prod([label(\"post\",sort(\"PostPathChars\"))],sort(\"PathTail\"),attrs([term(cons(\"Post\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__124_124_lit___124_attrs___term__literal = read("prod([\\char-class([range(124,124)])],lit(\"|\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___60_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___76_101_115_115_84_104_97_110_79_114_69_113_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\<=\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"LessThanOrEq\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___hex_HexIntegerLiteral_IntegerLiteral_attrs___term__cons___72_101_120_73_110_116_101_103_101_114_76_105_116_101_114_97_108 = read("prod([label(\"hex\",sort(\"HexIntegerLiteral\"))],sort(\"IntegerLiteral\"),attrs([term(cons(\"HexIntegerLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_lit_fail_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(105,105)]),\\char-class([range(108,108)])],lit(\"fail\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__125_125_lit___125_attrs___term__literal = read("prod([\\char-class([range(125,125)])],lit(\"}\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__35_38_range__40_59_range__61_61_range__63_91_range__93_117_StringCharacter_attrs___term__lex = read("prod([\\char-class([range(35,38),range(40,59),range(61,61),range(63,91),range(93,117)])],sort(\"StringCharacter\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___NamedBackslash_NamedRegExp_attrs___term__lex = read("prod([sort(\"NamedBackslash\")],sort(\"NamedRegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___pre_PrePathChars_iter_star__layout_expression_Expression_iter_star__layout_tail_PathTail_PathPart_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"pre\",sort(\"PrePathChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"PathTail\"))],sort(\"PathPart\"),attrs([term(cons(\"Interpolated\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_lit_join_attrs___term__literal = read("prod([\\char-class([range(106,106)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(110,110)])],lit(\"join\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Catch__iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Catch\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_lit_continue_attrs___term__literal = read("prod([\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],lit(\"continue\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___user_UserType_Type_attrs___term__cons___85_115_101_114 = read("prod([label(\"user\",sort(\"UserType\"))],sort(\"Type\"),attrs([term(cons(\"User\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_OctalLongLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"OctalLongLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringMiddle_StringMiddle_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"mid\",sort(\"MidStringChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"StringMiddle\"))],sort(\"StringMiddle\"),attrs([term(cons(\"Interpolated\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__111_111_lit_o_attrs___term__literal = read("prod([\\char-class([range(111,111)])],lit(\"o\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___declaration_Declaration_Command_attrs___term__cons___68_101_99_108_97_114_97_116_105_111_110 = read("prod([label(\"declaration\",sort(\"Declaration\"))],sort(\"Command\"),attrs([term(cons(\"Declaration\"))]))", Factory.Production);
    private static final IConstructor prod___decimalLong_DecimalLongLiteral_LongLiteral_attrs___term__cons___68_101_99_105_109_97_108_76_111_110_103_76_105_116_101_114_97_108 = read("prod([label(\"decimalLong\",sort(\"DecimalLongLiteral\"))],sort(\"LongLiteral\"),attrs([term(cons(\"DecimalLongLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__90_90_lit_Z_attrs___term__literal = read("prod([\\char-class([range(90,90)])],lit(\"Z\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_node_BasicType_attrs___term__cons___78_111_100_101 = read("prod([lit(\"node\")],sort(\"BasicType\"),attrs([term(cons(\"Node\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__91_91_lit___91_attrs___term__literal = read("prod([\\char-class([range(91,91)])],lit(\"[\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_lit_try_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],lit(\"try\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_dynamic_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"dynamic\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_catch_attrs___term__literal = read("prod([\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],lit(\"catch\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__92_92_lit___92_attrs___term__literal = read("prod([\\char-class([range(92,92)])],lit(\"\\\\\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_data_Kind_attrs___term__cons___68_97_116_97 = read("prod([lit(\"data\")],sort(\"Kind\"),attrs([term(cons(\"Data\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__93_93_lit___93_attrs___term__literal = read("prod([\\char-class([range(93,93)])],lit(\"]\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_set_RascalReservedKeywords_no_attrs = read("prod([lit(\"set\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___124_URLChars_lit___60_PreProtocolChars_attrs___term__lex = read("prod([lit(\"|\"),sort(\"URLChars\"),lit(\"\\<\")],sort(\"PreProtocolChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_cf_RascalReservedKeywords_no_attrs = read("prod([lit(\"cf\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___35_iter_star__layout_type_Type_Expression_attrs___term__cons___82_101_105_102_121_84_121_112_101 = read("prod([lit(\"#\"),\\iter-star(layout()),label(\"type\",sort(\"Type\"))],sort(\"Expression\"),attrs([term(cons(\"ReifyType\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__84_84_lit_T_attrs___term__literal = read("prod([\\char-class([range(84,84)])],lit(\"T\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__103_103_char_class___range__108_108_char_class___range__111_111_char_class___range__98_98_char_class___range__97_97_char_class___range__108_108_lit_global_attrs___term__literal = read("prod([\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(98,98)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],lit(\"global\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___basic_BasicType_Type_attrs___term__cons___66_97_115_105_99 = read("prod([label(\"basic\",sort(\"BasicType\"))],sort(\"Type\"),attrs([term(cons(\"Basic\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_lit_test_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],lit(\"test\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___73_102_84_104_101_110 = read("prod([lit(\"if\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"body\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"StringTemplate\"),attrs([term(cons(\"IfThen\"))]))", Factory.Production);
    private static final IConstructor prod___post_PostProtocolChars_ProtocolTail_attrs___term__cons___80_111_115_116 = read("prod([label(\"post\",sort(\"PostProtocolChars\"))],sort(\"ProtocolTail\"),attrs([term(cons(\"Post\"))]))", Factory.Production);
    private static final IConstructor prod___mid_MidStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringTail_StringTail_attrs___term__cons___77_105_100_84_101_109_112_108_97_116_101 = read("prod([label(\"mid\",sort(\"MidStringChars\")),\\iter-star(layout()),label(\"template\",sort(\"StringTemplate\")),\\iter-star(layout()),label(\"tail\",sort(\"StringTail\"))],sort(\"StringTail\"),attrs([term(cons(\"MidTemplate\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__64_64_lit___64_attrs___term__literal = read("prod([\\char-class([range(64,64)])],lit(\"@\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_lit_visit_attrs___term__literal = read("prod([\\char-class([range(118,118)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],lit(\"visit\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit_join_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___74_111_105_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"join\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Join\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_lit_finally_attrs___term__literal = read("prod([\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],lit(\"finally\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___receiver_Assignable_iter_star__layout_lit___46_iter_star__layout_field_Name_Assignable_attrs___term__cons___70_105_101_108_100_65_99_99_101_115_115 = read("prod([label(\"receiver\",sort(\"Assignable\")),\\iter-star(layout()),lit(\".\"),\\iter-star(layout()),label(\"field\",sort(\"Name\"))],sort(\"Assignable\"),attrs([term(cons(\"FieldAccess\"))]))", Factory.Production);
    private static final IConstructor prod___lit_int_BasicType_attrs___term__cons___73_110_116 = read("prod([lit(\"int\")],sort(\"BasicType\"),attrs([term(cons(\"Int\"))]))", Factory.Production);
    private static final IConstructor prod___Expression_iter_star__layout_lit___43_iter_star__layout_Expression_Expression_no_attrs = read("prod([sort(\"Expression\"),\\iter-star(layout()),lit(\"+\"),\\iter-star(layout()),sort(\"Expression\")],sort(\"Expression\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_visit_Visit_Expression_attrs___term__cons___86_105_115_105_116 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),label(\"visit\",sort(\"Visit\"))],sort(\"Expression\"),attrs([term(cons(\"Visit\"))]))", Factory.Production);
    private static final IConstructor prod___Expression_iter_star__layout_lit___42_iter_star__layout_Expression_Expression_no_attrs = read("prod([sort(\"Expression\"),\\iter-star(layout()),lit(\"*\"),\\iter-star(layout()),sort(\"Expression\")],sort(\"Expression\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_void_BasicType_attrs___term__cons___86_111_105_100 = read("prod([lit(\"void\")],sort(\"BasicType\"),attrs([term(cons(\"Void\"))]))", Factory.Production);
    private static final IConstructor prod___RascalReservedKeywords_Name_attrs___reject = read("prod([sort(\"RascalReservedKeywords\")],sort(\"Name\"),attrs([reject()]))", Factory.Production);
    private static final IConstructor prod___lit_list_RascalReservedKeywords_no_attrs = read("prod([lit(\"list\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__117_117_char_class___range__110_110_char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_lit_unimport_attrs___term__literal = read("prod([\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],lit(\"unimport\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_lit_real_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],lit(\"real\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_UnicodeEscape_attrs___term__lex = read("prod([lit(\"\\\\\"),iter(\\char-class([range(117,117)])),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)])],sort(\"UnicodeEscape\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___octal_OctalIntegerLiteral_IntegerLiteral_attrs___term__cons___79_99_116_97_108_73_110_116_101_103_101_114_76_105_116_101_114_97_108 = read("prod([label(\"octal\",sort(\"OctalIntegerLiteral\"))],sort(\"IntegerLiteral\"),attrs([term(cons(\"OctalIntegerLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___lit_rel_RascalReservedKeywords_no_attrs = read("prod([lit(\"rel\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_history_ShellCommand_attrs___term__cons___72_105_115_116_111_114_121 = read("prod([lit(\"history\")],sort(\"ShellCommand\"),attrs([term(cons(\"History\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit_o_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___67_111_109_112_111_115_105_116_105_111_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"o\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Composition\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___lit_test_RascalReservedKeywords_no_attrs = read("prod([lit(\"test\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___60_Name_lit___62_NamedRegExp_attrs___term__lex = read("prod([lit(\"\\<\"),sort(\"Name\"),lit(\"\\>\")],sort(\"NamedRegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_adt_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"adt\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34_PostStringChars_attrs___term__lex = read("prod([\\char-class([range(62,62)]),\\iter-star(sort(\"StringCharacter\")),\\char-class([range(34,34)])],sort(\"PostStringChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___label_Name_iter_star__layout_lit___58_DataTarget_attrs___term__cons___76_97_98_101_108_101_100 = read("prod([label(\"label\",sort(\"Name\")),\\iter-star(layout()),lit(\":\")],sort(\"DataTarget\"),attrs([term(cons(\"Labeled\"))]))", Factory.Production);
    private static final IConstructor prod___lit_assert_iter_star__layout_expression_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___65_115_115_101_114_116 = read("prod([lit(\"assert\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"Assert\"))]))", Factory.Production);
    private static final IConstructor prod___lit_bracket_RascalReservedKeywords_no_attrs = read("prod([lit(\"bracket\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___40_iter_star__layout_type_Type_iter_star__layout_lit___41_Type_attrs___term__cons___66_114_97_99_107_101_116_bracket = read("prod([lit(\"(\"),\\iter-star(layout()),label(\"type\",sort(\"Type\")),\\iter-star(layout()),lit(\")\")],sort(\"Type\"),attrs([term(cons(\"Bracket\")),bracket()]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_all_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"all\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___Bound_attrs___term__cons___69_109_112_116_121 = read("prod([],sort(\"Bound\"),attrs([term(cons(\"Empty\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_any_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"any\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___mid_MidStringChars_StringMiddle_attrs___term__cons___77_105_100 = read("prod([label(\"mid\",sort(\"MidStringChars\"))],sort(\"StringMiddle\"),attrs([term(cons(\"Mid\"))]))", Factory.Production);
    private static final IConstructor prod___lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStatsThen_iter_star_seps__Statement__iter_star__layout_iter_star__layout_thenString_StringMiddle_iter_star__layout_postStatsThen_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_iter_star__layout_lit_else_iter_star__layout_lit___123_iter_star__layout_preStatsElse_iter_star_seps__Statement__iter_star__layout_iter_star__layout_elseString_StringMiddle_iter_star__layout_postStatsElse_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___73_102_84_104_101_110_69_108_115_101 = read("prod([lit(\"if\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStatsThen\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"thenString\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStatsThen\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\"),\\iter-star(layout()),lit(\"else\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStatsElse\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"elseString\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStatsElse\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"StringTemplate\"),attrs([term(cons(\"IfThenElse\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_lit_variable_attrs___term__literal = read("prod([\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],lit(\"variable\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___qualifiedName_QualifiedName_Assignable_attrs___term__cons___86_97_114_105_97_98_108_101 = read("prod([label(\"qualifiedName\",sort(\"QualifiedName\"))],sort(\"Assignable\"),attrs([term(cons(\"Variable\"))]))", Factory.Production);
    private static final IConstructor prod___lit_assert_iter_star__layout_expression_Expression_iter_star__layout_lit___58_iter_star__layout_message_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___65_115_115_101_114_116_87_105_116_104_77_101_115_115_97_103_101 = read("prod([lit(\"assert\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"message\",sort(\"Expression\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"AssertWithMessage\"))]))", Factory.Production);
    private static final IConstructor prod___basicType_BasicType_iter_star__layout_lit___91_iter_star__layout_arguments_iter_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_StructuredType_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"basicType\",sort(\"BasicType\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),label(\"arguments\",\\iter-seps(sort(\"TypeArg\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"StructuredType\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-star-seps(sort(\"TypeArg\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__112_112_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_lit_parameter_attrs___term__literal = read("prod([\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],lit(\"parameter\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_import_iter_star__layout_module_ImportedModule_iter_star__layout_lit___59_Import_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"import\"),\\iter-star(layout()),label(\"module\",sort(\"ImportedModule\")),\\iter-star(layout()),lit(\";\")],sort(\"Import\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_private_Visibility_attrs___term__cons___80_114_105_118_97_116_101 = read("prod([lit(\"private\")],sort(\"Visibility\"),attrs([term(cons(\"Private\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_case_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"case\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([iter(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___63_61_Assignment_attrs___term__cons___73_102_68_101_102_105_110_101_100 = read("prod([lit(\"?=\")],sort(\"Assignment\"),attrs([term(cons(\"IfDefined\"))]))", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_modifiers_FunctionModifiers_iter_star__layout_name_Name_iter_star__layout_parameters_Parameters_Signature_attrs___term__cons___78_111_84_104_114_111_119_115 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),label(\"modifiers\",sort(\"FunctionModifiers\")),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),label(\"parameters\",sort(\"Parameters\"))],sort(\"Signature\"),attrs([term(cons(\"NoThrows\"))]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__layout_elements_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___83_101_116 = read("prod([lit(\"{\"),\\iter-star(layout()),label(\"elements\",\\iter-star-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Expression\"),attrs([term(cons(\"Set\"))]))", Factory.Production);
    private static final IConstructor prod___lit_adt_RascalReservedKeywords_no_attrs = read("prod([lit(\"adt\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_TimeZonePart_attrs___term__lex = read("prod([\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)])],sort(\"TimeZonePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor regular__opt__TimeZonePart_no_attrs = read("regular(opt(sort(\"TimeZonePart\")),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___declarator_Declarator_LocalVariableDeclaration_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"declarator\",sort(\"Declarator\"))],sort(\"LocalVariableDeclaration\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_lit_void_attrs___term__literal = read("prod([\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],lit(\"void\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_fun_BasicType_attrs___term__cons___82_101_105_102_105_101_100_70_117_110_99_116_105_111_110 = read("prod([lit(\"fun\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedFunction\"))]))", Factory.Production);
    private static final IConstructor prod___lit_for_RascalReservedKeywords_no_attrs = read("prod([lit(\"for\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_true_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"true\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Type\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_lit_assoc_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],lit(\"assoc\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___assignable_Assignable_iter_star__layout_operator_Assignment_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_115_115_105_103_110_109_101_110_116 = read("prod([label(\"assignable\",sort(\"Assignable\")),\\iter-star(layout()),label(\"operator\",sort(\"Assignment\")),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Assignment\"))]))", Factory.Production);
    private static final IConstructor prod___post_PostStringChars_StringTail_attrs___term__cons___80_111_115_116 = read("prod([label(\"post\",sort(\"PostStringChars\"))],sort(\"StringTail\"),attrs([term(cons(\"Post\"))]))", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_for_iter_star__layout_lit___40_iter_star__layout_generators_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___70_111_114 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"for\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"generators\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"For\"))]))", Factory.Production);
    private static final IConstructor prod___name_Name_iter_star__layout_lit___61_iter_star__layout_initial_Expression_Variable_attrs___term__cons___73_110_105_116_105_97_108_105_122_101_100 = read("prod([label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"initial\",sort(\"Expression\"))],sort(\"Variable\"),attrs([term(cons(\"Initialized\"))]))", Factory.Production);
    private static final IConstructor prod___name_Name_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Variant_attrs___term__cons___78_65_114_121_67_111_110_115_116_114_117_99_116_111_114 = read("prod([label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"arguments\",\\iter-star-seps(sort(\"TypeArg\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"Variant\"),attrs([term(cons(\"NAryConstructor\"))]))", Factory.Production);
    private static final IConstructor prod___lit___123_iter_star__layout_statements_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_FunctionBody_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"FunctionBody\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___60_61_61_62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___69_113_117_105_118_97_108_101_110_99_101_assoc__right = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\<==\\>\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Equivalence\")),assoc(right())]))", Factory.Production);
    private static final IConstructor prod___pre_PreProtocolChars_iter_star__layout_expression_Expression_iter_star__layout_tail_ProtocolTail_ProtocolPart_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"pre\",sort(\"PreProtocolChars\")),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),label(\"tail\",sort(\"ProtocolTail\"))],sort(\"ProtocolPart\"),attrs([term(cons(\"Interpolated\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_lit_constructor_attrs___term__literal = read("prod([\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],lit(\"constructor\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex = read("prod([lit(\".\"),iter(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort(\"RealLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___constant_StringConstant_StringLiteral_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"constant\",sort(\"StringConstant\"))],sort(\"StringLiteral\"),attrs([term(cons(\"NonInterpolated\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_num_BasicType_attrs___term__cons___78_117_109 = read("prod([lit(\"num\")],sort(\"BasicType\"),attrs([term(cons(\"Num\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_lit_anno_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(110,110)]),\\char-class([range(111,111)])],lit(\"anno\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___38_iter_star__layout_name_Name_TypeVar_attrs___term__cons___70_114_101_101 = read("prod([lit(\"&\"),\\iter-star(layout()),label(\"name\",sort(\"Name\"))],sort(\"TypeVar\"),attrs([term(cons(\"Free\"))]))", Factory.Production);
    private static final IConstructor prod___modifiers_iter_star_seps__FunctionModifier__iter_star__layout_FunctionModifiers_attrs___term__cons___76_105_115_116 = read("prod([label(\"modifiers\",\\iter-star-seps(sort(\"FunctionModifier\"),[\\iter-star(layout())]))],sort(\"FunctionModifiers\"),attrs([term(cons(\"List\"))]))", Factory.Production);
    private static final IConstructor prod___lit_0_char_class___range__76_76_range__108_108_DecimalLongLiteral_attrs___term__lex = read("prod([lit(\"0\"),\\char-class([range(76,76),range(108,108)])],sort(\"DecimalLongLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_rule_Kind_attrs___term__cons___82_117_108_101 = read("prod([lit(\"rule\")],sort(\"Kind\"),attrs([term(cons(\"Rule\"))]))", Factory.Production);
    private static final IConstructor prod___DataTarget_attrs___term__cons___69_109_112_116_121 = read("prod([],sort(\"DataTarget\"),attrs([term(cons(\"Empty\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_char_class___range__76_76_range__108_108_HexLongLiteral_attrs___term__lex = read("prod([\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),iter(\\char-class([range(48,57),range(65,70),range(97,102)])),\\char-class([range(76,76),range(108,108)])],sort(\"HexLongLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__104_104_char_class___range__101_101_char_class___range__108_108_char_class___range__112_112_lit_help_attrs___term__literal = read("prod([\\char-class([range(104,104)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(112,112)])],lit(\"help\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_reified_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"reified\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___statement_Statement_Command_attrs___term__cons___83_116_97_116_101_109_101_110_116 = read("prod([label(\"statement\",sort(\"Statement\"))],sort(\"Command\"),attrs([term(cons(\"Statement\"))]))", Factory.Production);
    private static final IConstructor prod___pathChars_PathChars_PathPart_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100 = read("prod([label(\"pathChars\",sort(\"PathChars\"))],sort(\"PathPart\"),attrs([term(cons(\"NonInterpolated\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_import_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"import\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___URLChars_char_class___range__124_124_PathChars_attrs___term__lex = read("prod([sort(\"URLChars\"),\\char-class([range(124,124)])],sort(\"PathChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___40_iter_star__layout_expression_Expression_iter_star__layout_lit___41_Expression_attrs___term__cons___66_114_97_99_107_101_116_bracket = read("prod([lit(\"(\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\")\")],sort(\"Expression\"),attrs([term(cons(\"Bracket\")),bracket()]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_assert_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"assert\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_lit___61_61_62_attrs___term__literal = read("prod([\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(62,62)])],lit(\"==\\>\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___91_iter_star__layout_first_Expression_iter_star__layout_lit___46_46_iter_star__layout_last_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___82_97_110_103_101 = read("prod([lit(\"[\"),\\iter-star(layout()),label(\"first\",sort(\"Expression\")),\\iter-star(layout()),lit(\"..\"),\\iter-star(layout()),label(\"last\",sort(\"Expression\")),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"Range\"))]))", Factory.Production);
    private static final IConstructor prod___condition_Expression_iter_star__layout_lit___63_iter_star__layout_thenExp_Expression_iter_star__layout_lit___58_iter_star__layout_elseExp_Expression_Expression_attrs___term__cons___73_102_84_104_101_110_69_108_115_101_assoc__right = read("prod([label(\"condition\",sort(\"Expression\")),\\iter-star(layout()),lit(\"?\"),\\iter-star(layout()),label(\"thenExp\",sort(\"Expression\")),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"elseExp\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"IfThenElse\")),assoc(right())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_lit_test_iter_star__layout_expression_Expression_Test_attrs___term__cons___85_110_108_97_98_101_108_101_100 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),lit(\"test\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\"))],sort(\"Test\"),attrs([term(cons(\"Unlabeled\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_48_iter__char_class___range__48_55_OctalIntegerLiteral_attrs___term__lex = read("prod([\\char-class([range(48,48)]),iter(\\char-class([range(48,55)]))],sort(\"OctalIntegerLiteral\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_visit_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"visit\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Variable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___110_111_110_45_116_101_114_109_105_110_97_108_BasicType_attrs___term__cons___82_101_105_102_105_101_100_78_111_110_84_101_114_109_105_110_97_108 = read("prod([lit(\"non-terminal\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedNonTerminal\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_lit___110_111_110_45_116_101_114_109_105_110_97_108_attrs___term__literal = read("prod([\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(45,45)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],lit(\"non-terminal\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___name_Name_Variable_attrs___term__cons___85_110_73_110_105_116_105_97_108_105_122_101_100 = read("prod([label(\"name\",sort(\"Name\"))],sort(\"Variable\"),attrs([term(cons(\"UnInitialized\"))]))", Factory.Production);
    private static final IConstructor prod___lit_if_RascalReservedKeywords_no_attrs = read("prod([lit(\"if\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_ImportedModule_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"name\",sort(\"QualifiedName\"))],sort(\"ImportedModule\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60_PreStringChars_attrs___term__lex = read("prod([\\char-class([range(34,34)]),\\iter-star(sort(\"StringCharacter\")),\\char-class([range(60,60)])],sort(\"PreStringChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_DatePart_attrs___term__lex = read("prod([\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),\\char-class([range(48,51)]),\\char-class([range(48,57)])],sort(\"DatePart\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit___110_111_110_45_97_115_115_111_99_RascalReservedKeywords_no_attrs = read("prod([lit(\"non-assoc\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_solve_iter_star__layout_lit___40_iter_star__layout_variables_iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_bound_Bound_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___83_111_108_118_101 = read("prod([lit(\"solve\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"variables\",\\iter-seps(sort(\"QualifiedName\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),label(\"bound\",sort(\"Bound\")),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Solve\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_append_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"append\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_notin_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"notin\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___45_iter_star__layout_argument_Expression_Expression_attrs___term__cons___78_101_103_97_116_105_118_101 = read("prod([lit(\"-\"),\\iter-star(layout()),label(\"argument\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Negative\"))]))", Factory.Production);
    private static final IConstructor regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122_no_attrs = read("regular(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_lit_break_attrs___term__literal = read("prod([\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],lit(\"break\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit_in_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_110_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"in\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"In\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___URLChars_lit___60_PrePathChars_attrs___term__lex = read("prod([sort(\"URLChars\"),lit(\"\\<\")],sort(\"PrePathChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"statements\",\\iter-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Statement\"),attrs([term(cons(\"NonEmptyBlock\"))]))", Factory.Production);
    private static final IConstructor prod___lit_join_RascalReservedKeywords_no_attrs = read("prod([lit(\"join\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_it_RascalReservedKeywords_no_attrs = read("prod([lit(\"it\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_finally_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"finally\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___33_iter_star__layout_argument_Expression_Expression_attrs___term__cons___78_101_103_97_116_105_111_110 = read("prod([lit(\"!\"),\\iter-star(layout()),label(\"argument\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Negation\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__98_98_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__101_101_char_class___range__116_116_lit_bracket_attrs___term__literal = read("prod([\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],lit(\"bracket\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_dynamic_iter_star__layout_declarator_Declarator_LocalVariableDeclaration_attrs___term__cons___68_121_110_97_109_105_99 = read("prod([lit(\"dynamic\"),\\iter-star(layout()),label(\"declarator\",sort(\"Declarator\"))],sort(\"LocalVariableDeclaration\"),attrs([term(cons(\"Dynamic\"))]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_in_RascalReservedKeywords_no_attrs = read("prod([lit(\"in\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_false_RascalReservedKeywords_no_attrs = read("prod([lit(\"false\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_anno_iter_star__layout_annoType_Type_iter_star__layout_onType_Type_iter_star__layout_lit___64_iter_star__layout_name_Name_iter_star__layout_lit___59_Declaration_attrs___term__cons___65_110_110_111_116_97_116_105_111_110 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"anno\"),\\iter-star(layout()),label(\"annoType\",sort(\"Type\")),\\iter-star(layout()),label(\"onType\",sort(\"Type\")),\\iter-star(layout()),lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Annotation\"))]))", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_UserType_attrs___term__cons___78_97_109_101 = read("prod([label(\"name\",sort(\"QualifiedName\"))],sort(\"UserType\"),attrs([term(cons(\"Name\"))]))", Factory.Production);
    private static final IConstructor prod___iter_star__char_class___range__33_59_range__61_123_URLChars_attrs___term__lex = read("prod([\\iter-star(\\char-class([range(33,59),range(61,123)]))],sort(\"URLChars\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___name_Name_iter_star__layout_lit___40_iter_star__layout_arguments_iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Assignable_attrs___term__cons___67_111_110_115_116_114_117_99_116_111_114_assoc__non_assoc = read("prod([label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"arguments\",\\iter-seps(sort(\"Assignable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"Assignable\"),attrs([term(cons(\"Constructor\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___name_Name_iter_star__layout_lit___58_Label_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"name\",sort(\"Name\")),\\iter-star(layout()),lit(\":\")],sort(\"Label\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_lit_case_attrs___term__literal = read("prod([\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],lit(\"case\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_datetime_BasicType_attrs___term__cons___68_97_116_101_84_105_109_101 = read("prod([lit(\"datetime\")],sort(\"BasicType\"),attrs([term(cons(\"DateTime\"))]))", Factory.Production);
    private static final IConstructor prod___lit_append_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_112_112_101_110_100 = read("prod([lit(\"append\"),\\iter-star(layout()),label(\"dataTarget\",sort(\"DataTarget\")),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Append\"))]))", Factory.Production);
    private static final IConstructor prod___lit_else_RascalReservedKeywords_no_attrs = read("prod([lit(\"else\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_view_iter_star__layout_view_Name_iter_star__layout_lit___60_58_iter_star__layout_superType_Name_iter_star__layout_lit___61_iter_star__layout_alts_iter_seps__Alternative__iter_star__layout_lit___124_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___86_105_101_119 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"view\"),\\iter-star(layout()),label(\"view\",sort(\"Name\")),\\iter-star(layout()),lit(\"\\<:\"),\\iter-star(layout()),label(\"superType\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"alts\",\\iter-seps(sort(\"Alternative\"),[\\iter-star(layout()),lit(\"|\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"View\"))]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___64_iter_star__layout_name_Name_Expression_attrs___term__cons___71_101_116_65_110_110_111_116_97_116_105_111_110 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\"))],sort(\"Expression\"),attrs([term(cons(\"GetAnnotation\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_while_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"while\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_59_range__61_61_range__63_91_range__93_117_RegExp_attrs___term__lex = read("prod([\\char-class([range(48,59),range(61,61),range(63,91),range(93,117)])],sort(\"RegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_return_RascalReservedKeywords_no_attrs = read("prod([lit(\"return\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_test_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"test\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_type_BasicType_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101 = read("prod([lit(\"type\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedType\"))]))", Factory.Production);
    private static final IConstructor prod___lit_insert_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___73_110_115_101_114_116_assoc__non_assoc = read("prod([lit(\"insert\"),\\iter-star(layout()),label(\"dataTarget\",sort(\"DataTarget\")),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Insert\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___lit_visit_RascalReservedKeywords_no_attrs = read("prod([lit(\"visit\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_tuple_BasicType_attrs___term__cons___84_117_112_108_101 = read("prod([lit(\"tuple\")],sort(\"BasicType\"),attrs([term(cons(\"Tuple\"))]))", Factory.Production);
    private static final IConstructor prod___booleanLiteral_BooleanLiteral_Literal_attrs___term__cons___66_111_111_108_101_97_110 = read("prod([label(\"booleanLiteral\",sort(\"BooleanLiteral\"))],sort(\"Literal\"),attrs([term(cons(\"Boolean\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___61_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___69_113_117_97_108_115_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"==\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Equals\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_lit___58_47_47_attrs___term__literal = read("prod([\\char-class([range(58,58)]),\\char-class([range(47,47)]),\\char-class([range(47,47)])],lit(\"://\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Name__iter_star__layout_lit___58_58_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Name\"),[\\iter-star(layout()),lit(\"::\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_map_RascalReservedKeywords_no_attrs = read("prod([lit(\"map\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_try_iter_star__layout_body_Statement_iter_star__layout_handlers_iter_seps__Catch__iter_star__layout_iter_star__layout_lit_finally_iter_star__layout_finallyBody_Statement_Statement_attrs___term__cons___84_114_121_70_105_110_97_108_108_121 = read("prod([lit(\"try\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\")),\\iter-star(layout()),label(\"handlers\",\\iter-seps(sort(\"Catch\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"finally\"),\\iter-star(layout()),label(\"finallyBody\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"TryFinally\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_TimePartNoTZ_attrs___term__lex = read("prod([\\char-class([range(48,50)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)])],sort(\"TimePartNoTZ\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___lit_do_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_StringTemplate_attrs___term__cons___68_111_87_104_105_108_101 = read("prod([lit(\"do\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"body\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\"),\\iter-star(layout()),lit(\"while\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"condition\",sort(\"Expression\")),\\iter-star(layout()),lit(\")\")],sort(\"StringTemplate\"),attrs([term(cons(\"DoWhile\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___38_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_110_116_101_114_115_101_99_116_105_111_110_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"&\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Intersection\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_try_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"try\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___60_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___76_101_115_115_84_104_97_110_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"\\<\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"LessThan\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit___110_111_110_45_116_101_114_109_105_110_97_108_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"non-terminal\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_anno_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"anno\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_insert_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"insert\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_fun_RascalReservedKeywords_no_attrs = read("prod([lit(\"fun\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_alias_iter_star__layout_user_UserType_iter_star__layout_lit___61_iter_star__layout_base_Type_iter_star__layout_lit___59_Declaration_attrs___term__cons___65_108_105_97_115 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),label(\"visibility\",sort(\"Visibility\")),\\iter-star(layout()),lit(\"alias\"),\\iter-star(layout()),label(\"user\",sort(\"UserType\")),\\iter-star(layout()),lit(\"=\"),\\iter-star(layout()),label(\"base\",sort(\"Type\")),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Alias\"))]))", Factory.Production);
    private static final IConstructor prod___lit___110_111_110_45_116_101_114_109_105_110_97_108_RascalReservedKeywords_no_attrs = read("prod([lit(\"non-terminal\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___42_61_Assignment_attrs___term__cons___80_114_111_100_117_99_116 = read("prod([lit(\"*=\")],sort(\"Assignment\"),attrs([term(cons(\"Product\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_RealLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"RealLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor regular__iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Assignable\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_append_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_112_112_101_110_100_assoc__non_assoc = read("prod([lit(\"append\"),\\iter-star(layout()),label(\"dataTarget\",sort(\"DataTarget\")),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Append\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___lit_lex_BasicType_attrs___term__cons___76_101_120 = read("prod([lit(\"lex\")],sort(\"BasicType\"),attrs([term(cons(\"Lex\"))]))", Factory.Production);
    private static final IConstructor prod___lit_value_RascalReservedKeywords_no_attrs = read("prod([lit(\"value\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_true_RascalReservedKeywords_no_attrs = read("prod([lit(\"true\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___64_iter_star__layout_name_Name_iter_star__layout_contents_TagString_Tag_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"@\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),label(\"contents\",sort(\"TagString\"))],sort(\"Tag\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_for_iter_star__layout_lit___40_iter_star__layout_generators_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___70_111_114 = read("prod([lit(\"for\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"generators\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),label(\"body\",sort(\"StringMiddle\")),\\iter-star(layout()),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"StringTemplate\"),attrs([term(cons(\"For\"))]))", Factory.Production);
    private static final IConstructor regular__iter_seps__Case__iter_star__layout_no_attrs = read("regular(\\iter-seps(sort(\"Case\"),[\\iter-star(layout())]),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_join_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"join\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_reified_BasicType_attrs___term__cons___82_101_105_102_105_101_100_82_101_105_102_105_101_100_84_121_112_101 = read("prod([lit(\"reified\")],sort(\"BasicType\"),attrs([term(cons(\"ReifiedReifiedType\"))]))", Factory.Production);
    private static final IConstructor prod___lit_finally_RascalReservedKeywords_no_attrs = read("prod([lit(\"finally\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_private_RascalReservedKeywords_no_attrs = read("prod([lit(\"private\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_return_iter_star__layout_statement_Statement_Statement_attrs___term__cons___82_101_116_117_114_110_assoc__non_assoc = read("prod([lit(\"return\"),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Return\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__105_105_char_class___range__102_102_char_class___range__105_105_char_class___range__101_101_char_class___range__100_100_lit_reified_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(105,105)]),\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],lit(\"reified\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor regular__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_no_attrs = read("regular(\\iter-star(\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_real_RascalReservedKeywords_no_attrs = read("prod([lit(\"real\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_throw_iter_star__layout_statement_Statement_Statement_attrs___term__cons___84_104_114_111_119 = read("prod([lit(\"throw\"),\\iter-star(layout()),label(\"statement\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"Throw\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__114_114_char_class___range__101_101_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_lit_renaming_attrs___term__literal = read("prod([\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],lit(\"renaming\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_repeat_RascalReservedKeywords_no_attrs = read("prod([lit(\"repeat\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_lit_default_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],lit(\"default\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_RegExp_attrs___term__lex = read("prod([lit(\"\\<\"),sort(\"Name\"),lit(\":\"),\\iter-star(sort(\"NamedRegExp\")),lit(\"\\>\")],sort(\"RegExp\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_subscripts_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_Expression_attrs___term__cons___83_117_98_115_99_114_105_112_116 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),label(\"subscripts\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"Expression\"),attrs([term(cons(\"Subscript\"))]))", Factory.Production);
    private static final IConstructor prod___lit_void_RascalReservedKeywords_no_attrs = read("prod([lit(\"void\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__101_101_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_lit_edit_attrs___term__literal = read("prod([\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],lit(\"edit\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_module_Kind_attrs___term__cons___77_111_100_117_108_101 = read("prod([lit(\"module\")],sort(\"Kind\"),attrs([term(cons(\"Module\"))]))", Factory.Production);
    private static final IConstructor prod___lit_public_Visibility_attrs___term__cons___80_117_98_108_105_99 = read("prod([lit(\"public\")],sort(\"Visibility\"),attrs([term(cons(\"Public\"))]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___37_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___77_111_100_117_108_111_assoc__left = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"%\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"Modulo\")),assoc(left())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__126_126_lit___33_no_attrs = read("prod([\\char-class([range(126,126)])],lit(\"!\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___87_104_105_108_101 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"while\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),label(\"body\",sort(\"Statement\"))],sort(\"Statement\"),attrs([term(cons(\"While\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_lit_data_attrs___term__literal = read("prod([\\char-class([range(100,100)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(97,97)])],lit(\"data\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lhs_Expression_iter_star__layout_lit___63_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_102_68_101_102_105_110_101_100_79_116_104_101_114_119_105_115_101_assoc__non_assoc = read("prod([label(\"lhs\",sort(\"Expression\")),\\iter-star(layout()),lit(\"?\"),\\iter-star(layout()),label(\"rhs\",sort(\"Expression\"))],sort(\"Expression\"),attrs([term(cons(\"IfDefinedOtherwise\")),assoc(\\non-assoc())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_real_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"real\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_lit_switch_iter_star__layout_lit___40_iter_star__layout_expression_Expression_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_cases_iter_seps__Case__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___83_119_105_116_99_104 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),lit(\"switch\"),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\")\"),\\iter-star(layout()),lit(\"{\"),\\iter-star(layout()),label(\"cases\",\\iter-seps(sort(\"Case\"),[\\iter-star(layout())])),\\iter-star(layout()),lit(\"}\")],sort(\"Statement\"),attrs([term(cons(\"Switch\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_DecimalIntegerLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"DecimalIntegerLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_DateAndTime_attrs___term__lex = read("prod([lit(\"$\"),sort(\"DatePart\"),lit(\"T\"),sort(\"TimePartNoTZ\"),opt(sort(\"TimeZonePart\"))],sort(\"DateAndTime\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___header_Header_iter_star__layout_body_Body_Module_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"header\",sort(\"Header\")),\\iter-star(layout()),label(\"body\",sort(\"Body\"))],sort(\"Module\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___protocolPart_ProtocolPart_iter_star__layout_pathPart_PathPart_LocationLiteral_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"protocolPart\",sort(\"ProtocolPart\")),\\iter-star(layout()),label(\"pathPart\",sort(\"PathPart\"))],sort(\"LocationLiteral\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___lit_all_RascalReservedKeywords_no_attrs = read("prod([lit(\"all\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___34_iter_star__StringCharacter_lit___34_StringConstant_attrs___term__lex = read("prod([lit(\"\\\"\"),\\iter-star(sort(\"StringCharacter\")),lit(\"\\\"\")],sort(\"StringConstant\"),attrs([term(lex())]))", Factory.Production);
    private static final IConstructor prod___expression_Expression_iter_star__layout_lit___46_iter_star__layout_field_Name_Expression_attrs___term__cons___70_105_101_108_100_65_99_99_101_115_115 = read("prod([label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\".\"),\\iter-star(layout()),label(\"field\",sort(\"Name\"))],sort(\"Expression\"),attrs([term(cons(\"FieldAccess\"))]))", Factory.Production);
    private static final IConstructor prod___lit___47_61_Assignment_attrs___term__cons___68_105_118_105_115_105_111_110 = read("prod([lit(\"/=\")],sort(\"Assignment\"),attrs([term(cons(\"Division\"))]))", Factory.Production);
    private static final IConstructor prod___lit_try_RascalReservedKeywords_no_attrs = read("prod([lit(\"try\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___label_Label_iter_star__layout_visit_Visit_Statement_attrs___term__cons___86_105_115_105_116 = read("prod([label(\"label\",sort(\"Label\")),\\iter-star(layout()),label(\"visit\",sort(\"Visit\"))],sort(\"Statement\"),attrs([term(cons(\"Visit\"))]))", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_iter_star__layout_lit___91_iter_star__layout_parameters_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_UserType_attrs___term__cons___80_97_114_97_109_101_116_114_105_99 = read("prod([label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),lit(\"[\"),\\iter-star(layout()),label(\"parameters\",\\iter-seps(sort(\"Type\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"UserType\"),attrs([term(cons(\"Parametric\"))]))", Factory.Production);
    private static final IConstructor prod___dateAndTime_DateAndTime_DateTimeLiteral_attrs___term__cons___68_97_116_101_65_110_100_84_105_109_101_76_105_116_101_114_97_108 = read("prod([label(\"dateAndTime\",sort(\"DateAndTime\"))],sort(\"DateTimeLiteral\"),attrs([term(cons(\"DateAndTimeLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_lit_true_attrs___term__literal = read("prod([\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],lit(\"true\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___name_QualifiedName_iter_star__layout_renamings_Renamings_ImportedModule_attrs___term__cons___82_101_110_97_109_105_110_103_115 = read("prod([label(\"name\",sort(\"QualifiedName\")),\\iter-star(layout()),label(\"renamings\",sort(\"Renamings\"))],sort(\"ImportedModule\"),attrs([term(cons(\"Renamings\"))]))", Factory.Production);
    private static final IConstructor prod___lit_help_ShellCommand_attrs___term__cons___72_101_108_112 = read("prod([lit(\"help\")],sort(\"ShellCommand\"),attrs([term(cons(\"Help\"))]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_lit_rule_iter_star__layout_name_Name_iter_star__layout_patternAction_PatternWithAction_iter_star__layout_lit___59_Declaration_attrs___term__cons___82_117_108_101 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),lit(\"rule\"),\\iter-star(layout()),label(\"name\",sort(\"Name\")),\\iter-star(layout()),label(\"patternAction\",sort(\"PatternWithAction\")),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Rule\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_lit_LAYOUT_attrs___term__literal = read("prod([\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)])],lit(\"LAYOUT\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___tags_Tags_iter_star__layout_lit_test_iter_star__layout_expression_Expression_iter_star__layout_lit___58_iter_star__layout_labeled_StringLiteral_Test_attrs___term__cons___76_97_98_101_108_101_100 = read("prod([label(\"tags\",sort(\"Tags\")),\\iter-star(layout()),lit(\"test\"),\\iter-star(layout()),label(\"expression\",sort(\"Expression\")),\\iter-star(layout()),lit(\":\"),\\iter-star(layout()),label(\"labeled\",sort(\"StringLiteral\"))],sort(\"Test\"),attrs([term(cons(\"Labeled\"))]))", Factory.Production);
    private static final IConstructor prod___type_Type_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_FunctionType_attrs___term__cons___84_121_112_101_65_114_103_117_109_101_110_116_115 = read("prod([label(\"type\",sort(\"Type\")),\\iter-star(layout()),lit(\"(\"),\\iter-star(layout()),label(\"arguments\",\\iter-star-seps(sort(\"TypeArg\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\")\")],sort(\"FunctionType\"),attrs([term(cons(\"TypeArguments\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__110_110_char_class___range__121_121_lit_any_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(121,121)])],lit(\"any\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_lit_private_attrs___term__literal = read("prod([\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],lit(\"private\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit_on_RascalReservedKeywords_no_attrs = read("prod([lit(\"on\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit___91_iter_star__layout_parameters_iter_seps__TypeVar__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_ModuleParameters_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([lit(\"[\"),\\iter-star(layout()),label(\"parameters\",\\iter-seps(sort(\"TypeVar\"),[\\iter-star(layout()),lit(\",\"),\\iter-star(layout())])),\\iter-star(layout()),lit(\"]\")],sort(\"ModuleParameters\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_default_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"default\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_lit_all_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],lit(\"all\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_lit_notin_attrs___term__literal = read("prod([\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)])],lit(\"notin\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_lit_adt_attrs___term__literal = read("prod([\\char-class([range(97,97)]),\\char-class([range(100,100)]),\\char-class([range(116,116)])],lit(\"adt\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___lit___45_61_Assignment_attrs___term__cons___83_117_98_116_114_97_99_116_105_111_110 = read("prod([lit(\"-=\")],sort(\"Assignment\"),attrs([term(cons(\"Subtraction\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_constructor_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"constructor\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__62_62_lit___61_61_no_attrs = read("prod([\\char-class([range(62,62)])],lit(\"==\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_fail_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"fail\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_lang_RascalReservedKeywords_no_attrs = read("prod([lit(\"lang\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_any_RascalReservedKeywords_no_attrs = read("prod([lit(\"any\")],sort(\"RascalReservedKeywords\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___45_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"-\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___47_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"/\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___43_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"+\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___42_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"*\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___38_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"&\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___33_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"!\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___61_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"=\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___60_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"\\<\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___63_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"?\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__61_61_lit___62_no_attrs = read("prod([\\char-class([range(61,61)])],lit(\"\\>\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__58_58_lit___58_no_attrs = read("prod([\\char-class([range(58,58)])],lit(\":\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_lit_modules_attrs___term__literal = read("prod([\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(115,115)])],lit(\"modules\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_lit_void_no_attrs = read("prod([\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])],lit(\"void\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_lit_bag_attrs___term__literal = read("prod([\\char-class([range(98,98)]),\\char-class([range(97,97)]),\\char-class([range(103,103)])],lit(\"bag\"),attrs([term(literal())]))", Factory.Production);
    private static final IConstructor prod___char_class___range__47_47_range__60_60_range__62_62_range__92_92_Backslash_no_attrs = read("prod([\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],sort(\"Backslash\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___imported_Import_Command_attrs___term__cons___73_109_112_111_114_116 = read("prod([label(\"imported\",sort(\"Import\"))],sort(\"Command\"),attrs([term(cons(\"Import\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__46_46_lit___46_no_attrs = read("prod([\\char-class([range(46,46)])],lit(\".\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___from_Name_iter_star__layout_lit___61_62_iter_star__layout_to_Name_Renaming_attrs___term__cons___68_101_102_97_117_108_116 = read("prod([label(\"from\",sort(\"Name\")),\\iter-star(layout()),lit(\"=\\>\"),\\iter-star(layout()),label(\"to\",sort(\"Name\"))],sort(\"Renaming\"),attrs([term(cons(\"Default\"))]))", Factory.Production);
    private static final IConstructor prod___time_JustTime_DateTimeLiteral_attrs___term__cons___84_105_109_101_76_105_116_101_114_97_108 = read("prod([label(\"time\",sort(\"JustTime\"))],sort(\"DateTimeLiteral\"),attrs([term(cons(\"TimeLiteral\"))]))", Factory.Production);
    private static final IConstructor prod___char_class___range__38_38_lit___38_no_attrs = read("prod([\\char-class([range(38,38)])],lit(\"&\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___char_class___range__48_57_range__65_90_range__95_95_range__97_122_HexIntegerLiteral_no_attrs = read("prod([\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])],sort(\"HexIntegerLiteral\"),\\no-attrs())", Factory.Production);
    private static final IConstructor prod___lit_quit_ShellCommand_attrs___term__cons___81_117_105_116 = read("prod([lit(\"quit\")],sort(\"ShellCommand\"),attrs([term(cons(\"Quit\"))]))", Factory.Production);
    private static final IConstructor prod___test_Test_iter_star__layout_lit___59_Declaration_attrs___term__cons___84_101_115_116 = read("prod([label(\"test\",sort(\"Test\")),\\iter-star(layout()),lit(\";\")],sort(\"Declaration\"),attrs([term(cons(\"Test\"))]))", Factory.Production);
    private static final IConstructor prod___lit_break_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___66_114_101_97_107 = read("prod([lit(\"break\"),\\iter-star(layout()),label(\"target\",sort(\"Target\")),\\iter-star(layout()),lit(\";\")],sort(\"Statement\"),attrs([term(cons(\"Break\"))]))", Factory.Production);
    
    
    public RascalRascal(){
        super();
    }
    
    // Parse methods    
    
        public void Literal(){
            
                // prod([label("regExpLiteral",sort("RegExpLiteral"))],sort("Literal"),attrs([term(cons("RegExp"))]))
                expect(prod___regExpLiteral_RegExpLiteral_Literal_attrs___term__cons___82_101_103_69_120_112,
                new NonTerminalStackNode(1, "RegExpLiteral"));
            
                // prod([label("booleanLiteral",sort("BooleanLiteral"))],sort("Literal"),attrs([term(cons("Boolean"))]))
                expect(prod___booleanLiteral_BooleanLiteral_Literal_attrs___term__cons___66_111_111_108_101_97_110,
                new NonTerminalStackNode(3, "BooleanLiteral"));
            
                // prod([label("realLiteral",sort("RealLiteral"))],sort("Literal"),attrs([term(cons("Real"))]))
                expect(prod___realLiteral_RealLiteral_Literal_attrs___term__cons___82_101_97_108,
                new NonTerminalStackNode(5, "RealLiteral"));
            
                // prod([label("integerLiteral",sort("IntegerLiteral"))],sort("Literal"),attrs([term(cons("Integer"))]))
                expect(prod___integerLiteral_IntegerLiteral_Literal_attrs___term__cons___73_110_116_101_103_101_114,
                new NonTerminalStackNode(7, "IntegerLiteral"));
            
                // prod([label("stringLiteral",sort("StringLiteral"))],sort("Literal"),attrs([term(cons("String"))]))
                expect(prod___stringLiteral_StringLiteral_Literal_attrs___term__cons___83_116_114_105_110_103,
                new NonTerminalStackNode(9, "StringLiteral"));
            
                // prod([label("dateTimeLiteral",sort("DateTimeLiteral"))],sort("Literal"),attrs([term(cons("DateTime"))]))
                expect(prod___dateTimeLiteral_DateTimeLiteral_Literal_attrs___term__cons___68_97_116_101_84_105_109_101,
                new NonTerminalStackNode(11, "DateTimeLiteral"));
            
                // prod([label("locationLiteral",sort("LocationLiteral"))],sort("Literal"),attrs([term(cons("Location"))]))
                expect(prod___locationLiteral_LocationLiteral_Literal_attrs___term__cons___76_111_99_97_116_105_111_110,
                new NonTerminalStackNode(13, "LocationLiteral"));
              
        }
    
        public void Module(){
            
                // prod([label("header",sort("Header")),\iter-star(layout()),label("body",sort("Body"))],sort("Module"),attrs([term(cons("Default"))]))
                expect(prod___header_Header_iter_star__layout_body_Body_Module_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(15, "Header"),
		new ListStackNode(16, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(17, "layout"), false),
		new NonTerminalStackNode(19, "Body"));
              
        }
    
        public void TypeArg(){
            
                // prod([label("type",sort("Type"))],sort("TypeArg"),attrs([term(cons("Default"))]))
                expect(prod___type_Type_TypeArg_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(21, "Type"));
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("name",sort("Name"))],sort("TypeArg"),attrs([term(cons("Named"))]))
                expect(prod___type_Type_iter_star__layout_name_Name_TypeArg_attrs___term__cons___78_97_109_101_100,
                new NonTerminalStackNode(23, "Type"),
		new ListStackNode(24, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(25, "layout"), false),
		new NonTerminalStackNode(27, "Name"));
              
        }
    
        public void Variable(){
            
                // prod([label("name",sort("Name")),\iter-star(layout()),lit("="),\iter-star(layout()),label("initial",sort("Expression"))],sort("Variable"),attrs([term(cons("Initialized"))]))
                expect(prod___name_Name_iter_star__layout_lit___61_iter_star__layout_initial_Expression_Variable_attrs___term__cons___73_110_105_116_105_97_108_105_122_101_100,
                new NonTerminalStackNode(29, "Name"),
		new ListStackNode(30, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(31, "layout"), false),
		new LiteralStackNode(32, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(33, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(34, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(35, "layout"), false),
		new NonTerminalStackNode(37, "Expression"));
            
                // prod([label("name",sort("Name"))],sort("Variable"),attrs([term(cons("UnInitialized"))]))
                expect(prod___name_Name_Variable_attrs___term__cons___85_110_73_110_105_116_105_97_108_105_122_101_100,
                new NonTerminalStackNode(39, "Name"));
              
        }
    
        public void Catch(){
            
                // prod([lit("catch"),\iter-star(layout()),label("pattern",sort("Pattern")),\iter-star(layout()),lit(":"),\iter-star(layout()),label("body",sort("Statement"))],sort("Catch"),attrs([term(cons("Binding"))]))
                expect(prod___lit_catch_iter_star__layout_pattern_Pattern_iter_star__layout_lit___58_iter_star__layout_body_Statement_Catch_attrs___term__cons___66_105_110_100_105_110_103,
                new LiteralStackNode(40, prod___char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_catch_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(41, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,97,116,99,104}),
		new ListStackNode(42, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(43, "layout"), false),
		new NonTerminalStackNode(45, "Pattern"),
		new ListStackNode(46, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(47, "layout"), false),
		new LiteralStackNode(48, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(49, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(50, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(51, "layout"), false),
		new NonTerminalStackNode(53, "Statement"));
            
                // prod([lit("catch"),\iter-star(layout()),lit(":"),\iter-star(layout()),label("body",sort("Statement"))],sort("Catch"),attrs([term(cons("Default"))]))
                expect(prod___lit_catch_iter_star__layout_lit___58_iter_star__layout_body_Statement_Catch_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(54, prod___char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_catch_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(55, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,97,116,99,104}),
		new ListStackNode(56, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(57, "layout"), false),
		new LiteralStackNode(58, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(59, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(60, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(61, "layout"), false),
		new NonTerminalStackNode(63, "Statement"));
              
        }
    
        public void Renaming(){
            
                // prod([label("from",sort("Name")),\iter-star(layout()),lit("=\>"),\iter-star(layout()),label("to",sort("Name"))],sort("Renaming"),attrs([term(cons("Default"))]))
                expect(prod___from_Name_iter_star__layout_lit___61_62_iter_star__layout_to_Name_Renaming_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(65, "Name"),
		new ListStackNode(66, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(67, "layout"), false),
		new LiteralStackNode(68, prod___char_class___range__61_61_char_class___range__62_62_lit___61_62_attrs___term__literal, new char[] {61,62}),
		new ListStackNode(69, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(70, "layout"), false),
		new NonTerminalStackNode(72, "Name"));
              
        }
    
        public void Signature(){
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("modifiers",sort("FunctionModifiers")),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),label("parameters",sort("Parameters")),\iter-star(layout()),lit("throws"),\iter-star(layout()),label("exceptions",\iter-seps(sort("Type"),[\iter-star(layout()),lit(","),\iter-star(layout())]))],sort("Signature"),attrs([term(cons("WithThrows"))]))
                expect(prod___type_Type_iter_star__layout_modifiers_FunctionModifiers_iter_star__layout_name_Name_iter_star__layout_parameters_Parameters_iter_star__layout_lit_throws_iter_star__layout_exceptions_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_Signature_attrs___term__cons___87_105_116_104_84_104_114_111_119_115,
                new NonTerminalStackNode(74, "Type"),
		new ListStackNode(75, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(76, "layout"), false),
		new NonTerminalStackNode(78, "FunctionModifiers"),
		new ListStackNode(79, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(80, "layout"), false),
		new NonTerminalStackNode(82, "Name"),
		new ListStackNode(83, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(84, "layout"), false),
		new NonTerminalStackNode(86, "Parameters"),
		new ListStackNode(87, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(88, "layout"), false),
		new LiteralStackNode(89, prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_lit_throws_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(90, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,104,114,111,119,115}),
		new ListStackNode(91, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(92, "layout"), false),
		new SeparatedListStackNode(94, regular__iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(95, "Type"), new AbstractStackNode[]{new ListStackNode(96, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(97, "layout"), false),
		new LiteralStackNode(98, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(99, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(100, "layout"), false)}, true));
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("modifiers",sort("FunctionModifiers")),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),label("parameters",sort("Parameters"))],sort("Signature"),attrs([term(cons("NoThrows"))]))
                expect(prod___type_Type_iter_star__layout_modifiers_FunctionModifiers_iter_star__layout_name_Name_iter_star__layout_parameters_Parameters_Signature_attrs___term__cons___78_111_84_104_114_111_119_115,
                new NonTerminalStackNode(102, "Type"),
		new ListStackNode(103, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(104, "layout"), false),
		new NonTerminalStackNode(106, "FunctionModifiers"),
		new ListStackNode(107, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(108, "layout"), false),
		new NonTerminalStackNode(110, "Name"),
		new ListStackNode(111, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(112, "layout"), false),
		new NonTerminalStackNode(114, "Parameters"));
              
        }
    
        public void PathChars(){
            
                // prod([sort("URLChars"),\char-class([range(124,124)])],sort("PathChars"),attrs([term(lex())]))
                expect(prod___URLChars_char_class___range__124_124_PathChars_attrs___term__lex,
                new NonTerminalStackNode(115, "URLChars"),
		new CharStackNode(116, new char[][]{{124,124}}));
              
        }
    
        public void HexLongLiteral() {
             
                // prod([\char-class([range(48,48)]),\char-class([range(88,88),range(120,120)]),iter(\char-class([range(48,57),range(65,70),range(97,102)])),\char-class([range(76,76),range(108,108)])],sort("HexLongLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_char_class___range__76_76_range__108_108_HexLongLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(117, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(118, new char[][]{{48,48}}),
		new CharStackNode(119, new char[][]{{88,88},{120,120}}),
		new ListStackNode(120, regular__iter__char_class___range__48_57_range__65_70_range__97_102_no_attrs, new CharStackNode(121, new char[][]{{48,57},{65,70},{97,102}}), true),
		new CharStackNode(122, new char[][]{{76,76},{108,108}}));
                     
       }
    
        public void TimePartNoTZ(){
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(123, new char[][]{{48,50}}),
		new CharStackNode(124, new char[][]{{48,57}}),
		new CharStackNode(125, new char[][]{{48,53}}),
		new CharStackNode(126, new char[][]{{48,57}}),
		new CharStackNode(127, new char[][]{{48,53}}),
		new CharStackNode(128, new char[][]{{48,57}}),
		new CharStackNode(129, new char[][]{{44,44},{46,46}}),
		new CharStackNode(130, new char[][]{{48,57}}),
		new CharStackNode(131, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(132, new char[][]{{48,50}}),
		new CharStackNode(133, new char[][]{{48,57}}),
		new LiteralStackNode(134, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(135, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(136, new char[][]{{48,53}}),
		new CharStackNode(137, new char[][]{{48,57}}),
		new LiteralStackNode(138, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(139, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(140, new char[][]{{48,53}}),
		new CharStackNode(141, new char[][]{{48,57}}),
		new CharStackNode(142, new char[][]{{44,44},{46,46}}),
		new CharStackNode(143, new char[][]{{48,57}}),
		new CharStackNode(144, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(145, new char[][]{{48,50}}),
		new CharStackNode(146, new char[][]{{48,57}}),
		new CharStackNode(147, new char[][]{{48,53}}),
		new CharStackNode(148, new char[][]{{48,57}}),
		new CharStackNode(149, new char[][]{{48,53}}),
		new CharStackNode(150, new char[][]{{48,57}}),
		new CharStackNode(151, new char[][]{{44,44},{46,46}}),
		new CharStackNode(152, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(153, new char[][]{{48,50}}),
		new CharStackNode(154, new char[][]{{48,57}}),
		new LiteralStackNode(155, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(156, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(157, new char[][]{{48,53}}),
		new CharStackNode(158, new char[][]{{48,57}}),
		new LiteralStackNode(159, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(160, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(161, new char[][]{{48,53}}),
		new CharStackNode(162, new char[][]{{48,57}}),
		new CharStackNode(163, new char[][]{{44,44},{46,46}}),
		new CharStackNode(164, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(165, new char[][]{{48,50}}),
		new CharStackNode(166, new char[][]{{48,57}}),
		new LiteralStackNode(167, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(168, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(169, new char[][]{{48,53}}),
		new CharStackNode(170, new char[][]{{48,57}}),
		new LiteralStackNode(171, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(172, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(173, new char[][]{{48,53}}),
		new CharStackNode(174, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(175, new char[][]{{48,50}}),
		new CharStackNode(176, new char[][]{{48,57}}),
		new LiteralStackNode(177, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(178, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(179, new char[][]{{48,53}}),
		new CharStackNode(180, new char[][]{{48,57}}),
		new LiteralStackNode(181, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(182, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(183, new char[][]{{48,53}}),
		new CharStackNode(184, new char[][]{{48,57}}),
		new CharStackNode(185, new char[][]{{44,44},{46,46}}),
		new CharStackNode(186, new char[][]{{48,57}}),
		new CharStackNode(187, new char[][]{{48,57}}),
		new CharStackNode(188, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(189, new char[][]{{48,50}}),
		new CharStackNode(190, new char[][]{{48,57}}),
		new CharStackNode(191, new char[][]{{48,53}}),
		new CharStackNode(192, new char[][]{{48,57}}),
		new CharStackNode(193, new char[][]{{48,53}}),
		new CharStackNode(194, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,50)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)]),\char-class([range(44,44),range(46,46)]),\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)])],sort("TimePartNoTZ"),attrs([term(lex())]))
                expect(prod___char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__44_44_range__46_46_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_TimePartNoTZ_attrs___term__lex,
                new CharStackNode(195, new char[][]{{48,50}}),
		new CharStackNode(196, new char[][]{{48,57}}),
		new CharStackNode(197, new char[][]{{48,53}}),
		new CharStackNode(198, new char[][]{{48,57}}),
		new CharStackNode(199, new char[][]{{48,53}}),
		new CharStackNode(200, new char[][]{{48,57}}),
		new CharStackNode(201, new char[][]{{44,44},{46,46}}),
		new CharStackNode(202, new char[][]{{48,57}}),
		new CharStackNode(203, new char[][]{{48,57}}),
		new CharStackNode(204, new char[][]{{48,57}}));
              
        }
    
        public void DecimalLongLiteral() {
             
                // prod([\char-class([range(49,57)]),\iter-star(\char-class([range(48,57)])),\char-class([range(76,76),range(108,108)])],sort("DecimalLongLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__76_76_range__108_108_DecimalLongLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(205, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(206, new char[][]{{49,57}}),
		new ListStackNode(207, regular__iter_star__char_class___range__48_57_no_attrs, new CharStackNode(208, new char[][]{{48,57}}), false),
		new CharStackNode(209, new char[][]{{76,76},{108,108}}));
            
                // prod([lit("0"),\char-class([range(76,76),range(108,108)])],sort("DecimalLongLiteral"),attrs([term(lex())]))
                expect(prod___lit_0_char_class___range__76_76_range__108_108_DecimalLongLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(205, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(210, prod___char_class___range__48_48_lit_0_attrs___term__literal, new char[] {48}),
		new CharStackNode(211, new char[][]{{76,76},{108,108}}));
                     
       }
    
        public void Header(){
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),lit("module"),\iter-star(layout()),label("name",sort("QualifiedName")),\iter-star(layout()),label("params",sort("ModuleParameters")),\iter-star(layout()),label("imports",\iter-star-seps(sort("Import"),[\iter-star(layout())]))],sort("Header"),attrs([term(cons("Parameters"))]))
                expect(prod___tags_Tags_iter_star__layout_lit_module_iter_star__layout_name_QualifiedName_iter_star__layout_params_ModuleParameters_iter_star__layout_imports_iter_star_seps__Import__iter_star__layout_Header_attrs___term__cons___80_97_114_97_109_101_116_101_114_115,
                new NonTerminalStackNode(213, "Tags"),
		new ListStackNode(214, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(215, "layout"), false),
		new LiteralStackNode(216, prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_module_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(217, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,111,100,117,108,101}),
		new ListStackNode(218, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(219, "layout"), false),
		new NonTerminalStackNode(221, "QualifiedName"),
		new ListStackNode(222, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(223, "layout"), false),
		new NonTerminalStackNode(225, "ModuleParameters"),
		new ListStackNode(226, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(227, "layout"), false),
		new SeparatedListStackNode(229, regular__iter_star_seps__Import__iter_star__layout_no_attrs, new NonTerminalStackNode(230, "Import"), new AbstractStackNode[]{new ListStackNode(231, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(232, "layout"), false)}, false));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),lit("module"),\iter-star(layout()),label("name",sort("QualifiedName")),\iter-star(layout()),label("imports",\iter-star-seps(sort("Import"),[\iter-star(layout())]))],sort("Header"),attrs([term(cons("Default"))]))
                expect(prod___tags_Tags_iter_star__layout_lit_module_iter_star__layout_name_QualifiedName_iter_star__layout_imports_iter_star_seps__Import__iter_star__layout_Header_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(234, "Tags"),
		new ListStackNode(235, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(236, "layout"), false),
		new LiteralStackNode(237, prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_module_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(238, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,111,100,117,108,101}),
		new ListStackNode(239, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(240, "layout"), false),
		new NonTerminalStackNode(242, "QualifiedName"),
		new ListStackNode(243, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(244, "layout"), false),
		new SeparatedListStackNode(246, regular__iter_star_seps__Import__iter_star__layout_no_attrs, new NonTerminalStackNode(247, "Import"), new AbstractStackNode[]{new ListStackNode(248, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(249, "layout"), false)}, false));
              
        }
    
        public void Name() {
             
                // prod([\char-class([range(65,90),range(95,95),range(97,122)]),\iter-star(\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))],sort("Name"),attrs([term(lex())]))
//                expect(prod___char_class___range__65_90_range__95_95_range__97_122_iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122_Name_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(250, new char[][]{{48,57},{65,90},{95,95},{97,122}}), new NonTerminalStackNode(251, "RascalReservedKeywords")},
//                new CharStackNode(252, new char[][]{{65,90},{95,95},{97,122}}),
//		new ListStackNode(253, regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122_no_attrs, new CharStackNode(254, new char[][]{{48,57},{65,90},{95,95},{97,122}}), false));
            
                // prod([sort("EscapedName")],sort("Name"),attrs([term(lex())]))
//                expect(prod___EscapedName_Name_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(250, new char[][]{{48,57},{65,90},{95,95},{97,122}}), new NonTerminalStackNode(251, "RascalReservedKeywords")},
//                new NonTerminalStackNode(255, "EscapedName"));
                     
       }
    
        public void Test(){
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),lit("test"),\iter-star(layout()),label("expression",sort("Expression"))],sort("Test"),attrs([term(cons("Unlabeled"))]))
                expect(prod___tags_Tags_iter_star__layout_lit_test_iter_star__layout_expression_Expression_Test_attrs___term__cons___85_110_108_97_98_101_108_101_100,
                new NonTerminalStackNode(257, "Tags"),
		new ListStackNode(258, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(259, "layout"), false),
		new LiteralStackNode(260, prod___char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_lit_test_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(261, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,101,115,116}),
		new ListStackNode(262, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(263, "layout"), false),
		new NonTerminalStackNode(265, "Expression"));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),lit("test"),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),lit(":"),\iter-star(layout()),label("labeled",sort("StringLiteral"))],sort("Test"),attrs([term(cons("Labeled"))]))
                expect(prod___tags_Tags_iter_star__layout_lit_test_iter_star__layout_expression_Expression_iter_star__layout_lit___58_iter_star__layout_labeled_StringLiteral_Test_attrs___term__cons___76_97_98_101_108_101_100,
                new NonTerminalStackNode(267, "Tags"),
		new ListStackNode(268, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(269, "layout"), false),
		new LiteralStackNode(270, prod___char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_lit_test_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(271, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,101,115,116}),
		new ListStackNode(272, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(273, "layout"), false),
		new NonTerminalStackNode(275, "Expression"),
		new ListStackNode(276, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(277, "layout"), false),
		new LiteralStackNode(278, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(279, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(280, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(281, "layout"), false),
		new NonTerminalStackNode(283, "StringLiteral"));
              
        }
    
        public void ImportedModule(){
            
                // prod([label("name",sort("QualifiedName")),\iter-star(layout()),label("actuals",sort("ModuleActuals")),\iter-star(layout()),label("renamings",sort("Renamings"))],sort("ImportedModule"),attrs([term(cons("ActualsRenaming"))]))
                expect(prod___name_QualifiedName_iter_star__layout_actuals_ModuleActuals_iter_star__layout_renamings_Renamings_ImportedModule_attrs___term__cons___65_99_116_117_97_108_115_82_101_110_97_109_105_110_103,
                new NonTerminalStackNode(285, "QualifiedName"),
		new ListStackNode(286, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(287, "layout"), false),
		new NonTerminalStackNode(289, "ModuleActuals"),
		new ListStackNode(290, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(291, "layout"), false),
		new NonTerminalStackNode(293, "Renamings"));
            
                // prod([label("name",sort("QualifiedName"))],sort("ImportedModule"),attrs([term(cons("Default"))]))
                expect(prod___name_QualifiedName_ImportedModule_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(295, "QualifiedName"));
            
                // prod([label("name",sort("QualifiedName")),\iter-star(layout()),label("actuals",sort("ModuleActuals"))],sort("ImportedModule"),attrs([term(cons("Actuals"))]))
                expect(prod___name_QualifiedName_iter_star__layout_actuals_ModuleActuals_ImportedModule_attrs___term__cons___65_99_116_117_97_108_115,
                new NonTerminalStackNode(297, "QualifiedName"),
		new ListStackNode(298, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(299, "layout"), false),
		new NonTerminalStackNode(301, "ModuleActuals"));
            
                // prod([label("name",sort("QualifiedName")),\iter-star(layout()),label("renamings",sort("Renamings"))],sort("ImportedModule"),attrs([term(cons("Renamings"))]))
                expect(prod___name_QualifiedName_iter_star__layout_renamings_Renamings_ImportedModule_attrs___term__cons___82_101_110_97_109_105_110_103_115,
                new NonTerminalStackNode(303, "QualifiedName"),
		new ListStackNode(304, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(305, "layout"), false),
		new NonTerminalStackNode(307, "Renamings"));
              
        }
    
        public void Expression(){
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[5])),\iter-star(layout()),lit("\>"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[5]))],sort("Expression"),attrs([term(cons("GreaterThan")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___71_114_101_97_116_101_114_84_104_97_110_assoc__non_assoc,
                new NonTerminalStackNode(309, "Expression_assoc__5"),
		new ListStackNode(310, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(311, "layout"), false),
		new LiteralStackNode(312, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(313, new char[][]{{61,61}})}, new char[] {62}),
		new ListStackNode(314, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(315, "layout"), false),
		new NonTerminalStackNode(317, "Expression_assoc__5"));
            
                // prod([lit("["),\iter-star(layout()),label("first",sort("Expression")),\iter-star(layout()),lit(".."),\iter-star(layout()),label("last",sort("Expression")),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("Range"))]))
                expect(prod___lit___91_iter_star__layout_first_Expression_iter_star__layout_lit___46_46_iter_star__layout_last_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___82_97_110_103_101,
                new LiteralStackNode(318, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(319, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(320, "layout"), false),
		new NonTerminalStackNode(322, "Expression"),
		new ListStackNode(323, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(324, "layout"), false),
		new LiteralStackNode(325, prod___char_class___range__46_46_char_class___range__46_46_lit___46_46_attrs___term__literal, new char[] {46,46}),
		new ListStackNode(326, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(327, "layout"), false),
		new NonTerminalStackNode(329, "Expression"),
		new ListStackNode(330, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(331, "layout"), false),
		new LiteralStackNode(332, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("["),\iter-star(layout()),label("key",sort("Name")),\iter-star(layout()),lit("="),\iter-star(layout()),label("replacement",sort("Expression")),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("FieldUpdate"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_key_Name_iter_star__layout_lit___61_iter_star__layout_replacement_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___70_105_101_108_100_85_112_100_97_116_101,
                new NonTerminalStackNode(334, "Expression"),
		new ListStackNode(335, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(336, "layout"), false),
		new LiteralStackNode(337, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(338, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(339, "layout"), false),
		new NonTerminalStackNode(341, "Name"),
		new ListStackNode(342, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(343, "layout"), false),
		new LiteralStackNode(344, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(345, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(346, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(347, "layout"), false),
		new NonTerminalStackNode(349, "Expression"),
		new ListStackNode(350, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(351, "layout"), false),
		new LiteralStackNode(352, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([sort("Expression"),\iter-star(layout()),lit("+"),\iter-star(layout()),sort("Expression")],sort("Expression"),\no-attrs())
                expect(prod___Expression_iter_star__layout_lit___43_iter_star__layout_Expression_Expression_no_attrs,
                new NonTerminalStackNode(353, "Expression"),
		new ListStackNode(354, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(355, "layout"), false),
		new LiteralStackNode(356, prod___char_class___range__43_43_lit___43_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(357, new char[][]{{61,61}})}, new char[] {43}),
		new ListStackNode(358, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(359, "layout"), false),
		new NonTerminalStackNode(360, "Expression"));
            
                // prod([label("parameters",sort("Parameters")),\iter-star(layout()),lit("{"),\iter-star(layout()),label("statements",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Expression"),attrs([term(cons("VoidClosure"))]))
                expect(prod___parameters_Parameters_iter_star__layout_lit___123_iter_star__layout_statements_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___86_111_105_100_67_108_111_115_117_114_101,
                new NonTerminalStackNode(362, "Parameters"),
		new ListStackNode(363, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(364, "layout"), false),
		new LiteralStackNode(365, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(366, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(367, "layout"), false),
		new SeparatedListStackNode(369, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(370, "Statement"), new AbstractStackNode[]{new ListStackNode(371, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(372, "layout"), false)}, false),
		new ListStackNode(373, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(374, "layout"), false),
		new LiteralStackNode(375, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[5])),\iter-star(layout()),lit("\<"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[5]))],sort("Expression"),attrs([term(cons("LessThan")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___60_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___76_101_115_115_84_104_97_110_assoc__non_assoc,
                new NonTerminalStackNode(377, "Expression_assoc__5"),
		new ListStackNode(378, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(379, "layout"), false),
		new LiteralStackNode(380, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(381, new char[][]{{61,61}})}, new char[] {60}),
		new ListStackNode(382, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(383, "layout"), false),
		new NonTerminalStackNode(385, "Expression_assoc__5"));
            
                // prod([label("argument",sort("Expression")),\iter-star(layout()),lit("?")],sort("Expression"),attrs([term(cons("IsDefined"))]))
                expect(prod___argument_Expression_iter_star__layout_lit___63_Expression_attrs___term__cons___73_115_68_101_102_105_110_101_100,
                new NonTerminalStackNode(387, "Expression"),
		new ListStackNode(388, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(389, "layout"), false),
		new LiteralStackNode(390, prod___char_class___range__63_63_lit___63_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(391, new char[][]{{61,61}})}, new char[] {63}));
            
                // prod([lit("["),\iter-star(layout()),label("elements",\iter-star-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("List"))]))
                expect(prod___lit___91_iter_star__layout_elements_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_Expression_attrs___term__cons___76_105_115_116,
                new LiteralStackNode(392, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(393, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(394, "layout"), false),
		new SeparatedListStackNode(396, regular__iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(397, "Expression"), new AbstractStackNode[]{new ListStackNode(398, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(399, "layout"), false),
		new LiteralStackNode(400, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(401, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(402, "layout"), false)}, false),
		new ListStackNode(403, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(404, "layout"), false),
		new LiteralStackNode(405, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),label("visit",sort("Visit"))],sort("Expression"),attrs([term(cons("Visit"))]))
                expect(prod___label_Label_iter_star__layout_visit_Visit_Expression_attrs___term__cons___86_105_115_105_116,
                new NonTerminalStackNode(407, "Label"),
		new ListStackNode(408, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(409, "layout"), false),
		new NonTerminalStackNode(411, "Visit"));
            
                // prod([sort("Expression"),\iter-star(layout()),lit("*"),\iter-star(layout()),sort("Expression")],sort("Expression"),\no-attrs())
                expect(prod___Expression_iter_star__layout_lit___42_iter_star__layout_Expression_Expression_no_attrs,
                new NonTerminalStackNode(412, "Expression"),
		new ListStackNode(413, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(414, "layout"), false),
		new LiteralStackNode(415, prod___char_class___range__42_42_lit___42_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(416, new char[][]{{61,61}})}, new char[] {42}),
		new ListStackNode(417, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(418, "layout"), false),
		new NonTerminalStackNode(419, "Expression"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("*"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[10]))],sort("Expression"),attrs([term(cons("Product")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___42_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___80_114_111_100_117_99_116_assoc__left,
                new NonTerminalStackNode(421, "Expression"),
		new ListStackNode(422, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(423, "layout"), false),
		new LiteralStackNode(424, prod___char_class___range__42_42_lit___42_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(425, new char[][]{{61,61}})}, new char[] {42}),
		new ListStackNode(426, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(427, "layout"), false),
		new NonTerminalStackNode(429, "Expression_assoc__10"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("-"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[7]))],sort("Expression"),attrs([term(cons("Subtraction")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___45_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___83_117_98_116_114_97_99_116_105_111_110_assoc__left,
                new NonTerminalStackNode(431, "Expression"),
		new ListStackNode(432, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(433, "layout"), false),
		new LiteralStackNode(434, prod___char_class___range__45_45_lit___45_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(435, new char[][]{{61,61}})}, new char[] {45}),
		new ListStackNode(436, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(437, "layout"), false),
		new NonTerminalStackNode(439, "Expression_assoc__7"));
            
                // prod([label("literal",sort("Literal"))],sort("Expression"),attrs([term(cons("Literal"))]))
                expect(prod___literal_Literal_Expression_attrs___term__cons___76_105_116_101_114_97_108,
                new NonTerminalStackNode(441, "Literal"));
            
                // prod([label("argument",sort("Expression")),\iter-star(layout()),lit("*")],sort("Expression"),attrs([term(cons("TransitiveReflexiveClosure"))]))
                expect(prod___argument_Expression_iter_star__layout_lit___42_Expression_attrs___term__cons___84_114_97_110_115_105_116_105_118_101_82_101_102_108_101_120_105_118_101_67_108_111_115_117_114_101,
                new NonTerminalStackNode(443, "Expression"),
		new ListStackNode(444, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(445, "layout"), false),
		new LiteralStackNode(446, prod___char_class___range__42_42_lit___42_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(447, new char[][]{{61,61}})}, new char[] {42}));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[3])),\iter-star(layout()),lit("?"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[3]))],sort("Expression"),attrs([term(cons("IfDefinedOtherwise")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___63_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_102_68_101_102_105_110_101_100_79_116_104_101_114_119_105_115_101_assoc__non_assoc,
                new NonTerminalStackNode(449, "Expression_assoc__3"),
		new ListStackNode(450, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(451, "layout"), false),
		new LiteralStackNode(452, prod___char_class___range__63_63_lit___63_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(453, new char[][]{{61,61}})}, new char[] {63}),
		new ListStackNode(454, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(455, "layout"), false),
		new NonTerminalStackNode(457, "Expression_assoc__3"));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[4])),\iter-star(layout()),lit("in"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[4]))],sort("Expression"),attrs([term(cons("In")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit_in_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_110_assoc__non_assoc,
                new NonTerminalStackNode(459, "Expression_assoc__4"),
		new ListStackNode(460, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(461, "layout"), false),
		new LiteralStackNode(462, prod___char_class___range__105_105_char_class___range__110_110_lit_in_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(463, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110}),
		new ListStackNode(464, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(465, "layout"), false),
		new NonTerminalStackNode(467, "Expression_assoc__4"));
            
                // prod([lit("\<"),\iter-star(layout()),label("elements",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("\>")],sort("Expression"),attrs([term(cons("Tuple"))]))
                expect(prod___lit___60_iter_star__layout_elements_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Expression_attrs___term__cons___84_117_112_108_101,
                new LiteralStackNode(468, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(469, new char[][]{{61,61}})}, new char[] {60}),
		new ListStackNode(470, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(471, "layout"), false),
		new SeparatedListStackNode(473, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(474, "Expression"), new AbstractStackNode[]{new ListStackNode(475, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(476, "layout"), false),
		new LiteralStackNode(477, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(478, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(479, "layout"), false)}, true),
		new ListStackNode(480, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(481, "layout"), false),
		new LiteralStackNode(482, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(483, new char[][]{{61,61}})}, new char[] {62}));
            
                // prod([label("argument",sort("Expression")),\iter-star(layout()),lit("+")],sort("Expression"),attrs([term(cons("TransitiveClosure"))]))
                expect(prod___argument_Expression_iter_star__layout_lit___43_Expression_attrs___term__cons___84_114_97_110_115_105_116_105_118_101_67_108_111_115_117_114_101,
                new NonTerminalStackNode(485, "Expression"),
		new ListStackNode(486, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(487, "layout"), false),
		new LiteralStackNode(488, prod___char_class___range__43_43_lit___43_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(489, new char[][]{{61,61}})}, new char[] {43}));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("%"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[12]))],sort("Expression"),attrs([term(cons("Modulo")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___37_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___77_111_100_117_108_111_assoc__left,
                new NonTerminalStackNode(491, "Expression"),
		new ListStackNode(492, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(493, "layout"), false),
		new LiteralStackNode(494, prod___char_class___range__37_37_lit___37_attrs___term__literal, new char[] {37}),
		new ListStackNode(495, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(496, "layout"), false),
		new NonTerminalStackNode(498, "Expression_assoc__12"));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[4])),\iter-star(layout()),lit("notin"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[4]))],sort("Expression"),attrs([term(cons("NotIn")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit_notin_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___78_111_116_73_110_assoc__non_assoc,
                new NonTerminalStackNode(500, "Expression_assoc__4"),
		new ListStackNode(501, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(502, "layout"), false),
		new LiteralStackNode(503, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_lit_notin_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(504, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,116,105,110}),
		new ListStackNode(505, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(506, "layout"), false),
		new NonTerminalStackNode(508, "Expression_assoc__4"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("&&"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[2]))],sort("Expression"),attrs([term(cons("And")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___38_38_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___65_110_100_assoc__left,
                new NonTerminalStackNode(510, "Expression"),
		new ListStackNode(511, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(512, "layout"), false),
		new LiteralStackNode(513, prod___char_class___range__38_38_char_class___range__38_38_lit___38_38_attrs___term__literal, new char[] {38,38}),
		new ListStackNode(514, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(515, "layout"), false),
		new NonTerminalStackNode(517, "Expression_assoc__2"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("join"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[10]))],sort("Expression"),attrs([term(cons("Join")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit_join_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___74_111_105_110_assoc__left,
                new NonTerminalStackNode(519, "Expression"),
		new ListStackNode(520, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(521, "layout"), false),
		new LiteralStackNode(522, prod___char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_lit_join_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(523, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {106,111,105,110}),
		new ListStackNode(524, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(525, "layout"), false),
		new NonTerminalStackNode(527, "Expression_assoc__10"));
            
                // prod([lit("-"),\iter-star(layout()),sort("Expression")],sort("Expression"),\no-attrs())
                expect(prod___lit___45_iter_star__layout_Expression_Expression_no_attrs,
                new LiteralStackNode(528, prod___char_class___range__45_45_lit___45_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(529, new char[][]{{61,61}})}, new char[] {45}),
		new ListStackNode(530, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(531, "layout"), false),
		new NonTerminalStackNode(532, "Expression"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("||"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[6]))],sort("Expression"),attrs([term(cons("Or")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___124_124_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___79_114_assoc__left,
                new NonTerminalStackNode(534, "Expression"),
		new ListStackNode(535, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(536, "layout"), false),
		new LiteralStackNode(537, prod___char_class___range__124_124_char_class___range__124_124_lit___124_124_attrs___term__literal, new char[] {124,124}),
		new ListStackNode(538, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(539, "layout"), false),
		new NonTerminalStackNode(541, "Expression_assoc__6"));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("["),\iter-star(layout()),lit("@"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),lit("="),\iter-star(layout()),label("value",sort("Expression")),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("SetAnnotation"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_lit___64_iter_star__layout_name_Name_iter_star__layout_lit___61_iter_star__layout_value_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___83_101_116_65_110_110_111_116_97_116_105_111_110,
                new NonTerminalStackNode(543, "Expression"),
		new ListStackNode(544, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(545, "layout"), false),
		new LiteralStackNode(546, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(547, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(548, "layout"), false),
		new LiteralStackNode(549, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(550, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(551, "layout"), false),
		new NonTerminalStackNode(553, "Name"),
		new ListStackNode(554, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(555, "layout"), false),
		new LiteralStackNode(556, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(557, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(558, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(559, "layout"), false),
		new NonTerminalStackNode(561, "Expression"),
		new ListStackNode(562, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(563, "layout"), false),
		new LiteralStackNode(564, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("expression",prime(sort("Expression"),"prio",[1])),\iter-star(layout()),lit("["),\iter-star(layout()),label("subscripts",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("Subscript"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_subscripts_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_Expression_attrs___term__cons___83_117_98_115_99_114_105_112_116,
                new NonTerminalStackNode(566, "Expression_prio__1"),
		new ListStackNode(567, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(568, "layout"), false),
		new LiteralStackNode(569, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(570, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(571, "layout"), false),
		new SeparatedListStackNode(573, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(574, "Expression"), new AbstractStackNode[]{new ListStackNode(575, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(576, "layout"), false),
		new LiteralStackNode(577, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(578, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(579, "layout"), false)}, true),
		new ListStackNode(580, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(581, "layout"), false),
		new LiteralStackNode(582, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("["),\iter-star(layout()),label("subscripts",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("Subscript"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___91_iter_star__layout_subscripts_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_Expression_attrs___term__cons___83_117_98_115_99_114_105_112_116,
                new NonTerminalStackNode(584, "Expression"),
		new ListStackNode(585, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(586, "layout"), false),
		new LiteralStackNode(587, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(588, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(589, "layout"), false),
		new SeparatedListStackNode(591, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(592, "Expression"), new AbstractStackNode[]{new ListStackNode(593, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(594, "layout"), false),
		new LiteralStackNode(595, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(596, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(597, "layout"), false)}, true),
		new ListStackNode(598, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(599, "layout"), false),
		new LiteralStackNode(600, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("("),\iter-star(layout()),label("arguments",\iter-star-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("Expression"),attrs([term(cons("CallOrTree"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___67_97_108_108_79_114_84_114_101_101,
                new NonTerminalStackNode(602, "Expression"),
		new ListStackNode(603, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(604, "layout"), false),
		new LiteralStackNode(605, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(606, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(607, "layout"), false),
		new SeparatedListStackNode(609, regular__iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(610, "Expression"), new AbstractStackNode[]{new ListStackNode(611, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(612, "layout"), false),
		new LiteralStackNode(613, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(614, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(615, "layout"), false)}, false),
		new ListStackNode(616, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(617, "layout"), false),
		new LiteralStackNode(618, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([label("qualifiedName",sort("QualifiedName"))],sort("Expression"),attrs([term(cons("QualifiedName"))]))
                expect(prod___qualifiedName_QualifiedName_Expression_attrs___term__cons___81_117_97_108_105_102_105_101_100_78_97_109_101,
                new NonTerminalStackNode(620, "QualifiedName"));
            
                // prod([lit("-"),\iter-star(layout()),label("argument",sort("Expression"))],sort("Expression"),attrs([term(cons("Negative"))]))
                expect(prod___lit___45_iter_star__layout_argument_Expression_Expression_attrs___term__cons___78_101_103_97_116_105_118_101,
                new LiteralStackNode(621, prod___char_class___range__45_45_lit___45_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(622, new char[][]{{61,61}})}, new char[] {45}),
		new ListStackNode(623, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(624, "layout"), false),
		new NonTerminalStackNode(626, "Expression"));
            
                // prod([lit("["),\iter-star(layout()),label("first",sort("Expression")),\iter-star(layout()),lit(","),\iter-star(layout()),label("second",sort("Expression")),\iter-star(layout()),lit(".."),\iter-star(layout()),label("last",sort("Expression")),\iter-star(layout()),lit("]")],sort("Expression"),attrs([term(cons("StepRange"))]))
                expect(prod___lit___91_iter_star__layout_first_Expression_iter_star__layout_lit___44_iter_star__layout_second_Expression_iter_star__layout_lit___46_46_iter_star__layout_last_Expression_iter_star__layout_lit___93_Expression_attrs___term__cons___83_116_101_112_82_97_110_103_101,
                new LiteralStackNode(627, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(628, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(629, "layout"), false),
		new NonTerminalStackNode(631, "Expression"),
		new ListStackNode(632, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(633, "layout"), false),
		new LiteralStackNode(634, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(635, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(636, "layout"), false),
		new NonTerminalStackNode(638, "Expression"),
		new ListStackNode(639, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(640, "layout"), false),
		new LiteralStackNode(641, prod___char_class___range__46_46_char_class___range__46_46_lit___46_46_attrs___term__literal, new char[] {46,46}),
		new ListStackNode(642, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(643, "layout"), false),
		new NonTerminalStackNode(645, "Expression"),
		new ListStackNode(646, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(647, "layout"), false),
		new LiteralStackNode(648, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("/"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[12]))],sort("Expression"),attrs([term(cons("Division")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___47_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___68_105_118_105_115_105_111_110_assoc__left,
                new NonTerminalStackNode(650, "Expression"),
		new ListStackNode(651, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(652, "layout"), false),
		new LiteralStackNode(653, prod___char_class___range__47_47_lit___47_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(654, new char[][]{{61,61}})}, new char[] {47}),
		new ListStackNode(655, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(656, "layout"), false),
		new NonTerminalStackNode(658, "Expression_assoc__12"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("=="),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[11]))],sort("Expression"),attrs([term(cons("Equals")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___61_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___69_113_117_97_108_115_assoc__left,
                new NonTerminalStackNode(660, "Expression"),
		new ListStackNode(661, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(662, "layout"), false),
		new LiteralStackNode(663, prod___char_class___range__61_61_char_class___range__61_61_lit___61_61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(664, new char[][]{{62,62}})}, new char[] {61,61}),
		new ListStackNode(665, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(666, "layout"), false),
		new NonTerminalStackNode(668, "Expression_assoc__11"));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("\<"),\iter-star(layout()),label("fields",\iter-seps(sort("Field"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("\>")],sort("Expression"),attrs([term(cons("FieldProject"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___60_iter_star__layout_fields_iter_seps__Field__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Expression_attrs___term__cons___70_105_101_108_100_80_114_111_106_101_99_116,
                new NonTerminalStackNode(670, "Expression"),
		new ListStackNode(671, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(672, "layout"), false),
		new LiteralStackNode(673, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(674, new char[][]{{61,61}})}, new char[] {60}),
		new ListStackNode(675, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(676, "layout"), false),
		new SeparatedListStackNode(678, regular__iter_seps__Field__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(679, "Field"), new AbstractStackNode[]{new ListStackNode(680, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(681, "layout"), false),
		new LiteralStackNode(682, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(683, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(684, "layout"), false)}, true),
		new ListStackNode(685, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(686, "layout"), false),
		new LiteralStackNode(687, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(688, new char[][]{{61,61}})}, new char[] {62}));
            
                // prod([lit("!"),\iter-star(layout()),label("argument",sort("Expression"))],sort("Expression"),attrs([term(cons("Negation"))]))
                expect(prod___lit___33_iter_star__layout_argument_Expression_Expression_attrs___term__cons___78_101_103_97_116_105_111_110,
                new LiteralStackNode(689, prod___char_class___range__33_33_lit___33_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(690, new char[][]{{61,61}})}, new char[] {33}),
		new ListStackNode(691, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(692, "layout"), false),
		new NonTerminalStackNode(694, "Expression"));
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("parameters",sort("Parameters")),\iter-star(layout()),lit("{"),\iter-star(layout()),label("statements",\iter-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Expression"),attrs([term(cons("Closure"))]))
                expect(prod___type_Type_iter_star__layout_parameters_Parameters_iter_star__layout_lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___67_108_111_115_117_114_101,
                new NonTerminalStackNode(696, "Type"),
		new ListStackNode(697, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(698, "layout"), false),
		new NonTerminalStackNode(700, "Parameters"),
		new ListStackNode(701, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(702, "layout"), false),
		new LiteralStackNode(703, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(704, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(705, "layout"), false),
		new SeparatedListStackNode(707, regular__iter_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(708, "Statement"), new AbstractStackNode[]{new ListStackNode(709, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(710, "layout"), false)}, true),
		new ListStackNode(711, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(712, "layout"), false),
		new LiteralStackNode(713, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[5])),\iter-star(layout()),lit("\<="),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[5]))],sort("Expression"),attrs([term(cons("LessThanOrEq")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___60_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___76_101_115_115_84_104_97_110_79_114_69_113_assoc__non_assoc,
                new NonTerminalStackNode(715, "Expression_assoc__5"),
		new ListStackNode(716, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(717, "layout"), false),
		new LiteralStackNode(718, prod___char_class___range__60_60_char_class___range__61_61_lit___60_61_attrs___term__literal, new IReducableStackNode[] {}, new char[] {60,61}),
		new ListStackNode(719, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(720, "layout"), false),
		new NonTerminalStackNode(722, "Expression_assoc__5"));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[1])),\iter-star(layout()),lit("==\>"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[1]))],sort("Expression"),attrs([term(cons("Implication")),assoc(right())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___61_61_62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_109_112_108_105_99_97_116_105_111_110_assoc__right,
                new NonTerminalStackNode(724, "Expression_assoc__1"),
		new ListStackNode(725, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(726, "layout"), false),
		new LiteralStackNode(727, prod___char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_lit___61_61_62_attrs___term__literal, new char[] {61,61,62}),
		new ListStackNode(728, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(729, "layout"), false),
		new NonTerminalStackNode(731, "Expression_assoc__1"));
            
                // prod([lit("#"),\iter-star(layout()),label("type",sort("Type"))],sort("Expression"),attrs([term(cons("ReifyType"))]))
                expect(prod___lit___35_iter_star__layout_type_Type_Expression_attrs___term__cons___82_101_105_102_121_84_121_112_101,
                new LiteralStackNode(732, prod___char_class___range__35_35_lit___35_attrs___term__literal, new char[] {35}),
		new ListStackNode(733, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(734, "layout"), false),
		new NonTerminalStackNode(736, "Type"));
            
                // prod([label("condition",sort("Expression")),\iter-star(layout()),lit("?"),\iter-star(layout()),label("thenExp",sort("Expression")),\iter-star(layout()),lit(":"),\iter-star(layout()),label("elseExp",prime(sort("Expression"),"assoc",[11]))],sort("Expression"),attrs([term(cons("IfThenElse")),assoc(right())]))
                expect(prod___condition_Expression_iter_star__layout_lit___63_iter_star__layout_thenExp_Expression_iter_star__layout_lit___58_iter_star__layout_elseExp_Expression_Expression_attrs___term__cons___73_102_84_104_101_110_69_108_115_101_assoc__right,
                new NonTerminalStackNode(738, "Expression"),
		new ListStackNode(739, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(740, "layout"), false),
		new LiteralStackNode(741, prod___char_class___range__63_63_lit___63_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(742, new char[][]{{61,61}})}, new char[] {63}),
		new ListStackNode(743, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(744, "layout"), false),
		new NonTerminalStackNode(746, "Expression"),
		new ListStackNode(747, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(748, "layout"), false),
		new LiteralStackNode(749, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(750, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(751, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(752, "layout"), false),
		new NonTerminalStackNode(754, "Expression_assoc__11"));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[5])),\iter-star(layout()),lit("\>="),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[5]))],sort("Expression"),attrs([term(cons("GreaterThanOrEq")),assoc(\non-assoc())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___62_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___71_114_101_97_116_101_114_84_104_97_110_79_114_69_113_assoc__non_assoc,
                new NonTerminalStackNode(756, "Expression_assoc__5"),
		new ListStackNode(757, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(758, "layout"), false),
		new LiteralStackNode(759, prod___char_class___range__62_62_char_class___range__61_61_lit___62_61_attrs___term__literal, new char[] {62,61}),
		new ListStackNode(760, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(761, "layout"), false),
		new NonTerminalStackNode(763, "Expression_assoc__5"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("+"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[7]))],sort("Expression"),attrs([term(cons("Addition")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___43_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___65_100_100_105_116_105_111_110_assoc__left,
                new NonTerminalStackNode(765, "Expression"),
		new ListStackNode(766, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(767, "layout"), false),
		new LiteralStackNode(768, prod___char_class___range__43_43_lit___43_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(769, new char[][]{{61,61}})}, new char[] {43}),
		new ListStackNode(770, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(771, "layout"), false),
		new NonTerminalStackNode(773, "Expression_assoc__7"));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("."),\iter-star(layout()),label("field",sort("Name"))],sort("Expression"),attrs([term(cons("FieldAccess"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___46_iter_star__layout_field_Name_Expression_attrs___term__cons___70_105_101_108_100_65_99_99_101_115_115,
                new NonTerminalStackNode(775, "Expression"),
		new ListStackNode(776, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(777, "layout"), false),
		new LiteralStackNode(778, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(779, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(780, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(781, "layout"), false),
		new NonTerminalStackNode(783, "Name"));
            
                // prod([lit("("),\iter-star(layout()),label("mappings",\iter-star-seps(\parameterized-sort("Mapping",[sort("Expression")]),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("Expression"),attrs([term(cons("Map"))]))
                expect(prod___lit___40_iter_star__layout_mappings_iter_star_seps__Mapping__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___77_97_112,
                new LiteralStackNode(784, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(785, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(786, "layout"), false),
		new SeparatedListStackNode(788, regular__iter_star_seps__Mapping__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(789, "Mapping__Expression"), new AbstractStackNode[]{new ListStackNode(790, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(791, "layout"), false),
		new LiteralStackNode(792, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(793, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(794, "layout"), false)}, false),
		new ListStackNode(795, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(796, "layout"), false),
		new LiteralStackNode(797, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("&"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[8]))],sort("Expression"),attrs([term(cons("Intersection")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___38_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___73_110_116_101_114_115_101_99_116_105_111_110_assoc__left,
                new NonTerminalStackNode(799, "Expression"),
		new ListStackNode(800, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(801, "layout"), false),
		new LiteralStackNode(802, prod___char_class___range__38_38_lit___38_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(803, new char[][]{{38,38}})}, new char[] {38}),
		new ListStackNode(804, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(805, "layout"), false),
		new NonTerminalStackNode(807, "Expression_assoc__8"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("!="),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[11]))],sort("Expression"),attrs([term(cons("NonEquals")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___33_61_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___78_111_110_69_113_117_97_108_115_assoc__left,
                new NonTerminalStackNode(809, "Expression"),
		new ListStackNode(810, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(811, "layout"), false),
		new LiteralStackNode(812, prod___char_class___range__33_33_char_class___range__61_61_lit___33_61_attrs___term__literal, new char[] {33,61}),
		new ListStackNode(813, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(814, "layout"), false),
		new NonTerminalStackNode(816, "Expression_assoc__11"));
            
                // prod([label("lhs",sort("Expression")),\iter-star(layout()),lit("o"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[9]))],sort("Expression"),attrs([term(cons("Composition")),assoc(left())]))
                expect(prod___lhs_Expression_iter_star__layout_lit_o_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___67_111_109_112_111_115_105_116_105_111_110_assoc__left,
                new NonTerminalStackNode(818, "Expression"),
		new ListStackNode(819, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(820, "layout"), false),
		new LiteralStackNode(821, prod___char_class___range__111_111_lit_o_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(822, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {111}),
		new ListStackNode(823, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(824, "layout"), false),
		new NonTerminalStackNode(826, "Expression_assoc__9"));
            
                // prod([label("lhs",prime(sort("Expression"),"assoc",[1])),\iter-star(layout()),lit("\<==\>"),\iter-star(layout()),label("rhs",prime(sort("Expression"),"assoc",[1]))],sort("Expression"),attrs([term(cons("Equivalence")),assoc(right())]))
                expect(prod___lhs_Expression_iter_star__layout_lit___60_61_61_62_iter_star__layout_rhs_Expression_Expression_attrs___term__cons___69_113_117_105_118_97_108_101_110_99_101_assoc__right,
                new NonTerminalStackNode(828, "Expression_assoc__1"),
		new ListStackNode(829, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(830, "layout"), false),
		new LiteralStackNode(831, prod___char_class___range__60_60_char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_lit___60_61_61_62_attrs___term__literal, new char[] {60,61,61,62}),
		new ListStackNode(832, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(833, "layout"), false),
		new NonTerminalStackNode(835, "Expression_assoc__1"));
            
                // prod([lit("("),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),lit(")")],sort("Expression"),attrs([term(cons("Bracket")),bracket()]))
                expect(prod___lit___40_iter_star__layout_expression_Expression_iter_star__layout_lit___41_Expression_attrs___term__cons___66_114_97_99_107_101_116_bracket,
                new LiteralStackNode(836, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(837, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(838, "layout"), false),
		new NonTerminalStackNode(840, "Expression"),
		new ListStackNode(841, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(842, "layout"), false),
		new LiteralStackNode(843, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit("@"),\iter-star(layout()),label("name",sort("Name"))],sort("Expression"),attrs([term(cons("GetAnnotation"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___64_iter_star__layout_name_Name_Expression_attrs___term__cons___71_101_116_65_110_110_111_116_97_116_105_111_110,
                new NonTerminalStackNode(845, "Expression"),
		new ListStackNode(846, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(847, "layout"), false),
		new LiteralStackNode(848, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(849, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(850, "layout"), false),
		new NonTerminalStackNode(852, "Name"));
            
                // prod([label("basicType",sort("BasicType")),\iter-star(layout()),lit("("),\iter-star(layout()),label("arguments",\iter-star-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("Expression"),attrs([term(cons("ReifiedType"))]))
                expect(prod___basicType_BasicType_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Expression_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101,
                new NonTerminalStackNode(854, "BasicType"),
		new ListStackNode(855, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(856, "layout"), false),
		new LiteralStackNode(857, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(858, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(859, "layout"), false),
		new SeparatedListStackNode(861, regular__iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(862, "Expression"), new AbstractStackNode[]{new ListStackNode(863, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(864, "layout"), false),
		new LiteralStackNode(865, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(866, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(867, "layout"), false)}, false),
		new ListStackNode(868, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(869, "layout"), false),
		new LiteralStackNode(870, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([lit("{"),\iter-star(layout()),label("statements",\iter-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Expression"),attrs([term(cons("NonEmptyBlock"))]))
                expect(prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107,
                new LiteralStackNode(871, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(872, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(873, "layout"), false),
		new SeparatedListStackNode(875, regular__iter_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(876, "Statement"), new AbstractStackNode[]{new ListStackNode(877, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(878, "layout"), false)}, true),
		new ListStackNode(879, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(880, "layout"), false),
		new LiteralStackNode(881, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("{"),\iter-star(layout()),label("elements",\iter-star-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Expression"),attrs([term(cons("Set"))]))
                expect(prod___lit___123_iter_star__layout_elements_iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___125_Expression_attrs___term__cons___83_101_116,
                new LiteralStackNode(882, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(883, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(884, "layout"), false),
		new SeparatedListStackNode(886, regular__iter_star_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(887, "Expression"), new AbstractStackNode[]{new ListStackNode(888, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(889, "layout"), false),
		new LiteralStackNode(890, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(891, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(892, "layout"), false)}, false),
		new ListStackNode(893, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(894, "layout"), false),
		new LiteralStackNode(895, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
              
        }
    
        public void ProtocolPart(){
            
                // prod([label("protocolChars",sort("ProtocolChars"))],sort("ProtocolPart"),attrs([term(cons("NonInterpolated"))]))
                expect(prod___protocolChars_ProtocolChars_ProtocolPart_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(897, "ProtocolChars"));
            
                // prod([label("pre",sort("PreProtocolChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("ProtocolTail"))],sort("ProtocolPart"),attrs([term(cons("Interpolated"))]))
                expect(prod___pre_PreProtocolChars_iter_star__layout_expression_Expression_iter_star__layout_tail_ProtocolTail_ProtocolPart_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(899, "PreProtocolChars"),
		new ListStackNode(900, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(901, "layout"), false),
		new NonTerminalStackNode(903, "Expression"),
		new ListStackNode(904, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(905, "layout"), false),
		new NonTerminalStackNode(907, "ProtocolTail"));
              
        }
    
        public void CaseInsensitiveStringConstant(){
            
                // prod([lit("\'\\"),\iter-star(sort("StringCharacter")),lit("\'\\")],sort("CaseInsensitiveStringConstant"),attrs([term(lex())]))
                expect(prod___lit___39_iter_star__StringCharacter_lit___39_CaseInsensitiveStringConstant_attrs___term__lex,
                new LiteralStackNode(908, prod___char_class___range__39_39_lit___39_attrs___term__literal, new char[] {39}),
		new ListStackNode(909, regular__iter_star__StringCharacter_no_attrs, new NonTerminalStackNode(910, "StringCharacter"), false),
		new LiteralStackNode(911, prod___char_class___range__39_39_lit___39_attrs___term__literal, new char[] {39}));
              
        }
    
        public void Backslash() {
             
                // prod([\char-class([range(92,92)])],sort("Backslash"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_Backslash_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(912, new char[][]{{47,47},{60,60},{62,62},{92,92}})},
                new CharStackNode(913, new char[][]{{92,92}}));
                     
       }
    
        public void Label(){
            
                // prod([label("name",sort("Name")),\iter-star(layout()),lit(":")],sort("Label"),attrs([term(cons("Default"))]))
                expect(prod___name_Name_iter_star__layout_lit___58_Label_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(915, "Name"),
		new ListStackNode(916, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(917, "layout"), false),
		new LiteralStackNode(918, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(919, new char[][]{{58,58}})}, new char[] {58}));
            
                // prod([],sort("Label"),attrs([term(cons("Empty"))]))
                expect(prod___Label_attrs___term__cons___69_109_112_116_121,
                new EpsilonStackNode(920));
              
        }
    
        public void MidProtocolChars(){
            
                // prod([lit("\>"),sort("URLChars"),lit("\<")],sort("MidProtocolChars"),attrs([term(lex())]))
                expect(prod___lit___62_URLChars_lit___60_MidProtocolChars_attrs___term__lex,
                new LiteralStackNode(921, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(922, new char[][]{{61,61}})}, new char[] {62}),
		new NonTerminalStackNode(923, "URLChars"),
		new LiteralStackNode(924, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(925, new char[][]{{61,61}})}, new char[] {60}));
              
        }
    
        public void Field(){
            
                // prod([label("fieldName",sort("Name"))],sort("Field"),attrs([term(cons("Name"))]))
                expect(prod___fieldName_Name_Field_attrs___term__cons___78_97_109_101,
                new NonTerminalStackNode(927, "Name"));
            
                // prod([label("fieldIndex",sort("IntegerLiteral"))],sort("Field"),attrs([term(cons("Index"))]))
                expect(prod___fieldIndex_IntegerLiteral_Field_attrs___term__cons___73_110_100_101_120,
                new NonTerminalStackNode(929, "IntegerLiteral"));
              
        }
    
        public void JustDate(){
            
                // prod([lit("$"),sort("DatePart")],sort("JustDate"),attrs([term(lex())]))
                expect(prod___lit___36_DatePart_JustDate_attrs___term__lex,
                new LiteralStackNode(930, prod___char_class___range__36_36_lit___36_attrs___term__literal, new char[] {36}),
		new NonTerminalStackNode(931, "DatePart"));
              
        }
    
        public void DatePart(){
            
                // prod([\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)]),lit("-"),\char-class([range(48,49)]),\char-class([range(48,57)]),lit("-"),\char-class([range(48,51)]),\char-class([range(48,57)])],sort("DatePart"),attrs([term(lex())]))
                expect(prod___char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___45_char_class___range__48_49_char_class___range__48_57_lit___45_char_class___range__48_51_char_class___range__48_57_DatePart_attrs___term__lex,
                new CharStackNode(932, new char[][]{{48,57}}),
		new CharStackNode(933, new char[][]{{48,57}}),
		new CharStackNode(934, new char[][]{{48,57}}),
		new CharStackNode(935, new char[][]{{48,57}}),
		new LiteralStackNode(936, prod___char_class___range__45_45_lit___45_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(937, new char[][]{{61,61}})}, new char[] {45}),
		new CharStackNode(938, new char[][]{{48,49}}),
		new CharStackNode(939, new char[][]{{48,57}}),
		new LiteralStackNode(940, prod___char_class___range__45_45_lit___45_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(941, new char[][]{{61,61}})}, new char[] {45}),
		new CharStackNode(942, new char[][]{{48,51}}),
		new CharStackNode(943, new char[][]{{48,57}}));
            
                // prod([\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48,49)]),\char-class([range(48,57)]),\char-class([range(48,51)]),\char-class([range(48,57)])],sort("DatePart"),attrs([term(lex())]))
                expect(prod___char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_DatePart_attrs___term__lex,
                new CharStackNode(944, new char[][]{{48,57}}),
		new CharStackNode(945, new char[][]{{48,57}}),
		new CharStackNode(946, new char[][]{{48,57}}),
		new CharStackNode(947, new char[][]{{48,57}}),
		new CharStackNode(948, new char[][]{{48,49}}),
		new CharStackNode(949, new char[][]{{48,57}}),
		new CharStackNode(950, new char[][]{{48,51}}),
		new CharStackNode(951, new char[][]{{48,57}}));
              
        }
    
        public void FunctionModifier(){
            
                // prod([lit("java")],sort("FunctionModifier"),attrs([term(cons("Java"))]))
                expect(prod___lit_java_FunctionModifier_attrs___term__cons___74_97_118_97,
                new LiteralStackNode(952, prod___char_class___range__106_106_char_class___range__97_97_char_class___range__118_118_char_class___range__97_97_lit_java_attrs___term__literal, new char[] {106,97,118,97}));
              
        }
    
        public void Assignment(){
            
                // prod([lit("/=")],sort("Assignment"),attrs([term(cons("Division"))]))
                expect(prod___lit___47_61_Assignment_attrs___term__cons___68_105_118_105_115_105_111_110,
                new LiteralStackNode(953, prod___char_class___range__47_47_char_class___range__61_61_lit___47_61_attrs___term__literal, new char[] {47,61}));
            
                // prod([lit("*=")],sort("Assignment"),attrs([term(cons("Product"))]))
                expect(prod___lit___42_61_Assignment_attrs___term__cons___80_114_111_100_117_99_116,
                new LiteralStackNode(954, prod___char_class___range__42_42_char_class___range__61_61_lit___42_61_attrs___term__literal, new char[] {42,61}));
            
                // prod([lit("&=")],sort("Assignment"),attrs([term(cons("Intersection"))]))
                expect(prod___lit___38_61_Assignment_attrs___term__cons___73_110_116_101_114_115_101_99_116_105_111_110,
                new LiteralStackNode(955, prod___char_class___range__38_38_char_class___range__61_61_lit___38_61_attrs___term__literal, new char[] {38,61}));
            
                // prod([lit("-=")],sort("Assignment"),attrs([term(cons("Subtraction"))]))
                expect(prod___lit___45_61_Assignment_attrs___term__cons___83_117_98_116_114_97_99_116_105_111_110,
                new LiteralStackNode(956, prod___char_class___range__45_45_char_class___range__61_61_lit___45_61_attrs___term__literal, new char[] {45,61}));
            
                // prod([lit("=")],sort("Assignment"),attrs([term(cons("Default"))]))
                expect(prod___lit___61_Assignment_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(957, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(958, new char[][]{{61,61}})}, new char[] {61}));
            
                // prod([lit("+=")],sort("Assignment"),attrs([term(cons("Addition"))]))
                expect(prod___lit___43_61_Assignment_attrs___term__cons___65_100_100_105_116_105_111_110,
                new LiteralStackNode(959, prod___char_class___range__43_43_char_class___range__61_61_lit___43_61_attrs___term__literal, new char[] {43,61}));
            
                // prod([lit("?=")],sort("Assignment"),attrs([term(cons("IfDefined"))]))
                expect(prod___lit___63_61_Assignment_attrs___term__cons___73_102_68_101_102_105_110_101_100,
                new LiteralStackNode(960, prod___char_class___range__63_63_char_class___range__61_61_lit___63_61_attrs___term__literal, new char[] {63,61}));
              
        }
    
        public void Assignable(){
            
                // prod([label("name",sort("Name")),\iter-star(layout()),lit("("),\iter-star(layout()),label("arguments",\iter-seps(sort("Assignable"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("Assignable"),attrs([term(cons("Constructor")),assoc(\non-assoc())]))
                expect(prod___name_Name_iter_star__layout_lit___40_iter_star__layout_arguments_iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Assignable_attrs___term__cons___67_111_110_115_116_114_117_99_116_111_114_assoc__non_assoc,
                new NonTerminalStackNode(962, "Name"),
		new ListStackNode(963, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(964, "layout"), false),
		new LiteralStackNode(965, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(966, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(967, "layout"), false),
		new SeparatedListStackNode(969, regular__iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(970, "Assignable"), new AbstractStackNode[]{new ListStackNode(971, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(972, "layout"), false),
		new LiteralStackNode(973, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(974, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(975, "layout"), false)}, true),
		new ListStackNode(976, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(977, "layout"), false),
		new LiteralStackNode(978, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([label("receiver",sort("Assignable")),\iter-star(layout()),lit("."),\iter-star(layout()),label("field",sort("Name"))],sort("Assignable"),attrs([term(cons("FieldAccess"))]))
                expect(prod___receiver_Assignable_iter_star__layout_lit___46_iter_star__layout_field_Name_Assignable_attrs___term__cons___70_105_101_108_100_65_99_99_101_115_115,
                new NonTerminalStackNode(980, "Assignable"),
		new ListStackNode(981, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(982, "layout"), false),
		new LiteralStackNode(983, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(984, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(985, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(986, "layout"), false),
		new NonTerminalStackNode(988, "Name"));
            
                // prod([label("receiver",sort("Assignable")),\iter-star(layout()),lit("@"),\iter-star(layout()),label("annotation",sort("Name"))],sort("Assignable"),attrs([term(cons("Annotation")),assoc(\non-assoc())]))
                expect(prod___receiver_Assignable_iter_star__layout_lit___64_iter_star__layout_annotation_Name_Assignable_attrs___term__cons___65_110_110_111_116_97_116_105_111_110_assoc__non_assoc,
                new NonTerminalStackNode(990, "Assignable"),
		new ListStackNode(991, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(992, "layout"), false),
		new LiteralStackNode(993, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(994, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(995, "layout"), false),
		new NonTerminalStackNode(997, "Name"));
            
                // prod([lit("\<"),\iter-star(layout()),label("elements",\iter-seps(sort("Assignable"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("\>")],sort("Assignable"),attrs([term(cons("Tuple"))]))
                expect(prod___lit___60_iter_star__layout_elements_iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___62_Assignable_attrs___term__cons___84_117_112_108_101,
                new LiteralStackNode(998, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(999, new char[][]{{61,61}})}, new char[] {60}),
		new ListStackNode(1000, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1001, "layout"), false),
		new SeparatedListStackNode(1003, regular__iter_seps__Assignable__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1004, "Assignable"), new AbstractStackNode[]{new ListStackNode(1005, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1006, "layout"), false),
		new LiteralStackNode(1007, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1008, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1009, "layout"), false)}, true),
		new ListStackNode(1010, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1011, "layout"), false),
		new LiteralStackNode(1012, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1013, new char[][]{{61,61}})}, new char[] {62}));
            
                // prod([label("receiver",prime(sort("Assignable"),"prio",[1])),\iter-star(layout()),lit("?"),\iter-star(layout()),label("defaultExpression",sort("Expression"))],sort("Assignable"),attrs([term(cons("IfDefinedOrDefault"))]))
                expect(prod___receiver_Assignable_iter_star__layout_lit___63_iter_star__layout_defaultExpression_Expression_Assignable_attrs___term__cons___73_102_68_101_102_105_110_101_100_79_114_68_101_102_97_117_108_116,
                new NonTerminalStackNode(1015, "Assignable_prio__1"),
		new ListStackNode(1016, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1017, "layout"), false),
		new LiteralStackNode(1018, prod___char_class___range__63_63_lit___63_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1019, new char[][]{{61,61}})}, new char[] {63}),
		new ListStackNode(1020, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1021, "layout"), false),
		new NonTerminalStackNode(1023, "Expression"));
            
                // prod([label("receiver",sort("Assignable")),\iter-star(layout()),lit("["),\iter-star(layout()),label("subscript",sort("Expression")),\iter-star(layout()),lit("]")],sort("Assignable"),attrs([term(cons("Subscript"))]))
                expect(prod___receiver_Assignable_iter_star__layout_lit___91_iter_star__layout_subscript_Expression_iter_star__layout_lit___93_Assignable_attrs___term__cons___83_117_98_115_99_114_105_112_116,
                new NonTerminalStackNode(1025, "Assignable"),
		new ListStackNode(1026, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1027, "layout"), false),
		new LiteralStackNode(1028, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(1029, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1030, "layout"), false),
		new NonTerminalStackNode(1032, "Expression"),
		new ListStackNode(1033, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1034, "layout"), false),
		new LiteralStackNode(1035, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("qualifiedName",sort("QualifiedName"))],sort("Assignable"),attrs([term(cons("Variable"))]))
                expect(prod___qualifiedName_QualifiedName_Assignable_attrs___term__cons___86_97_114_105_97_98_108_101,
                new NonTerminalStackNode(1037, "QualifiedName"));
              
        }
    
        public void StringConstant(){
            
                // prod([lit("\""),\iter-star(sort("StringCharacter")),lit("\"")],sort("StringConstant"),attrs([term(lex())]))
                expect(prod___lit___34_iter_star__StringCharacter_lit___34_StringConstant_attrs___term__lex,
                new LiteralStackNode(1038, prod___char_class___range__34_34_lit___34_attrs___term__literal, new char[] {34}),
		new ListStackNode(1039, regular__iter_star__StringCharacter_no_attrs, new NonTerminalStackNode(1040, "StringCharacter"), false),
		new LiteralStackNode(1041, prod___char_class___range__34_34_lit___34_attrs___term__literal, new char[] {34}));
              
        }
    
        public void ProtocolChars(){
            
                // prod([\char-class([range(124,124)]),sort("URLChars"),lit("://")],sort("ProtocolChars"),attrs([term(lex())]))
                expect(prod___char_class___range__124_124_URLChars_lit___58_47_47_ProtocolChars_attrs___term__lex,
                new CharStackNode(1042, new char[][]{{124,124}}),
		new NonTerminalStackNode(1043, "URLChars"),
		new LiteralStackNode(1044, prod___char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_lit___58_47_47_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1045, new char[][]{{9,10},{13,13},{32,32}})}, new char[] {58,47,47}));
              
        }
    
        public void Formal(){
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("name",sort("Name"))],sort("Formal"),attrs([term(cons("TypeName"))]))
                expect(prod___type_Type_iter_star__layout_name_Name_Formal_attrs___term__cons___84_121_112_101_78_97_109_101,
                new NonTerminalStackNode(1047, "Type"),
		new ListStackNode(1048, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1049, "layout"), false),
		new NonTerminalStackNode(1051, "Name"));
              
        }
    
        public void Parameters(){
            
                // prod([lit("("),\iter-star(layout()),label("formals",sort("Formals")),\iter-star(layout()),lit(")")],sort("Parameters"),attrs([term(cons("Default"))]))
                expect(prod___lit___40_iter_star__layout_formals_Formals_iter_star__layout_lit___41_Parameters_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(1052, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1053, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1054, "layout"), false),
		new NonTerminalStackNode(1056, "Formals"),
		new ListStackNode(1057, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1058, "layout"), false),
		new LiteralStackNode(1059, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([lit("("),\iter-star(layout()),label("formals",sort("Formals")),\iter-star(layout()),lit("..."),\iter-star(layout()),lit(")")],sort("Parameters"),attrs([term(cons("VarArgs"))]))
                expect(prod___lit___40_iter_star__layout_formals_Formals_iter_star__layout_lit___46_46_46_iter_star__layout_lit___41_Parameters_attrs___term__cons___86_97_114_65_114_103_115,
                new LiteralStackNode(1060, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1061, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1062, "layout"), false),
		new NonTerminalStackNode(1064, "Formals"),
		new ListStackNode(1065, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1066, "layout"), false),
		new LiteralStackNode(1067, prod___char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_lit___46_46_46_attrs___term__literal, new char[] {46,46,46}),
		new ListStackNode(1068, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1069, "layout"), false),
		new LiteralStackNode(1070, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
              
        }
    
        public void LocalVariableDeclaration(){
            
                // prod([label("declarator",sort("Declarator"))],sort("LocalVariableDeclaration"),attrs([term(cons("Default"))]))
                expect(prod___declarator_Declarator_LocalVariableDeclaration_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(1072, "Declarator"));
            
                // prod([lit("dynamic"),\iter-star(layout()),label("declarator",sort("Declarator"))],sort("LocalVariableDeclaration"),attrs([term(cons("Dynamic"))]))
                expect(prod___lit_dynamic_iter_star__layout_declarator_Declarator_LocalVariableDeclaration_attrs___term__cons___68_121_110_97_109_105_99,
                new LiteralStackNode(1073, prod___char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_lit_dynamic_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1074, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,121,110,97,109,105,99}),
		new ListStackNode(1075, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1076, "layout"), false),
		new NonTerminalStackNode(1078, "Declarator"));
              
        }
    
        public void DataTypeSelector(){
            
                // prod([label("sort",sort("QualifiedName")),\iter-star(layout()),lit("."),\iter-star(layout()),label("production",sort("Name"))],sort("DataTypeSelector"),attrs([term(cons("Selector"))]))
                expect(prod___sort_QualifiedName_iter_star__layout_lit___46_iter_star__layout_production_Name_DataTypeSelector_attrs___term__cons___83_101_108_101_99_116_111_114,
                new NonTerminalStackNode(1080, "QualifiedName"),
		new ListStackNode(1081, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1082, "layout"), false),
		new LiteralStackNode(1083, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1084, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(1085, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1086, "layout"), false),
		new NonTerminalStackNode(1088, "Name"));
              
        }
    
        public void StringTail(){
            
                // prod([label("mid",sort("MidStringChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("StringTail"))],sort("StringTail"),attrs([term(cons("MidInterpolated"))]))
                expect(prod___mid_MidStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringTail_StringTail_attrs___term__cons___77_105_100_73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(1090, "MidStringChars"),
		new ListStackNode(1091, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1092, "layout"), false),
		new NonTerminalStackNode(1094, "Expression"),
		new ListStackNode(1095, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1096, "layout"), false),
		new NonTerminalStackNode(1098, "StringTail"));
            
                // prod([label("post",sort("PostStringChars"))],sort("StringTail"),attrs([term(cons("Post"))]))
                expect(prod___post_PostStringChars_StringTail_attrs___term__cons___80_111_115_116,
                new NonTerminalStackNode(1100, "PostStringChars"));
            
                // prod([label("mid",sort("MidStringChars")),\iter-star(layout()),label("template",sort("StringTemplate")),\iter-star(layout()),label("tail",sort("StringTail"))],sort("StringTail"),attrs([term(cons("MidTemplate"))]))
                expect(prod___mid_MidStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringTail_StringTail_attrs___term__cons___77_105_100_84_101_109_112_108_97_116_101,
                new NonTerminalStackNode(1102, "MidStringChars"),
		new ListStackNode(1103, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1104, "layout"), false),
		new NonTerminalStackNode(1106, "StringTemplate"),
		new ListStackNode(1107, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1108, "layout"), false),
		new NonTerminalStackNode(1110, "StringTail"));
              
        }
    
        public void TagString(){
            
                // prod([lit("{"),\iter-star(sort("TagChar")),lit("}")],sort("TagString"),attrs([term(lex())]))
                expect(prod___lit___123_iter_star__TagChar_lit___125_TagString_attrs___term__lex,
                new LiteralStackNode(1111, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1112, regular__iter_star__TagChar_no_attrs, new NonTerminalStackNode(1113, "TagChar"), false),
		new LiteralStackNode(1114, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
              
        }
    
        public void PathTail(){
            
                // prod([label("post",sort("PostPathChars"))],sort("PathTail"),attrs([term(cons("Post"))]))
                expect(prod___post_PostPathChars_PathTail_attrs___term__cons___80_111_115_116,
                new NonTerminalStackNode(1116, "PostPathChars"));
            
                // prod([label("mid",sort("MidPathChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("PathTail"))],sort("PathTail"),attrs([term(cons("Mid"))]))
                expect(prod___mid_MidPathChars_iter_star__layout_expression_Expression_iter_star__layout_tail_PathTail_PathTail_attrs___term__cons___77_105_100,
                new NonTerminalStackNode(1118, "MidPathChars"),
		new ListStackNode(1119, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1120, "layout"), false),
		new NonTerminalStackNode(1122, "Expression"),
		new ListStackNode(1123, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1124, "layout"), false),
		new NonTerminalStackNode(1126, "PathTail"));
              
        }
    
        public void Tags(){
            
                // prod([label("tags",\iter-star-seps(sort("Tag"),[\iter-star(layout())]))],sort("Tags"),attrs([term(cons("Default"))]))
                expect(prod___tags_iter_star_seps__Tag__iter_star__layout_Tags_attrs___term__cons___68_101_102_97_117_108_116,
                new SeparatedListStackNode(1128, regular__iter_star_seps__Tag__iter_star__layout_no_attrs, new NonTerminalStackNode(1129, "Tag"), new AbstractStackNode[]{new ListStackNode(1130, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1131, "layout"), false)}, false));
              
        }
    
        public void Formals(){
            
                // prod([label("formals",\iter-star-seps(sort("Formal"),[\iter-star(layout()),lit(","),\iter-star(layout())]))],sort("Formals"),attrs([term(cons("Default"))]))
                expect(prod___formals_iter_star_seps__Formal__iter_star__layout_lit___44_iter_star__layout_Formals_attrs___term__cons___68_101_102_97_117_108_116,
                new SeparatedListStackNode(1133, regular__iter_star_seps__Formal__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1134, "Formal"), new AbstractStackNode[]{new ListStackNode(1135, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1136, "layout"), false),
		new LiteralStackNode(1137, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1138, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1139, "layout"), false)}, false));
              
        }
    
        public void StructuredType(){
            
                // prod([label("basicType",sort("BasicType")),\iter-star(layout()),lit("["),\iter-star(layout()),label("arguments",\iter-seps(sort("TypeArg"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("StructuredType"),attrs([term(cons("Default"))]))
                expect(prod___basicType_BasicType_iter_star__layout_lit___91_iter_star__layout_arguments_iter_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_StructuredType_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(1141, "BasicType"),
		new ListStackNode(1142, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1143, "layout"), false),
		new LiteralStackNode(1144, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(1145, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1146, "layout"), false),
		new SeparatedListStackNode(1148, regular__iter_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1149, "TypeArg"), new AbstractStackNode[]{new ListStackNode(1150, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1151, "layout"), false),
		new LiteralStackNode(1152, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1153, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1154, "layout"), false)}, true),
		new ListStackNode(1155, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1156, "layout"), false),
		new LiteralStackNode(1157, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
              
        }
    
        public void Declarator(){
            
                // prod([label("symbol",sort("Symbol")),\iter-star(layout()),lit("*")],sort("Declarator"),attrs([term(cons("IterStar"))]))
                expect(prod___symbol_Symbol_iter_star__layout_lit___42_Declarator_attrs___term__cons___73_116_101_114_83_116_97_114,
                new NonTerminalStackNode(1159, "Symbol"),
		new ListStackNode(1160, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1161, "layout"), false),
		new LiteralStackNode(1162, prod___char_class___range__42_42_lit___42_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1163, new char[][]{{61,61}})}, new char[] {42}));
            
                // prod([label("symbol",sort("Symbol")),\iter-star(layout()),lit("+")],sort("Declarator"),attrs([term(cons("Iter"))]))
                expect(prod___symbol_Symbol_iter_star__layout_lit___43_Declarator_attrs___term__cons___73_116_101_114,
                new NonTerminalStackNode(1165, "Symbol"),
		new ListStackNode(1166, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1167, "layout"), false),
		new LiteralStackNode(1168, prod___char_class___range__43_43_lit___43_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1169, new char[][]{{61,61}})}, new char[] {43}));
            
                // prod([label("type",sort("Type")),\iter-star(layout()),label("variables",\iter-seps(sort("Variable"),[\iter-star(layout()),lit(","),\iter-star(layout())]))],sort("Declarator"),attrs([term(cons("Default"))]))
                expect(prod___type_Type_iter_star__layout_variables_iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_Declarator_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(1171, "Type"),
		new ListStackNode(1172, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1173, "layout"), false),
		new SeparatedListStackNode(1175, regular__iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1176, "Variable"), new AbstractStackNode[]{new ListStackNode(1177, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1178, "layout"), false),
		new LiteralStackNode(1179, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1180, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1181, "layout"), false)}, true));
            
                // prod([label("symbol",sort("Symbol")),\iter-star(layout()),lit("?")],sort("Declarator"),attrs([term(cons("Optional"))]))
                expect(prod___symbol_Symbol_iter_star__layout_lit___63_Declarator_attrs___term__cons___79_112_116_105_111_110_97_108,
                new NonTerminalStackNode(1183, "Symbol"),
		new ListStackNode(1184, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1185, "layout"), false),
		new LiteralStackNode(1186, prod___char_class___range__63_63_lit___63_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1187, new char[][]{{61,61}})}, new char[] {63}));
              
        }
    
        public void RascalReservedKeywords() {
             
                // prod([lit("true")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_true_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1189, prod___char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_lit_true_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1190, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,114,117,101}));
            
                // prod([lit("bag")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_bag_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1191, prod___char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_lit_bag_attrs___term__literal, new char[] {98,97,103}));
            
                // prod([lit("num")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_num_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1192, prod___char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_lit_num_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1193, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,117,109}));
            
                // prod([lit("node")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_node_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1194, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_lit_node_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1195, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,100,101}));
            
                // prod([lit("private")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_private_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1196, prod___char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_lit_private_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1197, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {112,114,105,118,97,116,101}));
            
                // prod([lit("finally")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_finally_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1198, prod___char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_lit_finally_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1199, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,105,110,97,108,108,121}));
            
                // prod([lit("real")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_real_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1200, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_lit_real_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1201, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,97,108}));
            
                // prod([lit("fail")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_fail_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1202, prod___char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_lit_fail_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1203, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,97,105,108}));
            
                // prod([lit("list")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_list_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1204, prod___char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_lit_list_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1205, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {108,105,115,116}));
            
                // prod([lit("lex")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_lex_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1206, prod___char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_lit_lex_attrs___term__literal, new char[] {108,101,120}));
            
                // prod([lit("if")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_if_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1207, prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1208, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,102}));
            
                // prod([lit("extend")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_extend_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1209, prod___char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_extend_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1210, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {101,120,116,101,110,100}));
            
                // prod([lit("append")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_append_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1211, prod___char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_append_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1212, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,112,112,101,110,100}));
            
                // prod([lit("tag")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_tag_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1213, prod___char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_lit_tag_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1214, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,97,103}));
            
                // prod([lit("repeat")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_repeat_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1215, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_lit_repeat_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1216, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,112,101,97,116}));
            
                // prod([lit("rel")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_rel_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1217, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_lit_rel_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1218, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,108}));
            
                // prod([lit("void")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_void_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1219, prod___char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_lit_void_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1220, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,111,105,100}));
            
                // prod([lit("assoc")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_assoc_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1221, prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_lit_assoc_attrs___term__literal, new char[] {97,115,115,111,99}));
            
                // prod([lit("non-assoc")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit___110_111_110_45_97_115_115_111_99_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1222, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_lit___110_111_110_45_97_115_115_111_99_attrs___term__literal, new char[] {110,111,110,45,97,115,115,111,99}));
            
                // prod([lit("test")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_test_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1223, prod___char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_lit_test_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1224, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,101,115,116}));
            
                // prod([lit("anno")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_anno_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1225, prod___char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_lit_anno_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1226, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,110,110,111}));
            
                // prod([lit("data")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_data_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1227, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_lit_data_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1228, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,97}));
            
                // prod([lit("join")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_join_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1229, prod___char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_lit_join_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1230, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {106,111,105,110}));
            
                // prod([lit("layout")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_layout_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1231, prod___char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_lit_layout_attrs___term__literal, new char[] {108,97,121,111,117,116}));
            
                // prod([lit("LAYOUT")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_LAYOUT_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1232, prod___char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_lit_LAYOUT_attrs___term__literal, new char[] {76,65,89,79,85,84}));
            
                // prod([lit("it")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_it_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1233, prod___char_class___range__105_105_char_class___range__116_116_lit_it_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1234, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,116}));
            
                // prod([lit("bracket")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_bracket_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1235, prod___char_class___range__98_98_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__101_101_char_class___range__116_116_lit_bracket_attrs___term__literal, new char[] {98,114,97,99,107,101,116}));
            
                // prod([lit("view")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_view_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1236, prod___char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_lit_view_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1237, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,105,101,119}));
            
                // prod([lit("in")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_in_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1238, prod___char_class___range__105_105_char_class___range__110_110_lit_in_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1239, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110}));
            
                // prod([lit("import")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_import_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1240, prod___char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_lit_import_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1241, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,109,112,111,114,116}));
            
                // prod([lit("global")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_global_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1242, prod___char_class___range__103_103_char_class___range__108_108_char_class___range__111_111_char_class___range__98_98_char_class___range__97_97_char_class___range__108_108_lit_global_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1243, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {103,108,111,98,97,108}));
            
                // prod([lit("false")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_false_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1244, prod___char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_false_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1245, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,97,108,115,101}));
            
                // prod([lit("all")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_all_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1246, prod___char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_lit_all_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1247, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,108,108}));
            
                // prod([lit("solve")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_solve_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1248, prod___char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_lit_solve_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1249, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,111,108,118,101}));
            
                // prod([lit("dynamic")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_dynamic_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1250, prod___char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_lit_dynamic_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1251, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,121,110,97,109,105,99}));
            
                // prod([lit("type")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_type_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1252, prod___char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_lit_type_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1253, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,121,112,101}));
            
                // prod([lit("catch")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_catch_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1254, prod___char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_catch_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1255, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,97,116,99,104}));
            
                // prod([lit("try")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_try_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1256, prod___char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_lit_try_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1257, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,114,121}));
            
                // prod([lit("reified")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_reified_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1258, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__105_105_char_class___range__102_102_char_class___range__105_105_char_class___range__101_101_char_class___range__100_100_lit_reified_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1259, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,105,102,105,101,100}));
            
                // prod([lit("notin")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_notin_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1260, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_lit_notin_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1261, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,116,105,110}));
            
                // prod([lit("insert")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_insert_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1262, prod___char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_insert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1263, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110,115,101,114,116}));
            
                // prod([lit("else")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_else_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1264, prod___char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_else_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1265, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {101,108,115,101}));
            
                // prod([lit("switch")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_switch_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1266, prod___char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_switch_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1267, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,119,105,116,99,104}));
            
                // prod([lit("case")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_case_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1268, prod___char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_lit_case_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1269, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,97,115,101}));
            
                // prod([lit("return")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_return_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1270, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_lit_return_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1271, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,116,117,114,110}));
            
                // prod([lit("str")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_str_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1272, prod___char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_lit_str_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1273, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,116,114}));
            
                // prod([lit("adt")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_adt_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1274, prod___char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_lit_adt_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1275, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,100,116}));
            
                // prod([lit("while")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_while_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1276, prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1277, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {119,104,105,108,101}));
            
                // prod([lit("throws")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_throws_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1278, prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_lit_throws_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1279, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,104,114,111,119,115}));
            
                // prod([lit("visit")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_visit_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1280, prod___char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_lit_visit_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1281, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,105,115,105,116}));
            
                // prod([lit("tuple")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_tuple_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1282, prod___char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_lit_tuple_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1283, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,117,112,108,101}));
            
                // prod([lit("for")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_for_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1284, prod___char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_lit_for_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1285, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,111,114}));
            
                // prod([lit("assert")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_assert_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1286, prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_assert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1287, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,115,115,101,114,116}));
            
                // prod([lit("loc")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_loc_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1288, prod___char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_lit_loc_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1289, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {108,111,99}));
            
                // prod([lit("default")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_default_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1290, prod___char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_lit_default_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1291, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,101,102,97,117,108,116}));
            
                // prod([lit("on")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_on_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1292, prod___char_class___range__111_111_char_class___range__110_110_lit_on_attrs___term__literal, new char[] {111,110}));
            
                // prod([lit("map")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_map_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1293, prod___char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_lit_map_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1294, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,97,112}));
            
                // prod([lit("alias")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_alias_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1295, prod___char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_lit_alias_attrs___term__literal, new char[] {97,108,105,97,115}));
            
                // prod([lit("lang")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_lang_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1296, prod___char_class___range__108_108_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_lit_lang_attrs___term__literal, new char[] {108,97,110,103}));
            
                // prod([lit("int")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_int_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1297, prod___char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_lit_int_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1298, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110,116}));
            
                // prod([lit("module")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_module_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1299, prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_module_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1300, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,111,100,117,108,101}));
            
                // prod([lit("any")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_any_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1301, prod___char_class___range__97_97_char_class___range__110_110_char_class___range__121_121_lit_any_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1302, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,110,121}));
            
                // prod([lit("bool")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_bool_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1303, prod___char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_lit_bool_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1304, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {98,111,111,108}));
            
                // prod([lit("public")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_public_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1305, prod___char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_lit_public_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1306, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {112,117,98,108,105,99}));
            
                // prod([lit("throw")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_throw_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1307, prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_lit_throw_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1308, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,104,114,111,119}));
            
                // prod([lit("one")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_one_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1309, prod___char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_lit_one_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1310, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {111,110,101}));
            
                // prod([lit("set")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_set_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1311, prod___char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_lit_set_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1312, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,101,116}));
            
                // prod([lit("cf")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_cf_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1313, prod___char_class___range__99_99_char_class___range__102_102_lit_cf_attrs___term__literal, new char[] {99,102}));
            
                // prod([lit("fun")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_fun_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1314, prod___char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_lit_fun_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1315, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,117,110}));
            
                // prod([lit("rule")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_rule_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1316, prod___char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_rule_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1317, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,117,108,101}));
            
                // prod([lit("non-terminal")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit___110_111_110_45_116_101_114_109_105_110_97_108_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1318, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_lit___110_111_110_45_116_101_114_109_105_110_97_108_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1319, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,110,45,116,101,114,109,105,110,97,108}));
            
                // prod([lit("constructor")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_constructor_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1320, prod___char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_lit_constructor_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1321, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,111,110,115,116,114,117,99,116,111,114}));
            
                // prod([lit("datetime")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_datetime_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1322, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_lit_datetime_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1323, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,101,116,105,109,101}));
            
                // prod([lit("value")],sort("RascalReservedKeywords"),\no-attrs())
                expect(prod___lit_value_RascalReservedKeywords_no_attrs, new IReducableStackNode[] {new CharStackNode(1188, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1324, prod___char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_lit_value_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1325, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,97,108,117,101}));
                     
       }
    
        public void Variant(){
            
                // prod([label("name",sort("Name")),\iter-star(layout()),lit("("),\iter-star(layout()),label("arguments",\iter-star-seps(sort("TypeArg"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("Variant"),attrs([term(cons("NAryConstructor"))]))
                expect(prod___name_Name_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_Variant_attrs___term__cons___78_65_114_121_67_111_110_115_116_114_117_99_116_111_114,
                new NonTerminalStackNode(1327, "Name"),
		new ListStackNode(1328, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1329, "layout"), false),
		new LiteralStackNode(1330, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1331, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1332, "layout"), false),
		new SeparatedListStackNode(1334, regular__iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1335, "TypeArg"), new AbstractStackNode[]{new ListStackNode(1336, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1337, "layout"), false),
		new LiteralStackNode(1338, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1339, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1340, "layout"), false)}, false),
		new ListStackNode(1341, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1342, "layout"), false),
		new LiteralStackNode(1343, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
              
        }
    
        public void PreProtocolChars(){
            
                // prod([lit("|"),sort("URLChars"),lit("\<")],sort("PreProtocolChars"),attrs([term(lex())]))
                expect(prod___lit___124_URLChars_lit___60_PreProtocolChars_attrs___term__lex,
                new LiteralStackNode(1344, prod___char_class___range__124_124_lit___124_attrs___term__literal, new char[] {124}),
		new NonTerminalStackNode(1345, "URLChars"),
		new LiteralStackNode(1346, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1347, new char[][]{{61,61}})}, new char[] {60}));
              
        }
    
        public void FunctionDeclaration(){
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),label("signature",sort("Signature")),\iter-star(layout()),label("body",sort("FunctionBody"))],sort("FunctionDeclaration"),attrs([term(cons("Default"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_signature_Signature_iter_star__layout_body_FunctionBody_FunctionDeclaration_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(1349, "Tags"),
		new ListStackNode(1350, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1351, "layout"), false),
		new NonTerminalStackNode(1353, "Visibility"),
		new ListStackNode(1354, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1355, "layout"), false),
		new NonTerminalStackNode(1357, "Signature"),
		new ListStackNode(1358, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1359, "layout"), false),
		new NonTerminalStackNode(1361, "FunctionBody"));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),label("signature",sort("Signature")),\iter-star(layout()),lit(";")],sort("FunctionDeclaration"),attrs([term(cons("Abstract"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_signature_Signature_iter_star__layout_lit___59_FunctionDeclaration_attrs___term__cons___65_98_115_116_114_97_99_116,
                new NonTerminalStackNode(1363, "Tags"),
		new ListStackNode(1364, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1365, "layout"), false),
		new NonTerminalStackNode(1367, "Visibility"),
		new ListStackNode(1368, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1369, "layout"), false),
		new NonTerminalStackNode(1371, "Signature"),
		new ListStackNode(1372, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1373, "layout"), false),
		new LiteralStackNode(1374, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
              
        }
    
        public void OctalLongLiteral() {
             
                // prod([\char-class([range(48,48)]),iter(\char-class([range(48,55)])),\char-class([range(76,76),range(108,108)])],sort("OctalLongLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__48_48_iter__char_class___range__48_55_char_class___range__76_76_range__108_108_OctalLongLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1375, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(1376, new char[][]{{48,48}}),
		new ListStackNode(1377, regular__iter__char_class___range__48_55_no_attrs, new CharStackNode(1378, new char[][]{{48,55}}), true),
		new CharStackNode(1379, new char[][]{{76,76},{108,108}}));
                     
       }
    
        public void BasicType(){
            
                // prod([lit("loc")],sort("BasicType"),attrs([term(cons("Loc"))]))
                expect(prod___lit_loc_BasicType_attrs___term__cons___76_111_99,
                new LiteralStackNode(1380, prod___char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_lit_loc_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1381, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {108,111,99}));
            
                // prod([lit("node")],sort("BasicType"),attrs([term(cons("Node"))]))
                expect(prod___lit_node_BasicType_attrs___term__cons___78_111_100_101,
                new LiteralStackNode(1382, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_lit_node_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1383, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,100,101}));
            
                // prod([lit("num")],sort("BasicType"),attrs([term(cons("Num"))]))
                expect(prod___lit_num_BasicType_attrs___term__cons___78_117_109,
                new LiteralStackNode(1384, prod___char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_lit_num_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1385, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,117,109}));
            
                // prod([lit("type")],sort("BasicType"),attrs([term(cons("ReifiedType"))]))
                expect(prod___lit_type_BasicType_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101,
                new LiteralStackNode(1386, prod___char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_lit_type_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1387, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,121,112,101}));
            
                // prod([lit("int")],sort("BasicType"),attrs([term(cons("Int"))]))
                expect(prod___lit_int_BasicType_attrs___term__cons___73_110_116,
                new LiteralStackNode(1388, prod___char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_lit_int_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1389, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110,116}));
            
                // prod([lit("bag")],sort("BasicType"),attrs([term(cons("Bag"))]))
                expect(prod___lit_bag_BasicType_attrs___term__cons___66_97_103,
                new LiteralStackNode(1390, prod___char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_lit_bag_attrs___term__literal, new char[] {98,97,103}));
            
                // prod([lit("rel")],sort("BasicType"),attrs([term(cons("Relation"))]))
                expect(prod___lit_rel_BasicType_attrs___term__cons___82_101_108_97_116_105_111_110,
                new LiteralStackNode(1391, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_lit_rel_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1392, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,108}));
            
                // prod([lit("fun")],sort("BasicType"),attrs([term(cons("ReifiedFunction"))]))
                expect(prod___lit_fun_BasicType_attrs___term__cons___82_101_105_102_105_101_100_70_117_110_99_116_105_111_110,
                new LiteralStackNode(1393, prod___char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_lit_fun_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1394, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,117,110}));
            
                // prod([lit("parameter")],sort("BasicType"),attrs([term(cons("ReifiedTypeParameter"))]))
                expect(prod___lit_parameter_BasicType_attrs___term__cons___82_101_105_102_105_101_100_84_121_112_101_80_97_114_97_109_101_116_101_114,
                new LiteralStackNode(1395, prod___char_class___range__112_112_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_lit_parameter_attrs___term__literal, new char[] {112,97,114,97,109,101,116,101,114}));
            
                // prod([lit("real")],sort("BasicType"),attrs([term(cons("Real"))]))
                expect(prod___lit_real_BasicType_attrs___term__cons___82_101_97_108,
                new LiteralStackNode(1396, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_lit_real_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1397, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,97,108}));
            
                // prod([lit("tuple")],sort("BasicType"),attrs([term(cons("Tuple"))]))
                expect(prod___lit_tuple_BasicType_attrs___term__cons___84_117_112_108_101,
                new LiteralStackNode(1398, prod___char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_lit_tuple_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1399, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,117,112,108,101}));
            
                // prod([lit("str")],sort("BasicType"),attrs([term(cons("String"))]))
                expect(prod___lit_str_BasicType_attrs___term__cons___83_116_114_105_110_103,
                new LiteralStackNode(1400, prod___char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_lit_str_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1401, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,116,114}));
            
                // prod([lit("bool")],sort("BasicType"),attrs([term(cons("Bool"))]))
                expect(prod___lit_bool_BasicType_attrs___term__cons___66_111_111_108,
                new LiteralStackNode(1402, prod___char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_lit_bool_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1403, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {98,111,111,108}));
            
                // prod([lit("reified")],sort("BasicType"),attrs([term(cons("ReifiedReifiedType"))]))
                expect(prod___lit_reified_BasicType_attrs___term__cons___82_101_105_102_105_101_100_82_101_105_102_105_101_100_84_121_112_101,
                new LiteralStackNode(1404, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__105_105_char_class___range__102_102_char_class___range__105_105_char_class___range__101_101_char_class___range__100_100_lit_reified_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1405, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,105,102,105,101,100}));
            
                // prod([lit("void")],sort("BasicType"),attrs([term(cons("Void"))]))
                expect(prod___lit_void_BasicType_attrs___term__cons___86_111_105_100,
                new LiteralStackNode(1406, prod___char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_lit_void_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1407, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,111,105,100}));
            
                // prod([lit("non-terminal")],sort("BasicType"),attrs([term(cons("ReifiedNonTerminal"))]))
                expect(prod___lit___110_111_110_45_116_101_114_109_105_110_97_108_BasicType_attrs___term__cons___82_101_105_102_105_101_100_78_111_110_84_101_114_109_105_110_97_108,
                new LiteralStackNode(1408, prod___char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_lit___110_111_110_45_116_101_114_109_105_110_97_108_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1409, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {110,111,110,45,116,101,114,109,105,110,97,108}));
            
                // prod([lit("value")],sort("BasicType"),attrs([term(cons("Value"))]))
                expect(prod___lit_value_BasicType_attrs___term__cons___86_97_108_117_101,
                new LiteralStackNode(1410, prod___char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_lit_value_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1411, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,97,108,117,101}));
            
                // prod([lit("datetime")],sort("BasicType"),attrs([term(cons("DateTime"))]))
                expect(prod___lit_datetime_BasicType_attrs___term__cons___68_97_116_101_84_105_109_101,
                new LiteralStackNode(1412, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_lit_datetime_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1413, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,101,116,105,109,101}));
            
                // prod([lit("set")],sort("BasicType"),attrs([term(cons("Set"))]))
                expect(prod___lit_set_BasicType_attrs___term__cons___83_101_116,
                new LiteralStackNode(1414, prod___char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_lit_set_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1415, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,101,116}));
            
                // prod([lit("map")],sort("BasicType"),attrs([term(cons("Map"))]))
                expect(prod___lit_map_BasicType_attrs___term__cons___77_97_112,
                new LiteralStackNode(1416, prod___char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_lit_map_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1417, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,97,112}));
            
                // prod([lit("list")],sort("BasicType"),attrs([term(cons("List"))]))
                expect(prod___lit_list_BasicType_attrs___term__cons___76_105_115_116,
                new LiteralStackNode(1418, prod___char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_lit_list_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1419, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {108,105,115,116}));
            
                // prod([lit("constructor")],sort("BasicType"),attrs([term(cons("ReifiedConstructor"))]))
                expect(prod___lit_constructor_BasicType_attrs___term__cons___82_101_105_102_105_101_100_67_111_110_115_116_114_117_99_116_111_114,
                new LiteralStackNode(1420, prod___char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_lit_constructor_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1421, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {99,111,110,115,116,114,117,99,116,111,114}));
            
                // prod([lit("adt")],sort("BasicType"),attrs([term(cons("ReifiedAdt"))]))
                expect(prod___lit_adt_BasicType_attrs___term__cons___82_101_105_102_105_101_100_65_100_116,
                new LiteralStackNode(1422, prod___char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_lit_adt_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1423, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,100,116}));
            
                // prod([lit("lex")],sort("BasicType"),attrs([term(cons("Lex"))]))
                expect(prod___lit_lex_BasicType_attrs___term__cons___76_101_120,
                new LiteralStackNode(1424, prod___char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_lit_lex_attrs___term__literal, new char[] {108,101,120}));
              
        }
    
        public void DateTimeLiteral(){
            
                // prod([label("date",sort("JustDate"))],sort("DateTimeLiteral"),attrs([term(cons("DateLiteral"))]))
                expect(prod___date_JustDate_DateTimeLiteral_attrs___term__cons___68_97_116_101_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1426, "JustDate"));
            
                // prod([label("time",sort("JustTime"))],sort("DateTimeLiteral"),attrs([term(cons("TimeLiteral"))]))
                expect(prod___time_JustTime_DateTimeLiteral_attrs___term__cons___84_105_109_101_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1428, "JustTime"));
            
                // prod([label("dateAndTime",sort("DateAndTime"))],sort("DateTimeLiteral"),attrs([term(cons("DateAndTimeLiteral"))]))
                expect(prod___dateAndTime_DateAndTime_DateTimeLiteral_attrs___term__cons___68_97_116_101_65_110_100_84_105_109_101_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1430, "DateAndTime"));
              
        }
    
        public void LongLiteral(){
            
                // prod([label("octalLong",sort("OctalLongLiteral"))],sort("LongLiteral"),attrs([term(cons("OctalLongLiteral"))]))
                expect(prod___octalLong_OctalLongLiteral_LongLiteral_attrs___term__cons___79_99_116_97_108_76_111_110_103_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1432, "OctalLongLiteral"));
            
                // prod([label("hexLong",sort("HexLongLiteral"))],sort("LongLiteral"),attrs([term(cons("HexLongLiteral"))]))
                expect(prod___hexLong_HexLongLiteral_LongLiteral_attrs___term__cons___72_101_120_76_111_110_103_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1434, "HexLongLiteral"));
            
                // prod([label("decimalLong",sort("DecimalLongLiteral"))],sort("LongLiteral"),attrs([term(cons("DecimalLongLiteral"))]))
                expect(prod___decimalLong_DecimalLongLiteral_LongLiteral_attrs___term__cons___68_101_99_105_109_97_108_76_111_110_103_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1436, "DecimalLongLiteral"));
              
        }
    
        public void ModuleActuals(){
            
                // prod([lit("["),\iter-star(layout()),label("types",\iter-seps(sort("Type"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("ModuleActuals"),attrs([term(cons("Default"))]))
                expect(prod___lit___91_iter_star__layout_types_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_ModuleActuals_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(1437, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(1438, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1439, "layout"), false),
		new SeparatedListStackNode(1441, regular__iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1442, "Type"), new AbstractStackNode[]{new ListStackNode(1443, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1444, "layout"), false),
		new LiteralStackNode(1445, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1446, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1447, "layout"), false)}, true),
		new ListStackNode(1448, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1449, "layout"), false),
		new LiteralStackNode(1450, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
              
        }
    
        public void BooleanLiteral(){
            
                // prod([lit("false")],sort("BooleanLiteral"),attrs([term(lex())]))
                expect(prod___lit_false_BooleanLiteral_attrs___term__lex,
                new LiteralStackNode(1451, prod___char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_false_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1452, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,97,108,115,101}));
            
                // prod([lit("true")],sort("BooleanLiteral"),attrs([term(lex())]))
                expect(prod___lit_true_BooleanLiteral_attrs___term__lex,
                new LiteralStackNode(1453, prod___char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_lit_true_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1454, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,114,117,101}));
              
        }
    
        public void Alternative(){
            
                // prod([label("name",sort("Name")),\iter-star(layout()),label("type",sort("Type"))],sort("Alternative"),attrs([term(cons("NamedType"))]))
                expect(prod___name_Name_iter_star__layout_type_Type_Alternative_attrs___term__cons___78_97_109_101_100_84_121_112_101,
                new NonTerminalStackNode(1456, "Name"),
		new ListStackNode(1457, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1458, "layout"), false),
		new NonTerminalStackNode(1460, "Type"));
              
        }
    
        public void DateAndTime(){
            
                // prod([lit("$"),sort("DatePart"),lit("T"),sort("TimePartNoTZ"),opt(sort("TimeZonePart"))],sort("DateAndTime"),attrs([term(lex())]))
                expect(prod___lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_DateAndTime_attrs___term__lex,
                new LiteralStackNode(1461, prod___char_class___range__36_36_lit___36_attrs___term__literal, new char[] {36}),
		new NonTerminalStackNode(1462, "DatePart"),
		new LiteralStackNode(1463, prod___char_class___range__84_84_lit_T_attrs___term__literal, new char[] {84}),
		new NonTerminalStackNode(1464, "TimePartNoTZ"),
		new OptionalStackNode(1465, regular__opt__TimeZonePart_no_attrs, new NonTerminalStackNode(1466, "TimeZonePart")));
              
        }
    
        public void ModuleParameters(){
            
                // prod([lit("["),\iter-star(layout()),label("parameters",\iter-seps(sort("TypeVar"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("ModuleParameters"),attrs([term(cons("Default"))]))
                expect(prod___lit___91_iter_star__layout_parameters_iter_seps__TypeVar__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_ModuleParameters_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(1467, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(1468, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1469, "layout"), false),
		new SeparatedListStackNode(1471, regular__iter_seps__TypeVar__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1472, "TypeVar"), new AbstractStackNode[]{new ListStackNode(1473, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1474, "layout"), false),
		new LiteralStackNode(1475, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1476, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1477, "layout"), false)}, true),
		new ListStackNode(1478, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1479, "layout"), false),
		new LiteralStackNode(1480, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
              
        }
    
        public void UnicodeEscape(){
            
                // prod([lit("\\"),iter(\char-class([range(117,117)])),\char-class([range(48,57),range(65,70),range(97,102)]),\char-class([range(48,57),range(65,70),range(97,102)]),\char-class([range(48,57),range(65,70),range(97,102)]),\char-class([range(48,57),range(65,70),range(97,102)])],sort("UnicodeEscape"),attrs([term(lex())]))
                expect(prod___lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_UnicodeEscape_attrs___term__lex,
                new LiteralStackNode(1481, prod___char_class___range__92_92_lit___92_attrs___term__literal, new char[] {92}),
		new ListStackNode(1482, regular__iter__char_class___range__117_117_no_attrs, new CharStackNode(1483, new char[][]{{117,117}}), true),
		new CharStackNode(1484, new char[][]{{48,57},{65,70},{97,102}}),
		new CharStackNode(1485, new char[][]{{48,57},{65,70},{97,102}}),
		new CharStackNode(1486, new char[][]{{48,57},{65,70},{97,102}}),
		new CharStackNode(1487, new char[][]{{48,57},{65,70},{97,102}}));
              
        }
    
        public void OctalIntegerLiteral() {
             
                // prod([\char-class([range(48,48)]),iter(\char-class([range(48,55)]))],sort("OctalIntegerLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__48_48_iter__char_class___range__48_55_OctalIntegerLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1488, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(1489, new char[][]{{48,48}}),
		new ListStackNode(1490, regular__iter__char_class___range__48_55_no_attrs, new CharStackNode(1491, new char[][]{{48,55}}), true));
                     
       }
    
        public void Kind(){
            
                // prod([lit("all")],sort("Kind"),attrs([term(cons("All"))]))
                expect(prod___lit_all_Kind_attrs___term__cons___65_108_108,
                new LiteralStackNode(1492, prod___char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_lit_all_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1493, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,108,108}));
            
                // prod([lit("variable")],sort("Kind"),attrs([term(cons("Variable"))]))
                expect(prod___lit_variable_Kind_attrs___term__cons___86_97_114_105_97_98_108_101,
                new LiteralStackNode(1494, prod___char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_lit_variable_attrs___term__literal, new char[] {118,97,114,105,97,98,108,101}));
            
                // prod([lit("anno")],sort("Kind"),attrs([term(cons("Anno"))]))
                expect(prod___lit_anno_Kind_attrs___term__cons___65_110_110_111,
                new LiteralStackNode(1495, prod___char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_lit_anno_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1496, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,110,110,111}));
            
                // prod([lit("data")],sort("Kind"),attrs([term(cons("Data"))]))
                expect(prod___lit_data_Kind_attrs___term__cons___68_97_116_97,
                new LiteralStackNode(1497, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_lit_data_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1498, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,97}));
            
                // prod([lit("function")],sort("Kind"),attrs([term(cons("Function"))]))
                expect(prod___lit_function_Kind_attrs___term__cons___70_117_110_99_116_105_111_110,
                new LiteralStackNode(1499, prod___char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_lit_function_attrs___term__literal, new char[] {102,117,110,99,116,105,111,110}));
            
                // prod([lit("view")],sort("Kind"),attrs([term(cons("View"))]))
                expect(prod___lit_view_Kind_attrs___term__cons___86_105_101_119,
                new LiteralStackNode(1500, prod___char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_lit_view_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1501, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,105,101,119}));
            
                // prod([lit("rule")],sort("Kind"),attrs([term(cons("Rule"))]))
                expect(prod___lit_rule_Kind_attrs___term__cons___82_117_108_101,
                new LiteralStackNode(1502, prod___char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_rule_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1503, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,117,108,101}));
            
                // prod([lit("alias")],sort("Kind"),attrs([term(cons("Alias"))]))
                expect(prod___lit_alias_Kind_attrs___term__cons___65_108_105_97_115,
                new LiteralStackNode(1504, prod___char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_lit_alias_attrs___term__literal, new char[] {97,108,105,97,115}));
            
                // prod([lit("module")],sort("Kind"),attrs([term(cons("Module"))]))
                expect(prod___lit_module_Kind_attrs___term__cons___77_111_100_117_108_101,
                new LiteralStackNode(1505, prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_module_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1506, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {109,111,100,117,108,101}));
            
                // prod([lit("tag")],sort("Kind"),attrs([term(cons("Tag"))]))
                expect(prod___lit_tag_Kind_attrs___term__cons___84_97_103,
                new LiteralStackNode(1507, prod___char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_lit_tag_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1508, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,97,103}));
              
        }
    
        public void Target(){
            
                // prod([label("name",sort("Name"))],sort("Target"),attrs([term(cons("Labeled"))]))
                expect(prod___name_Name_Target_attrs___term__cons___76_97_98_101_108_101_100,
                new NonTerminalStackNode(1510, "Name"));
            
                // prod([],sort("Target"),attrs([term(cons("Empty"))]))
                expect(prod___Target_attrs___term__cons___69_109_112_116_121,
                new EpsilonStackNode(1511));
              
        }
    
        public void IntegerLiteral(){
            
                // prod([label("octal",sort("OctalIntegerLiteral"))],sort("IntegerLiteral"),attrs([term(cons("OctalIntegerLiteral"))]))
                expect(prod___octal_OctalIntegerLiteral_IntegerLiteral_attrs___term__cons___79_99_116_97_108_73_110_116_101_103_101_114_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1513, "OctalIntegerLiteral"));
            
                // prod([label("hex",sort("HexIntegerLiteral"))],sort("IntegerLiteral"),attrs([term(cons("HexIntegerLiteral"))]))
                expect(prod___hex_HexIntegerLiteral_IntegerLiteral_attrs___term__cons___72_101_120_73_110_116_101_103_101_114_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1515, "HexIntegerLiteral"));
            
                // prod([label("decimal",sort("DecimalIntegerLiteral"))],sort("IntegerLiteral"),attrs([term(cons("DecimalIntegerLiteral"))]))
                expect(prod___decimal_DecimalIntegerLiteral_IntegerLiteral_attrs___term__cons___68_101_99_105_109_97_108_73_110_116_101_103_101_114_76_105_116_101_114_97_108,
                new NonTerminalStackNode(1517, "DecimalIntegerLiteral"));
              
        }
    
        public void FunctionBody(){
            
                // prod([lit("{"),\iter-star(layout()),label("statements",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("FunctionBody"),attrs([term(cons("Default"))]))
                expect(prod___lit___123_iter_star__layout_statements_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_FunctionBody_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(1518, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1519, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1520, "layout"), false),
		new SeparatedListStackNode(1522, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1523, "Statement"), new AbstractStackNode[]{new ListStackNode(1524, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1525, "layout"), false)}, false),
		new ListStackNode(1526, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1527, "layout"), false),
		new LiteralStackNode(1528, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
              
        }
    
        public void UserType(){
            
                // prod([label("name",sort("QualifiedName")),\iter-star(layout()),lit("["),\iter-star(layout()),label("parameters",\iter-seps(sort("Type"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit("]")],sort("UserType"),attrs([term(cons("Parametric"))]))
                expect(prod___name_QualifiedName_iter_star__layout_lit___91_iter_star__layout_parameters_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___93_UserType_attrs___term__cons___80_97_114_97_109_101_116_114_105_99,
                new NonTerminalStackNode(1530, "QualifiedName"),
		new ListStackNode(1531, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1532, "layout"), false),
		new LiteralStackNode(1533, prod___char_class___range__91_91_lit___91_attrs___term__literal, new char[] {91}),
		new ListStackNode(1534, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1535, "layout"), false),
		new SeparatedListStackNode(1537, regular__iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1538, "Type"), new AbstractStackNode[]{new ListStackNode(1539, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1540, "layout"), false),
		new LiteralStackNode(1541, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1542, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1543, "layout"), false)}, true),
		new ListStackNode(1544, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1545, "layout"), false),
		new LiteralStackNode(1546, prod___char_class___range__93_93_lit___93_attrs___term__literal, new char[] {93}));
            
                // prod([label("name",sort("QualifiedName"))],sort("UserType"),attrs([term(cons("Name"))]))
                expect(prod___name_QualifiedName_UserType_attrs___term__cons___78_97_109_101,
                new NonTerminalStackNode(1548, "QualifiedName"));
              
        }
    
        public void Import(){
            
                // prod([lit("import"),\iter-star(layout()),label("module",sort("ImportedModule")),\iter-star(layout()),lit(";")],sort("Import"),attrs([term(cons("Default"))]))
                expect(prod___lit_import_iter_star__layout_module_ImportedModule_iter_star__layout_lit___59_Import_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(1549, prod___char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_lit_import_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1550, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,109,112,111,114,116}),
		new ListStackNode(1551, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1552, "layout"), false),
		new NonTerminalStackNode(1554, "ImportedModule"),
		new ListStackNode(1555, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1556, "layout"), false),
		new LiteralStackNode(1557, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("extend"),\iter-star(layout()),label("module",sort("ImportedModule")),\iter-star(layout()),lit(";")],sort("Import"),attrs([term(cons("Extend"))]))
                expect(prod___lit_extend_iter_star__layout_module_ImportedModule_iter_star__layout_lit___59_Import_attrs___term__cons___69_120_116_101_110_100,
                new LiteralStackNode(1558, prod___char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_extend_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1559, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {101,120,116,101,110,100}),
		new ListStackNode(1560, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1561, "layout"), false),
		new NonTerminalStackNode(1563, "ImportedModule"),
		new ListStackNode(1564, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1565, "layout"), false),
		new LiteralStackNode(1566, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("syntax",sort("SyntaxDefinition"))],sort("Import"),attrs([term(cons("Syntax"))]))
                expect(prod___syntax_SyntaxDefinition_Import_attrs___term__cons___83_121_110_116_97_120,
                new NonTerminalStackNode(1568, "SyntaxDefinition"));
              
        }
    
        public void Body(){
            
                // prod([label("toplevels",\iter-star-seps(sort("Toplevel"),[\iter-star(layout())]))],sort("Body"),attrs([term(cons("Toplevels"))]))
                expect(prod___toplevels_iter_star_seps__Toplevel__iter_star__layout_Body_attrs___term__cons___84_111_112_108_101_118_101_108_115,
                new SeparatedListStackNode(1570, regular__iter_star_seps__Toplevel__iter_star__layout_no_attrs, new NonTerminalStackNode(1571, "Toplevel"), new AbstractStackNode[]{new ListStackNode(1572, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1573, "layout"), false)}, false));
              
        }
    
        public void URLChars(){
            
                // prod([\iter-star(\char-class([range(33,59),range(61,123)]))],sort("URLChars"),attrs([term(lex())]))
                expect(prod___iter_star__char_class___range__33_59_range__61_123_URLChars_attrs___term__lex,
                new ListStackNode(1574, regular__iter_star__char_class___range__33_59_range__61_123_no_attrs, new CharStackNode(1575, new char[][]{{33,59},{61,123}}), false));
              
        }
    
        public void TimeZonePart(){
            
                // prod([\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char-class([range(48,57)]),\char-class([range(48,53)]),\char-class([range(48,57)])],sort("TimeZonePart"),attrs([term(lex())]))
                expect(prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_TimeZonePart_attrs___term__lex,
                new CharStackNode(1576, new char[][]{{43,43},{45,45}}),
		new CharStackNode(1577, new char[][]{{48,49}}),
		new CharStackNode(1578, new char[][]{{48,57}}),
		new CharStackNode(1579, new char[][]{{48,53}}),
		new CharStackNode(1580, new char[][]{{48,57}}));
            
                // prod([lit("Z")],sort("TimeZonePart"),attrs([term(lex())]))
                expect(prod___lit_Z_TimeZonePart_attrs___term__lex,
                new LiteralStackNode(1581, prod___char_class___range__90_90_lit_Z_attrs___term__literal, new char[] {90}));
            
                // prod([\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char-class([range(48,57)])],sort("TimeZonePart"),attrs([term(lex())]))
                expect(prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_TimeZonePart_attrs___term__lex,
                new CharStackNode(1582, new char[][]{{43,43},{45,45}}),
		new CharStackNode(1583, new char[][]{{48,49}}),
		new CharStackNode(1584, new char[][]{{48,57}}));
            
                // prod([\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char-class([range(48,57)]),lit(":"),\char-class([range(48,53)]),\char-class([range(48,57)])],sort("TimeZonePart"),attrs([term(lex())]))
                expect(prod___char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_TimeZonePart_attrs___term__lex,
                new CharStackNode(1585, new char[][]{{43,43},{45,45}}),
		new CharStackNode(1586, new char[][]{{48,49}}),
		new CharStackNode(1587, new char[][]{{48,57}}),
		new LiteralStackNode(1588, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1589, new char[][]{{58,58}})}, new char[] {58}),
		new CharStackNode(1590, new char[][]{{48,53}}),
		new CharStackNode(1591, new char[][]{{48,57}}));
              
        }
    
        public void StringTemplate(){
            
                // prod([lit("for"),\iter-star(layout()),lit("("),\iter-star(layout()),label("generators",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("body",sort("StringMiddle")),\iter-star(layout()),label("postStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("StringTemplate"),attrs([term(cons("For"))]))
                expect(prod___lit_for_iter_star__layout_lit___40_iter_star__layout_generators_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___70_111_114,
                new LiteralStackNode(1592, prod___char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_lit_for_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1593, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,111,114}),
		new ListStackNode(1594, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1595, "layout"), false),
		new LiteralStackNode(1596, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1597, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1598, "layout"), false),
		new SeparatedListStackNode(1600, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1601, "Expression"), new AbstractStackNode[]{new ListStackNode(1602, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1603, "layout"), false),
		new LiteralStackNode(1604, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1605, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1606, "layout"), false)}, true),
		new ListStackNode(1607, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1608, "layout"), false),
		new LiteralStackNode(1609, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(1610, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1611, "layout"), false),
		new LiteralStackNode(1612, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1613, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1614, "layout"), false),
		new SeparatedListStackNode(1616, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1617, "Statement"), new AbstractStackNode[]{new ListStackNode(1618, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1619, "layout"), false)}, false),
		new ListStackNode(1620, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1621, "layout"), false),
		new NonTerminalStackNode(1623, "StringMiddle"),
		new ListStackNode(1624, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1625, "layout"), false),
		new SeparatedListStackNode(1627, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1628, "Statement"), new AbstractStackNode[]{new ListStackNode(1629, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1630, "layout"), false)}, false),
		new ListStackNode(1631, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1632, "layout"), false),
		new LiteralStackNode(1633, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("while"),\iter-star(layout()),lit("("),\iter-star(layout()),label("condition",sort("Expression")),\iter-star(layout()),lit(")"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("body",sort("StringMiddle")),\iter-star(layout()),label("postStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("StringTemplate"),attrs([term(cons("While"))]))
                expect(prod___lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___87_104_105_108_101,
                new LiteralStackNode(1634, prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1635, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {119,104,105,108,101}),
		new ListStackNode(1636, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1637, "layout"), false),
		new LiteralStackNode(1638, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1639, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1640, "layout"), false),
		new NonTerminalStackNode(1642, "Expression"),
		new ListStackNode(1643, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1644, "layout"), false),
		new LiteralStackNode(1645, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(1646, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1647, "layout"), false),
		new LiteralStackNode(1648, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1649, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1650, "layout"), false),
		new SeparatedListStackNode(1652, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1653, "Statement"), new AbstractStackNode[]{new ListStackNode(1654, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1655, "layout"), false)}, false),
		new ListStackNode(1656, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1657, "layout"), false),
		new NonTerminalStackNode(1659, "StringMiddle"),
		new ListStackNode(1660, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1661, "layout"), false),
		new SeparatedListStackNode(1663, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1664, "Statement"), new AbstractStackNode[]{new ListStackNode(1665, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1666, "layout"), false)}, false),
		new ListStackNode(1667, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1668, "layout"), false),
		new LiteralStackNode(1669, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("do"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("body",sort("StringMiddle")),\iter-star(layout()),label("postStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}"),\iter-star(layout()),lit("while"),\iter-star(layout()),lit("("),\iter-star(layout()),label("condition",sort("Expression")),\iter-star(layout()),lit(")")],sort("StringTemplate"),attrs([term(cons("DoWhile"))]))
                expect(prod___lit_do_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_StringTemplate_attrs___term__cons___68_111_87_104_105_108_101,
                new LiteralStackNode(1670, prod___char_class___range__100_100_char_class___range__111_111_lit_do_attrs___term__literal, new char[] {100,111}),
		new ListStackNode(1671, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1672, "layout"), false),
		new LiteralStackNode(1673, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1674, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1675, "layout"), false),
		new SeparatedListStackNode(1677, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1678, "Statement"), new AbstractStackNode[]{new ListStackNode(1679, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1680, "layout"), false)}, false),
		new ListStackNode(1681, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1682, "layout"), false),
		new NonTerminalStackNode(1684, "StringMiddle"),
		new ListStackNode(1685, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1686, "layout"), false),
		new SeparatedListStackNode(1688, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1689, "Statement"), new AbstractStackNode[]{new ListStackNode(1690, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1691, "layout"), false)}, false),
		new ListStackNode(1692, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1693, "layout"), false),
		new LiteralStackNode(1694, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}),
		new ListStackNode(1695, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1696, "layout"), false),
		new LiteralStackNode(1697, prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1698, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {119,104,105,108,101}),
		new ListStackNode(1699, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1700, "layout"), false),
		new LiteralStackNode(1701, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1702, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1703, "layout"), false),
		new NonTerminalStackNode(1705, "Expression"),
		new ListStackNode(1706, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1707, "layout"), false),
		new LiteralStackNode(1708, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([lit("if"),\iter-star(layout()),lit("("),\iter-star(layout()),label("conditions",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("body",sort("StringMiddle")),\iter-star(layout()),label("postStats",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("StringTemplate"),attrs([term(cons("IfThen"))]))
                expect(prod___lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_body_StringMiddle_iter_star__layout_postStats_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___73_102_84_104_101_110,
                new LiteralStackNode(1709, prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1710, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,102}),
		new ListStackNode(1711, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1712, "layout"), false),
		new LiteralStackNode(1713, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1714, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1715, "layout"), false),
		new SeparatedListStackNode(1717, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1718, "Expression"), new AbstractStackNode[]{new ListStackNode(1719, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1720, "layout"), false),
		new LiteralStackNode(1721, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1722, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1723, "layout"), false)}, true),
		new ListStackNode(1724, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1725, "layout"), false),
		new LiteralStackNode(1726, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(1727, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1728, "layout"), false),
		new LiteralStackNode(1729, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1730, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1731, "layout"), false),
		new SeparatedListStackNode(1733, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1734, "Statement"), new AbstractStackNode[]{new ListStackNode(1735, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1736, "layout"), false)}, false),
		new ListStackNode(1737, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1738, "layout"), false),
		new NonTerminalStackNode(1740, "StringMiddle"),
		new ListStackNode(1741, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1742, "layout"), false),
		new SeparatedListStackNode(1744, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1745, "Statement"), new AbstractStackNode[]{new ListStackNode(1746, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1747, "layout"), false)}, false),
		new ListStackNode(1748, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1749, "layout"), false),
		new LiteralStackNode(1750, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("if"),\iter-star(layout()),lit("("),\iter-star(layout()),label("conditions",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStatsThen",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("thenString",sort("StringMiddle")),\iter-star(layout()),label("postStatsThen",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}"),\iter-star(layout()),lit("else"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("preStatsElse",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),label("elseString",sort("StringMiddle")),\iter-star(layout()),label("postStatsElse",\iter-star-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("StringTemplate"),attrs([term(cons("IfThenElse"))]))
                expect(prod___lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_preStatsThen_iter_star_seps__Statement__iter_star__layout_iter_star__layout_thenString_StringMiddle_iter_star__layout_postStatsThen_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_iter_star__layout_lit_else_iter_star__layout_lit___123_iter_star__layout_preStatsElse_iter_star_seps__Statement__iter_star__layout_iter_star__layout_elseString_StringMiddle_iter_star__layout_postStatsElse_iter_star_seps__Statement__iter_star__layout_iter_star__layout_lit___125_StringTemplate_attrs___term__cons___73_102_84_104_101_110_69_108_115_101,
                new LiteralStackNode(1751, prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1752, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,102}),
		new ListStackNode(1753, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1754, "layout"), false),
		new LiteralStackNode(1755, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(1756, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1757, "layout"), false),
		new SeparatedListStackNode(1759, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(1760, "Expression"), new AbstractStackNode[]{new ListStackNode(1761, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1762, "layout"), false),
		new LiteralStackNode(1763, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(1764, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1765, "layout"), false)}, true),
		new ListStackNode(1766, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1767, "layout"), false),
		new LiteralStackNode(1768, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(1769, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1770, "layout"), false),
		new LiteralStackNode(1771, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1772, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1773, "layout"), false),
		new SeparatedListStackNode(1775, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1776, "Statement"), new AbstractStackNode[]{new ListStackNode(1777, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1778, "layout"), false)}, false),
		new ListStackNode(1779, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1780, "layout"), false),
		new NonTerminalStackNode(1782, "StringMiddle"),
		new ListStackNode(1783, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1784, "layout"), false),
		new SeparatedListStackNode(1786, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1787, "Statement"), new AbstractStackNode[]{new ListStackNode(1788, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1789, "layout"), false)}, false),
		new ListStackNode(1790, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1791, "layout"), false),
		new LiteralStackNode(1792, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}),
		new ListStackNode(1793, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1794, "layout"), false),
		new LiteralStackNode(1795, prod___char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_else_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1796, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {101,108,115,101}),
		new ListStackNode(1797, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1798, "layout"), false),
		new LiteralStackNode(1799, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(1800, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1801, "layout"), false),
		new SeparatedListStackNode(1803, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1804, "Statement"), new AbstractStackNode[]{new ListStackNode(1805, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1806, "layout"), false)}, false),
		new ListStackNode(1807, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1808, "layout"), false),
		new NonTerminalStackNode(1810, "StringMiddle"),
		new ListStackNode(1811, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1812, "layout"), false),
		new SeparatedListStackNode(1814, regular__iter_star_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(1815, "Statement"), new AbstractStackNode[]{new ListStackNode(1816, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1817, "layout"), false)}, false),
		new ListStackNode(1818, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1819, "layout"), false),
		new LiteralStackNode(1820, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
              
        }
    
        public void PreStringChars(){
            
                // prod([\char-class([range(34,34)]),\iter-star(sort("StringCharacter")),\char-class([range(60,60)])],sort("PreStringChars"),attrs([term(lex())]))
                expect(prod___char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60_PreStringChars_attrs___term__lex,
                new CharStackNode(1821, new char[][]{{34,34}}),
		new ListStackNode(1822, regular__iter_star__StringCharacter_no_attrs, new NonTerminalStackNode(1823, "StringCharacter"), false),
		new CharStackNode(1824, new char[][]{{60,60}}));
              
        }
    
        public void NoElseMayFollow() {
             
                // prod([],sort("NoElseMayFollow"),attrs([term(cons("Default"))]))
                expect(prod___NoElseMayFollow_attrs___term__cons___68_101_102_97_117_108_116, new IReducableStackNode[] {},
                new EpsilonStackNode(1825));
                     
       }
    
        public void NamedBackslash() {
             
                // prod([\char-class([range(92,92)])],sort("NamedBackslash"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_NamedBackslash_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1826, new char[][]{{60,60},{62,62},{92,92}})},
                new CharStackNode(1827, new char[][]{{92,92}}));
                     
       }
    
        public void PostPathChars(){
            
                // prod([lit("\>"),sort("URLChars"),lit("|")],sort("PostPathChars"),attrs([term(lex())]))
                expect(prod___lit___62_URLChars_lit___124_PostPathChars_attrs___term__lex,
                new LiteralStackNode(1828, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1829, new char[][]{{61,61}})}, new char[] {62}),
		new NonTerminalStackNode(1830, "URLChars"),
		new LiteralStackNode(1831, prod___char_class___range__124_124_lit___124_attrs___term__literal, new char[] {124}));
              
        }
    
        public void PathPart(){
            
                // prod([label("pathChars",sort("PathChars"))],sort("PathPart"),attrs([term(cons("NonInterpolated"))]))
                expect(prod___pathChars_PathChars_PathPart_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(1833, "PathChars"));
            
                // prod([label("pre",sort("PrePathChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("PathTail"))],sort("PathPart"),attrs([term(cons("Interpolated"))]))
                expect(prod___pre_PrePathChars_iter_star__layout_expression_Expression_iter_star__layout_tail_PathTail_PathPart_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(1835, "PrePathChars"),
		new ListStackNode(1836, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1837, "layout"), false),
		new NonTerminalStackNode(1839, "Expression"),
		new ListStackNode(1840, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1841, "layout"), false),
		new NonTerminalStackNode(1843, "PathTail"));
              
        }
    
        public void TagChar(){
            
                // prod([\char-class([range(48,124)])],sort("TagChar"),attrs([term(lex())]))
                expect(prod___char_class___range__48_124_TagChar_attrs___term__lex,
                new CharStackNode(1844, new char[][]{{48,124}}));
            
                // prod([\char-class([range(92,92)]),\char-class([range(92,92),range(125,125)])],sort("TagChar"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_char_class___range__92_92_range__125_125_TagChar_attrs___term__lex,
                new CharStackNode(1845, new char[][]{{92,92}}),
		new CharStackNode(1846, new char[][]{{92,92},{125,125}}));
              
        }
    
        public void DataTarget(){
            
                // prod([label("label",sort("Name")),\iter-star(layout()),lit(":")],sort("DataTarget"),attrs([term(cons("Labeled"))]))
                expect(prod___label_Name_iter_star__layout_lit___58_DataTarget_attrs___term__cons___76_97_98_101_108_101_100,
                new NonTerminalStackNode(1848, "Name"),
		new ListStackNode(1849, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1850, "layout"), false),
		new LiteralStackNode(1851, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1852, new char[][]{{58,58}})}, new char[] {58}));
            
                // prod([],sort("DataTarget"),attrs([term(cons("Empty"))]))
                expect(prod___DataTarget_attrs___term__cons___69_109_112_116_121,
                new EpsilonStackNode(1853));
              
        }
    
        public void StringCharacter(){
            
                // prod([\char-class([range(35,38),range(40,59),range(61,61),range(63,91),range(93,117)])],sort("StringCharacter"),attrs([term(lex())]))
                expect(prod___char_class___range__35_38_range__40_59_range__61_61_range__63_91_range__93_117_StringCharacter_attrs___term__lex,
                new CharStackNode(1854, new char[][]{{35,38},{40,59},{61,61},{63,91},{93,117}}));
            
                // prod([sort("UnicodeEscape")],sort("StringCharacter"),attrs([term(lex())]))
                expect(prod___UnicodeEscape_StringCharacter_attrs___term__lex,
                new NonTerminalStackNode(1855, "UnicodeEscape"));
            
                // prod([sort("OctalEscapeSequence")],sort("StringCharacter"),attrs([term(lex())]))
                expect(prod___OctalEscapeSequence_StringCharacter_attrs___term__lex,
                new NonTerminalStackNode(1856, "OctalEscapeSequence"));
            
                // prod([lit("\\"),\char-class([range(34,34),range(39,39),range(60,60),range(62,62),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116)])],sort("StringCharacter"),attrs([term(lex())]))
                expect(prod___lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_StringCharacter_attrs___term__lex,
                new LiteralStackNode(1857, prod___char_class___range__92_92_lit___92_attrs___term__literal, new char[] {92}),
		new CharStackNode(1858, new char[][]{{34,34},{39,39},{60,60},{62,62},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116}}));
              
        }
    
        public void JustTime(){
            
                // prod([lit("$T"),sort("TimePartNoTZ"),opt(sort("TimeZonePart"))],sort("JustTime"),attrs([term(lex())]))
                expect(prod___lit___36_84_TimePartNoTZ_opt__TimeZonePart_JustTime_attrs___term__lex,
                new LiteralStackNode(1859, prod___char_class___range__36_36_char_class___range__84_84_lit___36_84_attrs___term__literal, new char[] {36,84}),
		new NonTerminalStackNode(1860, "TimePartNoTZ"),
		new OptionalStackNode(1861, regular__opt__TimeZonePart_no_attrs, new NonTerminalStackNode(1862, "TimeZonePart")));
              
        }
    
        public void MidStringChars(){
            
                // prod([\char-class([range(62,62)]),\iter-star(sort("StringCharacter")),\char-class([range(60,60)])],sort("MidStringChars"),attrs([term(lex())]))
                expect(prod___char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60_MidStringChars_attrs___term__lex,
                new CharStackNode(1863, new char[][]{{62,62}}),
		new ListStackNode(1864, regular__iter_star__StringCharacter_no_attrs, new NonTerminalStackNode(1865, "StringCharacter"), false),
		new CharStackNode(1866, new char[][]{{60,60}}));
              
        }
    
        public void RegExpModifier(){
            
                // prod([\iter-star(\char-class([range(100,100),range(105,105),range(109,109),range(115,115)]))],sort("RegExpModifier"),attrs([term(lex())]))
                expect(prod___iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_RegExpModifier_attrs___term__lex,
                new ListStackNode(1867, regular__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_no_attrs, new CharStackNode(1868, new char[][]{{100,100},{105,105},{109,109},{115,115}}), false));
              
        }
    
        public void EscapedName() {
             
                // prod([\char-class([range(92,92)]),\char-class([range(65,90),range(95,95),range(97,122)]),\iter-star(\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)]))],sort("EscapedName"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_EscapedName_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1869, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(1870, new char[][]{{92,92}}),
		new CharStackNode(1871, new char[][]{{65,90},{95,95},{97,122}}),
		new ListStackNode(1872, regular__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_no_attrs, new CharStackNode(1873, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}}), false));
                     
       }
    
        public void RegExp(){
            
                // prod([sort("Backslash")],sort("RegExp"),attrs([term(lex())]))
                expect(prod___Backslash_RegExp_attrs___term__lex,
                new NonTerminalStackNode(1874, "Backslash"));
            
                // prod([lit("\<"),sort("Name"),lit(":"),\iter-star(sort("NamedRegExp")),lit("\>")],sort("RegExp"),attrs([term(lex())]))
                expect(prod___lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_RegExp_attrs___term__lex,
                new LiteralStackNode(1875, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1876, new char[][]{{61,61}})}, new char[] {60}),
		new NonTerminalStackNode(1877, "Name"),
		new LiteralStackNode(1878, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1879, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(1880, regular__iter_star__NamedRegExp_no_attrs, new NonTerminalStackNode(1881, "NamedRegExp"), false),
		new LiteralStackNode(1882, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1883, new char[][]{{61,61}})}, new char[] {62}));
            
                // prod([\char-class([range(92,92)]),\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],sort("RegExp"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_RegExp_attrs___term__lex,
                new CharStackNode(1884, new char[][]{{92,92}}),
		new CharStackNode(1885, new char[][]{{47,47},{60,60},{62,62},{92,92}}));
            
                // prod([\char-class([range(48,59),range(61,61),range(63,91),range(93,117)])],sort("RegExp"),attrs([term(lex())]))
                expect(prod___char_class___range__48_59_range__61_61_range__63_91_range__93_117_RegExp_attrs___term__lex,
                new CharStackNode(1886, new char[][]{{48,59},{61,61},{63,91},{93,117}}));
            
                // prod([lit("\<"),sort("Name"),lit("\>")],sort("RegExp"),attrs([term(lex())]))
                expect(prod___lit___60_Name_lit___62_RegExp_attrs___term__lex,
                new LiteralStackNode(1887, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1888, new char[][]{{61,61}})}, new char[] {60}),
		new NonTerminalStackNode(1889, "Name"),
		new LiteralStackNode(1890, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1891, new char[][]{{61,61}})}, new char[] {62}));
              
        }
    
        public void RealLiteral() {
             
                // prod([iter(\char-class([range(48,57)])),\char-class([range(69,69),range(101,101)]),opt(\char-class([range(43,43),range(45,45)])),iter(\char-class([range(48,57)])),\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new ListStackNode(1893, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1894, new char[][]{{48,57}}), true),
		new CharStackNode(1895, new char[][]{{69,69},{101,101}}),
		new OptionalStackNode(1896, regular__opt__char_class___range__43_43_range__45_45_no_attrs, new CharStackNode(1897, new char[][]{{43,43},{45,45}})),
		new ListStackNode(1898, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1899, new char[][]{{48,57}}), true),
		new CharStackNode(1900, new char[][]{{68,68},{70,70},{100,100},{102,102}}));
            
                // prod([iter(\char-class([range(48,57)])),lit("."),\iter-star(\char-class([range(48,57)])),opt(\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new ListStackNode(1901, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1902, new char[][]{{48,57}}), true),
		new LiteralStackNode(1903, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1904, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(1905, regular__iter_star__char_class___range__48_57_no_attrs, new CharStackNode(1906, new char[][]{{48,57}}), false),
		new OptionalStackNode(1907, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs, new CharStackNode(1908, new char[][]{{68,68},{70,70},{100,100},{102,102}})));
            
                // prod([iter(\char-class([range(48,57)])),\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new ListStackNode(1909, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1910, new char[][]{{48,57}}), true),
		new CharStackNode(1911, new char[][]{{68,68},{70,70},{100,100},{102,102}}));
            
                // prod([lit("."),iter(\char-class([range(48,57)])),opt(\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___lit___46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1912, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1913, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(1914, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1915, new char[][]{{48,57}}), true),
		new OptionalStackNode(1916, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs, new CharStackNode(1917, new char[][]{{68,68},{70,70},{100,100},{102,102}})));
            
                // prod([iter(\char-class([range(48,57)])),\char-class([range(69,69),range(101,101)]),opt(\char-class([range(43,43),range(45,45)])),iter(\char-class([range(48,57)])),opt(\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new ListStackNode(1918, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1919, new char[][]{{48,57}}), true),
		new CharStackNode(1920, new char[][]{{69,69},{101,101}}),
		new OptionalStackNode(1921, regular__opt__char_class___range__43_43_range__45_45_no_attrs, new CharStackNode(1922, new char[][]{{43,43},{45,45}})),
		new ListStackNode(1923, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1924, new char[][]{{48,57}}), true),
		new OptionalStackNode(1925, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs, new CharStackNode(1926, new char[][]{{68,68},{70,70},{100,100},{102,102}})));
            
                // prod([lit("."),iter(\char-class([range(48,57)])),\char-class([range(69,69),range(101,101)]),opt(\char-class([range(43,43),range(45,45)])),iter(\char-class([range(48,57)])),opt(\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___lit___46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(1927, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1928, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(1929, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1930, new char[][]{{48,57}}), true),
		new CharStackNode(1931, new char[][]{{69,69},{101,101}}),
		new OptionalStackNode(1932, regular__opt__char_class___range__43_43_range__45_45_no_attrs, new CharStackNode(1933, new char[][]{{43,43},{45,45}})),
		new ListStackNode(1934, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1935, new char[][]{{48,57}}), true),
		new OptionalStackNode(1936, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs, new CharStackNode(1937, new char[][]{{68,68},{70,70},{100,100},{102,102}})));
            
                // prod([iter(\char-class([range(48,57)])),lit("."),\iter-star(\char-class([range(48,57)])),\char-class([range(69,69),range(101,101)]),opt(\char-class([range(43,43),range(45,45)])),iter(\char-class([range(48,57)])),opt(\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],sort("RealLiteral"),attrs([term(lex())]))
                expect(prod___iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_RealLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(1892, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new ListStackNode(1938, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1939, new char[][]{{48,57}}), true),
		new LiteralStackNode(1940, prod___char_class___range__46_46_lit___46_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1941, new char[][]{{46,46}})}, new char[] {46}),
		new ListStackNode(1942, regular__iter_star__char_class___range__48_57_no_attrs, new CharStackNode(1943, new char[][]{{48,57}}), false),
		new CharStackNode(1944, new char[][]{{69,69},{101,101}}),
		new OptionalStackNode(1945, regular__opt__char_class___range__43_43_range__45_45_no_attrs, new CharStackNode(1946, new char[][]{{43,43},{45,45}})),
		new ListStackNode(1947, regular__iter__char_class___range__48_57_no_attrs, new CharStackNode(1948, new char[][]{{48,57}}), true),
		new OptionalStackNode(1949, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_no_attrs, new CharStackNode(1950, new char[][]{{68,68},{70,70},{100,100},{102,102}})));
                     
       }
    
        public void LocationLiteral(){
            
                // prod([label("protocolPart",sort("ProtocolPart")),\iter-star(layout()),label("pathPart",sort("PathPart"))],sort("LocationLiteral"),attrs([term(cons("Default"))]))
                expect(prod___protocolPart_ProtocolPart_iter_star__layout_pathPart_PathPart_LocationLiteral_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(1952, "ProtocolPart"),
		new ListStackNode(1953, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1954, "layout"), false),
		new NonTerminalStackNode(1956, "PathPart"));
              
        }
    
        public void ShellCommand(){
            
                // prod([lit("edit"),\iter-star(layout()),label("name",sort("QualifiedName"))],sort("ShellCommand"),attrs([term(cons("Edit"))]))
                expect(prod___lit_edit_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___69_100_105_116,
                new LiteralStackNode(1957, prod___char_class___range__101_101_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_lit_edit_attrs___term__literal, new char[] {101,100,105,116}),
		new ListStackNode(1958, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1959, "layout"), false),
		new NonTerminalStackNode(1961, "QualifiedName"));
            
                // prod([lit("help")],sort("ShellCommand"),attrs([term(cons("Help"))]))
                expect(prod___lit_help_ShellCommand_attrs___term__cons___72_101_108_112,
                new LiteralStackNode(1962, prod___char_class___range__104_104_char_class___range__101_101_char_class___range__108_108_char_class___range__112_112_lit_help_attrs___term__literal, new char[] {104,101,108,112}));
            
                // prod([lit("set"),\iter-star(layout()),label("name",sort("QualifiedName")),\iter-star(layout()),label("expression",sort("Expression"))],sort("ShellCommand"),attrs([term(cons("SetOption"))]))
                expect(prod___lit_set_iter_star__layout_name_QualifiedName_iter_star__layout_expression_Expression_ShellCommand_attrs___term__cons___83_101_116_79_112_116_105_111_110,
                new LiteralStackNode(1963, prod___char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_lit_set_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1964, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,101,116}),
		new ListStackNode(1965, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1966, "layout"), false),
		new NonTerminalStackNode(1968, "QualifiedName"),
		new ListStackNode(1969, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1970, "layout"), false),
		new NonTerminalStackNode(1972, "Expression"));
            
                // prod([lit("declarations")],sort("ShellCommand"),attrs([term(cons("ListDeclarations"))]))
                expect(prod___lit_declarations_ShellCommand_attrs___term__cons___76_105_115_116_68_101_99_108_97_114_97_116_105_111_110_115,
                new LiteralStackNode(1973, prod___char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_lit_declarations_attrs___term__literal, new char[] {100,101,99,108,97,114,97,116,105,111,110,115}));
            
                // prod([lit("quit")],sort("ShellCommand"),attrs([term(cons("Quit"))]))
                expect(prod___lit_quit_ShellCommand_attrs___term__cons___81_117_105_116,
                new LiteralStackNode(1974, prod___char_class___range__113_113_char_class___range__117_117_char_class___range__105_105_char_class___range__116_116_lit_quit_attrs___term__literal, new char[] {113,117,105,116}));
            
                // prod([lit("unimport"),\iter-star(layout()),label("name",sort("QualifiedName"))],sort("ShellCommand"),attrs([term(cons("Unimport"))]))
                expect(prod___lit_unimport_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___85_110_105_109_112_111_114_116,
                new LiteralStackNode(1975, prod___char_class___range__117_117_char_class___range__110_110_char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_lit_unimport_attrs___term__literal, new char[] {117,110,105,109,112,111,114,116}),
		new ListStackNode(1976, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1977, "layout"), false),
		new NonTerminalStackNode(1979, "QualifiedName"));
            
                // prod([lit("history")],sort("ShellCommand"),attrs([term(cons("History"))]))
                expect(prod___lit_history_ShellCommand_attrs___term__cons___72_105_115_116_111_114_121,
                new LiteralStackNode(1980, prod___char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__121_121_lit_history_attrs___term__literal, new char[] {104,105,115,116,111,114,121}));
            
                // prod([lit("test")],sort("ShellCommand"),attrs([term(cons("Test"))]))
                expect(prod___lit_test_ShellCommand_attrs___term__cons___84_101_115_116,
                new LiteralStackNode(1981, prod___char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_lit_test_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(1982, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,101,115,116}));
            
                // prod([lit("modules")],sort("ShellCommand"),attrs([term(cons("ListModules"))]))
                expect(prod___lit_modules_ShellCommand_attrs___term__cons___76_105_115_116_77_111_100_117_108_101_115,
                new LiteralStackNode(1983, prod___char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_lit_modules_attrs___term__literal, new char[] {109,111,100,117,108,101,115}));
            
                // prod([lit("undeclare"),\iter-star(layout()),label("name",sort("QualifiedName"))],sort("ShellCommand"),attrs([term(cons("Undeclare"))]))
                expect(prod___lit_undeclare_iter_star__layout_name_QualifiedName_ShellCommand_attrs___term__cons___85_110_100_101_99_108_97_114_101,
                new LiteralStackNode(1984, prod___char_class___range__117_117_char_class___range__110_110_char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__101_101_lit_undeclare_attrs___term__literal, new char[] {117,110,100,101,99,108,97,114,101}),
		new ListStackNode(1985, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1986, "layout"), false),
		new NonTerminalStackNode(1988, "QualifiedName"));
              
        }
    
        public void StringMiddle(){
            
                // prod([label("mid",sort("MidStringChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("StringMiddle"))],sort("StringMiddle"),attrs([term(cons("Interpolated"))]))
                expect(prod___mid_MidStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringMiddle_StringMiddle_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(1990, "MidStringChars"),
		new ListStackNode(1991, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1992, "layout"), false),
		new NonTerminalStackNode(1994, "Expression"),
		new ListStackNode(1995, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(1996, "layout"), false),
		new NonTerminalStackNode(1998, "StringMiddle"));
            
                // prod([label("mid",sort("MidStringChars"))],sort("StringMiddle"),attrs([term(cons("Mid"))]))
                expect(prod___mid_MidStringChars_StringMiddle_attrs___term__cons___77_105_100,
                new NonTerminalStackNode(2000, "MidStringChars"));
            
                // prod([label("mid",sort("MidStringChars")),\iter-star(layout()),label("template",sort("StringTemplate")),\iter-star(layout()),label("tail",sort("StringMiddle"))],sort("StringMiddle"),attrs([term(cons("Template"))]))
                expect(prod___mid_MidStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringMiddle_StringMiddle_attrs___term__cons___84_101_109_112_108_97_116_101,
                new NonTerminalStackNode(2002, "MidStringChars"),
		new ListStackNode(2003, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2004, "layout"), false),
		new NonTerminalStackNode(2006, "StringTemplate"),
		new ListStackNode(2007, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2008, "layout"), false),
		new NonTerminalStackNode(2010, "StringMiddle"));
              
        }
    
        public void QualifiedName() {
             
                // prod([label("names",\iter-seps(sort("Name"),[\iter-star(layout()),lit("::"),\iter-star(layout())]))],sort("QualifiedName"),attrs([term(cons("Default"))]))
                expect(prod___names_iter_seps__Name__iter_star__layout_lit___58_58_iter_star__layout_QualifiedName_attrs___term__cons___68_101_102_97_117_108_116, new IReducableStackNode[] {},
                new SeparatedListStackNode(2012, regular__iter_seps__Name__iter_star__layout_lit___58_58_iter_star__layout_no_attrs, new NonTerminalStackNode(2013, "Name"), new AbstractStackNode[]{new ListStackNode(2014, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2015, "layout"), false),
		new LiteralStackNode(2016, prod___char_class___range__58_58_char_class___range__58_58_lit___58_58_attrs___term__literal, new char[] {58,58}),
		new ListStackNode(2017, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2018, "layout"), false)}, true));
                     
       }
    
        public void DecimalIntegerLiteral() {
             
                // prod([\char-class([range(49,57)]),\iter-star(\char-class([range(48,57)]))],sort("DecimalIntegerLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__49_57_iter_star__char_class___range__48_57_DecimalIntegerLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2019, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(2020, new char[][]{{49,57}}),
		new ListStackNode(2021, regular__iter_star__char_class___range__48_57_no_attrs, new CharStackNode(2022, new char[][]{{48,57}}), false));
            
                // prod([lit("0")],sort("DecimalIntegerLiteral"),attrs([term(lex())]))
                expect(prod___lit_0_DecimalIntegerLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2019, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new LiteralStackNode(2023, prod___char_class___range__48_48_lit_0_attrs___term__literal, new char[] {48}));
                     
       }
    
        public void Command(){
            
                // prod([lit("{"),\iter-star(layout()),label("statements",\iter-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Command"),attrs([term(cons("NonEmptyBlock"))]))
                expect(prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Command_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107,
                new LiteralStackNode(2024, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(2025, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2026, "layout"), false),
		new SeparatedListStackNode(2028, regular__iter_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(2029, "Statement"), new AbstractStackNode[]{new ListStackNode(2030, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2031, "layout"), false)}, true),
		new ListStackNode(2032, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2033, "layout"), false),
		new LiteralStackNode(2034, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit(":"),\iter-star(layout()),label("command",sort("ShellCommand"))],sort("Command"),attrs([term(cons("Shell"))]))
                expect(prod___lit___58_iter_star__layout_command_ShellCommand_Command_attrs___term__cons___83_104_101_108_108,
                new LiteralStackNode(2035, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2036, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(2037, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2038, "layout"), false),
		new NonTerminalStackNode(2040, "ShellCommand"));
            
                // prod([label("expression",sort("Expression"))],sort("Command"),attrs([term(cons("Expression"))]))
                expect(prod___expression_Expression_Command_attrs___term__cons___69_120_112_114_101_115_115_105_111_110,
                new NonTerminalStackNode(2042, "Expression"));
            
                // prod([label("statement",sort("Statement"))],sort("Command"),attrs([term(cons("Statement"))]))
                expect(prod___statement_Statement_Command_attrs___term__cons___83_116_97_116_101_109_101_110_116,
                new NonTerminalStackNode(2044, "Statement"));
            
                // prod([label("declaration",sort("Declaration"))],sort("Command"),attrs([term(cons("Declaration"))]))
                expect(prod___declaration_Declaration_Command_attrs___term__cons___68_101_99_108_97_114_97_116_105_111_110,
                new NonTerminalStackNode(2046, "Declaration"));
            
                // prod([label("imported",sort("Import"))],sort("Command"),attrs([term(cons("Import"))]))
                expect(prod___imported_Import_Command_attrs___term__cons___73_109_112_111_114_116,
                new NonTerminalStackNode(2048, "Import"));
              
        }
    
        public void ProtocolTail(){
            
                // prod([label("mid",sort("MidProtocolChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("ProtocolTail"))],sort("ProtocolTail"),attrs([term(cons("Mid"))]))
                expect(prod___mid_MidProtocolChars_iter_star__layout_expression_Expression_iter_star__layout_tail_ProtocolTail_ProtocolTail_attrs___term__cons___77_105_100,
                new NonTerminalStackNode(2050, "MidProtocolChars"),
		new ListStackNode(2051, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2052, "layout"), false),
		new NonTerminalStackNode(2054, "Expression"),
		new ListStackNode(2055, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2056, "layout"), false),
		new NonTerminalStackNode(2058, "ProtocolTail"));
            
                // prod([label("post",sort("PostProtocolChars"))],sort("ProtocolTail"),attrs([term(cons("Post"))]))
                expect(prod___post_PostProtocolChars_ProtocolTail_attrs___term__cons___80_111_115_116,
                new NonTerminalStackNode(2060, "PostProtocolChars"));
              
        }
    
        public void Visibility(){
            
                // prod([],sort("Visibility"),attrs([term(cons("Default"))]))
                expect(prod___Visibility_attrs___term__cons___68_101_102_97_117_108_116,
                new EpsilonStackNode(2061));
            
                // prod([lit("private")],sort("Visibility"),attrs([term(cons("Private"))]))
                expect(prod___lit_private_Visibility_attrs___term__cons___80_114_105_118_97_116_101,
                new LiteralStackNode(2062, prod___char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_lit_private_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2063, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {112,114,105,118,97,116,101}));
            
                // prod([lit("public")],sort("Visibility"),attrs([term(cons("Public"))]))
                expect(prod___lit_public_Visibility_attrs___term__cons___80_117_98_108_105_99,
                new LiteralStackNode(2064, prod___char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_lit_public_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2065, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {112,117,98,108,105,99}));
              
        }
    
        public void StringLiteral(){
            
                // prod([label("pre",sort("PreStringChars")),\iter-star(layout()),label("template",sort("StringTemplate")),\iter-star(layout()),label("tail",sort("StringTail"))],sort("StringLiteral"),attrs([term(cons("Template"))]))
                expect(prod___pre_PreStringChars_iter_star__layout_template_StringTemplate_iter_star__layout_tail_StringTail_StringLiteral_attrs___term__cons___84_101_109_112_108_97_116_101,
                new NonTerminalStackNode(2067, "PreStringChars"),
		new ListStackNode(2068, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2069, "layout"), false),
		new NonTerminalStackNode(2071, "StringTemplate"),
		new ListStackNode(2072, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2073, "layout"), false),
		new NonTerminalStackNode(2075, "StringTail"));
            
                // prod([label("pre",sort("PreStringChars")),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),label("tail",sort("StringTail"))],sort("StringLiteral"),attrs([term(cons("Interpolated"))]))
                expect(prod___pre_PreStringChars_iter_star__layout_expression_Expression_iter_star__layout_tail_StringTail_StringLiteral_attrs___term__cons___73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(2077, "PreStringChars"),
		new ListStackNode(2078, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2079, "layout"), false),
		new NonTerminalStackNode(2081, "Expression"),
		new ListStackNode(2082, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2083, "layout"), false),
		new NonTerminalStackNode(2085, "StringTail"));
            
                // prod([label("constant",sort("StringConstant"))],sort("StringLiteral"),attrs([term(cons("NonInterpolated"))]))
                expect(prod___constant_StringConstant_StringLiteral_attrs___term__cons___78_111_110_73_110_116_101_114_112_111_108_97_116_101_100,
                new NonTerminalStackNode(2087, "StringConstant"));
              
        }
    
        public void Renamings(){
            
                // prod([lit("renaming"),\iter-star(layout()),label("renamings",\iter-seps(sort("Renaming"),[\iter-star(layout()),lit(","),\iter-star(layout())]))],sort("Renamings"),attrs([term(cons("Default"))]))
                expect(prod___lit_renaming_iter_star__layout_renamings_iter_seps__Renaming__iter_star__layout_lit___44_iter_star__layout_Renamings_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(2088, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_lit_renaming_attrs___term__literal, new char[] {114,101,110,97,109,105,110,103}),
		new ListStackNode(2089, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2090, "layout"), false),
		new SeparatedListStackNode(2092, regular__iter_seps__Renaming__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2093, "Renaming"), new AbstractStackNode[]{new ListStackNode(2094, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2095, "layout"), false),
		new LiteralStackNode(2096, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2097, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2098, "layout"), false)}, true));
              
        }
    
        public void PostProtocolChars(){
            
                // prod([lit("\>"),sort("URLChars"),lit("://")],sort("PostProtocolChars"),attrs([term(lex())]))
                expect(prod___lit___62_URLChars_lit___58_47_47_PostProtocolChars_attrs___term__lex,
                new LiteralStackNode(2099, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2100, new char[][]{{61,61}})}, new char[] {62}),
		new NonTerminalStackNode(2101, "URLChars"),
		new LiteralStackNode(2102, prod___char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_lit___58_47_47_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2103, new char[][]{{9,10},{13,13},{32,32}})}, new char[] {58,47,47}));
              
        }
    
        public void Statement(){
            
                // prod([label("expression",sort("Expression")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("Expression"))]))
                expect(prod___expression_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___69_120_112_114_101_115_115_105_111_110,
                new NonTerminalStackNode(2105, "Expression"),
		new ListStackNode(2106, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2107, "layout"), false),
		new LiteralStackNode(2108, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("{"),\iter-star(layout()),label("statements",\iter-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Statement"),attrs([term(cons("NonEmptyBlock"))]))
                expect(prod___label_Label_iter_star__layout_lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107,
                new NonTerminalStackNode(2110, "Label"),
		new ListStackNode(2111, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2112, "layout"), false),
		new LiteralStackNode(2113, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(2114, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2115, "layout"), false),
		new SeparatedListStackNode(2117, regular__iter_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(2118, "Statement"), new AbstractStackNode[]{new ListStackNode(2119, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2120, "layout"), false)}, true),
		new ListStackNode(2121, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2122, "layout"), false),
		new LiteralStackNode(2123, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("{"),\iter-star(layout()),label("statements",\iter-seps(sort("Statement"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Statement"),attrs([term(cons("NonEmptyBlock"))]))
                expect(prod___lit___123_iter_star__layout_statements_iter_seps__Statement__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___78_111_110_69_109_112_116_121_66_108_111_99_107,
                new LiteralStackNode(2124, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(2125, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2126, "layout"), false),
		new SeparatedListStackNode(2128, regular__iter_seps__Statement__iter_star__layout_no_attrs, new NonTerminalStackNode(2129, "Statement"), new AbstractStackNode[]{new ListStackNode(2130, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2131, "layout"), false)}, true),
		new ListStackNode(2132, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2133, "layout"), false),
		new LiteralStackNode(2134, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([lit("continue"),\iter-star(layout()),label("target",sort("Target")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("Continue"))]))
                expect(prod___lit_continue_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___67_111_110_116_105_110_117_101,
                new LiteralStackNode(2135, prod___char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_lit_continue_attrs___term__literal, new char[] {99,111,110,116,105,110,117,101}),
		new ListStackNode(2136, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2137, "layout"), false),
		new NonTerminalStackNode(2139, "Target"),
		new ListStackNode(2140, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2141, "layout"), false),
		new LiteralStackNode(2142, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("while"),\iter-star(layout()),lit("("),\iter-star(layout()),label("conditions",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),label("body",sort("Statement"))],sort("Statement"),attrs([term(cons("While"))]))
                expect(prod___label_Label_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___87_104_105_108_101,
                new NonTerminalStackNode(2144, "Label"),
		new ListStackNode(2145, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2146, "layout"), false),
		new LiteralStackNode(2147, prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2148, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {119,104,105,108,101}),
		new ListStackNode(2149, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2150, "layout"), false),
		new LiteralStackNode(2151, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2152, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2153, "layout"), false),
		new SeparatedListStackNode(2155, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2156, "Expression"), new AbstractStackNode[]{new ListStackNode(2157, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2158, "layout"), false),
		new LiteralStackNode(2159, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2160, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2161, "layout"), false)}, true),
		new ListStackNode(2162, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2163, "layout"), false),
		new LiteralStackNode(2164, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2165, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2166, "layout"), false),
		new NonTerminalStackNode(2168, "Statement"));
            
                // prod([lit("insert"),\iter-star(layout()),label("dataTarget",sort("DataTarget")),\iter-star(layout()),label("statement",sort("Statement"))],sort("Statement"),attrs([term(cons("Insert"))]))
                expect(prod___lit_insert_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___73_110_115_101_114_116,
                new LiteralStackNode(2169, prod___char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_insert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2170, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110,115,101,114,116}),
		new ListStackNode(2171, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2172, "layout"), false),
		new NonTerminalStackNode(2174, "DataTarget"),
		new ListStackNode(2175, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2176, "layout"), false),
		new NonTerminalStackNode(2178, "Statement"));
            
                // prod([lit("append"),\iter-star(layout()),label("dataTarget",sort("DataTarget")),\iter-star(layout()),label("statement",prime(sort("Statement"),"prio",[1]))],sort("Statement"),attrs([term(cons("Append")),assoc(\non-assoc())]))
                expect(prod___lit_append_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_112_112_101_110_100_assoc__non_assoc,
                new LiteralStackNode(2179, prod___char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_append_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2180, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,112,112,101,110,100}),
		new ListStackNode(2181, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2182, "layout"), false),
		new NonTerminalStackNode(2184, "DataTarget"),
		new ListStackNode(2185, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2186, "layout"), false),
		new NonTerminalStackNode(2188, "Statement_prio__1"));
            
                // prod([label("functionDeclaration",sort("FunctionDeclaration"))],sort("Statement"),attrs([term(cons("FunctionDeclaration"))]))
                expect(prod___functionDeclaration_FunctionDeclaration_Statement_attrs___term__cons___70_117_110_99_116_105_111_110_68_101_99_108_97_114_97_116_105_111_110,
                new NonTerminalStackNode(2190, "FunctionDeclaration"));
            
                // prod([lit("assert"),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("Assert"))]))
                expect(prod___lit_assert_iter_star__layout_expression_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___65_115_115_101_114_116,
                new LiteralStackNode(2191, prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_assert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2192, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,115,115,101,114,116}),
		new ListStackNode(2193, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2194, "layout"), false),
		new NonTerminalStackNode(2196, "Expression"),
		new ListStackNode(2197, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2198, "layout"), false),
		new LiteralStackNode(2199, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("fail"),\iter-star(layout()),label("target",sort("Target")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("Fail"))]))
                expect(prod___lit_fail_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___70_97_105_108,
                new LiteralStackNode(2200, prod___char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_lit_fail_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2201, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,97,105,108}),
		new ListStackNode(2202, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2203, "layout"), false),
		new NonTerminalStackNode(2205, "Target"),
		new ListStackNode(2206, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2207, "layout"), false),
		new LiteralStackNode(2208, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("throw"),\iter-star(layout()),label("statement",prime(sort("Statement"),"prio",[1]))],sort("Statement"),attrs([term(cons("Throw")),assoc(\non-assoc())]))
                expect(prod___lit_throw_iter_star__layout_statement_Statement_Statement_attrs___term__cons___84_104_114_111_119_assoc__non_assoc,
                new LiteralStackNode(2209, prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_lit_throw_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2210, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,104,114,111,119}),
		new ListStackNode(2211, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2212, "layout"), false),
		new NonTerminalStackNode(2214, "Statement_prio__1"));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("if"),\iter-star(layout()),lit("("),\iter-star(layout()),label("conditions",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),label("thenStatement",sort("Statement")),\iter-star(layout()),label("noElseMayFollow",sort("NoElseMayFollow"))],sort("Statement"),attrs([term(cons("IfThen"))]))
                expect(prod___label_Label_iter_star__layout_lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_thenStatement_Statement_iter_star__layout_noElseMayFollow_NoElseMayFollow_Statement_attrs___term__cons___73_102_84_104_101_110,
                new NonTerminalStackNode(2216, "Label"),
		new ListStackNode(2217, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2218, "layout"), false),
		new LiteralStackNode(2219, prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2220, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,102}),
		new ListStackNode(2221, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2222, "layout"), false),
		new LiteralStackNode(2223, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2224, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2225, "layout"), false),
		new SeparatedListStackNode(2227, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2228, "Expression"), new AbstractStackNode[]{new ListStackNode(2229, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2230, "layout"), false),
		new LiteralStackNode(2231, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2232, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2233, "layout"), false)}, true),
		new ListStackNode(2234, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2235, "layout"), false),
		new LiteralStackNode(2236, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2237, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2238, "layout"), false),
		new NonTerminalStackNode(2240, "Statement"),
		new ListStackNode(2241, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2242, "layout"), false),
		new NonTerminalStackNode(2244, "NoElseMayFollow"));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("switch"),\iter-star(layout()),lit("("),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),lit(")"),\iter-star(layout()),lit("{"),\iter-star(layout()),label("cases",\iter-seps(sort("Case"),[\iter-star(layout())])),\iter-star(layout()),lit("}")],sort("Statement"),attrs([term(cons("Switch"))]))
                expect(prod___label_Label_iter_star__layout_lit_switch_iter_star__layout_lit___40_iter_star__layout_expression_Expression_iter_star__layout_lit___41_iter_star__layout_lit___123_iter_star__layout_cases_iter_seps__Case__iter_star__layout_iter_star__layout_lit___125_Statement_attrs___term__cons___83_119_105_116_99_104,
                new NonTerminalStackNode(2246, "Label"),
		new ListStackNode(2247, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2248, "layout"), false),
		new LiteralStackNode(2249, prod___char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_lit_switch_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2250, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,119,105,116,99,104}),
		new ListStackNode(2251, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2252, "layout"), false),
		new LiteralStackNode(2253, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2254, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2255, "layout"), false),
		new NonTerminalStackNode(2257, "Expression"),
		new ListStackNode(2258, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2259, "layout"), false),
		new LiteralStackNode(2260, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2261, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2262, "layout"), false),
		new LiteralStackNode(2263, prod___char_class___range__123_123_lit___123_attrs___term__literal, new char[] {123}),
		new ListStackNode(2264, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2265, "layout"), false),
		new SeparatedListStackNode(2267, regular__iter_seps__Case__iter_star__layout_no_attrs, new NonTerminalStackNode(2268, "Case"), new AbstractStackNode[]{new ListStackNode(2269, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2270, "layout"), false)}, true),
		new ListStackNode(2271, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2272, "layout"), false),
		new LiteralStackNode(2273, prod___char_class___range__125_125_lit___125_attrs___term__literal, new char[] {125}));
            
                // prod([label("assignable",sort("Assignable")),\iter-star(layout()),label("operator",sort("Assignment")),\iter-star(layout()),label("statement",sort("Statement"))],sort("Statement"),attrs([term(cons("Assignment"))]))
                expect(prod___assignable_Assignable_iter_star__layout_operator_Assignment_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_115_115_105_103_110_109_101_110_116,
                new NonTerminalStackNode(2275, "Assignable"),
		new ListStackNode(2276, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2277, "layout"), false),
		new NonTerminalStackNode(2279, "Assignment"),
		new ListStackNode(2280, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2281, "layout"), false),
		new NonTerminalStackNode(2283, "Statement"));
            
                // prod([lit("return"),\iter-star(layout()),label("statement",sort("Statement"))],sort("Statement"),attrs([term(cons("Return"))]))
                expect(prod___lit_return_iter_star__layout_statement_Statement_Statement_attrs___term__cons___82_101_116_117_114_110,
                new LiteralStackNode(2284, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_lit_return_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2285, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,116,117,114,110}),
		new ListStackNode(2286, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2287, "layout"), false),
		new NonTerminalStackNode(2289, "Statement"));
            
                // prod([lit("try"),\iter-star(layout()),label("body",sort("Statement")),\iter-star(layout()),label("handlers",\iter-seps(sort("Catch"),[\iter-star(layout())]))],sort("Statement"),attrs([term(cons("Try")),assoc(\non-assoc())]))
                expect(prod___lit_try_iter_star__layout_body_Statement_iter_star__layout_handlers_iter_seps__Catch__iter_star__layout_Statement_attrs___term__cons___84_114_121_assoc__non_assoc,
                new LiteralStackNode(2290, prod___char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_lit_try_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2291, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,114,121}),
		new ListStackNode(2292, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2293, "layout"), false),
		new NonTerminalStackNode(2295, "Statement"),
		new ListStackNode(2296, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2297, "layout"), false),
		new SeparatedListStackNode(2299, regular__iter_seps__Catch__iter_star__layout_no_attrs, new NonTerminalStackNode(2300, "Catch"), new AbstractStackNode[]{new ListStackNode(2301, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2302, "layout"), false)}, true));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("for"),\iter-star(layout()),lit("("),\iter-star(layout()),label("generators",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),label("body",sort("Statement"))],sort("Statement"),attrs([term(cons("For"))]))
                expect(prod___label_Label_iter_star__layout_lit_for_iter_star__layout_lit___40_iter_star__layout_generators_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___70_111_114,
                new NonTerminalStackNode(2304, "Label"),
		new ListStackNode(2305, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2306, "layout"), false),
		new LiteralStackNode(2307, prod___char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_lit_for_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2308, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,111,114}),
		new ListStackNode(2309, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2310, "layout"), false),
		new LiteralStackNode(2311, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2312, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2313, "layout"), false),
		new SeparatedListStackNode(2315, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2316, "Expression"), new AbstractStackNode[]{new ListStackNode(2317, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2318, "layout"), false),
		new LiteralStackNode(2319, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2320, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2321, "layout"), false)}, true),
		new ListStackNode(2322, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2323, "layout"), false),
		new LiteralStackNode(2324, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2325, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2326, "layout"), false),
		new NonTerminalStackNode(2328, "Statement"));
            
                // prod([lit("return"),\iter-star(layout()),label("statement",prime(sort("Statement"),"prio",[1]))],sort("Statement"),attrs([term(cons("Return")),assoc(\non-assoc())]))
                expect(prod___lit_return_iter_star__layout_statement_Statement_Statement_attrs___term__cons___82_101_116_117_114_110_assoc__non_assoc,
                new LiteralStackNode(2329, prod___char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_lit_return_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2330, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,101,116,117,114,110}),
		new ListStackNode(2331, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2332, "layout"), false),
		new NonTerminalStackNode(2334, "Statement_prio__1"));
            
                // prod([lit("throw"),\iter-star(layout()),label("statement",sort("Statement"))],sort("Statement"),attrs([term(cons("Throw"))]))
                expect(prod___lit_throw_iter_star__layout_statement_Statement_Statement_attrs___term__cons___84_104_114_111_119,
                new LiteralStackNode(2335, prod___char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_lit_throw_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2336, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,104,114,111,119}),
		new ListStackNode(2337, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2338, "layout"), false),
		new NonTerminalStackNode(2340, "Statement"));
            
                // prod([lit("try"),\iter-star(layout()),label("body",sort("Statement")),\iter-star(layout()),label("handlers",\iter-seps(sort("Catch"),[\iter-star(layout())])),\iter-star(layout()),lit("finally"),\iter-star(layout()),label("finallyBody",sort("Statement"))],sort("Statement"),attrs([term(cons("TryFinally"))]))
                expect(prod___lit_try_iter_star__layout_body_Statement_iter_star__layout_handlers_iter_seps__Catch__iter_star__layout_iter_star__layout_lit_finally_iter_star__layout_finallyBody_Statement_Statement_attrs___term__cons___84_114_121_70_105_110_97_108_108_121,
                new LiteralStackNode(2341, prod___char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_lit_try_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2342, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,114,121}),
		new ListStackNode(2343, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2344, "layout"), false),
		new NonTerminalStackNode(2346, "Statement"),
		new ListStackNode(2347, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2348, "layout"), false),
		new SeparatedListStackNode(2350, regular__iter_seps__Catch__iter_star__layout_no_attrs, new NonTerminalStackNode(2351, "Catch"), new AbstractStackNode[]{new ListStackNode(2352, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2353, "layout"), false)}, true),
		new ListStackNode(2354, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2355, "layout"), false),
		new LiteralStackNode(2356, prod___char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_lit_finally_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2357, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {102,105,110,97,108,108,121}),
		new ListStackNode(2358, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2359, "layout"), false),
		new NonTerminalStackNode(2361, "Statement"));
            
                // prod([label("assignable",sort("Assignable")),\iter-star(layout()),label("operator",sort("Assignment")),\iter-star(layout()),label("statement",prime(sort("Statement"),"prio",[1]))],sort("Statement"),attrs([term(cons("Assignment"))]))
                expect(prod___assignable_Assignable_iter_star__layout_operator_Assignment_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_115_115_105_103_110_109_101_110_116,
                new NonTerminalStackNode(2363, "Assignable"),
		new ListStackNode(2364, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2365, "layout"), false),
		new NonTerminalStackNode(2367, "Assignment"),
		new ListStackNode(2368, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2369, "layout"), false),
		new NonTerminalStackNode(2371, "Statement_prio__1"));
            
                // prod([lit(";")],sort("Statement"),attrs([term(cons("EmptyStatement"))]))
                expect(prod___lit___59_Statement_attrs___term__cons___69_109_112_116_121_83_116_97_116_101_109_101_110_116,
                new LiteralStackNode(2372, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("assert"),\iter-star(layout()),label("expression",sort("Expression")),\iter-star(layout()),lit(":"),\iter-star(layout()),label("message",sort("Expression")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("AssertWithMessage"))]))
                expect(prod___lit_assert_iter_star__layout_expression_Expression_iter_star__layout_lit___58_iter_star__layout_message_Expression_iter_star__layout_lit___59_Statement_attrs___term__cons___65_115_115_101_114_116_87_105_116_104_77_101_115_115_97_103_101,
                new LiteralStackNode(2373, prod___char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_assert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2374, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,115,115,101,114,116}),
		new ListStackNode(2375, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2376, "layout"), false),
		new NonTerminalStackNode(2378, "Expression"),
		new ListStackNode(2379, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2380, "layout"), false),
		new LiteralStackNode(2381, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2382, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(2383, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2384, "layout"), false),
		new NonTerminalStackNode(2386, "Expression"),
		new ListStackNode(2387, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2388, "layout"), false),
		new LiteralStackNode(2389, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("do"),\iter-star(layout()),label("body",sort("Statement")),\iter-star(layout()),lit("while"),\iter-star(layout()),lit("("),\iter-star(layout()),label("condition",sort("Expression")),\iter-star(layout()),lit(")"),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("DoWhile"))]))
                expect(prod___label_Label_iter_star__layout_lit_do_iter_star__layout_body_Statement_iter_star__layout_lit_while_iter_star__layout_lit___40_iter_star__layout_condition_Expression_iter_star__layout_lit___41_iter_star__layout_lit___59_Statement_attrs___term__cons___68_111_87_104_105_108_101,
                new NonTerminalStackNode(2391, "Label"),
		new ListStackNode(2392, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2393, "layout"), false),
		new LiteralStackNode(2394, prod___char_class___range__100_100_char_class___range__111_111_lit_do_attrs___term__literal, new char[] {100,111}),
		new ListStackNode(2395, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2396, "layout"), false),
		new NonTerminalStackNode(2398, "Statement"),
		new ListStackNode(2399, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2400, "layout"), false),
		new LiteralStackNode(2401, prod___char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_lit_while_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2402, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {119,104,105,108,101}),
		new ListStackNode(2403, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2404, "layout"), false),
		new LiteralStackNode(2405, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2406, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2407, "layout"), false),
		new NonTerminalStackNode(2409, "Expression"),
		new ListStackNode(2410, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2411, "layout"), false),
		new LiteralStackNode(2412, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2413, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2414, "layout"), false),
		new LiteralStackNode(2415, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("append"),\iter-star(layout()),label("dataTarget",sort("DataTarget")),\iter-star(layout()),label("statement",sort("Statement"))],sort("Statement"),attrs([term(cons("Append"))]))
                expect(prod___lit_append_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___65_112_112_101_110_100,
                new LiteralStackNode(2416, prod___char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_lit_append_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2417, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,112,112,101,110,100}),
		new ListStackNode(2418, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2419, "layout"), false),
		new NonTerminalStackNode(2421, "DataTarget"),
		new ListStackNode(2422, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2423, "layout"), false),
		new NonTerminalStackNode(2425, "Statement"));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),lit("if"),\iter-star(layout()),lit("("),\iter-star(layout()),label("conditions",\iter-seps(sort("Expression"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")"),\iter-star(layout()),label("thenStatement",sort("Statement")),\iter-star(layout()),lit("else"),\iter-star(layout()),label("elseStatement",sort("Statement"))],sort("Statement"),attrs([term(cons("IfThenElse"))]))
                expect(prod___label_Label_iter_star__layout_lit_if_iter_star__layout_lit___40_iter_star__layout_conditions_iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_iter_star__layout_thenStatement_Statement_iter_star__layout_lit_else_iter_star__layout_elseStatement_Statement_Statement_attrs___term__cons___73_102_84_104_101_110_69_108_115_101,
                new NonTerminalStackNode(2427, "Label"),
		new ListStackNode(2428, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2429, "layout"), false),
		new LiteralStackNode(2430, prod___char_class___range__105_105_char_class___range__102_102_lit_if_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2431, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,102}),
		new ListStackNode(2432, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2433, "layout"), false),
		new LiteralStackNode(2434, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2435, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2436, "layout"), false),
		new SeparatedListStackNode(2438, regular__iter_seps__Expression__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2439, "Expression"), new AbstractStackNode[]{new ListStackNode(2440, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2441, "layout"), false),
		new LiteralStackNode(2442, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2443, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2444, "layout"), false)}, true),
		new ListStackNode(2445, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2446, "layout"), false),
		new LiteralStackNode(2447, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2448, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2449, "layout"), false),
		new NonTerminalStackNode(2451, "Statement"),
		new ListStackNode(2452, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2453, "layout"), false),
		new LiteralStackNode(2454, prod___char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_lit_else_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2455, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {101,108,115,101}),
		new ListStackNode(2456, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2457, "layout"), false),
		new NonTerminalStackNode(2459, "Statement"));
            
                // prod([label("label",sort("Label")),\iter-star(layout()),label("visit",sort("Visit"))],sort("Statement"),attrs([term(cons("Visit"))]))
                expect(prod___label_Label_iter_star__layout_visit_Visit_Statement_attrs___term__cons___86_105_115_105_116,
                new NonTerminalStackNode(2461, "Label"),
		new ListStackNode(2462, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2463, "layout"), false),
		new NonTerminalStackNode(2465, "Visit"));
            
                // prod([lit("solve"),\iter-star(layout()),lit("("),\iter-star(layout()),label("variables",\iter-seps(sort("QualifiedName"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),label("bound",sort("Bound")),\iter-star(layout()),lit(")"),\iter-star(layout()),label("body",sort("Statement"))],sort("Statement"),attrs([term(cons("Solve"))]))
                expect(prod___lit_solve_iter_star__layout_lit___40_iter_star__layout_variables_iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_bound_Bound_iter_star__layout_lit___41_iter_star__layout_body_Statement_Statement_attrs___term__cons___83_111_108_118_101,
                new LiteralStackNode(2466, prod___char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_lit_solve_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2467, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {115,111,108,118,101}),
		new ListStackNode(2468, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2469, "layout"), false),
		new LiteralStackNode(2470, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2471, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2472, "layout"), false),
		new SeparatedListStackNode(2474, regular__iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2475, "QualifiedName"), new AbstractStackNode[]{new ListStackNode(2476, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2477, "layout"), false),
		new LiteralStackNode(2478, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2479, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2480, "layout"), false)}, true),
		new ListStackNode(2481, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2482, "layout"), false),
		new NonTerminalStackNode(2484, "Bound"),
		new ListStackNode(2485, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2486, "layout"), false),
		new LiteralStackNode(2487, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}),
		new ListStackNode(2488, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2489, "layout"), false),
		new NonTerminalStackNode(2491, "Statement"));
            
                // prod([label("declaration",sort("LocalVariableDeclaration")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("VariableDeclaration"))]))
                expect(prod___declaration_LocalVariableDeclaration_iter_star__layout_lit___59_Statement_attrs___term__cons___86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110,
                new NonTerminalStackNode(2493, "LocalVariableDeclaration"),
		new ListStackNode(2494, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2495, "layout"), false),
		new LiteralStackNode(2496, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("break"),\iter-star(layout()),label("target",sort("Target")),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("Break"))]))
                expect(prod___lit_break_iter_star__layout_target_Target_iter_star__layout_lit___59_Statement_attrs___term__cons___66_114_101_97_107,
                new LiteralStackNode(2497, prod___char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_lit_break_attrs___term__literal, new char[] {98,114,101,97,107}),
		new ListStackNode(2498, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2499, "layout"), false),
		new NonTerminalStackNode(2501, "Target"),
		new ListStackNode(2502, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2503, "layout"), false),
		new LiteralStackNode(2504, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([lit("insert"),\iter-star(layout()),label("dataTarget",sort("DataTarget")),\iter-star(layout()),label("statement",prime(sort("Statement"),"prio",[1]))],sort("Statement"),attrs([term(cons("Insert")),assoc(\non-assoc())]))
                expect(prod___lit_insert_iter_star__layout_dataTarget_DataTarget_iter_star__layout_statement_Statement_Statement_attrs___term__cons___73_110_115_101_114_116_assoc__non_assoc,
                new LiteralStackNode(2505, prod___char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_lit_insert_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2506, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {105,110,115,101,114,116}),
		new ListStackNode(2507, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2508, "layout"), false),
		new NonTerminalStackNode(2510, "DataTarget"),
		new ListStackNode(2511, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2512, "layout"), false),
		new NonTerminalStackNode(2514, "Statement_prio__1"));
            
                // prod([lit("global"),\iter-star(layout()),label("type",sort("Type")),\iter-star(layout()),label("names",\iter-seps(sort("QualifiedName"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(";")],sort("Statement"),attrs([term(cons("GlobalDirective"))]))
                expect(prod___lit_global_iter_star__layout_type_Type_iter_star__layout_names_iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Statement_attrs___term__cons___71_108_111_98_97_108_68_105_114_101_99_116_105_118_101,
                new LiteralStackNode(2515, prod___char_class___range__103_103_char_class___range__108_108_char_class___range__111_111_char_class___range__98_98_char_class___range__97_97_char_class___range__108_108_lit_global_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2516, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {103,108,111,98,97,108}),
		new ListStackNode(2517, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2518, "layout"), false),
		new NonTerminalStackNode(2520, "Type"),
		new ListStackNode(2521, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2522, "layout"), false),
		new SeparatedListStackNode(2524, regular__iter_seps__QualifiedName__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2525, "QualifiedName"), new AbstractStackNode[]{new ListStackNode(2526, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2527, "layout"), false),
		new LiteralStackNode(2528, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2529, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2530, "layout"), false)}, true),
		new ListStackNode(2531, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2532, "layout"), false),
		new LiteralStackNode(2533, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
              
        }
    
        public void FunctionType(){
            
                // prod([label("type",sort("Type")),\iter-star(layout()),lit("("),\iter-star(layout()),label("arguments",\iter-star-seps(sort("TypeArg"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(")")],sort("FunctionType"),attrs([term(cons("TypeArguments"))]))
                expect(prod___type_Type_iter_star__layout_lit___40_iter_star__layout_arguments_iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___41_FunctionType_attrs___term__cons___84_121_112_101_65_114_103_117_109_101_110_116_115,
                new NonTerminalStackNode(2535, "Type"),
		new ListStackNode(2536, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2537, "layout"), false),
		new LiteralStackNode(2538, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2539, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2540, "layout"), false),
		new SeparatedListStackNode(2542, regular__iter_star_seps__TypeArg__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2543, "TypeArg"), new AbstractStackNode[]{new ListStackNode(2544, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2545, "layout"), false),
		new LiteralStackNode(2546, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2547, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2548, "layout"), false)}, false),
		new ListStackNode(2549, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2550, "layout"), false),
		new LiteralStackNode(2551, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
              
        }
    
        public void Bound(){
            
                // prod([],sort("Bound"),attrs([term(cons("Empty"))]))
                expect(prod___Bound_attrs___term__cons___69_109_112_116_121,
                new EpsilonStackNode(2552));
            
                // prod([lit(";"),\iter-star(layout()),label("expression",sort("Expression"))],sort("Bound"),attrs([term(cons("Default"))]))
                expect(prod___lit___59_iter_star__layout_expression_Expression_Bound_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(2553, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}),
		new ListStackNode(2554, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2555, "layout"), false),
		new NonTerminalStackNode(2557, "Expression"));
              
        }
    
        public void Type(){
            
                // prod([label("user",sort("UserType"))],sort("Type"),attrs([term(cons("User"))]))
                expect(prod___user_UserType_Type_attrs___term__cons___85_115_101_114,
                new NonTerminalStackNode(2559, "UserType"));
            
                // prod([label("function",sort("FunctionType"))],sort("Type"),attrs([term(cons("Function"))]))
                expect(prod___function_FunctionType_Type_attrs___term__cons___70_117_110_99_116_105_111_110,
                new NonTerminalStackNode(2561, "FunctionType"));
            
                // prod([label("basic",sort("BasicType"))],sort("Type"),attrs([term(cons("Basic"))]))
                expect(prod___basic_BasicType_Type_attrs___term__cons___66_97_115_105_99,
                new NonTerminalStackNode(2563, "BasicType"));
            
                // prod([label("structured",sort("StructuredType"))],sort("Type"),attrs([term(cons("Structured"))]))
                expect(prod___structured_StructuredType_Type_attrs___term__cons___83_116_114_117_99_116_117_114_101_100,
                new NonTerminalStackNode(2565, "StructuredType"));
            
                // prod([lit("("),\iter-star(layout()),label("type",sort("Type")),\iter-star(layout()),lit(")")],sort("Type"),attrs([term(cons("Bracket")),bracket()]))
                expect(prod___lit___40_iter_star__layout_type_Type_iter_star__layout_lit___41_Type_attrs___term__cons___66_114_97_99_107_101_116_bracket,
                new LiteralStackNode(2566, prod___char_class___range__40_40_lit___40_attrs___term__literal, new char[] {40}),
		new ListStackNode(2567, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2568, "layout"), false),
		new NonTerminalStackNode(2570, "Type"),
		new ListStackNode(2571, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2572, "layout"), false),
		new LiteralStackNode(2573, prod___char_class___range__41_41_lit___41_attrs___term__literal, new char[] {41}));
            
                // prod([label("typeVar",sort("TypeVar"))],sort("Type"),attrs([term(cons("Variable"))]))
                expect(prod___typeVar_TypeVar_Type_attrs___term__cons___86_97_114_105_97_98_108_101,
                new NonTerminalStackNode(2575, "TypeVar"));
            
                // prod([label("selector",sort("DataTypeSelector"))],sort("Type"),attrs([term(cons("Selector"))]))
                expect(prod___selector_DataTypeSelector_Type_attrs___term__cons___83_101_108_101_99_116_111_114,
                new NonTerminalStackNode(2577, "DataTypeSelector"));
              
        }
    
        public void Declaration(){
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("data"),\iter-star(layout()),label("user",sort("UserType")),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("DataAbstract"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_data_iter_star__layout_user_UserType_iter_star__layout_lit___59_Declaration_attrs___term__cons___68_97_116_97_65_98_115_116_114_97_99_116,
                new NonTerminalStackNode(2579, "Tags"),
		new ListStackNode(2580, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2581, "layout"), false),
		new NonTerminalStackNode(2583, "Visibility"),
		new ListStackNode(2584, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2585, "layout"), false),
		new LiteralStackNode(2586, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_lit_data_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2587, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,97}),
		new ListStackNode(2588, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2589, "layout"), false),
		new NonTerminalStackNode(2591, "UserType"),
		new ListStackNode(2592, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2593, "layout"), false),
		new LiteralStackNode(2594, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("alias"),\iter-star(layout()),label("user",sort("UserType")),\iter-star(layout()),lit("="),\iter-star(layout()),label("base",sort("Type")),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Alias"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_alias_iter_star__layout_user_UserType_iter_star__layout_lit___61_iter_star__layout_base_Type_iter_star__layout_lit___59_Declaration_attrs___term__cons___65_108_105_97_115,
                new NonTerminalStackNode(2596, "Tags"),
		new ListStackNode(2597, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2598, "layout"), false),
		new NonTerminalStackNode(2600, "Visibility"),
		new ListStackNode(2601, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2602, "layout"), false),
		new LiteralStackNode(2603, prod___char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_lit_alias_attrs___term__literal, new char[] {97,108,105,97,115}),
		new ListStackNode(2604, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2605, "layout"), false),
		new NonTerminalStackNode(2607, "UserType"),
		new ListStackNode(2608, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2609, "layout"), false),
		new LiteralStackNode(2610, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2611, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(2612, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2613, "layout"), false),
		new NonTerminalStackNode(2615, "Type"),
		new ListStackNode(2616, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2617, "layout"), false),
		new LiteralStackNode(2618, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("tag"),\iter-star(layout()),label("kind",sort("Kind")),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),lit("on"),\iter-star(layout()),label("types",\iter-seps(sort("Type"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Tag"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_tag_iter_star__layout_kind_Kind_iter_star__layout_name_Name_iter_star__layout_lit_on_iter_star__layout_types_iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___84_97_103,
                new NonTerminalStackNode(2620, "Tags"),
		new ListStackNode(2621, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2622, "layout"), false),
		new NonTerminalStackNode(2624, "Visibility"),
		new ListStackNode(2625, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2626, "layout"), false),
		new LiteralStackNode(2627, prod___char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_lit_tag_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2628, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {116,97,103}),
		new ListStackNode(2629, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2630, "layout"), false),
		new NonTerminalStackNode(2632, "Kind"),
		new ListStackNode(2633, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2634, "layout"), false),
		new NonTerminalStackNode(2636, "Name"),
		new ListStackNode(2637, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2638, "layout"), false),
		new LiteralStackNode(2639, prod___char_class___range__111_111_char_class___range__110_110_lit_on_attrs___term__literal, new char[] {111,110}),
		new ListStackNode(2640, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2641, "layout"), false),
		new SeparatedListStackNode(2643, regular__iter_seps__Type__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2644, "Type"), new AbstractStackNode[]{new ListStackNode(2645, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2646, "layout"), false),
		new LiteralStackNode(2647, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2648, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2649, "layout"), false)}, true),
		new ListStackNode(2650, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2651, "layout"), false),
		new LiteralStackNode(2652, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("functionDeclaration",sort("FunctionDeclaration"))],sort("Declaration"),attrs([term(cons("Function"))]))
                expect(prod___functionDeclaration_FunctionDeclaration_Declaration_attrs___term__cons___70_117_110_99_116_105_111_110,
                new NonTerminalStackNode(2654, "FunctionDeclaration"));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("data"),\iter-star(layout()),label("user",sort("UserType")),\iter-star(layout()),lit("="),\iter-star(layout()),label("variants",\iter-seps(sort("Variant"),[\iter-star(layout()),lit("|"),\iter-star(layout())])),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Data"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_data_iter_star__layout_user_UserType_iter_star__layout_lit___61_iter_star__layout_variants_iter_seps__Variant__iter_star__layout_lit___124_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___68_97_116_97,
                new NonTerminalStackNode(2656, "Tags"),
		new ListStackNode(2657, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2658, "layout"), false),
		new NonTerminalStackNode(2660, "Visibility"),
		new ListStackNode(2661, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2662, "layout"), false),
		new LiteralStackNode(2663, prod___char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_lit_data_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2664, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {100,97,116,97}),
		new ListStackNode(2665, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2666, "layout"), false),
		new NonTerminalStackNode(2668, "UserType"),
		new ListStackNode(2669, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2670, "layout"), false),
		new LiteralStackNode(2671, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2672, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(2673, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2674, "layout"), false),
		new SeparatedListStackNode(2676, regular__iter_seps__Variant__iter_star__layout_lit___124_iter_star__layout_no_attrs, new NonTerminalStackNode(2677, "Variant"), new AbstractStackNode[]{new ListStackNode(2678, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2679, "layout"), false),
		new LiteralStackNode(2680, prod___char_class___range__124_124_lit___124_attrs___term__literal, new char[] {124}),
		new ListStackNode(2681, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2682, "layout"), false)}, true),
		new ListStackNode(2683, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2684, "layout"), false),
		new LiteralStackNode(2685, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("view"),\iter-star(layout()),label("view",sort("Name")),\iter-star(layout()),lit("\<:"),\iter-star(layout()),label("superType",sort("Name")),\iter-star(layout()),lit("="),\iter-star(layout()),label("alts",\iter-seps(sort("Alternative"),[\iter-star(layout()),lit("|"),\iter-star(layout())])),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("View"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_view_iter_star__layout_view_Name_iter_star__layout_lit___60_58_iter_star__layout_superType_Name_iter_star__layout_lit___61_iter_star__layout_alts_iter_seps__Alternative__iter_star__layout_lit___124_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___86_105_101_119,
                new NonTerminalStackNode(2687, "Tags"),
		new ListStackNode(2688, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2689, "layout"), false),
		new NonTerminalStackNode(2691, "Visibility"),
		new ListStackNode(2692, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2693, "layout"), false),
		new LiteralStackNode(2694, prod___char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_lit_view_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2695, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {118,105,101,119}),
		new ListStackNode(2696, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2697, "layout"), false),
		new NonTerminalStackNode(2699, "Name"),
		new ListStackNode(2700, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2701, "layout"), false),
		new LiteralStackNode(2702, prod___char_class___range__60_60_char_class___range__58_58_lit___60_58_attrs___term__literal, new char[] {60,58}),
		new ListStackNode(2703, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2704, "layout"), false),
		new NonTerminalStackNode(2706, "Name"),
		new ListStackNode(2707, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2708, "layout"), false),
		new LiteralStackNode(2709, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2710, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(2711, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2712, "layout"), false),
		new SeparatedListStackNode(2714, regular__iter_seps__Alternative__iter_star__layout_lit___124_iter_star__layout_no_attrs, new NonTerminalStackNode(2715, "Alternative"), new AbstractStackNode[]{new ListStackNode(2716, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2717, "layout"), false),
		new LiteralStackNode(2718, prod___char_class___range__124_124_lit___124_attrs___term__literal, new char[] {124}),
		new ListStackNode(2719, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2720, "layout"), false)}, true),
		new ListStackNode(2721, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2722, "layout"), false),
		new LiteralStackNode(2723, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),lit("rule"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),label("patternAction",sort("PatternWithAction")),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Rule"))]))
                expect(prod___tags_Tags_iter_star__layout_lit_rule_iter_star__layout_name_Name_iter_star__layout_patternAction_PatternWithAction_iter_star__layout_lit___59_Declaration_attrs___term__cons___82_117_108_101,
                new NonTerminalStackNode(2725, "Tags"),
		new ListStackNode(2726, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2727, "layout"), false),
		new LiteralStackNode(2728, prod___char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_lit_rule_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2729, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {114,117,108,101}),
		new ListStackNode(2730, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2731, "layout"), false),
		new NonTerminalStackNode(2733, "Name"),
		new ListStackNode(2734, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2735, "layout"), false),
		new NonTerminalStackNode(2737, "PatternWithAction"),
		new ListStackNode(2738, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2739, "layout"), false),
		new LiteralStackNode(2740, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),label("type",sort("Type")),\iter-star(layout()),label("variables",\iter-seps(sort("Variable"),[\iter-star(layout()),lit(","),\iter-star(layout())])),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Variable"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_type_Type_iter_star__layout_variables_iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_iter_star__layout_lit___59_Declaration_attrs___term__cons___86_97_114_105_97_98_108_101,
                new NonTerminalStackNode(2742, "Tags"),
		new ListStackNode(2743, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2744, "layout"), false),
		new NonTerminalStackNode(2746, "Visibility"),
		new ListStackNode(2747, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2748, "layout"), false),
		new NonTerminalStackNode(2750, "Type"),
		new ListStackNode(2751, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2752, "layout"), false),
		new SeparatedListStackNode(2754, regular__iter_seps__Variable__iter_star__layout_lit___44_iter_star__layout_no_attrs, new NonTerminalStackNode(2755, "Variable"), new AbstractStackNode[]{new ListStackNode(2756, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2757, "layout"), false),
		new LiteralStackNode(2758, prod___char_class___range__44_44_lit___44_attrs___term__literal, new IReducableStackNode[] {}, new char[] {44}),
		new ListStackNode(2759, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2760, "layout"), false)}, true),
		new ListStackNode(2761, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2762, "layout"), false),
		new LiteralStackNode(2763, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("test",sort("Test")),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Test"))]))
                expect(prod___test_Test_iter_star__layout_lit___59_Declaration_attrs___term__cons___84_101_115_116,
                new NonTerminalStackNode(2765, "Test"),
		new ListStackNode(2766, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2767, "layout"), false),
		new LiteralStackNode(2768, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
            
                // prod([label("tags",sort("Tags")),\iter-star(layout()),label("visibility",sort("Visibility")),\iter-star(layout()),lit("anno"),\iter-star(layout()),label("annoType",sort("Type")),\iter-star(layout()),label("onType",sort("Type")),\iter-star(layout()),lit("@"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),lit(";")],sort("Declaration"),attrs([term(cons("Annotation"))]))
                expect(prod___tags_Tags_iter_star__layout_visibility_Visibility_iter_star__layout_lit_anno_iter_star__layout_annoType_Type_iter_star__layout_onType_Type_iter_star__layout_lit___64_iter_star__layout_name_Name_iter_star__layout_lit___59_Declaration_attrs___term__cons___65_110_110_111_116_97_116_105_111_110,
                new NonTerminalStackNode(2770, "Tags"),
		new ListStackNode(2771, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2772, "layout"), false),
		new NonTerminalStackNode(2774, "Visibility"),
		new ListStackNode(2775, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2776, "layout"), false),
		new LiteralStackNode(2777, prod___char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_lit_anno_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2778, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})}, new char[] {97,110,110,111}),
		new ListStackNode(2779, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2780, "layout"), false),
		new NonTerminalStackNode(2782, "Type"),
		new ListStackNode(2783, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2784, "layout"), false),
		new NonTerminalStackNode(2786, "Type"),
		new ListStackNode(2787, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2788, "layout"), false),
		new LiteralStackNode(2789, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(2790, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2791, "layout"), false),
		new NonTerminalStackNode(2793, "Name"),
		new ListStackNode(2794, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2795, "layout"), false),
		new LiteralStackNode(2796, prod___char_class___range__59_59_lit___59_attrs___term__literal, new char[] {59}));
              
        }
    
        public void RegExpLiteral(){
            
                // prod([lit("/"),\iter-star(sort("RegExp")),lit("/"),sort("RegExpModifier")],sort("RegExpLiteral"),attrs([term(lex())]))
                expect(prod___lit___47_iter_star__RegExp_lit___47_RegExpModifier_RegExpLiteral_attrs___term__lex,
                new LiteralStackNode(2797, prod___char_class___range__47_47_lit___47_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2798, new char[][]{{61,61}})}, new char[] {47}),
		new ListStackNode(2799, regular__iter_star__RegExp_no_attrs, new NonTerminalStackNode(2800, "RegExp"), false),
		new LiteralStackNode(2801, prod___char_class___range__47_47_lit___47_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2802, new char[][]{{61,61}})}, new char[] {47}),
		new NonTerminalStackNode(2803, "RegExpModifier"));
              
        }
    
        public void FunctionModifiers(){
            
                // prod([label("modifiers",\iter-star-seps(sort("FunctionModifier"),[\iter-star(layout())]))],sort("FunctionModifiers"),attrs([term(cons("List"))]))
                expect(prod___modifiers_iter_star_seps__FunctionModifier__iter_star__layout_FunctionModifiers_attrs___term__cons___76_105_115_116,
                new SeparatedListStackNode(2805, regular__iter_star_seps__FunctionModifier__iter_star__layout_no_attrs, new NonTerminalStackNode(2806, "FunctionModifier"), new AbstractStackNode[]{new ListStackNode(2807, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2808, "layout"), false)}, false));
              
        }
    
        public void NamedRegExp(){
            
                // prod([sort("NamedBackslash")],sort("NamedRegExp"),attrs([term(lex())]))
                expect(prod___NamedBackslash_NamedRegExp_attrs___term__lex,
                new NonTerminalStackNode(2809, "NamedBackslash"));
            
                // prod([\char-class([range(92,92)]),\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],sort("NamedRegExp"),attrs([term(lex())]))
                expect(prod___char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_NamedRegExp_attrs___term__lex,
                new CharStackNode(2810, new char[][]{{92,92}}),
		new CharStackNode(2811, new char[][]{{47,47},{60,60},{62,62},{92,92}}));
            
                // prod([lit("\<"),sort("Name"),lit("\>")],sort("NamedRegExp"),attrs([term(lex())]))
                expect(prod___lit___60_Name_lit___62_NamedRegExp_attrs___term__lex,
                new LiteralStackNode(2812, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2813, new char[][]{{61,61}})}, new char[] {60}),
		new NonTerminalStackNode(2814, "Name"),
		new LiteralStackNode(2815, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2816, new char[][]{{61,61}})}, new char[] {62}));
            
                // prod([\char-class([range(48,59),range(61,61),range(63,91),range(93,117)])],sort("NamedRegExp"),attrs([term(lex())]))
                expect(prod___char_class___range__48_59_range__61_61_range__63_91_range__93_117_NamedRegExp_attrs___term__lex,
                new CharStackNode(2817, new char[][]{{48,59},{61,61},{63,91},{93,117}}));
              
        }
    
        public void Toplevel(){
            
                // prod([label("declaration",sort("Declaration"))],sort("Toplevel"),attrs([term(cons("GivenVisibility"))]))
                expect(prod___declaration_Declaration_Toplevel_attrs___term__cons___71_105_118_101_110_86_105_115_105_98_105_108_105_116_121,
                new NonTerminalStackNode(2819, "Declaration"));
              
        }
    
        public void PostStringChars(){
            
                // prod([\char-class([range(62,62)]),\iter-star(sort("StringCharacter")),\char-class([range(34,34)])],sort("PostStringChars"),attrs([term(lex())]))
                expect(prod___char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34_PostStringChars_attrs___term__lex,
                new CharStackNode(2820, new char[][]{{62,62}}),
		new ListStackNode(2821, regular__iter_star__StringCharacter_no_attrs, new NonTerminalStackNode(2822, "StringCharacter"), false),
		new CharStackNode(2823, new char[][]{{34,34}}));
              
        }
    
        public void HexIntegerLiteral() {
             
                // prod([\char-class([range(48,48)]),\char-class([range(88,88),range(120,120)]),iter(\char-class([range(48,57),range(65,70),range(97,102)]))],sort("HexIntegerLiteral"),attrs([term(lex())]))
                expect(prod___char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_HexIntegerLiteral_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2824, new char[][]{{48,57},{65,90},{95,95},{97,122}})},
                new CharStackNode(2825, new char[][]{{48,48}}),
		new CharStackNode(2826, new char[][]{{88,88},{120,120}}),
		new ListStackNode(2827, regular__iter__char_class___range__48_57_range__65_70_range__97_102_no_attrs, new CharStackNode(2828, new char[][]{{48,57},{65,70},{97,102}}), true));
                     
       }
    
        public void OctalEscapeSequence() {
             
                // prod([lit("\\"),\char-class([range(48,55)]),\char-class([range(48,55)])],sort("OctalEscapeSequence"),attrs([term(lex())]))
                expect(prod___lit___92_char_class___range__48_55_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2829, new char[][]{{48,55}})},
                new LiteralStackNode(2830, prod___char_class___range__92_92_lit___92_attrs___term__literal, new char[] {92}),
		new CharStackNode(2831, new char[][]{{48,55}}),
		new CharStackNode(2832, new char[][]{{48,55}}));
            
                // prod([lit("\\"),\char-class([range(48,55)])],sort("OctalEscapeSequence"),attrs([term(lex())]))
                expect(prod___lit___92_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2829, new char[][]{{48,55}})},
                new LiteralStackNode(2833, prod___char_class___range__92_92_lit___92_attrs___term__literal, new char[] {92}),
		new CharStackNode(2834, new char[][]{{48,55}}));
            
                // prod([lit("\\"),\char-class([range(48,51)]),\char-class([range(48,55)]),\char-class([range(48,55)])],sort("OctalEscapeSequence"),attrs([term(lex())]))
                expect(prod___lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_OctalEscapeSequence_attrs___term__lex, new IReducableStackNode[] {new CharStackNode(2829, new char[][]{{48,55}})},
                new LiteralStackNode(2835, prod___char_class___range__92_92_lit___92_attrs___term__literal, new char[] {92}),
		new CharStackNode(2836, new char[][]{{48,51}}),
		new CharStackNode(2837, new char[][]{{48,55}}),
		new CharStackNode(2838, new char[][]{{48,55}}));
                     
       }
    
        public void TypeVar(){
            
                // prod([lit("&"),\iter-star(layout()),label("name",sort("Name"))],sort("TypeVar"),attrs([term(cons("Free"))]))
                expect(prod___lit___38_iter_star__layout_name_Name_TypeVar_attrs___term__cons___70_114_101_101,
                new LiteralStackNode(2839, prod___char_class___range__38_38_lit___38_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2840, new char[][]{{38,38}})}, new char[] {38}),
		new ListStackNode(2841, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2842, "layout"), false),
		new NonTerminalStackNode(2844, "Name"));
            
                // prod([lit("&"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),lit("\<:"),\iter-star(layout()),label("bound",sort("Type"))],sort("TypeVar"),attrs([term(cons("Bounded"))]))
                expect(prod___lit___38_iter_star__layout_name_Name_iter_star__layout_lit___60_58_iter_star__layout_bound_Type_TypeVar_attrs___term__cons___66_111_117_110_100_101_100,
                new LiteralStackNode(2845, prod___char_class___range__38_38_lit___38_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2846, new char[][]{{38,38}})}, new char[] {38}),
		new ListStackNode(2847, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2848, "layout"), false),
		new NonTerminalStackNode(2850, "Name"),
		new ListStackNode(2851, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2852, "layout"), false),
		new LiteralStackNode(2853, prod___char_class___range__60_60_char_class___range__58_58_lit___60_58_attrs___term__literal, new char[] {60,58}),
		new ListStackNode(2854, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2855, "layout"), false),
		new NonTerminalStackNode(2857, "Type"));
              
        }
    
        public void PrePathChars(){
            
                // prod([sort("URLChars"),lit("\<")],sort("PrePathChars"),attrs([term(lex())]))
                expect(prod___URLChars_lit___60_PrePathChars_attrs___term__lex,
                new NonTerminalStackNode(2858, "URLChars"),
		new LiteralStackNode(2859, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2860, new char[][]{{61,61}})}, new char[] {60}));
              
        }
    
        public void MidPathChars(){
            
                // prod([lit("\>"),sort("URLChars"),lit("\<")],sort("MidPathChars"),attrs([term(lex())]))
                expect(prod___lit___62_URLChars_lit___60_MidPathChars_attrs___term__lex,
                new LiteralStackNode(2861, prod___char_class___range__62_62_lit___62_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2862, new char[][]{{61,61}})}, new char[] {62}),
		new NonTerminalStackNode(2863, "URLChars"),
		new LiteralStackNode(2864, prod___char_class___range__60_60_lit___60_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2865, new char[][]{{61,61}})}, new char[] {60}));
              
        }
    
        public void Tag(){
            
                // prod([lit("@"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),label("contents",sort("TagString"))],sort("Tag"),attrs([term(cons("Default"))]))
                expect(prod___lit___64_iter_star__layout_name_Name_iter_star__layout_contents_TagString_Tag_attrs___term__cons___68_101_102_97_117_108_116,
                new LiteralStackNode(2866, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(2867, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2868, "layout"), false),
		new NonTerminalStackNode(2870, "Name"),
		new ListStackNode(2871, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2872, "layout"), false),
		new NonTerminalStackNode(2874, "TagString"));
            
                // prod([lit("@"),\iter-star(layout()),label("name",sort("Name")),\iter-star(layout()),lit("="),\iter-star(layout()),label("expression",sort("Expression"))],sort("Tag"),attrs([term(cons("Expression"))]))
                expect(prod___lit___64_iter_star__layout_name_Name_iter_star__layout_lit___61_iter_star__layout_expression_Expression_Tag_attrs___term__cons___69_120_112_114_101_115_115_105_111_110,
                new LiteralStackNode(2875, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(2876, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2877, "layout"), false),
		new NonTerminalStackNode(2879, "Name"),
		new ListStackNode(2880, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2881, "layout"), false),
		new LiteralStackNode(2882, prod___char_class___range__61_61_lit___61_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2883, new char[][]{{61,61}})}, new char[] {61}),
		new ListStackNode(2884, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2885, "layout"), false),
		new NonTerminalStackNode(2887, "Expression"));
            
                // prod([lit("@"),\iter-star(layout()),label("name",sort("Name"))],sort("Tag"),attrs([term(cons("Empty"))]))
                expect(prod___lit___64_iter_star__layout_name_Name_Tag_attrs___term__cons___69_109_112_116_121,
                new LiteralStackNode(2888, prod___char_class___range__64_64_lit___64_attrs___term__literal, new char[] {64}),
		new ListStackNode(2889, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2890, "layout"), false),
		new NonTerminalStackNode(2892, "Name"));
              
        }
    
    
        public void Mapping__Expression(){
            
                // prod([label("from",sort("Expression")),\iter-star(layout()),lit(":"),\iter-star(layout()),label("to",sort("Expression"))],\parameterized-sort("Mapping",[sort("Expression")]),attrs([term(cons("Default"))]))
                expect(prod___from_Expression_iter_star__layout_lit___58_iter_star__layout_to_Expression_Mapping__Expression_attrs___term__cons___68_101_102_97_117_108_116,
                new NonTerminalStackNode(2894, "Expression"),
		new ListStackNode(2895, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2896, "layout"), false),
		new LiteralStackNode(2897, prod___char_class___range__58_58_lit___58_attrs___term__literal, new IReducableStackNode[] {new CharStackNode(2898, new char[][]{{58,58}})}, new char[] {58}),
		new ListStackNode(2899, regular__iter_star__layout_no_attrs, new NonTerminalStackNode(2900, "layout"), false),
		new NonTerminalStackNode(2902, "Expression"));
              
        }
    
    
    
}
