
package org.eclipse.xtext.ui.common.editor.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;


public class TwoContextsTestLanguageProposalProvider extends org.eclipse.xtext.ui.common.editor.contentassist.AbstractTwoContextsTestLanguageProposalProvider {

	@Override
	public void completeKeyword(Keyword keyword, final ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeKeyword(keyword, context, filter(acceptor, new Predicate<ICompletionProposal>() {
			public boolean apply(ICompletionProposal input) {
				if (!input.getDisplayString().startsWith(context.getPrefix()))
					throw new IllegalStateException("proposed element '"+input.getDisplayString()+"' does not start with '"+ context.getPrefix()+"'");
				return true;
			}
		}));
	}
}
