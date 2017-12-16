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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
 * DirectDebit.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
 * DirectDebit.mmDirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationIdentification
 * DirectDebit.mmPreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationDate
 * DirectDebit.mmPreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
 * DirectDebitMandate.mmRelatedDirectDebit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmDirectDebitTransactionInformation
 * CreditTransferTransaction9.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmDirectDebitTransactionInformation
 * PaymentInstruction21.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDirectDebitTransaction
 * DirectDebitTransactionInformation21.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDirectDebitTransaction
 * DirectDebitTransactionInformation22.mmDirectDebitTransaction}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Max35Text registrationIdentification;
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
	public static final MMBusinessAttribute mmRegistrationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebit.class.getMethod("getRegistrationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DirectDebitMandate directDebitMandate;
	/**
	 * Set of elements providing information specific to the direct debit
	 * mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
	 * DirectDebitMandate.mmRelatedDirectDebit}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmMandateRelatedInformation
	 * DirectDebitTransaction9.mmMandateRelatedInformation}</li>
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
	public static final MMBusinessAssociationEnd mmDirectDebitMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction9.mmMandateRelatedInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
		}
	};
	protected Max35Text preNotificationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmPreNotificationIdentification
	 * DirectDebitTransaction9.mmPreNotificationIdentification}</li>
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
	public static final MMBusinessAttribute mmPreNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction9.mmPreNotificationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebit.class.getMethod("getPreNotificationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate preNotificationDate;
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction9#mmPreNotificationDate
	 * DirectDebitTransaction9.mmPreNotificationDate}</li>
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
	public static final MMBusinessAttribute mmPreNotificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DirectDebitTransaction9.mmPreNotificationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebit.class.getMethod("getPreNotificationDate", new Class[]{});
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
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit);
				derivationElement_lazy = () -> Arrays.asList(CreditTransferTransaction9.mmDirectDebitTransactionInformation, PaymentInstruction21.mmDirectDebitTransactionInformation,
						DirectDebitTransactionInformation21.mmDirectDebitTransaction, DirectDebitTransactionInformation22.mmDirectDebitTransaction);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.mmRegistrationIdentification, com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate,
						com.tools20022.repository.entity.DirectDebit.mmPreNotificationIdentification, com.tools20022.repository.entity.DirectDebit.mmPreNotificationDate);
				derivationComponent_lazy = () -> Arrays.asList(DirectDebitTransactionInformation15.mmObject(), DirectDebitTransactionInformation21.mmObject(), DirectDebitTransactionInformation22.mmObject(),
						DirectDebitTransaction9.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DirectDebit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRegistrationIdentification() {
		return registrationIdentification;
	}

	public void setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
	}

	public DirectDebitMandate getDirectDebitMandate() {
		return directDebitMandate;
	}

	public void setDirectDebitMandate(com.tools20022.repository.entity.DirectDebitMandate directDebitMandate) {
		this.directDebitMandate = directDebitMandate;
	}

	public Max35Text getPreNotificationIdentification() {
		return preNotificationIdentification;
	}

	public void setPreNotificationIdentification(Max35Text preNotificationIdentification) {
		this.preNotificationIdentification = preNotificationIdentification;
	}

	public ISODate getPreNotificationDate() {
		return preNotificationDate;
	}

	public void setPreNotificationDate(ISODate preNotificationDate) {
		this.preNotificationDate = preNotificationDate;
	}
}