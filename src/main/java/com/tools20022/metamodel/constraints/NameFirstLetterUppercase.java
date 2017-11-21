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

import com.tools20022.metamodel.MMRepositoryConcept;
import java.util.function.Consumer;

/**
 * Implementation of constraint
 * {@link com.tools20022.metamodel.MMRepositoryConcept#checkNameFirstLetterUppercase}
 */
public class NameFirstLetterUppercase implements Consumer<MMRepositoryConcept> {

	/**
	 * First letter of name shall be upper case. [A-Z] Set
	 * {'A','B','C','D','E','F'
	 * ,'G','H','I','J','K','L','M','N','O','P','Q','R','S'
	 * ,'T','U','V','W','X','Y','Z'}-&gt;exists(x|x=name.substring(1,1))
	 */
	@Override
	public void accept(MMRepositoryConcept mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}