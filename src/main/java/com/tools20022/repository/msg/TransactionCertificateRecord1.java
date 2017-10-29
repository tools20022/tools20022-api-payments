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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.RegisteredContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Certificate record in which all currency control transactions are registered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#CertificateRecordIdentification
 * TransactionCertificateRecord1.CertificateRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Transaction
 * TransactionCertificateRecord1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Contract
 * TransactionCertificateRecord1.Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Attachment
 * TransactionCertificateRecord1.Attachment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegisteredContract
 * RegisteredContract}</li>
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
 * "TransactionCertificateRecord1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Certificate record in which all currency control transactions are registered."
 * </li>
 * </ul>
 */
public class TransactionCertificateRecord1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the certificate record.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1
	 * TransactionCertificateRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the certificate record."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CertificateRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionCertificateRecord1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "CertRcrdId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRecordIdentification";
			definition = "Unique and unambiguous identification of the certificate record.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Details of the transaction for which the record has been generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2
	 * TransactionCertificate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1
	 * TransactionCertificateRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the transaction for which the record has been generated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Transaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionCertificateRecord1.mmObject();
			businessComponentTrace_lazy = () -> Payment.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Details of the transaction for which the record has been generated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionCertificate2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Contract registration details related to the certificate record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
	 * TransactionCertificateContract1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1
	 * TransactionCertificateRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract registration details related to the certificate record."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Contract = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionCertificateRecord1.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Contract.mmObject();
			isDerived = false;
			xmlTag = "Ctrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Contract registration details related to the certificate record.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransactionCertificateContract1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Documents provided as attachments to the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
	 * RegisteredContract.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1
	 * TransactionCertificateRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attchmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents provided as attachments to the registered contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Attachment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionCertificateRecord1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the registered contract.";
			minOccurs = 0;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificateRecord1.CertificateRecordIdentification, com.tools20022.repository.msg.TransactionCertificateRecord1.Transaction,
						com.tools20022.repository.msg.TransactionCertificateRecord1.Contract, com.tools20022.repository.msg.TransactionCertificateRecord1.Attachment);
				trace_lazy = () -> RegisteredContract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionCertificateRecord1";
				definition = "Certificate record in which all currency control transactions are registered.";
			}
		});
		return mmObject_lazy.get();
	}
}