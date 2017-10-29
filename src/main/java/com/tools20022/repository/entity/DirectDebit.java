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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.msg.DirectDebitTransaction9;
import com.tools20022.repository.msg.DirectDebitTransactionInformation15;
import com.tools20022.repository.msg.DirectDebitTransactionInformation21;
import com.tools20022.repository.msg.DirectDebitTransactionInformation22;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment, initiated by the creditor, to debit a debtor's account in favour of
 * the creditor. A direct debit can be pre-authorised or not. In most countries,
 * authorisation is in the form of a mandate between the debtor and creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DirectDebit" src="doc-files/DirectDebit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#RegistrationIdentification
 * DirectDebit.RegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
 * DirectDebit.DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationIdentification
 * DirectDebit.PreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#PreNotificationDate
 * DirectDebit.PreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
 * DirectDebitMandate.RelatedDirectDebit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#DirectDebitTransactionInformation
 * CreditTransferTransaction9.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#DirectDebitTransactionInformation
 * PaymentInstruction21.DirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#DirectDebitTransaction
 * DirectDebitTransactionInformation21.DirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#DirectDebitTransaction
 * DirectDebitTransactionInformation22.DirectDebitTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15
 * DirectDebitTransactionInformation15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
 * DirectDebitTransactionInformation21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22
 * DirectDebitTransactionInformation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction9
 * DirectDebitTransaction9}</li>
 * </ul>
 * </li>
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
 * "DirectDebit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * </ul>
 */
public class DirectDebit extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference assigned to a creditor by its financial institution, or
	 * relevant authority, authorising the creditor to take part in a direct
	 * debit scheme.
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
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Set of elements providing information specific to the direct debit
	 * mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
	 * DirectDebitMandate.RelatedDirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#MandateRelatedInformation
	 * DirectDebitTransaction9.MandateRelatedInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the direct debit mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DirectDebitMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.MandateRelatedInformation);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction. Usage: the direct
	 * debit pre-notification is used to reconcile separately sent collection
	 * information with the direct debit transaction information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationIdentification
	 * DirectDebitTransaction9.PreNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationIdentification);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#PreNotificationDate
	 * DirectDebitTransaction9.PreNotificationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationDate);
			elementContext_lazy = () -> DirectDebit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction9.DirectDebitTransactionInformation, com.tools20022.repository.msg.PaymentInstruction21.DirectDebitTransactionInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation21.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DirectDebitTransaction);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.RegistrationIdentification, com.tools20022.repository.entity.DirectDebit.DirectDebitMandate,
						com.tools20022.repository.entity.DirectDebit.PreNotificationIdentification, com.tools20022.repository.entity.DirectDebit.PreNotificationDate);
				derivationComponent_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmObject(), DirectDebitTransactionInformation21.mmObject(), DirectDebitTransactionInformation22.mmObject(),
						DirectDebitTransaction9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}