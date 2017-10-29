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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further specific details on the direct debit transaction and the
 * related mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#MandateRelatedInformation
 * DirectDebitTransaction9.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#CreditorSchemeIdentification
 * DirectDebitTransaction9.CreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationIdentification
 * DirectDebitTransaction9.PreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationDate
 * DirectDebitTransaction9.PreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
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
 * "DirectDebitTransaction9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further specific details on the direct debit transaction and the related mandate."
 * </li>
 * </ul>
 */
public class DirectDebitTransaction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides further details of the direct debit mandate signed between the
	 * creditor and the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
	 * DirectDebit.DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
	 * DirectDebitTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides further details of the direct debit mandate signed between the creditor and the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MandateRelatedInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.DirectDebitMandate;
			isDerived = false;
			xmlTag = "MndtRltdInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRelatedInformation";
			definition = "Provides further details of the direct debit mandate signed between the creditor and the debtor.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateRelatedInformation11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Credit party that signs the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
	 * DirectDebitTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit party that signs the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction.
	 * 
	 * Usage: The direct debit pre-notification is used to reconcile separately
	 * sent collection information with the direct debit transaction
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationIdentification
	 * DirectDebit.PreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
	 * DirectDebitTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\n\nUsage: The direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PreNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.PreNotificationIdentification;
			isDerived = false;
			xmlTag = "PreNtfctnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\n\nUsage: The direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationDate
	 * DirectDebit.PreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
	 * DirectDebitTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreNtfctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PreNotificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.PreNotificationDate;
			isDerived = false;
			xmlTag = "PreNtfctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.MandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction9.CreditorSchemeIdentification,
						com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationIdentification, com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationDate);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitTransaction9";
				definition = "Provides further specific details on the direct debit transaction and the related mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}