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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.codeset.ExternalRePresentmentReason1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Individual card transaction entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#ICCRelatedData
 * CardIndividualTransaction2.ICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#PaymentContext
 * CardIndividualTransaction2.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#AdditionalService
 * CardIndividualTransaction2.AdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionCategory
 * CardIndividualTransaction2.TransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#SaleReconciliationIdentification
 * CardIndividualTransaction2.SaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#SaleReferenceNumber
 * CardIndividualTransaction2.SaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#RePresentmentReason
 * CardIndividualTransaction2.RePresentmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#SequenceNumber
 * CardIndividualTransaction2.SequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionIdentification
 * CardIndividualTransaction2.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#Product
 * CardIndividualTransaction2.Product}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#ValidationDate
 * CardIndividualTransaction2.ValidationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#ValidationSequenceNumber
 * CardIndividualTransaction2.ValidationSequenceNumber}</li>
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
 * "CardIndividualTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Individual card transaction entry details."</li>
 * </ul>
 */
public class CardIndividualTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data related to an integrated circuit card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ICCRelatedData
	 * CardPaymentAcquiring.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to an integrated circuit card application."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.ICCRelatedData;
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	/**
	 * Context of the card payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
	 * CardPayment.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the card payment transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring;
			isDerived = false;
			xmlTag = "PmtCntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentContext";
			definition = "Context of the card payment transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentContext3.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
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
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
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
	 * goods the merchant provides for the transaction.<br>
	 * This element is also known as the MerchantCategoryCode.
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
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
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.\r\nThis element is also known as the MerchantCategoryCode."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Type;
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.\r\nThis element is also known as the MerchantCategoryCode.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#ReconciliationIdentification
	 * ReconciliationTransaction.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
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
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.ReconciliationIdentification;
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
	 * Unique reference of the sales as provided by the merchant.
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference of the sales as provided by the merchant."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SaleReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Unique reference of the sales as provided by the merchant.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reason for representment of a card transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalRePresentmentReason1Code
	 * ExternalRePresentmentReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RePresntmntRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RePresentmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for representment of a card transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RePresentmentReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RePresntmntRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RePresentmentReason";
			definition = "Reason for representment of a card transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalRePresentmentReason1Code.mmObject();
		}
	};
	/**
	 * Sequential number of the card transaction, as assigned by the POI (Point
	 * of Interaction). Usage: The sequential number is increased incrementally
	 * for each transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
	 * CardPaymentAcquiring.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification;
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> TransactionIdentifier1.mmObject();
		}
	};
	/**
	 * Product purchased with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#Product
	 * CardPayment.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Product = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.Product;
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Product2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date when the deposit was validated by the financial institution that
	 * collected the cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the deposit was validated by the financial institution that collected the cash."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValidationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "VldtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationDate";
			definition = "Date when the deposit was validated by the financial institution that collected the cash.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Sequential number of the validation of the cash deposit.<br>
	 * Usage: The sequential number is increased incrementally for each
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValidationSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "VldtnSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSequenceNumber";
			definition = "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction2.ICCRelatedData, com.tools20022.repository.msg.CardIndividualTransaction2.PaymentContext,
						com.tools20022.repository.msg.CardIndividualTransaction2.AdditionalService, com.tools20022.repository.msg.CardIndividualTransaction2.TransactionCategory,
						com.tools20022.repository.msg.CardIndividualTransaction2.SaleReconciliationIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.SaleReferenceNumber,
						com.tools20022.repository.msg.CardIndividualTransaction2.RePresentmentReason, com.tools20022.repository.msg.CardIndividualTransaction2.SequenceNumber,
						com.tools20022.repository.msg.CardIndividualTransaction2.TransactionIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.Product,
						com.tools20022.repository.msg.CardIndividualTransaction2.ValidationDate, com.tools20022.repository.msg.CardIndividualTransaction2.ValidationSequenceNumber);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardIndividualTransaction2";
				definition = "Individual card transaction entry details.";
			}
		});
		return mmObject_lazy.get();
	}
}