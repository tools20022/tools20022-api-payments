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
import com.tools20022.repository.codeset.InstalmentPlanCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PaymentObligation;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#InitialNumberOfInstalment
 * Instalment.InitialNumberOfInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#TotalNumberOfInstalment
 * Instalment.TotalNumberOfInstalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#PeriodUnit
 * Instalment.PeriodUnit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#NumberOfUnits
 * Instalment.NumberOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#SequenceIdentification
 * Instalment.SequenceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
 * Instalment.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#InstalmentPlanType
 * Instalment.InstalmentPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#FirstPaymentAmount
 * Instalment.FirstPaymentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#FirstPaymentDate
 * Instalment.FirstPaymentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
 * InvestmentPlan.Instalment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
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
 * "Instalment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of each successive payment in settlement of a debt or in an investment plan."
 * </li>
 * </ul>
 */
public class Instalment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute InitialNumberOfInstalment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialNumberOfInstalment";
			definition = "Number of pre-paid instalment periods at the time an investment plan is created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	public static final MMBusinessAttribute TotalNumberOfInstalment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfInstalment";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	public static final MMBusinessAttribute PeriodUnit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute NumberOfUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfUnits";
			definition = "Number of period units between consecutive payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	public static final MMBusinessAttribute SequenceIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceIdentification";
			definition = "Specifies the progressive number of a single instalment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Investment plan for which instalment information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
	 * InvestmentPlan.Instalment}</li>
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
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan for which instalment information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Instalment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute InstalmentPlanType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstalmentPlanType";
			definition = "Type of instalment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstalmentPlanCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FirstPaymentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentAmount";
			definition = "Amount of the first payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Instalment";
				definition = "Specifies the details of each successive payment in settlement of a debt or in an investment plan.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Instalment);
				superType_lazy = () -> PaymentObligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Instalment.InitialNumberOfInstalment, com.tools20022.repository.entity.Instalment.TotalNumberOfInstalment,
						com.tools20022.repository.entity.Instalment.PeriodUnit, com.tools20022.repository.entity.Instalment.NumberOfUnits, com.tools20022.repository.entity.Instalment.SequenceIdentification,
						com.tools20022.repository.entity.Instalment.InvestmentPlan, com.tools20022.repository.entity.Instalment.InstalmentPlanType, com.tools20022.repository.entity.Instalment.FirstPaymentAmount,
						com.tools20022.repository.entity.Instalment.FirstPaymentDate);
			}
		});
		return mmObject_lazy.get();
	}
}