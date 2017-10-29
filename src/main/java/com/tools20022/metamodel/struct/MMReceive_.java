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

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.MMReceive;
import com.tools20022.metamodel.struct.MMModelEntity_;

public interface MMReceive_ extends MMModelEntity_ {

	/**
	 * the stimulus handled as part of the Receive
	 */
	MetamodelAttribute<MMReceive, MMMessageTransmission> messageTransmission = newAttribute();
	/**
	 * the object handling a stimulus passed from the sender
	 */
	MetamodelAttribute<MMReceive, MMParticipant> receiver = newAttribute();
}