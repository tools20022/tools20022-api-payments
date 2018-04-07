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
import com.tools20022.repository.codeset.ServiceTaxDesignation1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxRecord;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxReason1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Designates the tax calculation to be applied on a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#mmCode
 * ServiceTaxDesignation1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#mmRegion
 * ServiceTaxDesignation1.mmRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#mmTaxReason
 * ServiceTaxDesignation1.mmTaxReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegionPresenceRule#forServiceTaxDesignation1
 * ConstraintRegionPresenceRule.forServiceTaxDesignation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceTaxDesignation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Designates the tax calculation to be applied on a service."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ServiceTaxDesignation1", propOrder = {"code", "region", "taxReason"})
public class ServiceTaxDesignation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ServiceTaxDesignation1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code
	 * ServiceTaxDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the taxable status of the service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ServiceTaxDesignation1, ServiceTaxDesignation1Code> mmCode = new MMMessageAttribute<ServiceTaxDesignation1, ServiceTaxDesignation1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceTaxDesignation1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Identifies the taxable status of the service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceTaxDesignation1Code.mmObject();
		}

		@Override
		public ServiceTaxDesignation1Code getValue(ServiceTaxDesignation1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(ServiceTaxDesignation1 obj, ServiceTaxDesignation1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Rgn")
	protected Max35Text region;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Region"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the tax region associated with the service. This element must be present if taxes are involved with any portion of the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ServiceTaxDesignation1, Optional<Max35Text>> mmRegion = new MMMessageAttribute<ServiceTaxDesignation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceTaxDesignation1.mmObject();
			isDerived = false;
			xmlTag = "Rgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Region";
			definition = "Defines the tax region associated with the service. This element must be present if taxes are involved with any portion of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ServiceTaxDesignation1 obj) {
			return obj.getRegion();
		}

		@Override
		public void setValue(ServiceTaxDesignation1 obj, Optional<Max35Text> value) {
			obj.setRegion(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRsn")
	protected List<TaxReason1> taxReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxReason1
	 * TaxReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides free form explanations of the various tax codes used within the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ServiceTaxDesignation1, List<TaxReason1>> mmTaxReason = new MMMessageAttribute<ServiceTaxDesignation1, List<TaxReason1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceTaxDesignation1.mmObject();
			isDerived = false;
			xmlTag = "TaxRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReason";
			definition = "Provides free form explanations of the various tax codes used within the statement.";
			minOccurs = 0;
			complexType_lazy = () -> TaxReason1.mmObject();
		}

		@Override
		public List<TaxReason1> getValue(ServiceTaxDesignation1 obj) {
			return obj.getTaxReason();
		}

		@Override
		public void setValue(ServiceTaxDesignation1 obj, List<TaxReason1> value) {
			obj.setTaxReason(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ServiceTaxDesignation1.mmCode, com.tools20022.repository.msg.ServiceTaxDesignation1.mmRegion,
						com.tools20022.repository.msg.ServiceTaxDesignation1.mmTaxReason);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegionPresenceRule.forServiceTaxDesignation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceTaxDesignation1";
				definition = "Designates the tax calculation to be applied on a service.";
			}
		});
		return mmObject_lazy.get();
	}

	public ServiceTaxDesignation1Code getCode() {
		return code;
	}

	public ServiceTaxDesignation1 setCode(ServiceTaxDesignation1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<Max35Text> getRegion() {
		return region == null ? Optional.empty() : Optional.of(region);
	}

	public ServiceTaxDesignation1 setRegion(Max35Text region) {
		this.region = region;
		return this;
	}

	public List<TaxReason1> getTaxReason() {
		return taxReason == null ? taxReason = new ArrayList<>() : taxReason;
	}

	public ServiceTaxDesignation1 setTaxReason(List<TaxReason1> taxReason) {
		this.taxReason = Objects.requireNonNull(taxReason);
		return this;
	}
}