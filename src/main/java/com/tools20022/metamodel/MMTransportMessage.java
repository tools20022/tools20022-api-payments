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

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.constraints.SameMessageTransportSystem;
import com.tools20022.metamodel.MMMessageInstance;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * document that is an instance of the MessageTransportSystem message schema
 */
public class MMTransportMessage implements OrphanMetamodelType, MMModelEntity {

	/**
	 * the sending MessagingEndpoint of a TransportMessage
	 */
	public final static MetamodelAttribute<MMTransportMessage, MMMessagingEndpoint> senderAttribute = newAttribute();
	/**
	 * the MessageInstance that is part of the TransportMessage
	 */
	public final static MetamodelAttribute<MMTransportMessage, MMMessageInstance> messageInstanceAttribute = newAttribute();
	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 */
	public final static MetamodelAttribute<MMTransportMessage, List<MMMessagingEndpoint>> receiverAttribute = newAttribute();
	/**
	 * The sender and receiver of a TransportMessage must use the same
	 * MessageTransportSystem receiver-&gt;asBag().transportSystem =
	 * sender.transportSystem-&gt;asBag()
	 */
	public final static MetamodelConstraint<MMTransportMessage> checksameMessageTransportSystem = newConstraint(b -> {
		new SameMessageTransportSystem().accept(b);
	});
	protected Supplier<MMMessagingEndpoint> sender_lazy;
	protected Supplier<MMMessageInstance> messageInstance_lazy;
	protected Supplier<List<MMMessagingEndpoint>> receiver_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMTransportMessage> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMTransportMessage> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMTransportMessage.class);
	}

	/**
	 * the sending MessagingEndpoint of a TransportMessage
	 * 
	 * @see MMMessagingEndpoint#getSentMessage()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "sentMessage")
	public MMMessagingEndpoint getSender() {
		return sender_lazy.get();
	}

	/**
	 * the MessageInstance that is part of the TransportMessage
	 * 
	 * @see MMMessageInstance#getTransportMessage()
	 */
	@Opposite(bean = MMMessageInstance.class, attribute = "transportMessage")
	public MMMessageInstance getMessageInstance() {
		return messageInstance_lazy.get();
	}

	/**
	 * the receiving MessagingEndpoint in a TransportMessage
	 * 
	 * @see MMMessagingEndpoint#getReceivedMessage()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "receivedMessage")
	public List<MMMessagingEndpoint> getReceiver() {
		return receiver_lazy == null ? Collections.emptyList() : receiver_lazy.get();
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