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
import com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01;
import com.tools20022.repository.choice.ContractRegistrationReference1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Currency control document supporting the contract registration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmSupportingDocumentIdentification
 * SupportingDocument1.mmSupportingDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmOriginalRequestIdentification
 * SupportingDocument1.mmOriginalRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmCertificate
 * SupportingDocument1.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmAccountOwner
 * SupportingDocument1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmAccountServicer
 * SupportingDocument1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmAmendment
 * SupportingDocument1.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmContractReference
 * SupportingDocument1.mmContractReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocument1#mmEntry
 * SupportingDocument1.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocument1#mmSupplementaryData
 * SupportingDocument1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegisteredContract
 * RegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmSupportingDocument
 * CurrencyControlSupportingDocumentDeliveryV01.mmSupportingDocument}</li>
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
 * "SupportingDocument1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency control document supporting the contract registration."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupportingDocument1", propOrder = {"supportingDocumentIdentification", "originalRequestIdentification", "certificate", "accountOwner", "accountServicer", "amendment", "contractReference", "entry", "supplementaryData"})
public class SupportingDocument1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SpprtgDocId", required = true)
	protected Max35Text supportingDocumentIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtgDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportingDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the supporting document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocument1, Max35Text> mmSupportingDocumentIdentification = new MMMessageAttribute<SupportingDocument1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "SpprtgDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportingDocumentIdentification";
			definition = "Unique and unambiguous identification of the supporting document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SupportingDocument1 obj) {
			return obj.getSupportingDocumentIdentification();
		}

		@Override
		public void setValue(SupportingDocument1 obj, Max35Text value) {
			obj.setSupportingDocumentIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlReqId")
	protected Max35Text originalRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the original query message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupportingDocument1, Optional<Max35Text>> mmOriginalRequestIdentification = new MMMessageAttribute<SupportingDocument1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestIdentification";
			definition = "Unique identification of the original query message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SupportingDocument1 obj) {
			return obj.getOriginalRequestIdentification();
		}

		@Override
		public void setValue(SupportingDocument1 obj, Optional<Max35Text> value) {
			obj.setOriginalRequestIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Cert", required = true)
	protected DocumentIdentification28 certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28
	 * DocumentIdentification28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
	 * RegisteredContract.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the certificate for which the supporting document is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, DocumentIdentification28> mmCertificate = new MMMessageAssociationEnd<SupportingDocument1, DocumentIdentification28>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmCertificate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Unique identification of the certificate for which the supporting document is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification28.mmObject();
		}

		@Override
		public DocumentIdentification28 getValue(SupportingDocument1 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(SupportingDocument1 obj, DocumentIdentification28 value) {
			obj.setCertificate(value);
		}
	};
	@XmlElement(name = "AcctOwnr", required = true)
	protected PartyIdentification77 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification77
	 * PartyIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReportingParty
	 * RegisteredContract.mmReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
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
	 * definition} = "Party that legally owns the cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, PartyIdentification77> mmAccountOwner = new MMMessageAssociationEnd<SupportingDocument1, PartyIdentification77>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmReportingParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification77.mmObject();
		}

		@Override
		public PartyIdentification77 getValue(SupportingDocument1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SupportingDocument1 obj, PartyIdentification77 value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "AcctSvcr", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationAgent
	 * RegisteredContract.mmRegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
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
	public static final MMMessageAssociationEnd<SupportingDocument1, BranchAndFinancialInstitutionIdentification5> mmAccountServicer = new MMMessageAssociationEnd<SupportingDocument1, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmRegistrationAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(SupportingDocument1 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(SupportingDocument1 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setAccountServicer(value);
		}
	};
	@XmlElement(name = "Amdmnt")
	protected DocumentAmendment1 amendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentAmendment1
	 * DocumentAmendment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment indicator details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, Optional<DocumentAmendment1>> mmAmendment = new MMMessageAssociationEnd<SupportingDocument1, Optional<DocumentAmendment1>>() {
		{
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Amendment indicator details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentAmendment1.mmObject();
		}

		@Override
		public Optional<DocumentAmendment1> getValue(SupportingDocument1 obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(SupportingDocument1 obj, Optional<DocumentAmendment1> value) {
			obj.setAmendment(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctRef", required = true)
	protected ContractRegistrationReference1Choice contractReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice
	 * ContractRegistrationReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmIdentification
	 * RegisteredContract.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the registered contract or the underlying contract for the supporting documents."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, ContractRegistrationReference1Choice> mmContractReference = new MMMessageAssociationEnd<SupportingDocument1, ContractRegistrationReference1Choice>() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the registered contract or the underlying contract for the supporting documents.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContractRegistrationReference1Choice.mmObject();
		}

		@Override
		public ContractRegistrationReference1Choice getValue(SupportingDocument1 obj) {
			return obj.getContractReference();
		}

		@Override
		public void setValue(SupportingDocument1 obj, ContractRegistrationReference1Choice value) {
			obj.setContractReference(value);
		}
	};
	@XmlElement(name = "Ntry", required = true)
	protected List<SupportingDocumentEntry1> entry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
	 * SupportingDocumentEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual entry of the supporting document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, List<SupportingDocumentEntry1>> mmEntry = new MMMessageAssociationEnd<SupportingDocument1, List<SupportingDocumentEntry1>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Individual entry of the supporting document.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SupportingDocumentEntry1.mmObject();
		}

		@Override
		public List<SupportingDocumentEntry1> getValue(SupportingDocument1 obj) {
			return obj.getEntry();
		}

		@Override
		public void setValue(SupportingDocument1 obj, List<SupportingDocumentEntry1> value) {
			obj.setEntry(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupportingDocument1
	 * SupportingDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupportingDocument1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<SupportingDocument1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupportingDocument1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SupportingDocument1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SupportingDocument1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocument1.mmSupportingDocumentIdentification, com.tools20022.repository.msg.SupportingDocument1.mmOriginalRequestIdentification,
						com.tools20022.repository.msg.SupportingDocument1.mmCertificate, com.tools20022.repository.msg.SupportingDocument1.mmAccountOwner, com.tools20022.repository.msg.SupportingDocument1.mmAccountServicer,
						com.tools20022.repository.msg.SupportingDocument1.mmAmendment, com.tools20022.repository.msg.SupportingDocument1.mmContractReference, com.tools20022.repository.msg.SupportingDocument1.mmEntry,
						com.tools20022.repository.msg.SupportingDocument1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(CurrencyControlSupportingDocumentDeliveryV01.mmSupportingDocument);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportingDocument1";
				definition = "Currency control document supporting the contract registration.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getSupportingDocumentIdentification() {
		return supportingDocumentIdentification;
	}

	public SupportingDocument1 setSupportingDocumentIdentification(Max35Text supportingDocumentIdentification) {
		this.supportingDocumentIdentification = Objects.requireNonNull(supportingDocumentIdentification);
		return this;
	}

	public Optional<Max35Text> getOriginalRequestIdentification() {
		return originalRequestIdentification == null ? Optional.empty() : Optional.of(originalRequestIdentification);
	}

	public SupportingDocument1 setOriginalRequestIdentification(Max35Text originalRequestIdentification) {
		this.originalRequestIdentification = originalRequestIdentification;
		return this;
	}

	public DocumentIdentification28 getCertificate() {
		return certificate;
	}

	public SupportingDocument1 setCertificate(DocumentIdentification28 certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public PartyIdentification77 getAccountOwner() {
		return accountOwner;
	}

	public SupportingDocument1 setAccountOwner(PartyIdentification77 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicer() {
		return accountServicer;
	}

	public SupportingDocument1 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = Objects.requireNonNull(accountServicer);
		return this;
	}

	public Optional<DocumentAmendment1> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public SupportingDocument1 setAmendment(DocumentAmendment1 amendment) {
		this.amendment = amendment;
		return this;
	}

	public ContractRegistrationReference1Choice getContractReference() {
		return contractReference;
	}

	public SupportingDocument1 setContractReference(ContractRegistrationReference1Choice contractReference) {
		this.contractReference = Objects.requireNonNull(contractReference);
		return this;
	}

	public List<SupportingDocumentEntry1> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public SupportingDocument1 setEntry(List<SupportingDocumentEntry1> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SupportingDocument1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}