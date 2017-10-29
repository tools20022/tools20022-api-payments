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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.DocumentTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
 * DocumentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#MeteredServiceInvoice
 * DocumentType6Code.MeteredServiceInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CreditNoteRelatedToFinancialAdjustment
 * DocumentType6Code.CreditNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DebitNoteRelatedToFinancialAdjustment
 * DocumentType6Code.DebitNoteRelatedToFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CommercialInvoice
 * DocumentType6Code.CommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CreditNote
 * DocumentType6Code.CreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DebitNote
 * DocumentType6Code.DebitNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#HireInvoice
 * DocumentType6Code.HireInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#SelfBilledInvoice
 * DocumentType6Code.SelfBilledInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#CommercialContract
 * DocumentType6Code.CommercialContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#StatementOfAccount
 * DocumentType6Code.StatementOfAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#DispatchAdvice
 * DocumentType6Code.DispatchAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#BillOfLading
 * DocumentType6Code.BillOfLading}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DocumentType6Code#Voucher
 * DocumentType6Code.Voucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#AccountReceivableOpenItem
 * DocumentType6Code.AccountReceivableOpenItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#TradeServicesUtilityTransaction
 * DocumentType6Code.TradeServicesUtilityTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code#PurchaseOrder
 * DocumentType6Code.PurchaseOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of financial or commercial document."</li>
 * </ul>
 */
public class DocumentType6Code extends DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeteredServiceInvoice"</li>
	 * </ul>
	 */
	public static final MMCode MeteredServiceInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final MMCode CreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNoteRelatedToFinancialAdjustment"</li>
	 * </ul>
	 */
	public static final MMCode DebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialInvoice"</li>
	 * </ul>
	 */
	public static final MMCode CommercialInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * </ul>
	 */
	public static final MMCode CreditNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitNote"</li>
	 * </ul>
	 */
	public static final MMCode DebitNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HireInvoice"</li>
	 * </ul>
	 */
	public static final MMCode HireInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfBilledInvoice"</li>
	 * </ul>
	 */
	public static final MMCode SelfBilledInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialContract"</li>
	 * </ul>
	 */
	public static final MMCode CommercialContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementOfAccount"</li>
	 * </ul>
	 */
	public static final MMCode StatementOfAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispatchAdvice"</li>
	 * </ul>
	 */
	public static final MMCode DispatchAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfLading"</li>
	 * </ul>
	 */
	public static final MMCode BillOfLading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillOfLading";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voucher"</li>
	 * </ul>
	 */
	public static final MMCode Voucher = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Voucher";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReceivableOpenItem"</li>
	 * </ul>
	 */
	public static final MMCode AccountReceivableOpenItem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReceivableOpenItem";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeServicesUtilityTransaction"</li>
	 * </ul>
	 */
	public static final MMCode TradeServicesUtilityTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeServicesUtilityTransaction";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType6Code
	 * DocumentType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * </ul>
	 */
	public static final MMCode PurchaseOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentType6Code";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType6Code.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentType6Code.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentType6Code.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentType6Code.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.CreditNote, com.tools20022.repository.codeset.DocumentType6Code.DebitNote, com.tools20022.repository.codeset.DocumentType6Code.HireInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentType6Code.CommercialContract, com.tools20022.repository.codeset.DocumentType6Code.StatementOfAccount,
						com.tools20022.repository.codeset.DocumentType6Code.DispatchAdvice, com.tools20022.repository.codeset.DocumentType6Code.BillOfLading, com.tools20022.repository.codeset.DocumentType6Code.Voucher,
						com.tools20022.repository.codeset.DocumentType6Code.AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentType6Code.TradeServicesUtilityTransaction,
						com.tools20022.repository.codeset.DocumentType6Code.PurchaseOrder);
				trace_lazy = () -> DocumentTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}