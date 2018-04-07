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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Technique whereby a position in the underlying is traded for a futures
 * position in the physical commodity markets.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExchangeForPhysicalTrade"
 * src="doc-files/ExchangeForPhysicalTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmOutsideIndex
 * ExchangeForPhysicalTrade.mmOutsideIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmFairValue
 * ExchangeForPhysicalTrade.mmFairValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmValueForFutures
 * ExchangeForPhysicalTrade.mmValueForFutures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmOutMainCountryIndex
 * ExchangeForPhysicalTrade.mmOutMainCountryIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmSecuritiesOrder
 * ExchangeForPhysicalTrade.mmSecuritiesOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
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
 * "ExchangeForPhysicalTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets."
 * </li>
 * </ul>
 */
public class ExchangeForPhysicalTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate outsideIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 405 and 407</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutsideIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExchangeForPhysicalTrade, PercentageRate> mmOutsideIndex = new MMBusinessAttribute<ExchangeForPhysicalTrade, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "405 and 407"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutsideIndex";
			definition = "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(ExchangeForPhysicalTrade obj) {
			return obj.getOutsideIndex();
		}

		@Override
		public void setValue(ExchangeForPhysicalTrade obj, PercentageRate value) {
			obj.setOutsideIndex(value);
		}
	};
	protected CurrencyAndAmount fairValue;
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 406</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FairValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount> mmFairValue = new MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "406"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FairValue";
			definition = "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExchangeForPhysicalTrade obj) {
			return obj.getFairValue();
		}

		@Override
		public void setValue(ExchangeForPhysicalTrade obj, CurrencyAndAmount value) {
			obj.setFairValue(value);
		}
	};
	protected CurrencyAndAmount valueForFutures;
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 408</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueForFutures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a futures position involved in an Exchange For Physical trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount> mmValueForFutures = new MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "408"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueForFutures";
			definition = "Value of a futures position involved in an Exchange For Physical trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExchangeForPhysicalTrade obj) {
			return obj.getValueForFutures();
		}

		@Override
		public void setValue(ExchangeForPhysicalTrade obj, CurrencyAndAmount value) {
			obj.setValueForFutures(value);
		}
	};
	protected CurrencyAndAmount outMainCountryIndex;
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 412</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutMainCountryIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accepted value of stocks composing an index located outside its country of origin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount> mmOutMainCountryIndex = new MMBusinessAttribute<ExchangeForPhysicalTrade, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "412"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutMainCountryIndex";
			definition = "Accepted value of stocks composing an index located outside its country of origin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ExchangeForPhysicalTrade obj) {
			return obj.getOutMainCountryIndex();
		}

		@Override
		public void setValue(ExchangeForPhysicalTrade obj, CurrencyAndAmount value) {
			obj.setOutMainCountryIndex(value);
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
	 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order for which parameters for exchange for physical trading are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExchangeForPhysicalTrade, SecuritiesOrder> mmSecuritiesOrder = new MMBusinessAssociationEnd<ExchangeForPhysicalTrade, SecuritiesOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which parameters for exchange for physical trading are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrder.mmExchangeForPhysicalTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public SecuritiesOrder getValue(ExchangeForPhysicalTrade obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(ExchangeForPhysicalTrade obj, SecuritiesOrder value) {
			obj.setSecuritiesOrder(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeForPhysicalTrade";
				definition = "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmExchangeForPhysicalTrade);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmOutsideIndex, com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmFairValue,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmValueForFutures, com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmOutMainCountryIndex,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmSecuritiesOrder);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExchangeForPhysicalTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getOutsideIndex() {
		return outsideIndex;
	}

	public ExchangeForPhysicalTrade setOutsideIndex(PercentageRate outsideIndex) {
		this.outsideIndex = Objects.requireNonNull(outsideIndex);
		return this;
	}

	public CurrencyAndAmount getFairValue() {
		return fairValue;
	}

	public ExchangeForPhysicalTrade setFairValue(CurrencyAndAmount fairValue) {
		this.fairValue = Objects.requireNonNull(fairValue);
		return this;
	}

	public CurrencyAndAmount getValueForFutures() {
		return valueForFutures;
	}

	public ExchangeForPhysicalTrade setValueForFutures(CurrencyAndAmount valueForFutures) {
		this.valueForFutures = Objects.requireNonNull(valueForFutures);
		return this;
	}

	public CurrencyAndAmount getOutMainCountryIndex() {
		return outMainCountryIndex;
	}

	public ExchangeForPhysicalTrade setOutMainCountryIndex(CurrencyAndAmount outMainCountryIndex) {
		this.outMainCountryIndex = Objects.requireNonNull(outMainCountryIndex);
		return this;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public ExchangeForPhysicalTrade setSecuritiesOrder(SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}
}