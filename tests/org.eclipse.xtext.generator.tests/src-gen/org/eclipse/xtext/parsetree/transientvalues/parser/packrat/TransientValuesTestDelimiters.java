/*
Generated with Xtext
*/
package org.eclipse.xtext.parsetree.transientvalues.parser.packrat;

import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;
import org.eclipse.xtext.parser.packrat.matching.SetBasedKeywordMatcher;

@SuppressWarnings("unused")
public final class TransientValuesTestDelimiters {

	private TransientValuesTestDelimiters() {
		throw new UnsupportedOperationException("Utility classes may not be initialized");
	}
	
    // TODO: remove hardcoded character class from template
	public static ICharacterClass keyword$4$Delimiter = ICharacterClass.Factory.join(
			ICharacterClass.Factory.createRange('a', 'z'),
			ICharacterClass.Factory.createRange('A', 'Z'),
			ICharacterClass.Factory.create('_'),
			ICharacterClass.Factory.createRange('0', '9')
	);

	public static ISequenceMatcher ruleCall$16$Delimiter = ISequenceMatcher.Factory.nullMatcher();

	public static ICharacterClass keyword$27$Delimiter = ICharacterClass.Factory.nullClass();

}
