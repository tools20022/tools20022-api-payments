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
import com.tools20022.repository.codeset.PaymentTimeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.InterestPaymentDateRange2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment terms of the obligation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentTerms" src="doc-files/PaymentTerms.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#Amount
 * PaymentTerms.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#Percentage
 * PaymentTerms.Percentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#PaymentPeriod
 * PaymentTerms.PaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentObligation
 * PaymentTerms.RelatedPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#PaymentTime
 * PaymentTerms.PaymentTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentScheduleType
 * PaymentTerms.RelatedPaymentScheduleType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedLoan
 * PaymentTerms.RelatedLoan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPaymentTerms
 * DateTimePeriod.RelatedPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentTerms
 * PaymentObligation.PaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#PaymentScheduleType
 * RegisteredContract.PaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Loan#InterestPaymentsSchedule
 * Loan.InterestPaymentsSchedule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2
 * InterestPaymentDateRange2}</li>
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
 * "PaymentTerms"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the obligation."</li>
 * </ul>
 */
public class PaymentTerms {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the payment terms apply to an amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#Amount
	 * LoanContractTranche1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#Amount
	 * InterestPaymentDateRange2.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the payment terms apply to an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContractTranche1.Amount, com.tools20022.repository.msg.InterestPaymentDateRange2.Amount);
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Specifies that the payment terms apply to an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies that the payment conditions apply to a percentage of the amount
	 * due.
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
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#InterestRate
	 * LoanContract1.InterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the payment conditions apply to a percentage of the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.InterestRate);
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the payment conditions apply to a percentage of the amount due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Period to which the payment terms apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPaymentTerms
	 * DateTimePeriod.RelatedPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period to which the payment terms apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentPeriod";
			definition = "Period to which the payment terms apply.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment obligation for which payment terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentTerms
	 * PaymentObligation.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment obligation for which payment terms are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentObligation";
			definition = "Payment obligation for which payment terms are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the time of the payment relative to an event such as product
	 * delivery or receipt of invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
	 * PaymentTimeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time of the payment relative to an event such as product delivery or receipt of invoice. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTime";
			definition = "Specifies the time of the payment relative to an event such as product delivery or receipt of invoice. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentTimeCode.mmObject();
		}
	};
	/**
	 * Related type of the payment schedule provided in the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#PaymentScheduleType
	 * RegisteredContract.PaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentScheduleType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related type of the payment schedule provided in the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentScheduleType";
			definition = "Related type of the payment schedule provided in the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Schedule for the payment of the interests due on the related loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Loan#InterestPaymentsSchedule
	 * Loan.InterestPaymentsSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Schedule for the payment of the interests due on the related loan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLoan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentTerms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLoan";
			definition = "Schedule for the payment of the interests due on the related loan.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Loan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Loan.InterestPaymentsSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms";
				definition = "Specifies the payment terms of the obligation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms, com.tools20022.repository.entity.PaymentObligation.PaymentTerms,
						com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType, com.tools20022.repository.entity.Loan.InterestPaymentsSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentTerms.Amount, com.tools20022.repository.entity.PaymentTerms.Percentage, com.tools20022.repository.entity.PaymentTerms.PaymentPeriod,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation, com.tools20022.repository.entity.PaymentTerms.PaymentTime, com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType,
						com.tools20022.repository.entity.PaymentTerms.RelatedLoan);
				derivationComponent_lazy = () -> Arrays.asList(InterestPaymentDateRange2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}