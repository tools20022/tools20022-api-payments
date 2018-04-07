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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Current totals of the ATM.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ATMTotal" src="doc-files/ATMTotal.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalance
 * ATMTotal.mmATMBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmCurrency
 * ATMTotal.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrentNumber
 * ATMTotal.mmATMCurrentNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalanceNumber
 * ATMTotal.mmATMBalanceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrent
 * ATMTotal.mmATMCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
 * ATMTotal.mmRelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
 * CardPayment.mmATMTotal}</li>
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
 * "ATMTotal"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Current totals of the ATM."</li>
 * </ul>
 */
public class ATMTotal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount aTMBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of the ATM including reject cassette, but excluding the retract cassette."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ATMTotal, ImpliedCurrencyAndAmount> mmATMBalance = new MMBusinessAttribute<ATMTotal, ImpliedCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMBalance";
			definition = "Total balance of the ATM including reject cassette, but excluding the retract cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ATMTotal obj) {
			return obj.getATMBalance();
		}

		@Override
		public void setValue(ATMTotal obj, ImpliedCurrencyAndAmount value) {
			obj.setATMBalance(value);
		}
	};
	protected CurrencyCode currency;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the totals."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ATMTotal, CurrencyCode> mmCurrency = new MMBusinessAttribute<ATMTotal, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the totals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(ATMTotal obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMTotal obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected Number aTMCurrentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, excluding reject cassette."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ATMTotal, Number> mmATMCurrentNumber = new MMBusinessAttribute<ATMTotal, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMCurrentNumber";
			definition = "Total number of units for non-valued media, excluding reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ATMTotal obj) {
			return obj.getATMCurrentNumber();
		}

		@Override
		public void setValue(ATMTotal obj, Number value) {
			obj.setATMCurrentNumber(value);
		}
	};
	protected Number aTMBalanceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalanceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, including reject cassette."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ATMTotal, Number> mmATMBalanceNumber = new MMBusinessAttribute<ATMTotal, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMBalanceNumber";
			definition = "Total number of units for non-valued media, including reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ATMTotal obj) {
			return obj.getATMBalanceNumber();
		}

		@Override
		public void setValue(ATMTotal obj, Number value) {
			obj.setATMBalanceNumber(value);
		}
	};
	protected ImpliedCurrencyAndAmount aTMCurrent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available amount for dispense in the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ATMTotal, ImpliedCurrencyAndAmount> mmATMCurrent = new MMBusinessAttribute<ATMTotal, ImpliedCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMCurrent";
			definition = "Available amount for dispense in the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ATMTotal obj) {
			return obj.getATMCurrent();
		}

		@Override
		public void setValue(ATMTotal obj, ImpliedCurrencyAndAmount value) {
			obj.setATMCurrent(value);
		}
	};
	protected List<CardPayment> relatedCardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
	 * CardPayment.mmATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related payments representing the current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ATMTotal, List<CardPayment>> mmRelatedCardPayment = new MMBusinessAssociationEnd<ATMTotal, List<CardPayment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Related payments representing the current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> CardPayment.mmATMTotal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}

		@Override
		public List<CardPayment> getValue(ATMTotal obj) {
			return obj.getRelatedCardPayment();
		}

		@Override
		public void setValue(ATMTotal obj, List<CardPayment> value) {
			obj.setRelatedCardPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTotal";
				definition = "Current totals of the ATM.";
				associationDomain_lazy = () -> Arrays.asList(CardPayment.mmATMTotal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ATMTotal.mmATMBalance, com.tools20022.repository.entity.ATMTotal.mmCurrency, com.tools20022.repository.entity.ATMTotal.mmATMCurrentNumber,
						com.tools20022.repository.entity.ATMTotal.mmATMBalanceNumber, com.tools20022.repository.entity.ATMTotal.mmATMCurrent, com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMTotal.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmount getATMBalance() {
		return aTMBalance;
	}

	public ATMTotal setATMBalance(ImpliedCurrencyAndAmount aTMBalance) {
		this.aTMBalance = Objects.requireNonNull(aTMBalance);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public ATMTotal setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Number getATMCurrentNumber() {
		return aTMCurrentNumber;
	}

	public ATMTotal setATMCurrentNumber(Number aTMCurrentNumber) {
		this.aTMCurrentNumber = Objects.requireNonNull(aTMCurrentNumber);
		return this;
	}

	public Number getATMBalanceNumber() {
		return aTMBalanceNumber;
	}

	public ATMTotal setATMBalanceNumber(Number aTMBalanceNumber) {
		this.aTMBalanceNumber = Objects.requireNonNull(aTMBalanceNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getATMCurrent() {
		return aTMCurrent;
	}

	public ATMTotal setATMCurrent(ImpliedCurrencyAndAmount aTMCurrent) {
		this.aTMCurrent = Objects.requireNonNull(aTMCurrent);
		return this;
	}

	public List<CardPayment> getRelatedCardPayment() {
		return relatedCardPayment == null ? relatedCardPayment = new ArrayList<>() : relatedCardPayment;
	}

	public ATMTotal setRelatedCardPayment(List<CardPayment> relatedCardPayment) {
		this.relatedCardPayment = Objects.requireNonNull(relatedCardPayment);
		return this;
	}
}