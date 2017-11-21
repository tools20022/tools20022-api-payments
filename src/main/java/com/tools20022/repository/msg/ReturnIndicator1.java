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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.InformationRequestResponseV01;
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.InvestigationResult1Choice;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#mmResponsePeriod
 * ReturnIndicator1.mmResponsePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#mmAuthorityRequestType
 * ReturnIndicator1.mmAuthorityRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#mmInvestigationResult
 * ReturnIndicator1.mmInvestigationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnIndicator1#mmAdditionalInformation
 * ReturnIndicator1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmReturnIndicator
 * InformationRequestResponseV01.mmReturnIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ReturnIndicator1", propOrder = {"responsePeriod", "authorityRequestType", "investigationResult", "additionalInformation"})
public class ReturnIndicator1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateOrDateTimePeriodChoice responsePeriod;
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
	public static final MMMessageAttribute mmResponsePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "RspnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsePeriod";
			definition = "Specifies the dates between which period the response results relate to.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}
	};
	protected AuthorityRequestType1 authorityRequestType;
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
	public static final MMMessageAttribute mmAuthorityRequestType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AuthrtyReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorityRequestType";
			definition = "Identifies the authority request type as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AuthorityRequestType1.mmObject();
		}
	};
	protected InvestigationResult1Choice investigationResult;
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
	public static final MMMessageAttribute mmInvestigationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "InvstgtnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationResult";
			definition = "Provides the investigation result.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationResult1Choice.mmObject();
		}
	};
	protected Max500Text additionalInformation;
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
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information, in free text form, to complement the investigation result.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReturnIndicator1.mmResponsePeriod, ReturnIndicator1.mmAuthorityRequestType, ReturnIndicator1.mmInvestigationResult, ReturnIndicator1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InformationRequestResponseV01.mmReturnIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReturnIndicator1";
				definition = "Provides the return indicators and the investigation result.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RspnPrd")
	public DateOrDateTimePeriodChoice getResponsePeriod() {
		return responsePeriod;
	}

	public void setResponsePeriod(DateOrDateTimePeriodChoice responsePeriod) {
		this.responsePeriod = responsePeriod;
	}

	@XmlElement(name = "AuthrtyReqTp", required = true)
	public AuthorityRequestType1 getAuthorityRequestType() {
		return authorityRequestType;
	}

	public void setAuthorityRequestType(com.tools20022.repository.msg.AuthorityRequestType1 authorityRequestType) {
		this.authorityRequestType = authorityRequestType;
	}

	@XmlElement(name = "InvstgtnRslt", required = true)
	public InvestigationResult1Choice getInvestigationResult() {
		return investigationResult;
	}

	public void setInvestigationResult(InvestigationResult1Choice investigationResult) {
		this.investigationResult = investigationResult;
	}

	@XmlElement(name = "AddtlInf")
	public Max500Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}