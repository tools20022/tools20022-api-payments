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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.FloatingInterestRate4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the estimated interest rate and the parameters used for determining
 * its value.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VariableInterest" src="doc-files/VariableInterest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#VariableRateChangeFrequency
 * VariableInterest.VariableRateChangeFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#FixingDate
 * VariableInterest.FixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
 * VariableInterest.InterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#ReportingDate
 * VariableInterest.ReportingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#ResetDate
 * VariableInterest.ResetDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#Arrears
 * VariableInterest.Arrears}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#Index
 * VariableInterest.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#YieldCalculation
 * VariableInterest.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
 * VariableInterest.BenchmarkReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#EstimatedInterestRate
 * VariableInterest.EstimatedInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#VariableRateValueDate
 * VariableInterest.VariableRateValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#LifeCalculation
 * VariableInterest.LifeCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#DurationCalculation
 * VariableInterest.DurationCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
 * Security.RelatedVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
 * InterestCalculation.VariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#VariableInterest
 * Index.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#VariableInterest
 * YieldCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#VariableInterest
 * DurationCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#VariableInterest
 * LifeCalculation.VariableInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#Floating
 * InterestRate2Choice.Floating}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4
 * FloatingInterestRate4}</li>
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
 * "VariableInterest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the estimated interest rate and the parameters used for determining its value."
 * </li>
 * </ul>
 */
public class VariableInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the frequency of change to the variable rate of an interest
	 * bearing instrument.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateChangeFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date/time at which the rate determination is made, also called
	 * determination date, for instance the date the interest rate of a floating
	 * rate note will be/was calculated, according to the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FixingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Interest calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
	 * InterestCalculation.VariableInterest}</li>
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Interest calculation for which a variable interest is used.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Last date the new interest rate must be reported to the market.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date the new interest rate must be reported to the market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReportingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the interest rate of an interest bearing instrument
	 * will be reset, according to the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResetDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResetDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates that the rate reset will occur at the end of the payment period
	 * (True case)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arrears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the rate reset will occur at the end of the payment period (True case)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Arrears = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Arrears";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Identifies the index used for calculating the interest
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#VariableInterest
	 * Index.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the index used for calculating the interest"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Identifies the index used for calculating the interest";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Yield calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#VariableInterest
	 * YieldCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Benchmark rate against which variable rate instruments are measured to
	 * determine the interest rate, for example, LIBOR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
	 * Security.RelatedVariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BenchmarkReference = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkReference";
			definition = "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedVariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Estimated per annum ratio of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstimatedInterestRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedInterestRate";
			definition = "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as of which the variable rate is valid.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time as of which the variable rate is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateValueDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Lfe calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#VariableInterest
	 * LifeCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lfe calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Lfe calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Duration calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#VariableInterest
	 * DurationCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Duration calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Duration calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VariableInterest";
				definition = "Specifies the estimated interest rate and the parameters used for determining its value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedVariableInterest, com.tools20022.repository.entity.InterestCalculation.VariableInterest,
						com.tools20022.repository.entity.Index.VariableInterest, com.tools20022.repository.entity.YieldCalculation.VariableInterest, com.tools20022.repository.entity.DurationCalculation.VariableInterest,
						com.tools20022.repository.entity.LifeCalculation.VariableInterest);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRate2Choice.Floating);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VariableInterest.VariableRateChangeFrequency, com.tools20022.repository.entity.VariableInterest.FixingDate,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.VariableInterest.ReportingDate, com.tools20022.repository.entity.VariableInterest.ResetDate,
						com.tools20022.repository.entity.VariableInterest.Arrears, com.tools20022.repository.entity.VariableInterest.Index, com.tools20022.repository.entity.VariableInterest.YieldCalculation,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.VariableInterest.EstimatedInterestRate, com.tools20022.repository.entity.VariableInterest.VariableRateValueDate,
						com.tools20022.repository.entity.VariableInterest.LifeCalculation, com.tools20022.repository.entity.VariableInterest.DurationCalculation);
				derivationComponent_lazy = () -> Arrays.asList(FloatingInterestRate4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}