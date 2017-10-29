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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.RegisteredContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Currency control registered contract amendment details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#ContractRegistrationAmendmentIdentification
 * RegisteredContract1.ContractRegistrationAmendmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#ReportingParty
 * RegisteredContract1.ReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#RegistrationAgent
 * RegisteredContract1.RegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#RegisteredContractAmendment
 * RegisteredContract1.RegisteredContractAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract1#SupplementaryData
 * RegisteredContract1.SupplementaryData}</li>
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
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01#ContractRegistrationAmendment
 * ContractRegistrationAmendmentRequestV01.ContractRegistrationAmendment}</li>
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
 * "RegisteredContract1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Currency control registered contract amendment details."</li>
 * </ul>
 */
public class RegisteredContract1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the contract registration
	 * amendment.
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1
	 * RegisteredContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRegnAmdmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistrationAmendmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the  contract registration amendment. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContractRegistrationAmendmentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "CtrctRegnAmdmntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractRegistrationAmendmentIdentification";
			definition = "Unique and unambiguous identification of the  contract registration amendment. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party registering the currency control contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ReportingParty
	 * RegisteredContract.ReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1
	 * RegisteredContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party registering the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReportingParty;
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party registering the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agent which registers the currency control contract.
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RegistrationAgent
	 * RegisteredContract.RegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1
	 * RegisteredContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which registers the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegistrationAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			isDerived = false;
			xmlTag = "RegnAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which registers the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amendment details applied on one or several registered contracts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegisteredContract3
	 * RegisteredContract3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1
	 * RegisteredContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctAmdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amendment details applied on one or several registered contracts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegisteredContractAmendment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract1.mmObject();
			businessComponentTrace_lazy = () -> RegisteredContract.mmObject();
			isDerived = false;
			xmlTag = "RegdCtrctAmdmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractAmendment";
			definition = "Amendment details applied on one or several registered contracts.";
			minOccurs = 1;
			type_lazy = () -> RegisteredContract3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract1
	 * RegisteredContract1}</li>
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
	public static final MMMessageAssociationEnd SupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			type_lazy = () -> SupplementaryData1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.RegisteredContract1.ContractRegistrationAmendmentIdentification, com.tools20022.repository.msg.RegisteredContract1.ReportingParty,
								com.tools20022.repository.msg.RegisteredContract1.RegistrationAgent, com.tools20022.repository.msg.RegisteredContract1.RegisteredContractAmendment,
								com.tools20022.repository.msg.RegisteredContract1.SupplementaryData);
				trace_lazy = () -> RegisteredContract.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01.ContractRegistrationAmendment);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract1";
				definition = "Currency control registered contract amendment details.";
			}
		});
		return mmObject_lazy.get();
	}
}