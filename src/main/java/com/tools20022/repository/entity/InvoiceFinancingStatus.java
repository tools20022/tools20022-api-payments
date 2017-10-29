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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FinancingStatusReasonCode;
import com.tools20022.repository.codeset.RequestStatusCode;
import com.tools20022.repository.codeset.TechnicalValidationStatusCode;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of an invoice financing transaction and of the instructions related to
 * the invoice financing.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvoiceFinancingStatus"
 * src="doc-files/InvoiceFinancingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#ValidationStatusReason
 * InvoiceFinancingStatus.ValidationStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#ValidationStatus
 * InvoiceFinancingStatus.ValidationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#CancellationStatus
 * InvoiceFinancingStatus.CancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#CancellationStatusReason
 * InvoiceFinancingStatus.CancellationStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#FinancingTransactionStatus
 * InvoiceFinancingStatus.FinancingTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#CancellationRequestReason
 * InvoiceFinancingStatus.CancellationRequestReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#InvoiceFinancingTransaction
 * InvoiceFinancingStatus.InvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#FinancingStatusReason
 * InvoiceFinancingStatus.FinancingStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "InvoiceFinancingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of an invoice financing transaction and of the instructions related to the invoice financing."
 * </li>
 * </ul>
 */
public class InvoiceFinancingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * The reason for the validation status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the validation status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValidationStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidationStatusReason";
			definition = "The reason for the validation status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};
	/**
	 * The result of the technical validation (e.g. Accepted, Reception error)
	 * executed on the request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode
	 * TechnicalValidationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The result of the technical validation (e.g. Accepted, Reception error) executed on the  request message."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValidationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidationStatus";
			definition = "The result of the technical validation (e.g. Accepted, Reception error) executed on the  request message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}
	};
	/**
	 * Information on the business status of the cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode
	 * TechnicalValidationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the business status of the cancellation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Information on the business status of the cancellation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}
	};
	/**
	 * The reason for the cancellation status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the cancellation status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatusReason";
			definition = "The reason for the cancellation status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the financing request (e.g. financed. not
	 * financed).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RequestStatusCode
	 * RequestStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingTransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the financing request (e.g. financed. not financed)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancingTransactionStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingTransactionStatus";
			definition = "Specifies the status of the financing request (e.g. financed. not financed).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RequestStatusCode.mmObject();
		}
	};
	/**
	 * Further details on the cancellation request information, in an uncoded
	 * form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further details on the cancellation request information, in an uncoded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRequestReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestReason";
			definition = "Further details on the cancellation request information, in an uncoded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Specifies the transaction for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
	 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transaction for which a status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Specifies the transaction for which a status is provided.";
			minOccurs = 0;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * &lt;p&gt;Indicates the reasons that have determined the result of the
	 * single request.&lt;/p&gt;
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
	 * FinancingStatusReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "&lt;p&gt;Indicates the reasons that have determined the result of the single request.&lt;/p&gt;"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancingStatusReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingStatusReason";
			definition = "<p>Indicates the reasons that have determined the result of the single request.</p>";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingStatus";
				definition = "Status of an invoice financing transaction and of the instructions related to the invoice financing.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingStatus.ValidationStatusReason, com.tools20022.repository.entity.InvoiceFinancingStatus.ValidationStatus,
						com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationStatusReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.FinancingTransactionStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationRequestReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.FinancingStatusReason);
			}
		});
		return mmObject_lazy.get();
	}
}