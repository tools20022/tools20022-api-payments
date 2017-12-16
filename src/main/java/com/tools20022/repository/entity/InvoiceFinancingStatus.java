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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FinancingStatusReasonCode;
import com.tools20022.repository.codeset.RequestStatusCode;
import com.tools20022.repository.codeset.TechnicalValidationStatusCode;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmValidationStatusReason
 * InvoiceFinancingStatus.mmValidationStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmValidationStatus
 * InvoiceFinancingStatus.mmValidationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationStatus
 * InvoiceFinancingStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationStatusReason
 * InvoiceFinancingStatus.mmCancellationStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmFinancingTransactionStatus
 * InvoiceFinancingStatus.mmFinancingTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationRequestReason
 * InvoiceFinancingStatus.mmCancellationRequestReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmInvoiceFinancingTransaction
 * InvoiceFinancingStatus.mmInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmFinancingStatusReason
 * InvoiceFinancingStatus.mmFinancingStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected FinancingStatusReasonCode validationStatusReason;
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
	public static final MMBusinessAttribute mmValidationStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidationStatusReason";
			definition = "The reason for the validation status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getValidationStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TechnicalValidationStatusCode validationStatus;
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
	public static final MMBusinessAttribute mmValidationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidationStatus";
			definition = "The result of the technical validation (e.g. Accepted, Reception error) executed on the  request message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getValidationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TechnicalValidationStatusCode cancellationStatus;
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
	public static final MMBusinessAttribute mmCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Information on the business status of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancingStatusReasonCode cancellationStatusReason;
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
	public static final MMBusinessAttribute mmCancellationStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatusReason";
			definition = "The reason for the cancellation status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getCancellationStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RequestStatusCode financingTransactionStatus;
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
	public static final MMBusinessAttribute mmFinancingTransactionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancingTransactionStatus";
			definition = "Specifies the status of the financing request (e.g. financed. not financed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getFinancingTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max105Text cancellationRequestReason;
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
	public static final MMBusinessAttribute mmCancellationRequestReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestReason";
			definition = "Further details on the cancellation request information, in an uncoded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getCancellationRequestReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvoiceFinancingAgreement> invoiceFinancingTransaction;
	/**
	 * Specifies the transaction for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
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
	public static final MMBusinessAssociationEnd mmInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Specifies the transaction for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
		}
	};
	protected FinancingStatusReasonCode financingStatusReason;
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
	public static final MMBusinessAttribute mmFinancingStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancingStatusReason";
			definition = "<p>Indicates the reasons that have determined the result of the single request.</p>";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingStatus.class.getMethod("getFinancingStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingStatus";
				definition = "Status of an invoice financing transaction and of the instructions related to the invoice financing.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingStatus.mmValidationStatusReason, com.tools20022.repository.entity.InvoiceFinancingStatus.mmValidationStatus,
						com.tools20022.repository.entity.InvoiceFinancingStatus.mmCancellationStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.mmCancellationStatusReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.mmFinancingTransactionStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.mmCancellationRequestReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.mmInvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.mmFinancingStatusReason);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FinancingStatusReasonCode getValidationStatusReason() {
		return validationStatusReason;
	}

	public void setValidationStatusReason(FinancingStatusReasonCode validationStatusReason) {
		this.validationStatusReason = validationStatusReason;
	}

	public TechnicalValidationStatusCode getValidationStatus() {
		return validationStatus;
	}

	public void setValidationStatus(TechnicalValidationStatusCode validationStatus) {
		this.validationStatus = validationStatus;
	}

	public TechnicalValidationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public void setCancellationStatus(TechnicalValidationStatusCode cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}

	public FinancingStatusReasonCode getCancellationStatusReason() {
		return cancellationStatusReason;
	}

	public void setCancellationStatusReason(FinancingStatusReasonCode cancellationStatusReason) {
		this.cancellationStatusReason = cancellationStatusReason;
	}

	public RequestStatusCode getFinancingTransactionStatus() {
		return financingTransactionStatus;
	}

	public void setFinancingTransactionStatus(RequestStatusCode financingTransactionStatus) {
		this.financingTransactionStatus = financingTransactionStatus;
	}

	public Max105Text getCancellationRequestReason() {
		return cancellationRequestReason;
	}

	public void setCancellationRequestReason(Max105Text cancellationRequestReason) {
		this.cancellationRequestReason = cancellationRequestReason;
	}

	public List<InvoiceFinancingAgreement> getInvoiceFinancingTransaction() {
		return invoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(List<com.tools20022.repository.entity.InvoiceFinancingAgreement> invoiceFinancingTransaction) {
		this.invoiceFinancingTransaction = invoiceFinancingTransaction;
	}

	public FinancingStatusReasonCode getFinancingStatusReason() {
		return financingStatusReason;
	}

	public void setFinancingStatusReason(FinancingStatusReasonCode financingStatusReason) {
		this.financingStatusReason = financingStatusReason;
	}
}