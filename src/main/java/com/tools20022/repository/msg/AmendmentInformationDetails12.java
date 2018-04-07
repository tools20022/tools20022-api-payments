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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Frequency36Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.Exact2NumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.PartyIdentification125;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the list of direct debit mandate elements that
 * have been modified when the amendment indicator has been set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalMandateIdentification
 * AmendmentInformationDetails12.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails12.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorAgent
 * AmendmentInformationDetails12.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails12.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtor
 * AmendmentInformationDetails12.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAccount
 * AmendmentInformationDetails12.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAgent
 * AmendmentInformationDetails12.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails12.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails12.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFrequency
 * AmendmentInformationDetails12.mmOriginalFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalReason
 * AmendmentInformationDetails12.mmOriginalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalTrackingDays
 * AmendmentInformationDetails12.mmOriginalTrackingDays}</li>
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
 * "AmendmentInformationDetails12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11
 * AmendmentInformationDetails11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendmentInformationDetails12", propOrder = {"originalMandateIdentification", "originalCreditorSchemeIdentification", "originalCreditorAgent", "originalCreditorAgentAccount", "originalDebtor", "originalDebtorAccount",
		"originalDebtorAgent", "originalDebtorAgentAccount", "originalFinalCollectionDate", "originalFrequency", "originalReason", "originalTrackingDays"})
public class AmendmentInformationDetails12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMndtId")
	protected Max35Text originalMandateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalMandateIdentification
	 * AmendmentInformationDetails11.mmOriginalMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails12, Optional<Max35Text>> mmOriginalMandateIdentification = new MMMessageAttribute<AmendmentInformationDetails12, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalMandateIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalMandateIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<Max35Text> value) {
			obj.setOriginalMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrSchmeId")
	protected PartyIdentification125 originalCreditorSchemeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original creditor scheme identification that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<PartyIdentification125>> mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalCreditorSchemeIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<PartyIdentification125> value) {
			obj.setOriginalCreditorSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 originalCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgent
	 * AmendmentInformationDetails11.mmOriginalCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<BranchAndFinancialInstitutionIdentification5>> mmOriginalCreditorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalCreditorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalCreditorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setOriginalCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgtAcct")
	protected CashAccount24 originalCreditorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalCreditorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>> mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent account that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalCreditorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalCreditorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<CashAccount24> value) {
			obj.setOriginalCreditorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtr")
	protected PartyIdentification125 originalDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtor
	 * AmendmentInformationDetails11.mmOriginalDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<PartyIdentification125>> mmOriginalDebtor = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalDebtor();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<PartyIdentification125> value) {
			obj.setOriginalDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAcct")
	protected CashAccount24 originalDebtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>> mmOriginalDebtorAccount = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalDebtorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalDebtorAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<CashAccount24> value) {
			obj.setOriginalDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 originalDebtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgent
	 * AmendmentInformationDetails11.mmOriginalDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<BranchAndFinancialInstitutionIdentification5>> mmOriginalDebtorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor agent that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalDebtorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalDebtorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setOriginalDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgtAcct")
	protected CashAccount24 originalDebtorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>> mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalDebtorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalDebtorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<CashAccount24> value) {
			obj.setOriginalDebtorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFnlColltnDt")
	protected ISODate originalFinalCollectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original final collection date that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails11.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails12, Optional<ISODate>> mmOriginalFinalCollectionDate = new MMMessageAttribute<AmendmentInformationDetails12, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalFinalCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalFinalCollectionDate();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<ISODate> value) {
			obj.setOriginalFinalCollectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFrqcy")
	protected Frequency36Choice originalFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency36Choice
	 * Frequency36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original frequency that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFrequency
	 * AmendmentInformationDetails11.mmOriginalFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails12, Optional<Frequency36Choice>> mmOriginalFrequency = new MMMessageAttribute<AmendmentInformationDetails12, Optional<Frequency36Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency36Choice.mmObject();
		}

		@Override
		public Optional<Frequency36Choice> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalFrequency();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<Frequency36Choice> value) {
			obj.setOriginalFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlRsn")
	protected MandateSetupReason1Choice originalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateSetupReason1Choice
	 * MandateSetupReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original reason for the mandate to allow the user to distinguish between different mandates for the same creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalReason
	 * AmendmentInformationDetails11.mmOriginalReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<MandateSetupReason1Choice>> mmOriginalReason = new MMMessageAssociationEnd<AmendmentInformationDetails12, Optional<MandateSetupReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReason";
			definition = "Original reason for the mandate to allow the user to distinguish between different mandates for the same creditor.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}

		@Override
		public Optional<MandateSetupReason1Choice> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalReason();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<MandateSetupReason1Choice> value) {
			obj.setOriginalReason(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlTrckgDays")
	protected Exact2NumericText originalTrackingDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact2NumericText
	 * Exact2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmTrackingDays
	 * Mandate.mmTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
	 * AmendmentInformationDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTrckgDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTrackingDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original number of tracking days that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalTrackingDays
	 * AmendmentInformationDetails11.mmOriginalTrackingDays}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails12, Optional<Exact2NumericText>> mmOriginalTrackingDays = new MMMessageAttribute<AmendmentInformationDetails12, Optional<Exact2NumericText>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmTrackingDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails12.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTrckgDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTrackingDays";
			definition = "Original number of tracking days that has been modified.";
			previousVersion_lazy = () -> AmendmentInformationDetails11.mmOriginalTrackingDays;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}

		@Override
		public Optional<Exact2NumericText> getValue(AmendmentInformationDetails12 obj) {
			return obj.getOriginalTrackingDays();
		}

		@Override
		public void setValue(AmendmentInformationDetails12 obj, Optional<Exact2NumericText> value) {
			obj.setOriginalTrackingDays(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalFrequency, com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalReason,
						com.tools20022.repository.msg.AmendmentInformationDetails12.mmOriginalTrackingDays);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails12";
				definition = "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
				previousVersion_lazy = () -> AmendmentInformationDetails11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalMandateIdentification() {
		return originalMandateIdentification == null ? Optional.empty() : Optional.of(originalMandateIdentification);
	}

	public AmendmentInformationDetails12 setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
		return this;
	}

	public Optional<PartyIdentification125> getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification == null ? Optional.empty() : Optional.of(originalCreditorSchemeIdentification);
	}

	public AmendmentInformationDetails12 setOriginalCreditorSchemeIdentification(PartyIdentification125 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getOriginalCreditorAgent() {
		return originalCreditorAgent == null ? Optional.empty() : Optional.of(originalCreditorAgent);
	}

	public AmendmentInformationDetails12 setOriginalCreditorAgent(BranchAndFinancialInstitutionIdentification5 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
		return this;
	}

	public Optional<CashAccount24> getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount == null ? Optional.empty() : Optional.of(originalCreditorAgentAccount);
	}

	public AmendmentInformationDetails12 setOriginalCreditorAgentAccount(CashAccount24 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification125> getOriginalDebtor() {
		return originalDebtor == null ? Optional.empty() : Optional.of(originalDebtor);
	}

	public AmendmentInformationDetails12 setOriginalDebtor(PartyIdentification125 originalDebtor) {
		this.originalDebtor = originalDebtor;
		return this;
	}

	public Optional<CashAccount24> getOriginalDebtorAccount() {
		return originalDebtorAccount == null ? Optional.empty() : Optional.of(originalDebtorAccount);
	}

	public AmendmentInformationDetails12 setOriginalDebtorAccount(CashAccount24 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getOriginalDebtorAgent() {
		return originalDebtorAgent == null ? Optional.empty() : Optional.of(originalDebtorAgent);
	}

	public AmendmentInformationDetails12 setOriginalDebtorAgent(BranchAndFinancialInstitutionIdentification5 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
		return this;
	}

	public Optional<CashAccount24> getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount == null ? Optional.empty() : Optional.of(originalDebtorAgentAccount);
	}

	public AmendmentInformationDetails12 setOriginalDebtorAgentAccount(CashAccount24 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
		return this;
	}

	public Optional<ISODate> getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate == null ? Optional.empty() : Optional.of(originalFinalCollectionDate);
	}

	public AmendmentInformationDetails12 setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
		return this;
	}

	public Optional<Frequency36Choice> getOriginalFrequency() {
		return originalFrequency == null ? Optional.empty() : Optional.of(originalFrequency);
	}

	public AmendmentInformationDetails12 setOriginalFrequency(Frequency36Choice originalFrequency) {
		this.originalFrequency = originalFrequency;
		return this;
	}

	public Optional<MandateSetupReason1Choice> getOriginalReason() {
		return originalReason == null ? Optional.empty() : Optional.of(originalReason);
	}

	public AmendmentInformationDetails12 setOriginalReason(MandateSetupReason1Choice originalReason) {
		this.originalReason = originalReason;
		return this;
	}

	public Optional<Exact2NumericText> getOriginalTrackingDays() {
		return originalTrackingDays == null ? Optional.empty() : Optional.of(originalTrackingDays);
	}

	public AmendmentInformationDetails12 setOriginalTrackingDays(Exact2NumericText originalTrackingDays) {
		this.originalTrackingDays = originalTrackingDays;
		return this;
	}
}