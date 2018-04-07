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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Foreign exchange contract where one of the exchanged amounts is specified in
 * a non-deliverable currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NonDeliverableTrade" src="doc-files/NonDeliverableTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmSettlementCurrency
 * NonDeliverableTrade.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmFixingConditions
 * NonDeliverableTrade.mmFixingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmOpeningLeg
 * NonDeliverableTrade.mmOpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmClosingLeg
 * NonDeliverableTrade.mmClosingLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmOpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmNonDeliverableTrade
 * FixingCondition.mmNonDeliverableTrade}</li>
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
 * "NonDeliverableTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Foreign exchange contract where one of the exchanged amounts is specified in a non-deliverable currency."
 * </li>
 * </ul>
 */
public class NonDeliverableTrade extends ForeignExchangeTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a non-deliverable contract is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDeliverableTrade, CurrencyCode> mmSettlementCurrency = new MMBusinessAttribute<NonDeliverableTrade, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which a non-deliverable contract is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(NonDeliverableTrade obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(NonDeliverableTrade obj, CurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	protected FixingCondition fixingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmNonDeliverableTrade
	 * FixingCondition.mmNonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<NonDeliverableTrade, FixingCondition> mmFixingConditions = new MMBusinessAssociationEnd<NonDeliverableTrade, FixingCondition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FixingCondition.mmNonDeliverableTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FixingCondition.mmObject();
		}

		@Override
		public FixingCondition getValue(NonDeliverableTrade obj) {
			return obj.getFixingConditions();
		}

		@Override
		public void setValue(NonDeliverableTrade obj, FixingCondition value) {
			obj.setFixingConditions(value);
		}
	};
	protected List<ForeignExchangeTrade> openingLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmOpeningLegRelatedNonDeliverableTrade
	 * ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the opening leg of a non deliverable trade in which the forward rate and amount are specified together with the fixing conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<NonDeliverableTrade, List<ForeignExchangeTrade>> mmOpeningLeg = new MMBusinessAssociationEnd<NonDeliverableTrade, List<ForeignExchangeTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningLeg";
			definition = "Specifies the opening leg of a non deliverable trade in which the forward rate and amount are specified together with the fixing conditions.";
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public List<ForeignExchangeTrade> getValue(NonDeliverableTrade obj) {
			return obj.getOpeningLeg();
		}

		@Override
		public void setValue(NonDeliverableTrade obj, List<ForeignExchangeTrade> value) {
			obj.setOpeningLeg(value);
		}
	};
	protected List<ForeignExchangeTrade> closingLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmClosingLegRelatedNonDeliverableTrade
	 * ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the closing leg of a non deliverable trade in which the amount to be settled is the difference in the deliverable currency betweem its original value and the countervalue calculated against the fixing rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<NonDeliverableTrade, List<ForeignExchangeTrade>> mmClosingLeg = new MMBusinessAssociationEnd<NonDeliverableTrade, List<ForeignExchangeTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingLeg";
			definition = "Specifies the closing leg of a non deliverable trade in which the amount to be settled is the difference in the deliverable currency betweem its original value and the countervalue calculated against the fixing rate.";
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public List<ForeignExchangeTrade> getValue(NonDeliverableTrade obj) {
			return obj.getClosingLeg();
		}

		@Override
		public void setValue(NonDeliverableTrade obj, List<ForeignExchangeTrade> value) {
			obj.setClosingLeg(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableTrade";
				definition = "Foreign exchange contract where one of the exchanged amounts is specified in a non-deliverable currency.";
				associationDomain_lazy = () -> Arrays.asList(ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade, ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade, FixingCondition.mmNonDeliverableTrade);
				superType_lazy = () -> ForeignExchangeTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NonDeliverableTrade.mmSettlementCurrency, com.tools20022.repository.entity.NonDeliverableTrade.mmFixingConditions,
						com.tools20022.repository.entity.NonDeliverableTrade.mmOpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.mmClosingLeg);
			}

			@Override
			public Class<?> getInstanceClass() {
				return NonDeliverableTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public NonDeliverableTrade setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public FixingCondition getFixingConditions() {
		return fixingConditions;
	}

	public NonDeliverableTrade setFixingConditions(FixingCondition fixingConditions) {
		this.fixingConditions = Objects.requireNonNull(fixingConditions);
		return this;
	}

	public List<ForeignExchangeTrade> getOpeningLeg() {
		return openingLeg == null ? openingLeg = new ArrayList<>() : openingLeg;
	}

	public NonDeliverableTrade setOpeningLeg(List<ForeignExchangeTrade> openingLeg) {
		this.openingLeg = Objects.requireNonNull(openingLeg);
		return this;
	}

	public List<ForeignExchangeTrade> getClosingLeg() {
		return closingLeg == null ? closingLeg = new ArrayList<>() : closingLeg;
	}

	public NonDeliverableTrade setClosingLeg(List<ForeignExchangeTrade> closingLeg) {
		this.closingLeg = Objects.requireNonNull(closingLeg);
		return this;
	}
}