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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ShipmentDateRange1;
import com.tools20022.repository.msg.ShipmentDateRange2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between earliest/latest shipment date and a shipment schedule per sub
 * quantity of line item quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentDateRange
 * ShipmentSchedule2Choice.mmShipmentDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentSubSchedule
 * ShipmentSchedule2Choice.mmShipmentSubSchedule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
 * ShipmentDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ShipmentSchedule2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between earliest/latest shipment date and a shipment schedule per sub quantity of line item quantity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice
 * PaymentSchedule1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ShipmentSchedule2Choice", propOrder = {"shipmentDateRange", "shipmentSubSchedule"})
public class ShipmentSchedule2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShipmntDtRg", required = true)
	protected ShipmentDateRange1 shipmentDateRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentDateRange1
	 * ShipmentDateRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice
	 * ShipmentSchedule2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntDtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an earliest shipment date and a latest shipment date."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice#mmDateRange
	 * PaymentSchedule1Choice.mmDateRange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipmentDateRange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipmentDateRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ShipmentSchedule2Choice.mmObject();
			isDerived = false;
			xmlTag = "ShipmntDtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentDateRange";
			definition = "Specifies an earliest shipment date and a latest shipment date.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSchedule1Choice.mmDateRange);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ShipmentDateRange1.mmObject();
		}
	};
	@XmlElement(name = "ShipmntSubSchdl", required = true)
	protected List<ShipmentDateRange2> shipmentSubSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice
	 * ShipmentSchedule2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntSubSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentSubSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a shipment schedule, ie, quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice#mmSubSchedule
	 * PaymentSchedule1Choice.mmSubSchedule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipmentSubSchedule = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipmentDateRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ShipmentSchedule2Choice.mmObject();
			isDerived = false;
			xmlTag = "ShipmntSubSchdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentSubSchedule";
			definition = "Specifies a shipment schedule, ie, quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSchedule1Choice.mmSubSchedule);
			minOccurs = 2;
			isComposite = true;
			type_lazy = () -> ShipmentDateRange2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ShipmentSchedule2Choice.mmShipmentDateRange, com.tools20022.repository.choice.ShipmentSchedule2Choice.mmShipmentSubSchedule);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentSchedule2Choice";
				definition = "Choice between earliest/latest shipment date and a shipment schedule per sub quantity of line item quantity.";
				nextVersions_lazy = () -> Arrays.asList(PaymentSchedule1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ShipmentDateRange1 getShipmentDateRange() {
		return shipmentDateRange;
	}

	public ShipmentSchedule2Choice setShipmentDateRange(ShipmentDateRange1 shipmentDateRange) {
		this.shipmentDateRange = Objects.requireNonNull(shipmentDateRange);
		return this;
	}

	public List<ShipmentDateRange2> getShipmentSubSchedule() {
		return shipmentSubSchedule == null ? shipmentSubSchedule = new ArrayList<>() : shipmentSubSchedule;
	}

	public ShipmentSchedule2Choice setShipmentSubSchedule(List<ShipmentDateRange2> shipmentSubSchedule) {
		this.shipmentSubSchedule = Objects.requireNonNull(shipmentSubSchedule);
		return this;
	}
}