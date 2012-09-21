package org.eclipse.xtend.core.tests.formatting;

import org.eclipse.xtend.core.tests.formatting.AbstractFormatterTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class XtendCommentFormatterTest extends AbstractFormatterTest {
  @Test
  public void formatSLCommentAfterpackage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/***********");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* copyright");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("***********/");
    _builder.newLine();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class zonk {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/***********");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("* copyright");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("***********/package foo");
    _builder_1.newLine();
    _builder_1.append("class zonk {}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatSLCommentAfterStatement() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo // my comment");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package foo // my comment");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatSLCommentBeforeStatement1() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// my comment");
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package foo ");
    _builder_1.newLine();
    _builder_1.append("// my comment");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatSLCommentBeforeStatement2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Map");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("// my comment");
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package foo import java.util.Map ");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("// my comment");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatMLCommentAfterStatement() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo /* my comment */");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package foo /* my comment */");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatMLCommentBeforeStatement1() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/* my comment */");
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package foo ");
    _builder_1.newLine();
    _builder_1.append("/* my comment */");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatMLCommentBeforeStatement2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Map");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/* my comment */");
    _builder.newLine();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import java.util.Map ");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("/* my comment */");
    _builder_1.newLine();
    _builder_1.append("class bar{}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatSLCommentAfterStatement2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class bar { // my comment");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class bar{    // my comment");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatSLCommentBeforeStatement21() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("// my comment");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class bar{");
    _builder_1.newLine();
    _builder_1.append("// my comment");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatMLCommentAfterStatement2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class bar { /* my comment */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class bar{   /* my comment */ ");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
  
  @Test
  public void formatMLCommentBeforeStatement21() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class bar {");
    _builder.newLine();
    _builder.append("/* my comment */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class bar{");
    _builder_1.newLine();
    _builder_1.append("/* my comment */");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
}
