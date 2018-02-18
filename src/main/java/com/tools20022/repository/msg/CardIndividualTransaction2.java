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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.codeset.ExternalRePresentmentReason1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmICCRelatedData
 * CardIndividualTransaction2.mmICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmPaymentContext
 * CardIndividualTransaction2.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmAdditionalService
 * CardIndividualTransaction2.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionCategory
 * CardIndividualTransaction2.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSaleReconciliationIdentification
 * CardIndividualTransaction2.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSaleReferenceNumber
 * CardIndividualTransaction2.mmSaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmRePresentmentReason
 * CardIndividualTransaction2.mmRePresentmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSequenceNumber
 * CardIndividualTransaction2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionIdentification
 * CardIndividualTransaction2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmProduct
 * CardIndividualTransaction2.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmValidationDate
 * CardIndividualTransaction2.mmValidationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmValidationSequenceNumber
 * CardIndividualTransaction2.mmValidationSequenceNumber}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardIndividualTransaction2", propOrder = {"iCCRelatedData", "paymentContext", "additionalService", "transactionCategory", "saleReconciliationIdentification", "saleReferenceNumber", "rePresentmentReason", "sequenceNumber",
		"transactionIdentification", "product", "validationDate", "validationSequenceNumber"})
public class CardIndividualTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ICCRltdData")
	protected Max1025Text iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmICCRelatedData
	 * CardPaymentAcquiring.mmICCRelatedData}</li>
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
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmICCRelatedData;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	@XmlElement(name = "PmtCntxt")
	protected PaymentContext3 paymentContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
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
	public static final MMMessageAssociationEnd mmPaymentContext = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "PmtCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentContext";
			definition = "Context of the card payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentContext3.mmObject();
		}
	};
	@XmlElement(name = "AddtlSvc")
	protected CardPaymentServiceType2Code additionalService;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
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
	public static final MMMessageAttribute mmAdditionalService = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	@XmlElement(name = "TxCtgy")
	protected ExternalCardTransactionCategory1Code transactionCategory;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
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
	public static final MMMessageAttribute mmTransactionCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.\r\nThis element is also known as the MerchantCategoryCode.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalCardTransactionCategory1Code.mmObject();
		}
	};
	@XmlElement(name = "SaleRcncltnId")
	protected Max35Text saleReconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
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
	public static final MMMessageAttribute mmSaleReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SaleRefNb")
	protected Max35Text saleReferenceNumber;
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
	public static final MMMessageAttribute mmSaleReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Unique reference of the sales as provided by the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RePresntmntRsn")
	protected ExternalRePresentmentReason1Code rePresentmentReason;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmRePresentmentReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RePresntmntRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RePresentmentReason";
			definition = "Reason for representment of a card transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalRePresentmentReason1Code.mmObject();
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
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
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
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
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	@XmlElement(name = "Pdct")
	protected Product2 product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
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
	public static final MMMessageAssociationEnd mmProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Product2.mmObject();
		}
	};
	@XmlElement(name = "VldtnDt")
	protected ISODate validationDate;
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
	public static final MMMessageAttribute mmValidationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "VldtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationDate";
			definition = "Date when the deposit was validated by the financial institution that collected the cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "VldtnSeqNb")
	protected Max35Text validationSequenceNumber;
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
	public static final MMMessageAttribute mmValidationSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardIndividualTransaction2.mmObject();
			isDerived = false;
			xmlTag = "VldtnSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSequenceNumber";
			definition = "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction2.mmICCRelatedData, com.tools20022.repository.msg.CardIndividualTransaction2.mmPaymentContext,
						com.tools20022.repository.msg.CardIndividualTransaction2.mmAdditionalService, com.tools20022.repository.msg.CardIndividualTransaction2.mmTransactionCategory,
						com.tools20022.repository.msg.CardIndividualTransaction2.mmSaleReconciliationIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.mmSaleReferenceNumber,
						com.tools20022.repository.msg.CardIndividualTransaction2.mmRePresentmentReason, com.tools20022.repository.msg.CardIndividualTransaction2.mmSequenceNumber,
						com.tools20022.repository.msg.CardIndividualTransaction2.mmTransactionIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.mmProduct,
						com.tools20022.repository.msg.CardIndividualTransaction2.mmValidationDate, com.tools20022.repository.msg.CardIndividualTransaction2.mmValidationSequenceNumber);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardIndividualTransaction2";
				definition = "Individual card transaction entry details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max1025Text> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public CardIndividualTransaction2 setICCRelatedData(Max1025Text iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}

	public Optional<PaymentContext3> getPaymentContext() {
		return paymentContext == null ? Optional.empty() : Optional.of(paymentContext);
	}

	public CardIndividualTransaction2 setPaymentContext(com.tools20022.repository.msg.PaymentContext3 paymentContext) {
		this.paymentContext = paymentContext;
		return this;
	}

	public Optional<CardPaymentServiceType2Code> getAdditionalService() {
		return additionalService == null ? Optional.empty() : Optional.of(additionalService);
	}

	public CardIndividualTransaction2 setAdditionalService(CardPaymentServiceType2Code additionalService) {
		this.additionalService = additionalService;
		return this;
	}

	public Optional<ExternalCardTransactionCategory1Code> getTransactionCategory() {
		return transactionCategory == null ? Optional.empty() : Optional.of(transactionCategory);
	}

	public CardIndividualTransaction2 setTransactionCategory(ExternalCardTransactionCategory1Code transactionCategory) {
		this.transactionCategory = transactionCategory;
		return this;
	}

	public Optional<Max35Text> getSaleReconciliationIdentification() {
		return saleReconciliationIdentification == null ? Optional.empty() : Optional.of(saleReconciliationIdentification);
	}

	public CardIndividualTransaction2 setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getSaleReferenceNumber() {
		return saleReferenceNumber == null ? Optional.empty() : Optional.of(saleReferenceNumber);
	}

	public CardIndividualTransaction2 setSaleReferenceNumber(Max35Text saleReferenceNumber) {
		this.saleReferenceNumber = saleReferenceNumber;
		return this;
	}

	public Optional<ExternalRePresentmentReason1Code> getRePresentmentReason() {
		return rePresentmentReason == null ? Optional.empty() : Optional.of(rePresentmentReason);
	}

	public CardIndividualTransaction2 setRePresentmentReason(ExternalRePresentmentReason1Code rePresentmentReason) {
		this.rePresentmentReason = rePresentmentReason;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public CardIndividualTransaction2 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<TransactionIdentifier1> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public CardIndividualTransaction2 setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Product2> getProduct() {
		return product == null ? Optional.empty() : Optional.of(product);
	}

	public CardIndividualTransaction2 setProduct(com.tools20022.repository.msg.Product2 product) {
		this.product = product;
		return this;
	}

	public Optional<ISODate> getValidationDate() {
		return validationDate == null ? Optional.empty() : Optional.of(validationDate);
	}

	public CardIndividualTransaction2 setValidationDate(ISODate validationDate) {
		this.validationDate = validationDate;
		return this;
	}

	public Optional<Max35Text> getValidationSequenceNumber() {
		return validationSequenceNumber == null ? Optional.empty() : Optional.of(validationSequenceNumber);
	}

	public CardIndividualTransaction2 setValidationSequenceNumber(Max35Text validationSequenceNumber) {
		this.validationSequenceNumber = validationSequenceNumber;
		return this;
	}
}