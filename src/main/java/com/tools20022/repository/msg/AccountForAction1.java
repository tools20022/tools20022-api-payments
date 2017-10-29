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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.CashAccount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountForAction1#Identification
 * AccountForAction1.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1#Currency
 * AccountForAction1.Currency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#AccountIdentification
 * AccountAdditionalInformationRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#AccountIdentification
 * AccountClosingAdditionalInformationRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#BalanceTransferAccount
 * AccountClosingAdditionalInformationRequestV02.BalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#AccountIdentification
 * AccountClosingAmendmentRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#BalanceTransferAccount
 * AccountClosingAmendmentRequestV02.BalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#BalanceTransferAccount
 * AccountClosingRequestV02.BalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#AccountIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#AccountIdentification
 * AccountMandateMaintenanceRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#AccountIdentification
 * AccountReportRequestV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#AccountIdentification
 * AccountRequestAcknowledgementV02.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#AccountIdentification
 * AccountRequestRejectionV02.AccountIdentification}</li>
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
 * "AccountForAction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2
 * AccountForAction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AccountForAction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#Identification
	 * Account.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
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
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountForAction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	/**
	 * Medium of exchange of value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#BaseCurrency
	 * Account.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Currency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountForAction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.BaseCurrency;
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountForAction1.Identification, com.tools20022.repository.msg.AccountForAction1.Currency);
				trace_lazy = () -> CashAccount.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.AccountIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.AccountIdentification, com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.BalanceTransferAccount,
						com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.AccountIdentification, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.BalanceTransferAccount,
						com.tools20022.repository.area.acmt.AccountClosingRequestV02.BalanceTransferAccount, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.AccountIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.AccountIdentification, com.tools20022.repository.area.acmt.AccountReportRequestV02.AccountIdentification,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.AccountIdentification, com.tools20022.repository.area.acmt.AccountRequestRejectionV02.AccountIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountForAction1";
				definition = "Account to or from which a cash entry is made.";
				nextVersions_lazy = () -> Arrays.asList(AccountForAction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}