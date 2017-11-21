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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxRecord;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details for the tax calculation method D.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod3#mmServiceTaxPriceAmount
 * BillingMethod3.mmServiceTaxPriceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod3#mmTaxIdentification
 * BillingMethod3.mmTaxIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingMethod3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details for the tax calculation method D."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BillingMethod3", propOrder = {"serviceTaxPriceAmount", "taxIdentification"})
public class BillingMethod3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection34 serviceTaxPriceAmount;
	/**
	 * Equivalent amount to the service tax host amount but allows the sender to
	 * optionally express the value in the pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmAmount
	 * TaxRecord.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3 BillingMethod3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTaxPricAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceTaxPriceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Equivalent amount to the service tax host amount but allows the sender to optionally express the value in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceTaxPriceAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmAmount;
			componentContext_lazy = () -> BillingMethod3.mmObject();
			isDerived = false;
			xmlTag = "SvcTaxPricAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTaxPriceAmount";
			definition = "Equivalent amount to the service tax host amount but allows the sender to optionally express the value in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BillingServicesTax2> taxIdentification;
	/**
	 * Provides for the specific tax identification within the same tax region. <br>
	 * <br>
	 * Usage: This element allows for a maximum of three regional taxes on the
	 * same service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax2
	 * BillingServicesTax2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3 BillingMethod3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRecord;
			componentContext_lazy = () -> BillingMethod3.mmObject();
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Provides for the specific tax identification within the same tax region. \r\n\r\nUsage: This element allows for a maximum of three regional taxes on the same service.";
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingServicesTax2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BillingMethod3.mmServiceTaxPriceAmount, BillingMethod3.mmTaxIdentification);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingMethod3";
				definition = "Provides the details for the tax calculation method D.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SvcTaxPricAmt", required = true)
	public AmountAndDirection34 getServiceTaxPriceAmount() {
		return serviceTaxPriceAmount;
	}

	public void setServiceTaxPriceAmount(com.tools20022.repository.msg.AmountAndDirection34 serviceTaxPriceAmount) {
		this.serviceTaxPriceAmount = serviceTaxPriceAmount;
	}

	@XmlElement(name = "TaxId", required = true)
	public List<BillingServicesTax2> getTaxIdentification() {
		return taxIdentification;
	}

	public void setTaxIdentification(List<com.tools20022.repository.msg.BillingServicesTax2> taxIdentification) {
		this.taxIdentification = taxIdentification;
	}
}