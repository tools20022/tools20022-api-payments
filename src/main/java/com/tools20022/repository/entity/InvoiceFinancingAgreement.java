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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Authorisation
 * InvoiceFinancingAgreement.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#FinancingMethod
 * InvoiceFinancingAgreement.FinancingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#RequestedAmount
 * InvoiceFinancingAgreement.RequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#RequestedPercentage
 * InvoiceFinancingAgreement.RequestedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#AppliedPercentage
 * InvoiceFinancingAgreement.AppliedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#FinancedAmount
 * InvoiceFinancingAgreement.FinancedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Identification
 * InvoiceFinancingAgreement.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingPartyRole
 * InvoiceFinancingAgreement.InvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Invoice
 * InvoiceFinancingAgreement.Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#ResultingCashEntry
 * InvoiceFinancingAgreement.ResultingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Assignment
 * InvoiceFinancingAgreement.Assignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvoiceFinancingTransaction
 * CashEntry.RelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#InvoiceFinancingTransaction
 * Invoice.InvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#InvoiceFinancingTransaction
 * InvoiceFinancingPartyRole.InvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#InvoiceFinancingTransaction
 * InvoiceFinancingStatus.InvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#FinancingAgreement
 * Assignment.FinancingAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
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
 * "InvoiceFinancingAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that unambiguously identify an invoice financing agreement. An invoice financing agreement between a factor and its client allows to transfer a payment obligation that exists between the client and a third party from the client to the factor."
 * </li>
 * </ul>
 */
public class InvoiceFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute Authorisation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\r\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side. The authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FinancingMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingMethod";
			definition = "Specifies the financing method related to invoice financing (eg collection mandate).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute RequestedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedAmount";
			definition = "Amount requested by the requestor party, related to a single invoice to be financed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute RequestedPercentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPercentage";
			definition = "Percentage of the amount requested by the requestor party, related to a single invoice, to be financed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute AppliedPercentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AppliedPercentage";
			definition = "The percentage rate applied to calculate the amount financed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FinancedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancedAmount";
			definition = "Specifies the amount financed which is derived from the applied percentage and the invoice amount..";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies unambiguously the financing transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of financing an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#InvoiceFinancingTransaction
	 * InvoiceFinancingPartyRole.InvoiceFinancingTransaction}</li>
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
	public static final MMBusinessAssociationEnd InvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingPartyRole";
			definition = "Role played by a party in the context of financing an invoice.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the invoice financing transaction and of the different requests
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#InvoiceFinancingTransaction
	 * InvoiceFinancingStatus.InvoiceFinancingTransaction}</li>
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
	public static final MMBusinessAssociationEnd InvoiceFinancingStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingStatus";
			definition = "Status of the invoice financing transaction and of the different requests linked to it.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invoice to which is referred financing request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#InvoiceFinancingTransaction
	 * Invoice.InvoiceFinancingTransaction}</li>
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
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Invoice to which is referred financing request.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to the crediting of the amount financed, such as
	 * dates, amount, charges...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvoiceFinancingTransaction
	 * CashEntry.RelatedInvoiceFinancingTransaction}</li>
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
	public static final MMBusinessAssociationEnd ResultingCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingCashEntry";
			definition = "Information related to the crediting of the amount financed, such as dates, amount, charges...";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assignments resulting from an invoice financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#FinancingAgreement
	 * Assignment.FinancingAgreement}</li>
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
	public static final MMBusinessAssociationEnd Assignment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assignment";
			definition = "Assignments resulting from an invoice financing agreement.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Assignment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.FinancingAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingAgreement";
				definition = "Set of characteristics that unambiguously identify an invoice financing agreement. An invoice financing agreement between a factor and its client allows to transfer a payment obligation that exists between the client and a third party from the client to the factor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.InvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction,
						com.tools20022.repository.entity.Assignment.FinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.Authorisation, com.tools20022.repository.entity.InvoiceFinancingAgreement.FinancingMethod,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.RequestedAmount, com.tools20022.repository.entity.InvoiceFinancingAgreement.RequestedPercentage,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.AppliedPercentage, com.tools20022.repository.entity.InvoiceFinancingAgreement.FinancedAmount,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.Identification, com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingPartyRole,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus, com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry, com.tools20022.repository.entity.InvoiceFinancingAgreement.Assignment);
			}
		});
		return mmObject_lazy.get();
	}
}