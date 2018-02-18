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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.InformationRequestOpeningV01;
import com.tools20022.repository.area.auth.InformationRequestResponseV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountAndParties1;
import com.tools20022.repository.msg.CustomerIdentification1;
import com.tools20022.repository.msg.PaymentInstrumentType1;
import com.tools20022.repository.msg.RequestType1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#mmAccount
 * SearchCriteria1Choice.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#mmCustomerIdentification
 * SearchCriteria1Choice.mmCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#mmPaymentInstrument
 * SearchCriteria1Choice.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SearchCriteria1Choice#mmOriginalTransactionNumber
 * SearchCriteria1Choice.mmOriginalTransactionNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01#mmSearchCriteria
 * InformationRequestOpeningV01.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01#mmSearchCriteria
 * InformationRequestResponseV01.mmSearchCriteria}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SearchCriteria1Choice", propOrder = {"account", "customerIdentification", "paymentInstrument", "originalTransactionNumber"})
public class SearchCriteria1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected AccountAndParties1 account;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Identifies the account as the search criteria for the financial institution to do the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndParties1.mmObject();
		}
	};
	@XmlElement(name = "CstmrId", required = true)
	protected CustomerIdentification1 customerIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmCustomerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Identifies a customer identification as the search criteria for the financial institution to do the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CustomerIdentification1.mmObject();
		}
	};
	@XmlElement(name = "PmtInstrm", required = true)
	protected PaymentInstrumentType1 paymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmPaymentInstrument = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrument";
			definition = "Identifies a payment instrument as the search criteria for the financial institution to do the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstrumentType1.mmObject();
		}
	};
	@XmlElement(name = "OrgnlTxNb", required = true)
	protected List<RequestType1> originalTransactionNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmOriginalTransactionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SearchCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionNumber";
			definition = "Specifies the original transaction number.";
			minOccurs = 1;
			complexType_lazy = () -> RequestType1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SearchCriteria1Choice.mmAccount, com.tools20022.repository.choice.SearchCriteria1Choice.mmCustomerIdentification,
						com.tools20022.repository.choice.SearchCriteria1Choice.mmPaymentInstrument, com.tools20022.repository.choice.SearchCriteria1Choice.mmOriginalTransactionNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(InformationRequestOpeningV01.mmSearchCriteria, InformationRequestResponseV01.mmSearchCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SearchCriteria1Choice";
				definition = "Choice of search criteria for the financial investigation.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountAndParties1 getAccount() {
		return account;
	}

	public SearchCriteria1Choice setAccount(AccountAndParties1 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public CustomerIdentification1 getCustomerIdentification() {
		return customerIdentification;
	}

	public SearchCriteria1Choice setCustomerIdentification(CustomerIdentification1 customerIdentification) {
		this.customerIdentification = Objects.requireNonNull(customerIdentification);
		return this;
	}

	public PaymentInstrumentType1 getPaymentInstrument() {
		return paymentInstrument;
	}

	public SearchCriteria1Choice setPaymentInstrument(PaymentInstrumentType1 paymentInstrument) {
		this.paymentInstrument = Objects.requireNonNull(paymentInstrument);
		return this;
	}

	public List<RequestType1> getOriginalTransactionNumber() {
		return originalTransactionNumber == null ? originalTransactionNumber = new ArrayList<>() : originalTransactionNumber;
	}

	public SearchCriteria1Choice setOriginalTransactionNumber(List<RequestType1> originalTransactionNumber) {
		this.originalTransactionNumber = Objects.requireNonNull(originalTransactionNumber);
		return this;
	}
}