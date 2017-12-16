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
import com.tools20022.repository.codeset.PriceSourceCode;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Place from which the price was obtained.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SourceOfPrice" src="doc-files/SourceOfPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
 * SourceOfPrice.mmMarketIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SourceOfPrice#mmType
 * SourceOfPrice.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
 * TradingMarket.mmSourceOfPrice}</li>
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
 * "SourceOfPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Place from which the price was obtained."</li>
 * </ul>
 */
public class SourceOfPrice extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradingMarket marketIdentification;
	/**
	 * Market on which this price is valid (MIC - ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
	 * TradingMarket.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market on which this price is valid (MIC - ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarketIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketIdentification";
			definition = "Market on which this price is valid (MIC - ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected PriceSourceCode type;
	/**
	 * Specifies the type of the source of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the source of the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the source of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceSourceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SourceOfPrice.class.getMethod("getType", new Class[]{});
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
				name = "SourceOfPrice";
				definition = "Place from which the price was obtained.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SourceOfPrice.mmMarketIdentification, com.tools20022.repository.entity.SourceOfPrice.mmType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SourceOfPrice.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradingMarket getMarketIdentification() {
		return marketIdentification;
	}

	public void setMarketIdentification(com.tools20022.repository.entity.TradingMarket marketIdentification) {
		this.marketIdentification = marketIdentification;
	}

	public PriceSourceCode getType() {
		return type;
	}

	public void setType(PriceSourceCode type) {
		this.type = type;
	}
}