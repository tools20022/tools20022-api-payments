/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageElement;
import java.util.function.Consumer;

/**
 * Implementation of constraint
 * {@link com.tools20022.metamodel.MMMessageElement#checkCardinalityAlignment}
 */
public class CardinalityAlignment implements Consumer<MMMessageElement> {

	/**
	 * A trace can only raise the minimum cardinality and can only lower the
	 * maximum cardinality minOccurs &gt;= businessElementTrace.minOccurs and
	 * (businessElementTrace.maxOccurs.oclIsUndefined() or maxOccurs &lt;=
	 * businessElementTrace.maxOccurs)
	 */
	@Override
	public void accept(MMMessageElement mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}