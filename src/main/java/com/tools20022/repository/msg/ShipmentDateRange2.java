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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmSubQuantityValue
 * ShipmentDateRange2.mmSubQuantityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmEarliestShipmentDate
 * ShipmentDateRange2.mmEarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmLatestShipmentDate
 * ShipmentDateRange2.mmLatestShipmentDate}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ShipmentDateRange2", propOrder = {"subQuantityValue", "earliestShipmentDate", "latestShipmentDate"})
public class ShipmentDateRange2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubQtyVal", required = true)
	protected DecimalNumber subQuantityValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ShipmentDateRange2, DecimalNumber> mmSubQuantityValue = new MMMessageAttribute<ShipmentDateRange2, DecimalNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "SubQtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubQuantityValue";
			definition = "Sub quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(ShipmentDateRange2 obj) {
			return obj.getSubQuantityValue();
		}

		@Override
		public void setValue(ShipmentDateRange2 obj, DecimalNumber value) {
			obj.setSubQuantityValue(value);
		}
	};
	@XmlElement(name = "EarlstShipmntDt")
	protected ISODate earliestShipmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmEarliestShipmentDate
	 * ShipmentDateRange.mmEarliestShipmentDate}</li>
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
	public static final MMMessageAttribute<ShipmentDateRange2, Optional<ISODate>> mmEarliestShipmentDate = new MMMessageAttribute<ShipmentDateRange2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmEarliestShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "EarlstShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ShipmentDateRange2 obj) {
			return obj.getEarliestShipmentDate();
		}

		@Override
		public void setValue(ShipmentDateRange2 obj, Optional<ISODate> value) {
			obj.setEarliestShipmentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LatstShipmntDt")
	protected ISODate latestShipmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmLatestShipmentDate
	 * ShipmentDateRange.mmLatestShipmentDate}</li>
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
	public static final MMMessageAttribute<ShipmentDateRange2, Optional<ISODate>> mmLatestShipmentDate = new MMMessageAttribute<ShipmentDateRange2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmLatestShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "LatstShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ShipmentDateRange2 obj) {
			return obj.getLatestShipmentDate();
		}

		@Override
		public void setValue(ShipmentDateRange2 obj, Optional<ISODate> value) {
			obj.setLatestShipmentDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentDateRange2.mmSubQuantityValue, com.tools20022.repository.msg.ShipmentDateRange2.mmEarliestShipmentDate,
						com.tools20022.repository.msg.ShipmentDateRange2.mmLatestShipmentDate);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange2";
				definition = "Specifies a shipment schedule, that is the quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getSubQuantityValue() {
		return subQuantityValue;
	}

	public ShipmentDateRange2 setSubQuantityValue(DecimalNumber subQuantityValue) {
		this.subQuantityValue = Objects.requireNonNull(subQuantityValue);
		return this;
	}

	public Optional<ISODate> getEarliestShipmentDate() {
		return earliestShipmentDate == null ? Optional.empty() : Optional.of(earliestShipmentDate);
	}

	public ShipmentDateRange2 setEarliestShipmentDate(ISODate earliestShipmentDate) {
		this.earliestShipmentDate = earliestShipmentDate;
		return this;
	}

	public Optional<ISODate> getLatestShipmentDate() {
		return latestShipmentDate == null ? Optional.empty() : Optional.of(latestShipmentDate);
	}

	public ShipmentDateRange2 setLatestShipmentDate(ISODate latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
		return this;
	}
}