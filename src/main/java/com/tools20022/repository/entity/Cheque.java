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
import com.tools20022.repository.codeset.ChequeTypeCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Negotiable instrument instructing a financial institution to pay a specific
 * amount of a specific currency from the account of the drawer with that
 * institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Cheque" src="doc-files/Cheque.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#ChequeDelivery
 * Cheque.ChequeDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#Number Cheque.Number}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#ChequeType
 * Cheque.ChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#MaturityDate
 * Cheque.MaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#FormsCode
 * Cheque.FormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#MemoField
 * Cheque.MemoField}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#RegionalClearingZone
 * Cheque.RegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#RelatedPayment
 * Cheque.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#ChequePartyRole
 * Cheque.ChequePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#CashAccount
 * Cheque.CashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Cheque
 * CashAccount.Cheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePayment#Cheque
 * ChequePayment.Cheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#Cheque
 * ChequeIssue.Cheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePartyRole#Cheque
 * ChequePartyRole.Cheque}</li>
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
 * "Cheque"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution."
 * </li>
 * </ul>
 */
public class Cheque {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the parameters related to the delivery of the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#Cheque
	 * ChequeIssue.Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequeIssue
	 * ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters related to the delivery of the cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChequeDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeDelivery";
			definition = "Specifies the parameters related to the delivery of the cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ChequeIssue.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier for a cheque as assigned by the
	 * financial institution.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#ChequeNumber
	 * TransactionReferences3.ChequeNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a cheque as assigned by the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences3.ChequeNumber);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the financial institution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeType
	 * Cheque7.ChequeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChequeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeType);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChequeTypeCode.mmObject();
		}
	};
	/**
	 * Date when the draft becomes payable and the debtor's account is debited.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeMaturityDate
	 * Cheque7.ChequeMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the draft becomes payable and the debtor's account is debited."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeMaturityDate);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Code agreed between the initiating party and the debtor's agent, that
	 * specifies the cheque layout, company logo and digitised signature to be
	 * used to print the cheque.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#FormsCode
	 * Cheque7.FormsCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FormsCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.FormsCode);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information that needs to be printed on a cheque, used by the payer to
	 * add miscellaneous information.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#MemoField
	 * Cheque7.MemoField}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoField"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MemoField = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.MemoField);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Regional area in which the cheque can be cleared, when a country has no
	 * nation-wide cheque clearing organisation.
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
	 * {@linkplain com.tools20022.repository.msg.Cheque7#RegionalClearingZone
	 * Cheque7.RegionalClearingZone}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionalClearingZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegionalClearingZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.RegionalClearingZone);
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment which uses a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment#Cheque
	 * ChequePayment.Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequePayment
	 * ChequePayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which uses a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses a cheque.";
			minOccurs = 0;
			type_lazy = () -> ChequePayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePayment.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role played by a party in the process of paying by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePartyRole#Cheque
	 * ChequePartyRole.Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequePartyRole
	 * ChequePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in the process of paying by cheque."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChequePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequePartyRole";
			definition = "Specifies each role played by a party in the process of paying by cheque.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash account on which a cheque is drawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Cheque
	 * CashAccount.Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account on which a cheque is drawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Cheque.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which a cheque is drawn.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Cheque";
				definition = "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Cheque, com.tools20022.repository.entity.ChequePayment.Cheque, com.tools20022.repository.entity.ChequeIssue.Cheque,
						com.tools20022.repository.entity.ChequePartyRole.Cheque);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.ChequeDelivery, com.tools20022.repository.entity.Cheque.Number, com.tools20022.repository.entity.Cheque.ChequeType,
						com.tools20022.repository.entity.Cheque.MaturityDate, com.tools20022.repository.entity.Cheque.FormsCode, com.tools20022.repository.entity.Cheque.MemoField,
						com.tools20022.repository.entity.Cheque.RegionalClearingZone, com.tools20022.repository.entity.Cheque.RelatedPayment, com.tools20022.repository.entity.Cheque.ChequePartyRole,
						com.tools20022.repository.entity.Cheque.CashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}