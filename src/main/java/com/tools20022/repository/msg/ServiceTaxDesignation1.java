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
import com.tools20022.repository.codeset.ServiceTaxDesignation1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TaxRecord;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Designates the tax calculation to be applied on a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#Code
 * ServiceTaxDesignation1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#Region
 * ServiceTaxDesignation1.Region}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#TaxReason
 * ServiceTaxDesignation1.TaxReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}</li>
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
 * "ServiceTaxDesignation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Designates the tax calculation to be applied on a service."</li>
 * </ul>
 */
public class ServiceTaxDesignation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the taxable status of the service.
	 * <p>
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
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ServiceTaxDesignation1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Identifies the taxable status of the service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServiceTaxDesignation1Code.mmObject();
		}
	};
	/**
	 * Defines the tax region associated with the service. This element must be
	 * present if taxes are involved with any portion of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
	 * Tax.AdministrationZone}</li>
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
	public static final MMMessageAttribute Region = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ServiceTaxDesignation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.AdministrationZone;
			isDerived = false;
			xmlTag = "Rgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Region";
			definition = "Defines the tax region associated with the service. This element must be present if taxes are involved with any portion of the statement.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides free form explanations of the various tax codes used within the
	 * statement.
	 * <p>
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
	public static final MMMessageAttribute TaxReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ServiceTaxDesignation1.mmObject();
			isDerived = false;
			xmlTag = "TaxRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReason";
			definition = "Provides free form explanations of the various tax codes used within the statement.";
			minOccurs = 0;
			complexType_lazy = () -> TaxReason1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ServiceTaxDesignation1.Code, com.tools20022.repository.msg.ServiceTaxDesignation1.Region,
						com.tools20022.repository.msg.ServiceTaxDesignation1.TaxReason);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceTaxDesignation1";
				definition = "Designates the tax calculation to be applied on a service.";
			}
		});
		return mmObject_lazy.get();
	}
}