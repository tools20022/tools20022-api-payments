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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.codeset.BalanceTransferWindow1Code;
import com.tools20022.repository.codeset.SwitchStatus1Code;
import com.tools20022.repository.codeset.SwitchType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountSwitching;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ResponseDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the account switch, including its status and any response codes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmUniqueReferenceNumber
 * AccountSwitchDetails1.mmUniqueReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmRoutingUniqueReferenceNumber
 * AccountSwitchDetails1.mmRoutingUniqueReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchReceivedDateTime
 * AccountSwitchDetails1.mmSwitchReceivedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchDate
 * AccountSwitchDetails1.mmSwitchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchType
 * AccountSwitchDetails1.mmSwitchType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchStatus
 * AccountSwitchDetails1.mmSwitchStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmBalanceTransferWindow
 * AccountSwitchDetails1.mmBalanceTransferWindow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmResponse
 * AccountSwitchDetails1.mmResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountSwitching
 * AccountSwitching}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmAccountSwitchDetails
 * AccountSwitchInformationResponseV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmAccountSwitchDetails
 * AccountSwitchBalanceTransferAcknowledgementV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTechnicalRejectionV01#mmAccountSwitchDetails
 * AccountSwitchTechnicalRejectionV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchPaymentResponseV01#mmAccountSwitchDetails
 * AccountSwitchPaymentResponseV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchNotifyAccountSwitchCompleteV01#mmAccountSwitchDetails
 * AccountSwitchNotifyAccountSwitchCompleteV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestBalanceTransferV01#mmAccountSwitchDetails
 * AccountSwitchRequestBalanceTransferV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01#mmAccountSwitchDetails
 * AccountSwitchInformationRequestV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmAccountSwitchDetails
 * AccountSwitchRequestRedirectionV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTerminationSwitchV01#mmAccountSwitchDetails
 * AccountSwitchTerminationSwitchV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchCancelExistingPaymentV01#mmAccountSwitchDetails
 * AccountSwitchCancelExistingPaymentV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmAccountSwitchDetails
 * AccountSwitchRequestPaymentV01.mmAccountSwitchDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountSwitchDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the account switch, including its status and any response codes."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSwitchDetails1", propOrder = {"uniqueReferenceNumber", "routingUniqueReferenceNumber", "switchReceivedDateTime", "switchDate", "switchType", "switchStatus", "balanceTransferWindow", "response"})
public class AccountSwitchDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnqRefNb", required = true)
	protected Max35Text uniqueReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmUniqueReferenceNumber
	 * AccountSwitching.mmUniqueReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number that provides unique and unambiguous identification of the account switch. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Max35Text> mmUniqueReferenceNumber = new MMMessageAttribute<AccountSwitchDetails1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmUniqueReferenceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "UnqRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueReferenceNumber";
			definition = "Unique number that provides unique and unambiguous identification of the account switch. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountSwitchDetails1 obj) {
			return obj.getUniqueReferenceNumber();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Max35Text value) {
			obj.setUniqueReferenceNumber(value);
		}
	};
	@XmlElement(name = "RtgUnqRefNb", required = true)
	protected Max35Text routingUniqueReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmUniqueReferenceNumber
	 * AccountSwitching.mmUniqueReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgUnqRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingUniqueReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number that provides unique and unambiguous identification of the account switch. \r\n\r\nUsage: Where one or more account switches have taken place since the original account switch this field contains the unique number that relates to the switch that transferred the account to the latest new account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Max35Text> mmRoutingUniqueReferenceNumber = new MMMessageAttribute<AccountSwitchDetails1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmUniqueReferenceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "RtgUnqRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingUniqueReferenceNumber";
			definition = "Unique number that provides unique and unambiguous identification of the account switch. \r\n\r\nUsage: Where one or more account switches have taken place since the original account switch this field contains the unique number that relates to the switch that transferred the account to the latest new account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountSwitchDetails1 obj) {
			return obj.getRoutingUniqueReferenceNumber();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Max35Text value) {
			obj.setRoutingUniqueReferenceNumber(value);
		}
	};
	@XmlElement(name = "SwtchRcvdDtTm")
	protected ISODateTime switchReceivedDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchReceivedDateTime
	 * AccountSwitching.mmSwitchReceivedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchRcvdDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchReceivedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time that the request was received by the central switch service, populated by the central switch service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Optional<ISODateTime>> mmSwitchReceivedDateTime = new MMMessageAttribute<AccountSwitchDetails1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmSwitchReceivedDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "SwtchRcvdDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchReceivedDateTime";
			definition = "Date and time that the request was received by the central switch service, populated by the central switch service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(AccountSwitchDetails1 obj) {
			return obj.getSwitchReceivedDateTime();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Optional<ISODateTime> value) {
			obj.setSwitchReceivedDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "SwtchDt")
	protected ISODate switchDate;
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
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchDate
	 * AccountSwitching.mmSwitchDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account switch is expected to have completed. The value is the same as the targeted switch date if the switch completes in the expected timeline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Optional<ISODate>> mmSwitchDate = new MMMessageAttribute<AccountSwitchDetails1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmSwitchDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "SwtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchDate";
			definition = "Date on which the account switch is expected to have completed. The value is the same as the targeted switch date if the switch completes in the expected timeline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountSwitchDetails1 obj) {
			return obj.getSwitchDate();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Optional<ISODate> value) {
			obj.setSwitchDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SwtchTp", required = true)
	protected SwitchType1Code switchType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchType1Code
	 * SwitchType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchType
	 * AccountSwitching.mmSwitchType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account switch is a full switch or a partial switch.\r\n\r\nUsage: A full switch indicates the transfer of the full balance of the account and associated payment mandates. A partial switch indicates the transfer of certain payment mandates to a new account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, SwitchType1Code> mmSwitchType = new MMMessageAttribute<AccountSwitchDetails1, SwitchType1Code>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmSwitchType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "SwtchTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchType";
			definition = "Indicates whether the account switch is a full switch or a partial switch.\r\n\r\nUsage: A full switch indicates the transfer of the full balance of the account and associated payment mandates. A partial switch indicates the transfer of certain payment mandates to a new account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwitchType1Code.mmObject();
		}

		@Override
		public SwitchType1Code getValue(AccountSwitchDetails1 obj) {
			return obj.getSwitchType();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, SwitchType1Code value) {
			obj.setSwitchType(value);
		}
	};
	@XmlElement(name = "SwtchSts")
	protected SwitchStatus1Code switchStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatus1Code
	 * SwitchStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchStatus
	 * AccountSwitching.mmSwitchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the account switch at the time the message is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Optional<SwitchStatus1Code>> mmSwitchStatus = new MMMessageAttribute<AccountSwitchDetails1, Optional<SwitchStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmSwitchStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "SwtchSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchStatus";
			definition = "State of the account switch at the time the message is sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SwitchStatus1Code.mmObject();
		}

		@Override
		public Optional<SwitchStatus1Code> getValue(AccountSwitchDetails1 obj) {
			return obj.getSwitchStatus();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Optional<SwitchStatus1Code> value) {
			obj.setSwitchStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTrfWndw")
	protected BalanceTransferWindow1Code balanceTransferWindow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindow1Code
	 * BalanceTransferWindow1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmBalanceTransferWindow
	 * AccountSwitching.mmBalanceTransferWindow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfWndw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferWindow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the processing window in which the balance transfer will be processed on the day of the account switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSwitchDetails1, Optional<BalanceTransferWindow1Code>> mmBalanceTransferWindow = new MMMessageAttribute<AccountSwitchDetails1, Optional<BalanceTransferWindow1Code>>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmBalanceTransferWindow;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "BalTrfWndw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferWindow";
			definition = "Identifies the processing window in which the balance transfer will be processed on the day of the account switch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BalanceTransferWindow1Code.mmObject();
		}

		@Override
		public Optional<BalanceTransferWindow1Code> getValue(AccountSwitchDetails1 obj) {
			return obj.getBalanceTransferWindow();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, Optional<BalanceTransferWindow1Code> value) {
			obj.setBalanceTransferWindow(value.orElse(null));
		}
	};
	@XmlElement(name = "Rspn")
	protected List<ResponseDetails1> response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseDetails1
	 * ResponseDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response code and additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSwitchDetails1, List<ResponseDetails1>> mmResponse = new MMMessageAssociationEnd<AccountSwitchDetails1, List<ResponseDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSwitchDetails1.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response code and additional information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ResponseDetails1.mmObject();
		}

		@Override
		public List<ResponseDetails1> getValue(AccountSwitchDetails1 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(AccountSwitchDetails1 obj, List<ResponseDetails1> value) {
			obj.setResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountSwitchDetails1.mmUniqueReferenceNumber, com.tools20022.repository.msg.AccountSwitchDetails1.mmRoutingUniqueReferenceNumber,
						com.tools20022.repository.msg.AccountSwitchDetails1.mmSwitchReceivedDateTime, com.tools20022.repository.msg.AccountSwitchDetails1.mmSwitchDate, com.tools20022.repository.msg.AccountSwitchDetails1.mmSwitchType,
						com.tools20022.repository.msg.AccountSwitchDetails1.mmSwitchStatus, com.tools20022.repository.msg.AccountSwitchDetails1.mmBalanceTransferWindow, com.tools20022.repository.msg.AccountSwitchDetails1.mmResponse);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountSwitchInformationResponseV01.mmAccountSwitchDetails, AccountSwitchBalanceTransferAcknowledgementV01.mmAccountSwitchDetails,
						AccountSwitchTechnicalRejectionV01.mmAccountSwitchDetails, AccountSwitchPaymentResponseV01.mmAccountSwitchDetails, AccountSwitchNotifyAccountSwitchCompleteV01.mmAccountSwitchDetails,
						AccountSwitchRequestBalanceTransferV01.mmAccountSwitchDetails, AccountSwitchInformationRequestV01.mmAccountSwitchDetails, AccountSwitchRequestRedirectionV01.mmAccountSwitchDetails,
						AccountSwitchTerminationSwitchV01.mmAccountSwitchDetails, AccountSwitchCancelExistingPaymentV01.mmAccountSwitchDetails, AccountSwitchRequestPaymentV01.mmAccountSwitchDetails);
				trace_lazy = () -> AccountSwitching.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountSwitchDetails1";
				definition = "Details of the account switch, including its status and any response codes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getUniqueReferenceNumber() {
		return uniqueReferenceNumber;
	}

	public AccountSwitchDetails1 setUniqueReferenceNumber(Max35Text uniqueReferenceNumber) {
		this.uniqueReferenceNumber = Objects.requireNonNull(uniqueReferenceNumber);
		return this;
	}

	public Max35Text getRoutingUniqueReferenceNumber() {
		return routingUniqueReferenceNumber;
	}

	public AccountSwitchDetails1 setRoutingUniqueReferenceNumber(Max35Text routingUniqueReferenceNumber) {
		this.routingUniqueReferenceNumber = Objects.requireNonNull(routingUniqueReferenceNumber);
		return this;
	}

	public Optional<ISODateTime> getSwitchReceivedDateTime() {
		return switchReceivedDateTime == null ? Optional.empty() : Optional.of(switchReceivedDateTime);
	}

	public AccountSwitchDetails1 setSwitchReceivedDateTime(ISODateTime switchReceivedDateTime) {
		this.switchReceivedDateTime = switchReceivedDateTime;
		return this;
	}

	public Optional<ISODate> getSwitchDate() {
		return switchDate == null ? Optional.empty() : Optional.of(switchDate);
	}

	public AccountSwitchDetails1 setSwitchDate(ISODate switchDate) {
		this.switchDate = switchDate;
		return this;
	}

	public SwitchType1Code getSwitchType() {
		return switchType;
	}

	public AccountSwitchDetails1 setSwitchType(SwitchType1Code switchType) {
		this.switchType = Objects.requireNonNull(switchType);
		return this;
	}

	public Optional<SwitchStatus1Code> getSwitchStatus() {
		return switchStatus == null ? Optional.empty() : Optional.of(switchStatus);
	}

	public AccountSwitchDetails1 setSwitchStatus(SwitchStatus1Code switchStatus) {
		this.switchStatus = switchStatus;
		return this;
	}

	public Optional<BalanceTransferWindow1Code> getBalanceTransferWindow() {
		return balanceTransferWindow == null ? Optional.empty() : Optional.of(balanceTransferWindow);
	}

	public AccountSwitchDetails1 setBalanceTransferWindow(BalanceTransferWindow1Code balanceTransferWindow) {
		this.balanceTransferWindow = balanceTransferWindow;
		return this;
	}

	public List<ResponseDetails1> getResponse() {
		return response == null ? response = new ArrayList<>() : response;
	}

	public AccountSwitchDetails1 setResponse(List<ResponseDetails1> response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}
}