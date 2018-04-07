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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.InterestType1Choice;
import com.tools20022.repository.choice.RateType4Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Set of parameters used to calculate an interest amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InterestCalculation" src="doc-files/InterestCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
 * InterestCalculation.mmDayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
 * InterestCalculation.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
 * InterestCalculation.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
 * InterestCalculation.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
 * InterestCalculation.mmRelatedIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestAccrualDate
 * InterestCalculation.mmInterestAccrualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
 * InterestCalculation.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
 * InterestCalculation.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestType
 * InterestCalculation.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
 * InterestCalculation.mmRateValidityRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestMethod
 * InterestCalculation.mmInterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationFrequency
 * InterestCalculation.mmCalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationDate
 * InterestCalculation.mmCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
 * InterestCalculation.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
 * InterestCalculation.mmDebtInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
 * InterestCalculation.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
 * InterestCalculation.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedInterestManagement
 * InterestCalculation.mmRelatedInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
 * DateTimePeriod.mmRelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
 * AmountRange.mmRelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
 * Charges.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
 * Debt.mmNextInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
 * VariableInterest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
 * Spread.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
 * InterestManagement.mmInterestCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InterestType1Choice
 * InterestType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice
 * RateType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4
 * AccountInterest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest4
 * TransactionInterest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rate4 Rate4}</li>
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
 * "InterestCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of parameters used to calculate an interest amount."</li>
 * </ul>
 */
public class InterestCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InterestComputationMethodCode dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the computation method of accrued interest of the related financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, InterestComputationMethodCode> mmDayCountBasis = new MMBusinessAttribute<InterestCalculation, InterestComputationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}

		@Override
		public InterestComputationMethodCode getValue(InterestCalculation obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(InterestCalculation obj, InterestComputationMethodCode value) {
			obj.setDayCountBasis(value);
		}
	};
	protected PercentageRate rate;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType4Choice#mmPercentage
	 * RateType4Choice.mmPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmRate
	 * AccountInterest4.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, PercentageRate> mmRate = new MMBusinessAttribute<InterestCalculation, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RateType4Choice.mmPercentage, AccountInterest4.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InterestCalculation obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(InterestCalculation obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected List<Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest4#mmRecord
	 * TransactionInterest4.mmRecord}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate4#mmType Rate4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest resulting from the interest calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, List<Interest>> mmInterest = new MMBusinessAssociationEnd<InterestCalculation, List<Interest>>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionInterest4.mmRecord, Rate4.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(InterestCalculation obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(InterestCalculation obj, List<Interest> value) {
			obj.setInterest(value);
		}
	};
	protected InterestRateTypeCode rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice#mmOther
	 * RateType4Choice.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REPT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of rate used to calculate the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, InterestRateTypeCode> mmRateType = new MMBusinessAttribute<InterestCalculation, InterestRateTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RateType4Choice.mmOther);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REPT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}

		@Override
		public InterestRateTypeCode getValue(InterestCalculation obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(InterestCalculation obj, InterestRateTypeCode value) {
			obj.setRateType(value);
		}
	};
	protected DateTimePeriod interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
	 * DateTimePeriod.mmRelatedInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest4#mmFromToDate
	 * AccountInterest4.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord2#mmFromToDate
	 * InterestRecord2.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, DateTimePeriod> mmInterestPeriod = new MMBusinessAssociationEnd<InterestCalculation, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountInterest4.mmFromToDate, InterestRecord2.mmFromToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(InterestCalculation obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(InterestCalculation obj, DateTimePeriod value) {
			obj.setInterestPeriod(value);
		}
	};
	protected PercentageRate relatedIndex;
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate related to the interest rate of the forthcoming interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, PercentageRate> mmRelatedIndex = new MMBusinessAttribute<InterestCalculation, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InterestCalculation obj) {
			return obj.getRelatedIndex();
		}

		@Override
		public void setValue(InterestCalculation obj, PercentageRate value) {
			obj.setRelatedIndex(value);
		}
	};
	protected ISODateTime interestAccrualDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccrualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, ISODateTime> mmInterestAccrualDate = new MMBusinessAttribute<InterestCalculation, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InterestCalculation obj) {
			return obj.getInterestAccrualDate();
		}

		@Override
		public void setValue(InterestCalculation obj, ISODateTime value) {
			obj.setInterestAccrualDate(value);
		}
	};
	protected CalculationMethodCode calculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode
	 * CalculationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the interest is simple or compounded."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, CalculationMethodCode> mmCalculationMethod = new MMBusinessAttribute<InterestCalculation, CalculationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}

		@Override
		public CalculationMethodCode getValue(InterestCalculation obj) {
			return obj.getCalculationMethod();
		}

		@Override
		public void setValue(InterestCalculation obj, CalculationMethodCode value) {
			obj.setCalculationMethod(value);
		}
	};
	protected List<VariableInterest> variableInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
	 * VariableInterest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters to be used for variable interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, List<VariableInterest>> mmVariableInterest = new MMBusinessAssociationEnd<InterestCalculation, List<VariableInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			opposite_lazy = () -> VariableInterest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}

		@Override
		public List<VariableInterest> getValue(InterestCalculation obj) {
			return obj.getVariableInterest();
		}

		@Override
		public void setValue(InterestCalculation obj, List<VariableInterest> value) {
			obj.setVariableInterest(value);
		}
	};
	protected InterestCode interestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.InterestCode
	 * InterestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#mmCode
	 * InterestType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#mmProprietary
	 * InterestType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmType
	 * AccountInterest4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, InterestCode> mmInterestType = new MMBusinessAttribute<InterestCalculation, InterestCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestType1Choice.mmCode, InterestType1Choice.mmProprietary, AccountInterest4.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}

		@Override
		public InterestCode getValue(InterestCalculation obj) {
			return obj.getInterestType();
		}

		@Override
		public void setValue(InterestCalculation obj, InterestCode value) {
			obj.setInterestType(value);
		}
	};
	protected AmountRange rateValidityRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
	 * AmountRange.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRange
	 * AmountRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate4#mmValidityRange
	 * Rate4.mmValidityRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateValidityRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount range for which the interest rate is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, AmountRange> mmRateValidityRange = new MMBusinessAssociationEnd<InterestCalculation, AmountRange>() {
		{
			derivation_lazy = () -> Arrays.asList(Rate4.mmValidityRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRange.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}

		@Override
		public AmountRange getValue(InterestCalculation obj) {
			return obj.getRateValidityRange();
		}

		@Override
		public void setValue(InterestCalculation obj, AmountRange value) {
			obj.setRateValidityRange(value);
		}
	};
	protected InterestMethodCode interestMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestMethodCode
	 * InterestMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, InterestMethodCode> mmInterestMethod = new MMBusinessAttribute<InterestCalculation, InterestMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}

		@Override
		public InterestMethodCode getValue(InterestCalculation obj) {
			return obj.getInterestMethod();
		}

		@Override
		public void setValue(InterestCalculation obj, InterestMethodCode value) {
			obj.setInterestMethod(value);
		}
	};
	protected FrequencyCode calculationFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#mmUnit
	 * InterestRateContractTerm1.mmUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity of the calculation of the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, FrequencyCode> mmCalculationFrequency = new MMBusinessAttribute<InterestCalculation, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRateContractTerm1.mmUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(InterestCalculation obj) {
			return obj.getCalculationFrequency();
		}

		@Override
		public void setValue(InterestCalculation obj, FrequencyCode value) {
			obj.setCalculationFrequency(value);
		}
	};
	protected ISODate calculationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the calculation date of the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, ISODate> mmCalculationDate = new MMBusinessAttribute<InterestCalculation, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(InterestCalculation obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(InterestCalculation obj, ISODate value) {
			obj.setCalculationDate(value);
		}
	};
	protected List<Charges> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
	 * Charges.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, List<Charges>> mmCharges = new MMBusinessAssociationEnd<InterestCalculation, List<Charges>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public List<Charges> getValue(InterestCalculation obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(InterestCalculation obj, List<Charges> value) {
			obj.setCharges(value);
		}
	};
	protected Debt debtInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
	 * Debt.mmNextInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a next interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, Debt> mmDebtInstrument = new MMBusinessAssociationEnd<InterestCalculation, Debt>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Debt.mmNextInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}

		@Override
		public Debt getValue(InterestCalculation obj) {
			return obj.getDebtInstrument();
		}

		@Override
		public void setValue(InterestCalculation obj, Debt value) {
			obj.setDebtInstrument(value);
		}
	};
	protected List<Spread> spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
	 * Spread.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the difference between two interests."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, List<Spread>> mmSpread = new MMBusinessAssociationEnd<InterestCalculation, List<Spread>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			opposite_lazy = () -> Spread.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public List<Spread> getValue(InterestCalculation obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(InterestCalculation obj, List<Spread> value) {
			obj.setSpread(value);
		}
	};
	protected FrequencyCode paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of an interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InterestCalculation, FrequencyCode> mmPaymentFrequency = new MMBusinessAttribute<InterestCalculation, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(InterestCalculation obj) {
			return obj.getPaymentFrequency();
		}

		@Override
		public void setValue(InterestCalculation obj, FrequencyCode value) {
			obj.setPaymentFrequency(value);
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
	 * InterestManagement.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest management process which requires interest calculation.                        "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestCalculation, InterestManagement> mmRelatedInterestManagement = new MMBusinessAssociationEnd<InterestCalculation, InterestManagement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestManagement.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}

		@Override
		public InterestManagement getValue(InterestCalculation obj) {
			return obj.getRelatedInterestManagement();
		}

		@Override
		public void setValue(InterestCalculation obj, InterestManagement value) {
			obj.setRelatedInterestManagement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedInterestCalculation, AmountRange.mmRelatedInterest, Charges.mmRelatedInterest, Interest.mmInterestCalculation, Debt.mmNextInterest,
						VariableInterest.mmInterestCalculation, Spread.mmRelatedInterest, InterestManagement.mmInterestCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.mmDayCountBasis, com.tools20022.repository.entity.InterestCalculation.mmRate,
						com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.InterestCalculation.mmRateType, com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedIndex, com.tools20022.repository.entity.InterestCalculation.mmInterestAccrualDate,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationMethod, com.tools20022.repository.entity.InterestCalculation.mmVariableInterest, com.tools20022.repository.entity.InterestCalculation.mmInterestType,
						com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange, com.tools20022.repository.entity.InterestCalculation.mmInterestMethod,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationFrequency, com.tools20022.repository.entity.InterestCalculation.mmCalculationDate, com.tools20022.repository.entity.InterestCalculation.mmCharges,
						com.tools20022.repository.entity.InterestCalculation.mmDebtInstrument, com.tools20022.repository.entity.InterestCalculation.mmSpread, com.tools20022.repository.entity.InterestCalculation.mmPaymentFrequency,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedInterestManagement);
				derivationComponent_lazy = () -> Arrays.asList(InterestType1Choice.mmObject(), RateType4Choice.mmObject(), AccountInterest4.mmObject(), TransactionInterest4.mmObject(), Rate4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InterestComputationMethodCode getDayCountBasis() {
		return dayCountBasis;
	}

	public InterestCalculation setDayCountBasis(InterestComputationMethodCode dayCountBasis) {
		this.dayCountBasis = Objects.requireNonNull(dayCountBasis);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public InterestCalculation setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public InterestCalculation setInterest(List<Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public InterestRateTypeCode getRateType() {
		return rateType;
	}

	public InterestCalculation setRateType(InterestRateTypeCode rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public DateTimePeriod getInterestPeriod() {
		return interestPeriod;
	}

	public InterestCalculation setInterestPeriod(DateTimePeriod interestPeriod) {
		this.interestPeriod = Objects.requireNonNull(interestPeriod);
		return this;
	}

	public PercentageRate getRelatedIndex() {
		return relatedIndex;
	}

	public InterestCalculation setRelatedIndex(PercentageRate relatedIndex) {
		this.relatedIndex = Objects.requireNonNull(relatedIndex);
		return this;
	}

	public ISODateTime getInterestAccrualDate() {
		return interestAccrualDate;
	}

	public InterestCalculation setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = Objects.requireNonNull(interestAccrualDate);
		return this;
	}

	public CalculationMethodCode getCalculationMethod() {
		return calculationMethod;
	}

	public InterestCalculation setCalculationMethod(CalculationMethodCode calculationMethod) {
		this.calculationMethod = Objects.requireNonNull(calculationMethod);
		return this;
	}

	public List<VariableInterest> getVariableInterest() {
		return variableInterest == null ? variableInterest = new ArrayList<>() : variableInterest;
	}

	public InterestCalculation setVariableInterest(List<VariableInterest> variableInterest) {
		this.variableInterest = Objects.requireNonNull(variableInterest);
		return this;
	}

	public InterestCode getInterestType() {
		return interestType;
	}

	public InterestCalculation setInterestType(InterestCode interestType) {
		this.interestType = Objects.requireNonNull(interestType);
		return this;
	}

	public AmountRange getRateValidityRange() {
		return rateValidityRange;
	}

	public InterestCalculation setRateValidityRange(AmountRange rateValidityRange) {
		this.rateValidityRange = Objects.requireNonNull(rateValidityRange);
		return this;
	}

	public InterestMethodCode getInterestMethod() {
		return interestMethod;
	}

	public InterestCalculation setInterestMethod(InterestMethodCode interestMethod) {
		this.interestMethod = Objects.requireNonNull(interestMethod);
		return this;
	}

	public FrequencyCode getCalculationFrequency() {
		return calculationFrequency;
	}

	public InterestCalculation setCalculationFrequency(FrequencyCode calculationFrequency) {
		this.calculationFrequency = Objects.requireNonNull(calculationFrequency);
		return this;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public InterestCalculation setCalculationDate(ISODate calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public List<Charges> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public InterestCalculation setCharges(List<Charges> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public Debt getDebtInstrument() {
		return debtInstrument;
	}

	public InterestCalculation setDebtInstrument(Debt debtInstrument) {
		this.debtInstrument = Objects.requireNonNull(debtInstrument);
		return this;
	}

	public List<Spread> getSpread() {
		return spread == null ? spread = new ArrayList<>() : spread;
	}

	public InterestCalculation setSpread(List<Spread> spread) {
		this.spread = Objects.requireNonNull(spread);
		return this;
	}

	public FrequencyCode getPaymentFrequency() {
		return paymentFrequency;
	}

	public InterestCalculation setPaymentFrequency(FrequencyCode paymentFrequency) {
		this.paymentFrequency = Objects.requireNonNull(paymentFrequency);
		return this;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public InterestCalculation setRelatedInterestManagement(InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = Objects.requireNonNull(relatedInterestManagement);
		return this;
	}
}