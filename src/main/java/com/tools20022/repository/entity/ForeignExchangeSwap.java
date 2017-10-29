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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Combination of two foreign exchange trades, in opposite directions, for
 * different value dates and for the same pair(s) of currencies.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ForeignExchangeSwap" src="doc-files/ForeignExchangeSwap.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#LinkSwapIdentification
 * ForeignExchangeSwap.LinkSwapIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#SwapLeg
 * ForeignExchangeSwap.SwapLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedSwap
 * ForeignExchangeTrade.RelatedSwap}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
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
 * "ForeignExchangeSwap"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Combination of two foreign exchange trades, in opposite directions, for different value dates and for the same pair(s) of currencies."
 * </li>
 * </ul>
 */
public class ForeignExchangeSwap extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Correlation identification for the near and far leg of a swap
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
	 * ForeignExchangeSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSwapIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Correlation identification for the near and far leg of a swap transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LinkSwapIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ForeignExchangeSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Correlation identification for the near and far leg of a swap transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * One-side of a pair of foreign exchange trades executed as part of a swap
	 * agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedSwap
	 * ForeignExchangeTrade.RelatedSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
	 * ForeignExchangeSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One-side of a pair of foreign exchange trades executed as part of a swap agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SwapLeg = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwapLeg";
			definition = "One-side of a pair of foreign exchange trades executed as part of a swap agreement.";
			minOccurs = 2;
			maxOccurs = 2;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeSwap";
				definition = "Combination of two foreign exchange trades, in opposite directions, for different value dates and for the same pair(s) of currencies.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap);
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeSwap.LinkSwapIdentification, com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg);
			}
		});
		return mmObject_lazy.get();
	}
}