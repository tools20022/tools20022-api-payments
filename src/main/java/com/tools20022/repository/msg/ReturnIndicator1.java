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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.InvestigationResult1Choice;
import com.tools20022.repository.datatype.Max500Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the return indicators and the investigation result.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#ResponsePeriod
 * ReturnIndicator1.ResponsePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#AuthorityRequestType
 * ReturnIndicator1.AuthorityRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#InvestigationResult
 * ReturnIndicator1.InvestigationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#AdditionalInformation
 * ReturnIndicator1.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#ReturnIndicator
 * InformationRequestResponseV01.ReturnIndicator}</li>
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
 * "ReturnIndicator1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the return indicators and the investigation result."</li>
 * </ul>
 */
public class ReturnIndicator1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the dates between which period the response results relate to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the dates between which period the response results relate to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ResponsePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "RspnPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsePeriod";
			definition = "Specifies the dates between which period the response results relate to.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}
	};
	/**
	 * Identifies the authority request type as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityRequestType1
	 * AuthorityRequestType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrtyReqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorityRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the authority request type as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AuthorityRequestType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AuthrtyReqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorityRequestType";
			definition = "Identifies the authority request type as a code.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AuthorityRequestType1.mmObject();
		}
	};
	/**
	 * Provides the investigation result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationResult1Choice
	 * InvestigationResult1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the investigation result."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute InvestigationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "InvstgtnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationResult";
			definition = "Provides the investigation result.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> InvestigationResult1Choice.mmObject();
		}
	};
	/**
	 * Additional information, in free text form, to complement the
	 * investigation result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1
	 * ReturnIndicator1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information, in free text form, to complement the investigation result."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information, in free text form, to complement the investigation result.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReturnIndicator1.ResponsePeriod, com.tools20022.repository.msg.ReturnIndicator1.AuthorityRequestType,
						com.tools20022.repository.msg.ReturnIndicator1.InvestigationResult, com.tools20022.repository.msg.ReturnIndicator1.AdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestResponseV01.ReturnIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReturnIndicator1";
				definition = "Provides the return indicators and the investigation result.";
			}
		});
		return mmObject_lazy.get();
	}
}