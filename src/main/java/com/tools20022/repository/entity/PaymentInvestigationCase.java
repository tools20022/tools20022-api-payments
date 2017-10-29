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
import com.tools20022.repository.codeset.CancellationReasonCode;
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode;
import com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.msg.MissingCover3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of activities performed to handle an exception to a normal payment
 * transaction flow, such as: - a payment has not been received. - a payment has
 * been received but is incorrect. - a payment must be corrected or cancelled
 * (requested by the party which ordered the payment).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInvestigationCase"
 * src="doc-files/PaymentInvestigationCase.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#PaymentStatus
 * PaymentInvestigationCase.PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#CancellationReason
 * PaymentInvestigationCase.CancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingPayment
 * PaymentInvestigationCase.UnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#MissingCoverIndication
 * PaymentInvestigationCase.MissingCoverIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingInstruction
 * PaymentInvestigationCase.UnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingCashEntry
 * PaymentInvestigationCase.UnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#IncorrectInformationReason
 * PaymentInvestigationCase.IncorrectInformationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#MissingInformationReason
 * PaymentInvestigationCase.MissingInformationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#CaseType
 * PaymentInvestigationCase.CaseType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCase
 * Payment.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCase
 * CashEntry.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCase
 * PaymentExecution.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentStatus#RelatedInvestigationCase
 * PaymentStatus.RelatedInvestigationCase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MissingCover3 MissingCover3}</li>
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
 * "PaymentInvestigationCase"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of activities performed to handle an exception to a normal payment transaction flow, such as: - a payment has not been received. - a payment has been received but is incorrect. - a payment must be corrected or cancelled (requested by the party which ordered the payment)."
 * </li>
 * </ul>
 */
public class PaymentInvestigationCase extends InvestigationCase {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of a payment which is the reason or the result of an investigation
	 * case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#RelatedInvestigationCase
	 * PaymentStatus.RelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a payment which is the reason or the result of an investigation case."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of a payment which is the reason or the result of an investigation case.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the reason for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
	 * CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reason for cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Indicates the reason for cancellation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Identifies the end to end payment which is the subject of the
	 * investigation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCase
	 * Payment.RelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the end to end payment which is the subject of the investigation"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPayment";
			definition = "Identifies the end to end payment which is the subject of the investigation";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether or not the claim is related to a missing cover.
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
	 * {@linkplain com.tools20022.repository.msg.MissingCover3#MissingCoverIndicator
	 * MissingCover3.MissingCoverIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCoverIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the claim is related to a missing cover."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MissingCoverIndication = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MissingCover3.MissingCoverIndicator);
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCoverIndication";
			definition = "Indicates whether or not the claim is related to a missing cover.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the payment instruction under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#RelatedInvestigationCase
	 * PaymentExecution.RelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment instruction under investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingInstruction";
			definition = "Identifies the payment instruction under investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the cash entry under investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCase
	 * CashEntry.RelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the cash entry under investigation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingCashEntry";
			definition = "Identifies the cash entry under investigation.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates, in a coded form, the incorrect information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
	 * UnableToApplyIncorrectInfoCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInformationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates, in a coded form, the incorrect information."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncorrectInformationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectInformationReason";
			definition = "Indicates, in a coded form, the incorrect information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnableToApplyIncorrectInfoCode.mmObject();
		}
	};
	/**
	 * Indicates the missing information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
	 * UnableToApplyMissingInformationV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the missing information."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MissingInformationReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInformationReason";
			definition = "Indicates the missing information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
		}
	};
	/**
	 * Specifies the type of investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of investigation case."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CaseType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaseType";
			definition = "Specifies the type of investigation case.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal payment transaction flow, such as: - a payment has not been received. - a payment has been received but is incorrect. - a payment must be corrected or cancelled (requested by the party which ordered the payment).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.RelatedInvestigationCase, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase, com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase);
				superType_lazy = () -> InvestigationCase.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.CancellationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment, com.tools20022.repository.entity.PaymentInvestigationCase.MissingCoverIndication,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.IncorrectInformationReason, com.tools20022.repository.entity.PaymentInvestigationCase.MissingInformationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.CaseType);
				derivationComponent_lazy = () -> Arrays.asList(MissingCover3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}