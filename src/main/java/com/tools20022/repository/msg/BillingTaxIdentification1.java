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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.TaxPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactDetails3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the tax identification related to a service to be billed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#mmVATRegistrationNumber
 * BillingTaxIdentification1.mmVATRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#mmTaxRegistrationNumber
 * BillingTaxIdentification1.mmTaxRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#mmTaxContact
 * BillingTaxIdentification1.mmTaxContact}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
 * TaxPartyRole}</li>
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
 * "BillingTaxIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the tax identification related to a service to be billed."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingTaxIdentification1", propOrder = {"vATRegistrationNumber", "taxRegistrationNumber", "taxContact"})
public class BillingTaxIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VATRegnNb")
	protected Max35Text vATRegistrationNumber;
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
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmVATRegistrationNumber
	 * TaxPartyRole.mmVATRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1
	 * BillingTaxIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VATRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VATRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value added tax (VAT) registration number as provided by the region’s local taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingTaxIdentification1, Optional<Max35Text>> mmVATRegistrationNumber = new MMMessageAttribute<BillingTaxIdentification1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmVATRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingTaxIdentification1.mmObject();
			isDerived = false;
			xmlTag = "VATRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VATRegistrationNumber";
			definition = "Value added tax (VAT) registration number as provided by the region’s local taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BillingTaxIdentification1 obj) {
			return obj.getVATRegistrationNumber();
		}

		@Override
		public void setValue(BillingTaxIdentification1 obj, Optional<Max35Text> value) {
			obj.setVATRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRegnNb")
	protected Max35Text taxRegistrationNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1
	 * BillingTaxIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax registration number (TRN) as provided by the tax region’s local taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingTaxIdentification1, Optional<Max35Text>> mmTaxRegistrationNumber = new MMMessageAttribute<BillingTaxIdentification1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingTaxIdentification1.mmObject();
			isDerived = false;
			xmlTag = "TaxRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRegistrationNumber";
			definition = "Tax registration number (TRN) as provided by the tax region’s local taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BillingTaxIdentification1 obj) {
			return obj.getTaxRegistrationNumber();
		}

		@Override
		public void setValue(BillingTaxIdentification1 obj, Optional<Max35Text> value) {
			obj.setTaxRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCtct")
	protected ContactDetails3 taxContact;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1
	 * BillingTaxIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies financial institution's contact details for the tax region. This contact works for the financial institution, not the tax region."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingTaxIdentification1, Optional<ContactDetails3>> mmTaxContact = new MMMessageAttribute<BillingTaxIdentification1, Optional<ContactDetails3>>() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingTaxIdentification1.mmObject();
			isDerived = false;
			xmlTag = "TaxCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxContact";
			definition = "Specifies financial institution's contact details for the tax region. This contact works for the financial institution, not the tax region.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContactDetails3.mmObject();
		}

		@Override
		public Optional<ContactDetails3> getValue(BillingTaxIdentification1 obj) {
			return obj.getTaxContact();
		}

		@Override
		public void setValue(BillingTaxIdentification1 obj, Optional<ContactDetails3> value) {
			obj.setTaxContact(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxIdentification1.mmVATRegistrationNumber, com.tools20022.repository.msg.BillingTaxIdentification1.mmTaxRegistrationNumber,
						com.tools20022.repository.msg.BillingTaxIdentification1.mmTaxContact);
				trace_lazy = () -> TaxPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingTaxIdentification1";
				definition = "Specifies the tax identification related to a service to be billed.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getVATRegistrationNumber() {
		return vATRegistrationNumber == null ? Optional.empty() : Optional.of(vATRegistrationNumber);
	}

	public BillingTaxIdentification1 setVATRegistrationNumber(Max35Text vATRegistrationNumber) {
		this.vATRegistrationNumber = vATRegistrationNumber;
		return this;
	}

	public Optional<Max35Text> getTaxRegistrationNumber() {
		return taxRegistrationNumber == null ? Optional.empty() : Optional.of(taxRegistrationNumber);
	}

	public BillingTaxIdentification1 setTaxRegistrationNumber(Max35Text taxRegistrationNumber) {
		this.taxRegistrationNumber = taxRegistrationNumber;
		return this;
	}

	public Optional<ContactDetails3> getTaxContact() {
		return taxContact == null ? Optional.empty() : Optional.of(taxContact);
	}

	public BillingTaxIdentification1 setTaxContact(ContactDetails3 taxContact) {
		this.taxContact = taxContact;
		return this;
	}
}