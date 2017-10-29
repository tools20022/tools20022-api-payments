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
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that serves as a basis to debit an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Mandate11#MandateIdentification
 * Mandate11.MandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Mandate11#MandateRequestIdentification
 * Mandate11.MandateRequestIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Authentication
 * Mandate11.Authentication}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Type Mandate11.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Occurrences
 * Mandate11.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#TrackingIndicator
 * Mandate11.TrackingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Mandate11#FirstCollectionAmount
 * Mandate11.FirstCollectionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CollectionAmount
 * Mandate11.CollectionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#MaximumAmount
 * Mandate11.MaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Adjustment
 * Mandate11.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Reason
 * Mandate11.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Mandate11#CreditorSchemeIdentification
 * Mandate11.CreditorSchemeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Creditor
 * Mandate11.Creditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CreditorAccount
 * Mandate11.CreditorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CreditorAgent
 * Mandate11.CreditorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#UltimateCreditor
 * Mandate11.UltimateCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Debtor
 * Mandate11.Debtor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#DebtorAccount
 * Mandate11.DebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#DebtorAgent
 * Mandate11.DebtorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#UltimateDebtor
 * Mandate11.UltimateDebtor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#MandateReference
 * Mandate11.MandateReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#ReferredDocument
 * Mandate11.ReferredDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "Mandate11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that serves as a basis to debit an account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Mandate9
 * Mandate9}</li>
 * </ul>
 */
public class Mandate11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the responsible party (such as the
	 * creditor) or agent (such as the debtor agent), to unambiguously identify
	 * the mandate.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MandateIdentification
	 * Mandate9.MandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MandateIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.MandateIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification for the mandate request, as assigned by the initiating
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification for the mandate request, as assigned by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MandateRequestIdentification
	 * Mandate9.MandateRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MandateRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			isDerived = false;
			xmlTag = "MndtReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRequestIdentification";
			definition = "Identification for the mandate request, as assigned by the initiating party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.MandateRequestIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MandateAuthentication1
	 * MandateAuthentication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#Authentication
	 * Mandate.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authntcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport authentication details related to the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Authentication
	 * Mandate9.Authentication}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Authentication = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Authentication;
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Authentication;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateAuthentication1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the type of mandate, such as paper, electronic or scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2
	 * MandateTypeInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
	 * DirectDebitMandate.MandatePaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of mandate, such as paper, electronic or scheme."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Type Mandate9.Type}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Type = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of mandate, such as paper, electronic or scheme.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Type;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateTypeInformation2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details of the duration of the mandate and occurrence of the
	 * underlying transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MandateOccurrences4
	 * MandateOccurrences4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ocrncs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Occurrences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the duration of the mandate and occurrence of the underlying transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Occurrences
	 * Mandate9.Occurrences}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Occurrences = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			xmlTag = "Ocrncs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Occurrences";
			definition = "Provides details of the duration of the mandate and occurrence of the underlying transactions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Occurrences;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateOccurrences4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically
	 * re-submitted periodically when bilaterally agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#TrackingIndicator
	 * Mandate.TrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrckgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#TrackingIndicator
	 * Mandate9.TrackingIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TrackingIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.TrackingIndicator;
			isDerived = false;
			xmlTag = "TrckgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.TrackingIndicator;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Amount different from the collection amount, as it includes the costs
	 * associated with the first debited amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#CollectionAmount
	 * DirectDebitMandate.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstColltnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount different from the collection amount, as it includes the costs associated with the first debited amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#FirstCollectionAmount
	 * Mandate9.FirstCollectionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FirstCollectionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount;
			isDerived = false;
			xmlTag = "FrstColltnAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionAmount";
			definition = "Amount different from the collection amount, as it includes the costs associated with the first debited amount.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.FirstCollectionAmount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Fixed amount to be collected from the debtor's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#CollectionAmount
	 * DirectDebitMandate.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ColltnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed amount to be collected from the debtor's account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#CollectionAmount
	 * Mandate9.CollectionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CollectionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount;
			isDerived = false;
			xmlTag = "ColltnAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount to be collected from the debtor's account.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.CollectionAmount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MaximumAmount
	 * DirectDebitMandate.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that may be collected from the debtor's account, per instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MaximumAmount
	 * Mandate9.MaximumAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaximumAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MaximumAmount;
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.MaximumAmount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the characteristics of the adjustment applied to the collection
	 * amount of a direct debit instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MandateAdjustment1
	 * MandateAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#Amendment
	 * Mandate.Amendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the characteristics of the adjustment applied to the collection amount of a direct debit instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Adjustment
	 * Mandate9.Adjustment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Adjustment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Amendment;
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Specifies the characteristics of the adjustment applied to the collection amount of a direct debit instruction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Adjustment;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateAdjustment1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the reason for the setup of the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateSetupReason1Choice
	 * MandateSetupReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Description
	 * Agreement.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reason for the setup of the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Reason
	 * Mandate9.Reason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Reason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Provides the reason for the setup of the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Reason;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#CreditorSchemeIdentification
	 * Mandate9.CreditorSchemeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.CreditorSchemeIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that signs the mandate and to whom an amount of money is due.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that signs the mandate and to whom an amount of money is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Creditor
	 * Mandate9.Creditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Creditor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that signs the mandate and to whom an amount of money is due.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Creditor;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unambiguous identification of the account of the creditor to which a
	 * credit entry will be posted as a result of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#CreditorAccount
	 * Mandate9.CreditorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditorAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.CreditorAccount;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Financial institution servicing an account for the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#CreditorAgent
	 * Mandate9.CreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditorAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.CreditorAgent;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Ultimate party to which an amount of money is due.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#UltimateCreditor
	 * Mandate9.UltimateCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UltimateCreditor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.UltimateCreditor;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that signs the mandate and owes an amount of money to the
	 * (ultimate) creditor.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that signs the mandate and owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#Debtor
	 * Mandate9.Debtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Debtor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that signs the mandate and owes an amount of money to the (ultimate) creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.Debtor;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor, to which a debit
	 * entry will be made as a result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#DebtorAccount
	 * Mandate9.DebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebtorAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.DebtorAccount;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Financial institution servicing an account for the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#OrganisationIdentification
	 * Organisation.OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#DebtorAgent
	 * Mandate9.DebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebtorAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.DebtorAgent;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#UltimateDebtor
	 * Mandate9.UltimateDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd UltimateDebtor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.UltimateDebtor;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification43.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Reference assigned by a creditor or ultimate creditor for internal usage
	 * for the mandate.
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
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a creditor or ultimate creditor for internal usage for the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#MandateReference
	 * Mandate9.MandateReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MandateReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			isDerived = false;
			xmlTag = "MndtRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateReference";
			definition = "Reference assigned by a creditor or ultimate creditor for internal usage for the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.MandateReference;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides information to identify the underlying documents associated with
	 * the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1
	 * ReferredMandateDocument1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Document
	 * Agreement.Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Mandate11
	 * Mandate11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information to identify the underlying documents associated with the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Mandate9#ReferredDocument
	 * Mandate9.ReferredDocument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReferredDocument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Mandate11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			isDerived = false;
			xmlTag = "RfrdDoc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocument";
			definition = "Provides information to identify the underlying documents associated with the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Mandate9.ReferredDocument;
			minOccurs = 0;
			type_lazy = () -> ReferredMandateDocument1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate11.MandateIdentification, com.tools20022.repository.msg.Mandate11.MandateRequestIdentification,
						com.tools20022.repository.msg.Mandate11.Authentication, com.tools20022.repository.msg.Mandate11.Type, com.tools20022.repository.msg.Mandate11.Occurrences, com.tools20022.repository.msg.Mandate11.TrackingIndicator,
						com.tools20022.repository.msg.Mandate11.FirstCollectionAmount, com.tools20022.repository.msg.Mandate11.CollectionAmount, com.tools20022.repository.msg.Mandate11.MaximumAmount,
						com.tools20022.repository.msg.Mandate11.Adjustment, com.tools20022.repository.msg.Mandate11.Reason, com.tools20022.repository.msg.Mandate11.CreditorSchemeIdentification,
						com.tools20022.repository.msg.Mandate11.Creditor, com.tools20022.repository.msg.Mandate11.CreditorAccount, com.tools20022.repository.msg.Mandate11.CreditorAgent,
						com.tools20022.repository.msg.Mandate11.UltimateCreditor, com.tools20022.repository.msg.Mandate11.Debtor, com.tools20022.repository.msg.Mandate11.DebtorAccount, com.tools20022.repository.msg.Mandate11.DebtorAgent,
						com.tools20022.repository.msg.Mandate11.UltimateDebtor, com.tools20022.repository.msg.Mandate11.MandateReference, com.tools20022.repository.msg.Mandate11.ReferredDocument);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Mandate11";
				definition = "Information that serves as a basis to debit an account.";
				previousVersion_lazy = () -> Mandate9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}