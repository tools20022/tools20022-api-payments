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
import com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AmountRangeBoundary;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2;
import com.tools20022.repository.msg.FromToAmountRange1;
import com.tools20022.repository.msg.InterestRecord2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Range of amount values.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmountRange" src="doc-files/AmountRange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
 * AmountRange.mmFromAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
 * AmountRange.mmToAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmEqualAmount
 * AmountRange.mmEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmNotEqualAmount
 * AmountRange.mmNotEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmCreditDebitIndicator
 * AmountRange.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmCurrency
 * AmountRange.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
 * AmountRange.mmRelatedInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmFromAmountRange
 * AmountRangeBoundary.mmFromAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmToAmountRange
 * AmountRangeBoundary.mmToAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
 * InterestCalculation.mmRateValidityRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromToAmount
 * ImpliedCurrencyAmountRange1Choice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmAmount
 * ActiveOrHistoricCurrencyAndAmountRange2.mmAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
 * ImpliedCurrencyAmountRange1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2
 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FromToAmountRange1
 * FromToAmountRange1}</li>
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
 * "AmountRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Range of amount values."</li>
 * </ul>
 */
public class AmountRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountRangeBoundary fromAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmFromAmountRange
	 * AmountRangeBoundary.mmFromAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromAmount
	 * ImpliedCurrencyAmountRange1Choice.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange1#mmFromAmount
	 * FromToAmountRange1.mmFromAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AmountRange, AmountRangeBoundary> mmFromAmount = new MMBusinessAssociationEnd<AmountRange, AmountRangeBoundary>() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmFromAmount, FromToAmountRange1.mmFromAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRangeBoundary.mmFromAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRangeBoundary.mmObject();
		}

		@Override
		public AmountRangeBoundary getValue(AmountRange obj) {
			return obj.getFromAmount();
		}

		@Override
		public void setValue(AmountRange obj, AmountRangeBoundary value) {
			obj.setFromAmount(value);
		}
	};
	protected AmountRangeBoundary toAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmToAmountRange
	 * AmountRangeBoundary.mmToAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmToAmount
	 * ImpliedCurrencyAmountRange1Choice.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange1#mmToAmount
	 * FromToAmountRange1.mmToAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AmountRange, AmountRangeBoundary> mmToAmount = new MMBusinessAssociationEnd<AmountRange, AmountRangeBoundary>() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmToAmount, FromToAmountRange1.mmToAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRangeBoundary.mmToAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRangeBoundary.mmObject();
		}

		@Override
		public AmountRangeBoundary getValue(AmountRange obj) {
			return obj.getToAmount();
		}

		@Override
		public void setValue(AmountRange obj, AmountRangeBoundary value) {
			obj.setToAmount(value);
		}
	};
	protected CurrencyAndAmount equalAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmEqualAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact value an amount must match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRange, CurrencyAndAmount> mmEqualAmount = new MMBusinessAttribute<AmountRange, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AmountRange obj) {
			return obj.getEqualAmount();
		}

		@Override
		public void setValue(AmountRange obj, CurrencyAndAmount value) {
			obj.setEqualAmount(value);
		}
	};
	protected CurrencyAndAmount notEqualAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmNotEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that an amount must not match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRange, CurrencyAndAmount> mmNotEqualAmount = new MMBusinessAttribute<AmountRange, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AmountRange obj) {
			return obj.getNotEqualAmount();
		}

		@Override
		public void setValue(AmountRange obj, CurrencyAndAmount value) {
			obj.setNotEqualAmount(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmCreditDebitIndicator
	 * ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord2#mmCreditDebitIndicator
	 * InterestRecord2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the amount is a credited or debited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRange, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<AmountRange, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator, InterestRecord2.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(AmountRange obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(AmountRange obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmCurrency
	 * ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value, used to qualify an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRange, CurrencyCode> mmCurrency = new MMBusinessAttribute<AmountRange, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(AmountRange obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(AmountRange obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected InterestCalculation relatedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
	 * InterestCalculation.mmRateValidityRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which applies on a specific amount range."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AmountRange, Optional<InterestCalculation>> mmRelatedInterest = new MMBusinessAssociationEnd<AmountRange, Optional<InterestCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest which applies on a specific amount range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InterestCalculation.mmRateValidityRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public Optional<InterestCalculation> getValue(AmountRange obj) {
			return obj.getRelatedInterest();
		}

		@Override
		public void setValue(AmountRange obj, Optional<InterestCalculation> value) {
			obj.setRelatedInterest(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRange";
				definition = "Range of amount values.";
				associationDomain_lazy = () -> Arrays.asList(AmountRangeBoundary.mmFromAmountRange, AmountRangeBoundary.mmToAmountRange, InterestCalculation.mmRateValidityRange);
				derivationElement_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmFromToAmount, ActiveOrHistoricCurrencyAndAmountRange2.mmAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.mmFromAmount, com.tools20022.repository.entity.AmountRange.mmToAmount, com.tools20022.repository.entity.AmountRange.mmEqualAmount,
						com.tools20022.repository.entity.AmountRange.mmNotEqualAmount, com.tools20022.repository.entity.AmountRange.mmCreditDebitIndicator, com.tools20022.repository.entity.AmountRange.mmCurrency,
						com.tools20022.repository.entity.AmountRange.mmRelatedInterest);
				derivationComponent_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmObject(), ActiveOrHistoricCurrencyAndAmountRange2.mmObject(), FromToAmountRange1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmountRange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRangeBoundary getFromAmount() {
		return fromAmount;
	}

	public AmountRange setFromAmount(AmountRangeBoundary fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary getToAmount() {
		return toAmount;
	}

	public AmountRange setToAmount(AmountRangeBoundary toAmount) {
		this.toAmount = Objects.requireNonNull(toAmount);
		return this;
	}

	public CurrencyAndAmount getEqualAmount() {
		return equalAmount;
	}

	public AmountRange setEqualAmount(CurrencyAndAmount equalAmount) {
		this.equalAmount = Objects.requireNonNull(equalAmount);
		return this;
	}

	public CurrencyAndAmount getNotEqualAmount() {
		return notEqualAmount;
	}

	public AmountRange setNotEqualAmount(CurrencyAndAmount notEqualAmount) {
		this.notEqualAmount = Objects.requireNonNull(notEqualAmount);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public AmountRange setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public AmountRange setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<InterestCalculation> getRelatedInterest() {
		return relatedInterest == null ? Optional.empty() : Optional.of(relatedInterest);
	}

	public AmountRange setRelatedInterest(InterestCalculation relatedInterest) {
		this.relatedInterest = relatedInterest;
		return this;
	}
}