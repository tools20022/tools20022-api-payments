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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.ExternalShipmentCondition1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Incoterms;
import com.tools20022.repository.entity.PostalAddress;
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
 * Further details on the shipment conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmConditions
 * ShipmentAttribute1.mmConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmExpectedDate
 * ShipmentAttribute1.mmExpectedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmCountryOfCounterParty
 * ShipmentAttribute1.mmCountryOfCounterParty}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ShipmentAttribute1", propOrder = {"conditions", "expectedDate", "countryOfCounterParty"})
public class ShipmentAttribute1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Conds")
	protected ExternalShipmentCondition1Code conditions;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ShipmentAttribute1, Optional<ExternalShipmentCondition1Code>> mmConditions = new MMMessageAttribute<ShipmentAttribute1, Optional<ExternalShipmentCondition1Code>>() {
		{
			businessComponentTrace_lazy = () -> Incoterms.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentAttribute1.mmObject();
			isDerived = false;
			xmlTag = "Conds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditions";
			definition = "Shipment conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalShipmentCondition1Code.mmObject();
		}

		@Override
		public Optional<ExternalShipmentCondition1Code> getValue(ShipmentAttribute1 obj) {
			return obj.getConditions();
		}

		@Override
		public void setValue(ShipmentAttribute1 obj, Optional<ExternalShipmentCondition1Code> value) {
			obj.setConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdDt")
	protected ISODate expectedDate;
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
	public static final MMMessageAttribute<ShipmentAttribute1, Optional<ISODate>> mmExpectedDate = new MMMessageAttribute<ShipmentAttribute1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmLatestShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentAttribute1.mmObject();
			isDerived = false;
			xmlTag = "XpctdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDate";
			definition = "Expected shipment date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ShipmentAttribute1 obj) {
			return obj.getExpectedDate();
		}

		@Override
		public void setValue(ShipmentAttribute1 obj, Optional<ISODate> value) {
			obj.setExpectedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfCntrPty", required = true)
	protected CountryCode countryOfCounterParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
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
	public static final MMMessageAttribute<ShipmentAttribute1, CountryCode> mmCountryOfCounterParty = new MMMessageAttribute<ShipmentAttribute1, CountryCode>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.ShipmentAttribute1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfCntrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfCounterParty";
			definition = "Country in which the counter party is located.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(ShipmentAttribute1 obj) {
			return obj.getCountryOfCounterParty();
		}

		@Override
		public void setValue(ShipmentAttribute1 obj, CountryCode value) {
			obj.setCountryOfCounterParty(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentAttribute1.mmConditions, com.tools20022.repository.msg.ShipmentAttribute1.mmExpectedDate,
						com.tools20022.repository.msg.ShipmentAttribute1.mmCountryOfCounterParty);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentAttribute1";
				definition = "Further details on the shipment conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExternalShipmentCondition1Code> getConditions() {
		return conditions == null ? Optional.empty() : Optional.of(conditions);
	}

	public ShipmentAttribute1 setConditions(ExternalShipmentCondition1Code conditions) {
		this.conditions = conditions;
		return this;
	}

	public Optional<ISODate> getExpectedDate() {
		return expectedDate == null ? Optional.empty() : Optional.of(expectedDate);
	}

	public ShipmentAttribute1 setExpectedDate(ISODate expectedDate) {
		this.expectedDate = expectedDate;
		return this;
	}

	public CountryCode getCountryOfCounterParty() {
		return countryOfCounterParty;
	}

	public ShipmentAttribute1 setCountryOfCounterParty(CountryCode countryOfCounterParty) {
		this.countryOfCounterParty = Objects.requireNonNull(countryOfCounterParty);
		return this;
	}
}