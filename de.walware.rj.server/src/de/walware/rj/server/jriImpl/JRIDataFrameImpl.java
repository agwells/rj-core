/*******************************************************************************
 * Copyright (c) 2009 Stephan Wahlbrink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * v2.1 or newer, which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     Stephan Wahlbrink - initial API and implementation
 *******************************************************************************/

package de.walware.rj.server.jriImpl;

import java.io.IOException;
import java.io.ObjectInput;

import de.walware.rj.data.RObject;
import de.walware.rj.data.RObjectFactory;
import de.walware.rj.data.defaultImpl.RCharacterDataImpl;
import de.walware.rj.data.defaultImpl.RDataFrameImpl;


public class JRIDataFrameImpl extends RDataFrameImpl {
	
	
	public JRIDataFrameImpl(final RObject[] columns, final String className1, final String[] initialNames, final String[] initialRownames) {
		super(columns, className1, initialNames, initialRownames, false);
	}
	
	public JRIDataFrameImpl(final ObjectInput in, final int flags, final RObjectFactory factory) throws IOException, ClassNotFoundException {
		super(in, flags, factory);
	}
	
	
	@Override
	protected RCharacterDataImpl readNames(final ObjectInput in, final int flags) throws IOException, ClassNotFoundException {
		return new JRICharacterDataImpl(in);
	}
	
	
	public String[] getJRINamesArray() {
		return ((JRICharacterDataImpl) this.namesAttribute).getJRIValueArray();
	}
	
}
