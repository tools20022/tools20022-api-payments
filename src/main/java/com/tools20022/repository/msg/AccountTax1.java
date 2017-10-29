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
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes account taxing parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#CalculationMethod
 * AccountTax1.CalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#Region
 * AccountTax1.Region}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountTax1#NonResidenceCountry
 * AccountTax1.NonResidenceCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "AccountTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes account taxing parameters."</li>
 * </ul>
 */
public class AccountTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines the calculation method on how the taxes are applied on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the calculation method on how the taxes are applied on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "Defines the calculation method on how the taxes are applied on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BillingTaxCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * Identifies the tax region in which the account resides.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
	 * Tax.AdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
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
	 * definition} = "Identifies the tax region in which the account resides."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Region = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountTax1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.AdministrationZone;
			isDerived = false;
			xmlTag = "Rgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Region";
			definition = "Identifies the tax region in which the account resides.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	/**
	 * Specifies the country of residence, when the account owner does not
	 * reside in the account's tax region.
	 * 
	 * Usage: If present, the account owner does not reside in the account's tax
	 * region.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice
	 * ResidenceLocation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#ContactPoint
	 * Party.ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonResCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidenceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the country of residence, when the account owner does not reside in the account's tax region.\n\nUsage: If present, the account owner does not reside in the account's tax region."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NonResidenceCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountTax1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.ContactPoint;
			isDerived = false;
			xmlTag = "NonResCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidenceCountry";
			definition = "Specifies the country of residence, when the account owner does not reside in the account's tax region.\n\nUsage: If present, the account owner does not reside in the account's tax region.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ResidenceLocation1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountTax1.CalculationMethod, com.tools20022.repository.msg.AccountTax1.Region, com.tools20022.repository.msg.AccountTax1.NonResidenceCountry);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountTax1";
				definition = "Describes account taxing parameters.";
			}
		});
		return mmObject_lazy.get();
	}
}