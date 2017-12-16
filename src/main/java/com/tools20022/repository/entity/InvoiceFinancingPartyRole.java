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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InvoicePartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Role played by a party in the context of financing an invoice.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvoiceFinancingPartyRole"
 * src="doc-files/InvoiceFinancingPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InvoicePartyRole
 * InvoicePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmCashAccount
 * InvoiceFinancingPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmInvoiceFinancingTransaction
 * InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvoiceFinancingPartyRole
 * CashAccount.mmRelatedInvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingPartyRole
 * InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole}</li>
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
 * "InvoiceFinancingPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of financing an invoice."</li>
 * </ul>
 */
public class InvoiceFinancingPartyRole extends InvoicePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Account used in the financing process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvoiceFinancingPartyRole
	 * CashAccount.mmRelatedInvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used in the financing process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Account used in the financing process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedInvoiceFinancingPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvoiceFinancingAgreement> invoiceFinancingTransaction;
	/**
	 * Identifies the invoice financing transaction for which a party plays a
	 * role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingPartyRole
	 * InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the invoice financing transaction for which a party plays a role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Identifies the invoice financing transaction for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingPartyRole";
				definition = "Role played by a party in the context of financing an invoice.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedInvoiceFinancingPartyRole, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoiceFinancingPartyRole);
				superType_lazy = () -> InvoicePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmCashAccount, com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmInvoiceFinancingTransaction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<InvoiceFinancingAgreement> getInvoiceFinancingTransaction() {
		return invoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(List<com.tools20022.repository.entity.InvoiceFinancingAgreement> invoiceFinancingTransaction) {
		this.invoiceFinancingTransaction = invoiceFinancingTransaction;
	}
}