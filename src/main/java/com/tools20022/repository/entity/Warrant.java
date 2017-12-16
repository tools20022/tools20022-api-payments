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
import com.tools20022.repository.codeset.WarrantStyleCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instrument that gives the holder the right to purchase shares or
 * bonds at a given price within a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Warrant" src="doc-files/Warrant.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
 * Warrant.mmSubscriptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmMultiplier
 * Warrant.mmMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmStyle
 * Warrant.mmStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
 * Warrant.mmWarrantParity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedWarrant
 * SecuritiesPricing.mmRelatedWarrant}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmwarrant
 * QuantityRatio.mmwarrant}</li>
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
 * "Warrant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time."
 * </li>
 * </ul>
 */
public class Warrant extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing subscriptionPrice;
	/**
	 * Pre-determined price at which the holder of a warrant is entitled to buy
	 * the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedWarrant
	 * SecuritiesPricing.mmRelatedWarrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedWarrant;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected BaseOneRate multiplier;
	/**
	 * Specifies the ratio or multiply factor used to convert from contracts to
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMultiplier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Multiplier";
			definition = "Specifies the ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Warrant.class.getMethod("getMultiplier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected WarrantStyleCode style;
	/**
	 * Specifies the expiration style of the warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WarrantStyleCode
	 * WarrantStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Style"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expiration style of the warrant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStyle = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Style";
			definition = "Specifies the expiration style of the warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WarrantStyleCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Warrant.class.getMethod("getStyle", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QuantityRatio warrantParity;
	/**
	 * Provides the ratio between the quantity of warrants and the quantity of
	 * underlying securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmwarrant
	 * QuantityRatio.mmwarrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the ratio between the quantity of warrants and the quantity of underlying securities. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmWarrantParity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParity";
			definition = "Provides the ratio between the quantity of warrants and the quantity of underlying securities. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmwarrant;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Warrant";
				definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedWarrant, com.tools20022.repository.entity.QuantityRatio.mmwarrant);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.mmSubscriptionPrice, com.tools20022.repository.entity.Warrant.mmMultiplier, com.tools20022.repository.entity.Warrant.mmStyle,
						com.tools20022.repository.entity.Warrant.mmWarrantParity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Warrant.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(com.tools20022.repository.entity.SecuritiesPricing subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public BaseOneRate getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(BaseOneRate multiplier) {
		this.multiplier = multiplier;
	}

	public WarrantStyleCode getStyle() {
		return style;
	}

	public void setStyle(WarrantStyleCode style) {
		this.style = style;
	}

	public QuantityRatio getWarrantParity() {
		return warrantParity;
	}

	public void setWarrantParity(com.tools20022.repository.entity.QuantityRatio warrantParity) {
		this.warrantParity = warrantParity;
	}
}