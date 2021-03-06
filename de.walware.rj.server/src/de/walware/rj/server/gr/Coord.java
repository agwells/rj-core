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

package de.walware.rj.server.gr;

import java.io.IOException;

import de.walware.rj.data.RJIO;
import de.walware.rj.data.RJIOExternalizable;


/**
 * Single R graphic coordinate
 */
public class Coord implements RJIOExternalizable {
	
	
	private double x;
	private double y;
	
	
	public Coord(final double x, final double y) {
		this.x = x;
		this.y = y;
	}
	
	public Coord(final RJIO in) throws IOException {
		this.x = in.readDouble();
		this.y = in.readDouble();
	}
	
	
	@Override
	public void writeExternal(final RJIO out) throws IOException {
		out.writeDouble(this.x);
		out.writeDouble(this.y);
	}
	
	
	public void setX(final double x) {
		this.x = x;
	}
	
	public void setY(final double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
}
