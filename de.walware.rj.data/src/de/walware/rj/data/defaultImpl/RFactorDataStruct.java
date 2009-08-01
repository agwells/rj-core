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

package de.walware.rj.data.defaultImpl;

import de.walware.rj.data.RCharacterStore;
import de.walware.rj.data.RFactorStore;
import de.walware.rj.data.RStore;


public class RFactorDataStruct extends AbstractFactorData {
	
	
	private final int levelCount;
	
	
	public RFactorDataStruct(final int length, final boolean isOrdered, final int levelCount) {
		this.length = length;
		this.isOrdered = isOrdered;
		this.levelCount = levelCount;
	}
	
	
	@Override
	protected final boolean isStructOnly() {
		return true;
	}
	
	
	public boolean isMissing(final int idx) {
		throw new UnsupportedOperationException();
	}
	
	public Integer get(final int idx) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public final Integer[] toArray() {
		throw new UnsupportedOperationException();
	}
	
	
	public void addLevel(final String label) {
		throw new UnsupportedOperationException();
	}
	
	public int getLevelCount() {
		return this.levelCount;
	}
	
	public RCharacterStore getLevels() {
		throw new UnsupportedOperationException();
	}
	
	public void insertLevel(final int position, final String label) {
		throw new UnsupportedOperationException();
	}
	
	public void removeLevel(final String label) {
		throw new UnsupportedOperationException();
	}
	
	public void renameLevel(final String oldLabel, final String newLabel) {
		throw new UnsupportedOperationException();
	}
	
	public RCharacterStore toCharacterData() {
		return new RCharacterDataStruct(this.length);
	}
	
	public boolean allEqual(final RStore other) {
		return (other.getStoreType() == FACTOR
				&& ((RFactorStore) other).isOrdered() == this.isOrdered
				&& other.getLength() == -1);
	}
	
}
