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
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeDeliveryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.msg.Cheque7;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#Cheque
 * ChequeIssue.Cheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#DeliveryMethod
 * ChequeIssue.DeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
 * ChequeIssue.DeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#PrintLocation
 * ChequeIssue.PrintLocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#ChequeIssue
 * PostalAddress.ChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#ChequeDelivery
 * Cheque.ChequeDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#ChequeInstruction
 * CreditTransferTransaction26.ChequeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#ChequeInstruction
 * CreditTransferTransaction22.ChequeInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Specifies the characteristics of the cheque used to pay an amount to a
	 * creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#ChequeDelivery
	 * Cheque.ChequeDelivery}</li>
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
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ChequeIssue.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Specifies the characteristics of the cheque used to pay an amount to a creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.ChequeDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice#Code
	 * ChequeDeliveryMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChequeDeliveryMethod1Choice#Proprietary
	 * ChequeDeliveryMethod1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#DeliveryMethod
	 * Cheque7.DeliveryMethod}</li>
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
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ChequeDeliveryMethod1Choice.Code, com.tools20022.repository.choice.ChequeDeliveryMethod1Choice.Proprietary,
					com.tools20022.repository.msg.Cheque7.DeliveryMethod);
			elementContext_lazy = () -> ChequeIssue.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChequeDeliveryCode.mmObject();
		}
	};
	/**
	 * Identifies the party to whom the debtor's agent should send the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#ChequeIssue
	 * PostalAddress.ChequeIssue}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#DeliverTo
	 * Cheque7.DeliverTo}</li>
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
	public static final MMBusinessAssociationEnd DeliverTo = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.DeliverTo);
			elementContext_lazy = () -> ChequeIssue.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliverTo";
			definition = "Identifies the party to whom the debtor's agent should send the cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.ChequeIssue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#PrintLocation
	 * Cheque7.PrintLocation}</li>
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
	public static final MMBusinessAttribute PrintLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.PrintLocation);
			elementContext_lazy = () -> ChequeIssue.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeIssue";
				definition = "Action to issue a cheque in order to settle an amount due to a creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.ChequeIssue, com.tools20022.repository.entity.Cheque.ChequeDelivery);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.ChequeInstruction, com.tools20022.repository.msg.CreditTransferTransaction22.ChequeInstruction);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChequeIssue.Cheque, com.tools20022.repository.entity.ChequeIssue.DeliveryMethod, com.tools20022.repository.entity.ChequeIssue.DeliverTo,
						com.tools20022.repository.entity.ChequeIssue.PrintLocation);
				derivationComponent_lazy = () -> Arrays.asList(ChequeDeliveryMethod1Choice.mmObject(), Cheque7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}