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

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageTransmission;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * the handling of a stimulus passed from a sender instance
 */
public class MMReceive implements MMModelEntity {

	/**
	 * the stimulus handled as part of the Receive
	 */
	public final static MetamodelAttribute<MMReceive, MMMessageTransmission> messageTransmissionAttribute = newAttribute();
	/**
	 * the object handling a stimulus passed from the sender
	 */
	public final static MetamodelAttribute<MMReceive, MMParticipant> receiverAttribute = newAttribute();
	protected Supplier<MMMessageTransmission> messageTransmission_lazy;
	protected Supplier<MMParticipant> receiver_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMMessageTransmission getContainer() {
		return getMessageTransmission();
	}

	@Override
	public MetamodelType<? extends MMReceive> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMReceive> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMReceive.class);
	}

	/**
	 * the stimulus handled as part of the Receive
	 * 
	 * @see MMMessageTransmission#getReceive()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "receive")
	@Container
	public MMMessageTransmission getMessageTransmission() {
		return messageTransmission_lazy.get();
	}

	/**
	 * the object handling a stimulus passed from the sender
	 * 
	 * @see MMParticipant#getReceives()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "receives")
	public MMParticipant getReceiver() {
		return receiver_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}