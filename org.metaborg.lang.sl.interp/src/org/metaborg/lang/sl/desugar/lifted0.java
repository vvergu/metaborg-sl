package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
final class lifted0 extends Strategy {
	Strategy x_78;

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail84: {
			term = v_78.instance.invoke(context, term, x_78);
			if (term == null)
				break Fail84;
			if (true)
				return term;
		}
		return null;
	}
}