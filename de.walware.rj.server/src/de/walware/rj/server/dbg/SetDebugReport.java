/*=============================================================================#
 # Copyright (c) 2011-2016 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of either (per the licensee's choosing)
 #   - the Eclipse Public License v1.0
 #     which accompanies this distribution, and is available at
 #     http://www.eclipse.org/legal/epl-v10.html, or
 #   - the GNU Lesser General Public License v2.1 or newer
 #     which accompanies this distribution, and is available at
 #     http://www.gnu.org/licenses/lgpl.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.rj.server.dbg;

import java.io.IOException;

import de.walware.rj.data.RJIO;
import de.walware.rj.data.RJIOExternalizable;


public class SetDebugReport implements RJIOExternalizable {
	
	
	private static final int CHANGED=                      0x000000001;
	
	
	private final int resultCode;
	
	
	public SetDebugReport(final boolean changed) {
		this.resultCode= (changed) ? CHANGED : 0;
	}
	
	public SetDebugReport(final RJIO io) throws IOException {
		this.resultCode= io.readInt();
	}
	@Override
	public void writeExternal(final RJIO io) throws IOException {
		io.writeInt(this.resultCode);
	}
	
	
	public boolean isChanged() {
		return ((this.resultCode & CHANGED) != 0);
	}
	
}
