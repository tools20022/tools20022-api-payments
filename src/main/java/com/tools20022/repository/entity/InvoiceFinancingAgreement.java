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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of characteristics that unambiguously identify an invoice financing
 * agreement. An invoice financing agreement between a factor and its client
 * allows to transfer a payment obligation that exists between the client and a
 * third party from the client to the factor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvoiceFinancingAgreement"
 * src="doc-files/InvoiceFinancingAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmAuthorisation
 * InvoiceFinancingAgreement.mmAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmFinancingMethod
 * InvoiceFinancingAgreement.mmFinancingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmRequestedAmount
 * InvoiceFinancingAgreement.mmRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmRequestedPercentage
 * InvoiceFinancingAgreement.mmRequestedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmAppliedPercentage
 * InvoiceFinancingAgreement.mmAppliedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmFinancedAmount
 * InvoiceFinancingAgreement.mmFinancedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmIdentification
 * InvoiceFinancingAgreement.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingPartyRole
 * InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoice
 * InvoiceFinancingAgreement.mmInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmResultingCashEntry
 * InvoiceFinancingAgreement.mmResultingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmAssignment
 * InvoiceFinancingAgreement.mmAssignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvoiceFinancingTransaction
 * CashEntry.mmRelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceFinancingTransaction
 * Invoice.mmInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmInvoiceFinancingTransaction
 * InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmInvoiceFinancingTransaction
 * InvoiceFinancingStatus.mmInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#mmFinancingAgreement
 * Assignment.mmFinancingAgreement}</li>
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
 * "InvoiceFinancingAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that unambiguously identify an invoice financing agreement. An invoice financing agreement between a factor and its client allows to transfer a payment obligation that exists between the client and a third party from the client to the factor."
 * </li>
 * </ul>
 */
public class InvoiceFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max128Text authorisation;
	/**
	 * User identification or any user key that allows to check if the financing
	 * requestor is allowed to ask for invoice financing.<br>
	 * Usage: the content is not of a technical nature, but reflects the
	 * organisational structure at the requesting side. The authorisation
	 * element can typically be used in case the financing requestor acts on
	 * behalf of one or more suppliers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\r\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side. The authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAuthorisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\r\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side. The authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max128Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getAuthorisation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text financingMethod;
	/**
	 * Specifies the financing method related to invoice financing (eg
	 * collection mandate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing method related to invoice financing (eg collection mandate)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancingMethod";
			definition = "Specifies the financing method related to invoice financing (eg collection mandate).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getFinancingMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount requestedAmount;
	/**
	 * Amount requested by the requestor party, related to a single invoice to
	 * be financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount requested by the requestor party, related to a single invoice to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedAmount";
			definition = "Amount requested by the requestor party, related to a single invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getRequestedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate requestedPercentage;
	/**
	 * Percentage of the amount requested by the requestor party, related to a
	 * single invoice, to be financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount requested by the requestor party, related to a single invoice, to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPercentage";
			definition = "Percentage of the amount requested by the requestor party, related to a single invoice, to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getRequestedPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate appliedPercentage;
	/**
	 * The percentage rate applied to calculate the amount financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The percentage rate applied to calculate the amount financed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAppliedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AppliedPercentage";
			definition = "The percentage rate applied to calculate the amount financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getAppliedPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount financedAmount;
	/**
	 * Specifies the amount financed which is derived from the applied
	 * percentage and the invoice amount..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount financed which is derived from the applied percentage and the invoice amount.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancedAmount";
			definition = "Specifies the amount financed which is derived from the applied percentage and the invoice amount..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getFinancedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Identifies unambiguously the financing transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies unambiguously the financing transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies unambiguously the financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingAgreement.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvoiceFinancingPartyRole> invoiceFinancingPartyRole;
	/**
	 * Role played by a party in the context of financing an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmInvoiceFinancingTransaction
	 * InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of financing an invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingPartyRole";
			definition = "Role played by a party in the context of financing an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
		}
	};
	protected InvoiceFinancingStatus invoiceFinancingStatus;
	/**
	 * Status of the invoice financing transaction and of the different requests
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmInvoiceFinancingTransaction
	 * InvoiceFinancingStatus.mmInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
	 * InvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the invoice financing transaction and of the different requests linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvoiceFinancingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingStatus";
			definition = "Status of the invoice financing transaction and of the different requests linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmInvoiceFinancingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Invoice> invoice;
	/**
	 * Invoice to which is referred financing request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceFinancingTransaction
	 * Invoice.mmInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice to which is referred financing request."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Invoice to which is referred financing request.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmInvoiceFinancingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected CashEntry resultingCashEntry;
	/**
	 * Information related to the crediting of the amount financed, such as
	 * dates, amount, charges...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvoiceFinancingTransaction
	 * CashEntry.mmRelatedInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the crediting of the amount financed, such as dates, amount, charges..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResultingCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingCashEntry";
			definition = "Information related to the crediting of the amount financed, such as dates, amount, charges...";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmRelatedInvoiceFinancingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Assignment> assignment;
	/**
	 * Assignments resulting from an invoice financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#mmFinancingAgreement
	 * Assignment.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assignment
	 * Assignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assignments resulting from an invoice financing agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Assignment";
			definition = "Assignments resulting from an invoice financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.mmFinancingAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assignment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingAgreement";
				definition = "Set of characteristics that unambiguously identify an invoice financing agreement. An invoice financing agreement between a factor and its client allows to transfer a payment obligation that exists between the client and a third party from the client to the factor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmRelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.mmInvoiceFinancingTransaction,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.mmInvoiceFinancingTransaction,
						com.tools20022.repository.entity.Assignment.mmFinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.mmAuthorisation, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmFinancingMethod,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmRequestedAmount, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmRequestedPercentage,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmAppliedPercentage, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmFinancedAmount,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmIdentification, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingStatus, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoice,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.mmResultingCashEntry, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmAssignment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingAgreement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max128Text getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(Max128Text authorisation) {
		this.authorisation = authorisation;
	}

	public Max350Text getFinancingMethod() {
		return financingMethod;
	}

	public void setFinancingMethod(Max350Text financingMethod) {
		this.financingMethod = financingMethod;
	}

	public CurrencyAndAmount getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(CurrencyAndAmount requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public PercentageRate getRequestedPercentage() {
		return requestedPercentage;
	}

	public void setRequestedPercentage(PercentageRate requestedPercentage) {
		this.requestedPercentage = requestedPercentage;
	}

	public PercentageRate getAppliedPercentage() {
		return appliedPercentage;
	}

	public void setAppliedPercentage(PercentageRate appliedPercentage) {
		this.appliedPercentage = appliedPercentage;
	}

	public CurrencyAndAmount getFinancedAmount() {
		return financedAmount;
	}

	public void setFinancedAmount(CurrencyAndAmount financedAmount) {
		this.financedAmount = financedAmount;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public List<InvoiceFinancingPartyRole> getInvoiceFinancingPartyRole() {
		return invoiceFinancingPartyRole;
	}

	public void setInvoiceFinancingPartyRole(List<com.tools20022.repository.entity.InvoiceFinancingPartyRole> invoiceFinancingPartyRole) {
		this.invoiceFinancingPartyRole = invoiceFinancingPartyRole;
	}

	public InvoiceFinancingStatus getInvoiceFinancingStatus() {
		return invoiceFinancingStatus;
	}

	public void setInvoiceFinancingStatus(com.tools20022.repository.entity.InvoiceFinancingStatus invoiceFinancingStatus) {
		this.invoiceFinancingStatus = invoiceFinancingStatus;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<com.tools20022.repository.entity.Invoice> invoice) {
		this.invoice = invoice;
	}

	public CashEntry getResultingCashEntry() {
		return resultingCashEntry;
	}

	public void setResultingCashEntry(com.tools20022.repository.entity.CashEntry resultingCashEntry) {
		this.resultingCashEntry = resultingCashEntry;
	}

	public List<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(List<com.tools20022.repository.entity.Assignment> assignment) {
		this.assignment = assignment;
	}
}