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
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Act of provding an amount of money, a property or other material goods to a
 * another party in exchange for future repayment of the principal amount along
 * with interest or other finance charges.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Loan" src="doc-files/Loan.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Loan#mmPrincipalAmount
 * Loan.mmPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Loan#mmInterestPaymentsSchedule
 * Loan.mmInterestPaymentsSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Loan#mmIntraCompanyLoanIndicator
 * Loan.mmIntraCompanyLoanIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContractTranche1
 * LoanContractTranche1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1
 * SyndicatedLoan1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedLoan
 * PaymentTerms.mmRelatedLoan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#mmLoan
 * UnderlyingContract1Choice.mmLoan}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmSyndicatedLoan
 * LoanContract1.mmSyndicatedLoan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
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
 * "Loan"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Act of provding an amount of money, a property or other material goods to a another party in exchange for future repayment of the principal amount along with interest or other finance charges."
 * </li>
 * </ul>
 */
public class Loan extends Debt {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount principalAmount;
	/**
	 * Amount of money borrowed, or part of that amount which remains unpaid
	 * (excluding interest).
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmLoanPrincipalAmount
	 * RegisteredContract4.mmLoanPrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmLoanPrincipalAmount
	 * RegisteredContract5.mmLoanPrincipalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SyndicatedLoan1#mmAmount
	 * SyndicatedLoan1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmAmount
	 * LoanContract1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Loan Loan}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money borrowed, or part of that amount which remains unpaid (excluding interest)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrincipalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RegisteredContract4.mmLoanPrincipalAmount, RegisteredContract5.mmLoanPrincipalAmount, SyndicatedLoan1.mmAmount, LoanContract1.mmAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Loan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalAmount";
			definition = "Amount of money borrowed, or part of that amount which remains unpaid (excluding interest).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Loan.class.getMethod("getPrincipalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentTerms interestPaymentsSchedule;
	/**
	 * Schedule for the payment of the interests due on the loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedLoan
	 * PaymentTerms.mmRelatedLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmInterestSchedule
	 * LoanContract1.mmInterestSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Loan Loan}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentsSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Schedule for the payment of the interests due on the loan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestPaymentsSchedule = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmInterestSchedule);
			elementContext_lazy = () -> com.tools20022.repository.entity.Loan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPaymentsSchedule";
			definition = "Schedule for the payment of the interests due on the loan.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmRelatedLoan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	protected YesNoIndicator intraCompanyLoanIndicator;
	/**
	 * Loan is an intra-company loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract4#mmInterCompanyLoan
	 * RegisteredContract4.mmInterCompanyLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract5#mmInterCompanyLoan
	 * RegisteredContract5.mmInterCompanyLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmIntraCompanyLoan
	 * LoanContract1.mmIntraCompanyLoan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Loan Loan}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyLoanIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan is an intra-company loan."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntraCompanyLoanIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RegisteredContract4.mmInterCompanyLoan, RegisteredContract5.mmInterCompanyLoan, LoanContract1.mmIntraCompanyLoan);
			elementContext_lazy = () -> com.tools20022.repository.entity.Loan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyLoanIndicator";
			definition = "Loan is an intra-company loan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Loan.class.getMethod("getIntraCompanyLoanIndicator", new Class[]{});
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
				name = "Loan";
				definition = "Act of provding an amount of money, a property or other material goods to a another party in exchange for future repayment of the principal amount along with interest or other finance charges.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentTerms.mmRelatedLoan);
				derivationElement_lazy = () -> Arrays.asList(UnderlyingContract1Choice.mmLoan, LoanContract1.mmSyndicatedLoan);
				superType_lazy = () -> Debt.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Loan.mmPrincipalAmount, com.tools20022.repository.entity.Loan.mmInterestPaymentsSchedule, com.tools20022.repository.entity.Loan.mmIntraCompanyLoanIndicator);
				derivationComponent_lazy = () -> Arrays.asList(LoanContractTranche1.mmObject(), SyndicatedLoan1.mmObject(), LoanContract1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Loan.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(CurrencyAndAmount principalAmount) {
		this.principalAmount = principalAmount;
	}

	public PaymentTerms getInterestPaymentsSchedule() {
		return interestPaymentsSchedule;
	}

	public void setInterestPaymentsSchedule(com.tools20022.repository.entity.PaymentTerms interestPaymentsSchedule) {
		this.interestPaymentsSchedule = interestPaymentsSchedule;
	}

	public YesNoIndicator getIntraCompanyLoanIndicator() {
		return intraCompanyLoanIndicator;
	}

	public void setIntraCompanyLoanIndicator(YesNoIndicator intraCompanyLoanIndicator) {
		this.intraCompanyLoanIndicator = intraCompanyLoanIndicator;
	}
}