package org.jooq.plugins.naming;

import org.jibx.schema.codegen.extend.DefaultNameConverter;
import org.jibx.schema.codegen.extend.NameConverter;
import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

/**
 * User: AustPC Date: 6/15/2019 Time: 3:00 PM
 *
 * @author AustPC
 */
public class PluralToSingularNamingStrategy extends DefaultGeneratorStrategy {

  private final NameConverter nameTools = new DefaultNameConverter();

  @Override public String getJavaClassName(final Definition definition, final Mode mode) {
    final String javaClassName = super.getJavaClassName(definition, mode);
    return nameTools.depluralize(javaClassName);
  }
}
