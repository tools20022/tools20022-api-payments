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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InstalmentPlanCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the details of each successive payment in settlement of a debt or
 * in an investment plan.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Instalment" src="doc-files/Instalment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmInitialNumberOfInstalment
 * Instalment.mmInitialNumberOfInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
 * Instalment.mmTotalNumberOfInstalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
 * Instalment.mmPeriodUnit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmNumberOfUnits
 * Instalment.mmNumberOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmSequenceIdentification
 * Instalment.mmSequenceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmInvestmentPlan
 * Instalment.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmInstalmentPlanType
 * Instalment.mmInstalmentPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentAmount
 * Instalment.mmFirstPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentDate
 * Instalment.mmFirstPaymentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
 * InvestmentPlan.mmInstalment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instalment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of each successive payment in settlement of a debt or in an investment plan."
 * </li>
 * </ul>
 */
public class Instalment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number initialNumberOfInstalment;
	/**
	 * Number of pre-paid instalment periods at the time an investment plan is
	 * created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of pre-paid instalment periods at the time an investment plan is created."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInitialNumberOfInstalment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialNumberOfInstalment";
			definition = "Number of pre-paid instalment periods at the time an investment plan is created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getInitialNumberOfInstalment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number totalNumberOfInstalment;
	/**
	 * Total number of times the amount must be invested at the predefined
	 * frequency as of the start date of the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfInstalment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfInstalment";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getTotalNumberOfInstalment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode periodUnit;
	/**
	 * Period unit between consecutive payments (for example day, month, year).
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
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period unit between consecutive payments (for example day, month, year)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPeriodUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getPeriodUnit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number numberOfUnits;
	/**
	 * Number of period units between consecutive payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of period units between consecutive payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfUnits";
			definition = "Number of period units between consecutive payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getNumberOfUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text sequenceIdentification;
	/**
	 * Specifies the progressive number of a single instalment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the progressive number of a single instalment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSequenceIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceIdentification";
			definition = "Specifies the progressive number of a single instalment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getSequenceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan for which instalment information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
	 * InvestmentPlan.mmInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment plan for which instalment information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan for which instalment information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmInstalment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected InstalmentPlanCode instalmentPlanType;
	/**
	 * Type of instalment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
	 * InstalmentPlanCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instalment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstalmentPlanType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentPlanType";
			definition = "Type of instalment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstalmentPlanCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getInstalmentPlanType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount firstPaymentAmount;
	/**
	 * Amount of the first payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the first payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstPaymentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentAmount";
			definition = "Amount of the first payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getFirstPaymentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime firstPaymentDate;
	/**
	 * Date of the first payment.
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
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Instalment.class.getMethod("getFirstPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instalment";
				definition = "Specifies the details of each successive payment in settlement of a debt or in an investment plan.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.mmInstalment);
				superType_lazy = () -> PaymentObligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Instalment.mmInitialNumberOfInstalment, com.tools20022.repository.entity.Instalment.mmTotalNumberOfInstalment,
						com.tools20022.repository.entity.Instalment.mmPeriodUnit, com.tools20022.repository.entity.Instalment.mmNumberOfUnits, com.tools20022.repository.entity.Instalment.mmSequenceIdentification,
						com.tools20022.repository.entity.Instalment.mmInvestmentPlan, com.tools20022.repository.entity.Instalment.mmInstalmentPlanType, com.tools20022.repository.entity.Instalment.mmFirstPaymentAmount,
						com.tools20022.repository.entity.Instalment.mmFirstPaymentDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Instalment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getInitialNumberOfInstalment() {
		return initialNumberOfInstalment;
	}

	public void setInitialNumberOfInstalment(Number initialNumberOfInstalment) {
		this.initialNumberOfInstalment = initialNumberOfInstalment;
	}

	public Number getTotalNumberOfInstalment() {
		return totalNumberOfInstalment;
	}

	public void setTotalNumberOfInstalment(Number totalNumberOfInstalment) {
		this.totalNumberOfInstalment = totalNumberOfInstalment;
	}

	public FrequencyCode getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(FrequencyCode periodUnit) {
		this.periodUnit = periodUnit;
	}

	public Number getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Number numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public Max70Text getSequenceIdentification() {
		return sequenceIdentification;
	}

	public void setSequenceIdentification(Max70Text sequenceIdentification) {
		this.sequenceIdentification = sequenceIdentification;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public InstalmentPlanCode getInstalmentPlanType() {
		return instalmentPlanType;
	}

	public void setInstalmentPlanType(InstalmentPlanCode instalmentPlanType) {
		this.instalmentPlanType = instalmentPlanType;
	}

	public CurrencyAndAmount getFirstPaymentAmount() {
		return firstPaymentAmount;
	}

	public void setFirstPaymentAmount(CurrencyAndAmount firstPaymentAmount) {
		this.firstPaymentAmount = firstPaymentAmount;
	}

	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}
}