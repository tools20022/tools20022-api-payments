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

import com.tools20022.metamodel.MMMessageElementContainer;
import java.util.function.Consumer;

/**
 * Implementation of constraint
 * {@link com.tools20022.metamodel.MMMessageElementContainer#checkMessageElementsHaveUniqueNames}
 */
public class MessageElementsHaveUniqueNames implements Consumer<MMMessageElementContainer> {

	/**
	 * All MessageElements contained in this MessageComponentContainer must have
	 * different names. messageElement-&gt;forAll(el1,el2 | el1 &lt;&gt; el2
	 * implies el1.name &lt;&gt; el2.name)
	 */
	@Override
	public void accept(MMMessageElementContainer mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}