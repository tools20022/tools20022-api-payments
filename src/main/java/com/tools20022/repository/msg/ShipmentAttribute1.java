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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.ExternalShipmentCondition1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Incoterms;
import com.tools20022.repository.entity.ShipmentDateRange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further details on the shipment conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ShipmentAttribute1#Conditions
 * ShipmentAttribute1.Conditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#ExpectedDate
 * ShipmentAttribute1.ExpectedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#CountryOfCounterParty
 * ShipmentAttribute1.CountryOfCounterParty}</li>
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
 * "ShipmentAttribute1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Further details on the shipment conditions."</li>
 * </ul>
 */
public class ShipmentAttribute1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Shipment conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalShipmentCondition1Code
	 * ExternalShipmentCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1
	 * ShipmentAttribute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shipment conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Conditions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentAttribute1.mmObject();
			businessComponentTrace_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			xmlTag = "Conds";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditions";
			definition = "Shipment conditions.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalShipmentCondition1Code.mmObject();
		}
	};
	/**
	 * Expected shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#LatestShipmentDate
	 * ShipmentDateRange.LatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1
	 * ShipmentAttribute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected shipment date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExpectedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentAttribute1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.LatestShipmentDate;
			isDerived = false;
			xmlTag = "XpctdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDate";
			definition = "Expected shipment date.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Country in which the counter party is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#Country
	 * PostalAddress.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1
	 * ShipmentAttribute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfCntrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfCounterParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the counter party is located."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CountryOfCounterParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentAttribute1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.Country;
			isDerived = false;
			xmlTag = "CtryOfCntrPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfCounterParty";
			definition = "Country in which the counter party is located.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentAttribute1.Conditions, com.tools20022.repository.msg.ShipmentAttribute1.ExpectedDate,
						com.tools20022.repository.msg.ShipmentAttribute1.CountryOfCounterParty);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShipmentAttribute1";
				definition = "Further details on the shipment conditions.";
			}
		});
		return mmObject_lazy.get();
	}
}