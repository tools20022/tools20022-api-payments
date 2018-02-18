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
import com.tools20022.repository.choice.InterestRate2Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FloatingInterestRate4;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateChangeFrequency
 * VariableInterest.mmVariableRateChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
 * VariableInterest.mmFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
 * VariableInterest.mmInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmReportingDate
 * VariableInterest.mmReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmResetDate
 * VariableInterest.mmResetDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#mmArrears
 * VariableInterest.mmArrears}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
 * VariableInterest.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmYieldCalculation
 * VariableInterest.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmBenchmarkReference
 * VariableInterest.mmBenchmarkReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmEstimatedInterestRate
 * VariableInterest.mmEstimatedInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateValueDate
 * VariableInterest.mmVariableRateValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmLifeCalculation
 * VariableInterest.mmLifeCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmDurationCalculation
 * VariableInterest.mmDurationCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedVariableInterest
 * Security.mmRelatedVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
 * InterestCalculation.mmVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmVariableInterest
 * Index.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmVariableInterest
 * YieldCalculation.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmVariableInterest
 * DurationCalculation.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmVariableInterest
 * LifeCalculation.mmVariableInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#mmFloating
 * InterestRate2Choice.mmFloating}</li>
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
	protected FrequencyCode variableRateChangeFrequency;
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
	public static final MMBusinessAttribute mmVariableRateChangeFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getVariableRateChangeFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime fixingDate;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::FRNR</li>
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
	public static final MMBusinessAttribute mmFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::FRNR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InterestCalculation> interestCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
	 * InterestCalculation.mmVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmInterestCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Interest calculation for which a variable interest is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected ISODateTime reportingDate;
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
	public static final MMBusinessAttribute mmReportingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getReportingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime resetDate;
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
	public static final MMBusinessAttribute mmResetDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getResetDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max16Text arrears;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmArrears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Arrears";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getArrears", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Index> index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmVariableInterest
	 * Index.mmVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Identifies the index used for calculating the interest";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected YieldCalculation yieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmVariableInterest
	 * YieldCalculation.mmVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmYieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	protected Security benchmarkReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedVariableInterest
	 * Security.mmRelatedVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmBenchmarkReference = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkReference";
			definition = "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRelatedVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected PercentageRate estimatedInterestRate;
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
	public static final MMBusinessAttribute mmEstimatedInterestRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedInterestRate";
			definition = "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getEstimatedInterestRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime variableRateValueDate;
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
	public static final MMBusinessAttribute mmVariableRateValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariableInterest.class.getMethod("getVariableRateValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LifeCalculation lifeCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmVariableInterest
	 * LifeCalculation.mmVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmLifeCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Lfe calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
		}
	};
	protected DurationCalculation durationCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmVariableInterest
	 * DurationCalculation.mmVariableInterest}</li>
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
	public static final MMBusinessAssociationEnd mmDurationCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Duration calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmVariableInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VariableInterest";
				definition = "Specifies the estimated interest rate and the parameters used for determining its value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRelatedVariableInterest, com.tools20022.repository.entity.InterestCalculation.mmVariableInterest,
						com.tools20022.repository.entity.Index.mmVariableInterest, com.tools20022.repository.entity.YieldCalculation.mmVariableInterest, com.tools20022.repository.entity.DurationCalculation.mmVariableInterest,
						com.tools20022.repository.entity.LifeCalculation.mmVariableInterest);
				derivationElement_lazy = () -> Arrays.asList(InterestRate2Choice.mmFloating);
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.VariableInterest.mmVariableRateChangeFrequency, com.tools20022.repository.entity.VariableInterest.mmFixingDate,
								com.tools20022.repository.entity.VariableInterest.mmInterestCalculation, com.tools20022.repository.entity.VariableInterest.mmReportingDate, com.tools20022.repository.entity.VariableInterest.mmResetDate,
								com.tools20022.repository.entity.VariableInterest.mmArrears, com.tools20022.repository.entity.VariableInterest.mmIndex, com.tools20022.repository.entity.VariableInterest.mmYieldCalculation,
								com.tools20022.repository.entity.VariableInterest.mmBenchmarkReference, com.tools20022.repository.entity.VariableInterest.mmEstimatedInterestRate,
								com.tools20022.repository.entity.VariableInterest.mmVariableRateValueDate, com.tools20022.repository.entity.VariableInterest.mmLifeCalculation,
								com.tools20022.repository.entity.VariableInterest.mmDurationCalculation);
				derivationComponent_lazy = () -> Arrays.asList(FloatingInterestRate4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return VariableInterest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FrequencyCode getVariableRateChangeFrequency() {
		return variableRateChangeFrequency;
	}

	public VariableInterest setVariableRateChangeFrequency(FrequencyCode variableRateChangeFrequency) {
		this.variableRateChangeFrequency = Objects.requireNonNull(variableRateChangeFrequency);
		return this;
	}

	public ISODateTime getFixingDate() {
		return fixingDate;
	}

	public VariableInterest setFixingDate(ISODateTime fixingDate) {
		this.fixingDate = Objects.requireNonNull(fixingDate);
		return this;
	}

	public List<InterestCalculation> getInterestCalculation() {
		return interestCalculation == null ? interestCalculation = new ArrayList<>() : interestCalculation;
	}

	public VariableInterest setInterestCalculation(List<com.tools20022.repository.entity.InterestCalculation> interestCalculation) {
		this.interestCalculation = Objects.requireNonNull(interestCalculation);
		return this;
	}

	public ISODateTime getReportingDate() {
		return reportingDate;
	}

	public VariableInterest setReportingDate(ISODateTime reportingDate) {
		this.reportingDate = Objects.requireNonNull(reportingDate);
		return this;
	}

	public ISODateTime getResetDate() {
		return resetDate;
	}

	public VariableInterest setResetDate(ISODateTime resetDate) {
		this.resetDate = Objects.requireNonNull(resetDate);
		return this;
	}

	public Max16Text getArrears() {
		return arrears;
	}

	public VariableInterest setArrears(Max16Text arrears) {
		this.arrears = Objects.requireNonNull(arrears);
		return this;
	}

	public List<Index> getIndex() {
		return index == null ? index = new ArrayList<>() : index;
	}

	public VariableInterest setIndex(List<com.tools20022.repository.entity.Index> index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public YieldCalculation getYieldCalculation() {
		return yieldCalculation;
	}

	public VariableInterest setYieldCalculation(com.tools20022.repository.entity.YieldCalculation yieldCalculation) {
		this.yieldCalculation = Objects.requireNonNull(yieldCalculation);
		return this;
	}

	public Security getBenchmarkReference() {
		return benchmarkReference;
	}

	public VariableInterest setBenchmarkReference(com.tools20022.repository.entity.Security benchmarkReference) {
		this.benchmarkReference = Objects.requireNonNull(benchmarkReference);
		return this;
	}

	public PercentageRate getEstimatedInterestRate() {
		return estimatedInterestRate;
	}

	public VariableInterest setEstimatedInterestRate(PercentageRate estimatedInterestRate) {
		this.estimatedInterestRate = Objects.requireNonNull(estimatedInterestRate);
		return this;
	}

	public ISODateTime getVariableRateValueDate() {
		return variableRateValueDate;
	}

	public VariableInterest setVariableRateValueDate(ISODateTime variableRateValueDate) {
		this.variableRateValueDate = Objects.requireNonNull(variableRateValueDate);
		return this;
	}

	public LifeCalculation getLifeCalculation() {
		return lifeCalculation;
	}

	public VariableInterest setLifeCalculation(com.tools20022.repository.entity.LifeCalculation lifeCalculation) {
		this.lifeCalculation = Objects.requireNonNull(lifeCalculation);
		return this;
	}

	public DurationCalculation getDurationCalculation() {
		return durationCalculation;
	}

	public VariableInterest setDurationCalculation(com.tools20022.repository.entity.DurationCalculation durationCalculation) {
		this.durationCalculation = Objects.requireNonNull(durationCalculation);
		return this;
	}
}