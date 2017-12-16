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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DebitAuthorisation2;
import com.tools20022.repository.msg.DebitAuthorisationConfirmation2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Permission given by an account owner to debit its account as the result of a
 * cancelled payment. The authoriser is the party whose account was credited as
 * the result of a payment instruction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DebitAuthorisation" src="doc-files/DebitAuthorisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmValueDateToDebit
 * DebitAuthorisation.mmValueDateToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmDebitAuthorisationDecision
 * DebitAuthorisation.mmDebitAuthorisationDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAmountToDebit
 * DebitAuthorisation.mmAmountToDebit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmReason
 * DebitAuthorisation.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
 * DebitAuthorisation.mmAuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmRelatedInvestigationCaseResolution
 * DebitAuthorisation.mmRelatedInvestigationCaseResolution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
 * Payment.mmRelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDebitAuthorisationConfirmation
 * PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation}</li>
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
 * "DebitAuthorisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction."
 * </li>
 * </ul>
 */
public class DebitAuthorisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate valueDateToDebit;
	/**
	 * Value date for debiting the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#mmValueDateToDebit
	 * DebitAuthorisationConfirmation2.mmValueDateToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmValueDateToDebit
	 * DebitAuthorisation2.mmValueDateToDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDateToDebit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DebitAuthorisationConfirmation2.mmValueDateToDebit, DebitAuthorisation2.mmValueDateToDebit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisation.class.getMethod("getValueDateToDebit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator debitAuthorisationDecision;
	/**
	 * Code expressing the decision taken by the account owner relative to the
	 * request for debit authorization.
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
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#mmDebitAuthorisation
	 * DebitAuthorisationConfirmation2.mmDebitAuthorisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAuthorisationDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code expressing the decision taken by the account owner relative to the request for debit authorization."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDebitAuthorisationDecision = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DebitAuthorisationConfirmation2.mmDebitAuthorisation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationDecision";
			definition = "Code expressing the decision taken by the account owner relative to the request for debit authorization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisation.class.getMethod("getDebitAuthorisationDecision", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amountToDebit;
	/**
	 * Specifies the amount to debit when the amount is lower than the amount of
	 * the underlying transaction.
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
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#mmAmountToDebit
	 * DebitAuthorisationConfirmation2.mmAmountToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmAmountToDebit
	 * DebitAuthorisation2.mmAmountToDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount to debit when the amount is lower than the amount of the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmountToDebit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DebitAuthorisationConfirmation2.mmAmountToDebit, DebitAuthorisation2.mmAmountToDebit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountToDebit";
			definition = "Specifies the amount to debit when the amount is lower than the amount of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisation.class.getMethod("getAmountToDebit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text reason;
	/**
	 * Justification of the (partial) debit authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#mmReason
	 * DebitAuthorisationConfirmation2.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification of the (partial) debit authorisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DebitAuthorisationConfirmation2.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Justification of the (partial) debit authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitAuthorisation.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment authorisedReturn;
	/**
	 * Authorisation given by a credited party to return the payment which was
	 * the reason for the credit and therefore to debit its account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
	 * Payment.mmRelatedDebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authorisation given by a credited party to return the payment which was the reason for the credit and therefore to debit its account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAuthorisedReturn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedReturn";
			definition = "Authorisation given by a credited party to return the payment which was the reason for the credit and therefore to debit its account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedDebitAuthorisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Payment investigation case resolution which is the source of the debit
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDebitAuthorisationConfirmation
	 * PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the debit authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the debit authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisation";
				definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmRelatedDebitAuthorisation, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DebitAuthorisation.mmValueDateToDebit, com.tools20022.repository.entity.DebitAuthorisation.mmDebitAuthorisationDecision,
						com.tools20022.repository.entity.DebitAuthorisation.mmAmountToDebit, com.tools20022.repository.entity.DebitAuthorisation.mmReason, com.tools20022.repository.entity.DebitAuthorisation.mmAuthorisedReturn,
						com.tools20022.repository.entity.DebitAuthorisation.mmRelatedInvestigationCaseResolution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebitAuthorisation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getValueDateToDebit() {
		return valueDateToDebit;
	}

	public void setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = valueDateToDebit;
	}

	public YesNoIndicator getDebitAuthorisationDecision() {
		return debitAuthorisationDecision;
	}

	public void setDebitAuthorisationDecision(YesNoIndicator debitAuthorisationDecision) {
		this.debitAuthorisationDecision = debitAuthorisationDecision;
	}

	public CurrencyAndAmount getAmountToDebit() {
		return amountToDebit;
	}

	public void setAmountToDebit(CurrencyAndAmount amountToDebit) {
		this.amountToDebit = amountToDebit;
	}

	public Max140Text getReason() {
		return reason;
	}

	public void setReason(Max140Text reason) {
		this.reason = reason;
	}

	public Payment getAuthorisedReturn() {
		return authorisedReturn;
	}

	public void setAuthorisedReturn(com.tools20022.repository.entity.Payment authorisedReturn) {
		this.authorisedReturn = authorisedReturn;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}
}