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
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeDeliveryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque7;
import com.tools20022.repository.msg.CreditTransferTransaction22;
import com.tools20022.repository.msg.CreditTransferTransaction26;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Action to issue a cheque in order to settle an amount due to a creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ChequeIssue" src="doc-files/ChequeIssue.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmCheque
 * ChequeIssue.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliveryMethod
 * ChequeIssue.mmDeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
 * ChequeIssue.mmDeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmPrintLocation
 * ChequeIssue.mmPrintLocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmChequeIssue
 * PostalAddress.mmChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequeDelivery
 * Cheque.mmChequeDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmChequeInstruction
 * CreditTransferTransaction26.mmChequeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmChequeInstruction
 * CreditTransferTransaction22.mmChequeInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice
 * ChequeDeliveryMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cheque7 Cheque7}</li>
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
 * "ChequeIssue"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to issue a cheque in order to settle an amount due to a creditor."</li>
 * </ul>
 */
public class ChequeIssue extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Cheque cheque;
	/**
	 * Specifies the characteristics of the cheque used to pay an amount to a
	 * creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmChequeDelivery
	 * Cheque.mmChequeDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the characteristics of the cheque used to pay an amount to a creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCheque = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Specifies the characteristics of the cheque used to pay an amount to a creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.mmChequeDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};
	protected ChequeDeliveryCode deliveryMethod;
	/**
	 * Specifies the delivery method of the cheque by the debtor's agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice#mmCode
	 * ChequeDeliveryMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice#mmProprietary
	 * ChequeDeliveryMethod1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmDeliveryMethod
	 * Cheque7.mmDeliveryMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery method of the cheque by the debtor's agent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ChequeDeliveryMethod1Choice.mmCode, ChequeDeliveryMethod1Choice.mmProprietary, Cheque7.mmDeliveryMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChequeDeliveryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ChequeIssue.class.getMethod("getDeliveryMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PostalAddress deliverTo;
	/**
	 * Identifies the party to whom the debtor's agent should send the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmChequeIssue
	 * PostalAddress.mmChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmDeliverTo
	 * Cheque7.mmDeliverTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party to whom the debtor's agent should send the cheque."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliverTo = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmDeliverTo);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliverTo";
			definition = "Identifies the party to whom the debtor's agent should send the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmChequeIssue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected Max35Text printLocation;
	/**
	 * Specifies the print location of the cheque.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmPrintLocation
	 * Cheque7.mmPrintLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the print location of the cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrintLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmPrintLocation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ChequeIssue.class.getMethod("getPrintLocation", new Class[]{});
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
				name = "ChequeIssue";
				definition = "Action to issue a cheque in order to settle an amount due to a creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.mmChequeIssue, com.tools20022.repository.entity.Cheque.mmChequeDelivery);
				derivationElement_lazy = () -> Arrays.asList(CreditTransferTransaction26.mmChequeInstruction, CreditTransferTransaction22.mmChequeInstruction);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChequeIssue.mmCheque, com.tools20022.repository.entity.ChequeIssue.mmDeliveryMethod, com.tools20022.repository.entity.ChequeIssue.mmDeliverTo,
						com.tools20022.repository.entity.ChequeIssue.mmPrintLocation);
				derivationComponent_lazy = () -> Arrays.asList(ChequeDeliveryMethod1Choice.mmObject(), Cheque7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ChequeIssue.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(com.tools20022.repository.entity.Cheque cheque) {
		this.cheque = cheque;
	}

	public ChequeDeliveryCode getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(ChequeDeliveryCode deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public PostalAddress getDeliverTo() {
		return deliverTo;
	}

	public void setDeliverTo(com.tools20022.repository.entity.PostalAddress deliverTo) {
		this.deliverTo = deliverTo;
	}

	public Max35Text getPrintLocation() {
		return printLocation;
	}

	public void setPrintLocation(Max35Text printLocation) {
		this.printLocation = printLocation;
	}
}