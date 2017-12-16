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
import com.tools20022.repository.codeset.PaymentTimeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InterestPaymentDateRange2;
import com.tools20022.repository.msg.LoanContract1;
import com.tools20022.repository.msg.LoanContractTranche1;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#mmAmount
 * PaymentTerms.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#mmPercentage
 * PaymentTerms.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
 * PaymentTerms.mmPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
 * PaymentTerms.mmRelatedPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentTime
 * PaymentTerms.mmPaymentTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentScheduleType
 * PaymentTerms.mmRelatedPaymentScheduleType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedLoan
 * PaymentTerms.mmRelatedLoan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPaymentTerms
 * DateTimePeriod.mmRelatedPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
 * PaymentObligation.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPaymentScheduleType
 * RegisteredContract.mmPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Loan#mmInterestPaymentsSchedule
 * Loan.mmInterestPaymentsSchedule}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#mmAmount
	 * LoanContractTranche1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#mmAmount
	 * InterestPaymentDateRange2.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContractTranche1.mmAmount, InterestPaymentDateRange2.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Specifies that the payment terms apply to an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentTerms.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentage;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmInterestRate
	 * LoanContract1.mmInterestRate}</li>
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
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmInterestRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the payment conditions apply to a percentage of the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentTerms.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod paymentPeriod;
	/**
	 * Period to which the payment terms apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPaymentTerms
	 * DateTimePeriod.mmRelatedPaymentTerms}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentPeriod";
			definition = "Period to which the payment terms apply.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedPaymentTerms;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PaymentObligation relatedPaymentObligation;
	/**
	 * Payment obligation for which payment terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
	 * PaymentObligation.mmPaymentTerms}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentObligation";
			definition = "Payment obligation for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentTerms;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected PaymentTimeCode paymentTime;
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
	public static final MMBusinessAttribute mmPaymentTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTime";
			definition = "Specifies the time of the payment relative to an event such as product delivery or receipt of invoice. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTimeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentTerms.class.getMethod("getPaymentTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegisteredContract relatedPaymentScheduleType;
	/**
	 * Related type of the payment schedule provided in the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPaymentScheduleType
	 * RegisteredContract.mmPaymentScheduleType}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentScheduleType";
			definition = "Related type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmPaymentScheduleType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};
	protected Loan relatedLoan;
	/**
	 * Schedule for the payment of the interests due on the related loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Loan#mmInterestPaymentsSchedule
	 * Loan.mmInterestPaymentsSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedLoan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLoan";
			definition = "Schedule for the payment of the interests due on the related loan.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Loan.mmInterestPaymentsSchedule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Loan.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms";
				definition = "Specifies the payment terms of the obligation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedPaymentTerms, com.tools20022.repository.entity.PaymentObligation.mmPaymentTerms,
						com.tools20022.repository.entity.RegisteredContract.mmPaymentScheduleType, com.tools20022.repository.entity.Loan.mmInterestPaymentsSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentTerms.mmAmount, com.tools20022.repository.entity.PaymentTerms.mmPercentage, com.tools20022.repository.entity.PaymentTerms.mmPaymentPeriod,
						com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation, com.tools20022.repository.entity.PaymentTerms.mmPaymentTime, com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentScheduleType,
						com.tools20022.repository.entity.PaymentTerms.mmRelatedLoan);
				derivationComponent_lazy = () -> Arrays.asList(InterestPaymentDateRange2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentTerms.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	public DateTimePeriod getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(com.tools20022.repository.entity.DateTimePeriod paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	public PaymentObligation getRelatedPaymentObligation() {
		return relatedPaymentObligation;
	}

	public void setRelatedPaymentObligation(com.tools20022.repository.entity.PaymentObligation relatedPaymentObligation) {
		this.relatedPaymentObligation = relatedPaymentObligation;
	}

	public PaymentTimeCode getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(PaymentTimeCode paymentTime) {
		this.paymentTime = paymentTime;
	}

	public RegisteredContract getRelatedPaymentScheduleType() {
		return relatedPaymentScheduleType;
	}

	public void setRelatedPaymentScheduleType(com.tools20022.repository.entity.RegisteredContract relatedPaymentScheduleType) {
		this.relatedPaymentScheduleType = relatedPaymentScheduleType;
	}

	public Loan getRelatedLoan() {
		return relatedLoan;
	}

	public void setRelatedLoan(com.tools20022.repository.entity.Loan relatedLoan) {
		this.relatedLoan = relatedLoan;
	}
}