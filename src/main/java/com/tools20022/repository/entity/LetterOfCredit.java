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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instrument issued by a bank substituting its name and credit standing for
 * that of its customer. A letter of credit is a written undertaking of the
 * bank, issued for the account of a customer (the applicant), to honour a
 * demand for payment, upon the beneficiary's compliance with the terms and
 * conditions set forth in the undertaking.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LetterOfCredit" src="doc-files/LetterOfCredit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#Amount
 * LetterOfCredit.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#Document
 * LetterOfCredit.Document}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#CommercialTradeSettlement
 * LetterOfCredit.CommercialTradeSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Document#LetterOfCredit
 * Document.LetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#LetterOfCredit
 * CommercialTradeSettlement.LetterOfCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
 * "LetterOfCredit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking."
 * </li>
 * </ul>
 */
public class LetterOfCredit extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of the letter/documentary credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the letter/documentary credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the letter/documentary credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Document which materialises the letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#LetterOfCredit
	 * Document.LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which materialises the letter of credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which materialises the letter of credit.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.LetterOfCredit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement process related to a letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#LetterOfCredit
	 * CommercialTradeSettlement.LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement process related to a letter of credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CommercialTradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LetterOfCredit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTradeSettlement";
			definition = "Settlement process related to a letter of credit.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LetterOfCredit";
				definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.LetterOfCredit, com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LetterOfCredit.Amount, com.tools20022.repository.entity.LetterOfCredit.Document, com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}