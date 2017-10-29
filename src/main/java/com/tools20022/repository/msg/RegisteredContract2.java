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
import com.tools20022.repository.choice.ContractClosureReason1Choice;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.RegisteredContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document that a user must file with an authorized servicer for each contract
 * that involves foreign currency transactions with non residents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#RegisteredContractClosureIdentification
 * RegisteredContract2.RegisteredContractClosureIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#ReportingParty
 * RegisteredContract2.ReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#RegistrationAgent
 * RegisteredContract2.RegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#OriginalRegisteredContract
 * RegisteredContract2.OriginalRegisteredContract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract2#Priority
 * RegisteredContract2.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#ClosureReason
 * RegisteredContract2.ClosureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContract2#SupplementaryData
 * RegisteredContract2.SupplementaryData}</li>
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
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#RegisteredContractClosure
 * ContractRegistrationClosureRequestV01.RegisteredContractClosure}</li>
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
 * "RegisteredContract2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents."
 * </li>
 * </ul>
 */
public class RegisteredContract2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the registered contract closure.
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctClsrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractClosureIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract closure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RegisteredContractClosureIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "RegdCtrctClsrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractClosureIdentification";
			definition = "Unique and unambiguous identification of the registered contract closure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party who registered the currency control contract.
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
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
	 * definition} = "Party who registered the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReportingParty;
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party who registered the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agent who registered the currency control contract.
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
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
	 * definition} = "Agent who registered the currency control contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegistrationAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			isDerived = false;
			xmlTag = "RegnAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent who registered the currency control contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Original registered contract identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29
	 * DocumentIdentification29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Identification
	 * RegisteredContract.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRegdCtrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRegisteredContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original registered contract identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalRegisteredContract = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Identification;
			isDerived = false;
			xmlTag = "OrgnlRegdCtrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRegisteredContract";
			definition = "Original registered contract identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification29.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Priority of the registered contract closure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Priority
	 * RegisteredContract.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority of the registered contract closure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Priority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Priority;
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Priority of the registered contract closure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Reason of the closure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice
	 * ContractClosureReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
	 * RegisteredContract.ClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the closure."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClosureReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredContract2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ClosureReason;
			isDerived = false;
			xmlTag = "ClsrRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureReason";
			definition = "Reason of the closure.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ContractClosureReason1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
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
			componentContext_lazy = () -> RegisteredContract2.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegisteredContract2.RegisteredContractClosureIdentification, com.tools20022.repository.msg.RegisteredContract2.ReportingParty,
						com.tools20022.repository.msg.RegisteredContract2.RegistrationAgent, com.tools20022.repository.msg.RegisteredContract2.OriginalRegisteredContract, com.tools20022.repository.msg.RegisteredContract2.Priority,
						com.tools20022.repository.msg.RegisteredContract2.ClosureReason, com.tools20022.repository.msg.RegisteredContract2.SupplementaryData);
				trace_lazy = () -> RegisteredContract.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01.RegisteredContractClosure);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract2";
				definition = "Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.";
			}
		});
		return mmObject_lazy.get();
	}
}