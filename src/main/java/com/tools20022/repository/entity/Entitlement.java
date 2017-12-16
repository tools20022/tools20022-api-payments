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
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Predetermined price at which the holder buys or sells the underlying
	 * assets.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmStrikePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder buys or sells the underlying assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected YesNoIndicator coveredIndicator;
	/**
	 * Indicates whether the underlying security is owned by the writer of the
	 * entitlement.
	 * <p>
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
	public static final MMBusinessAttribute mmCoveredIndicator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Entitlement.class.getMethod("getCoveredIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OptionStyleCode optionStyle;
	/**
	 * Specifies how an option can be exercised.
	 * <p>
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
	public static final MMBusinessAttribute mmOptionStyle = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Entitlement.class.getMethod("getOptionStyle", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OptionTypeCode optionType;
	/**
	 * Specifies whether it is a call option (right to purchase a specific
	 * underlying asset) or a put option (right to sell a specific underlying
	 * asset).
	 * <p>
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
	public static final MMBusinessAttribute mmOptionType = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Entitlement.class.getMethod("getOptionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cappedValue;
	/**
	 * Limit on the pay-out on the expiration of the entitlement. The positive
	 * difference between the cap value and the strike price is the maximum
	 * amount that would be paid off at expiration.
	 * <p>
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
	public static final MMBusinessAttribute mmCappedValue = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Entitlement.class.getMethod("getCappedValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator cappedIndicator;
	/**
	 * Indicates whether an entitlement is capped.
	 * <p>
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
	public static final MMBusinessAttribute mmCappedIndicator = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return Entitlement.class.getMethod("getCappedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Entitlement";
				definition = "Financial instrument providing the holder the privilege to subscribe to or to receive specific assets on terms specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmEntitlement);
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

	public void setStrikePrice(com.tools20022.repository.entity.SecuritiesPricing strikePrice) {
		this.strikePrice = strikePrice;
	}

	public YesNoIndicator getCoveredIndicator() {
		return coveredIndicator;
	}

	public void setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
	}

	public OptionStyleCode getOptionStyle() {
		return optionStyle;
	}

	public void setOptionStyle(OptionStyleCode optionStyle) {
		this.optionStyle = optionStyle;
	}

	public OptionTypeCode getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionTypeCode optionType) {
		this.optionType = optionType;
	}

	public CurrencyAndAmount getCappedValue() {
		return cappedValue;
	}

	public void setCappedValue(CurrencyAndAmount cappedValue) {
		this.cappedValue = cappedValue;
	}

	public YesNoIndicator getCappedIndicator() {
		return cappedIndicator;
	}

	public void setCappedIndicator(YesNoIndicator cappedIndicator) {
		this.cappedIndicator = cappedIndicator;
	}
}