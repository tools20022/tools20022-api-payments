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
import com.tools20022.repository.codeset.ChequeTypeCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque7;
import com.tools20022.repository.msg.TransactionReferences3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequeDelivery
 * Cheque.mmChequeDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmNumber
 * Cheque.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequeType
 * Cheque.mmChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmMaturityDate
 * Cheque.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmFormsCode
 * Cheque.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmMemoField
 * Cheque.mmMemoField}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Cheque#mmRegionalClearingZone
 * Cheque.mmRegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmRelatedPayment
 * Cheque.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequePartyRole
 * Cheque.mmChequePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmCashAccount
 * Cheque.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCheque
 * CashAccount.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePayment#mmCheque
 * ChequePayment.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmCheque
 * ChequeIssue.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePartyRole#mmCheque
 * ChequePartyRole.mmCheque}</li>
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
 * "Cheque"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution."
 * </li>
 * </ul>
 */
public class Cheque {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ChequeIssue chequeDelivery;
	/**
	 * Specifies the parameters related to the delivery of the cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmCheque
	 * ChequeIssue.mmCheque}</li>
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
	public static final MMBusinessAssociationEnd mmChequeDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeDelivery";
			definition = "Specifies the parameters related to the delivery of the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
		}
	};
	protected Max35Text number;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmChequeNumber
	 * TransactionReferences3.mmChequeNumber}</li>
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
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmChequeNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ChequeTypeCode chequeType;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeType
	 * Cheque7.mmChequeType}</li>
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
	public static final MMBusinessAttribute mmChequeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmChequeType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChequeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getChequeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate maturityDate;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque7#mmChequeMaturityDate
	 * Cheque7.mmChequeMaturityDate}</li>
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
	public static final MMBusinessAttribute mmMaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmChequeMaturityDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getMaturityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text formsCode;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmFormsCode
	 * Cheque7.mmFormsCode}</li>
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
	public static final MMBusinessAttribute mmFormsCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmFormsCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getFormsCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text memoField;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmMemoField
	 * Cheque7.mmMemoField}</li>
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
	public static final MMBusinessAttribute mmMemoField = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmMemoField);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getMemoField", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text regionalClearingZone;
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
	 * {@linkplain com.tools20022.repository.msg.Cheque7#mmRegionalClearingZone
	 * Cheque7.mmRegionalClearingZone}</li>
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
	public static final MMBusinessAttribute mmRegionalClearingZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque7.mmRegionalClearingZone);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Cheque.class.getMethod("getRegionalClearingZone", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ChequePayment> relatedPayment;
	/**
	 * Payment which uses a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment#mmCheque
	 * ChequePayment.mmCheque}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses a cheque.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePayment.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequePayment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ChequePartyRole> chequePartyRole;
	/**
	 * Specifies each role played by a party in the process of paying by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePartyRole#mmCheque
	 * ChequePartyRole.mmCheque}</li>
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
	public static final MMBusinessAssociationEnd mmChequePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequePartyRole";
			definition = "Specifies each role played by a party in the process of paying by cheque.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmObject();
		}
	};
	protected CashAccount cashAccount;
	/**
	 * Cash account on which a cheque is drawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCheque
	 * CashAccount.mmCheque}</li>
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
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which a cheque is drawn.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cheque";
				definition = "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCheque, com.tools20022.repository.entity.ChequePayment.mmCheque, com.tools20022.repository.entity.ChequeIssue.mmCheque,
						com.tools20022.repository.entity.ChequePartyRole.mmCheque);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.mmChequeDelivery, com.tools20022.repository.entity.Cheque.mmNumber, com.tools20022.repository.entity.Cheque.mmChequeType,
						com.tools20022.repository.entity.Cheque.mmMaturityDate, com.tools20022.repository.entity.Cheque.mmFormsCode, com.tools20022.repository.entity.Cheque.mmMemoField,
						com.tools20022.repository.entity.Cheque.mmRegionalClearingZone, com.tools20022.repository.entity.Cheque.mmRelatedPayment, com.tools20022.repository.entity.Cheque.mmChequePartyRole,
						com.tools20022.repository.entity.Cheque.mmCashAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Cheque.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ChequeIssue getChequeDelivery() {
		return chequeDelivery;
	}

	public void setChequeDelivery(com.tools20022.repository.entity.ChequeIssue chequeDelivery) {
		this.chequeDelivery = chequeDelivery;
	}

	public Max35Text getNumber() {
		return number;
	}

	public void setNumber(Max35Text number) {
		this.number = number;
	}

	public ChequeTypeCode getChequeType() {
		return chequeType;
	}

	public void setChequeType(ChequeTypeCode chequeType) {
		this.chequeType = chequeType;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Max35Text getFormsCode() {
		return formsCode;
	}

	public void setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
	}

	public Max35Text getMemoField() {
		return memoField;
	}

	public void setMemoField(Max35Text memoField) {
		this.memoField = memoField;
	}

	public Max35Text getRegionalClearingZone() {
		return regionalClearingZone;
	}

	public void setRegionalClearingZone(Max35Text regionalClearingZone) {
		this.regionalClearingZone = regionalClearingZone;
	}

	public List<ChequePayment> getRelatedPayment() {
		return relatedPayment;
	}

	public void setRelatedPayment(List<com.tools20022.repository.entity.ChequePayment> relatedPayment) {
		this.relatedPayment = relatedPayment;
	}

	public List<ChequePartyRole> getChequePartyRole() {
		return chequePartyRole;
	}

	public void setChequePartyRole(List<com.tools20022.repository.entity.ChequePartyRole> chequePartyRole) {
		this.chequePartyRole = chequePartyRole;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}
}