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
import com.tools20022.repository.area.camt.AccountReportingRequestV04;
import com.tools20022.repository.choice.Party35Choice;
import com.tools20022.repository.choice.SequenceRange1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the reporting request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmIdentification
 * ReportingRequest4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedMessageNameIdentification
 * ReportingRequest4.mmRequestedMessageNameIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccount
 * ReportingRequest4.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountOwner
 * ReportingRequest4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountServicer
 * ReportingRequest4.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmReportingPeriod
 * ReportingRequest4.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmReportingSequence
 * ReportingRequest4.mmReportingSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedTransactionType
 * ReportingRequest4.mmRequestedTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedBalanceType
 * ReportingRequest4.mmRequestedBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV04#mmReportingRequest
 * AccountReportingRequestV04.mmReportingRequest}</li>
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
 * "ReportingRequest4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details on the reporting request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportingRequest4", propOrder = {"identification", "requestedMessageNameIdentification", "account", "accountOwner", "accountServicer", "reportingPeriod", "reportingSequence", "requestedTransactionType",
		"requestedBalanceType"})
public class ReportingRequest4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest4, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<ReportingRequest4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportingRequest4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdMsgNmId", required = true)
	protected Max35Text requestedMessageNameIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdMsgNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the requested reporting message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest4, Max35Text> mmRequestedMessageNameIdentification = new MMMessageAttribute<ReportingRequest4, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "ReqdMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedMessageNameIdentification";
			definition = "Specifies the type of the requested reporting message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ReportingRequest4 obj) {
			return obj.getRequestedMessageNameIdentification();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Max35Text value) {
			obj.setRequestedMessageNameIdentification(value);
		}
	};
	@XmlElement(name = "Acct")
	protected CashAccount24 account;
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
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account to which the reporting request refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Optional<CashAccount24>> mmAccount = new MMMessageAssociationEnd<ReportingRequest4, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which the reporting request refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(ReportingRequest4 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<CashAccount24> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr", required = true)
	protected Party35Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party35Choice
	 * Party35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Party35Choice> mmAccountOwner = new MMMessageAssociationEnd<ReportingRequest4, Party35Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party35Choice.mmObject();
		}

		@Override
		public Party35Choice getValue(ReportingRequest4 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Party35Choice value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAssociationEnd<ReportingRequest4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(ReportingRequest4 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgPrd")
	protected ReportingPeriod2 reportingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportingPeriod2
	 * ReportingPeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested reporting period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Optional<ReportingPeriod2>> mmReportingPeriod = new MMMessageAssociationEnd<ReportingRequest4, Optional<ReportingPeriod2>>() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Specifies the requested reporting period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingPeriod2.mmObject();
		}

		@Override
		public Optional<ReportingPeriod2> getValue(ReportingRequest4 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<ReportingPeriod2> value) {
			obj.setReportingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgSeq")
	protected SequenceRange1Choice reportingSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the range of identification sequence numbers which are being requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Optional<SequenceRange1Choice>> mmReportingSequence = new MMMessageAssociationEnd<ReportingRequest4, Optional<SequenceRange1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "RptgSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSequence";
			definition = "Specifies the range of identification sequence numbers which are being requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SequenceRange1Choice.mmObject();
		}

		@Override
		public Optional<SequenceRange1Choice> getValue(ReportingRequest4 obj) {
			return obj.getReportingSequence();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<SequenceRange1Choice> value) {
			obj.setReportingSequence(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdTxTp")
	protected TransactionType2 requestedTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionType2
	 * TransactionType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
	 * CashAccount.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transactions to be reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, Optional<TransactionType2>> mmRequestedTransactionType = new MMMessageAssociationEnd<ReportingRequest4, Optional<TransactionType2>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "ReqdTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransactionType";
			definition = "Identifies the transactions to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionType2.mmObject();
		}

		@Override
		public Optional<TransactionType2> getValue(ReportingRequest4 obj) {
			return obj.getRequestedTransactionType();
		}

		@Override
		public void setValue(ReportingRequest4 obj, Optional<TransactionType2> value) {
			obj.setRequestedTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdBalTp")
	protected List<BalanceType13> requestedBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceType13
	 * BalanceType13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4
	 * ReportingRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the requested balance reporting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest4, List<BalanceType13>> mmRequestedBalanceType = new MMMessageAssociationEnd<ReportingRequest4, List<BalanceType13>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest4.mmObject();
			isDerived = false;
			xmlTag = "ReqdBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBalanceType";
			definition = "Provides details on the requested balance reporting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceType13.mmObject();
		}

		@Override
		public List<BalanceType13> getValue(ReportingRequest4 obj) {
			return obj.getRequestedBalanceType();
		}

		@Override
		public void setValue(ReportingRequest4 obj, List<BalanceType13> value) {
			obj.setRequestedBalanceType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingRequest4.mmIdentification, com.tools20022.repository.msg.ReportingRequest4.mmRequestedMessageNameIdentification,
						com.tools20022.repository.msg.ReportingRequest4.mmAccount, com.tools20022.repository.msg.ReportingRequest4.mmAccountOwner, com.tools20022.repository.msg.ReportingRequest4.mmAccountServicer,
						com.tools20022.repository.msg.ReportingRequest4.mmReportingPeriod, com.tools20022.repository.msg.ReportingRequest4.mmReportingSequence, com.tools20022.repository.msg.ReportingRequest4.mmRequestedTransactionType,
						com.tools20022.repository.msg.ReportingRequest4.mmRequestedBalanceType);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountReportingRequestV04.mmReportingRequest);
				trace_lazy = () -> ReportingService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingRequest4";
				definition = "Provides further details on the reporting request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public ReportingRequest4 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Max35Text getRequestedMessageNameIdentification() {
		return requestedMessageNameIdentification;
	}

	public ReportingRequest4 setRequestedMessageNameIdentification(Max35Text requestedMessageNameIdentification) {
		this.requestedMessageNameIdentification = Objects.requireNonNull(requestedMessageNameIdentification);
		return this;
	}

	public Optional<CashAccount24> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public ReportingRequest4 setAccount(CashAccount24 account) {
		this.account = account;
		return this;
	}

	public Party35Choice getAccountOwner() {
		return accountOwner;
	}

	public ReportingRequest4 setAccountOwner(Party35Choice accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public ReportingRequest4 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<ReportingPeriod2> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public ReportingRequest4 setReportingPeriod(ReportingPeriod2 reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<SequenceRange1Choice> getReportingSequence() {
		return reportingSequence == null ? Optional.empty() : Optional.of(reportingSequence);
	}

	public ReportingRequest4 setReportingSequence(SequenceRange1Choice reportingSequence) {
		this.reportingSequence = reportingSequence;
		return this;
	}

	public Optional<TransactionType2> getRequestedTransactionType() {
		return requestedTransactionType == null ? Optional.empty() : Optional.of(requestedTransactionType);
	}

	public ReportingRequest4 setRequestedTransactionType(TransactionType2 requestedTransactionType) {
		this.requestedTransactionType = requestedTransactionType;
		return this;
	}

	public List<BalanceType13> getRequestedBalanceType() {
		return requestedBalanceType == null ? requestedBalanceType = new ArrayList<>() : requestedBalanceType;
	}

	public ReportingRequest4 setRequestedBalanceType(List<BalanceType13> requestedBalanceType) {
		this.requestedBalanceType = Objects.requireNonNull(requestedBalanceType);
		return this;
	}
}