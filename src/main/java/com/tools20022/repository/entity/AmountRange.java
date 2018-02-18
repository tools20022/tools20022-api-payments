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
import com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyAndAmountRange2;
import com.tools20022.repository.msg.FromToAmountRange;
import com.tools20022.repository.msg.InterestRecord1;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromToAmount
 * ImpliedCurrencyAmountRangeChoice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmAmount
 * CurrencyAndAmountRange2.mmAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FromToAmountRange
 * FromToAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
 * ImpliedCurrencyAmountRangeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2
 * CurrencyAndAmountRange2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange#mmFromAmount
	 * FromToAmountRange.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromAmount
	 * ImpliedCurrencyAmountRangeChoice.mmFromAmount}</li>
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
	public static final MMBusinessAssociationEnd mmFromAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FromToAmountRange.mmFromAmount, ImpliedCurrencyAmountRangeChoice.mmFromAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmFromAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange#mmToAmount
	 * FromToAmountRange.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmToAmount
	 * ImpliedCurrencyAmountRangeChoice.mmToAmount}</li>
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
	public static final MMBusinessAssociationEnd mmToAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FromToAmountRange.mmToAmount, ImpliedCurrencyAmountRangeChoice.mmToAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmToAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmEqualAmount
	 * ImpliedCurrencyAmountRangeChoice.mmEqualAmount}</li>
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
	public static final MMBusinessAttribute mmEqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getEqualAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmNotEqualAmount
	 * ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount}</li>
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
	public static final MMBusinessAttribute mmNotEqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getNotEqualAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmCreditDebitIndicator
	 * CurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord1#mmCreditDebitIndicator
	 * InterestRecord1.mmCreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyAndAmountRange2.mmCreditDebitIndicator, InterestRecord1.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmCurrency
	 * CurrencyAndAmountRange2.mmCurrency}</li>
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyAndAmountRange2.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMBusinessAssociationEnd mmRelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest which applies on a specific amount range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRange";
				definition = "Range of amount values.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.mmFromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.mmToAmountRange,
						com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange);
				derivationElement_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmFromToAmount, CurrencyAndAmountRange2.mmAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.mmFromAmount, com.tools20022.repository.entity.AmountRange.mmToAmount, com.tools20022.repository.entity.AmountRange.mmEqualAmount,
						com.tools20022.repository.entity.AmountRange.mmNotEqualAmount, com.tools20022.repository.entity.AmountRange.mmCreditDebitIndicator, com.tools20022.repository.entity.AmountRange.mmCurrency,
						com.tools20022.repository.entity.AmountRange.mmRelatedInterest);
				derivationComponent_lazy = () -> Arrays.asList(FromToAmountRange.mmObject(), ImpliedCurrencyAmountRangeChoice.mmObject(), CurrencyAndAmountRange2.mmObject());
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

	public AmountRange setFromAmount(com.tools20022.repository.entity.AmountRangeBoundary fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary getToAmount() {
		return toAmount;
	}

	public AmountRange setToAmount(com.tools20022.repository.entity.AmountRangeBoundary toAmount) {
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

	public AmountRange setRelatedInterest(com.tools20022.repository.entity.InterestCalculation relatedInterest) {
		this.relatedInterest = relatedInterest;
		return this;
	}
}