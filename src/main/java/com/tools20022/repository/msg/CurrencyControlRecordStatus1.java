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
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details of each individual currency control record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#RecordIdentification
 * CurrencyControlRecordStatus1.RecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#Status
 * CurrencyControlRecordStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusReason
 * CurrencyControlRecordStatus1.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusDateTime
 * CurrencyControlRecordStatus1.StatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#DocumentIdentification
 * CurrencyControlRecordStatus1.DocumentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "CurrencyControlRecordStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual currency control record."</li>
 * </ul>
 */
public class CurrencyControlRecordStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of each entry/record within the
	 * package of transactions.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of each entry/record within the package of transactions. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyControlRecordStatus1.mmObject();
			isDerived = false;
			xmlTag = "RcrdId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordIdentification";
			definition = "Unique and unambiguous identification of each entry/record within the package of transactions. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Defines the status of the reported record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
	 * StatisticalReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusDescription
	 * Status.StatusDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the reported record."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Status = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyControlRecordStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusDescription;
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the reported record.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}
	};
	/**
	 * Provides detailed information on the status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1
	 * ValidationStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusReason
	 * Status.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd StatusReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlRecordStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Provides detailed information on the status reason.";
			minOccurs = 0;
			type_lazy = () -> ValidationStatusReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the date and time when the status was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusDateTime
	 * Status.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date and time when the status was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute StatusDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyControlRecordStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusDateTime;
			isDerived = false;
			xmlTag = "StsDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDateTime";
			definition = "Provides the date and time when the status was issued.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28
	 * DocumentIdentification28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentIdentification
	 * Document.DocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DocumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyControlRecordStatus1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			isDerived = false;
			xmlTag = "DocId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentIdentification";
			definition = "Unique and unambiguous identification of the document.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification28.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlRecordStatus1.RecordIdentification, com.tools20022.repository.msg.CurrencyControlRecordStatus1.Status,
						com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusReason, com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusDateTime,
						com.tools20022.repository.msg.CurrencyControlRecordStatus1.DocumentIdentification);
				trace_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlRecordStatus1";
				definition = "Provides the details of each individual currency control record.";
			}
		});
		return mmObject_lazy.get();
	}
}