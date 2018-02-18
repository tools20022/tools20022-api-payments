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
 * the passing of a stimulus from a sender instance to a receiver instance
 */
public class MMSend implements MMModelEntity {

	/**
	 * The object passing a stimulus to a receiver object
	 */
	public final static MetamodelAttribute<MMSend, MMParticipant> senderAttribute = newAttribute();
	/**
	 * the stimulus handled as part of the Send
	 */
	public final static MetamodelAttribute<MMSend, MMMessageTransmission> messageTransmissionAttribute = newAttribute();
	protected Supplier<MMParticipant> sender_lazy;
	protected Supplier<MMMessageTransmission> messageTransmission_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMMessageTransmission getContainer() {
		return getMessageTransmission();
	}

	@Override
	public MetamodelType<? extends MMSend> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMSend> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMSend.class);
	}

	/**
	 * The object passing a stimulus to a receiver object
	 * 
	 * @see MMParticipant#getSends()
	 */
	@Opposite(bean = MMParticipant.class, attribute = "sends")
	public MMParticipant getSender() {
		return sender_lazy.get();
	}

	/**
	 * the stimulus handled as part of the Send
	 * 
	 * @see MMMessageTransmission#getSend()
	 */
	@Opposite(bean = MMMessageTransmission.class, attribute = "send")
	@Container
	public MMMessageTransmission getMessageTransmission() {
		return messageTransmission_lazy.get();
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