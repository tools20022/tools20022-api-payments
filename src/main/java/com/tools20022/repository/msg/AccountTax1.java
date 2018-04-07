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
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
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
 * Describes account taxing parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmCalculationMethod
 * AccountTax1.mmCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#mmRegion
 * AccountTax1.mmRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmNonResidenceCountry
 * AccountTax1.mmNonResidenceCountry}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountTax1", propOrder = {"calculationMethod", "region", "nonResidenceCountry"})
public class AccountTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClctnMtd", required = true)
	protected BillingTaxCalculationMethod1Code calculationMethod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<AccountTax1, BillingTaxCalculationMethod1Code> mmCalculationMethod = new MMMessageAttribute<AccountTax1, BillingTaxCalculationMethod1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "Defines the calculation method on how the taxes are applied on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingTaxCalculationMethod1Code.mmObject();
		}

		@Override
		public BillingTaxCalculationMethod1Code getValue(AccountTax1 obj) {
			return obj.getCalculationMethod();
		}

		@Override
		public void setValue(AccountTax1 obj, BillingTaxCalculationMethod1Code value) {
			obj.setCalculationMethod(value);
		}
	};
	@XmlElement(name = "Rgn")
	protected Max40Text region;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
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
	public static final MMMessageAttribute<AccountTax1, Optional<Max40Text>> mmRegion = new MMMessageAttribute<AccountTax1, Optional<Max40Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "Rgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Region";
			definition = "Identifies the tax region in which the account resides.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}

		@Override
		public Optional<Max40Text> getValue(AccountTax1 obj) {
			return obj.getRegion();
		}

		@Override
		public void setValue(AccountTax1 obj, Optional<Max40Text> value) {
			obj.setRegion(value.orElse(null));
		}
	};
	@XmlElement(name = "NonResCtry")
	protected ResidenceLocation1Choice nonResidenceCountry;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
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
	public static final MMMessageAttribute<AccountTax1, Optional<ResidenceLocation1Choice>> mmNonResidenceCountry = new MMMessageAttribute<AccountTax1, Optional<ResidenceLocation1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "NonResCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidenceCountry";
			definition = "Specifies the country of residence, when the account owner does not reside in the account's tax region.\n\nUsage: If present, the account owner does not reside in the account's tax region.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ResidenceLocation1Choice.mmObject();
		}

		@Override
		public Optional<ResidenceLocation1Choice> getValue(AccountTax1 obj) {
			return obj.getNonResidenceCountry();
		}

		@Override
		public void setValue(AccountTax1 obj, Optional<ResidenceLocation1Choice> value) {
			obj.setNonResidenceCountry(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountTax1.mmCalculationMethod, com.tools20022.repository.msg.AccountTax1.mmRegion, com.tools20022.repository.msg.AccountTax1.mmNonResidenceCountry);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountTax1";
				definition = "Describes account taxing parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public BillingTaxCalculationMethod1Code getCalculationMethod() {
		return calculationMethod;
	}

	public AccountTax1 setCalculationMethod(BillingTaxCalculationMethod1Code calculationMethod) {
		this.calculationMethod = Objects.requireNonNull(calculationMethod);
		return this;
	}

	public Optional<Max40Text> getRegion() {
		return region == null ? Optional.empty() : Optional.of(region);
	}

	public AccountTax1 setRegion(Max40Text region) {
		this.region = region;
		return this;
	}

	public Optional<ResidenceLocation1Choice> getNonResidenceCountry() {
		return nonResidenceCountry == null ? Optional.empty() : Optional.of(nonResidenceCountry);
	}

	public AccountTax1 setNonResidenceCountry(ResidenceLocation1Choice nonResidenceCountry) {
		this.nonResidenceCountry = nonResidenceCountry;
		return this;
	}
}