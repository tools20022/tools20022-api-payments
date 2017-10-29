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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ShipmentDateRange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a shipment schedule, that is the quantity that must be shipped no
 * sooner than the earliest shipment date and no later than the latest shipment
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#SubQuantityValue
 * ShipmentDateRange2.SubQuantityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#EarliestShipmentDate
 * ShipmentDateRange2.EarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#LatestShipmentDate
 * ShipmentDateRange2.LatestShipmentDate}</li>
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
 * "ShipmentDateRange2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a shipment schedule, that is the quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date."
 * </li>
 * </ul>
 */
public class ShipmentDateRange2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sub quantity that must be shipped no sooner than the earliest shipment
	 * date and no later than the latest shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubQtyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubQuantityValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubQuantityValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "SubQtyVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubQuantityValue";
			definition = "Sub quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Earliest date whereby the goods must be shipped.
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
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#EarliestShipmentDate
	 * ShipmentDateRange.EarliestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EarliestShipmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.EarliestShipmentDate;
			isDerived = false;
			xmlTag = "EarlstShipmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the goods must be shipped.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Latest date whereby the goods must be shipped.
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
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute LatestShipmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.LatestShipmentDate;
			isDerived = false;
			xmlTag = "LatstShipmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentDateRange2.SubQuantityValue, com.tools20022.repository.msg.ShipmentDateRange2.EarliestShipmentDate,
						com.tools20022.repository.msg.ShipmentDateRange2.LatestShipmentDate);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange2";
				definition = "Specifies a shipment schedule, that is the quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			}
		});
		return mmObject_lazy.get();
	}
}