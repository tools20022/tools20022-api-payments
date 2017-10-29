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
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Globalised card transaction entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#AdditionalService
 * CardAggregated1.AdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#TransactionCategory
 * CardAggregated1.TransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#SaleReconciliationIdentification
 * CardAggregated1.SaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#SequenceNumberRange
 * CardAggregated1.SequenceNumberRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#TransactionDateRange
 * CardAggregated1.TransactionDateRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardAggregated1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Globalised card transaction entry details."</li>
 * </ul>
 */
public class CardAggregated1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Service in addition to the main service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
	 * CardPaymentAcquiring.CardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service in addition to the main service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAggregated1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService;
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code
	 * ExternalCardTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Type Payment.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAggregated1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Type;
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategory1Code.mmObject();
		}
	};
	/**
	 * Unique identification of the sales reconciliation period between the
	 * acceptor and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SaleReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Range of sequence numbers on which the globalisation applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1
	 * CardSequenceNumberRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNbRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of sequence numbers on which the globalisation applies."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SequenceNumberRange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "SeqNbRg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberRange";
			definition = "Range of sequence numbers on which the globalisation applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardSequenceNumberRange1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date range on which the globalisation applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date range on which the globalisation applies."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionDateRange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "TxDtRg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateRange";
			definition = "Date range on which the globalisation applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAggregated1.AdditionalService, com.tools20022.repository.msg.CardAggregated1.TransactionCategory,
						com.tools20022.repository.msg.CardAggregated1.SaleReconciliationIdentification, com.tools20022.repository.msg.CardAggregated1.SequenceNumberRange, com.tools20022.repository.msg.CardAggregated1.TransactionDateRange);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardAggregated1";
				definition = "Globalised card transaction entry details.";
			}
		});
		return mmObject_lazy.get();
	}
}