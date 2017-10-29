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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.msg.UnderlyingPaymentInstruction3;
import com.tools20022.repository.msg.UnderlyingPaymentTransaction2;
import com.tools20022.repository.msg.UnderlyingStatementEntry1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the details of the underlying transaction on which the
 * investigation is processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Initiation
 * UnderlyingTransaction3Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Interbank
 * UnderlyingTransaction3Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#StatementEntry
 * UnderlyingTransaction3Choice.StatementEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#Underlying
 * UnableToApplyV05.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#Underlying
 * AdditionalPaymentInformationV07.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#Underlying
 * DebitAuthorisationRequestV05.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#Underlying
 * ClaimNonReceiptV05.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#Underlying
 * RequestToModifyPaymentV04.Underlying}</li>
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
 * "UnderlyingTransaction3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of the underlying transaction on which the investigation is processed."
 * </li>
 * </ul>
 */
public class UnderlyingTransaction3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of elements used to reference the details of the original payment
	 * initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3
	 * UnderlyingPaymentInstruction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original payment initiation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Initiation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnderlyingTransaction3Choice.mmObject();
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the original payment initiation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingPaymentInstruction3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to reference the details of the original interbank
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the original interbank payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Interbank = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnderlyingTransaction3Choice.mmObject();
			businessComponentTrace_lazy = () -> Payment.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the original interbank payment transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingPaymentTransaction2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Reference details on the underlying statement cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1
	 * UnderlyingStatementEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference details on the underlying statement cash entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd StatementEntry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnderlyingTransaction3Choice.mmObject();
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			xmlTag = "StmtNtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntry";
			definition = "Reference details on the underlying statement cash entry.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingStatementEntry1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnderlyingTransaction3Choice.Initiation, com.tools20022.repository.choice.UnderlyingTransaction3Choice.Interbank,
						com.tools20022.repository.choice.UnderlyingTransaction3Choice.StatementEntry);
				trace_lazy = () -> Payment.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.UnableToApplyV05.Underlying, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.Underlying,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.Underlying, com.tools20022.repository.area.camt.ClaimNonReceiptV05.Underlying,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.Underlying);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction3Choice";
				definition = "Specifies the details of the underlying transaction on which the investigation is processed.";
			}
		});
		return mmObject_lazy.get();
	}
}