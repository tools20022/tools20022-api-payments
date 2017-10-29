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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.msg.AccountAndParties1;
import com.tools20022.repository.msg.CustomerIdentification1;
import com.tools20022.repository.msg.PaymentInstrumentType1;
import com.tools20022.repository.msg.RequestType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of search criteria for the financial investigation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#Account
 * SearchCriteria1Choice.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#CustomerIdentification
 * SearchCriteria1Choice.CustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#PaymentInstrument
 * SearchCriteria1Choice.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#OriginalTransactionNumber
 * SearchCriteria1Choice.OriginalTransactionNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#SearchCriteria
 * InformationRequestOpeningV01.SearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#SearchCriteria
 * InformationRequestResponseV01.SearchCriteria}</li>
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
 * "SearchCriteria1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of search criteria for the financial investigation."</li>
 * </ul>
 */
public class SearchCriteria1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the account as the search criteria for the financial
	 * institution to do the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndParties1
	 * AccountAndParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
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
	 * "Identifies the account as the search criteria for the financial institution to do the investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Account = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Identifies the account as the search criteria for the financial institution to do the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AccountAndParties1.mmObject();
		}
	};
	/**
	 * Identifies a customer identification as the search criteria for the
	 * financial institution to do the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CustomerIdentification1
	 * CustomerIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a customer identification as the search criteria for the financial institution to do the investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CustomerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Identifies a customer identification as the search criteria for the financial institution to do the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CustomerIdentification1.mmObject();
		}
	};
	/**
	 * Identifies a payment instrument as the search criteria for the financial
	 * institution to do the investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrumentType1
	 * PaymentInstrumentType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a payment instrument as the search criteria for the financial institution to do the investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentInstrument = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrument";
			definition = "Identifies a payment instrument as the search criteria for the financial institution to do the investigation.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PaymentInstrumentType1.mmObject();
		}
	};
	/**
	 * Specifies the original transaction number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.RequestType1
	 * RequestType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice
	 * SearchCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the original transaction number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalTransactionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionNumber";
			definition = "Specifies the original transaction number.";
			minOccurs = 1;
			complexType_lazy = () -> RequestType1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SearchCriteria1Choice.Account, com.tools20022.repository.choice.SearchCriteria1Choice.CustomerIdentification,
						com.tools20022.repository.choice.SearchCriteria1Choice.PaymentInstrument, com.tools20022.repository.choice.SearchCriteria1Choice.OriginalTransactionNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InformationRequestOpeningV01.SearchCriteria, com.tools20022.repository.area.auth.InformationRequestResponseV01.SearchCriteria);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SearchCriteria1Choice";
				definition = "Choice of search criteria for the financial investigation.";
			}
		});
		return mmObject_lazy.get();
	}
}