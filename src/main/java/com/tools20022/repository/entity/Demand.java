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
import com.tools20022.repository.codeset.DemandTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingDocument;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Document signed by the beneficiary demanding payment under a demand guarantee
 * or standby letter of credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Demand" src="doc-files/Demand.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
 * Demand.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmSubmissionDateTime
 * Demand.mmSubmissionDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmDemandAmount
 * Demand.mmDemandAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmType Demand.mmType}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmTotalClaimAmount
 * Demand.mmTotalClaimAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmPayment
 * Demand.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmAssociatedDocument
 * Demand.mmAssociatedDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
 * Undertaking.mmDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDemand
 * UndertakingDocument.mmDemand}</li>
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
 * "Demand"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class Demand {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
	 * Undertaking.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking for which a document signed by the beneficiary demanding payment is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Demand, Undertaking> mmUndertaking = new MMBusinessAssociationEnd<Demand, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a document signed by the beneficiary demanding payment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmDemand;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(Demand obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(Demand obj, Undertaking value) {
			obj.setUndertaking(value);
		}
	};
	protected ISODateTime submissionDateTime;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the demand is submitted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Demand, ISODateTime> mmSubmissionDateTime = new MMBusinessAttribute<Demand, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubmissionDateTime";
			definition = "Date and time the demand is submitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Demand obj) {
			return obj.getSubmissionDateTime();
		}

		@Override
		public void setValue(Demand obj, ISODateTime value) {
			obj.setSubmissionDateTime(value);
		}
	};
	protected CurrencyAndAmount demandAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount to be paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Demand, CurrencyAndAmount> mmDemandAmount = new MMBusinessAttribute<Demand, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DemandAmount";
			definition = "Amount to be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Demand obj) {
			return obj.getDemandAmount();
		}

		@Override
		public void setValue(Demand obj, CurrencyAndAmount value) {
			obj.setDemandAmount(value);
		}
	};
	protected DemandTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandTypeCode
	 * DemandTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of demand, for example, pay or extend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Demand, DemandTypeCode> mmType = new MMBusinessAttribute<Demand, DemandTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of demand, for example, pay or extend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandTypeCode.mmObject();
		}

		@Override
		public DemandTypeCode getValue(Demand obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Demand obj, DemandTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount totalClaimAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount and currency of the total amount claimed (sum of the demand amount plus counterparty commission and charges)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Demand, CurrencyAndAmount> mmTotalClaimAmount = new MMBusinessAttribute<Demand, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalClaimAmount";
			definition = "Amount and currency of the total amount claimed (sum of the demand amount plus counterparty commission and charges).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Demand obj) {
			return obj.getTotalClaimAmount();
		}

		@Override
		public void setValue(Demand obj, CurrencyAndAmount value) {
			obj.setTotalClaimAmount(value);
		}
	};
	protected PaymentObligation payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
	 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment of the demand."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Demand, Optional<PaymentObligation>> mmPayment = new MMBusinessAssociationEnd<Demand, Optional<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment of the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmPaymentSourceUndertakingDemand;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public Optional<PaymentObligation> getValue(Demand obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Demand obj, Optional<PaymentObligation> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	protected UndertakingDocument associatedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDemand
	 * UndertakingDocument.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents which are associated with a demand."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Demand, UndertakingDocument> mmAssociatedDocument = new MMBusinessAssociationEnd<Demand, UndertakingDocument>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Documents which are associated with a demand.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingDocument.mmDemand;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingDocument.mmObject();
		}

		@Override
		public UndertakingDocument getValue(Demand obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(Demand obj, UndertakingDocument value) {
			obj.setAssociatedDocument(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Demand";
				definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(PaymentObligation.mmPaymentSourceUndertakingDemand, Undertaking.mmDemand, UndertakingDocument.mmDemand);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Demand.mmUndertaking, com.tools20022.repository.entity.Demand.mmSubmissionDateTime, com.tools20022.repository.entity.Demand.mmDemandAmount,
						com.tools20022.repository.entity.Demand.mmType, com.tools20022.repository.entity.Demand.mmTotalClaimAmount, com.tools20022.repository.entity.Demand.mmPayment,
						com.tools20022.repository.entity.Demand.mmAssociatedDocument);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Demand.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public Demand setUndertaking(Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public ISODateTime getSubmissionDateTime() {
		return submissionDateTime;
	}

	public Demand setSubmissionDateTime(ISODateTime submissionDateTime) {
		this.submissionDateTime = Objects.requireNonNull(submissionDateTime);
		return this;
	}

	public CurrencyAndAmount getDemandAmount() {
		return demandAmount;
	}

	public Demand setDemandAmount(CurrencyAndAmount demandAmount) {
		this.demandAmount = Objects.requireNonNull(demandAmount);
		return this;
	}

	public DemandTypeCode getType() {
		return type;
	}

	public Demand setType(DemandTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getTotalClaimAmount() {
		return totalClaimAmount;
	}

	public Demand setTotalClaimAmount(CurrencyAndAmount totalClaimAmount) {
		this.totalClaimAmount = Objects.requireNonNull(totalClaimAmount);
		return this;
	}

	public Optional<PaymentObligation> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public Demand setPayment(PaymentObligation payment) {
		this.payment = payment;
		return this;
	}

	public UndertakingDocument getAssociatedDocument() {
		return associatedDocument;
	}

	public Demand setAssociatedDocument(UndertakingDocument associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}
}