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
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;
import java.util.Optional;

public interface MMBusinessTransaction_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, MMBusinessProcess> businessProcessTrace = newAttribute();
	/**
	 * the involvement of a BusinessRole in a BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMParticipant>> participant = newAttribute();
	/**
	 * he conveyance of information from a sending Participant in the context of
	 * a BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMMessageTransmission>> transmission = newAttribute();
	/**
	 * Provides a set of characterstics for a MessageTransportMode to have in
	 * the context of a single BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, MMMessageTransportMode> messageTransportMode = newAttribute();
	/**
	 * decomposition of a BusinessTransaction into a number of sub transactions
	 * which are BusinessTransactions in their own right.
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMBusinessTransaction>> subTransaction = newAttribute();
	/**
	 * assembly of a number of BusinessTransactions that together form a
	 * BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, Optional<MMBusinessTransaction>> parentTransaction = newAttribute();
	/**
	 * all of the BusinessTransactionTraces that derive MessageChoreographies
	 * from one BusinessTransaction
	 */
	MetamodelAttribute<MMBusinessTransaction, List<MMMessageChoreography>> trace = newAttribute();
	/**
	 * All MessageTransmissions contained in this BusinessTransaction shall have
	 * different names. transmission-&gt;forAll(msg1,msg2 | msg1 &lt;&gt; msg2
	 * implies msg1.name &lt;&gt; msg2.name)
	 */
	MetamodelConstraint<MMBusinessTransaction> checkMessageTransmissionsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * All Participants of this BusinessTransaction shall have different names.
	 * participant-&gt;forAll(p1,p2 | p1 &lt;&gt; p2 implies p1.name &lt;&gt;
	 * p2.name)
	 */
	MetamodelConstraint<MMBusinessTransaction> checkParticipantsHaveUniqueNames = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}