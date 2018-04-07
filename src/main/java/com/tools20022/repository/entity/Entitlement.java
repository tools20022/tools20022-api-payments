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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.OptionStyleCode;
import com.tools20022.repository.codeset.OptionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Financial instrument providing the holder the privilege to subscribe to or to
 * receive specific assets on terms specified.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Entitlement" src="doc-files/Entitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
 * Entitlement.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entitlement#mmCoveredIndicator
 * Entitlement.mmCoveredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmOptionStyle
 * Entitlement.mmOptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmOptionType
 * Entitlement.mmOptionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmCappedValue
 * Entitlement.mmCappedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entitlement#mmCappedIndicator
 * Entitlement.mmCappedIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmEntitlement
 * SecuritiesPricing.mmEntitlement}</li>
 * </ul>
 * </li>
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
 * "Entitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument providing the holder the privilege to subscribe to or to receive specific assets on terms specified."
 * </li>
 * </ul>
 */
public class Entitlement extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmEntitlement
	 * SecuritiesPricing.mmEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder buys or sells the underlying assets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Entitlement, SecuritiesPricing> mmStrikePrice = new MMBusinessAssociationEnd<Entitlement, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder buys or sells the underlying assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Entitlement obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(Entitlement obj, SecuritiesPricing value) {
			obj.setStrikePrice(value);
		}
	};
	protected YesNoIndicator coveredIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying security is owned by the writer of the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Entitlement, YesNoIndicator> mmCoveredIndicator = new MMBusinessAttribute<Entitlement, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoveredIndicator";
			definition = "Indicates whether the underlying security is owned by the writer of the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Entitlement obj) {
			return obj.getCoveredIndicator();
		}

		@Override
		public void setValue(Entitlement obj, YesNoIndicator value) {
			obj.setCoveredIndicator(value);
		}
	};
	protected OptionStyleCode optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how an option can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Entitlement, OptionStyleCode> mmOptionStyle = new MMBusinessAttribute<Entitlement, OptionStyleCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}

		@Override
		public OptionStyleCode getValue(Entitlement obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(Entitlement obj, OptionStyleCode value) {
			obj.setOptionStyle(value);
		}
	};
	protected OptionTypeCode optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionTypeCode
	 * OptionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Entitlement, OptionTypeCode> mmOptionType = new MMBusinessAttribute<Entitlement, OptionTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionTypeCode.mmObject();
		}

		@Override
		public OptionTypeCode getValue(Entitlement obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(Entitlement obj, OptionTypeCode value) {
			obj.setOptionType(value);
		}
	};
	protected CurrencyAndAmount cappedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CappedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit on the pay-out on the expiration of the entitlement. The positive difference between the cap value and the strike price is the maximum amount that would be paid off at expiration."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Entitlement, CurrencyAndAmount> mmCappedValue = new MMBusinessAttribute<Entitlement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CappedValue";
			definition = "Limit on the pay-out on the expiration of the entitlement. The positive difference between the cap value and the strike price is the maximum amount that would be paid off at expiration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Entitlement obj) {
			return obj.getCappedValue();
		}

		@Override
		public void setValue(Entitlement obj, CurrencyAndAmount value) {
			obj.setCappedValue(value);
		}
	};
	protected YesNoIndicator cappedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CappedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entitlement is capped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Entitlement, YesNoIndicator> mmCappedIndicator = new MMBusinessAttribute<Entitlement, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CappedIndicator";
			definition = "Indicates whether an entitlement is capped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Entitlement obj) {
			return obj.getCappedIndicator();
		}

		@Override
		public void setValue(Entitlement obj, YesNoIndicator value) {
			obj.setCappedIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Entitlement";
				definition = "Financial instrument providing the holder the privilege to subscribe to or to receive specific assets on terms specified.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmEntitlement);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entitlement.mmStrikePrice, com.tools20022.repository.entity.Entitlement.mmCoveredIndicator, com.tools20022.repository.entity.Entitlement.mmOptionStyle,
						com.tools20022.repository.entity.Entitlement.mmOptionType, com.tools20022.repository.entity.Entitlement.mmCappedValue, com.tools20022.repository.entity.Entitlement.mmCappedIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Entitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getStrikePrice() {
		return strikePrice;
	}

	public Entitlement setStrikePrice(SecuritiesPricing strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public YesNoIndicator getCoveredIndicator() {
		return coveredIndicator;
	}

	public Entitlement setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = Objects.requireNonNull(coveredIndicator);
		return this;
	}

	public OptionStyleCode getOptionStyle() {
		return optionStyle;
	}

	public Entitlement setOptionStyle(OptionStyleCode optionStyle) {
		this.optionStyle = Objects.requireNonNull(optionStyle);
		return this;
	}

	public OptionTypeCode getOptionType() {
		return optionType;
	}

	public Entitlement setOptionType(OptionTypeCode optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public CurrencyAndAmount getCappedValue() {
		return cappedValue;
	}

	public Entitlement setCappedValue(CurrencyAndAmount cappedValue) {
		this.cappedValue = Objects.requireNonNull(cappedValue);
		return this;
	}

	public YesNoIndicator getCappedIndicator() {
		return cappedIndicator;
	}

	public Entitlement setCappedIndicator(YesNoIndicator cappedIndicator) {
		this.cappedIndicator = Objects.requireNonNull(cappedIndicator);
		return this;
	}
}