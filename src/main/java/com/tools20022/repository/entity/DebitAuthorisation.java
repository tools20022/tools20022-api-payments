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
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DebitAuthorisation2;
import com.tools20022.repository.msg.DebitAuthorisationConfirmation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DebitAuthorisation, ISODate> mmValueDateToDebit = new MMBusinessAttribute<DebitAuthorisation, ISODate>() {
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

		@Override
		public ISODate getValue(DebitAuthorisation obj) {
			return obj.getValueDateToDebit();
		}

		@Override
		public void setValue(DebitAuthorisation obj, ISODate value) {
			obj.setValueDateToDebit(value);
		}
	};
	protected YesNoIndicator debitAuthorisationDecision;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DebitAuthorisation, YesNoIndicator> mmDebitAuthorisationDecision = new MMBusinessAttribute<DebitAuthorisation, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(DebitAuthorisation obj) {
			return obj.getDebitAuthorisationDecision();
		}

		@Override
		public void setValue(DebitAuthorisation obj, YesNoIndicator value) {
			obj.setDebitAuthorisationDecision(value);
		}
	};
	protected CurrencyAndAmount amountToDebit;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DebitAuthorisation, CurrencyAndAmount> mmAmountToDebit = new MMBusinessAttribute<DebitAuthorisation, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(DebitAuthorisation obj) {
			return obj.getAmountToDebit();
		}

		@Override
		public void setValue(DebitAuthorisation obj, CurrencyAndAmount value) {
			obj.setAmountToDebit(value);
		}
	};
	protected Max140Text reason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DebitAuthorisation, Max140Text> mmReason = new MMBusinessAttribute<DebitAuthorisation, Max140Text>() {
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

		@Override
		public Max140Text getValue(DebitAuthorisation obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(DebitAuthorisation obj, Max140Text value) {
			obj.setReason(value);
		}
	};
	protected Payment authorisedReturn;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<DebitAuthorisation, Optional<Payment>> mmAuthorisedReturn = new MMBusinessAssociationEnd<DebitAuthorisation, Optional<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedReturn";
			definition = "Authorisation given by a credited party to return the payment which was the reason for the credit and therefore to debit its account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmRelatedDebitAuthorisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public Optional<Payment> getValue(DebitAuthorisation obj) {
			return obj.getAuthorisedReturn();
		}

		@Override
		public void setValue(DebitAuthorisation obj, Optional<Payment> value) {
			obj.setAuthorisedReturn(value.orElse(null));
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<DebitAuthorisation, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<DebitAuthorisation, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the debit authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(DebitAuthorisation obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(DebitAuthorisation obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCaseResolution(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisation";
				definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
				associationDomain_lazy = () -> Arrays.asList(Payment.mmRelatedDebitAuthorisation, PaymentInvestigationCaseResolution.mmDebitAuthorisationConfirmation);
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

	public DebitAuthorisation setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = Objects.requireNonNull(valueDateToDebit);
		return this;
	}

	public YesNoIndicator getDebitAuthorisationDecision() {
		return debitAuthorisationDecision;
	}

	public DebitAuthorisation setDebitAuthorisationDecision(YesNoIndicator debitAuthorisationDecision) {
		this.debitAuthorisationDecision = Objects.requireNonNull(debitAuthorisationDecision);
		return this;
	}

	public CurrencyAndAmount getAmountToDebit() {
		return amountToDebit;
	}

	public DebitAuthorisation setAmountToDebit(CurrencyAndAmount amountToDebit) {
		this.amountToDebit = Objects.requireNonNull(amountToDebit);
		return this;
	}

	public Max140Text getReason() {
		return reason;
	}

	public DebitAuthorisation setReason(Max140Text reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Optional<Payment> getAuthorisedReturn() {
		return authorisedReturn == null ? Optional.empty() : Optional.of(authorisedReturn);
	}

	public DebitAuthorisation setAuthorisedReturn(Payment authorisedReturn) {
		this.authorisedReturn = authorisedReturn;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution == null ? Optional.empty() : Optional.of(relatedInvestigationCaseResolution);
	}

	public DebitAuthorisation setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
		return this;
	}
}