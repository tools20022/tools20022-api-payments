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
import com.tools20022.repository.msg.AuthorityRequestType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnIndicator1", propOrder = {"responsePeriod", "authorityRequestType", "investigationResult", "additionalInformation"})
public class ReturnIndicator1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RspnPrd")
	protected DateOrDateTimePeriodChoice responsePeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReturnIndicator1, Optional<DateOrDateTimePeriodChoice>> mmResponsePeriod = new MMMessageAttribute<ReturnIndicator1, Optional<DateOrDateTimePeriodChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "RspnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsePeriod";
			definition = "Specifies the dates between which period the response results relate to.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateOrDateTimePeriodChoice> getValue(ReturnIndicator1 obj) {
			return obj.getResponsePeriod();
		}

		@Override
		public void setValue(ReturnIndicator1 obj, Optional<DateOrDateTimePeriodChoice> value) {
			obj.setResponsePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthrtyReqTp", required = true)
	protected AuthorityRequestType1 authorityRequestType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReturnIndicator1, AuthorityRequestType1> mmAuthorityRequestType = new MMMessageAttribute<ReturnIndicator1, AuthorityRequestType1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AuthrtyReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorityRequestType";
			definition = "Identifies the authority request type as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AuthorityRequestType1.mmObject();
		}

		@Override
		public AuthorityRequestType1 getValue(ReturnIndicator1 obj) {
			return obj.getAuthorityRequestType();
		}

		@Override
		public void setValue(ReturnIndicator1 obj, AuthorityRequestType1 value) {
			obj.setAuthorityRequestType(value);
		}
	};
	@XmlElement(name = "InvstgtnRslt", required = true)
	protected InvestigationResult1Choice investigationResult;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReturnIndicator1, InvestigationResult1Choice> mmInvestigationResult = new MMMessageAttribute<ReturnIndicator1, InvestigationResult1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "InvstgtnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationResult";
			definition = "Provides the investigation result.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationResult1Choice.mmObject();
		}

		@Override
		public InvestigationResult1Choice getValue(ReturnIndicator1 obj) {
			return obj.getInvestigationResult();
		}

		@Override
		public void setValue(ReturnIndicator1 obj, InvestigationResult1Choice value) {
			obj.setInvestigationResult(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReturnIndicator1, Optional<Max500Text>> mmAdditionalInformation = new MMMessageAttribute<ReturnIndicator1, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReturnIndicator1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information, in free text form, to complement the investigation result.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(ReturnIndicator1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ReturnIndicator1 obj, Optional<Max500Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReturnIndicator1.mmResponsePeriod, com.tools20022.repository.msg.ReturnIndicator1.mmAuthorityRequestType,
						com.tools20022.repository.msg.ReturnIndicator1.mmInvestigationResult, com.tools20022.repository.msg.ReturnIndicator1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InformationRequestResponseV01.mmReturnIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReturnIndicator1";
				definition = "Provides the return indicators and the investigation result.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateOrDateTimePeriodChoice> getResponsePeriod() {
		return responsePeriod == null ? Optional.empty() : Optional.of(responsePeriod);
	}

	public ReturnIndicator1 setResponsePeriod(DateOrDateTimePeriodChoice responsePeriod) {
		this.responsePeriod = responsePeriod;
		return this;
	}

	public AuthorityRequestType1 getAuthorityRequestType() {
		return authorityRequestType;
	}

	public ReturnIndicator1 setAuthorityRequestType(AuthorityRequestType1 authorityRequestType) {
		this.authorityRequestType = Objects.requireNonNull(authorityRequestType);
		return this;
	}

	public InvestigationResult1Choice getInvestigationResult() {
		return investigationResult;
	}

	public ReturnIndicator1 setInvestigationResult(InvestigationResult1Choice investigationResult) {
		this.investigationResult = Objects.requireNonNull(investigationResult);
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ReturnIndicator1 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}