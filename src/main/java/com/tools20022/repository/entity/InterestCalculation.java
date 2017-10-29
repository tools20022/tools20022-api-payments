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
import com.tools20022.repository.choice.InterestType1Choice;
import com.tools20022.repository.choice.RateType4Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.AccountInterest3;
import com.tools20022.repository.msg.Rate3;
import com.tools20022.repository.msg.TransactionInterest3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DayCountBasis
 * InterestCalculation.DayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Rate
 * InterestCalculation.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
 * InterestCalculation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateType
 * InterestCalculation.RateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestPeriod
 * InterestCalculation.InterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RelatedIndex
 * InterestCalculation.RelatedIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestAccrualDate
 * InterestCalculation.InterestAccrualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationMethod
 * InterestCalculation.CalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
 * InterestCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestType
 * InterestCalculation.InterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateValidityRange
 * InterestCalculation.RateValidityRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestMethod
 * InterestCalculation.InterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationFrequency
 * InterestCalculation.CalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationDate
 * InterestCalculation.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
 * InterestCalculation.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
 * InterestCalculation.DebtInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Spread
 * InterestCalculation.Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#PaymentFrequency
 * InterestCalculation.PaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RelatedInterestManagement
 * InterestCalculation.RelatedInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInterestCalculation
 * DateTimePeriod.RelatedInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#RelatedInterest
 * AmountRange.RelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
 * Charges.RelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
 * Interest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextInterest
 * Debt.NextInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
 * VariableInterest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#RelatedInterest
 * Spread.RelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#InterestCalculation
 * InterestManagement.InterestCalculation}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Rate3 Rate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3
 * AccountInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest3
 * TransactionInterest3}</li>
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
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
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
	public static final MMBusinessAttribute DayCountBasis = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}
	};
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.RateType4Choice#Percentage
	 * RateType4Choice.Percentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Rate
	 * AccountInterest3.Rate}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType4Choice.Percentage, com.tools20022.repository.msg.AccountInterest3.Rate);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest resulting from the interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
	 * Interest.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#Type Rate3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest3#Record
	 * TransactionInterest3.Record}</li>
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
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rate3.Type, com.tools20022.repository.msg.TransactionInterest3.Record);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of rate used to calculate the interest.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice#Other
	 * RateType4Choice.Other}</li>
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
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of rate used to calculate the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType4Choice.Other);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}
	};
	/**
	 * Period during which the interest rate has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInterestCalculation
	 * DateTimePeriod.RelatedInterestCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3#FromToDate
	 * AccountInterest3.FromToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#FromToDate
	 * InterestRecord1.FromToDate}</li>
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
	public static final MMBusinessAssociationEnd InterestPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountInterest3.FromToDate, com.tools20022.repository.msg.InterestRecord1.FromToDate);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Index rate related to the interest rate of the forthcoming interest
	 * payment.
	 * <p>
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
	public static final MMBusinessAttribute RelatedIndex = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the issue date and the dated date.
	 * <p>
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
	public static final MMBusinessAttribute InterestAccrualDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the interest is simple or compounded.
	 * <p>
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
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the parameters to be used for variable interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
	 * VariableInterest.InterestCalculation}</li>
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
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of interest.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#Code
	 * InterestType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#Proprietary
	 * InterestType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Type
	 * AccountInterest3.Type}</li>
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
	public static final MMBusinessAttribute InterestType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestType1Choice.Code, com.tools20022.repository.choice.InterestType1Choice.Proprietary, com.tools20022.repository.msg.AccountInterest3.Type);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}
	};
	/**
	 * Specifies the amount range for which the interest rate is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#RelatedInterest
	 * AmountRange.RelatedInterest}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#ValidityRange
	 * Rate3.ValidityRange}</li>
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
	public static final MMBusinessAssociationEnd RateValidityRange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rate3.ValidityRange);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest will be settled in cash or rolled in the
	 * existing collateral balance.
	 * <p>
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
	public static final MMBusinessAttribute InterestMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the periodicity of the calculation of the interest.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#Unit
	 * InterestRateContractTerm1.Unit}</li>
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
	public static final MMBusinessAttribute CalculationFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestRateContractTerm1.Unit);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the calculation date of the interest amount.
	 * <p>
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
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the charges on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
	 * Charges.RelatedInterest}</li>
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
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a next interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#NextInterest
	 * Debt.NextInterest}</li>
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
	public static final MMBusinessAssociationEnd DebtInstrument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.NextInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the difference between two interests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#RelatedInterest
	 * Spread.RelatedInterest}</li>
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
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the frequency of an interest payment.
	 * <p>
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
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Interest management process which requires interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#InterestCalculation
	 * InterestManagement.InterestCalculation}</li>
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
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation, com.tools20022.repository.entity.AmountRange.RelatedInterest,
						com.tools20022.repository.entity.Charges.RelatedInterest, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Debt.NextInterest,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.Spread.RelatedInterest, com.tools20022.repository.entity.InterestManagement.InterestCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.DayCountBasis, com.tools20022.repository.entity.InterestCalculation.Rate,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.InterestCalculation.RateType, com.tools20022.repository.entity.InterestCalculation.InterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.RelatedIndex, com.tools20022.repository.entity.InterestCalculation.InterestAccrualDate, com.tools20022.repository.entity.InterestCalculation.CalculationMethod,
						com.tools20022.repository.entity.InterestCalculation.VariableInterest, com.tools20022.repository.entity.InterestCalculation.InterestType, com.tools20022.repository.entity.InterestCalculation.RateValidityRange,
						com.tools20022.repository.entity.InterestCalculation.InterestMethod, com.tools20022.repository.entity.InterestCalculation.CalculationFrequency, com.tools20022.repository.entity.InterestCalculation.CalculationDate,
						com.tools20022.repository.entity.InterestCalculation.Charges, com.tools20022.repository.entity.InterestCalculation.DebtInstrument, com.tools20022.repository.entity.InterestCalculation.Spread,
						com.tools20022.repository.entity.InterestCalculation.PaymentFrequency, com.tools20022.repository.entity.InterestCalculation.RelatedInterestManagement);
				derivationComponent_lazy = () -> Arrays.asList(InterestType1Choice.mmObject(), RateType4Choice.mmObject(), Rate3.mmObject(), AccountInterest3.mmObject(), TransactionInterest3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}