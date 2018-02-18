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

import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessagingEndpoint;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * mechanism that receives Transport Messages from the sending
 * MessagingEndpoint, transports them, and delivers them to the receiving
 * MessagingEndpoint
 */
public class MMMessageTransportSystem implements OrphanMetamodelType, MMModelEntity {

	/**
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 */
	public final static MetamodelAttribute<MMMessageTransportSystem, List<MMMessagingEndpoint>> endpointAttribute = newAttribute();
	protected Supplier<List<MMMessagingEndpoint>> endpoint_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMMessageTransportSystem> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMMessageTransportSystem> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageTransportSystem.class);
	}

	/**
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 * 
	 * @see MMMessagingEndpoint#getTransportSystem()
	 */
	@Opposite(bean = MMMessagingEndpoint.class, attribute = "transportSystem")
	@Containment
	public List<MMMessagingEndpoint> getEndpoint() {
		return endpoint_lazy == null ? Collections.emptyList() : endpoint_lazy.get();
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