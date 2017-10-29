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
import com.tools20022.repository.choice.PartyOrGroup1Choice;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.entity.Party;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party and related authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#PartyOrGroup
 * PartyAndAuthorisation1.PartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#SignatureOrder
 * PartyAndAuthorisation1.SignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#Authorisation
 * PartyAndAuthorisation1.Authorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "PartyAndAuthorisation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and related authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
 * PartyAndAuthorisation3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PartyAndAuthorisation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a party or a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PartyOrGroup1Choice
	 * PartyOrGroup1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyOrGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyOrGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a party or a group of parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PartyOrGroup = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAndAuthorisation1.mmObject();
			businessComponentTrace_lazy = () -> Party.mmObject();
			isDerived = false;
			xmlTag = "PtyOrGrp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyOrGroup";
			definition = "Specifies a party or a group of parties.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PartyOrGroup1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Order in which the mandate holder has to sign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#SignatureOrder
	 * SignatureCondition.SignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order in which the mandate holder has to sign."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SignatureOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyAndAuthorisation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SignatureCondition.SignatureOrder;
			isDerived = false;
			xmlTag = "SgntrOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureOrder";
			definition = "Order in which the mandate holder has to sign.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}
	};
	/**
	 * Authorisation granted to a mandate holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Authorisation2
	 * Authorisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#OperationThreshold
	 * BankOperation.OperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation granted to a mandate holder."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Authorisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyAndAuthorisation1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BankOperation.OperationThreshold;
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation granted to a mandate holder.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Authorisation2.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndAuthorisation1.PartyOrGroup, com.tools20022.repository.msg.PartyAndAuthorisation1.SignatureOrder,
						com.tools20022.repository.msg.PartyAndAuthorisation1.Authorisation);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyAndAuthorisation1";
				definition = "Party and related authorisation.";
				nextVersions_lazy = () -> Arrays.asList(PartyAndAuthorisation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}